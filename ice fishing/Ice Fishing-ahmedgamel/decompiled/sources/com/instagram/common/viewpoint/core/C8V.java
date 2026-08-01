package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8V, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8V implements InterfaceC2164mF {
    public static byte[] A04;
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C8V A00(long j6, long j9, HN hn, C06474v c06474v) {
        int A0I;
        long j10 = j9;
        c06474v.A0g(10);
        int A0C = c06474v.A0C();
        if (A0C <= 0) {
            return null;
        }
        int i = hn.A03;
        long A0U = C5C.A0U(A0C, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int A0M = c06474v.A0M();
        int A0M2 = c06474v.A0M();
        int A0M3 = c06474v.A0M();
        c06474v.A0g(2);
        long j11 = j10 + hn.A02;
        long[] jArr = new long[A0M];
        long[] jArr2 = new long[A0M];
        for (int i6 = 0; i6 < A0M; i6++) {
            jArr[i6] = (i6 * A0U) / A0M;
            jArr2[i6] = Math.max(j10, j11);
            switch (A0M3) {
                case 1:
                    A0I = c06474v.A0I();
                    break;
                case 2:
                    A0I = c06474v.A0M();
                    break;
                case 3:
                    A0I = c06474v.A0K();
                    break;
                case 4:
                    A0I = c06474v.A0L();
                    break;
                default:
                    return null;
            }
            j10 += A0I * A0M2;
        }
        if (j6 != -1 && j6 != j10) {
            AbstractC06324g.A07(A01(27, 10, 89), A01(2, 25, 50) + j6 + A01(0, 2, 80) + j10);
        }
        return new C8V(jArr, jArr2, A0U, j10);
    }

    public static String A01(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-89, -101, -77, -97, -81, -90, 125, -63, -66, -47, -66, 125, -48, -58, -41, -62, 125, -54, -58, -48, -54, -66, -47, -64, -59, -105, 125, -38, -26, -10, -19, -41, -23, -23, -17, -23, -10};
    }

    public C8V(long[] jArr, long[] jArr2, long j6, long j9) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A01 = j6;
        this.A00 = j9;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2164mF
    public final long A7j() {
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j6) {
        int A0L = C5C.A0L(this.A03, j6, true, true);
        HZ hz = new HZ(this.A03[A0L], this.A02[A0L]);
        if (hz.A01 < j6) {
            int tableIndex = this.A03.length;
            if (A0L != tableIndex - 1) {
                int tableIndex2 = A0L + 1;
                long j9 = this.A03[tableIndex2];
                int tableIndex3 = A0L + 1;
                HZ nextSeekPoint = new HZ(j9, this.A02[tableIndex3]);
                return new HX(hz, nextSeekPoint);
            }
        }
        return new HX(hz);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2164mF
    public final long A9H(long j6) {
        return this.A03[C5C.A0L(this.A02, j6, true, true)];
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }
}
