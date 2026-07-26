package android.content.Context;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.android.installreferrer.api.InstallReferrerClient;
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnTouchListenerPixelMaxSpectra9429 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int FrostHunterCameraXPixelTurboCosmos9814;
    public final /* synthetic */ Object FrostHunterFlowMaxDragonHero5809;

    public /* synthetic */ FrostHunterOnTouchListenerPixelMaxSpectra9429(int i, Object obj) {
        this.FrostHunterCameraXPixelTurboCosmos9814 = i;
        this.FrostHunterFlowMaxDragonHero5809 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterRemoteConfigForceEliteNovaX5656 frostHunterRemoteConfigForceEliteNovaX5656 = (FrostHunterRemoteConfigForceEliteNovaX5656) obj;
                AccessibilityManager accessibilityManager = frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterRemoteConfigSpeedSpeed8566;
                frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterKeyframeGammaGamma1197 = accessibilityManager.getEnabledAccessibilityServiceList(-1);
                accessibilityManager.addAccessibilityStateChangeListener(frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterFlowMaxDragonHero5809);
                accessibilityManager.addTouchExplorationStateChangeListener(frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterAlertDialogAuroraDelta3200);
                break;
            case 1:
                FrostHunterDispatchersInfernoSpark9076 frostHunterDispatchersInfernoSpark9076 = (FrostHunterDispatchersInfernoSpark9076) obj;
                Context context = view.getContext();
                if (!frostHunterDispatchersInfernoSpark9076.FrostHunterAlphaAnimationNeoCosmos5761) {
                    context.getApplicationContext().registerComponentCallbacks((FrostHunterVelocityTrackerTurboLegendMega5856) frostHunterDispatchersInfernoSpark9076.FrostHunterLifecycleBlazeGammaElite2889);
                    frostHunterDispatchersInfernoSpark9076.FrostHunterAlphaAnimationNeoCosmos5761 = true;
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.FrostHunterCameraXPixelTurboCosmos9814;
        boolean z = false;
        Object obj = this.FrostHunterFlowMaxDragonHero5809;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterRemoteConfigForceEliteNovaX5656 frostHunterRemoteConfigForceEliteNovaX5656 = (FrostHunterRemoteConfigForceEliteNovaX5656) obj;
                frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterFragmentBetaMegaVortex6025.removeCallbacks(frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterFCMDeltaQuantumHero8364);
                AccessibilityManager accessibilityManager = frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterRemoteConfigSpeedSpeed8566;
                accessibilityManager.removeAccessibilityStateChangeListener(frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterFlowMaxDragonHero5809);
                accessibilityManager.removeTouchExplorationStateChangeListener(frostHunterRemoteConfigForceEliteNovaX5656.FrostHunterAlertDialogAuroraDelta3200);
                break;
            case 1:
                FrostHunterDispatchersInfernoSpark9076 frostHunterDispatchersInfernoSpark9076 = (FrostHunterDispatchersInfernoSpark9076) obj;
                Context context = view.getContext();
                if (frostHunterDispatchersInfernoSpark9076.FrostHunterAlphaAnimationNeoCosmos5761) {
                    context.getApplicationContext().unregisterComponentCallbacks((FrostHunterVelocityTrackerTurboLegendMega5856) frostHunterDispatchersInfernoSpark9076.FrostHunterLifecycleBlazeGammaElite2889);
                    frostHunterDispatchersInfernoSpark9076.FrostHunterAlphaAnimationNeoCosmos5761 = false;
                    break;
                }
                break;
            case 2:
                FrostHunterTextInputEditTextSolarForce9640 frostHunterTextInputEditTextSolarForce9640 = (FrostHunterTextInputEditTextSolarForce9640) obj;
                ViewParent parent = frostHunterTextInputEditTextSolarForce9640.getParent();
                Iterator it = (parent == null ? FrostHunterAnimationSetQuantumGamma9430.FrostHunterAlphaAnimationNeoCosmos5761 : new FrostHunterThemeOverlayNovaXMaster6614(new FrostHunterAnimatorAlphaVortexInferno7431(25, parent), FrostHunterEditTextTitanHero1855.FrostHunterScaleAnimationStrikeSpark5059, 1)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj2 = (ViewParent) it.next();
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    FrostHunterAssetManagerPulseStorm5752 frostHunterAssetManagerPulseStorm5752 = frostHunterTextInputEditTextSolarForce9640.FrostHunterAlertDialogAuroraDelta3200;
                    if (frostHunterAssetManagerPulseStorm5752 != null) {
                        frostHunterAssetManagerPulseStorm5752.FrostHunterAlphaAnimationNeoCosmos5761();
                    }
                    frostHunterTextInputEditTextSolarForce9640.FrostHunterAlertDialogAuroraDelta3200 = null;
                    frostHunterTextInputEditTextSolarForce9640.requestLayout();
                    break;
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((FrostHunterPagingSparkCosmos2306) obj).FrostHunterServiceEliteCelestialThunder1757(null);
                break;
        }
    }

    private final void FrostHunterAlphaAnimationNeoCosmos5761(View view) {
    }

    private final void FrostHunterConstraintSetCloneMasterUltraRogue2633(View view) {
    }
}
