package androidx.camera.core.streamsharing;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.Toolbar;
import androidx.arch.core.util.Function;
import androidx.camera.camera2.adapter.ZslControlImpl;
import androidx.camera.core.AutoValue_SurfaceRequest_TransformationInfo;
import androidx.camera.core.CameraX;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.RotationProvider;
import androidx.camera.core.SettableImageProxy;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.imagecapture.AutoValue_TakePictureManager_CaptureError;
import androidx.camera.core.imagecapture.ProcessingRequest;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.CameraRepository;
import androidx.camera.core.impl.ImageReaderProxy;
import androidx.camera.core.impl.MutableTagBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.ImmediateFuture$ImmediateFailedFuture;
import androidx.camera.core.internal.ScreenFlashWrapper;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.camera.view.PreviewView;
import androidx.collection.ObjectList$$ExternalSyntheticLambda0;
import androidx.compose.foundation.layout.Arrangement$SpacingAlignmentCalculator;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$Resolver;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.constraintlayout.compose.State;
import androidx.core.graphics.Insets;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener;
import androidx.core.view.insets.ProtectionGroup;
import androidx.core.view.insets.SystemBarStateMonitor;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda13;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Player;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.util.ListenerSet;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import bo.app.n3$$ExternalSyntheticLambda0;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabp;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlowImpl;
import utils.StringUtilsKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class StreamSharing$$ExternalSyntheticLambda1 implements CallbackToFutureAdapter$Resolver, ImageReaderProxy.OnImageAvailableListener, SurfaceRequest.TransformationInfoListener, ImageAnalysis.Analyzer, AsyncFunction, Function, Arrangement$SpacingAlignmentCalculator, InputConnectionCompat$OnCommitContentListener, OnApplyWindowInsetsListener, OnSuccessListener, ListenerSet.Event {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ StreamSharing$$ExternalSyntheticLambda1(VideoCapture videoCapture, SessionConfig.Builder builder) {
        this.$r8$classId = 14;
        this.f$0 = builder;
    }

    @Override // androidx.compose.foundation.layout.Arrangement$SpacingAlignmentCalculator
    public int align(int i, LayoutDirection layoutDirection) {
        int i2 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i2) {
            case 17:
                return ((BiasAlignment.Vertical) obj).align(0, i);
            default:
                return ((BiasAlignment.Horizontal) obj).align(0, i, layoutDirection);
        }
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(SettableImageProxy settableImageProxy) {
        ((ImageAnalysis.Analyzer) this.f$0).analyze(settableImageProxy);
    }

    @Override // androidx.arch.core.util.Function
    /* renamed from: apply, reason: collision with other method in class */
    public Object mo103apply(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 12:
                return (Void) ((MenuKt$$ExternalSyntheticLambda0) obj2).invoke(obj);
            default:
                return Long.valueOf(((EncoderImpl) obj2).toPresentationTimeUsByCaptureEncodeRatio(((Long) obj).longValue()));
        }
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter$Resolver
    public Object attachCompleter(final CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer) {
        ListenableFuture listenableFuture;
        int i = this.$r8$classId;
        int i2 = 0;
        Object obj = this.f$0;
        switch (i) {
            case 1:
                ((JobSupport) obj).invokeOnCompletion(new ObjectList$$ExternalSyntheticLambda0(callbackToFutureAdapter$Completer, 1));
                return "Job.asListenableFuture";
            case 5:
                CameraX cameraX = (CameraX) obj;
                cameraX.mCameraPresenceProvider.shutdown();
                if (cameraX.mRotationProvider.isInitialized()) {
                    RotationProvider rotationProvider = (RotationProvider) cameraX.mRotationProvider.getValue();
                    synchronized (rotationProvider.lock) {
                        rotationProvider.orientationListener.disable();
                        rotationProvider.listeners.clear();
                        rotationProvider.rotation = -1;
                    }
                }
                CameraRepository cameraRepository = cameraX.mCameraRepository;
                synchronized (cameraRepository.mCamerasLock) {
                    try {
                        boolean isEmpty = cameraRepository.mCameras.isEmpty();
                        ListenableFuture listenableFuture2 = cameraRepository.mDeinitFuture;
                        ListenableFuture listenableFuture3 = listenableFuture2;
                        ListenableFuture listenableFuture4 = listenableFuture2;
                        if (!isEmpty) {
                            if (listenableFuture2 == null) {
                                CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = new CallbackToFutureAdapter$Completer();
                                callbackToFutureAdapter$Completer2.cancellationFuture = new ResolvableFuture();
                                CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer2);
                                callbackToFutureAdapter$Completer2.future = callbackToFutureAdapter$SafeFuture;
                                callbackToFutureAdapter$Completer2.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
                                try {
                                    synchronized (cameraRepository.mCamerasLock) {
                                        cameraRepository.mDeinitCompleter = callbackToFutureAdapter$Completer2;
                                    }
                                    callbackToFutureAdapter$Completer2.tag = "CameraRepository-deinit";
                                } catch (Exception e) {
                                    callbackToFutureAdapter$SafeFuture.setException(e);
                                }
                                cameraRepository.mDeinitFuture = callbackToFutureAdapter$SafeFuture;
                                listenableFuture4 = callbackToFutureAdapter$SafeFuture;
                            }
                            cameraRepository.mReleasingCameras.addAll(cameraRepository.mCameras.values());
                            for (CameraInternal cameraInternal : cameraRepository.mCameras.values()) {
                                cameraInternal.release().addListener(new CameraX$$ExternalSyntheticLambda2(22, cameraRepository, cameraInternal), zzabp.directExecutor());
                            }
                            cameraRepository.mCameras.clear();
                            listenableFuture = listenableFuture4;
                        } else if (listenableFuture2 == null) {
                            listenableFuture3 = ImmediateFuture$ImmediateFailedFuture.NULL_FUTURE;
                        }
                    } finally {
                    }
                }
                listenableFuture.addListener(new CameraX$$ExternalSyntheticLambda2(i2, cameraX, callbackToFutureAdapter$Completer), cameraX.mCameraExecutor);
                return "CameraX shutdownInternal";
            case 9:
                Recorder.AnonymousClass3 anonymousClass3 = (Recorder.AnonymousClass3) obj;
                zzabp.mainThreadExecutor().execute(new CameraX$$ExternalSyntheticLambda2(26, anonymousClass3, callbackToFutureAdapter$Completer));
                return anonymousClass3 + " [fetch@" + SystemClock.uptimeMillis() + "]";
            default:
                final SessionConfig.Builder builder = (SessionConfig.Builder) obj;
                ((MutableTagBundle) builder.mCaptureConfigBuilder.threadAttrs).mTagMap.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(callbackToFutureAdapter$Completer.hashCode()));
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                CameraCaptureCallback cameraCaptureCallback = new CameraCaptureCallback() { // from class: androidx.camera.video.VideoCapture.2
                    public boolean mIsFirstCaptureResult = true;

                    @Override // androidx.camera.core.impl.CameraCaptureCallback
                    public final void onCaptureCompleted(int i3, CameraCaptureResult cameraCaptureResult) {
                        Object obj2;
                        if (this.mIsFirstCaptureResult) {
                            this.mIsFirstCaptureResult = false;
                            StringUtilsKt.d("VideoCapture", "cameraCaptureResult timestampNs = " + cameraCaptureResult.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
                        }
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        if (atomicBoolean2.get() || (obj2 = cameraCaptureResult.getTagBundle().mTagMap.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
                            return;
                        }
                        int intValue = ((Integer) obj2).intValue();
                        CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer3 = callbackToFutureAdapter$Completer;
                        if (intValue == callbackToFutureAdapter$Completer3.hashCode() && callbackToFutureAdapter$Completer3.set(null) && !atomicBoolean2.getAndSet(true)) {
                            zzabp.mainThreadExecutor().execute(new Recorder$$ExternalSyntheticLambda15(9, this, builder));
                        }
                    }
                };
                callbackToFutureAdapter$Completer.addCancellationListener(new AFd1wSDK$$ExternalSyntheticLambda2(12, atomicBoolean, builder, cameraCaptureCallback), zzabp.directExecutor());
                builder.mCaptureConfigBuilder.addCameraCaptureCallback(cameraCaptureCallback);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(callbackToFutureAdapter$Completer.hashCode()));
        }
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 28:
                ((Player.Listener) obj).onMediaMetadataChanged((MediaMetadata) obj2);
                break;
            default:
                ((Player.Listener) obj).onTrackSelectionParametersChanged((TrackSelectionParameters) obj2);
                break;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        SystemBarStateMonitor systemBarStateMonitor = (SystemBarStateMonitor) this.f$0;
        ArrayList arrayList = systemBarStateMonitor.mCallbacks;
        WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
        Insets min = Insets.min(impl.getInsets(519), impl.getInsets(64));
        Insets min2 = Insets.min(impl.getInsetsIgnoringVisibility(519), impl.getInsetsIgnoringVisibility(64));
        if (!min.equals(systemBarStateMonitor.mInsets) || !min2.equals(systemBarStateMonitor.mInsetsIgnoringVisibility)) {
            systemBarStateMonitor.mInsets = min;
            systemBarStateMonitor.mInsetsIgnoringVisibility = min2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ProtectionGroup protectionGroup = (ProtectionGroup) arrayList.get(size);
                protectionGroup.mInsets = min;
                protectionGroup.mInsetsIgnoringVisibility = min2;
                protectionGroup.updateInsets();
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener
    public boolean onCommitContent(Toolbar.AnonymousClass1 anonymousClass1, int i, Bundle bundle) {
        ContentInfoCompat.BuilderCompat builderCompat;
        AppCompatEditText appCompatEditText = (AppCompatEditText) this.f$0;
        if ((i & 1) != 0) {
            try {
                anonymousClass1.requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) ((PreviewView.AnonymousClass1) anonymousClass1.this$0).this$0;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        ClipData clipData = new ClipData(anonymousClass1.getDescription(), new ClipData.Item(anonymousClass1.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            builderCompat = new ContentInfoCompat.Compat31Impl(clipData, 2);
        } else {
            ContentInfoCompat.CompatImpl compatImpl = new ContentInfoCompat.CompatImpl();
            compatImpl.mClip = clipData;
            compatImpl.mSource = 2;
            builderCompat = compatImpl;
        }
        builderCompat.setLinkUri(anonymousClass1.getLinkUri());
        builderCompat.setExtras(bundle);
        return ViewCompat.performReceiveContent(appCompatEditText, builderCompat.build()) == null;
    }

    public void onCompleted() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 3:
                ((CompletableDeferredImpl) obj).makeCompleting$kotlinx_coroutines_core(Unit.INSTANCE);
                return;
            default:
                ScreenFlashWrapper screenFlashWrapper = (ScreenFlashWrapper) obj;
                synchronized (screenFlashWrapper.lock) {
                    try {
                        if (screenFlashWrapper.pendingListener == null) {
                            StringUtilsKt.w("ScreenFlashWrapper", "apply: pendingListener is null!");
                        }
                        screenFlashWrapper.completePendingScreenFlashListener();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // androidx.camera.core.impl.ImageReaderProxy.OnImageAvailableListener
    public void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        int i = this.$r8$classId;
        boolean z = true;
        Object obj = this.f$0;
        switch (i) {
            case 2:
                ZslControlImpl zslControlImpl = (ZslControlImpl) obj;
                imageReaderProxy.getClass();
                try {
                    ImageProxy acquireLatestImage = imageReaderProxy.acquireLatestImage();
                    if (acquireLatestImage != null) {
                        zslControlImpl.zslRingBuffer.enqueue(acquireLatestImage);
                        return;
                    }
                    return;
                } catch (IllegalStateException unused) {
                    if (StringUtilsKt.isLogLevelEnabled(6, "CXCP")) {
                        Log.e("CXCP", "Failed to acquire latest image");
                        return;
                    }
                    return;
                }
            case 7:
                MetadataImageReader metadataImageReader = (MetadataImageReader) obj;
                synchronized (metadataImageReader.mLock) {
                    metadataImageReader.mUnAcquiredAvailableImageCount++;
                }
                metadataImageReader.imageIncoming(imageReaderProxy);
                return;
            default:
                e0 e0Var = (e0) obj;
                try {
                    ImageProxy acquireLatestImage2 = imageReaderProxy.acquireLatestImage();
                    StringBuilder sb = new StringBuilder("OnImageAvailableListener: mCurrentRequest ID = ");
                    ProcessingRequest processingRequest = (ProcessingRequest) e0Var.a;
                    sb.append(processingRequest == null ? null : Integer.valueOf(processingRequest.mRequestId));
                    sb.append(", image.isNull = ");
                    if (acquireLatestImage2 != null) {
                        z = false;
                    }
                    sb.append(z);
                    StringUtilsKt.d("CaptureNode", sb.toString());
                    if (acquireLatestImage2 != null) {
                        e0Var.onImageProxyAvailable(acquireLatestImage2);
                        return;
                    }
                    ProcessingRequest processingRequest2 = (ProcessingRequest) e0Var.a;
                    if (processingRequest2 != null) {
                        e0Var.sendCaptureError(new AutoValue_TakePictureManager_CaptureError(processingRequest2.mRequestId, new ImageCaptureException(2, "Failed to acquire latest image", null)));
                        return;
                    }
                    return;
                } catch (IllegalStateException e) {
                    ProcessingRequest processingRequest3 = (ProcessingRequest) e0Var.a;
                    if (processingRequest3 != null) {
                        e0Var.sendCaptureError(new AutoValue_TakePictureManager_CaptureError(processingRequest3.mRequestId, new ImageCaptureException(2, "Failed to acquire latest image", e)));
                        return;
                    }
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 22:
                ((CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda13) obj2).invoke(obj);
                break;
            case 23:
                ((Navigator$$ExternalSyntheticLambda0) obj2).invoke(obj);
                break;
            case 24:
                ((Navigator$$ExternalSyntheticLambda0) obj2).invoke(obj);
                break;
            case 25:
                ((n3$$ExternalSyntheticLambda0) obj2).invoke(obj);
                break;
            case 26:
                ((n3$$ExternalSyntheticLambda0) obj2).invoke(obj);
                break;
            default:
                ((Navigator$$ExternalSyntheticLambda0) obj2).invoke(obj);
                break;
        }
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
    public void onTransformationInfoUpdate(AutoValue_SurfaceRequest_TransformationInfo autoValue_SurfaceRequest_TransformationInfo) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 4:
                ((StateFlowImpl) obj).setValue(autoValue_SurfaceRequest_TransformationInfo);
                break;
            default:
                ((Recorder) obj).mSourceTransformationInfo = autoValue_SurfaceRequest_TransformationInfo;
                break;
        }
    }

    public float toPixels(float f) {
        return ((State) this.f$0).density.getDensity() * f;
    }

    public /* synthetic */ StreamSharing$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
    public ListenableFuture apply(Object obj) {
        return (ListenableFuture) ((ObjectList$$ExternalSyntheticLambda0) this.f$0).invoke(obj);
    }
}
