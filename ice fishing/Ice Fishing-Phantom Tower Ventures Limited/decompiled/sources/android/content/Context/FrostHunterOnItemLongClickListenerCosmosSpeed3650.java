package android.content.Context;

import android.view.MotionEvent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnItemLongClickListenerCosmosSpeed3650 extends FrostHunterCoroutineThunderPhantomStrike2330 implements FrostHunterCombineLegendMegaPrime5473 {
    public final /* synthetic */ FrostHunterGestureDetectorTitaniumSpeedCosmos2231 FrostHunterAlertDialogAuroraDelta3200;
    public final /* synthetic */ int FrostHunterFlowMaxDragonHero5809;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrostHunterOnItemLongClickListenerCosmosSpeed3650(FrostHunterGestureDetectorTitaniumSpeedCosmos2231 frostHunterGestureDetectorTitaniumSpeedCosmos2231, int i) {
        super(1);
        this.FrostHunterFlowMaxDragonHero5809 = i;
        this.FrostHunterAlertDialogAuroraDelta3200 = frostHunterGestureDetectorTitaniumSpeedCosmos2231;
    }

    @Override // android.content.Context.FrostHunterCombineLegendMegaPrime5473
    public final Object FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        boolean dispatchTouchEvent;
        int i = this.FrostHunterFlowMaxDragonHero5809;
        FrostHunterGestureDetectorTitaniumSpeedCosmos2231 frostHunterGestureDetectorTitaniumSpeedCosmos2231 = this.FrostHunterAlertDialogAuroraDelta3200;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterFilterSpectraTitan5298 frostHunterFilterSpectraTitan5298 = (FrostHunterFilterSpectraTitan5298) obj;
                if (!(frostHunterFilterSpectraTitan5298 instanceof FrostHunterFilterSpectraTitan5298)) {
                    frostHunterFilterSpectraTitan5298 = null;
                }
                if (frostHunterFilterSpectraTitan5298 != null) {
                    frostHunterFilterSpectraTitan5298.getAndroidViewsHandler$ui_release().removeViewInLayout(frostHunterGestureDetectorTitaniumSpeedCosmos2231);
                    HashMap<FrostHunterOnGlobalLayoutListenerTitanStrikeNovaX1439, FrostHunterAnimatorSpeedBetaPixel3252> layoutNodeToHolder = frostHunterFilterSpectraTitan5298.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
                    FrostHunterCanvasInfernoVortex4700.FrostHunterFragmentBetaMegaVortex6025(layoutNodeToHolder).remove(frostHunterFilterSpectraTitan5298.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(frostHunterGestureDetectorTitaniumSpeedCosmos2231));
                    frostHunterGestureDetectorTitaniumSpeedCosmos2231.setImportantForAccessibility(0);
                }
                frostHunterGestureDetectorTitaniumSpeedCosmos2231.removeAllViewsInLayout();
                return FrostHunterLinearLayoutSolarHero7990.FrostHunterAlphaAnimationNeoCosmos5761;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                    case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                        dispatchTouchEvent = frostHunterGestureDetectorTitaniumSpeedCosmos2231.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = frostHunterGestureDetectorTitaniumSpeedCosmos2231.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
        }
    }
}
