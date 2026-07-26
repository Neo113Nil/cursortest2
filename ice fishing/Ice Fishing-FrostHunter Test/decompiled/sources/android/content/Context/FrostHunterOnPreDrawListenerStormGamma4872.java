package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnPreDrawListenerStormGamma4872 extends FrostHunterCoroutineThunderPhantomStrike2330 implements FrostHunterFontFamilyNeoBetaEpic8574 {
    public static final FrostHunterOnPreDrawListenerStormGamma4872 FrostHunterAlertDialogAuroraDelta3200;
    public static final FrostHunterOnPreDrawListenerStormGamma4872 FrostHunterFragmentBetaMegaVortex6025;
    public static final FrostHunterOnPreDrawListenerStormGamma4872 FrostHunterKeyframeGammaGamma1197;
    public final /* synthetic */ int FrostHunterFlowMaxDragonHero5809;

    static {
        int i = 2;
        FrostHunterAlertDialogAuroraDelta3200 = new FrostHunterOnPreDrawListenerStormGamma4872(i, 0);
        FrostHunterKeyframeGammaGamma1197 = new FrostHunterOnPreDrawListenerStormGamma4872(i, 1);
        FrostHunterFragmentBetaMegaVortex6025 = new FrostHunterOnPreDrawListenerStormGamma4872(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FrostHunterOnPreDrawListenerStormGamma4872(int i, int i2) {
        super(i);
        this.FrostHunterFlowMaxDragonHero5809 = i2;
    }

    @Override // android.content.Context.FrostHunterFontFamilyNeoBetaEpic8574
    public final Object FrostHunterCameraXPixelTurboCosmos9814(Object obj, Object obj2) {
        String str;
        FrostHunterFontFamilyTitanDragonThunder7606 frostHunterFontFamilyTitanDragonThunder7606;
        switch (this.FrostHunterFlowMaxDragonHero5809) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                FrostHunterContextGammaSolar6144 frostHunterContextGammaSolar6144 = (FrostHunterContextGammaSolar6144) obj;
                FrostHunterContextGammaSolar6144 frostHunterContextGammaSolar61442 = (FrostHunterContextGammaSolar6144) obj2;
                if (frostHunterContextGammaSolar6144 == null || (str = frostHunterContextGammaSolar6144.FrostHunterAlphaAnimationNeoCosmos5761) == null) {
                    str = frostHunterContextGammaSolar61442.FrostHunterAlphaAnimationNeoCosmos5761;
                }
                if (frostHunterContextGammaSolar6144 == null || (frostHunterFontFamilyTitanDragonThunder7606 = frostHunterContextGammaSolar6144.FrostHunterConstraintSetCloneMasterUltraRogue2633) == null) {
                    frostHunterFontFamilyTitanDragonThunder7606 = frostHunterContextGammaSolar61442.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                }
                return new FrostHunterContextGammaSolar6144(str, frostHunterFontFamilyTitanDragonThunder7606);
            case 1:
                return obj == null ? obj2 : obj;
            default:
                FrostHunterSharedElementSpectraNeo2511 frostHunterSharedElementSpectraNeo2511 = (FrostHunterSharedElementSpectraNeo2511) obj2;
                Object valueOf = Float.valueOf(0.0f);
                FrostHunterFirestoreEliteMasterThunder9916 frostHunterFirestoreEliteMasterThunder9916 = ((FrostHunterSharedElementSpectraNeo2511) obj).FrostHunterServiceEliteCelestialThunder1757;
                FrostHunterLiveDataScopeMaxSpark9882 frostHunterLiveDataScopeMaxSpark9882 = FrostHunterBannerAdEliteStrike7333.FrostHunterCameraXTurboCelestialHero5430;
                Object FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterFirestoreEliteMasterThunder9916.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark9882);
                if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
                    FrostHunterRemoteConfigSpeedSpeed8566 = valueOf;
                }
                float floatValue = ((Number) FrostHunterRemoteConfigSpeedSpeed8566).floatValue();
                Object FrostHunterRemoteConfigSpeedSpeed85662 = frostHunterSharedElementSpectraNeo2511.FrostHunterServiceEliteCelestialThunder1757.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterRemoteConfigSpeedSpeed8566(frostHunterLiveDataScopeMaxSpark9882);
                if (FrostHunterRemoteConfigSpeedSpeed85662 != null) {
                    valueOf = FrostHunterRemoteConfigSpeedSpeed85662;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
        }
    }
}
