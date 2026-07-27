package android.content.Context;

import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterBroadcastOmegaPrimeNova2298 {
    public static final String FrostHunterBundlePulseFusionHero2475;
    public static final FrostHunterBroadcastOmegaPrimeNova2298 FrostHunterLevelListDrawableFusionDragonHero2232;
    public static final FrostHunterBroadcastOmegaPrimeNova2298 FrostHunterLifecycleBlazeGammaElite2889;
    public static final Set FrostHunterServiceEliteCelestialThunder1757;
    public final String FrostHunterAlphaAnimationNeoCosmos5761;
    public final String FrostHunterConstraintSetCloneMasterUltraRogue2633;

    static {
        String FrostHunterLevelListDrawableFusionDragonHero22322 = FrostHunterCardViewLegendUltra9902.FrostHunterLevelListDrawableFusionDragonHero2232("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        FrostHunterBundlePulseFusionHero2475 = FrostHunterLevelListDrawableFusionDragonHero22322;
        String FrostHunterLevelListDrawableFusionDragonHero22323 = FrostHunterCardViewLegendUltra9902.FrostHunterLevelListDrawableFusionDragonHero2232("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String FrostHunterLevelListDrawableFusionDragonHero22324 = FrostHunterCardViewLegendUltra9902.FrostHunterLevelListDrawableFusionDragonHero2232("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        FrostHunterServiceEliteCelestialThunder1757 = Collections.unmodifiableSet(new HashSet(Arrays.asList(new FrostHunterWindowManagerPrimeHeroMaster3405("proto"), new FrostHunterWindowManagerPrimeHeroMaster3405("json"))));
        FrostHunterLifecycleBlazeGammaElite2889 = new FrostHunterBroadcastOmegaPrimeNova2298(FrostHunterLevelListDrawableFusionDragonHero22322, null);
        FrostHunterLevelListDrawableFusionDragonHero2232 = new FrostHunterBroadcastOmegaPrimeNova2298(FrostHunterLevelListDrawableFusionDragonHero22323, FrostHunterLevelListDrawableFusionDragonHero22324);
    }

    public FrostHunterBroadcastOmegaPrimeNova2298(String str, String str2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = str;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = str2;
    }

    public static FrostHunterBroadcastOmegaPrimeNova2298 FrostHunterAlphaAnimationNeoCosmos5761(byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (!str.startsWith("1$")) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        return new FrostHunterBroadcastOmegaPrimeNova2298(str2, str3.isEmpty() ? null : str3);
    }
}
