package com.knotapi.knot.webview;

import android.view.View;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.processing.SurfaceEdge;
import com.knotapi.knot.interfaces.MerchantViewListener;
import com.knotapi.knot.interfaces.MerchantWebViewDelegate;
import com.knotapi.knot.models.Bot;
import com.knotapi.knot.webview.WebViewManager;
import com.nimbusds.jose.JWECryptoParts;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.OverlayAssets;
import com.withpersona.sdk2.inquiry.governmentid.cameraScreen.BasicGovIdCaptureViewController;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCameraBinding;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.steps.ui.utils.RemoteImageUtilsKt;
import java.util.Map;

/* loaded from: classes9.dex */
public final /* synthetic */ class WebViewManager$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ WebViewManager$$ExternalSyntheticLambda0(BasicGovIdCaptureViewController basicGovIdCaptureViewController, IdConfig.Side side, RemoteImage remoteImage, Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding, OverlayAssets overlayAssets, String str) {
        this.$r8$classId = 2;
        this.f$0 = basicGovIdCaptureViewController;
        this.f$1 = side;
        this.f$2 = remoteImage;
        this.f$3 = pi2GovernmentidCameraBinding;
        this.f$5 = overlayAssets;
        this.f$4 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$4;
        Object obj2 = this.f$5;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((WebViewManager) obj6).lambda$createWebView$0((Bot) obj5, (MerchantWebViewDelegate) obj4, (MerchantViewListener) obj3, (String) obj, (WebViewManager.WebViewCreationCallback) obj2);
                break;
            case 1:
                ((JWECryptoParts) obj6).createAndSendSurfaceOutput((CameraInternal) obj5, (CameraInternal) obj4, (SurfaceEdge) obj3, (SurfaceEdge) obj, (Map.Entry) obj2);
                break;
            default:
                BasicGovIdCaptureViewController basicGovIdCaptureViewController = (BasicGovIdCaptureViewController) obj6;
                RemoteImage remoteImage = (RemoteImage) obj4;
                Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = (Pi2GovernmentidCameraBinding) obj3;
                OverlayAssets overlayAssets = (OverlayAssets) obj2;
                String str = (String) obj;
                basicGovIdCaptureViewController.animationState = BasicGovIdCaptureViewController.AnimationState.TRANSITION_EXPANDING;
                basicGovIdCaptureViewController.lastCaptureSide = (IdConfig.Side) obj5;
                if (remoteImage != null) {
                    View view = basicGovIdCaptureViewController.currentOverlayAssetView;
                    if (view != null) {
                        pi2GovernmentidCameraBinding.overlayIconContainer.removeView(view);
                    }
                    basicGovIdCaptureViewController.currentOverlayAssetView = RemoteImageUtilsKt.renderToContainer(remoteImage, pi2GovernmentidCameraBinding.overlayIconContainer, false);
                    pi2GovernmentidCameraBinding.overlayIcon.setVisibility(8);
                } else {
                    int i2 = basicGovIdCaptureViewController.currentHintAnimation;
                    int i3 = overlayAssets.hintAnimation;
                    if (i2 != i3) {
                        basicGovIdCaptureViewController.currentHintAnimation = i3;
                        pi2GovernmentidCameraBinding.overlayIcon.setAnimation(i3);
                        pi2GovernmentidCameraBinding.overlayIcon.setVisibility(0);
                    }
                }
                pi2GovernmentidCameraBinding.overlayGuide.setImageResource(overlayAssets.guideDrawable);
                pi2GovernmentidCameraBinding.overlayText.setText(str);
                basicGovIdCaptureViewController.playExpandAnimation();
                break;
        }
    }

    public /* synthetic */ WebViewManager$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = obj6;
    }
}
