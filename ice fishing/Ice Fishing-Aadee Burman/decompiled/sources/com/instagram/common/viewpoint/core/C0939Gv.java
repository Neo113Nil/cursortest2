package com.instagram.common.viewpoint.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Gv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0939Gv {
    public static byte[] A06;
    public static String[] A07 = {"f", "7N0kip4m3flPJ4wRylUb66l3ycty4bLO", "ZrqOCWQk631j6sxAoqisBRdwge9gr5QF", "2DRaKiCosA9Zs551XHqRbpaUmywwD6L7", "dzNr4lbarI8PqRX9M2ICRMrM1SnLdD", "nBYqh81NM1tC", "zWHuac", "46iX5XNzwkY5yhjGLtKEm3XHMbBVctSm"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List<byte[]> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C0939Gv A00(C06474v c06474v) throws C3K {
        try {
            c06474v.A0g(4);
            int A0I = (c06474v.A0I() & 3) + 1;
            if (A0I == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int A0I2 = c06474v.A0I() & 31;
            for (int i = 0; i < A0I2; i++) {
                arrayList.add(A03(c06474v));
            }
            int A0I3 = c06474v.A0I();
            String[] strArr = A07;
            if (strArr[4].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A07[1] = "rQ6g8gs4UtzNEdd6WIb5nHQ3c92ce055";
            for (int i6 = 0; i6 < A0I3; i6++) {
                arrayList.add(A03(c06474v));
            }
            int i9 = -1;
            int i10 = -1;
            float f3 = 1.0f;
            String str = null;
            if (A0I2 > 0) {
                HR A09 = HS.A09((byte[]) arrayList.get(0), A0I, ((byte[]) arrayList.get(0)).length);
                i9 = A09.A0A;
                i10 = A09.A03;
                f3 = A09.A00;
                str = AnonymousClass46.A01(A09.A08, A09.A01, A09.A04);
            }
            return new C0939Gv(arrayList, A0I, i9, i10, f3, str);
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw C3K.A01(A01(0, 24, 51), e9);
        }
    }

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 30);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{-106, -61, -61, -64, -61, 113, -63, -78, -61, -60, -70, -65, -72, 113, -110, -89, -108, 113, -76, -64, -65, -73, -70, -72};
    }

    static {
        A02();
    }

    public C0939Gv(List<byte[]> initializationData, int i, int i6, int i9, float f3, String str) {
        this.A05 = initializationData;
        this.A02 = i;
        this.A03 = i6;
        this.A01 = i9;
        this.A00 = f3;
        this.A04 = str;
    }

    public static byte[] A03(C06474v c06474v) {
        int A0M = c06474v.A0M();
        int offset = c06474v.A09();
        c06474v.A0g(A0M);
        return AnonymousClass46.A07(c06474v.A0l(), offset, A0M);
    }
}
