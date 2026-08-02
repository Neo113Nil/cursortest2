package androidx.camera.video;

import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import androidx.camera.camera2.interop.CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0;
import androidx.camera.core.AutoValue_SurfaceOutput_Event;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.core.LegacySessionConfig;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.camera.core.SessionConfig$$ExternalSyntheticLambda0;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.featuregroup.impl.ResolvedFeatureGroup;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.executor.HandlerScheduledExecutorService;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.OpenGlRenderer;
import androidx.camera.core.processing.SurfaceOutputImpl;
import androidx.camera.core.processing.concurrent.DualOpenGlRenderer;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.util.GLUtils;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.internal.BufferProvider$State;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.audio.AudioSourceAccessException;
import androidx.camera.video.internal.audio.BufferedAudioStream;
import androidx.camera.video.internal.audio.BufferedAudioStream$$ExternalSyntheticLambda0;
import androidx.camera.video.internal.encoder.EncodedDataImpl;
import androidx.camera.video.internal.encoder.EncoderCallback;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.view.PreviewView;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.camera.view.TextureViewImplementation;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.constraintlayout.motion.widget.ViewTransition;
import androidx.core.util.Consumer;
import androidx.core.view.DisplayCompat;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.work.impl.WorkLauncherImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Ref$ObjectRef;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class Recorder$$ExternalSyntheticLambda15 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ Recorder$$ExternalSyntheticLambda15(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EncoderCallback encoderCallback;
        Executor executor;
        int i = 2;
        int i2 = 3;
        switch (this.$r8$classId) {
            case 0:
                ((Executor) this.f$0).execute((Runnable) this.f$1);
                return;
            case 1:
                DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) this.f$0;
                SurfaceOutputImpl surfaceOutputImpl = (SurfaceOutputImpl) this.f$1;
                Surface surface = surfaceOutputImpl.getSurface(defaultSurfaceProcessor.mGlExecutor, new Recorder$$ExternalSyntheticLambda12(i, defaultSurfaceProcessor, surfaceOutputImpl));
                defaultSurfaceProcessor.mGlRenderer.registerOutputSurface(surface);
                defaultSurfaceProcessor.mOutputSurfaces.put(surfaceOutputImpl, surface);
                return;
            case 2:
                final DefaultSurfaceProcessor defaultSurfaceProcessor2 = (DefaultSurfaceProcessor) this.f$0;
                final SurfaceRequest surfaceRequest = (SurfaceRequest) this.f$1;
                defaultSurfaceProcessor2.mInputSurfaceCount++;
                OpenGlRenderer openGlRenderer = defaultSurfaceProcessor2.mGlRenderer;
                GLUtils.checkInitializedOrThrow((AtomicBoolean) openGlRenderer.mInitialized, true);
                GLUtils.checkGlThreadOrThrow((Thread) openGlRenderer.mGlThread);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(openGlRenderer.mExternalTextureId);
                Size size = surfaceRequest.mResolution;
                surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                final Surface surface2 = new Surface(surfaceTexture);
                HandlerScheduledExecutorService handlerScheduledExecutorService = defaultSurfaceProcessor2.mGlExecutor;
                surfaceRequest.setTransformationInfoListener(handlerScheduledExecutorService, new CaptureRequestOptions$Builder$Companion$$ExternalSyntheticLambda0(4, defaultSurfaceProcessor2, surfaceRequest));
                surfaceRequest.provideSurface(surface2, handlerScheduledExecutorService, new Consumer() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda9
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        DefaultSurfaceProcessor defaultSurfaceProcessor3 = DefaultSurfaceProcessor.this;
                        SurfaceRequest surfaceRequest2 = surfaceRequest;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        Surface surface3 = surface2;
                        synchronized (surfaceRequest2.mLock) {
                            surfaceRequest2.mTransformationInfoListener = null;
                            surfaceRequest2.mTransformationInfoExecutor = null;
                        }
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface3.release();
                        defaultSurfaceProcessor3.mInputSurfaceCount--;
                        defaultSurfaceProcessor3.checkReadyToRelease();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(defaultSurfaceProcessor2, defaultSurfaceProcessor2.mGlHandler);
                return;
            case 3:
                ((Consumer) ((AtomicReference) this.f$1).get()).accept(new AutoValue_SurfaceOutput_Event((SurfaceOutputImpl) this.f$0));
                return;
            case 4:
                final DualSurfaceProcessor dualSurfaceProcessor = (DualSurfaceProcessor) this.f$0;
                SurfaceRequest surfaceRequest2 = (SurfaceRequest) this.f$1;
                dualSurfaceProcessor.mInputSurfaceCount++;
                DualOpenGlRenderer dualOpenGlRenderer = dualSurfaceProcessor.mGlRenderer;
                boolean z = surfaceRequest2.mIsPrimary;
                Size size2 = surfaceRequest2.mResolution;
                GLUtils.checkInitializedOrThrow((AtomicBoolean) dualOpenGlRenderer.mInitialized, true);
                GLUtils.checkGlThreadOrThrow((Thread) dualOpenGlRenderer.mGlThread);
                final SurfaceTexture surfaceTexture2 = new SurfaceTexture(z ? dualOpenGlRenderer.mPrimaryExternalTextureId : dualOpenGlRenderer.mSecondaryExternalTextureId);
                surfaceTexture2.setDefaultBufferSize(size2.getWidth(), size2.getHeight());
                final Surface surface3 = new Surface(surfaceTexture2);
                surfaceRequest2.provideSurface(surface3, dualSurfaceProcessor.mGlExecutor, new Consumer() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$ExternalSyntheticLambda6
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        SurfaceTexture surfaceTexture3 = surfaceTexture2;
                        surfaceTexture3.setOnFrameAvailableListener(null);
                        surfaceTexture3.release();
                        surface3.release();
                        r1.mInputSurfaceCount--;
                        DualSurfaceProcessor.this.checkReadyToRelease$1();
                    }
                });
                if (z) {
                    dualSurfaceProcessor.mPrimarySurfaceTexture = surfaceTexture2;
                    return;
                } else {
                    dualSurfaceProcessor.mSecondarySurfaceTexture = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(dualSurfaceProcessor, dualSurfaceProcessor.mGlHandler);
                    return;
                }
            case 5:
                DualSurfaceProcessor dualSurfaceProcessor2 = (DualSurfaceProcessor) this.f$0;
                SurfaceOutputImpl surfaceOutputImpl2 = (SurfaceOutputImpl) this.f$1;
                Surface surface4 = surfaceOutputImpl2.getSurface(dualSurfaceProcessor2.mGlExecutor, new Recorder$$ExternalSyntheticLambda12(i2, dualSurfaceProcessor2, surfaceOutputImpl2));
                dualSurfaceProcessor2.mGlRenderer.registerOutputSurface(surface4);
                dualSurfaceProcessor2.mOutputSurfaces.put(surfaceOutputImpl2, surface4);
                return;
            case 6:
                ResolvedFeatureGroup resolvedFeatureGroup = (ResolvedFeatureGroup) this.f$0;
                LegacySessionConfig legacySessionConfig = (LegacySessionConfig) this.f$1;
                HashSet hashSet = new HashSet();
                if (resolvedFeatureGroup != null) {
                    hashSet.addAll(resolvedFeatureGroup.features);
                }
                ((SessionConfig$$ExternalSyntheticLambda0) legacySessionConfig.featureSelectionListener).getClass();
                return;
            case 7:
                ((AutoValue_Recorder_RecordingRecord) this.f$0).getEventListener.accept((VideoRecordEvent) this.f$1);
                return;
            case 8:
                VideoCapture videoCapture = (VideoCapture) this.f$0;
                if (((DeferrableSurface) this.f$1) == videoCapture.mDeferrableSurface) {
                    videoCapture.clearPipeline$4();
                    return;
                }
                return;
            case 9:
                VideoCapture.AnonymousClass2 anonymousClass2 = (VideoCapture.AnonymousClass2) this.f$0;
                SessionConfig.Builder builder = (SessionConfig.Builder) this.f$1;
                ((ArrayList) builder.mCaptureConfigBuilder.currentThread).remove(anonymousClass2);
                builder.mSingleCameraCaptureCallbacks.remove(anonymousClass2);
                return;
            case 10:
                AudioSource audioSource = (AudioSource) this.f$0;
                EncoderImpl.ByteBufferInput byteBufferInput = (EncoderImpl.ByteBufferInput) this.f$1;
                int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(audioSource.mState);
                if (ordinal == 0 || ordinal == 1) {
                    if (audioSource.mBufferProvider != byteBufferInput) {
                        audioSource.resetBufferProvider(byteBufferInput);
                        return;
                    }
                    return;
                } else {
                    if (ordinal != 2) {
                        return;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1((Object) "AudioSource is released");
                    return;
                }
            case 11:
                AudioSource audioSource2 = (AudioSource) this.f$0;
                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = (CallbackToFutureAdapter$Completer) this.f$1;
                audioSource2.getClass();
                try {
                    int ordinal2 = CameraSelector$$ExternalSyntheticOutline0.ordinal(audioSource2.mState);
                    if (ordinal2 == 0 || ordinal2 == 1) {
                        audioSource2.resetBufferProvider(null);
                        ((AtomicBoolean) audioSource2.mSilentAudioStream.zzc).getAndSet(true);
                        BufferedAudioStream bufferedAudioStream = audioSource2.mAudioStream;
                        if (!bufferedAudioStream.mIsReleased.getAndSet(true)) {
                            bufferedAudioStream.mProducerExecutor.execute(new BufferedAudioStream$$ExternalSyntheticLambda0(bufferedAudioStream, i2));
                        }
                        audioSource2.stopSendingAudio();
                        audioSource2.setState(3);
                    }
                    callbackToFutureAdapter$Completer.set(null);
                    return;
                } catch (Throwable th) {
                    callbackToFutureAdapter$Completer.setException(th);
                    return;
                }
            case 12:
                ((Recorder) ((Recorder.AnonymousClass4) this.f$1).this$0).mAudioAmplitude = ((AudioSource) this.f$0).mAudioAmplitude;
                return;
            case 13:
                Recorder.AnonymousClass4 anonymousClass4 = (Recorder.AnonymousClass4) this.f$0;
                Throwable th2 = (Throwable) this.f$1;
                anonymousClass4.getClass();
                StringUtilsKt.e("Recorder", "Error occurred after audio source started.", th2);
                if (th2 instanceof AudioSourceAccessException) {
                    ((Recorder$$ExternalSyntheticLambda12) anonymousClass4.val$audioErrorConsumer).accept(th2);
                    return;
                }
                return;
            case 14:
                Executor executor2 = (Executor) this.f$0;
                EncoderImpl.MediaCodecCallback mediaCodecCallback = (EncoderImpl.MediaCodecCallback) this.f$1;
                Objects.requireNonNull(mediaCodecCallback);
                executor2.execute(new Preview$$ExternalSyntheticLambda0(mediaCodecCallback, 25));
                return;
            case 15:
                ((EncoderImpl) this.f$0).mAcquisitionQueue.remove((CallbackToFutureAdapter$Completer) this.f$1);
                return;
            case 16:
                ((EncoderImpl) this.f$0).mInputBufferSet.remove((EncoderImpl.AnonymousClass2) this.f$1);
                return;
            case 17:
                ((Observable.Observer) ((Map.Entry) this.f$0).getKey()).onNewData((BufferProvider$State) this.f$1);
                return;
            case 18:
                ((Observable.Observer) this.f$0).onNewData((BufferProvider$State) this.f$1);
                return;
            case 19:
                EncoderImpl.ByteBufferInput byteBufferInput2 = (EncoderImpl.ByteBufferInput) this.f$0;
                Observable.Observer observer = (Observable.Observer) this.f$1;
                LinkedHashMap linkedHashMap = byteBufferInput2.mStateObservers;
                observer.getClass();
                linkedHashMap.remove(observer);
                return;
            case 20:
                EncoderImpl.MediaCodecCallback mediaCodecCallback2 = (EncoderImpl.MediaCodecCallback) this.f$0;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.f$1;
                EncoderImpl encoderImpl = EncoderImpl.this;
                switch (CameraSelector$$ExternalSyntheticOutline0.ordinal(encoderImpl.mState)) {
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
                        encoderImpl.handleEncodeError(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("Unknown state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$6(encoderImpl.mState)));
                        return;
                }
            case 21:
                EncoderImpl.MediaCodecCallback mediaCodecCallback3 = (EncoderImpl.MediaCodecCallback) this.f$0;
                MediaFormat mediaFormat = (MediaFormat) this.f$1;
                boolean z2 = mediaCodecCallback3.mStopped;
                EncoderImpl encoderImpl2 = EncoderImpl.this;
                if (z2) {
                    StringUtilsKt.w(encoderImpl2.mTag, "Receives onOutputFormatChanged after codec is reset.");
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
                            EncoderImpl encoderImpl3 = EncoderImpl.this;
                            encoderCallback = encoderImpl3.mEncoderCallback;
                            executor = encoderImpl3.mEncoderCallbackExecutor;
                        }
                        try {
                            executor.execute(new Recorder$$ExternalSyntheticLambda15(22, encoderCallback, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e) {
                            StringUtilsKt.e(EncoderImpl.this.mTag, "Unable to post to the supplied executor.", e);
                            return;
                        }
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("Unknown state: ".concat(Recorder$$ExternalSyntheticOutline1.stringValueOf$6(EncoderImpl.this.mState)));
                        return;
                }
            case 22:
                ((EncoderCallback) this.f$0).onOutputConfigUpdate(new StreamSharing$$ExternalSyntheticLambda1((MediaFormat) this.f$1, 16));
                return;
            case 23:
                ((EncoderCallback) this.f$0).onEncodedData((EncodedDataImpl) this.f$1);
                return;
            case 24:
                ((PreviewView) ((PreviewView.AnonymousClass1) this.f$0).this$0).mSurfaceProvider.onSurfaceRequested((SurfaceRequest) this.f$1);
                return;
            case 25:
                TextureViewImplementation textureViewImplementation = (TextureViewImplementation) this.f$0;
                SurfaceRequest surfaceRequest3 = (SurfaceRequest) this.f$1;
                SurfaceRequest surfaceRequest4 = textureViewImplementation.mSurfaceRequest;
                if (surfaceRequest4 != null && surfaceRequest4 == surfaceRequest3) {
                    textureViewImplementation.mSurfaceRequest = null;
                    textureViewImplementation.mSurfaceReleaseFuture = null;
                }
                PreviewView$1$$ExternalSyntheticLambda2 previewView$1$$ExternalSyntheticLambda2 = textureViewImplementation.mOnSurfaceNotInUseListener;
                if (previewView$1$$ExternalSyntheticLambda2 != null) {
                    previewView$1$$ExternalSyntheticLambda2.onSurfaceNotInUse();
                    textureViewImplementation.mOnSurfaceNotInUseListener = null;
                    return;
                }
                return;
            case 26:
                DisplayCompat.doTranslation((AndroidContentCaptureManager) this.f$0, (LongSparseArray) this.f$1);
                return;
            case 27:
                ViewTransition viewTransition = (ViewTransition) this.f$0;
                View[] viewArr = (View[]) this.f$1;
                if (viewTransition.mSetsTag != -1) {
                    for (View view : viewArr) {
                        view.setTag(viewTransition.mSetsTag, Long.valueOf(System.nanoTime()));
                    }
                }
                if (viewTransition.mClearsTag != -1) {
                    for (View view2 : viewArr) {
                        view2.setTag(viewTransition.mClearsTag, null);
                    }
                    return;
                }
                return;
            case 28:
                MemoryCacheService memoryCacheService = (MemoryCacheService) this.f$0;
                MainActivity$$ExternalSyntheticLambda3 mainActivity$$ExternalSyntheticLambda3 = (MainActivity$$ExternalSyntheticLambda3) this.f$1;
                ((WorkLauncherImpl) memoryCacheService.imageLoader).getSplashScreenView().bringToFront();
                mainActivity$$ExternalSyntheticLambda3.onSplashScreenExit(memoryCacheService);
                return;
            default:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0((CredentialManagerCallback) this.f$0, (Ref$ObjectRef) this.f$1);
                return;
        }
    }
}
