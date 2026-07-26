package android.content.Context;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterAlertDialogHeroHeroPrime2342 {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static void FrostHunterBundlePulseFusionHero2475(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        int i = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        Charset charset = StandardCharsets.UTF_8;
        String FrostHunterLightSensorForceFusion4241 = frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(charset);
        if (FrostHunterLightSensorForceFusion4241 == null || !FrostHunterLightSensorForceFusion4241.startsWith("WEBVTT")) {
            frostHunterLicensingSpectraPulse8868.FrostHunterR8MasterNebulaSpark7247(i);
            throw FrostHunterDiffUtilTurboSpark8131.FrostHunterAlphaAnimationNeoCosmos5761(null, "Expected WEBVTT. Got " + frostHunterLicensingSpectraPulse8868.FrostHunterLightSensorForceFusion4241(charset));
        }
    }

    public static long FrostHunterConstraintSetCloneMasterUltraRogue2633(String str) {
        String str2 = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() != 3) {
                FrostHunterFlowHyperionVortexDelta5013.FrostHunterFlowMaxDragonHero5809("Expected 3 decimal places, got: ".concat(trim));
                return 0L;
            }
            j2 += Long.parseLong(trim);
        }
        return j2 * 1000;
    }
}
