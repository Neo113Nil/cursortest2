package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterThemeOverlayNovaXMaster6614 implements FrostHunterBroadcastFusionTurbo7906 {
    public final /* synthetic */ int FrostHunterAlphaAnimationNeoCosmos5761;
    public final FrostHunterFontFamilyTitanDragonThunder7606 FrostHunterBundlePulseFusionHero2475;
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterThemeOverlayNovaXMaster6614(CharSequence charSequence, FrostHunterFontFamilyNeoBetaEpic8574 frostHunterFontFamilyNeoBetaEpic8574) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = 0;
        charSequence.getClass();
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = charSequence;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterFontFamilyNeoBetaEpic8574;
    }

    @Override // android.content.Context.FrostHunterBroadcastFusionTurbo7906
    public final Iterator iterator() {
        switch (this.FrostHunterAlphaAnimationNeoCosmos5761) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new FrostHunterNavigationSpeedHyperionSolar8806(this);
            case 1:
                return new FrostHunterMergeAlphaMegaNebula6647(this);
            default:
                return new FrostHunterTabLayoutStrikeOmegaCosmos4128(this);
        }
    }

    public /* synthetic */ FrostHunterThemeOverlayNovaXMaster6614(Object obj, FrostHunterCombineLegendMegaPrime5473 frostHunterCombineLegendMegaPrime5473, int i) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = obj;
        this.FrostHunterBundlePulseFusionHero2475 = frostHunterCombineLegendMegaPrime5473;
    }
}
