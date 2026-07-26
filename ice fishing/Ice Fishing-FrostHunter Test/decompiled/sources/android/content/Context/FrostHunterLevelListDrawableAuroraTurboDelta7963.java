package android.content.Context;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterLevelListDrawableAuroraTurboDelta7963 {
    public final int FrostHunterAlphaAnimationNeoCosmos5761;
    public final long FrostHunterBundlePulseFusionHero2475;
    public final int FrostHunterConstraintSetCloneMasterUltraRogue2633;
    public final byte[] FrostHunterServiceEliteCelestialThunder1757;

    public FrostHunterLevelListDrawableAuroraTurboDelta7963(long j, byte[] bArr, int i, int i2) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = i;
        this.FrostHunterConstraintSetCloneMasterUltraRogue2633 = i2;
        this.FrostHunterBundlePulseFusionHero2475 = j;
        this.FrostHunterServiceEliteCelestialThunder1757 = bArr;
    }

    public static FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterAlphaAnimationNeoCosmos5761(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[FrostHunterPaintThunderBetaLegend4180.FrostHunterCardViewSpectraCyber7714[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new FrostHunterLevelListDrawableAuroraTurboDelta7963(wrap.array(), 4, 1);
    }

    public static FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterBundlePulseFusionHero2475(int i, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[FrostHunterPaintThunderBetaLegend4180.FrostHunterCardViewSpectraCyber7714[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new FrostHunterLevelListDrawableAuroraTurboDelta7963(wrap.array(), 3, 1);
    }

    public static FrostHunterLevelListDrawableAuroraTurboDelta7963 FrostHunterConstraintSetCloneMasterUltraRogue2633(FrostHunterConstraintSetTitaniumGamma8871 frostHunterConstraintSetTitaniumGamma8871, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[FrostHunterPaintThunderBetaLegend4180.FrostHunterCardViewSpectraCyber7714[5]]);
        wrap.order(byteOrder);
        FrostHunterConstraintSetTitaniumGamma8871 frostHunterConstraintSetTitaniumGamma88712 = new FrostHunterConstraintSetTitaniumGamma8871[]{frostHunterConstraintSetTitaniumGamma8871}[0];
        wrap.putInt((int) frostHunterConstraintSetTitaniumGamma88712.FrostHunterAlphaAnimationNeoCosmos5761);
        wrap.putInt((int) frostHunterConstraintSetTitaniumGamma88712.FrostHunterConstraintSetCloneMasterUltraRogue2633);
        return new FrostHunterLevelListDrawableAuroraTurboDelta7963(wrap.array(), 5, 1);
    }

    public final String FrostHunterLevelListDrawableFusionDragonHero2232(ByteOrder byteOrder) {
        Object FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRemoteConfigSpeedSpeed8566(byteOrder);
        if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
            return null;
        }
        if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof String) {
            return (String) FrostHunterRemoteConfigSpeedSpeed8566;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof long[]) {
            long[] jArr = (long[]) FrostHunterRemoteConfigSpeedSpeed8566;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof int[]) {
            int[] iArr = (int[]) FrostHunterRemoteConfigSpeedSpeed8566;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof double[]) {
            double[] dArr = (double[]) FrostHunterRemoteConfigSpeedSpeed8566;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(FrostHunterRemoteConfigSpeedSpeed8566 instanceof FrostHunterConstraintSetTitaniumGamma8871[])) {
            return null;
        }
        FrostHunterConstraintSetTitaniumGamma8871[] frostHunterConstraintSetTitaniumGamma8871Arr = (FrostHunterConstraintSetTitaniumGamma8871[]) FrostHunterRemoteConfigSpeedSpeed8566;
        while (i < frostHunterConstraintSetTitaniumGamma8871Arr.length) {
            sb.append(frostHunterConstraintSetTitaniumGamma8871Arr[i].FrostHunterAlphaAnimationNeoCosmos5761);
            sb.append('/');
            sb.append(frostHunterConstraintSetTitaniumGamma8871Arr[i].FrostHunterConstraintSetCloneMasterUltraRogue2633);
            i++;
            if (i != frostHunterConstraintSetTitaniumGamma8871Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final int FrostHunterLifecycleBlazeGammaElite2889(ByteOrder byteOrder) {
        Object FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRemoteConfigSpeedSpeed8566(byteOrder);
        if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof String) {
            return Integer.parseInt((String) FrostHunterRemoteConfigSpeedSpeed8566);
        }
        if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof long[]) {
            long[] jArr = (long[]) FrostHunterRemoteConfigSpeedSpeed8566;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(FrostHunterRemoteConfigSpeedSpeed8566 instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) FrostHunterRemoteConfigSpeedSpeed8566;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:82|(2:84|(2:85|(2:87|(2:90|91)(1:89))(2:92|93)))|94|(2:96|(6:105|106|107|108|109|110)(3:98|(2:100|101)(2:103|104)|102))|113|107|108|109|110) */
    /* JADX WARN: Type inference failed for: r11v11, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r11v13, types: [android.content.Context.FrostHunterConstraintSetTitaniumGamma8871[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v14, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v15, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v16, types: [android.content.Context.FrostHunterConstraintSetTitaniumGamma8871[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v17, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r11v18, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable FrostHunterRemoteConfigSpeedSpeed8566(ByteOrder byteOrder) {
        FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike4956;
        byte b;
        byte[] bArr = this.FrostHunterServiceEliteCelestialThunder1757;
        FrostHunterGuidelineAuroraStrike4956 frostHunterGuidelineAuroraStrike49562 = null;
        try {
            frostHunterGuidelineAuroraStrike4956 = new FrostHunterGuidelineAuroraStrike4956(bArr);
        } catch (IOException unused) {
            frostHunterGuidelineAuroraStrike4956 = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            frostHunterGuidelineAuroraStrike4956.FrostHunterAlertDialogAuroraDelta3200 = byteOrder;
            int i = this.FrostHunterAlphaAnimationNeoCosmos5761;
            int i2 = 0;
            int i3 = this.FrostHunterConstraintSetCloneMasterUltraRogue2633;
            switch (i) {
                case 1:
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                        String str = new String(bArr, FrostHunterPaintThunderBetaLegend4180.FrostHunterR8MasterNebulaSpark7247);
                        try {
                            frostHunterGuidelineAuroraStrike4956.close();
                        } catch (IOException unused2) {
                        }
                        return str;
                    }
                    String str2 = new String(new char[]{(char) (b + 48)});
                    try {
                        frostHunterGuidelineAuroraStrike4956.close();
                    } catch (IOException unused3) {
                    }
                    return str2;
                case 2:
                case FrostHunterRemoteModelManagerCyberLegend2797.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (i3 >= FrostHunterPaintThunderBetaLegend4180.FrostHunterViewPhantomNeo1634.length) {
                        int i4 = 0;
                        while (true) {
                            byte[] bArr2 = FrostHunterPaintThunderBetaLegend4180.FrostHunterViewPhantomNeo1634;
                            if (i4 >= bArr2.length) {
                                i2 = bArr2.length;
                            } else if (bArr[i4] == bArr2[i4]) {
                                i4++;
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    while (i2 < i3) {
                        byte b2 = bArr[i2];
                        if (b2 == 0) {
                            String sb2 = sb.toString();
                            frostHunterGuidelineAuroraStrike4956.close();
                            return sb2;
                        }
                        if (b2 >= 32) {
                            sb.append((char) b2);
                        } else {
                            sb.append('?');
                        }
                        i2++;
                    }
                    String sb22 = sb.toString();
                    frostHunterGuidelineAuroraStrike4956.close();
                    return sb22;
                case 3:
                    ?? r11 = new int[i3];
                    while (i2 < i3) {
                        r11[i2] = frostHunterGuidelineAuroraStrike4956.readUnsignedShort();
                        i2++;
                    }
                    try {
                        frostHunterGuidelineAuroraStrike4956.close();
                    } catch (IOException unused4) {
                    }
                    return r11;
                case 4:
                    ?? r112 = new long[i3];
                    while (i2 < i3) {
                        r112[i2] = frostHunterGuidelineAuroraStrike4956.readInt() & 4294967295L;
                        i2++;
                    }
                    try {
                        frostHunterGuidelineAuroraStrike4956.close();
                    } catch (IOException unused5) {
                    }
                    return r112;
                case FrostHunterRemoteModelManagerCyberLegend2797.STRING_FIELD_NUMBER /* 5 */:
                    ?? r113 = new FrostHunterConstraintSetTitaniumGamma8871[i3];
                    while (i2 < i3) {
                        r113[i2] = new FrostHunterConstraintSetTitaniumGamma8871(frostHunterGuidelineAuroraStrike4956.readInt() & 4294967295L, frostHunterGuidelineAuroraStrike4956.readInt() & 4294967295L);
                        i2++;
                    }
                    try {
                        frostHunterGuidelineAuroraStrike4956.close();
                    } catch (IOException unused6) {
                    }
                    return r113;
                case FrostHunterRemoteModelManagerCyberLegend2797.BYTES_FIELD_NUMBER /* 8 */:
                    ?? r114 = new int[i3];
                    while (i2 < i3) {
                        r114[i2] = frostHunterGuidelineAuroraStrike4956.readShort();
                        i2++;
                    }
                    try {
                        frostHunterGuidelineAuroraStrike4956.close();
                    } catch (IOException unused7) {
                    }
                    return r114;
                case 9:
                    ?? r115 = new int[i3];
                    while (i2 < i3) {
                        r115[i2] = frostHunterGuidelineAuroraStrike4956.readInt();
                        i2++;
                    }
                    try {
                        frostHunterGuidelineAuroraStrike4956.close();
                    } catch (IOException unused8) {
                    }
                    return r115;
                case 10:
                    ?? r116 = new FrostHunterConstraintSetTitaniumGamma8871[i3];
                    while (i2 < i3) {
                        r116[i2] = new FrostHunterConstraintSetTitaniumGamma8871(frostHunterGuidelineAuroraStrike4956.readInt(), frostHunterGuidelineAuroraStrike4956.readInt());
                        i2++;
                    }
                    try {
                        frostHunterGuidelineAuroraStrike4956.close();
                    } catch (IOException unused9) {
                    }
                    return r116;
                case 11:
                    ?? r117 = new double[i3];
                    while (i2 < i3) {
                        r117[i2] = frostHunterGuidelineAuroraStrike4956.readFloat();
                        i2++;
                    }
                    try {
                        frostHunterGuidelineAuroraStrike4956.close();
                    } catch (IOException unused10) {
                    }
                    return r117;
                case 12:
                    ?? r118 = new double[i3];
                    while (i2 < i3) {
                        r118[i2] = frostHunterGuidelineAuroraStrike4956.readDouble();
                        i2++;
                    }
                    try {
                        frostHunterGuidelineAuroraStrike4956.close();
                    } catch (IOException unused11) {
                    }
                    return r118;
                default:
                    try {
                        frostHunterGuidelineAuroraStrike4956.close();
                    } catch (IOException unused12) {
                    }
                    return null;
            }
        } catch (IOException unused13) {
            if (frostHunterGuidelineAuroraStrike4956 != null) {
                try {
                    frostHunterGuidelineAuroraStrike4956.close();
                } catch (IOException unused14) {
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            frostHunterGuidelineAuroraStrike49562 = frostHunterGuidelineAuroraStrike4956;
            if (frostHunterGuidelineAuroraStrike49562 != null) {
                try {
                    frostHunterGuidelineAuroraStrike49562.close();
                } catch (IOException unused15) {
                }
            }
            throw th;
        }
    }

    public final double FrostHunterServiceEliteCelestialThunder1757(ByteOrder byteOrder) {
        Object FrostHunterRemoteConfigSpeedSpeed8566 = FrostHunterRemoteConfigSpeedSpeed8566(byteOrder);
        if (FrostHunterRemoteConfigSpeedSpeed8566 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof String) {
            return Double.parseDouble((String) FrostHunterRemoteConfigSpeedSpeed8566);
        }
        if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof long[]) {
            if (((long[]) FrostHunterRemoteConfigSpeedSpeed8566).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof int[]) {
            if (((int[]) FrostHunterRemoteConfigSpeedSpeed8566).length == 1) {
                return r3[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (FrostHunterRemoteConfigSpeedSpeed8566 instanceof double[]) {
            double[] dArr = (double[]) FrostHunterRemoteConfigSpeedSpeed8566;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(FrostHunterRemoteConfigSpeedSpeed8566 instanceof FrostHunterConstraintSetTitaniumGamma8871[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        FrostHunterConstraintSetTitaniumGamma8871[] frostHunterConstraintSetTitaniumGamma8871Arr = (FrostHunterConstraintSetTitaniumGamma8871[]) FrostHunterRemoteConfigSpeedSpeed8566;
        if (frostHunterConstraintSetTitaniumGamma8871Arr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        FrostHunterConstraintSetTitaniumGamma8871 frostHunterConstraintSetTitaniumGamma8871 = frostHunterConstraintSetTitaniumGamma8871Arr[0];
        return frostHunterConstraintSetTitaniumGamma8871.FrostHunterAlphaAnimationNeoCosmos5761 / frostHunterConstraintSetTitaniumGamma8871.FrostHunterConstraintSetCloneMasterUltraRogue2633;
    }

    public final String toString() {
        return "(" + FrostHunterPaintThunderBetaLegend4180.FrostHunterDatabaseEliteShadowUltra2452[this.FrostHunterAlphaAnimationNeoCosmos5761] + ", data length:" + this.FrostHunterServiceEliteCelestialThunder1757.length + ")";
    }

    public FrostHunterLevelListDrawableAuroraTurboDelta7963(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }
}
