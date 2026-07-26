package android.content.Context;

import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final /* synthetic */ class FrostHunterEventVortexPixelNeo4850 implements FrostHunterFragmentCyberGammaDragon1939 {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterEventVortexPixelNeo4850(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    @Override // android.content.Context.FrostHunterFragmentCyberGammaDragon1939
    public final void FrostHunterAlertDialogAuroraDelta3200(FrostHunterNotificationSpectraTurbo8770 frostHunterNotificationSpectraTurbo8770, FrostHunterMaterialCardViewLegendDragon2868 frostHunterMaterialCardViewLegendDragon2868) {
        Window window;
        View peekDecorView;
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i2 = ComponentActivity.FrostHunterDatabaseEliteShadowUltra2452;
                if (frostHunterMaterialCardViewLegendDragon2868 == FrostHunterMaterialCardViewLegendDragon2868.ON_STOP && (window = componentActivity.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                ComponentActivity componentActivity2 = (ComponentActivity) obj;
                int i3 = ComponentActivity.FrostHunterDatabaseEliteShadowUltra2452;
                if (frostHunterMaterialCardViewLegendDragon2868 == FrostHunterMaterialCardViewLegendDragon2868.ON_DESTROY) {
                    componentActivity2.FrostHunterFlowMaxDragonHero5809.FrostHunterConstraintSetCloneMasterUltraRogue2633 = null;
                    if (!componentActivity2.isChangingConfigurations()) {
                        LinkedHashMap linkedHashMap = componentActivity2.FrostHunterLevelListDrawableFusionDragonHero2232().FrostHunterAlphaAnimationNeoCosmos5761;
                        Iterator it = linkedHashMap.values().iterator();
                        while (it.hasNext()) {
                            ((FrostHunterFragmentCosmosSolar3628) it.next()).FrostHunterConstraintSetCloneMasterUltraRogue2633();
                        }
                        linkedHashMap.clear();
                    }
                    FrostHunterDigitalInkRecognitionSpectraSpectra5296 frostHunterDigitalInkRecognitionSpectraSpectra5296 = componentActivity2.FrostHunterServiceConnectionTurboPhoenixOmega6719;
                    ComponentActivity componentActivity3 = frostHunterDigitalInkRecognitionSpectraSpectra5296.FrostHunterKeyframeGammaGamma1197;
                    componentActivity3.getWindow().getDecorView().removeCallbacks(frostHunterDigitalInkRecognitionSpectraSpectra5296);
                    componentActivity3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(frostHunterDigitalInkRecognitionSpectraSpectra5296);
                    break;
                }
                break;
            default:
                FrostHunterRotateDrawableSparkAurora3314 frostHunterRotateDrawableSparkAurora3314 = (FrostHunterRotateDrawableSparkAurora3314) obj;
                if (frostHunterMaterialCardViewLegendDragon2868 != FrostHunterMaterialCardViewLegendDragon2868.ON_START) {
                    if (frostHunterMaterialCardViewLegendDragon2868 == FrostHunterMaterialCardViewLegendDragon2868.ON_STOP) {
                        frostHunterRotateDrawableSparkAurora3314.FrostHunterCameraXPixelTurboCosmos9814 = false;
                        break;
                    }
                } else {
                    frostHunterRotateDrawableSparkAurora3314.FrostHunterCameraXPixelTurboCosmos9814 = true;
                    break;
                }
                break;
        }
    }
}
