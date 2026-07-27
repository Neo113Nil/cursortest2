package android.content.Context;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBitmapForceDelta3935 extends FrostHunterPaintCyberPulse5979 {
    public final /* synthetic */ int FrostHunterFragmentBetaMegaVortex6025;
    public final /* synthetic */ String FrostHunterLightSensorForceFusion4241;
    public final /* synthetic */ FrostHunterTransitionGammaTitanSpeed7178 FrostHunterScaleAnimationStrikeSpark5059;
    public final /* synthetic */ FrostHunterChipNebulaCyberThunder6252 FrostHunterServiceConnectionTurboPhoenixOmega6719;

    public /* synthetic */ FrostHunterBitmapForceDelta3935(FrostHunterChipNebulaCyberThunder6252 frostHunterChipNebulaCyberThunder6252, String str, FrostHunterTransitionGammaTitanSpeed7178 frostHunterTransitionGammaTitanSpeed7178, int i) {
        this.FrostHunterFragmentBetaMegaVortex6025 = i;
        this.FrostHunterServiceConnectionTurboPhoenixOmega6719 = frostHunterChipNebulaCyberThunder6252;
        this.FrostHunterLightSensorForceFusion4241 = str;
        this.FrostHunterScaleAnimationStrikeSpark5059 = frostHunterTransitionGammaTitanSpeed7178;
    }

    public final void FrostHunterRunnableCosmosCelestial4235(Object obj) {
        int i = this.FrostHunterFragmentBetaMegaVortex6025;
        FrostHunterTransitionGammaTitanSpeed7178 frostHunterTransitionGammaTitanSpeed7178 = this.FrostHunterScaleAnimationStrikeSpark5059;
        String str = this.FrostHunterLightSensorForceFusion4241;
        FrostHunterChipNebulaCyberThunder6252 frostHunterChipNebulaCyberThunder6252 = this.FrostHunterServiceConnectionTurboPhoenixOmega6719;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                LinkedHashMap linkedHashMap = frostHunterChipNebulaCyberThunder6252.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                ArrayList arrayList = frostHunterChipNebulaCyberThunder6252.FrostHunterServiceEliteCelestialThunder1757;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + frostHunterTransitionGammaTitanSpeed7178 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    frostHunterChipNebulaCyberThunder6252.FrostHunterConstraintSetCloneMasterUltraRogue2633(intValue, frostHunterTransitionGammaTitanSpeed7178, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                LinkedHashMap linkedHashMap2 = frostHunterChipNebulaCyberThunder6252.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                ArrayList arrayList2 = frostHunterChipNebulaCyberThunder6252.FrostHunterServiceEliteCelestialThunder1757;
                Object obj3 = linkedHashMap2.get(str);
                FrostHunterBannerAdMaxSpark9420 frostHunterBannerAdMaxSpark9420 = (FrostHunterBannerAdMaxSpark9420) frostHunterTransitionGammaTitanSpeed7178;
                if (obj3 == null) {
                    FrostHunterFlowHyperionVortexDelta5013.FrostHunterFragmentBetaMegaVortex6025("Attempting to launch an unregistered ActivityResultLauncher with contract ", frostHunterBannerAdMaxSpark9420, " and input android.permission.POST_NOTIFICATIONS. You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    frostHunterChipNebulaCyberThunder6252.FrostHunterConstraintSetCloneMasterUltraRogue2633(intValue2, frostHunterBannerAdMaxSpark9420, "android.permission.POST_NOTIFICATIONS");
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }
}
