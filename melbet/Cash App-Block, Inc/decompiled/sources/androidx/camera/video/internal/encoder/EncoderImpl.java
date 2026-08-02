package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.LruCache;
import android.util.Range;
import android.util.Rational;
import android.view.Surface;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.camera.core.impl.utils.futures.ListFuture;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.internal.BufferProvider$State;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.GLProcessingStuckOnCodecFlushQuirk;
import androidx.camera.video.internal.compat.quirk.PreviewFreezeAfterHighSpeedRecordingQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.utils.CodecUtil;
import androidx.camera.video.internal.workaround.VideoTimebaseConverter;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.credentials.Credential;
import androidx.media3.extractor.text.CueEncoder;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final class EncoderImpl {
    public static final Range NO_RANGE = Range.create(Long.MAX_VALUE, Long.MAX_VALUE);
    public final Rational mCaptureToEncodeFrameRateRatio;
    public final boolean mCodecStopAsFlushWorkaroundEnabled;
    public final SequentialExecutor mEncoderExecutor;
    public final Credential mEncoderInfo;
    public final Encoder$EncoderInput mEncoderInput;
    public final Timebase mInputTimebase;
    public final boolean mIsVideoEncoder;
    public final MediaCodec mMediaCodec;
    public final MediaFormat mMediaFormat;
    public final CallbackToFutureAdapter$Completer mReleasedCompleter;
    public final ListenableFuture mReleasedFuture;
    public ScheduledFuture mSignalEosTimeoutFuture;
    public int mState;
    public final String mTag;
    public final Recorder.AnonymousClass4 mTimeProvider;
    public final Object mLock = new Object();
    public final ArrayDeque mFreeInputBufferIndexQueue = new ArrayDeque();
    public final ArrayDeque mAcquisitionQueue = new ArrayDeque();
    public final HashSet mInputBufferSet = new HashSet();
    public final HashSet mEncodedDataSet = new HashSet();
    public final ArrayDeque mActivePauseResumeTimeRanges = new ArrayDeque();
    public EncoderCallback mEncoderCallback = EncoderCallback.EMPTY;
    public Executor mEncoderCallbackExecutor = zzabp.directExecutor();
    public Range mStartStopTimeRangeUs = NO_RANGE;
    public long mTotalPausedDurationUs = 0;
    public boolean mPendingCodecStop = false;
    public Long mLastDataStopTimestamp = null;
    public ScheduledFuture mStopTimeoutFuture = null;
    public MediaCodecCallback mMediaCodecCallback = null;
    public boolean mIsFlushedAfterEndOfStream = false;
    public boolean mSourceStoppedSignalled = false;
    public boolean mMediaCodecEosSignalled = false;

    /* renamed from: androidx.camera.video.internal.encoder.EncoderImpl$2, reason: invalid class name */
    public final class AnonymousClass2 {
        public final int mBufferIndex;
        public final ByteBuffer mByteBuffer;
        public final MediaCodec mMediaCodec;
        public final CallbackToFutureAdapter$Completer mTerminationCompleter;
        public final CallbackToFutureAdapter$SafeFuture mTerminationFuture;
        public final AtomicBoolean mTerminated = new AtomicBoolean(false);
        public long mPresentationTimeUs = 0;
        public boolean mIsEndOfStream = false;

        public AnonymousClass2(MediaCodec mediaCodec, int i) {
            mediaCodec.getClass();
            this.mMediaCodec = mediaCodec;
            TransactorKt.checkArgumentNonnegative(i);
            this.mBufferIndex = i;
            this.mByteBuffer = mediaCodec.getInputBuffer(i);
            AtomicReference atomicReference = new AtomicReference();
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
            callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
            CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
            callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
            callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
            try {
                atomicReference.set(callbackToFutureAdapter$Completer);
                callbackToFutureAdapter$Completer.tag = "Terminate InputBuffer";
            } catch (Exception e) {
                callbackToFutureAdapter$SafeFuture.setException(e);
            }
            this.mTerminationFuture = callbackToFutureAdapter$SafeFuture;
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = (CallbackToFutureAdapter$Completer) atomicReference.get();
            callbackToFutureAdapter$Completer2.getClass();
            this.mTerminationCompleter = callbackToFutureAdapter$Completer2;
        }

        public final boolean cancel() {
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = this.mTerminationCompleter;
            if (this.mTerminated.getAndSet(true)) {
                return false;
            }
            try {
                this.mMediaCodec.queueInputBuffer(this.mBufferIndex, 0, 0, 0L, 0);
                callbackToFutureAdapter$Completer.set(null);
            } catch (IllegalStateException e) {
                callbackToFutureAdapter$Completer.setException(e);
            }
            return true;
        }

        public final void setPresentationTimeUs(long j) {
            EncoderImpl encoderImpl = EncoderImpl.this;
            if (!encoderImpl.mIsVideoEncoder) {
                j = encoderImpl.toPresentationTimeUsByCaptureEncodeRatio(j);
            }
            if (this.mTerminated.get()) {
                a$$ExternalSyntheticBUOutline0.m$1("The buffer is submitted or canceled.");
            } else {
                TransactorKt.checkArgument(j >= 0);
                this.mPresentationTimeUs = j;
            }
        }

        public final boolean submit() {
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = this.mTerminationCompleter;
            ByteBuffer byteBuffer = this.mByteBuffer;
            if (this.mTerminated.getAndSet(true)) {
                return false;
            }
            try {
                this.mMediaCodec.queueInputBuffer(this.mBufferIndex, byteBuffer.position(), byteBuffer.limit(), this.mPresentationTimeUs, this.mIsEndOfStream ? 4 : 0);
                callbackToFutureAdapter$Completer.set(null);
                return true;
            } catch (IllegalStateException e) {
                callbackToFutureAdapter$Completer.setException(e);
                return false;
            }
        }
    }

    public final class ByteBufferInput implements Encoder$EncoderInput, Observable {
        public final LinkedHashMap mStateObservers = new LinkedHashMap();
        public BufferProvider$State mBufferProviderState = BufferProvider$State.INACTIVE;
        public final ArrayList mAcquisitionList = new ArrayList();

        public ByteBufferInput() {
        }

        @Override // androidx.camera.core.impl.Observable
        public final void addObserver(Executor executor, Observable.Observer observer) {
            EncoderImpl.this.mEncoderExecutor.execute(new AFd1wSDK$$ExternalSyntheticLambda2(17, this, observer, executor));
        }

        @Override // androidx.camera.core.impl.Observable
        public final ListenableFuture fetchData() {
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
            callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
            CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
            callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
            callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
            try {
                EncoderImpl.this.mEncoderExecutor.execute(new EncoderImpl$ByteBufferInput$$ExternalSyntheticLambda2(this, callbackToFutureAdapter$Completer, 0));
                callbackToFutureAdapter$Completer.tag = "fetchData";
            } catch (Exception e) {
                callbackToFutureAdapter$SafeFuture.setException(e);
            }
            return callbackToFutureAdapter$SafeFuture;
        }

        @Override // androidx.camera.core.impl.Observable
        public final void removeObserver(Observable.Observer observer) {
            EncoderImpl.this.mEncoderExecutor.execute(new Recorder$$ExternalSyntheticLambda15(19, this, observer));
        }

        public final void setActive(boolean z) {
            BufferProvider$State bufferProvider$State = BufferProvider$State.INACTIVE;
            BufferProvider$State bufferProvider$State2 = z ? BufferProvider$State.ACTIVE : bufferProvider$State;
            if (this.mBufferProviderState == bufferProvider$State2) {
                return;
            }
            this.mBufferProviderState = bufferProvider$State2;
            if (bufferProvider$State2 == bufferProvider$State) {
                ArrayList arrayList = this.mAcquisitionList;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ListenableFuture) it.next()).cancel(true);
                }
                arrayList.clear();
            }
            for (Map.Entry entry : this.mStateObservers.entrySet()) {
                try {
                    ((Executor) entry.getValue()).execute(new Recorder$$ExternalSyntheticLambda15(17, entry, bufferProvider$State2));
                } catch (RejectedExecutionException e) {
                    StringUtilsKt.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                }
            }
        }
    }

    public final class MediaCodecCallback extends MediaCodec.Callback {
        public boolean mIsFirstVideoOutput;
        public final boolean mReachStopTimeAsEos;
        public final VideoTimebaseConverter mVideoTimestampConverter;
        public boolean mHasSendStartCallback = false;
        public boolean mHasFirstData = false;
        public boolean mHasEndData = false;
        public long mLastPresentationTimeUs = 0;
        public long mLastSentAdjustedTimeUs = 0;
        public boolean mIsOutputBufferInPauseState = false;
        public boolean mIsKeyFrameRequired = false;
        public boolean mStopped = false;

        public MediaCodecCallback() {
            this.mReachStopTimeAsEos = true;
            boolean z = EncoderImpl.this.mIsVideoEncoder;
            this.mIsFirstVideoOutput = z;
            if (z) {
                this.mVideoTimestampConverter = new VideoTimebaseConverter(EncoderImpl.this.mTimeProvider, EncoderImpl.this.mInputTimebase, (CameraUseInconsistentTimebaseQuirk) DeviceQuirks.sQuirks.get(CameraUseInconsistentTimebaseQuirk.class));
            } else {
                this.mVideoTimestampConverter = null;
            }
            if (((CodecStuckOnFlushQuirk) DeviceQuirks.sQuirks.get(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(EncoderImpl.this.mMediaFormat.getString("mime"))) {
                return;
            }
            this.mReachStopTimeAsEos = false;
        }

        @Override // android.media.MediaCodec.Callback
        public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            EncoderImpl.this.mEncoderExecutor.execute(new Recorder$$ExternalSyntheticLambda15(20, this, codecException));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
            EncoderImpl.this.mEncoderExecutor.execute(new Recorder$$ExternalSyntheticLambda14(this, i, 5));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
            EncoderImpl.this.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda4(this, bufferInfo, mediaCodec, i));
        }

        @Override // android.media.MediaCodec.Callback
        public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            EncoderImpl encoderImpl = EncoderImpl.this;
            String str = encoderImpl.mTag;
            StringBuilder sb = new StringBuilder("onOutputFormatChanged: mediaFormat = ");
            sb.append(mediaFormat);
            sb.append(", CSD data = ");
            StringBuilder sb2 = new StringBuilder("{csd-0 = ");
            sb2.append(DebugUtils.byteBufferToHex(mediaFormat.getByteBuffer("csd-0")));
            if (mediaFormat.containsKey("csd-1")) {
                sb2.append(", csd-1 = ");
                sb2.append(DebugUtils.byteBufferToHex(mediaFormat.getByteBuffer("csd-1")));
            }
            if (mediaFormat.containsKey("csd-2")) {
                sb2.append(", csd-2 = ");
                sb2.append(DebugUtils.byteBufferToHex(mediaFormat.getByteBuffer("csd-2")));
            }
            sb2.append("}");
            sb.append(sb2.toString());
            StringUtilsKt.d(str, sb.toString());
            encoderImpl.mEncoderExecutor.execute(new Recorder$$ExternalSyntheticLambda15(21, this, mediaFormat));
        }

        public final void reachEndData() {
            EncoderImpl encoderImpl;
            EncoderCallback encoderCallback;
            Executor executor;
            StringUtilsKt.d(EncoderImpl.this.mTag, "reachEndData");
            if (this.mHasEndData) {
                return;
            }
            this.mHasEndData = true;
            ScheduledFuture scheduledFuture = EncoderImpl.this.mSignalEosTimeoutFuture;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                EncoderImpl.this.mSignalEosTimeoutFuture = null;
            }
            synchronized (EncoderImpl.this.mLock) {
                encoderImpl = EncoderImpl.this;
                encoderCallback = encoderImpl.mEncoderCallback;
                executor = encoderImpl.mEncoderCallbackExecutor;
            }
            encoderImpl.stopMediaCodec(new AFd1wSDK$$ExternalSyntheticLambda2(18, this, executor, encoderCallback));
        }

        public final void sendEncodedData(EncodedDataImpl encodedDataImpl, EncoderCallback encoderCallback, Executor executor) {
            EncoderImpl encoderImpl = EncoderImpl.this;
            encoderImpl.mEncodedDataSet.add(encodedDataImpl);
            Futures.addCallback(Futures.nonCancellationPropagating(encodedDataImpl.mClosedFuture), new Recorder.AnonymousClass1(this, encodedDataImpl, false, 13), encoderImpl.mEncoderExecutor);
            try {
                executor.execute(new Recorder$$ExternalSyntheticLambda15(23, encoderCallback, encodedDataImpl));
            } catch (RejectedExecutionException e) {
                StringUtilsKt.e(encoderImpl.mTag, "Unable to post to the supplied executor.", e);
                encodedDataImpl.close();
            }
        }
    }

    public final class SurfaceInput implements Encoder$EncoderInput {
        public final Object mLock = new Object();
        public Surface mSurface;

        public SurfaceInput() {
        }

        public final Surface getSurface() {
            Surface surface;
            synchronized (this.mLock) {
                try {
                    if (this.mSurface == null) {
                        this.mSurface = MediaCodec.createPersistentInputSurface();
                    }
                    surface = this.mSurface;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return surface;
        }
    }

    public EncoderImpl(Executor executor, EncoderConfig encoderConfig, int i) {
        boolean z = false;
        executor.getClass();
        LruCache lruCache = CodecUtil.codecInfoCache;
        String mimeType = encoderConfig.getMimeType();
        mimeType.getClass();
        try {
            MediaCodec createEncoderByType = MediaCodec.createEncoderByType(mimeType);
            createEncoderByType.getClass();
            this.mMediaCodec = createEncoderByType;
            MediaCodecInfo codecInfo = createEncoderByType.getCodecInfo();
            this.mEncoderExecutor = new SequentialExecutor(executor);
            MediaFormat mediaFormat = encoderConfig.toMediaFormat();
            this.mMediaFormat = mediaFormat;
            Timebase inputTimebase = encoderConfig.getInputTimebase();
            this.mInputTimebase = inputTimebase;
            this.mTimeProvider = new Recorder.AnonymousClass4(new StreamSharing$$ExternalSyntheticLambda1(this, 15), new CueEncoder(7), z, 12);
            if (encoderConfig instanceof AutoValue_AudioEncoderConfig) {
                AutoValue_AudioEncoderConfig autoValue_AudioEncoderConfig = (AutoValue_AudioEncoderConfig) encoderConfig;
                this.mTag = "AudioEncoder";
                this.mIsVideoEncoder = false;
                this.mEncoderInput = new ByteBufferInput();
                String str = autoValue_AudioEncoderConfig.mimeType;
                codecInfo.getClass();
                str.getClass();
                AudioEncoderInfoImpl audioEncoderInfoImpl = new AudioEncoderInfoImpl(codecInfo, str);
                ((MediaCodecInfo.CodecCapabilities) audioEncoderInfoImpl.data).getAudioCapabilities().getClass();
                this.mEncoderInfo = audioEncoderInfoImpl;
                this.mCaptureToEncodeFrameRateRatio = new Rational(autoValue_AudioEncoderConfig.captureSampleRate, autoValue_AudioEncoderConfig.encodeSampleRate);
            } else {
                if (!(encoderConfig instanceof AutoValue_VideoEncoderConfig)) {
                    throw new InvalidConfigException("Unknown encoder config type");
                }
                AutoValue_VideoEncoderConfig autoValue_VideoEncoderConfig = (AutoValue_VideoEncoderConfig) encoderConfig;
                this.mTag = "VideoEncoder";
                this.mIsVideoEncoder = true;
                this.mEncoderInput = new SurfaceInput();
                VideoEncoderInfoImpl videoEncoderInfoImpl = new VideoEncoderInfoImpl(codecInfo, autoValue_VideoEncoderConfig.mimeType);
                if (mediaFormat.containsKey("bitrate")) {
                    int integer = mediaFormat.getInteger("bitrate");
                    int intValue = ((Integer) videoEncoderInfoImpl.getSupportedBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != intValue) {
                        mediaFormat.setInteger("bitrate", intValue);
                        StringUtilsKt.d("VideoEncoder", "updated bitrate from " + integer + " to " + intValue);
                    }
                }
                this.mEncoderInfo = videoEncoderInfoImpl;
                this.mCaptureToEncodeFrameRateRatio = new Rational(autoValue_VideoEncoderConfig.captureFrameRate, autoValue_VideoEncoderConfig.encodeFrameRate);
            }
            StringUtilsKt.d(this.mTag, "mInputTimebase = " + inputTimebase);
            StringUtilsKt.d(this.mTag, "mMediaFormat = " + mediaFormat);
            StringUtilsKt.d(this.mTag, "mCaptureToEncodeFrameRateRatio = " + this.mCaptureToEncodeFrameRateRatio);
            try {
                reset();
                AtomicReference atomicReference = new AtomicReference();
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
                callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
                CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
                callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
                callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
                try {
                    atomicReference.set(callbackToFutureAdapter$Completer);
                    callbackToFutureAdapter$Completer.tag = "mReleasedFuture";
                } catch (Exception e) {
                    callbackToFutureAdapter$SafeFuture.setException(e);
                }
                this.mReleasedFuture = Futures.nonCancellationPropagating(callbackToFutureAdapter$SafeFuture);
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = (CallbackToFutureAdapter$Completer) atomicReference.get();
                callbackToFutureAdapter$Completer2.getClass();
                this.mReleasedCompleter = callbackToFutureAdapter$Completer2;
                if (this.mIsVideoEncoder && ((i == 1 && DeviceQuirks.sQuirks.get(PreviewFreezeAfterHighSpeedRecordingQuirk.class) != null) || DeviceQuirks.sQuirks.get(GLProcessingStuckOnCodecFlushQuirk.class) != null)) {
                    z = true;
                }
                this.mCodecStopAsFlushWorkaroundEnabled = z;
                setState(1);
            } catch (MediaCodec.CodecException e2) {
                throw new InvalidConfigException(e2);
            }
        } catch (IOException e3) {
            throw new InvalidConfigException(e3);
        } catch (IllegalArgumentException e4) {
            throw new InvalidConfigException(e4);
        }
    }

    public final ListenableFuture acquireInputBuffer() {
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mState)) {
            case 0:
                return new ImmediateFuture$ImmediateFailedFuture(new IllegalStateException("Encoder is not started yet."), 0);
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
                callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
                CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
                callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
                callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
                try {
                    atomicReference.set(callbackToFutureAdapter$Completer);
                    callbackToFutureAdapter$Completer.tag = "acquireInputBuffer";
                } catch (Exception e) {
                    callbackToFutureAdapter$SafeFuture.setException(e);
                }
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = (CallbackToFutureAdapter$Completer) atomicReference.get();
                callbackToFutureAdapter$Completer2.getClass();
                this.mAcquisitionQueue.offer(callbackToFutureAdapter$Completer2);
                callbackToFutureAdapter$Completer2.addCancellationListener(new Recorder$$ExternalSyntheticLambda15(15, this, callbackToFutureAdapter$Completer2), this.mEncoderExecutor);
                matchAcquisitionsAndFreeBufferIndexes();
                return callbackToFutureAdapter$SafeFuture;
            case 7:
                return new ImmediateFuture$ImmediateFailedFuture(new IllegalStateException("Encoder is in error state."), 0);
            case 8:
                return new ImmediateFuture$ImmediateFailedFuture(new IllegalStateException("Encoder is released."), 0);
            default:
                a$$ExternalSyntheticBUOutline0.m$1("Unknown state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$6(this.mState)));
                return null;
        }
    }

    public final void handleEncodeError(int i, String str, Throwable th) {
        switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(this.mState)) {
            case 0:
                notifyError(i, str, th);
                reset();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                setState(8);
                stopMediaCodec(new EncoderImpl$$ExternalSyntheticLambda4(this, i, str, th));
                break;
            case 7:
                StringUtilsKt.w(this.mTag, Recorder$$ExternalSyntheticOutline1.m("Get more than one error: ", i, str, "(", ")"), th);
                break;
        }
    }

    public final void matchAcquisitionsAndFreeBufferIndexes() {
        while (true) {
            ArrayDeque arrayDeque = this.mAcquisitionQueue;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.mFreeInputBufferIndexQueue;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) arrayDeque.poll();
            Objects.requireNonNull(callbackToFutureAdapter$Completer);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.mMediaCodec, num.intValue());
                if (callbackToFutureAdapter$Completer.set(anonymousClass2)) {
                    this.mInputBufferSet.add(anonymousClass2);
                    Futures.nonCancellationPropagating(anonymousClass2.mTerminationFuture).addListener(new Recorder$$ExternalSyntheticLambda15(16, this, anonymousClass2), this.mEncoderExecutor);
                } else {
                    anonymousClass2.cancel();
                }
            } catch (MediaCodec.CodecException e) {
                handleEncodeError(1, e.getMessage(), e);
                return;
            }
        }
    }

    public final void notifyError(int i, String str, Throwable th) {
        EncoderCallback encoderCallback;
        Executor executor;
        synchronized (this.mLock) {
            encoderCallback = this.mEncoderCallback;
            executor = this.mEncoderCallbackExecutor;
        }
        try {
            executor.execute(new AFd1wSDK$$ExternalSyntheticLambda2(encoderCallback, i, str, th));
        } catch (RejectedExecutionException e) {
            StringUtilsKt.e(this.mTag, "Unable to post to the supplied executor.", e);
        }
    }

    public final void pause() {
        this.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda1(this, this.mTimeProvider.uptimeUs(), 0));
    }

    public final void releaseInternal() {
        Surface surface;
        StringUtilsKt.d(this.mTag, "releaseInternal");
        if (this.mIsFlushedAfterEndOfStream) {
            if (!this.mCodecStopAsFlushWorkaroundEnabled) {
                StringUtilsKt.d(this.mTag, "mMediaCodec.stop()");
                this.mMediaCodec.stop();
            }
            this.mIsFlushedAfterEndOfStream = false;
        }
        StringUtilsKt.d(this.mTag, "mMediaCodec.release()");
        this.mMediaCodec.release();
        Encoder$EncoderInput encoder$EncoderInput = this.mEncoderInput;
        if (encoder$EncoderInput instanceof SurfaceInput) {
            SurfaceInput surfaceInput = (SurfaceInput) encoder$EncoderInput;
            synchronized (surfaceInput.mLock) {
                surface = surfaceInput.mSurface;
                surfaceInput.mSurface = null;
            }
            if (surface != null) {
                surface.release();
            }
        }
        setState(9);
        this.mReleasedCompleter.set(null);
    }

    public final void requestKeyFrameToMediaCodec() {
        Bundle bundle = new Bundle();
        bundle.putInt("request-sync", 0);
        StringUtilsKt.d(this.mTag, "mMediaCodec.setParameters - requestKeyFrameToMediaCodec");
        this.mMediaCodec.setParameters(bundle);
    }

    public final void reset() {
        this.mStartStopTimeRangeUs = NO_RANGE;
        this.mTotalPausedDurationUs = 0L;
        this.mActivePauseResumeTimeRanges.clear();
        this.mFreeInputBufferIndexQueue.clear();
        ArrayDeque arrayDeque = this.mAcquisitionQueue;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            ((CallbackToFutureAdapter$Completer) it.next()).setCancelled();
        }
        arrayDeque.clear();
        String str = this.mTag;
        StringUtilsKt.d(str, "mMediaCodec.reset()");
        MediaCodec mediaCodec = this.mMediaCodec;
        mediaCodec.reset();
        this.mIsFlushedAfterEndOfStream = false;
        this.mSourceStoppedSignalled = false;
        this.mMediaCodecEosSignalled = false;
        this.mPendingCodecStop = false;
        ScheduledFuture scheduledFuture = this.mStopTimeoutFuture;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.mStopTimeoutFuture = null;
        }
        ScheduledFuture scheduledFuture2 = this.mSignalEosTimeoutFuture;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.mSignalEosTimeoutFuture = null;
        }
        MediaCodecCallback mediaCodecCallback = this.mMediaCodecCallback;
        if (mediaCodecCallback != null) {
            mediaCodecCallback.mStopped = true;
        }
        this.mMediaCodecCallback = new MediaCodecCallback();
        StringUtilsKt.d(str, "mMediaCodec.setCallback()");
        mediaCodec.setCallback(this.mMediaCodecCallback);
        StringUtilsKt.d(str, "mMediaCodec.configure()");
        mediaCodec.configure(this.mMediaFormat, (Surface) null, (MediaCrypto) null, 1);
        Encoder$EncoderInput encoder$EncoderInput = this.mEncoderInput;
        if (encoder$EncoderInput instanceof SurfaceInput) {
            SurfaceInput surfaceInput = (SurfaceInput) encoder$EncoderInput;
            EncoderImpl.this.mMediaCodec.setInputSurface(surfaceInput.getSurface());
        }
    }

    public final void setMediaCodecPaused(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("drop-input-frames", z ? 1 : 0);
        StringUtilsKt.d(this.mTag, "mMediaCodec.setParameters - setMediaCodecPaused: " + z);
        this.mMediaCodec.setParameters(bundle);
    }

    public final void setState(int i) {
        if (this.mState == i) {
            return;
        }
        StringUtilsKt.d(this.mTag, "Transitioning encoder internal state: " + Recorder$$ExternalSyntheticOutline1.stringValueOf$6(this.mState) + " --> " + Recorder$$ExternalSyntheticOutline1.stringValueOf$6(i));
        this.mState = i;
    }

    public final void signalCodecStop() {
        StringUtilsKt.d(this.mTag, "signalCodecStop");
        Encoder$EncoderInput encoder$EncoderInput = this.mEncoderInput;
        int i = 1;
        if (encoder$EncoderInput instanceof ByteBufferInput) {
            ((ByteBufferInput) encoder$EncoderInput).setActive(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.mInputBufferSet.iterator();
            while (it.hasNext()) {
                arrayList.add(Futures.nonCancellationPropagating(((AnonymousClass2) it.next()).mTerminationFuture));
            }
            new ListFuture(new ArrayList(arrayList), false, zzabp.directExecutor()).addListener(new EncoderImpl$$ExternalSyntheticLambda2(this, i), this.mEncoderExecutor);
            return;
        }
        if (encoder$EncoderInput instanceof SurfaceInput) {
            try {
                if (DeviceQuirks.sQuirks.get(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    MediaCodecCallback mediaCodecCallback = this.mMediaCodecCallback;
                    SequentialExecutor sequentialExecutor = this.mEncoderExecutor;
                    ScheduledFuture scheduledFuture = this.mSignalEosTimeoutFuture;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.mSignalEosTimeoutFuture = zzabp.mainThreadExecutor().schedule(new Recorder$$ExternalSyntheticLambda15(14, sequentialExecutor, mediaCodecCallback), 1000L, TimeUnit.MILLISECONDS);
                }
                StringUtilsKt.d(this.mTag, "mMediaCodec.signalEndOfInputStream()");
                this.mMediaCodec.signalEndOfInputStream();
                this.mMediaCodecEosSignalled = true;
            } catch (MediaCodec.CodecException e) {
                handleEncodeError(1, e.getMessage(), e);
            }
        }
    }

    public final void start() {
        this.mEncoderExecutor.execute(new EncoderImpl$$ExternalSyntheticLambda1(this, this.mTimeProvider.uptimeUs(), 1));
    }

    public final void stopMediaCodec(Runnable runnable) {
        String str = this.mTag;
        StringUtilsKt.d(str, "stopMediaCodec");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.mEncodedDataSet;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.nonCancellationPropagating(((EncodedDataImpl) it.next()).mClosedFuture));
        }
        HashSet hashSet2 = this.mInputBufferSet;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(Futures.nonCancellationPropagating(((AnonymousClass2) it2.next()).mTerminationFuture));
        }
        if (!arrayList.isEmpty()) {
            StringUtilsKt.d(str, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        new ListFuture(new ArrayList(arrayList), false, zzabp.directExecutor()).addListener(new AFd1wSDK$$ExternalSyntheticLambda2(16, this, arrayList, runnable), this.mEncoderExecutor);
    }

    public final long toPresentationTimeUsByCaptureEncodeRatio(long j) {
        Rational rational = this.mCaptureToEncodeFrameRateRatio;
        if (rational != null && rational.getDenominator() == rational.getNumerator()) {
            return j;
        }
        return Math.round(rational.doubleValue() * j);
    }
}
