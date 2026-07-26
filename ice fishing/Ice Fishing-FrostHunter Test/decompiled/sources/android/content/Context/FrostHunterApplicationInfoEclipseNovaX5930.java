package android.content.Context;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterApplicationInfoEclipseNovaX5930 implements View.OnApplyWindowInsetsListener {
    public FrostHunterServiceInfoAuroraHyperNeo5624 FrostHunterAlphaAnimationNeoCosmos5761 = null;
    public final /* synthetic */ FrostHunterFlowCollectorPhoenixUltra3104 FrostHunterBundlePulseFusionHero2475;
    public final /* synthetic */ View FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterApplicationInfoEclipseNovaX5930(View view, FrostHunterFlowCollectorPhoenixUltra3104 frostHunterFlowCollectorPhoenixUltra3104) {
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = view;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterFlowCollectorPhoenixUltra3104;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        FrostHunterServiceInfoAuroraHyperNeo5624 FrostHunterBundlePulseFusionHero2475 = FrostHunterServiceInfoAuroraHyperNeo5624.FrostHunterBundlePulseFusionHero2475(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        FrostHunterFlowCollectorPhoenixUltra3104 frostHunterFlowCollectorPhoenixUltra3104 = this.FrostHunterBundlePulseFusionHero2475;
        if (i < 30) {
            FrostHunterStrictModePhantomQuantumCelestial6608.FrostHunterAlphaAnimationNeoCosmos5761(windowInsets, this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
            if (FrostHunterBundlePulseFusionHero2475.equals(this.FrostHunterAlphaAnimationNeoCosmos5761)) {
                return frostHunterFlowCollectorPhoenixUltra3104.FrostHunterBundlePulseFusionHero2475(view, FrostHunterBundlePulseFusionHero2475).FrostHunterConstraintSetCloneMasterUltraRogue2633();
            }
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterBundlePulseFusionHero2475;
        FrostHunterServiceInfoAuroraHyperNeo5624 FrostHunterBundlePulseFusionHero24752 = frostHunterFlowCollectorPhoenixUltra3104.FrostHunterBundlePulseFusionHero2475(view, FrostHunterBundlePulseFusionHero2475);
        if (i >= 30) {
            return FrostHunterBundlePulseFusionHero24752.FrostHunterConstraintSetCloneMasterUltraRogue2633();
        }
        int i2 = FrostHunterAnimationSetSparkPhantomCelestial7545.FrostHunterAlphaAnimationNeoCosmos5761;
        view.requestApplyInsets();
        return FrostHunterBundlePulseFusionHero24752.FrostHunterConstraintSetCloneMasterUltraRogue2633();
    }
}
