package android.content.Context;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public abstract class FrostHunterKeyframeGammaGamma2319 {
    public static final FrostHunterBarrierStrikeDragonOlympian9836 FrostHunterAlphaAnimationNeoCosmos5761;
    public static final String[] FrostHunterBundlePulseFusionHero2475;
    public static final String[] FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public static final String[] FrostHunterServiceEliteCelestialThunder1757;

    static {
        FrostHunterBarrierStrikeDragonOlympian9836 frostHunterBarrierStrikeDragonOlympian9836 = FrostHunterBarrierStrikeDragonOlympian9836.FrostHunterKeyframeGammaGamma1197;
        FrostHunterAlphaAnimationNeoCosmos5761 = FrostHunterChipSpeedTitan5326.FrostHunterScaleAnimationStrikeSpark5059("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        FrostHunterConstraintSetCloneMasterUltraRogue2633 = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        FrostHunterBundlePulseFusionHero2475 = new String[64];
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String replace = FrostHunterTextureViewForceEpicQuantum6388.FrostHunterBundlePulseFusionHero2475("%8s", binaryString).replace(' ', '0');
            replace.getClass();
            strArr[i] = replace;
        }
        FrostHunterServiceEliteCelestialThunder1757 = strArr;
        String[] strArr2 = FrostHunterBundlePulseFusionHero2475;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = FrostHunterBundlePulseFusionHero2475;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = FrostHunterKeyEventNovaXAlpha1220.FrostHunterFragmentBetaMegaVortex6025(sb, strArr3[i4], "|PADDED");
        }
        int length = FrostHunterBundlePulseFusionHero2475.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = FrostHunterBundlePulseFusionHero2475;
            if (strArr4[i7] == null) {
                strArr4[i7] = FrostHunterServiceEliteCelestialThunder1757[i7];
            }
        }
    }

    public static String FrostHunterAlphaAnimationNeoCosmos5761(int i) {
        String[] strArr = FrostHunterConstraintSetCloneMasterUltraRogue2633;
        return i < strArr.length ? strArr[i] : FrostHunterTextureViewForceEpicQuantum6388.FrostHunterBundlePulseFusionHero2475("0x%02x", Integer.valueOf(i));
    }

    public static String FrostHunterBundlePulseFusionHero2475(int i, int i2, long j, boolean z) {
        return FrostHunterTextureViewForceEpicQuantum6388.FrostHunterBundlePulseFusionHero2475("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), FrostHunterAlphaAnimationNeoCosmos5761(8), Long.valueOf(j));
    }

    public static String FrostHunterConstraintSetCloneMasterUltraRogue2633(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String FrostHunterAlphaAnimationNeoCosmos57612 = FrostHunterAlphaAnimationNeoCosmos5761(i3);
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr = FrostHunterServiceEliteCelestialThunder1757;
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : strArr[i4];
                } else if (i3 != 7 && i3 != 8) {
                    String[] strArr2 = FrostHunterBundlePulseFusionHero2475;
                    if (i4 < strArr2.length) {
                        str2 = strArr2[i4];
                        str2.getClass();
                    } else {
                        str2 = strArr[i4];
                    }
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(str2, "PRIORITY", "COMPRESSED") : FrostHunterFocusMeteringActionShadowLegend9828.FrostHunterFirebaseModelDownloadConditionsSolarBlaze2223(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i4];
        }
        return FrostHunterTextureViewForceEpicQuantum6388.FrostHunterBundlePulseFusionHero2475("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), FrostHunterAlphaAnimationNeoCosmos57612, str);
    }
}
