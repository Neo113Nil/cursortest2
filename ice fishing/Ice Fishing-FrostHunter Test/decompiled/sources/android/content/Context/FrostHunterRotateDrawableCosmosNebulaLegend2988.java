package android.content.Context;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Message;
import android.view.View;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRotateDrawableCosmosNebulaLegend2988 extends WebChromeClient {
    public final /* synthetic */ FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterRotateDrawableCosmosNebulaLegend2988(FrostHunterOnAttachStateChangeListenerVortexNeoQuantum8849 frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterOnAttachStateChangeListenerVortexNeoQuantum8849;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        webView.getClass();
        return ((Boolean) ((FrostHunterThemeOverlayNebulaDelta6405) this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFragmentBetaMegaVortex6025).FrostHunterCameraXPixelTurboCosmos9814(webView, message)).booleanValue();
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.getClass();
        FrostHunterActionBarOmegaThunder1246 frostHunterActionBarOmegaThunder1246 = (FrostHunterActionBarOmegaThunder1246) this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlertDialogAuroraDelta3200;
        frostHunterActionBarOmegaThunder1246.getClass();
        ComponentActivity componentActivity = frostHunterActionBarOmegaThunder1246.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809.FrostHunterAlphaAnimationNeoCosmos5761;
        if (FrostHunterRemoteConfigPhantomDelta1739.FrostHunterCameraXTurboCelestialHero5430(componentActivity, "android.permission.CAMERA") != 0) {
            frostHunterActionBarOmegaThunder1246.FrostHunterServiceEliteCelestialThunder1757.FrostHunterAlphaAnimationNeoCosmos5761 = permissionRequest;
            frostHunterActionBarOmegaThunder1246.FrostHunterBundlePulseFusionHero2475.FrostHunterAlphaAnimationNeoCosmos5761("android.permission.CAMERA");
            return;
        }
        View view = (View) frostHunterActionBarOmegaThunder1246.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        if (view == null) {
            view = componentActivity.getWindow().getDecorView();
            view.getClass();
        }
        view.post(new FrostHunterFilterAlphaSparkSpeed9857(7, permissionRequest));
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        ((FrostHunterRunnableCosmosNebulaRogue7208) this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809).FrostHunterAlphaAnimationNeoCosmos5761(Integer.valueOf(i));
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        FrostHunterRunnableForceDelta6202 frostHunterRunnableForceDelta6202 = (FrostHunterRunnableForceDelta6202) this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197;
        FrostHunterThreadHeroCelestial1021 frostHunterThreadHeroCelestial1021 = frostHunterRunnableForceDelta6202.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Object obj = frostHunterThreadHeroCelestial1021.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterThreadHeroCelestial1021.FrostHunterAlphaAnimationNeoCosmos5761 = null;
        ValueCallback valueCallback2 = (ValueCallback) obj;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        if (valueCallback == null) {
            return false;
        }
        frostHunterThreadHeroCelestial1021.FrostHunterAlphaAnimationNeoCosmos5761 = valueCallback;
        if (fileChooserParams == null) {
            return false;
        }
        try {
            Intent createIntent = fileChooserParams.createIntent();
            if (createIntent == null) {
                return false;
            }
            frostHunterRunnableForceDelta6202.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761(createIntent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Object obj2 = frostHunterThreadHeroCelestial1021.FrostHunterAlphaAnimationNeoCosmos5761;
            frostHunterThreadHeroCelestial1021.FrostHunterAlphaAnimationNeoCosmos5761 = null;
            ValueCallback valueCallback3 = (ValueCallback) obj2;
            if (valueCallback3 == null) {
                return false;
            }
            valueCallback3.onReceiveValue(null);
            return false;
        }
    }
}
