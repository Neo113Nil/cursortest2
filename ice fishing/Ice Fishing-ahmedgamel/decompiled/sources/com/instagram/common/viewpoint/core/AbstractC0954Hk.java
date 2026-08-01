package com.instagram.common.viewpoint.core;

import android.util.Base64;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.foundation.h.p;
import com.facebook.ads.androidx.media3.common.Metadata;
import com.facebook.ads.androidx.media3.extractor.metadata.flac.PictureFrame;
import com.facebook.ads.androidx.media3.extractor.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Hk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0954Hk {
    public static byte[] A00;
    public static String[] A01 = {"AQUfun8uWtpAPz6T54JXA8DVdz19i7cg", "A9xQ060X7I53O0IPhfx7pChTdPn89BVs", "HA6OUY8aFXslM4giueBriDg2S", "9RrkKnX7ioGd8UIKmUAG7ayOJ1mW6fCZ", "mjtW7HF4JFIVQBQAuWhSkP1cuiqQ", "mMlJtFouJ3Md3SAWQWV0HJ1iYftjtiDS", "", "7UUPgjEseHhf3IW21ENlLsXr9tr9mert"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C0953Hj A06(C06474v c06474v) throws C3K {
        A0C(1, c06474v, false);
        int A0F = c06474v.A0F();
        int A0I = c06474v.A0I();
        int A0F2 = c06474v.A0F();
        int A0E = c06474v.A0E();
        if (A0E <= 0) {
            A0E = -1;
        }
        int A0E2 = c06474v.A0E();
        if (A0E2 <= 0) {
            A0E2 = -1;
        }
        int A0E3 = c06474v.A0E();
        if (A0E3 <= 0) {
            A0E3 = -1;
            String[] strArr = A01;
            if (strArr[6].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "";
            strArr2[4] = "hx6vx8O5nOwfxHxHuzSsxOXMbdPf";
        }
        int A0I2 = c06474v.A0I();
        return new C0953Hj(A0F, A0I, A0F2, A0E, A0E2, A0E3, (int) Math.pow(2.0d, A0I2 & 15), (int) Math.pow(2.0d, (A0I2 & 240) >> 4), (c06474v.A0I() & 1) > 0, Arrays.copyOf(c06474v.A0l(), c06474v.A0A()));
    }

    public static String A07(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{107, 25, 62, 54, 51, 58, 59, Byte.MAX_VALUE, 43, 48, Byte.MAX_VALUE, 47, 62, 45, 44, 58, Byte.MAX_VALUE, 9, 48, 45, 61, 54, 44, Byte.MAX_VALUE, 60, 48, 50, 50, 58, 49, 43, 101, Byte.MAX_VALUE, 40, 15, 7, 2, 11, 10, 78, 26, 1, 78, 30, 15, 28, 29, 11, 78, 24, 1, 28, 12, 7, 29, 78, 30, 7, 13, 26, 27, 28, 11, 118, 126, 111, 122, Byte.MAX_VALUE, 122, 111, 122, 100, 121, 119, 116, 120, 112, 100, 107, 114, 120, 111, 110, 105, 126, 62, 7, 26, 10, 1, 27, 61, 28, 1, 4, 58, 39, 47, 58, 60, 43, 58, 59, Byte.MAX_VALUE, 60, 55, 62, 45, 62, 60, 43, 58, 45, 44, Byte.MAX_VALUE, 120, 41, 48, 45, 61, 54, 44, 120, c.f16317b, 93, 85, c.f16317b, 70, 81, c.f16317b, 65, 5, 70, 74, 65, c.f16317b, 5, 71, 74, 74, 78, 5, 81, 74, 5, 86, 81, 68, 87, 81, 5, 82, 76, 81, 77, 5, 126, 21, 93, 16, 19, 9, 5, 21, 93, 17, 22, 9, 5, 21, 93, 17, 23, 120, 5, 68, 81, 5, 62, 35, 43, 62, 56, 47, 62, c.f16318c, 123, 51, 62, 58, c.f16318c, 62, 41, 123, 47, 34, 43, 62, 123, 107, 97, 98, 98, Byte.MAX_VALUE, 45, 121, 116, 125, 104, 45, 106, Byte.MAX_VALUE, 104, 108, 121, 104, Byte.MAX_VALUE, 45, 121, 101, 108, 99, 45, 60, 45, 99, 98, 121, 45, 105, 104, 110, 98, 105, 108, 111, 97, 104, 55, 45, 97, 117, 102, 106, 110, 105, 96, 39, 101, 110, 115, 39, 102, 97, 115, 98, 117, 39, 106, 104, 99, 98, 116, 39, 105, 104, 115, 39, 116, 98, 115, 39, 102, 116, 39, 98, Byte.MAX_VALUE, 119, 98, 100, 115, 98, 99, 38, 50, 33, 45, 41, 46, 39, 96, 34, 41, 52, 96, 37, 56, 48, 37, 35, 52, 37, 36, 96, 52, 47, 96, 34, 37, 96, 51, 37, 52, 2, 1, 1, 5, 27, 30, 78, 26, 23, 30, 11, 78, 9, 28, 11, 15, 26, 11, 28, 78, 26, 6, 15, 0, 78, 92, 78, 0, 1, 26, 78, 10, 11, 13, 1, 10, 15, 12, 2, 11, 84, 78, 56, 52, 37, 37, 60, 59, 50, 117, 33, 44, 37, 48, 117, 58, 33, 61, 48, 39, 117, 33, 61, 52, 59, 117, 101, 117, 59, 58, 33, 117, 38, 32, 37, 37, 58, 39, 33, 48, 49, 111, 117, 108, 112, 125, Byte.MAX_VALUE, 121, 116, 115, 112, 120, 121, 110, 60, 115, 122, 60, 104, 117, 113, 121, 60, 120, 115, 113, 125, 117, 114, 60, 104, 110, 125, 114, 111, 122, 115, 110, 113, 111, 60, 114, 115, 104, 60, 102, 121, 110, 115, 121, 120, 60, 115, 105, 104, c.f16317b, 87, 65, 91, 86, 71, 87, 102, 75, 66, 87, 18, 85, c.f16317b, 87, 83, 70, 87, c.f16317b, 18, 70, 90, 83, 92, 18, 0, 18, 91, 65, 18, 92, 93, 70, 18, 86, 87, 81, 93, 86, 83, 80, 94, 87, 93, 70, 9, 91, 76, 90, 76, 91, 95, 76, 77, 9, 75, c.f16317b, 93, 90, 9, 68, 92, 90, 93, 9, 75, 76, 9, 83, 76, 91, 70, 9, 72, 79, 93, 76, 91, 9, 68, 72, 89, 89, c.f16317b, 71, 78, 9, 74, 70, 92, 89, 69, c.f16317b, 71, 78, 9, 90, 93, 76, 89, 90, 16, 11, 11, 68, 23, 12, 11, 22, 16, 68, 12, 1, 5, 0, 1, 22, 94, 68};
    }

    static {
        A08();
    }

    public static int A00(int i) {
        int val = 0;
        while (i > 0) {
            val++;
            i >>>= 1;
        }
        return val;
    }

    public static long A01(long j6, long j9) {
        return (long) Math.floor(Math.pow(j6, 1.0d / j9));
    }

    public static Metadata A02(List<String> list) {
        List<String> vorbisComments = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] A1P = C5C.A1P(str, A07(0, 1, 56));
            int length = A1P.length;
            String A07 = A07(85, 10, 6);
            if (length != 2) {
                AbstractC06324g.A07(A07, A07(1, 32, 49) + str);
            } else {
                String[] strArr = A01;
                String str2 = strArr[6];
                String str3 = strArr[4];
                int i6 = str2.length();
                if (i6 == str3.length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[6] = "";
                strArr2[4] = "IFt3u6Tbn0k1mtPtGSJYRwNJh6dv";
                if (A1P[0].equals(A07(63, 22, 85))) {
                    try {
                        vorbisComments.add(PictureFrame.A00(new C06474v(Base64.decode(A1P[1], 0))));
                    } catch (RuntimeException e9) {
                        AbstractC06324g.A0A(A07, A07(33, 30, 0), e9);
                    }
                } else {
                    vorbisComments.add(new VorbisComment(A1P[0], A1P[1]));
                }
            }
        }
        if (vorbisComments.isEmpty()) {
            return null;
        }
        return new Metadata(vorbisComments);
    }

    /* JADX WARN: Incorrect condition in loop: B:50:0x009f */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0026 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0950Hg A03(C0949Hf c0949Hf) throws C3K {
        long j6;
        if (c0949Hf.A02(24) == 5653314) {
            int A02 = c0949Hf.A02(16);
            int lookupType = c0949Hf.A02(24);
            long[] jArr = new long[lookupType];
            boolean A04 = c0949Hf.A04();
            if (!A04) {
                boolean A042 = c0949Hf.A04();
                for (int i = 0; i < entries; i++) {
                    if (A042) {
                        if (c0949Hf.A04()) {
                            int entries = c0949Hf.A02(5);
                            jArr[i] = entries + 1;
                        } else {
                            String[] strArr = A01;
                            String str = strArr[7];
                            String str2 = strArr[0];
                            int dimensions = str.charAt(2);
                            int entries2 = str2.charAt(2);
                            if (dimensions != entries2) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A01;
                            strArr2[7] = "HkUiXrMYXoP7dmmSwm7TlUKenEWhRSa7";
                            strArr2[0] = "g3UzzRsN8l9NwZbA9Pl4zDU4WOGu2UFV";
                            jArr[i] = 0;
                        }
                    } else {
                        int i6 = c0949Hf.A02(5);
                        String[] strArr3 = A01;
                        String str3 = strArr3[6];
                        String str4 = strArr3[4];
                        int dimensions2 = str3.length();
                        int entries3 = str4.length();
                        if (dimensions2 != entries3) {
                            String[] strArr4 = A01;
                            strArr4[3] = "YIXxF7uzVQ2KRDIuTFnKuNVMBeAy43Wm";
                            strArr4[1] = "ZNrvF1xji8SwPYIxx9WGKrLEtje0Ya68";
                            jArr[i] = i6 + 1;
                        } else {
                            A01[2] = "PN1PQj6gHBTdVMYKSOEyBSZrD";
                            jArr[i] = i6 + 1;
                        }
                    }
                }
            } else {
                int i9 = c0949Hf.A02(5);
                int i10 = i9 + 1;
                int i11 = 0;
                while (i11 < entries) {
                    int entries4 = lookupType - i11;
                    int A022 = c0949Hf.A02(A00(entries4));
                    for (int length = 0; length < A022; length++) {
                        int entries5 = jArr.length;
                        if (i11 < entries5) {
                            jArr[i11] = i10;
                            i11++;
                        }
                    }
                    i10++;
                }
            }
            int A023 = c0949Hf.A02(4);
            if (A023 <= 2) {
                if (A023 == 1 || A023 == 2) {
                    c0949Hf.A03(32);
                    c0949Hf.A03(32);
                    int A024 = c0949Hf.A02(4) + 1;
                    c0949Hf.A03(1);
                    if (A023 == 1) {
                        if (A02 == 0) {
                            j6 = 0;
                        } else {
                            long j9 = lookupType;
                            String[] strArr5 = A01;
                            String str5 = strArr5[3];
                            String str6 = strArr5[1];
                            int dimensions3 = str5.charAt(14);
                            int entries6 = str6.charAt(14);
                            if (dimensions3 != entries6) {
                                throw new RuntimeException();
                            }
                            A01[5] = "D9mmqqJmTqnxQ2dihdU3MUH7YK6oq28f";
                            j6 = A01(j9, A02);
                        }
                    } else {
                        j6 = lookupType * A02;
                    }
                    int entries7 = (int) (A024 * j6);
                    c0949Hf.A03(entries7);
                }
                return new C0950Hg(A02, lookupType, jArr, A023, A04);
            }
            throw C3K.A01(A07(313, 42, 0) + A023, null);
        }
        throw C3K.A01(A07(123, 55, 75) + c0949Hf.A01(), null);
    }

    public static C0951Hh A04(C06474v c06474v) throws C3K {
        return A05(c06474v, true, true);
    }

    /* JADX WARN: Incorrect condition in loop: B:5:0x0025 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0951Hh A05(C06474v c06474v, boolean z3, boolean z6) throws C3K {
        if (z3) {
            A0C(3, c06474v, false);
        }
        int length = (int) c06474v.A0O();
        String A0W = c06474v.A0W(length);
        int length2 = A0W.length();
        int i = 7 + 4 + length2;
        long A0O = c06474v.A0O();
        int length3 = (int) A0O;
        String[] comments = new String[length3];
        int i6 = i + 4;
        int i9 = 0;
        while (commentListLen < A0O) {
            long commentListLen = c06474v.A0O();
            int length4 = (int) commentListLen;
            comments[i9] = c06474v.A0W(length4);
            int length5 = comments[i9].length();
            i6 = i6 + 4 + length5;
            i9++;
        }
        if (z6) {
            int length6 = c06474v.A0I();
            if ((length6 & 1) == 0) {
                String vendor = A07(283, 30, 46);
                throw C3K.A01(vendor, null);
            }
        }
        return new C0951Hh(A0W, comments, i6 + 1);
    }

    public static void A09(int i, C0949Hf c0949Hf) throws C3K {
        int i6;
        int A02 = c0949Hf.A02(6) + 1;
        for (int i9 = 0; i9 < A02; i9++) {
            int A022 = c0949Hf.A02(16);
            if (A022 != 0) {
                AbstractC06324g.A05(A07(85, 10, 6), A07(355, 41, 59) + A022);
            } else {
                if (c0949Hf.A04()) {
                    int A023 = c0949Hf.A02(4);
                    String[] strArr = A01;
                    String str = strArr[7];
                    String str2 = strArr[0];
                    int charAt = str.charAt(2);
                    int mappingsCount = str2.charAt(2);
                    if (charAt != mappingsCount) {
                        throw new RuntimeException();
                    }
                    A01[5] = "MSIFAaOSOQQOpmu0PO7aKrLsJb3QFagu";
                    i6 = A023 + 1;
                } else {
                    i6 = 1;
                }
                if (c0949Hf.A04()) {
                    int i10 = c0949Hf.A02(8);
                    int i11 = i10 + 1;
                    for (int i12 = 0; i12 < i11; i12++) {
                        int mappingsCount2 = i - 1;
                        c0949Hf.A03(A00(mappingsCount2));
                        int mappingsCount3 = i - 1;
                        c0949Hf.A03(A00(mappingsCount3));
                    }
                }
                int mappingsCount4 = c0949Hf.A02(2);
                if (mappingsCount4 == 0) {
                    if (i6 > 1) {
                        for (int mappingsCount5 = 0; mappingsCount5 < i; mappingsCount5++) {
                            c0949Hf.A03(4);
                        }
                    }
                    for (int i13 = 0; i13 < i6; i13++) {
                        c0949Hf.A03(8);
                        String[] strArr2 = A01;
                        String str3 = strArr2[6];
                        String str4 = strArr2[4];
                        int length = str3.length();
                        int mappingsCount6 = str4.length();
                        if (length == mappingsCount6) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A01;
                        strArr3[3] = "W7H2tgam7pgMqyIqKZRQoufJib3tzvKG";
                        strArr3[1] = "g3J7gwvZXejdWYIpZtqDt0lnx57dRd6J";
                        c0949Hf.A03(8);
                        c0949Hf.A03(8);
                    }
                } else {
                    throw C3K.A01(A07(491, 58, 71), null);
                }
            }
        }
    }

    public static void A0A(C0949Hf c0949Hf) throws C3K {
        int A02 = c0949Hf.A02(6) + 1;
        for (int i = 0; i < A02; i++) {
            int A022 = c0949Hf.A02(16);
            switch (A022) {
                case 0:
                    c0949Hf.A03(8);
                    c0949Hf.A03(16);
                    c0949Hf.A03(16);
                    String[] strArr = A01;
                    String str = strArr[6];
                    String str2 = strArr[4];
                    int floorCount = str.length();
                    if (floorCount == str2.length()) {
                        throw new RuntimeException();
                    }
                    A01[2] = "puZWVQ2pTjmoQkTRd3XFOd7V6";
                    c0949Hf.A03(6);
                    c0949Hf.A03(8);
                    int A023 = c0949Hf.A02(4) + 1;
                    for (int floorCount2 = 0; floorCount2 < A023; floorCount2++) {
                        c0949Hf.A03(8);
                    }
                case 1:
                    int j6 = c0949Hf.A02(5);
                    int i6 = -1;
                    int[] partitionClassList = new int[j6];
                    for (int floorCount3 = 0; floorCount3 < j6; floorCount3++) {
                        partitionClassList[floorCount3] = c0949Hf.A02(4);
                        if (partitionClassList[floorCount3] > i6) {
                            i6 = partitionClassList[floorCount3];
                        }
                    }
                    int[] iArr = new int[i6 + 1];
                    for (int j9 = 0; j9 < iArr.length; j9++) {
                        iArr[j9] = c0949Hf.A02(3) + 1;
                        int A024 = c0949Hf.A02(2);
                        if (A024 > 0) {
                            c0949Hf.A03(8);
                        }
                        for (int floorCount4 = 0; floorCount4 < (1 << A024); floorCount4++) {
                            c0949Hf.A03(8);
                        }
                    }
                    c0949Hf.A03(2);
                    int k9 = c0949Hf.A02(4);
                    int j10 = 0;
                    int rangeBits = 0;
                    for (int count = 0; count < j6; count++) {
                        int idx = partitionClassList[count];
                        String[] strArr2 = A01;
                        String str3 = strArr2[7];
                        String str4 = strArr2[0];
                        int floorCount5 = str3.charAt(2);
                        if (floorCount5 != str4.charAt(2)) {
                            throw new RuntimeException();
                        }
                        A01[5] = "4gRGDU2vGyXCYhT5FVmyq5RWvUvygEh7";
                        j10 += iArr[idx];
                        while (rangeBits < j10) {
                            c0949Hf.A03(k9);
                            rangeBits++;
                        }
                    }
                default:
                    throw C3K.A01(A07(199, 41, 99) + A022, null);
            }
        }
    }

    public static void A0B(C0949Hf c0949Hf) throws C3K {
        int A02 = c0949Hf.A02(6) + 1;
        for (int i = 0; i < A02; i++) {
            int residueCount = c0949Hf.A02(16);
            if (residueCount <= 2) {
                c0949Hf.A03(24);
                c0949Hf.A03(24);
                c0949Hf.A03(24);
                int A022 = c0949Hf.A02(6) + 1;
                c0949Hf.A03(8);
                int[] iArr = new int[A022];
                for (int i6 = 0; i6 < A022; i6++) {
                    int residueCount2 = 0;
                    int A023 = c0949Hf.A02(3);
                    if (c0949Hf.A04()) {
                        String[] strArr = A01;
                        String str = strArr[7];
                        String str2 = strArr[0];
                        int residueCount3 = str.charAt(2);
                        if (residueCount3 != str2.charAt(2)) {
                            throw new RuntimeException();
                        }
                        A01[5] = "QebxPehykfYMwUhUEUOD533arJF7pEEp";
                        residueCount2 = c0949Hf.A02(5);
                    }
                    iArr[i6] = (residueCount2 * 8) + A023;
                }
                for (int i9 = 0; i9 < A022; i9++) {
                    for (int i10 = 0; i10 < 8; i10++) {
                        int residueCount4 = iArr[i9];
                        if ((residueCount4 & (1 << i10)) != 0) {
                            c0949Hf.A03(8);
                        }
                    }
                }
            } else {
                throw C3K.A01(A07(p.a.f19675a, 43, 92), null);
            }
        }
    }

    public static boolean A0C(int i, C06474v c06474v, boolean z3) throws C3K {
        if (c06474v.A07() < 7) {
            if (z3) {
                return false;
            }
            throw C3K.A01(A07(549, 18, 10) + c06474v.A07(), null);
        }
        if (c06474v.A0I() != i) {
            if (z3) {
                return false;
            }
            throw C3K.A01(A07(178, 21, 53) + Integer.toHexString(i), null);
        }
        if (c06474v.A0I() != 118 || c06474v.A0I() != 111 || c06474v.A0I() != 114 || c06474v.A0I() != 98 || c06474v.A0I() != 105 || c06474v.A0I() != 115) {
            if (z3) {
                return false;
            }
            throw C3K.A01(A07(95, 28, 49), null);
        }
        return true;
    }

    public static C0952Hi[] A0D(C06474v c06474v, int i) throws C3K {
        A0C(5, c06474v, false);
        int A0I = c06474v.A0I() + 1;
        C0949Hf c0949Hf = new C0949Hf(c06474v.A0l());
        int numberOfBooks = c06474v.A09();
        c0949Hf.A03(numberOfBooks * 8);
        for (int numberOfBooks2 = 0; numberOfBooks2 < A0I; numberOfBooks2++) {
            A03(c0949Hf);
        }
        int numberOfBooks3 = c0949Hf.A02(6);
        int timeCount = numberOfBooks3 + 1;
        for (int i6 = 0; i6 < timeCount; i6++) {
            int numberOfBooks4 = c0949Hf.A02(16);
            if (numberOfBooks4 != 0) {
                throw C3K.A01(A07(396, 52, 114), null);
            }
        }
        A0A(c0949Hf);
        A0B(c0949Hf);
        A09(i, c0949Hf);
        C0952Hi[] A0E = A0E(c0949Hf);
        if (c0949Hf.A04()) {
            return A0E;
        }
        throw C3K.A01(A07(240, 43, 105), null);
    }

    public static C0952Hi[] A0E(C0949Hf c0949Hf) {
        int A02 = c0949Hf.A02(6) + 1;
        C0952Hi[] c0952HiArr = new C0952Hi[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            boolean A04 = c0949Hf.A04();
            int A022 = c0949Hf.A02(16);
            int i = c0949Hf.A02(16);
            c0952HiArr[windowType] = new C0952Hi(A04, A022, i, c0949Hf.A02(8));
        }
        return c0952HiArr;
    }
}
