package com.plaid.internal;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Looper;
import android.util.Size;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.camera.core.MeteringPoint;
import androidx.camera.core.SurfaceOrientedMeteringPointFactory;
import androidx.camera.view.PreviewView;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.lifecycle.MutableLiveData;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.ImageDownload;
import com.knotapi.knot.services.Reporter;
import com.miteksystems.misnap.camera.frameproducers.CameraWrapper;
import com.miteksystems.misnap.camera.frameproducers.FrameLoader;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.view.CameraView;
import com.miteksystems.misnap.core.MiSnapCameraInfo;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.plaid.internal.P7;
import com.squareup.cash.tax.views.databinding.TaxWebAppLayoutBinding;
import com.squareup.cash.ui.qrcodes.QrCodeTileService;
import com.squareup.scannerview.SizeMap;
import com.stripe.hcaptcha.HCaptchaError;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.webview.HCaptchaJSInterface;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.BasicSelfieCaptureViewController;
import com.withpersona.sdk2.inquiry.selfie.cameraScreen.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sqip.internal.CardEntryActivityController;
import sqip.internal.CardEntryResult;
import sqip.internal.event.EventLogger;

/* loaded from: classes4.dex */
public final /* synthetic */ class r6$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ r6$$ExternalSyntheticLambda0(OldSelfieOverlayView oldSelfieOverlayView, TaxWebAppLayoutBinding taxWebAppLayoutBinding, Function0 function0) {
        this.$r8$classId = 19;
        this.f$0 = taxWebAppLayoutBinding;
        this.f$1 = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Size size;
        int height;
        int width;
        Size size2;
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                C0275r6.a((C0275r6) obj2, (C0293t6) obj);
                return;
            case 1:
                ((EventHandler) ((Map.Entry) obj2).getKey()).handle((Event) obj);
                return;
            case 2:
                SizeMap sizeMap = (SizeMap) obj;
                try {
                    sizeMap.set(((Callable) obj2).call());
                    return;
                } catch (Exception e) {
                    sizeMap.setException(e);
                    return;
                }
            case 3:
                ((FirebaseMessaging) obj2).lambda$getToken$7((TaskCompletionSource) obj);
                return;
            case 4:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                try {
                    taskCompletionSource.setResult(((ImageDownload) obj2).blockingDownload());
                    return;
                } catch (Exception e2) {
                    taskCompletionSource.setException(e2);
                    return;
                }
            case 5:
                Reporter.runSafe((Runnable) obj2, (String) obj);
                return;
            case 6:
                ((CameraWrapper) obj2).a((MeteringPoint) obj);
                return;
            case 7:
                CameraView cameraView = (CameraView) obj2;
                FrameProducer.Event event = (FrameProducer.Event) obj;
                event.getClass();
                Context context = cameraView.getContext();
                CameraView.a aVar = cameraView.c;
                context.getClass();
                if (WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context) == 2) {
                    FrameProducer.Event.CameraInitialized cameraInitialized = (FrameProducer.Event.CameraInitialized) event;
                    size = new Size(cameraInitialized.getCameraInfo().e.getWidth(), cameraInitialized.getCameraInfo().e.getHeight());
                } else {
                    FrameProducer.Event.CameraInitialized cameraInitialized2 = (FrameProducer.Event.CameraInitialized) event;
                    size = new Size(cameraInitialized2.getCameraInfo().e.getHeight(), cameraInitialized2.getCameraInfo().e.getWidth());
                }
                aVar.a = size;
                FrameProducer.Event.CameraInitialized cameraInitialized3 = (FrameProducer.Event.CameraInitialized) event;
                Size size3 = new Size(cameraInitialized3.getCameraInfo().d.getWidth(), cameraInitialized3.getCameraInfo().d.getHeight());
                Context context2 = cameraView.getContext();
                context2.getClass();
                int deviceCurrentBasicOrientation = WindowCompat$Api35Impl.getDeviceCurrentBasicOrientation(context2);
                PreviewView previewView = cameraView.b;
                int width2 = previewView.getWidth();
                int height2 = previewView.getHeight();
                if (deviceCurrentBasicOrientation == 2) {
                    height = size3.getWidth();
                    width = size3.getHeight();
                } else {
                    height = size3.getHeight();
                    width = size3.getWidth();
                }
                float f = width2;
                float f2 = height2;
                float f3 = height;
                float f4 = width;
                if (Math.abs((f / f2) - (f3 / f4)) < 1.0E-6d) {
                    size2 = new Size(width2, height2);
                } else {
                    float min = Math.min(f / f3, f2 / f4);
                    size2 = new Size((int) (f3 * min), (int) (f4 * min));
                }
                aVar.b = size2;
                if (cameraView.f instanceof FrameLoader) {
                    SurfaceView surfaceView = cameraView.d;
                    if (surfaceView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("surfaceView");
                        throw null;
                    }
                    surfaceView.getHolder().setFixedSize(size2.getWidth(), size2.getHeight());
                }
                cameraView.getLayoutParams().width = size2.getWidth();
                cameraView.getLayoutParams().height = size2.getHeight();
                cameraView.g = new SurfaceOrientedMeteringPointFactory(size2.getWidth(), size2.getHeight());
                cameraView.h = new Point(size2.getWidth() / 2, size2.getHeight() / 2);
                cameraView.requestLayout();
                return;
            case 8:
                Runnable runnable = (Runnable) obj2;
                com.miteksystems.misnap.camera.a.n nVar = (com.miteksystems.misnap.camera.a.n) obj;
                runnable.getClass();
                nVar.getClass();
                runnable.run();
                ((HashMap) nVar.c).remove(Integer.valueOf(runnable.hashCode()));
                return;
            case 9:
                MiSnapView miSnapView = (MiSnapView) obj2;
                int i2 = MiSnapView.$r8$clinit;
                miSnapView.getClass();
                MutableLiveData mutableLiveData = miSnapView.z;
                FrameProducer.Event.CameraInitialized cameraInitialized4 = new FrameProducer.Event.CameraInitialized((MiSnapCameraInfo) obj);
                mutableLiveData.getClass();
                if (Looper.getMainLooper().isCurrentThread()) {
                    mutableLiveData.setValue(cameraInitialized4);
                } else {
                    mutableLiveData.postValue(cameraInitialized4);
                }
                FrameProducer.Event.CameraReady cameraReady = FrameProducer.Event.CameraReady.INSTANCE;
                if (Looper.getMainLooper().isCurrentThread()) {
                    mutableLiveData.setValue(cameraReady);
                    return;
                } else {
                    mutableLiveData.postValue(cameraReady);
                    return;
                }
            case 10:
                P7.g.a((P7) obj2, (String) obj);
                return;
            case 11:
                MutableFloatState mutableFloatState = (MutableFloatState) obj;
                ViewParent parent = ((TextureView) obj2).getParent();
                parent.getClass();
                FrameLayout frameLayout = (FrameLayout) parent;
                if (frameLayout.getForeground() != null) {
                    ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState;
                    frameLayout.setScaleX(1.0f / parcelableSnapshotMutableFloatState.getFloatValue());
                    frameLayout.setScaleY(1.0f / parcelableSnapshotMutableFloatState.getFloatValue());
                    frameLayout.setForeground(null);
                    return;
                }
                return;
            case 12:
                int i3 = QrCodeTileService.$r8$clinit;
                ((QrCodeTileService) obj2).launch((Intent) obj);
                return;
            case 13:
                ((HCaptchaJSInterface) obj2).captchaVerifier.onFailure(new HCaptchaException((HCaptchaError) obj));
                return;
            case 14:
                ((HCaptchaJSInterface) obj2).captchaVerifier.onSuccess((String) obj);
                return;
            case 15:
                Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = (Pi2GovernmentidCameraBinding) obj2;
                pi2GovernmentidCameraBinding.scanningView.setScanningAnimationEnabled(true);
                ((BasicGovIdCaptureViewController) obj).animationState = BasicGovIdCaptureViewController.AnimationState.IDLE;
                FrameLayout frameLayout2 = pi2GovernmentidCameraBinding.previewContainer;
                frameLayout2.setVisibility(0);
                frameLayout2.animate().alpha(1.0f).setDuration(200L).start();
                return;
            case 16:
                ((BasicSelfieCaptureViewController) obj2).isFinalizingCoverAnimatingOut = false;
                ((FrameLayout) obj).setVisibility(8);
                return;
            case 17:
                ((BasicSelfieCaptureViewController) obj2).isCameraCoverAnimatingOut = false;
                ((Pi2SelfieCameraBinding) obj).cameraCover.setVisibility(8);
                return;
            case 18:
                CameraScreenRunner cameraScreenRunner = (CameraScreenRunner) obj2;
                CameraController cameraController = (CameraController) obj;
                Function0 function0 = cameraScreenRunner.permissionChangedHandler;
                if (function0 != null) {
                    function0.invoke();
                }
                cameraScreenRunner.registerCameraStateListener(cameraController);
                return;
            case 19:
                int i4 = OldSelfieOverlayView.$r8$clinit;
                OldSelfieOverlayView.animateHide(((TaxWebAppLayoutBinding) obj2).rootView, 80L).withEndAction(new P5$$ExternalSyntheticLambda0(8, (Function0) obj));
                return;
            case 20:
                CardEntryActivityController.finishWithSuccess$lambda$3((CardEntryActivityController) obj2, (CardEntryResult) obj);
                return;
            default:
                ((EventLogger.Real) obj2).uploadLogsInBackground((ArrayList) obj);
                return;
        }
    }

    public /* synthetic */ r6$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
