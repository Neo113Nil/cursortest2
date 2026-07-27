package android.content.Context;

import android.content.Intent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.LinkedList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterRunnableCosmosNebulaRogue7208 implements FrostHunterCombineLegendMegaPrime5473 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ FrostHunterFlowOnVortexCelestial3214 FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterRunnableCosmosNebulaRogue7208(FrostHunterFlowOnVortexCelestial3214 frostHunterFlowOnVortexCelestial3214, int i) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = frostHunterFlowOnVortexCelestial3214;
    }

    @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
    public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        FrostHunterLinearLayoutSolarHero7990 frostHunterLinearLayoutSolarHero7990 = FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
        FrostHunterFlowOnVortexCelestial3214 frostHunterFlowOnVortexCelestial3214 = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String str = (String) obj;
                str.getClass();
                FrostHunterBitmapForceDelta3935 frostHunterBitmapForceDelta3935 = frostHunterFlowOnVortexCelestial3214.FrostHunterFlowMaxDragonHero5809;
                if (frostHunterBitmapForceDelta3935 != null) {
                    frostHunterBitmapForceDelta3935.FrostHunterRunnableCosmosCelestial4235(str);
                    return frostHunterLinearLayoutSolarHero7990;
                }
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("cameraContract");
                throw null;
            case 1:
                Intent intent = (Intent) obj;
                intent.getClass();
                FrostHunterBitmapForceDelta3935 frostHunterBitmapForceDelta39352 = frostHunterFlowOnVortexCelestial3214.FrostHunterAlertDialogAuroraDelta3200;
                if (frostHunterBitmapForceDelta39352 != null) {
                    frostHunterBitmapForceDelta39352.FrostHunterRunnableCosmosCelestial4235(intent);
                    return frostHunterLinearLayoutSolarHero7990;
                }
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterAnnotationProcessorSparkEclipse8710("fileContract");
                throw null;
            case 2:
                ((FrostHunterAccelerometerNeoUltra2966) obj).getClass();
                FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = frostHunterFlowOnVortexCelestial3214.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                ComponentActivity componentActivity = frostHunterFlowOnVortexCelestial3214.FrostHunterAlphaAnimationNeoCosmos5761;
                ((FrostHunterGyroscopeNebulaVisionInferno5349) frostHunterKotlinQuantumRogue5892.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFlowMaxDragonHero5809(100);
                FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = frostHunterFlowOnVortexCelestial3214.FrostHunterBundlePulseFusionHero2475;
                WebView FrostHunterCardViewSpectraCyber7714 = frostHunterTraceHyperionAuroraNebula9947.FrostHunterCardViewSpectraCyber7714();
                LinkedList linkedList = (LinkedList) frostHunterTraceHyperionAuroraNebula9947.FrostHunterFlowMaxDragonHero5809;
                if (FrostHunterCardViewSpectraCyber7714 == null) {
                    componentActivity.finish();
                } else if (FrostHunterCardViewSpectraCyber7714.canGoBack()) {
                    FrostHunterCardViewSpectraCyber7714.goBack();
                } else if (linkedList.size() <= 1) {
                    componentActivity.finish();
                } else if (linkedList.size() > 1) {
                    Object removeLast = linkedList.removeLast();
                    removeLast.getClass();
                    WebView webView = (WebView) removeLast;
                    FrameLayout frameLayout = (FrameLayout) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200;
                    if (frameLayout != null) {
                        frameLayout.removeView(webView);
                    }
                    webView.destroy();
                }
                return frostHunterLinearLayoutSolarHero7990;
            default:
                ((FrostHunterGyroscopeNebulaVisionInferno5349) frostHunterFlowOnVortexCelestial3214.FrostHunterConstraintSetCloneMasterUltraRogue2633.FrostHunterAlertDialogAuroraDelta3200).FrostHunterFlowMaxDragonHero5809(((Integer) obj).intValue());
                return frostHunterLinearLayoutSolarHero7990;
        }
    }
}
