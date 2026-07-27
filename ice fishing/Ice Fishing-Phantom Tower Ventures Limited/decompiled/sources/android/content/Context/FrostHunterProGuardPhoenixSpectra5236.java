package android.content.Context;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterProGuardPhoenixSpectra5236 {
    public static final Pattern FrostHunterAlphaAnimationNeoCosmos5761 = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern FrostHunterBundlePulseFusionHero2475;
    public static final Pattern FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public static final Pattern FrostHunterServiceEliteCelestialThunder1757;

    static {
        String str = FrostHunterGyroscopeHeroAlpha1995.FrostHunterAlphaAnimationNeoCosmos5761;
        Locale locale = Locale.US;
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        FrostHunterBundlePulseFusionHero2475 = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        FrostHunterServiceEliteCelestialThunder1757 = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF FrostHunterAlphaAnimationNeoCosmos5761(String str) {
        String group;
        String group2;
        Matcher matcher = FrostHunterConstraintSetCloneMasterUltraRogue2633.matcher(str);
        Matcher matcher2 = FrostHunterBundlePulseFusionHero2475.matcher(str);
        boolean find = matcher.find();
        boolean find2 = matcher2.find();
        if (find) {
            if (find2) {
                FrostHunterDrawerLayoutUltraStrike3303.FrostHunterMagnetometerFusionTitanium8202("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            group = matcher.group(1);
            group2 = matcher.group(2);
        } else {
            if (!find2) {
                return null;
            }
            group = matcher2.group(1);
            group2 = matcher2.group(2);
        }
        group.getClass();
        float parseFloat = Float.parseFloat(group.trim());
        group2.getClass();
        return new PointF(parseFloat, Float.parseFloat(group2.trim()));
    }
}
