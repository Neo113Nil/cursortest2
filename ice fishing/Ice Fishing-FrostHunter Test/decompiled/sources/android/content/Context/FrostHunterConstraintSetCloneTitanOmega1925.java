package android.content.Context;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterConstraintSetCloneTitanOmega1925 {
    public static final Pattern FrostHunterBundlePulseFusionHero2475 = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern FrostHunterServiceEliteCelestialThunder1757 = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final FrostHunterLicensingSpectraPulse8868 FrostHunterAlphaAnimationNeoCosmos5761 = new FrostHunterLicensingSpectraPulse8868();
    public final StringBuilder FrostHunterConstraintSetCloneMasterUltraRogue2633 = new StringBuilder();

    public static String FrostHunterAlphaAnimationNeoCosmos5761(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
        int i2 = frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475;
        while (i < i2 && !z) {
            char c = (char) frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(i - frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        return sb.toString();
    }

    public static void FrostHunterBundlePulseFusionHero2475(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868) {
        while (true) {
            for (boolean z = true; frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() > 0 && z; z = false) {
                int i = frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633;
                byte[] bArr = frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761;
                byte b = bArr[i];
                char c = (char) b;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(1);
                } else {
                    int i2 = frostHunterLicensingSpectraPulse8868.FrostHunterBundlePulseFusionHero2475;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            frostHunterLicensingSpectraPulse8868.FrostHunterFCMDeltaQuantumHero8364(i2 - frostHunterLicensingSpectraPulse8868.FrostHunterConstraintSetCloneMasterUltraRogue2633);
                        }
                    }
                }
            }
            return;
        }
    }

    public static String FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterLicensingSpectraPulse8868 frostHunterLicensingSpectraPulse8868, StringBuilder sb) {
        FrostHunterBundlePulseFusionHero2475(frostHunterLicensingSpectraPulse8868);
        if (frostHunterLicensingSpectraPulse8868.FrostHunterAlphaAnimationNeoCosmos5761() == 0) {
            return null;
        }
        String FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterAlphaAnimationNeoCosmos5761(frostHunterLicensingSpectraPulse8868, sb);
        if (!FrostHunterAlphaAnimationNeoCosmos5761.isEmpty()) {
            return FrostHunterAlphaAnimationNeoCosmos5761;
        }
        return "" + ((char) frostHunterLicensingSpectraPulse8868.FrostHunterMeteringPointBetaCyber9571());
    }
}
