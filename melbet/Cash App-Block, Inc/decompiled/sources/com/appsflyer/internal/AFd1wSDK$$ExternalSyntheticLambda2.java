package com.appsflyer.internal;

import android.media.AudioTrack;
import android.os.Handler;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.ActionMode;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.biometric.BiometricPrompt;
import androidx.camera.camera2.adapter.CaptureResultAdapter;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.AbstractCameraPresenceSource$ObserverWrapper;
import androidx.camera.core.impl.AdapterCameraInfo;
import androidx.camera.core.impl.AutoValue_EncoderProfilesProxy_VideoProfileProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.camera.core.impl.utils.futures.ChainingListenableFuture;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda15;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoEncoderSession;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioStreamImpl;
import androidx.camera.video.internal.audio.AudioStreamImpl.AudioRecordingApi29Callback;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.camera.video.internal.compat.quirk.MediaCodecDefaultDataSpaceQuirk;
import androidx.camera.video.internal.compat.quirk.StopCodecAfterSurfaceRemovalCrashMediaServerQuirk;
import androidx.camera.video.internal.config.VideoConfigUtil;
import androidx.camera.video.internal.config.VideoEncoderConfigDefaultResolver;
import androidx.camera.video.internal.config.VideoMimeInfo;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderConfig;
import androidx.camera.video.internal.encoder.AutoValue_VideoEncoderDataSpace;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.video.internal.encoder.EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda4;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.camera.view.SurfaceViewImplementation;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.foundation.text.contextmenu.internal.FloatingTextActionModeCallback;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.emoji2.text.MetadataRepo;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentTransition;
import androidx.fragment.app.SpecialEffectsController$FragmentStateManagerOperation;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.media3.common.Format;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.StuckPlayerDetector;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.media3.exoplayer.MediaPeriodQueue;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.ui.PlayerView;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao_Impl;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderManager;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1;
import app.cash.local.views.instore.TableQrCodeCameraViewFinderState;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.toolbox.HurlStack;
import com.fillr.e0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import com.squareup.cash.api.ContextKt;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import timber.log.Timber;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class AFd1wSDK$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ AFd1wSDK$$ExternalSyntheticLambda2(DualSurfaceProcessor dualSurfaceProcessor, DynamicRange dynamicRange, CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        this.$r8$classId = 9;
        Map map = Collections.EMPTY_MAP;
        this.f$0 = dualSurfaceProcessor;
        this.f$1 = dynamicRange;
        this.f$2 = callbackToFutureAdapter$Completer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0415, code lost:
    
        if (((androidx.camera.core.SurfaceRequest) r13.mSurfaceRequest) == r3) goto L180;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        LiveData cameraState;
        VideoEncoderConfigDefaultResolver videoEncoderConfigDefaultResolver;
        ListenableFuture nonCancellationPropagating;
        Object obj = null;
        LifecycleCamera lifecycleCamera = null;
        boolean z = false;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                AFd1wSDK.getCurrencyIso4217Code((AFd1wSDK) this.f$0, (Throwable) this.f$1, (String) this.f$2);
                return;
            case 1:
                ((CameraCaptureCallback) this.f$0).onCaptureCompleted(CameraCallbackMap.getCaptureConfigId((RequestMetadata) this.f$1), (CaptureResultAdapter) this.f$2);
                return;
            case 2:
                ((CameraCaptureCallback) this.f$0).onCaptureFailed(CameraCallbackMap.getCaptureConfigId((RequestMetadata) this.f$1), (HurlStack) this.f$2);
                return;
            case 3:
                ((ImageCapture) this.f$0).takePicture((Executor) this.f$1, (ContextKt) this.f$2);
                return;
            case 4:
                Throwable th = (Throwable) this.f$1;
                AbstractCameraPresenceSource$ObserverWrapper abstractCameraPresenceSource$ObserverWrapper = (AbstractCameraPresenceSource$ObserverWrapper) this.f$0;
                List list = (List) this.f$2;
                if (th != null) {
                    abstractCameraPresenceSource$ObserverWrapper.mObserver.onError(th);
                    return;
                } else {
                    abstractCameraPresenceSource$ObserverWrapper.mObserver.onNewData(list);
                    return;
                }
            case 5:
                ArrayList arrayList = (ArrayList) this.f$0;
                Observer observer = (Observer) this.f$1;
                String str = (String) this.f$2;
                try {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.areEqual(((CameraInfoInternal) next).getCameraId(), str)) {
                                obj = next;
                            }
                        }
                    }
                    CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) obj;
                    if (cameraInfoInternal == null || (cameraState = cameraInfoInternal.getCameraState()) == null) {
                        return;
                    }
                    cameraState.removeObserver(observer);
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 6:
                DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) this.f$0;
                DynamicRange dynamicRange = (DynamicRange) this.f$1;
                Map map = Collections.EMPTY_MAP;
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) this.f$2;
                try {
                    defaultSurfaceProcessor.mGlRenderer.init(dynamicRange);
                    callbackToFutureAdapter$Completer.set(null);
                    return;
                } catch (RuntimeException e) {
                    callbackToFutureAdapter$Completer.setException(e);
                    return;
                }
            case 7:
                DefaultSurfaceProcessor defaultSurfaceProcessor2 = (DefaultSurfaceProcessor) this.f$0;
                Runnable runnable = (Runnable) this.f$1;
                Runnable runnable2 = (Runnable) this.f$2;
                if (defaultSurfaceProcessor2.mIsReleased) {
                    runnable.run();
                    return;
                } else {
                    runnable2.run();
                    return;
                }
            case 8:
                ((MetadataRepo) this.f$0).createAndSendSurfaceOutput((SurfaceEdge) this.f$1, (Map.Entry) this.f$2);
                return;
            case 9:
                DualSurfaceProcessor dualSurfaceProcessor = (DualSurfaceProcessor) this.f$0;
                DynamicRange dynamicRange2 = (DynamicRange) this.f$1;
                Map map2 = Collections.EMPTY_MAP;
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = (CallbackToFutureAdapter$Completer) this.f$2;
                try {
                    dualSurfaceProcessor.mGlRenderer.init(dynamicRange2);
                    callbackToFutureAdapter$Completer2.set(null);
                    return;
                } catch (RuntimeException e2) {
                    callbackToFutureAdapter$Completer2.setException(e2);
                    return;
                }
            case 10:
                DualSurfaceProcessor dualSurfaceProcessor2 = (DualSurfaceProcessor) this.f$0;
                Runnable runnable3 = (Runnable) this.f$1;
                Runnable runnable4 = (Runnable) this.f$2;
                if (dualSurfaceProcessor2.mIsReleased) {
                    runnable3.run();
                    return;
                } else {
                    runnable4.run();
                    return;
                }
            case 11:
                Recorder.SetupVideoTask setupVideoTask = (Recorder.SetupVideoTask) this.f$0;
                SurfaceRequest surfaceRequest = (SurfaceRequest) this.f$1;
                Timebase timebase = (Timebase) this.f$2;
                if (!surfaceRequest.mSurfaceFuture.delegate.isDone()) {
                    VideoEncoderSession videoEncoderSession = ((Recorder) setupVideoTask.this$0).mVideoEncoderSession;
                    int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(videoEncoderSession.mVideoEncoderState);
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        f$$ExternalSyntheticLambda0.m("State ", Recorder$$ExternalSyntheticOutline1.stringValueOf$3(videoEncoderSession.mVideoEncoderState), " is not handled");
                                        return;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    Recorder recorder = (Recorder) setupVideoTask.this$0;
                    VideoEncoderSession videoEncoderSession2 = new VideoEncoderSession(recorder.mVideoEncoderFactory, recorder.mSequentialExecutor, recorder.mExecutor);
                    MediaSpec mediaSpec = (MediaSpec) Recorder.getObservableData(((Recorder) setupVideoTask.this$0).mMediaSpec);
                    DynamicRange dynamicRange3 = surfaceRequest.mDynamicRange;
                    VideoMimeInfo resolveVideoMimeInfo = VideoConfigUtil.resolveVideoMimeInfo(dynamicRange3, mediaSpec, ((Recorder) setupVideoTask.this$0).mResolvedEncoderProfiles);
                    VideoSpec videoSpec = mediaSpec.videoSpec;
                    Size size = surfaceRequest.mResolution;
                    Range range = surfaceRequest.mExpectedFrameRate;
                    timebase.getClass();
                    videoSpec.getClass();
                    size.getClass();
                    range.getClass();
                    AutoValue_EncoderProfilesProxy_VideoProfileProxy autoValue_EncoderProfilesProxy_VideoProfileProxy = resolveVideoMimeInfo.compatibleVideoProfile;
                    if (autoValue_EncoderProfilesProxy_VideoProfileProxy != null) {
                        String str2 = resolveVideoMimeInfo.mimeType;
                        str2.getClass();
                        timebase.getClass();
                        videoSpec.getClass();
                        size.getClass();
                        autoValue_EncoderProfilesProxy_VideoProfileProxy.getClass();
                        dynamicRange3.getClass();
                        range.getClass();
                        SubtreeManager subtreeManager = new SubtreeManager();
                        subtreeManager.snapshotCache = str2;
                        subtreeManager.contextForChildren = timebase;
                        subtreeManager.emitActionToParent = videoSpec;
                        subtreeManager.workflowSession = size;
                        subtreeManager.interceptor = autoValue_EncoderProfilesProxy_VideoProfileProxy;
                        subtreeManager.idCounter = dynamicRange3;
                        subtreeManager.children = range;
                        videoEncoderConfigDefaultResolver = subtreeManager;
                    } else {
                        videoEncoderConfigDefaultResolver = new VideoEncoderConfigDefaultResolver(resolveVideoMimeInfo.mimeType, timebase, videoSpec, size, dynamicRange3, range);
                    }
                    Object obj2 = videoEncoderConfigDefaultResolver.get();
                    obj2.getClass();
                    AutoValue_VideoEncoderConfig autoValue_VideoEncoderConfig = (AutoValue_VideoEncoderConfig) obj2;
                    boolean z2 = ((Recorder) setupVideoTask.this$0).mHasGlProcessing;
                    if (Intrinsics.areEqual(autoValue_VideoEncoderConfig.dataSpace, AutoValue_VideoEncoderDataSpace.ENCODER_DATA_SPACE_UNSPECIFIED)) {
                        MediaCodecDefaultDataSpaceQuirk mediaCodecDefaultDataSpaceQuirk = (MediaCodecDefaultDataSpaceQuirk) DeviceQuirks.sQuirks.get(MediaCodecDefaultDataSpaceQuirk.class);
                        if (z2 && mediaCodecDefaultDataSpaceQuirk != null) {
                            AutoValue_VideoEncoderDataSpace autoValue_VideoEncoderDataSpace = AutoValue_VideoEncoderDataSpace.ENCODER_DATA_SPACE_SRGB;
                            StuckPlayerDetector stuckPlayerDetector = new StuckPlayerDetector();
                            stuckPlayerDetector.player = autoValue_VideoEncoderConfig.mimeType;
                            stuckPlayerDetector.playerListener = Integer.valueOf(autoValue_VideoEncoderConfig.profile);
                            stuckPlayerDetector.callback = autoValue_VideoEncoderConfig.inputTimebase;
                            stuckPlayerDetector.clock = autoValue_VideoEncoderConfig.resolution;
                            stuckPlayerDetector.period = Integer.valueOf(autoValue_VideoEncoderConfig.colorFormat);
                            stuckPlayerDetector.handler = autoValue_VideoEncoderConfig.dataSpace;
                            stuckPlayerDetector.stuckBufferingDetector = Integer.valueOf(autoValue_VideoEncoderConfig.captureFrameRate);
                            stuckPlayerDetector.stuckPlayingDetector = Integer.valueOf(autoValue_VideoEncoderConfig.encodeFrameRate);
                            stuckPlayerDetector.stuckPlayingNotEndingDetector = Integer.valueOf(autoValue_VideoEncoderConfig.IFrameInterval);
                            stuckPlayerDetector.stuckSuppressedDetector = Integer.valueOf(autoValue_VideoEncoderConfig.bitrate);
                            stuckPlayerDetector.handler = autoValue_VideoEncoderDataSpace;
                            autoValue_VideoEncoderConfig = stuckPlayerDetector.build();
                        }
                    }
                    AutoValue_VideoEncoderConfig autoValue_VideoEncoderConfig2 = autoValue_VideoEncoderConfig;
                    ((Recorder) setupVideoTask.this$0).mVideoEncoderConfig = autoValue_VideoEncoderConfig2;
                    if (CameraSelector$$ExternalSyntheticOutline0.ordinal(videoEncoderSession2.mVideoEncoderState) != 0) {
                        nonCancellationPropagating = new ImmediateFuture$ImmediateFailedFuture(new IllegalStateException("configure() shouldn't be called in ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$3(videoEncoderSession2.mVideoEncoderState))), 0);
                    } else {
                        videoEncoderSession2.mVideoEncoderState = 2;
                        videoEncoderSession2.mSurfaceRequest = surfaceRequest;
                        StringUtilsKt.d("VideoEncoderSession", "Create VideoEncoderSession: " + videoEncoderSession2);
                        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer3 = new CallbackToFutureAdapter$Completer();
                        callbackToFutureAdapter$Completer3.cancellationFuture = new ResolvableFuture();
                        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer3);
                        callbackToFutureAdapter$Completer3.future = callbackToFutureAdapter$SafeFuture;
                        callbackToFutureAdapter$Completer3.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
                        try {
                            videoEncoderSession2.mReleasedCompleter = callbackToFutureAdapter$Completer3;
                            callbackToFutureAdapter$Completer3.tag = "ReleasedFuture " + videoEncoderSession2;
                        } catch (Exception e3) {
                            callbackToFutureAdapter$SafeFuture.setException(e3);
                        }
                        videoEncoderSession2.mReleasedFuture = callbackToFutureAdapter$SafeFuture;
                        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer4 = new CallbackToFutureAdapter$Completer();
                        callbackToFutureAdapter$Completer4.cancellationFuture = new ResolvableFuture();
                        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture2 = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer4);
                        callbackToFutureAdapter$Completer4.future = callbackToFutureAdapter$SafeFuture2;
                        callbackToFutureAdapter$Completer4.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
                        try {
                            videoEncoderSession2.mReadyToReleaseCompleter = callbackToFutureAdapter$Completer4;
                            callbackToFutureAdapter$Completer4.tag = "ReadyToReleaseFuture " + videoEncoderSession2;
                        } catch (Exception e4) {
                            callbackToFutureAdapter$SafeFuture2.setException(e4);
                        }
                        videoEncoderSession2.mReadyToReleaseFuture = callbackToFutureAdapter$SafeFuture2;
                        CallbackToFutureAdapter$SafeFuture future = DBUtil.getFuture(new PreviewView$1$$ExternalSyntheticLambda2(i, videoEncoderSession2, surfaceRequest, autoValue_VideoEncoderConfig2));
                        Futures.addCallback(future, new BiometricPrompt(videoEncoderSession2, 14), (Executor) videoEncoderSession2.mSequentialExecutor);
                        nonCancellationPropagating = Futures.nonCancellationPropagating(future);
                    }
                    Recorder recorder2 = (Recorder) setupVideoTask.this$0;
                    recorder2.mVideoEncoderSession = videoEncoderSession2;
                    Futures.addCallback(nonCancellationPropagating, new Recorder.AnonymousClass1(setupVideoTask, videoEncoderSession2, z, 11), recorder2.mSequentialExecutor);
                    return;
                }
                StringUtilsKt.w("Recorder", "Ignore the SurfaceRequest " + surfaceRequest + " isServiced: " + surfaceRequest.mSurfaceFuture.delegate.isDone() + " VideoEncoderSession: " + ((Recorder) setupVideoTask.this$0).mVideoEncoderSession + " has been configured with a persistent in-progress recording.");
                return;
            case 12:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f$0;
                SessionConfig.Builder builder = (SessionConfig.Builder) this.f$1;
                VideoCapture.AnonymousClass2 anonymousClass2 = (VideoCapture.AnonymousClass2) this.f$2;
                TransactorKt.checkState("Surface update cancellation should only occur on main thread.", Threads.isMainThread());
                atomicBoolean.set(true);
                ((ArrayList) builder.mCaptureConfigBuilder.currentThread).remove(anonymousClass2);
                builder.mSingleCameraCaptureCallbacks.remove(anonymousClass2);
                return;
            case 13:
                AudioSource audioSource = (AudioSource) this.f$0;
                Executor executor = (Executor) this.f$1;
                Recorder.AnonymousClass4 anonymousClass4 = (Recorder.AnonymousClass4) this.f$2;
                int ordinal2 = CameraSelector$$ExternalSyntheticOutline0.ordinal(audioSource.mState);
                if (ordinal2 == 0) {
                    audioSource.mCallbackExecutor = executor;
                    audioSource.mAudioSourceCallback = anonymousClass4;
                    return;
                } else {
                    if (ordinal2 == 1 || ordinal2 == 2) {
                        a$$ExternalSyntheticBUOutline0.m$1((Object) "The audio recording callback must be registered before the audio source is started.");
                        return;
                    }
                    return;
                }
            case 14:
                BufferedAudioStream bufferedAudioStream = (BufferedAudioStream) this.f$0;
                Recorder.AnonymousClass2 anonymousClass22 = (Recorder.AnonymousClass2) this.f$1;
                SequentialExecutor sequentialExecutor = (SequentialExecutor) this.f$2;
                AudioStreamImpl audioStreamImpl = bufferedAudioStream.mAudioStream;
                TransactorKt.checkState("AudioStream can not be started when setCallback.", !audioStreamImpl.mIsStarted.get());
                audioStreamImpl.checkNotReleasedOrThrow();
                audioStreamImpl.mAudioStreamCallback = anonymousClass22;
                audioStreamImpl.mCallbackExecutor = sequentialExecutor;
                AudioStreamImpl.AudioRecordingApi29Callback audioRecordingApi29Callback = audioStreamImpl.mAudioRecordingCallback;
                if (audioRecordingApi29Callback != null) {
                    audioStreamImpl.mAudioRecord.unregisterAudioRecordingCallback(audioRecordingApi29Callback);
                }
                if (audioStreamImpl.mAudioRecordingCallback == null) {
                    audioStreamImpl.mAudioRecordingCallback = audioStreamImpl.new AudioRecordingApi29Callback();
                }
                audioStreamImpl.mAudioRecord.registerAudioRecordingCallback(sequentialExecutor, audioStreamImpl.mAudioRecordingCallback);
                return;
            case 15:
                ((EncoderCallback) this.f$0).onEncodeError(new EncodeException((String) this.f$2, (Throwable) this.f$1));
                return;
            case 16:
                EncoderImpl encoderImpl = (EncoderImpl) this.f$0;
                ArrayList arrayList2 = (ArrayList) this.f$1;
                Runnable runnable5 = (Runnable) this.f$2;
                if (encoderImpl.mState != 8) {
                    if (!arrayList2.isEmpty()) {
                        StringUtilsKt.d(encoderImpl.mTag, "encoded data and input buffers are returned");
                    }
                    if ((encoderImpl.mEncoderInput instanceof EncoderImpl.SurfaceInput) && !encoderImpl.mSourceStoppedSignalled && DeviceQuirks.sQuirks.get(StopCodecAfterSurfaceRemovalCrashMediaServerQuirk.class) == null) {
                        boolean z3 = encoderImpl.mCodecStopAsFlushWorkaroundEnabled;
                        String str3 = encoderImpl.mTag;
                        if (z3) {
                            StringUtilsKt.d(str3, "mMediaCodec.stop()");
                            encoderImpl.mMediaCodec.stop();
                        } else {
                            StringUtilsKt.d(str3, "mMediaCodec.flush()");
                            encoderImpl.mMediaCodec.flush();
                        }
                        encoderImpl.mIsFlushedAfterEndOfStream = true;
                    } else {
                        StringUtilsKt.d(encoderImpl.mTag, "mMediaCodec.stop()");
                        encoderImpl.mMediaCodec.stop();
                    }
                }
                runnable5.run();
                int i2 = encoderImpl.mState;
                if (i2 == 7) {
                    encoderImpl.releaseInternal();
                    return;
                }
                if (!encoderImpl.mIsFlushedAfterEndOfStream) {
                    encoderImpl.reset();
                }
                encoderImpl.setState(1);
                if (i2 == 5 || i2 == 6) {
                    encoderImpl.start();
                    if (i2 == 6) {
                        encoderImpl.pause();
                        return;
                    }
                    return;
                }
                return;
            case 17:
                EncoderImpl.ByteBufferInput byteBufferInput = (EncoderImpl.ByteBufferInput) this.f$0;
                Observable.Observer observer2 = (Observable.Observer) this.f$1;
                Executor executor2 = (Executor) this.f$2;
                LinkedHashMap linkedHashMap = byteBufferInput.mStateObservers;
                observer2.getClass();
                executor2.getClass();
                linkedHashMap.put(observer2, executor2);
                executor2.execute(new Recorder$$ExternalSyntheticLambda15(18, observer2, byteBufferInput.mBufferProviderState));
                return;
            case 18:
                EncoderImpl.MediaCodecCallback mediaCodecCallback = (EncoderImpl.MediaCodecCallback) this.f$0;
                Executor executor3 = (Executor) this.f$1;
                EncoderCallback encoderCallback = (EncoderCallback) this.f$2;
                EncoderImpl encoderImpl2 = EncoderImpl.this;
                if (encoderImpl2.mState == 8) {
                    return;
                }
                try {
                    Objects.requireNonNull(encoderCallback);
                    executor3.execute(new EncoderImpl$MediaCodecCallback$$ExternalSyntheticLambda4(encoderCallback, 1));
                    return;
                } catch (RejectedExecutionException e5) {
                    StringUtilsKt.e(encoderImpl2.mTag, "Unable to post to the supplied executor.", e5);
                    return;
                }
            case 19:
                SurfaceViewImplementation surfaceViewImplementation = (SurfaceViewImplementation) this.f$0;
                SurfaceRequest surfaceRequest2 = (SurfaceRequest) this.f$1;
                PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = (PreviewView$1$$ExternalSyntheticLambda2) this.f$2;
                SurfaceViewImplementation.SurfaceRequestCallback surfaceRequestCallback = surfaceViewImplementation.mSurfaceRequestCallback;
                surfaceRequestCallback.cancelPreviousRequest();
                if (surfaceRequestCallback.mNeedToInvalidate) {
                    surfaceRequestCallback.mNeedToInvalidate = false;
                    surfaceRequest2.willNotProvideSurface();
                    surfaceRequest2.mSurfaceRecreationCompleter.set(null);
                    return;
                }
                surfaceRequestCallback.mSurfaceRequest = surfaceRequest2;
                surfaceRequestCallback.mOnSurfaceNotInUseListener = previewView$1$$ExternalSyntheticLambda2;
                Size size2 = surfaceRequest2.mResolution;
                surfaceRequestCallback.mTargetSize = size2;
                surfaceRequestCallback.mWasSurfaceProvided = false;
                if (surfaceRequestCallback.tryToComplete()) {
                    return;
                }
                StringUtilsKt.d("SurfaceViewImpl", "Wait for new Surface creation.");
                SurfaceViewImplementation.this.mSurfaceView.getHolder().setFixedSize(size2.getWidth(), size2.getHeight());
                return;
            case 20:
                AndroidTextContextMenuToolbarProvider androidTextContextMenuToolbarProvider = (AndroidTextContextMenuToolbarProvider) this.f$0;
                AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl textActionModeCallbackImpl = (AndroidTextContextMenuToolbarProvider.TextActionModeCallbackImpl) this.f$1;
                AndroidTextContextMenuToolbarProvider.TextContextMenuSessionImpl textContextMenuSessionImpl = (AndroidTextContextMenuToolbarProvider.TextContextMenuSessionImpl) this.f$2;
                ActionMode startActionMode = androidTextContextMenuToolbarProvider.view.startActionMode(new FloatingTextActionModeCallback(textActionModeCallbackImpl), 1);
                Intrinsics.areEqual(androidTextContextMenuToolbarProvider.actionMode, startActionMode);
                if (startActionMode == null) {
                    textContextMenuSessionImpl.close();
                    return;
                }
                return;
            case 21:
                ViewGroup viewGroup = (ViewGroup) this.f$0;
                View view = (View) this.f$1;
                DefaultSpecialEffectsController.AnimationEffect animationEffect = (DefaultSpecialEffectsController.AnimationEffect) this.f$2;
                viewGroup.getClass();
                viewGroup.endViewTransition(view);
                animationEffect.animationInfo.f866operation.completeEffect(animationEffect);
                return;
            case 22:
                SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation = (SpecialEffectsController$FragmentStateManagerOperation) this.f$0;
                SpecialEffectsController$FragmentStateManagerOperation specialEffectsController$FragmentStateManagerOperation2 = (SpecialEffectsController$FragmentStateManagerOperation) this.f$1;
                DefaultSpecialEffectsController.TransitionEffect transitionEffect = (DefaultSpecialEffectsController.TransitionEffect) this.f$2;
                FragmentTransition.callSharedElementStartEnd(specialEffectsController$FragmentStateManagerOperation.fragment, specialEffectsController$FragmentStateManagerOperation2.fragment, transitionEffect.isPop, transitionEffect.lastInViews);
                return;
            case 23:
                MediaPeriodQueue mediaPeriodQueue = (MediaPeriodQueue) this.f$0;
                ImmutableList.Builder builder2 = (ImmutableList.Builder) this.f$1;
                MediaSource$MediaPeriodId mediaSource$MediaPeriodId = (MediaSource$MediaPeriodId) this.f$2;
                DefaultAnalyticsCollector defaultAnalyticsCollector = mediaPeriodQueue.analyticsCollector;
                RegularImmutableList build = builder2.build();
                e0 e0Var = defaultAnalyticsCollector.mediaPeriodQueueTracker;
                Player player = defaultAnalyticsCollector.player;
                player.getClass();
                e0Var.getClass();
                e0Var.b = ImmutableList.copyOf((Collection) build);
                if (!build.isEmpty()) {
                    e0Var.f = (MediaSource$MediaPeriodId) build.get(0);
                    mediaSource$MediaPeriodId.getClass();
                    e0Var.h = mediaSource$MediaPeriodId;
                }
                if (((MediaSource$MediaPeriodId) e0Var.i) == null) {
                    e0Var.i = e0.findCurrentPlayerMediaPeriodInQueue(player, (ImmutableList) e0Var.b, (MediaSource$MediaPeriodId) e0Var.f, (Timeline.Period) e0Var.a);
                }
                e0Var.updateMediaPeriodTimelines(((ExoPlayerImpl) player).getCurrentTimeline());
                return;
            case 24:
                MediaSourceList.ForwardingEventListener forwardingEventListener = (MediaSourceList.ForwardingEventListener) this.f$0;
                Pair pair = (Pair) this.f$1;
                ((DefaultAnalyticsCollector) MediaSourceList.this.eventListener).onDownstreamFormatChanged(((Integer) pair.first).intValue(), (MediaSource$MediaPeriodId) pair.second, (MediaLoadData) this.f$2);
                return;
            case 25:
                CallResult callResult = (CallResult) this.f$0;
                Format format2 = (Format) this.f$1;
                DecoderReuseEvaluation decoderReuseEvaluation = (DecoderReuseEvaluation) this.f$2;
                ExoPlayerImpl.ComponentListener componentListener = (ExoPlayerImpl.ComponentListener) callResult.serviceNames;
                String str4 = Util.DEVICE_DEBUG_INFO;
                DefaultAnalyticsCollector defaultAnalyticsCollector2 = ExoPlayerImpl.this.analyticsCollector;
                AnalyticsListener.EventTime generateReadingMediaPeriodEventTime = defaultAnalyticsCollector2.generateReadingMediaPeriodEventTime();
                defaultAnalyticsCollector2.sendEvent(generateReadingMediaPeriodEventTime, IptcConstants.IMAGE_RESOURCE_BLOCK_BORDER_INFORMATION, new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(generateReadingMediaPeriodEventTime, format2, decoderReuseEvaluation));
                return;
            case 26:
                AudioTrack audioTrack = (AudioTrack) this.f$0;
                Handler handler = (Handler) this.f$1;
                ListenerSet listenerSet = (ListenerSet) this.f$2;
                int i3 = 13;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new AFd1lSDK$$ExternalSyntheticLambda0(listenerSet, i3));
                    }
                    synchronized (AudioTrackAudioOutput.releaseExecutorLock) {
                        try {
                            int i4 = AudioTrackAudioOutput.pendingReleaseCount - 1;
                            AudioTrackAudioOutput.pendingReleaseCount = i4;
                            if (i4 == 0) {
                                ScheduledExecutorService scheduledExecutorService = AudioTrackAudioOutput.releaseExecutor;
                                scheduledExecutorService.getClass();
                                scheduledExecutorService.shutdown();
                                AudioTrackAudioOutput.releaseExecutor = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    if (handler.getLooper().getThread().isAlive()) {
                        handler.post(new AFd1lSDK$$ExternalSyntheticLambda0(listenerSet, i3));
                    }
                    synchronized (AudioTrackAudioOutput.releaseExecutorLock) {
                        try {
                            int i5 = AudioTrackAudioOutput.pendingReleaseCount - 1;
                            AudioTrackAudioOutput.pendingReleaseCount = i5;
                            if (i5 == 0) {
                                ScheduledExecutorService scheduledExecutorService2 = AudioTrackAudioOutput.releaseExecutor;
                                scheduledExecutorService2.getClass();
                                scheduledExecutorService2.shutdown();
                                AudioTrackAudioOutput.releaseExecutor = null;
                            }
                            throw th2;
                        } finally {
                        }
                    }
                }
            case 27:
                PlayerView.SurfaceSyncGroupCompatV34.m1152$r8$lambda$iweixzu_GrrtIiHf3JQWLlY4aE((PlayerView.SurfaceSyncGroupCompatV34) this.f$0, (SurfaceView) this.f$1, (AFd1lSDK$$ExternalSyntheticLambda0) this.f$2);
                return;
            case 28:
                WorkDatabase workDatabase = (WorkDatabase) this.f$0;
                String str5 = (String) this.f$2;
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) this.f$1;
                WorkSpecDao_Impl workSpecDao = workDatabase.workSpecDao();
                workSpecDao.getClass();
                Iterator it2 = ((List) DBUtil.performBlocking(workSpecDao.__db, true, false, new IconKt$$ExternalSyntheticLambda0(str5, 15))).iterator();
                while (it2.hasNext()) {
                    Trace.cancel(workManagerImpl, (String) it2.next());
                }
                return;
            default:
                ChainingListenableFuture chainingListenableFuture = (ChainingListenableFuture) this.f$0;
                TableQrCodeCameraViewFinderManager tableQrCodeCameraViewFinderManager = (TableQrCodeCameraViewFinderManager) this.f$1;
                TableQrCodeCameraViewFinderState tableQrCodeCameraViewFinderState = (TableQrCodeCameraViewFinderState) this.f$2;
                if (chainingListenableFuture.mDelegate.isCancelled()) {
                    return;
                }
                ProcessCameraProvider processCameraProvider = (ProcessCameraProvider) chainingListenableFuture.get();
                processCameraProvider.unbindAll();
                try {
                    TableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1 tableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1 = tableQrCodeCameraViewFinderManager.cameraLifecycleOwner;
                    CameraSelector cameraSelector = CameraSelector.DEFAULT_BACK_CAMERA;
                    cameraSelector.getClass();
                    LifecycleCamera bindToLifecycle = processCameraProvider.bindToLifecycle(tableQrCodeCameraViewFinderManager$cameraLifecycleOwner$1, cameraSelector, tableQrCodeCameraViewFinderManager.preview, tableQrCodeCameraViewFinderManager.imageAnalysis);
                    tableQrCodeCameraViewFinderState.flashAvailable$delegate.setValue(Boolean.valueOf(((AdapterCameraInfo) bindToLifecycle.getCameraInfo()).mCameraInfo.hasFlashUnit()));
                    lifecycleCamera = bindToLifecycle;
                } catch (IllegalArgumentException e6) {
                    Timber.Forest.e("Failed to bind table QR camera view finder", new Object[0], e6);
                    tableQrCodeCameraViewFinderState.cameraAvailable$delegate.setValue(Boolean.FALSE);
                }
                tableQrCodeCameraViewFinderManager.camera = lifecycleCamera;
                return;
        }
    }

    public /* synthetic */ AFd1wSDK$$ExternalSyntheticLambda2(CameraCaptureCallback cameraCaptureCallback, CameraCallbackMap cameraCallbackMap, RequestMetadata requestMetadata, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraCaptureCallback;
        this.f$1 = requestMetadata;
        this.f$2 = obj;
    }

    public /* synthetic */ AFd1wSDK$$ExternalSyntheticLambda2(DefaultSurfaceProcessor defaultSurfaceProcessor, DynamicRange dynamicRange, CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        this.$r8$classId = 6;
        Map map = Collections.EMPTY_MAP;
        this.f$0 = defaultSurfaceProcessor;
        this.f$1 = dynamicRange;
        this.f$2 = callbackToFutureAdapter$Completer;
    }

    public /* synthetic */ AFd1wSDK$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ AFd1wSDK$$ExternalSyntheticLambda2(EncoderCallback encoderCallback, int i, String str, Throwable th) {
        this.$r8$classId = 15;
        this.f$0 = encoderCallback;
        this.f$2 = str;
        this.f$1 = th;
    }

    public /* synthetic */ AFd1wSDK$$ExternalSyntheticLambda2(WorkDatabase workDatabase, String str, WorkManagerImpl workManagerImpl) {
        this.$r8$classId = 28;
        this.f$0 = workDatabase;
        this.f$2 = str;
        this.f$1 = workManagerImpl;
    }

    public /* synthetic */ AFd1wSDK$$ExternalSyntheticLambda2(Throwable th, AbstractCameraPresenceSource$ObserverWrapper abstractCameraPresenceSource$ObserverWrapper, List list) {
        this.$r8$classId = 4;
        this.f$1 = th;
        this.f$0 = abstractCameraPresenceSource$ObserverWrapper;
        this.f$2 = list;
    }
}
