package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8U, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8U implements InterfaceC2164mF {
    public static byte[] A06;
    public static String[] A07 = {"QubeI9WU03qBZcNvE4IUkWvlw0NRrBK6", "F1d068LLA73yClDAGmhas6o", "9YpbVeLOd0f6m", "7Ycu3nAZXESMUbUrutcG9271koISuOhT", "QjcyZL4t35rbWMpE5hp6oYgD7sVhkS0D", "M48I8dHdEQTg0rHaHaNT6qI1", "cVfJzOsNywAlxLknvQSr1dDTMZn5TIAU", "kJeh17rnzHgOQ2HfO7oDpw4wPPnH7lFe"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long[] A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C8U A01(long j6, long j9, HN hn, C06474v c06474v) {
        int A0L;
        int i = hn.A04;
        int i6 = hn.A03;
        int A0C = c06474v.A0C();
        if ((A0C & 1) != 1 || (A0L = c06474v.A0L()) == 0) {
            return null;
        }
        long A0U = C5C.A0U(A0L, i * 1000000, i6);
        if ((A0C & 6) != 6) {
            return new C8U(j9, hn.A02, A0U);
        }
        long A0Q = c06474v.A0Q();
        long[] jArr = new long[100];
        for (int i9 = 0; i9 < 100; i9++) {
            jArr[i9] = c06474v.A0I();
        }
        if (j6 != -1 && j6 != j9 + A0Q) {
            AbstractC06324g.A07(A02(27, 10, 78), A02(2, 25, 105) + j6 + A02(0, 2, 40) + (j9 + A0Q));
        }
        return new C8U(j9, hn.A02, A0U, A0Q, jArr);
    }

    public static String A02(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i6);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A07;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A07[2] = "La6";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 30);
            i10++;
        }
    }

    public static void A03() {
        A06 = new byte[]{114, 102, -33, -48, -43, -50, -89, -21, -24, -5, -24, -89, -6, -16, 1, -20, -89, -12, -16, -6, -12, -24, -5, -22, -17, -63, -89, -60, -43, -38, -45, -65, -47, -47, -41, -47, -34};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j6) {
        double d2;
        if (!AAj()) {
            return new HX(new HZ(0L, this.A03 + this.A00));
        }
        long A0T = C5C.A0T(j6, 0L, this.A04);
        double d9 = (A0T * 100.0d) / this.A04;
        if (d9 <= 0.0d) {
            d2 = 0.0d;
        } else if (d9 >= 100.0d) {
            d2 = 256.0d;
        } else {
            int i = (int) d9;
            double d10 = ((long[]) AbstractC06243y.A02(this.A05))[i];
            d2 = (((i == 99 ? 256.0d : r9[i + 1]) - d10) * (d9 - i)) + d10;
        }
        return new HX(new HZ(A0T, this.A03 + C5C.A0T(Math.round((d2 / 256.0d) * this.A02), this.A00, this.A02 - 1)));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 17 out of bounds for length 17
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC2164mF
    public final long A9H(long j6) {
        long j9 = j6 - this.A03;
        if (!AAj() || j9 <= this.A00) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC06243y.A02(this.A05);
        double d2 = (j9 * 256.0d) / this.A02;
        int A0L = C5C.A0L(jArr, (long) d2, true, true);
        long A00 = A00(A0L);
        long j10 = jArr[A0L];
        long A002 = A00(A0L + 1);
        long j11 = A0L == 99 ? 256L : jArr[A0L + 1];
        String[] strArr = A07;
        if (strArr[0].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A07[6] = "PlWtaQzxKmV3LAe12cSeUsJTirSwbfkK";
        return Math.round((A002 - A00) * (j10 == j11 ? 0.0d : (d2 - j10) / (j11 - j10))) + A00;
    }

    static {
        A03();
    }

    public C8U(long j6, int i, long j9) {
        this(j6, i, j9, -1L, null);
    }

    public C8U(long j6, int i, long j9, long j10, long[] jArr) {
        this.A03 = j6;
        this.A00 = i;
        this.A04 = j9;
        this.A05 = jArr;
        this.A02 = j10;
        this.A01 = j10 != -1 ? j6 + j10 : -1L;
    }

    private long A00(int i) {
        return (this.A04 * i) / 100;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2164mF
    public final long A7j() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return this.A05 != null;
    }
}
