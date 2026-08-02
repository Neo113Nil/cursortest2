package androidx.camera.video.internal.encoder;

import android.content.Context;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.SystemClock;
import android.util.Range;
import android.util.Rational;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.internal.DebugUtils;
import androidx.camera.video.internal.compat.quirk.AudioEncoderIgnoresInputTimestampQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.PrematureEndOfStreamVideoQuirk;
import androidx.camera.video.internal.compat.quirk.VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.workaround.VideoTimebaseConverter;
import androidx.media3.exoplayer.ExoPlayerImpl$$ExternalSyntheticLambda9;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.SVG;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$ExternalSyntheticLambda1;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.gms.maps.zzai;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class EncoderImpl$$ExternalSyntheticLambda4 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda4(EncoderImpl.MediaCodecCallback mediaCodecCallback, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.f$0 = mediaCodecCallback;
        this.f$2 = bufferInfo;
        this.f$3 = mediaCodec;
        this.f$1 = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x03c6, code lost:
    
        if (r4.presentationTimeUs > ((java.lang.Long) r0.mStartStopTimeRangeUs.getUpper()).longValue()) goto L187;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x028d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        EncoderImpl encoderImpl;
        EncoderCallback encoderCallback;
        Executor executor;
        Iterator it;
        boolean z;
        boolean z2;
        boolean z3;
        MediaCodec.BufferInfo bufferInfo;
        Executor executor2;
        EncoderCallback encoderCallback2;
        switch (this.$r8$classId) {
            case 0:
                ((EncoderImpl) this.f$0).notifyError(this.f$1, (String) this.f$2, (Throwable) this.f$3);
                return;
            case 1:
                EncoderImpl.MediaCodecCallback mediaCodecCallback = (EncoderImpl.MediaCodecCallback) this.f$0;
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f$2;
                MediaCodec mediaCodec = (MediaCodec) this.f$3;
                int i = this.f$1;
                boolean z4 = mediaCodecCallback.mStopped;
                EncoderImpl encoderImpl2 = EncoderImpl.this;
                if (z4) {
                    StringUtilsKt.w(encoderImpl2.mTag, "Receives frame after codec is reset.");
                    return;
                }
                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(encoderImpl2.mState)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (EncoderImpl.this.mLock) {
                            encoderImpl = EncoderImpl.this;
                            encoderCallback = encoderImpl.mEncoderCallback;
                            executor = encoderImpl.mEncoderCallbackExecutor;
                        }
                        if (Build.VERSION.SDK_INT < 30 && encoderImpl.mIsVideoEncoder) {
                            Rational rational = encoderImpl.mCaptureToEncodeFrameRateRatio;
                            if (!(rational != null && rational.getDenominator() == rational.getNumerator())) {
                                bufferInfo2.presentationTimeUs = EncoderImpl.this.toPresentationTimeUsByCaptureEncodeRatio(bufferInfo2.presentationTimeUs);
                            }
                        }
                        if (!mediaCodecCallback.mHasSendStartCallback) {
                            mediaCodecCallback.mHasSendStartCallback = true;
                            try {
                                Objects.requireNonNull(encoderCallback);
                                executor.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda4(encoderCallback, 0));
                            } catch (RejectedExecutionException e) {
                                StringUtilsKt.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                            }
                        }
                        try {
                            if (mediaCodecCallback.mHasEndData) {
                                StringUtilsKt.d(EncoderImpl.this.mTag, "Drop buffer by already reach end of stream.");
                            } else if (bufferInfo2.size <= 0) {
                                StringUtilsKt.d(EncoderImpl.this.mTag, "Drop buffer by invalid buffer size.");
                            } else if ((bufferInfo2.flags & 2) != 0) {
                                StringUtilsKt.d(EncoderImpl.this.mTag, "Drop buffer by codec config.");
                            } else {
                                VideoTimebaseConverter videoTimebaseConverter = mediaCodecCallback.mVideoTimestampConverter;
                                if (videoTimebaseConverter != null) {
                                    bufferInfo2.presentationTimeUs = videoTimebaseConverter.convertToUptimeUs(bufferInfo2.presentationTimeUs);
                                }
                                long j = bufferInfo2.presentationTimeUs;
                                if (j <= mediaCodecCallback.mLastPresentationTimeUs) {
                                    StringUtilsKt.d(EncoderImpl.this.mTag, "Drop buffer by out of order buffer from MediaCodec.");
                                } else {
                                    mediaCodecCallback.mLastPresentationTimeUs = j;
                                    boolean contains = EncoderImpl.this.mStartStopTimeRangeUs.contains((Range) Long.valueOf(j));
                                    EncoderImpl encoderImpl3 = EncoderImpl.this;
                                    if (contains) {
                                        long j2 = bufferInfo2.presentationTimeUs;
                                        ArrayDeque arrayDeque = encoderImpl3.mActivePauseResumeTimeRanges;
                                        while (!arrayDeque.isEmpty()) {
                                            Range range = (Range) arrayDeque.getFirst();
                                            if (j2 > ((Long) range.getUpper()).longValue()) {
                                                arrayDeque.removeFirst();
                                                long longValue = (((Long) range.getUpper()).longValue() - ((Long) range.getLower()).longValue()) + encoderImpl3.mTotalPausedDurationUs;
                                                encoderImpl3.mTotalPausedDurationUs = longValue;
                                                StringUtilsKt.d(encoderImpl3.mTag, "Total paused duration = ".concat(DebugUtils.readableUs(longValue)));
                                            } else {
                                                EncoderImpl encoderImpl4 = EncoderImpl.this;
                                                long j3 = bufferInfo2.presentationTimeUs;
                                                it = encoderImpl4.mActivePauseResumeTimeRanges.iterator();
                                                while (it.hasNext()) {
                                                    Range range2 = (Range) it.next();
                                                    if (range2.contains((Range) Long.valueOf(j3))) {
                                                        z = true;
                                                        z2 = mediaCodecCallback.mIsOutputBufferInPauseState;
                                                        if (z2 && z) {
                                                            StringUtilsKt.d(EncoderImpl.this.mTag, "Switch to pause state");
                                                            mediaCodecCallback.mIsOutputBufferInPauseState = true;
                                                            synchronized (EncoderImpl.this.mLock) {
                                                                EncoderImpl encoderImpl5 = EncoderImpl.this;
                                                                executor2 = encoderImpl5.mEncoderCallbackExecutor;
                                                                encoderCallback2 = encoderImpl5.mEncoderCallback;
                                                            }
                                                            Objects.requireNonNull(encoderCallback2);
                                                            executor2.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda4(encoderCallback2, 0));
                                                            EncoderImpl encoderImpl6 = EncoderImpl.this;
                                                            if (encoderImpl6.mState == 3 && ((encoderImpl6.mIsVideoEncoder || DeviceQuirks.sQuirks.get(AudioEncoderIgnoresInputTimestampQuirk.class) == null) && (!EncoderImpl.this.mIsVideoEncoder || DeviceQuirks.sQuirks.get(VideoEncoderSuspendDoesNotIncludeSuspendTimeQuirk.class) == null))) {
                                                                Encoder$EncoderInput encoder$EncoderInput = EncoderImpl.this.mEncoderInput;
                                                                if (encoder$EncoderInput instanceof EncoderImpl.ByteBufferInput) {
                                                                    ((EncoderImpl.ByteBufferInput) encoder$EncoderInput).setActive(false);
                                                                }
                                                                EncoderImpl.this.setMediaCodecPaused(true);
                                                            }
                                                            EncoderImpl.this.mLastDataStopTimestamp = Long.valueOf(bufferInfo2.presentationTimeUs);
                                                            EncoderImpl encoderImpl7 = EncoderImpl.this;
                                                            if (encoderImpl7.mPendingCodecStop) {
                                                                ScheduledFuture scheduledFuture = encoderImpl7.mStopTimeoutFuture;
                                                                if (scheduledFuture != null) {
                                                                    scheduledFuture.cancel(true);
                                                                }
                                                                EncoderImpl.this.signalCodecStop();
                                                                EncoderImpl.this.mPendingCodecStop = false;
                                                            }
                                                        } else if (z2 && !z) {
                                                            StringUtilsKt.d(EncoderImpl.this.mTag, "Switch to resume state");
                                                            mediaCodecCallback.mIsOutputBufferInPauseState = false;
                                                            if (EncoderImpl.this.mIsVideoEncoder && (bufferInfo2.flags & 1) == 0) {
                                                                mediaCodecCallback.mIsKeyFrameRequired = true;
                                                            }
                                                        }
                                                        z3 = mediaCodecCallback.mIsOutputBufferInPauseState;
                                                        EncoderImpl encoderImpl8 = EncoderImpl.this;
                                                        if (z3) {
                                                            long j4 = encoderImpl8.mTotalPausedDurationUs;
                                                            long j5 = bufferInfo2.presentationTimeUs;
                                                            if (j4 > 0) {
                                                                j5 -= j4;
                                                            }
                                                            if (j5 > mediaCodecCallback.mLastSentAdjustedTimeUs) {
                                                                boolean z5 = mediaCodecCallback.mHasFirstData;
                                                                if (!z5 && !mediaCodecCallback.mIsKeyFrameRequired && encoderImpl8.mIsVideoEncoder) {
                                                                    mediaCodecCallback.mIsKeyFrameRequired = true;
                                                                }
                                                                if (mediaCodecCallback.mIsKeyFrameRequired) {
                                                                    if ((bufferInfo2.flags & 1) != 0) {
                                                                        mediaCodecCallback.mIsKeyFrameRequired = false;
                                                                    } else {
                                                                        StringUtilsKt.d(encoderImpl8.mTag, "Drop buffer by not a key frame.");
                                                                        EncoderImpl.this.requestKeyFrameToMediaCodec();
                                                                    }
                                                                }
                                                                if (!z5) {
                                                                    mediaCodecCallback.mHasFirstData = true;
                                                                    StringUtilsKt.d(encoderImpl8.mTag, "data timestampUs = " + bufferInfo2.presentationTimeUs + ", data timebase = " + EncoderImpl.this.mInputTimebase + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                                                                }
                                                                long j6 = EncoderImpl.this.mTotalPausedDurationUs;
                                                                long j7 = bufferInfo2.presentationTimeUs;
                                                                if (j6 > 0) {
                                                                    j7 -= j6;
                                                                }
                                                                long j8 = j7;
                                                                if (bufferInfo2.presentationTimeUs == j8) {
                                                                    bufferInfo = bufferInfo2;
                                                                } else {
                                                                    TransactorKt.checkState(null, j8 > mediaCodecCallback.mLastSentAdjustedTimeUs);
                                                                    bufferInfo = new MediaCodec.BufferInfo();
                                                                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, j8, bufferInfo2.flags);
                                                                }
                                                                mediaCodecCallback.mLastSentAdjustedTimeUs = bufferInfo.presentationTimeUs;
                                                                try {
                                                                    mediaCodecCallback.sendEncodedData(new EncodedDataImpl(mediaCodec, i, bufferInfo), encoderCallback, executor);
                                                                    if (!mediaCodecCallback.mHasEndData) {
                                                                        if ((bufferInfo2.flags & 4) == 0 || (mediaCodecCallback.mIsFirstVideoOutput && DeviceQuirks.sQuirks.get(PrematureEndOfStreamVideoQuirk.class) != null)) {
                                                                            if (mediaCodecCallback.mReachStopTimeAsEos) {
                                                                                EncoderImpl encoderImpl9 = EncoderImpl.this;
                                                                                if (encoderImpl9.mMediaCodecEosSignalled) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        mediaCodecCallback.reachEndData();
                                                                    }
                                                                    if (mediaCodecCallback.mIsFirstVideoOutput) {
                                                                        return;
                                                                    }
                                                                    mediaCodecCallback.mIsFirstVideoOutput = false;
                                                                    return;
                                                                } catch (MediaCodec.CodecException e2) {
                                                                    EncoderImpl.this.handleEncodeError(1, e2.getMessage(), e2);
                                                                    return;
                                                                }
                                                            }
                                                            StringUtilsKt.d(encoderImpl8.mTag, "Drop buffer by adjusted time is less than the last sent time.");
                                                            if (EncoderImpl.this.mIsVideoEncoder && (bufferInfo2.flags & 1) != 0) {
                                                                mediaCodecCallback.mIsKeyFrameRequired = true;
                                                            }
                                                        } else {
                                                            StringUtilsKt.d(encoderImpl8.mTag, "Drop buffer by pause.");
                                                        }
                                                    } else if (j3 < ((Long) range2.getLower()).longValue()) {
                                                        z = false;
                                                        z2 = mediaCodecCallback.mIsOutputBufferInPauseState;
                                                        if (z2) {
                                                        }
                                                        if (z2) {
                                                            StringUtilsKt.d(EncoderImpl.this.mTag, "Switch to resume state");
                                                            mediaCodecCallback.mIsOutputBufferInPauseState = false;
                                                            if (EncoderImpl.this.mIsVideoEncoder) {
                                                                mediaCodecCallback.mIsKeyFrameRequired = true;
                                                            }
                                                        }
                                                        z3 = mediaCodecCallback.mIsOutputBufferInPauseState;
                                                        EncoderImpl encoderImpl82 = EncoderImpl.this;
                                                        if (z3) {
                                                        }
                                                    }
                                                }
                                                z = false;
                                                z2 = mediaCodecCallback.mIsOutputBufferInPauseState;
                                                if (z2) {
                                                }
                                                if (z2) {
                                                }
                                                z3 = mediaCodecCallback.mIsOutputBufferInPauseState;
                                                EncoderImpl encoderImpl822 = EncoderImpl.this;
                                                if (z3) {
                                                }
                                            }
                                        }
                                        EncoderImpl encoderImpl42 = EncoderImpl.this;
                                        long j32 = bufferInfo2.presentationTimeUs;
                                        it = encoderImpl42.mActivePauseResumeTimeRanges.iterator();
                                        while (it.hasNext()) {
                                        }
                                        z = false;
                                        z2 = mediaCodecCallback.mIsOutputBufferInPauseState;
                                        if (z2) {
                                        }
                                        if (z2) {
                                        }
                                        z3 = mediaCodecCallback.mIsOutputBufferInPauseState;
                                        EncoderImpl encoderImpl8222 = EncoderImpl.this;
                                        if (z3) {
                                        }
                                    } else {
                                        StringUtilsKt.d(encoderImpl3.mTag, "Drop buffer by not in start-stop range.");
                                        EncoderImpl encoderImpl10 = EncoderImpl.this;
                                        if (encoderImpl10.mPendingCodecStop && bufferInfo2.presentationTimeUs >= ((Long) encoderImpl10.mStartStopTimeRangeUs.getUpper()).longValue()) {
                                            ScheduledFuture scheduledFuture2 = EncoderImpl.this.mStopTimeoutFuture;
                                            if (scheduledFuture2 != null) {
                                                scheduledFuture2.cancel(true);
                                            }
                                            EncoderImpl.this.mLastDataStopTimestamp = Long.valueOf(bufferInfo2.presentationTimeUs);
                                            EncoderImpl.this.signalCodecStop();
                                            EncoderImpl.this.mPendingCodecStop = false;
                                        }
                                    }
                                }
                            }
                            EncoderImpl.this.mMediaCodec.releaseOutputBuffer(i, false);
                            if (!mediaCodecCallback.mHasEndData) {
                            }
                            if (mediaCodecCallback.mIsFirstVideoOutput) {
                            }
                        } catch (MediaCodec.CodecException e3) {
                            EncoderImpl.this.handleEncodeError(1, e3.getMessage(), e3);
                            return;
                        }
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("Unknown state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$6(EncoderImpl.this.mState)));
                        return;
                }
            default:
                zzai zzaiVar = (zzai) this.f$0;
                AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) this.f$2;
                int i2 = this.f$1;
                Runnable runnable = (Runnable) this.f$3;
                SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) zzaiVar.zza;
                try {
                    try {
                        SQLiteEventStore sQLiteEventStore2 = (SQLiteEventStore) zzaiVar.zab;
                        Objects.requireNonNull(sQLiteEventStore2);
                        sQLiteEventStore.runCriticalSection(new Uploader$$ExternalSyntheticLambda1(sQLiteEventStore2, 0));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) zzaiVar.zzc).getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            sQLiteEventStore.runCriticalSection(new ExoPlayerImpl$$ExternalSyntheticLambda9(zzaiVar, autoValue_TransportContext, i2));
                        } else {
                            zzaiVar.logAndUpdateState(autoValue_TransportContext, i2);
                        }
                    } catch (SynchronizationException unused) {
                        ((SVG) zzaiVar.zac).schedule(autoValue_TransportContext, i2 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
        }
    }

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda4(EncoderImpl encoderImpl, int i, String str, Throwable th) {
        this.f$0 = encoderImpl;
        this.f$1 = i;
        this.f$2 = str;
        this.f$3 = th;
    }

    public /* synthetic */ EncoderImpl$$ExternalSyntheticLambda4(zzai zzaiVar, AutoValue_TransportContext autoValue_TransportContext, int i, Runnable runnable) {
        this.f$0 = zzaiVar;
        this.f$2 = autoValue_TransportContext;
        this.f$1 = i;
        this.f$3 = runnable;
    }
}
