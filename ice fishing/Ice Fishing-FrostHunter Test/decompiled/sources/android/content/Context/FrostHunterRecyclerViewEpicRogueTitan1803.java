package android.content.Context;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterRecyclerViewEpicRogueTitan1803 {
    public final FrostHunterKotlinQuantumRogue5892 FrostHunterAlphaAnimationNeoCosmos5761;
    public final HashMap FrostHunterBundlePulseFusionHero2475;
    public final FrostHunterTraceHyperionAuroraNebula9947 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterRecyclerViewEpicRogueTitan1803(Context context, FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947) {
        FrostHunterKotlinQuantumRogue5892 frostHunterKotlinQuantumRogue5892 = new FrostHunterKotlinQuantumRogue5892(context);
        this.FrostHunterBundlePulseFusionHero2475 = new HashMap();
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterKotlinQuantumRogue5892;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterTraceHyperionAuroraNebula9947;
    }

    public final synchronized FrostHunterInputFilterSolarFusionCelestial5018 FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        if (this.FrostHunterBundlePulseFusionHero2475.containsKey(str)) {
            return (FrostHunterInputFilterSolarFusionCelestial5018) this.FrostHunterBundlePulseFusionHero2475.get(str);
        }
        CctBackendFactory FrostHunterKeyframeGammaGamma1197 = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterKeyframeGammaGamma1197(str);
        if (FrostHunterKeyframeGammaGamma1197 == null) {
            return null;
        }
        FrostHunterTraceHyperionAuroraNebula9947 frostHunterTraceHyperionAuroraNebula9947 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        FrostHunterInputFilterSolarFusionCelestial5018 create = FrostHunterKeyframeGammaGamma1197.create(new FrostHunterHandlerHeroHyperion6983((Context) frostHunterTraceHyperionAuroraNebula9947.FrostHunterKeyframeGammaGamma1197, (FrostHunterActivityInfoStrikeCelestial6878) frostHunterTraceHyperionAuroraNebula9947.FrostHunterFlowMaxDragonHero5809, (FrostHunterActivityInfoStrikeCelestial6878) frostHunterTraceHyperionAuroraNebula9947.FrostHunterAlertDialogAuroraDelta3200, str));
        this.FrostHunterBundlePulseFusionHero2475.put(str, create);
        return create;
    }
}
