package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterTransitionManagerNeoTitanTitan4580 implements FrostHunterCamera2EpicHyperion2312 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final /* synthetic */ Object FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public /* synthetic */ FrostHunterTransitionManagerNeoTitanTitan4580(int i, Object obj) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = obj;
    }

    @Override // android.content.Context.FrostHunterCamera2EpicHyperion2312
    public final void accept(Object obj) {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterServiceInfoHeroNovaX4934 frostHunterServiceInfoHeroNovaX4934 = (FrostHunterServiceInfoHeroNovaX4934) obj;
                if (frostHunterServiceInfoHeroNovaX4934 == null) {
                    frostHunterServiceInfoHeroNovaX4934 = new FrostHunterServiceInfoHeroNovaX4934(-3);
                }
                ((FrostHunterIntentForceSpeed4935) this.FrostHunterConstraintSetCloneMasterUltraRogue2633).FrostHunterTextViewDragonStormMega4297(frostHunterServiceInfoHeroNovaX4934);
                return;
            default:
                FrostHunterServiceInfoHeroNovaX4934 frostHunterServiceInfoHeroNovaX49342 = (FrostHunterServiceInfoHeroNovaX4934) obj;
                synchronized (FrostHunterAnimatorSolarDragonAlpha1060.FrostHunterBundlePulseFusionHero2475) {
                    try {
                        FrostHunterTimerCosmosCyberLegend3595 frostHunterTimerCosmosCyberLegend3595 = FrostHunterAnimatorSolarDragonAlpha1060.FrostHunterServiceEliteCelestialThunder1757;
                        ArrayList arrayList = (ArrayList) frostHunterTimerCosmosCyberLegend3595.get((String) this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                        if (arrayList == null) {
                            return;
                        }
                        frostHunterTimerCosmosCyberLegend3595.remove((String) this.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((FrostHunterCamera2EpicHyperion2312) arrayList.get(i)).accept(frostHunterServiceInfoHeroNovaX49342);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
