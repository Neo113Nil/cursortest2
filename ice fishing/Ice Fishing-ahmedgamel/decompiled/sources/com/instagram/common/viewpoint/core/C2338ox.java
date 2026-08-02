package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import com.anythink.basead.exoplayer.d;
import com.anythink.expressad.video.module.a.a;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ox, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2338ox implements AnonymousClass74 {
    public static byte[] A0B;
    public static String[] A0C = {"WWBqbqM8cT7NtZ20aOE3uXs3Aw8DSv9K", "wsMqXc0RGaIy4bMjDS0CDKFK5K3H0E7a", "tXUn5oHGArEZhR5EfIYxUHEmkE2i7Wlz", "L3oqKt7yiugAXq9nLkVCiYddeszNHWIU", "GxMV2HKS42DeS6e3iSG9rTJ", "iBUmcZRwnnz5BMe8LKV", "MLtAALupoqSZMT31TgfSKHmksSEA2gyG", "KlBG0Bt2bdiLbLP3pzzetkFN2"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final C2230nC A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 69);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{-127, -60, -62, -49, -49, -48, -43, -127, -61, -58, -127, -51, -58, -44, -44, -127, -43, -55, -62, -49, -127, 123, -91, -58, -57, -62, -42, -51, -43, -83, -48, -62, -59, -92, -48, -49, -43, -45, -48, -51, 3, 16, 33, 22, 20, 35, -49, 17, 36, 21, 21, 20, 33, -49, 34, 24, 41, 20, -49, 33, 20, 16, 18, 23, 20, 19, -49, 38, 24, 35, 23, -49, 27, 20, 34, 34, -49, 35, 23, 16, 29, -49, -28, -33, -33, 28, 34, -49, 30, 21, -49, 17, 36, 21, 21, 20, 33, 20, 19, -49, 28, 20, 19, 24, 16, -49, 19, 16, 35, 16, -35, -36, -37, -35, -27, -68, -17, -32, -32, -33, -20, -66, -17, -20, -37, -18, -29, -23, -24, -57, -19, -77, -58, -73, -73, -74, -61, -105, -64, -61, -95, -67, -78, -54, -77, -78, -76, -68, -110, -73, -59, -74, -61, -93, -74, -77, -58, -73, -73, -74, -61, -98, -60, 21, 40, 25, 25, 24, 37, -7, 34, 37, 3, 31, 20, 44, 21, 20, 22, 30, 0, 38, -12, -24, -1, -55, -4, -19, -19, -20, -7, -44, -6, 43, 39, 44, 0, 51, 36, 36, 35, 48, 11, 49};
    }

    static {
        A03();
    }

    public C2338ox() {
        this(new C2230nC(true, b.aX), d.f7549b, d.f7549b, d.f7550c, 5000, -1, false, 0, false);
    }

    public C2338ox(C2230nC c2230nC, int i, int i4, int i6, int i9, int i10, boolean z6, int i11, boolean z9) {
        int i12;
        String A02 = A02(163, 19, 110);
        String A022 = A02(21, 1, 6);
        A04(i6, 0, A02, A022);
        String A023 = A02(a.f22519V, 32, 12);
        A04(i9, 0, A023, A022);
        String A024 = A02(193, 11, 121);
        A04(i, i6, A024, A02);
        A04(i, i9, A024, A023);
        A04(i4, i, A02(182, 11, 66), A024);
        A04(i11, 0, A02(111, 20, 53), A022);
        this.A08 = c2230nC;
        this.A07 = C5C.A0O(i);
        this.A06 = C5C.A0O(i4);
        this.A05 = C5C.A0O(i6);
        this.A04 = C5C.A0O(i9);
        this.A02 = i10;
        if (this.A02 != -1) {
            i12 = this.A02;
        } else {
            i12 = b.aY;
        }
        this.A00 = i12;
        this.A09 = z6;
        this.A03 = C5C.A0O(i11);
        this.A0A = z9;
    }

    public static int A00(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return b.aY;
            case 2:
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[5] = "ABED08YC";
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 131072;
            case 5:
                return 131072;
            case 6:
                return 131072;
        }
    }

    private final int A01(InterfaceC2232nE[] interfaceC2232nEArr) {
        int i = 0;
        for (InterfaceC2232nE interfaceC2232nE : interfaceC2232nEArr) {
            if (interfaceC2232nE != null) {
                int targetBufferSize = interfaceC2232nE.A9L().A02;
                i += A00(targetBufferSize);
            }
        }
        int max = Math.max(b.aY, i);
        if (A0C[0].charAt(6) == 'f') {
            throw new RuntimeException();
        }
        A0C[0] = "RHrwW0B94f4UqoylhYQPwgHgnQSWW3zM";
        return max;
    }

    public static void A04(int i, int i4, String str, String str2) {
        AbstractC06443y.A09(i >= i4, str + A02(0, 21, 28) + str2);
    }

    private void A05(boolean z6) {
        int i;
        if (this.A02 == -1) {
            i = b.aY;
        } else {
            i = this.A02;
        }
        this.A00 = i;
        this.A01 = false;
        if (z6) {
            this.A08.A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final C2230nC A6v() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final long A70(C8O c8o) {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final void AFR(C8O c8o) {
        A05(false);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final void AFc(C8O c8o) {
        A05(true);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final void AG6(C8O c8o) {
        A05(true);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final void AGF(AnonymousClass73 anonymousClass73, C2250nW c2250nW, InterfaceC2232nE[] interfaceC2232nEArr) {
        int i;
        if (this.A02 == -1) {
            i = A01(interfaceC2232nEArr);
        } else {
            i = this.A02;
        }
        this.A00 = i;
        this.A08.A02(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final boolean AIn(C8O c8o) {
        return this.A0A;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final boolean AJv(AnonymousClass73 anonymousClass73) {
        boolean z6 = true;
        boolean z9 = this.A08.A00() >= this.A00;
        long j6 = this.A07;
        if (anonymousClass73.A00 > 1.0f) {
            j6 = Math.min(C5C.A0Q(j6, anonymousClass73.A00), this.A06);
        }
        if (anonymousClass73.A01 < Math.max(j6, 500000L)) {
            boolean targetBufferSizeReached = this.A09;
            if (!targetBufferSizeReached && z9) {
                z6 = false;
            }
            this.A01 = z6;
            boolean targetBufferSizeReached2 = this.A01;
            if (!targetBufferSizeReached2 && anonymousClass73.A01 < 500000) {
                AbstractC06524g.A07(A02(22, 18, 28), A02(40, 71, 106));
            }
        } else if (anonymousClass73.A01 >= this.A06 || z9) {
            this.A01 = false;
        }
        boolean targetBufferSizeReached3 = this.A01;
        return targetBufferSizeReached3;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final boolean AJy(long j6, float f2, boolean z6, boolean z9, long minBufferDurationUs) {
        long A0R = C5C.A0R(j6, f2);
        long j9 = z6 ? this.A04 : this.A05;
        String[] strArr = A0C;
        if (strArr[3].charAt(20) == strArr[1].charAt(20)) {
            throw new RuntimeException();
        }
        A0C[4] = "l7tzQS6toEbIIxnpfZA1NGx";
        if (minBufferDurationUs != b.f7168b) {
            j9 = Math.min(minBufferDurationUs / 2, j9);
        }
        return j9 <= 0 || A0R >= j9 || (!this.A09 && this.A08.A00() >= this.A00);
    }
}
