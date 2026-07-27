package android.content.Context;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLinearLayoutNeoSpectraEclipse6191 implements FrostHunterInterstitialAdMaxOlympian1405 {
    public final FrostHunterToastHyperTitanThunder2275 FrostHunterAlphaAnimationNeoCosmos5761;
    public FrostHunterToastHyperTitanThunder2275 FrostHunterConstraintSetCloneMasterUltraRogue2633;

    public FrostHunterLinearLayoutNeoSpectraEclipse6191(LinkedHashMap linkedHashMap) {
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275;
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            frostHunterToastHyperTitanThunder2275 = null;
        } else {
            frostHunterToastHyperTitanThunder2275 = new FrostHunterToastHyperTitanThunder2275(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                frostHunterToastHyperTitanThunder2275.FrostHunterServiceConnectionTurboPhoenixOmega6719(entry.getKey(), entry.getValue());
            }
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterToastHyperTitanThunder2275;
    }

    @Override // android.content.Context.FrostHunterInterstitialAdMaxOlympian1405
    public final boolean FrostHunterAlphaAnimationNeoCosmos5761(Object obj) {
        return FrostHunterLiveDataNebulaVisionSpeed2164.FrostHunterFlowMaxDragonHero5809(obj);
    }

    @Override // android.content.Context.FrostHunterInterstitialAdMaxOlympian1405
    public final FrostHunterRoomEliteInferno4871 FrostHunterBundlePulseFusionHero2475(String str, FrostHunterNotificationGammaBlazePhoenix7595 frostHunterNotificationGammaBlazePhoenix7595) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!FrostHunterVectorDrawableForceMax1351.FrostHunterLooperHyperionForce4133(str.charAt(i))) {
                FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                if (frostHunterToastHyperTitanThunder2275 == null) {
                    long[] jArr = FrostHunterSnackbarHyperionUltra7694.FrostHunterAlphaAnimationNeoCosmos5761;
                    frostHunterToastHyperTitanThunder2275 = new FrostHunterToastHyperTitanThunder2275();
                    this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = frostHunterToastHyperTitanThunder2275;
                }
                Object FrostHunterRemoteConfigSpeedSpeed8566 = frostHunterToastHyperTitanThunder2275.FrostHunterRemoteConfigSpeedSpeed8566(str);
                if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
                    FrostHunterRemoteConfigSpeedSpeed8566 = new ArrayList();
                    frostHunterToastHyperTitanThunder2275.FrostHunterServiceConnectionTurboPhoenixOmega6719(str, FrostHunterRemoteConfigSpeedSpeed8566);
                }
                ((List) FrostHunterRemoteConfigSpeedSpeed8566).add(frostHunterNotificationGammaBlazePhoenix7595);
                return new FrostHunterServicePhantomGammaTitan7103(frostHunterToastHyperTitanThunder2275, str, frostHunterNotificationGammaBlazePhoenix7595, 0);
            }
        }
        FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Registered key is empty or blank");
        return null;
    }

    @Override // android.content.Context.FrostHunterInterstitialAdMaxOlympian1405
    public final Object FrostHunterConstraintSetCloneMasterUltraRogue2633(String str) {
        FrostHunterToastHyperTitanThunder2275 frostHunterToastHyperTitanThunder2275 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        List list = frostHunterToastHyperTitanThunder2275 != null ? (List) frostHunterToastHyperTitanThunder2275.FrostHunterKeyframeGammaGamma1197(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && frostHunterToastHyperTitanThunder2275 != null) {
            List subList = list.subList(1, list.size());
            int FrostHunterLevelListDrawableFusionDragonHero2232 = frostHunterToastHyperTitanThunder2275.FrostHunterLevelListDrawableFusionDragonHero2232(str);
            if (FrostHunterLevelListDrawableFusionDragonHero2232 < 0) {
                FrostHunterLevelListDrawableFusionDragonHero2232 = ~FrostHunterLevelListDrawableFusionDragonHero2232;
            }
            Object[] objArr = frostHunterToastHyperTitanThunder2275.FrostHunterBundlePulseFusionHero2475;
            Object obj = objArr[FrostHunterLevelListDrawableFusionDragonHero2232];
            frostHunterToastHyperTitanThunder2275.FrostHunterConstraintSetCloneMasterUltraRogue2633[FrostHunterLevelListDrawableFusionDragonHero2232] = str;
            objArr[FrostHunterLevelListDrawableFusionDragonHero2232] = subList;
        }
        return list.get(0);
    }
}
