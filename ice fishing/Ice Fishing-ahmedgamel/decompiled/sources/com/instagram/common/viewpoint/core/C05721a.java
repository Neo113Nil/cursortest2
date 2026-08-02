package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.1a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05721a extends AbstractC07799j {
    public static byte[] A0H;
    public static String[] A0I = {"m5Q3aiQKICJZrVflAtkG72aHaW7D7vzV", "Te6TlfxhDkM1nSnzhWnFswazR8GhYsIL", "RAA", "kEgqAeLW1EWE377lDOv4M7tHjIvdZKXO", "06ys5nuQ5LNcvNVR71UhF3Tfl10HYLje", "yFo", "kDpjkJehLDjfyQcmHJ0GXPIrbeMaoLDA", "wnjbAtiJPFcw6YA"};
    public C9l A00;
    public float A01;
    public int A02;
    public int A03;
    public long A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final BP<EU> A0B;
    public final float A0C;
    public final int A0D;
    public final long A0E;
    public final AnonymousClass45 A0F;
    public final F6 A0G;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 25
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C05721a(@MetaExoPlayerCustomization("Used for OculusAdaptiveTrackSelection") C2383pg c2383pg, @MetaExoPlayerCustomization("Used to retain old value for Oculus") int[] iArr, int i, F6 f62, int i4, long j6, long j9, long j10, int i6, int i9, float f2, float f9, long j11, List<EU> list, AnonymousClass45 anonymousClass45) {
        super(c2383pg, iArr, i);
        if (j10 < j6) {
            AbstractC06524g.A07(A03(0, 22, 43), A03(22, 90, 50));
            j10 = j6;
        }
        this.A0G = f62;
        this.A0D = i4;
        this.A08 = j6 * 1000;
        this.A0E = j9 * 1000;
        this.A09 = 1000 * j10;
        this.A07 = i6;
        this.A06 = i9;
        this.A0C = f2;
        this.A05 = f9;
        this.A0B = BP.A05(list);
        this.A0A = j11;
        this.A0F = anonymousClass45;
        this.A01 = 1.0f;
        this.A02 = 0;
        this.A04 = b.f7168b;
    }

    public static String A03(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0H, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 89);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0H = new byte[]{-59, -24, -27, -12, -8, -19, -6, -23, -40, -10, -27, -25, -17, -41, -23, -16, -23, -25, -8, -19, -13, -14, -52, -17, -11, 0, -2, -1, -12, -7, -14, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -33, -6, -35, -16, -1, -20, -12, -7, -52, -15, -1, -16, -3, -49, -12, -2, -18, -20, -3, -17, -40, -2, -85, -1, -6, -85, -19, -16, -85, -20, -1, -85, -9, -16, -20, -2, -1, -85, -8, -12, -7, -49, 0, -3, -20, -1, -12, -6, -7, -47, -6, -3, -36, 0, -20, -9, -12, -1, 4, -44, -7, -18, -3, -16, -20, -2, -16, -40, -2};
    }

    static {
        A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<java.lang.Integer> */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BP<BP<EU>> A00(C0898El[] c0898ElArr) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c0898ElArr.length; i++) {
            if (c0898ElArr[i] != null && c0898ElArr[i].A02.length > 1) {
                C2K A01 = BP.A01();
                A01.A04(new EU(0L, 0L));
                arrayList.add(A01);
            } else {
                arrayList.add(null);
            }
        }
        long[][] A06 = A06(c0898ElArr);
        int length = A06.length;
        if (A0I[0].charAt(10) != 'x') {
            A0I[0] = "UXetESR07W40Ugl2KcKxfZnSKo41RBjF";
            int[] iArr = new int[length];
            long[] jArr = new long[A06.length];
            for (int i4 = 0; i4 < A06.length; i4++) {
                int length2 = A06[i4].length;
                if (A0I[0].charAt(10) == 'x') {
                    throw new RuntimeException();
                }
                A0I[7] = "x";
                jArr[i4] = length2 == 0 ? 0L : A06[i4][0];
                String[] strArr = A0I;
                if (strArr[1].charAt(10) != strArr[4].charAt(10)) {
                    String[] strArr2 = A0I;
                    strArr2[1] = "cSuX5sbs1mm7BtC5NofnfdI255eKyli3";
                    strArr2[4] = "Z411JjDvpqHs7gscP9Mv86ZFtFCMjIgX";
                }
            }
            A05(arrayList, jArr);
            BP<Integer> A02 = A02(A06);
            for (int i6 = 0; i6 < A02.size(); i6++) {
                int intValue = A02.get(i6).intValue();
                int i9 = iArr[intValue] + 1;
                iArr[intValue] = i9;
                jArr[intValue] = A06[intValue][i9];
                A05(arrayList, jArr);
            }
            for (int i10 = 0; i10 < c0898ElArr.length; i10++) {
                if (arrayList.get(i10) != null) {
                    jArr[i10] = jArr[i10] * 2;
                }
            }
            A05(arrayList, jArr);
            C2K A012 = BP.A01();
            int i11 = 0;
            while (true) {
                int size = arrayList.size();
                String[] strArr3 = A0I;
                if (strArr3[5].length() != strArr3[2].length()) {
                    String[] strArr4 = A0I;
                    strArr4[5] = "B5d";
                    strArr4[2] = "E7u";
                    if (i11 >= size) {
                        break;
                    }
                    C2K c2k = (C2K) arrayList.get(i11);
                    A012.A04(c2k != null ? BP.A03() : c2k.A05());
                    i11++;
                } else {
                    String[] strArr5 = A0I;
                    strArr5[6] = "P6lwie0zupyVMIziqYi4GtWsnZGWabHp";
                    strArr5[3] = "HBKI3D47JNzwp3E4fcvtN9y7FoJFPrZj";
                    if (i11 >= size) {
                        break;
                    }
                    C2K c2k2 = (C2K) arrayList.get(i11);
                    A012.A04(c2k2 != null ? BP.A03() : c2k2.A05());
                    i11++;
                }
            }
            return A012.A05();
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.q3 != com.google.common.collect.Multimap<java.lang.Double, java.lang.Integer> */
    public static BP<Integer> A02(long[][] jArr) {
        InterfaceC2405q3 A00 = AbstractC2407q5.A02().A03().A00();
        for (int i = 0; i < jArr.length; i++) {
            if (jArr[i].length > 1) {
                double[] logBitrates = new double[jArr[i].length];
                int i4 = 0;
                while (true) {
                    double d9 = 0.0d;
                    if (i4 >= jArr[i].length) {
                        break;
                    }
                    if (jArr[i][i4] != -1) {
                        d9 = Math.log(jArr[i][i4]);
                    }
                    logBitrates[i4] = d9;
                    i4++;
                }
                double d10 = logBitrates[logBitrates.length - 1] - logBitrates[0];
                int i6 = 0;
                for (int i9 = 1; i6 < logBitrates.length - i9; i9 = 1) {
                    A00.AHE(Double.valueOf(d10 == 0.0d ? 1.0d : (((logBitrates[i6] + logBitrates[i6 + 1]) * 0.5d) - logBitrates[0]) / d10), Integer.valueOf(i));
                    i6++;
                }
            }
        }
        return BP.A05(A00.values());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<com.facebook.ads.androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    public static void A05(List<C2K<EU>> list, long[] jArr) {
        long j6 = 0;
        int i = 0;
        while (true) {
            if (i < jArr.length) {
                long j9 = jArr[i];
                String[] strArr = A0I;
                if (strArr[5].length() != strArr[2].length()) {
                    break;
                }
                A0I[0] = "hzQzkxJwAHZ0fRiIn7Pvrd3jIUiof14p";
                j6 += j9;
                i++;
            } else {
                for (int i4 = 0; i4 < list.size(); i4++) {
                    C2K<EU> c2k = list.get(i4);
                    if (A0I[0].charAt(10) != 'x') {
                        A0I[0] = "0V4VZlbFayh1Opq7Ah9Nva0ccysrREXP";
                        if (c2k != null) {
                            c2k.A04(new EU(j6, jArr[i4]));
                        }
                    }
                }
                return;
            }
        }
        throw new RuntimeException();
    }

    public static long[][] A06(C0898El[] c0898ElArr) {
        long j6;
        long[] jArr;
        long[][] jArr2 = new long[c0898ElArr.length][];
        for (int i = 0; i < c0898ElArr.length; i++) {
            C0898El c0898El = c0898ElArr[i];
            if (c0898El == null) {
                jArr2[i] = new long[0];
            } else {
                long[] jArr3 = new long[c0898El.A02.length];
                String[] strArr = A0I;
                String str = strArr[6];
                String str2 = strArr[3];
                int i4 = str.charAt(18);
                if (i4 == str2.charAt(18)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[5] = "e4C";
                strArr2[2] = "lZL";
                jArr2[i] = jArr3;
                for (int i6 = 0; i6 < c0898El.A02.length; i6++) {
                    int j9 = c0898El.A01.A08(c0898El.A02[i6]).A05;
                    int i9 = A0I[7].length();
                    if (i9 != 11) {
                        String[] strArr3 = A0I;
                        strArr3[5] = "HL2";
                        strArr3[2] = "liv";
                        j6 = j9;
                        jArr = jArr2[i];
                        if (j6 != -1) {
                            jArr[i6] = j6;
                        }
                        j6 = 0;
                        jArr[i6] = j6;
                    } else {
                        j6 = j9;
                        jArr = jArr2[i];
                        if (j6 != -1) {
                            jArr[i6] = j6;
                        }
                        j6 = 0;
                        jArr[i6] = j6;
                    }
                }
                Arrays.sort(jArr2[i]);
            }
        }
        return jArr2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC07799j, com.instagram.common.viewpoint.core.InterfaceC2232nE
    public final void A5x() {
        this.A00 = null;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC07799j, com.instagram.common.viewpoint.core.InterfaceC2232nE
    public final void A6K() {
        this.A04 = b.f7168b;
        this.A00 = null;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2232nE
    public final int A93() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC07799j, com.instagram.common.viewpoint.core.InterfaceC2232nE
    public final void AFJ(float f2) {
        this.A01 = f2;
    }
}
