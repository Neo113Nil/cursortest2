package com.instagram.common.viewpoint.core;

import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class HL {
    public static byte[] A09;
    public static String[] A0A = {"EsB1Svc2O0r", "neXgiGAVZF2hPSW", "e5UrGC6TzR", "xWVfqfZ1XD25z1nFBwMIBfHnywy3RQhb", "m9mgew9TdIxun9z0pjAF4NJPGlbJBstI", "nE", "RVA0jPrNpk", "4CgUEtTVWe3Kq65nNHH5xBV3YKPxdnIZ"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;
    public final List<byte[]> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static HL A00(C06674v c06674v) throws C3K {
        try {
            c06674v.A0g(21);
            int A0I = c06674v.A0I() & 3;
            int A0I2 = c06674v.A0I();
            int i = 0;
            int A092 = c06674v.A09();
            for (int i4 = 0; i4 < A0I2; i4++) {
                c06674v.A0g(1);
                int A0M = c06674v.A0M();
                for (int i6 = 0; i6 < A0M; i6++) {
                    int A0M2 = c06674v.A0M();
                    i += A0M2 + 4;
                    c06674v.A0g(A0M2);
                }
            }
            c06674v.A0f(A092);
            byte[] bArr = new byte[i];
            int i9 = 0;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            float f2 = 1.0f;
            String str = null;
            for (int i15 = 0; i15 < A0I2; i15++) {
                int A0I3 = c06674v.A0I() & 63;
                int A0M3 = c06674v.A0M();
                for (int i16 = 0; i16 < A0M3; i16++) {
                    int A0M4 = c06674v.A0M();
                    System.arraycopy(HS.A03, 0, bArr, i9, HS.A03.length);
                    int length = i9 + HS.A03.length;
                    System.arraycopy(c06674v.A0l(), c06674v.A09(), bArr, length, A0M4);
                    if (A0I3 == 33 && i16 == 0) {
                        HP A05 = HS.A05(bArr, length, length + A0M4);
                        i10 = A05.A0A;
                        i11 = A05.A08;
                        i12 = A05.A02;
                        i13 = A05.A01;
                        i14 = A05.A03;
                        f2 = A05.A00;
                        str = AnonymousClass46.A03(A05.A07, A05.A0B, A05.A06, A05.A05, A05.A0C, A05.A04);
                    }
                    i9 = length + A0M4;
                    c06674v.A0g(A0M4);
                }
            }
            return new HL(i == 0 ? Collections.emptyList() : Collections.singletonList(bArr), A0I + 1, i10, i11, f2, str, i12, i13, i14);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw C3K.A01(A01(0, 25, a.f22514Q), e9);
        }
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0A[5].length() == 29) {
                throw new RuntimeException();
            }
            A0A[5] = "YyBlh7kREcvGfk8zeLahZrRMr2fR36";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 68);
            i9++;
        }
    }

    public static void A02() {
        A09 = new byte[]{Byte.MAX_VALUE, 72, 72, 85, 72, 26, 74, 91, 72, 73, 83, 84, 93, 26, 114, Byte.MAX_VALUE, 108, 121, 26, 89, 85, 84, 92, 83, 93};
    }

    static {
        A02();
    }

    public HL(List<byte[]> initializationData, int i, int i4, int i6, float f2, String str, int i9, int i10, int i11) {
        this.A08 = initializationData;
        this.A05 = i;
        this.A06 = i4;
        this.A04 = i6;
        this.A00 = f2;
        this.A07 = str;
        this.A02 = i9;
        this.A01 = i10;
        this.A03 = i11;
    }
}
