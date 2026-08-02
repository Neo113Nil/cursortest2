package androidx.camera.core;

import android.os.HandlerThread;
import android.view.ActionMode;
import androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl;
import androidx.camera.camera2.pipe.compat.Camera2DeviceCache;
import androidx.camera.camera2.pipe.internal.CameraBackendsImpl;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.imagecapture.ProcessingRequest;
import androidx.camera.core.imagecapture.RequestWithCallback;
import androidx.camera.core.impl.CameraPresenceProvider;
import androidx.camera.core.impl.Timebase;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.camera.core.processing.SurfaceEdge;
import androidx.camera.core.processing.SurfaceOutputImpl;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.streamsharing.StreamSharing$$ExternalSyntheticLambda1;
import androidx.camera.lifecycle.AutoValue_LifecycleCameraRepository_Key;
import androidx.camera.lifecycle.LifecycleCamera;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoEncoderSession;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.material.ripple.UnprojectedRipple;
import androidx.compose.material3.ThumbNode$onAttach$1;
import androidx.compose.runtime.ProduceStateScope;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.emoji2.text.MetadataRepo;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.fillr.e0;
import com.nimbusds.jose.JWECryptoParts;
import com.stripe.hcaptcha.HCaptcha;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.JobKt;
import net.oneformapp.helper.CalendarConverter;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class Preview$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Preview$$ExternalSyntheticLambda0(CameraPresenceProvider.ListenerWrapper listenerWrapper, Set set) {
        this.$r8$classId = 11;
        this.f$0 = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Continuation continuation = null;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((Preview) obj).notifyReset();
                return;
            case 1:
                super/*android.app.Dialog*/.onBackPressed();
                return;
            case 2:
                JobKt.cancel(((AudioRestrictionControllerImpl) obj).scope, (CancellationException) null);
                return;
            case 3:
                JobKt.cancel(((Camera2DeviceCache) obj).scope, (CancellationException) null);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) obj;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ExecutorService) it.next()).shutdownNow();
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ExecutorService) it2.next()).awaitTermination(1L, TimeUnit.SECONDS);
                }
                return;
            case 5:
                HandlerThread handlerThread = (HandlerThread) obj;
                handlerThread.quit();
                handlerThread.join(1000L);
                return;
            case 6:
                ExecutorService executorService = (ExecutorService) obj;
                executorService.shutdownNow();
                executorService.awaitTermination(1L, TimeUnit.SECONDS);
                return;
            case 7:
                JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new ThumbNode$onAttach$1((CameraBackendsImpl) obj, continuation, 13));
                return;
            case 8:
                JobKt.cancel((ProduceStateScope) obj, (CancellationException) null);
                return;
            case 9:
                ImageAnalysisNonBlockingAnalyzer imageAnalysisNonBlockingAnalyzer = (ImageAnalysisNonBlockingAnalyzer) obj;
                synchronized (imageAnalysisNonBlockingAnalyzer.mLock) {
                    try {
                        imageAnalysisNonBlockingAnalyzer.mPostedImage = null;
                        ImageProxy imageProxy = imageAnalysisNonBlockingAnalyzer.mCachedImage;
                        if (imageProxy != null) {
                            imageAnalysisNonBlockingAnalyzer.mCachedImage = null;
                            imageAnalysisNonBlockingAnalyzer.onValidImageAvailable(imageProxy);
                        }
                    } finally {
                    }
                }
                return;
            case 10:
                ProcessingRequest processingRequest = (ProcessingRequest) ((e0) ((MetadataImageReader.AnonymousClass1) obj).this$0).a;
                if (processingRequest != null) {
                    StringUtilsKt.d("ProcessingRequest", "onCaptureStarted: request ID = " + processingRequest.mRequestId);
                    RequestWithCallback requestWithCallback = processingRequest.mCallback;
                    Threads.checkMainThread();
                    if (requestWithCallback.mIsAborted || requestWithCallback.mIsStarted) {
                        return;
                    }
                    requestWithCallback.mIsStarted = true;
                    return;
                }
                return;
            case 11:
                ((Set) obj).getClass();
                return;
            case 12:
                ((CallbackToFutureAdapter$Completer) obj).setException(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                return;
            case 13:
                ((SurfaceOutputImpl) obj).close();
                return;
            case 14:
                DefaultSurfaceProcessor defaultSurfaceProcessor = (DefaultSurfaceProcessor) obj;
                defaultSurfaceProcessor.mIsReleased = true;
                defaultSurfaceProcessor.checkReadyToRelease();
                return;
            case 15:
                CalendarConverter.AnonymousClass1 anonymousClass1 = (CalendarConverter.AnonymousClass1) ((MetadataRepo) obj).mRootNode;
                if (anonymousClass1 != null) {
                    Iterator it3 = anonymousClass1.values().iterator();
                    while (it3.hasNext()) {
                        ((SurfaceEdge) it3.next()).close();
                    }
                    return;
                }
                return;
            case 16:
                DualSurfaceProcessor dualSurfaceProcessor = (DualSurfaceProcessor) obj;
                dualSurfaceProcessor.mIsReleased = true;
                dualSurfaceProcessor.checkReadyToRelease$1();
                return;
            case 17:
                CalendarConverter.AnonymousClass1 anonymousClass12 = (CalendarConverter.AnonymousClass1) ((JWECryptoParts) obj).cipherText;
                if (anonymousClass12 != null) {
                    Iterator it4 = anonymousClass12.values().iterator();
                    while (it4.hasNext()) {
                        ((SurfaceEdge) it4.next()).close();
                    }
                    return;
                }
                return;
            case 18:
                HCaptcha hCaptcha = (HCaptcha) obj;
                if (((CameraX) hCaptcha.onFailureListeners) != null) {
                    hCaptcha.unbindAll();
                    LifecycleCameraRepository lifecycleCameraRepository = (LifecycleCameraRepository) hCaptcha.onOpenListeners;
                    lifecycleCameraRepository.getClass();
                    Set<AutoValue_LifecycleCameraRepository_Key> set = (HashSet) hCaptcha.captchaVerifier;
                    synchronized (lifecycleCameraRepository.mLock) {
                        if (set == null) {
                            try {
                                set = lifecycleCameraRepository.mCameraMap.keySet();
                            } finally {
                            }
                        }
                        for (AutoValue_LifecycleCameraRepository_Key autoValue_LifecycleCameraRepository_Key : set) {
                            if (lifecycleCameraRepository.mCameraMap.containsKey(autoValue_LifecycleCameraRepository_Key)) {
                                lifecycleCameraRepository.unregisterCamera((LifecycleCamera) lifecycleCameraRepository.mCameraMap.get(autoValue_LifecycleCameraRepository_Key));
                            }
                        }
                    }
                    return;
                }
                return;
            case 19:
                Recorder.SetupVideoTask setupVideoTask = (Recorder.SetupVideoTask) ((Recorder.AnonymousClass1) obj).this$0;
                if (setupVideoTask.mIsFailedRetryCanceled) {
                    return;
                }
                StringUtilsKt.d("Recorder", "Retry setupVideo #" + setupVideoTask.mRetryCount);
                SurfaceRequest surfaceRequest = (SurfaceRequest) setupVideoTask.mSurfaceRequest;
                Timebase timebase = (Timebase) setupVideoTask.mTimebase;
                Recorder recorder = (Recorder) setupVideoTask.this$0;
                recorder.safeToCloseVideoEncoder().addListener(new AFd1wSDK$$ExternalSyntheticLambda2(11, setupVideoTask, surfaceRequest, timebase), recorder.mSequentialExecutor);
                return;
            case 20:
                ((VideoCapture) obj).notifyReset();
                return;
            case 21:
                ((CallbackToFutureAdapter$Completer) ((VideoEncoderSession) obj).mReleasedCompleter).set(null);
                return;
            case 22:
                AudioSource audioSource = (AudioSource) obj;
                int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(audioSource.mState);
                if (ordinal == 1) {
                    audioSource.setState(1);
                    audioSource.updateSendingAudio();
                    return;
                } else {
                    if (ordinal != 2) {
                        return;
                    }
                    StringUtilsKt.w("AudioSource", "AudioSource is released. Calling stop() is a no-op.");
                    return;
                }
            case 23:
                ((Recorder.AnonymousClass4) obj).getClass();
                return;
            case 24:
                AudioSource audioSource2 = ((Recorder.AnonymousClass2) obj).val$audioSource;
                audioSource2.mAudioStreamSilenced = true;
                if (audioSource2.mState == 2) {
                    audioSource2.notifySilenced();
                    return;
                }
                return;
            case 25:
                ((EncoderImpl.MediaCodecCallback) obj).reachEndData();
                return;
            case 26:
                ((StreamSharing$$ExternalSyntheticLambda1) obj).onCompleted();
                return;
            case 27:
                ((PreviewView$1$$ExternalSyntheticLambda2) obj).onSurfaceNotInUse();
                return;
            case 28:
                ActionMode actionMode = ((AndroidTextContextMenuToolbarProvider) obj).actionMode;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            default:
                RippleHostView rippleHostView = (RippleHostView) obj;
                UnprojectedRipple unprojectedRipple = rippleHostView.ripple;
                if (unprojectedRipple != null) {
                    unprojectedRipple.setState(RippleHostView.RestingState);
                }
                rippleHostView.resetRippleRunnable = null;
                return;
        }
    }

    public /* synthetic */ Preview$$ExternalSyntheticLambda0(Recorder.AnonymousClass4 anonymousClass4, boolean z) {
        this.$r8$classId = 23;
        this.f$0 = anonymousClass4;
    }

    public /* synthetic */ Preview$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }
}
