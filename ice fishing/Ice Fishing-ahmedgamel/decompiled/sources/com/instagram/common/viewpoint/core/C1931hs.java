package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.hs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1931hs implements R0 {
    public static byte[] A04;
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-95, -74, -50, -60, -54, -55, 117, -59, -60, -56, -66, -55, -66, -60, -61, -56, 117, -62, -54, -56, -55, 117, -73, -70, 117, -61, -60, -61, -126, -61, -70, -68, -74, -55, -66, -53, -70, -117, -92, -77, -96, -89, 91, -97, -92, -82, -81, -100, -87, -98, -96, 91, -88, -80, -82, -81, 91, -99, -96, 91, -87, -86, -87, 104, -87, -96, -94, -100, -81, -92, -79, -96};
    }

    public final void A02() {
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i, int i4) {
        this.A01 = i;
        this.A02 = i4;
    }

    public final void A04(C7M c7m, boolean z6) {
        this.A00 = 0;
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        R2 r22 = c7m.A06;
        if (c7m.A04 != null && r22 != null && r22.A1W()) {
            if (z6) {
                if (!c7m.A00.A0B()) {
                    r22.A1t(c7m.A04.A0B(), this);
                }
            } else if (!c7m.A1r()) {
                r22.A1s(this.A01, this.A02, c7m.A0s, this);
            }
            if (this.A00 > r22.A00) {
                r22.A00 = this.A00;
                r22.A08 = z6;
                c7m.A0r.A0O();
            }
        }
    }

    public final boolean A05(int i) {
        if (this.A03 != null) {
            int i4 = this.A00 * 2;
            for (int i6 = 0; i6 < i4; i6 += 2) {
                int count = this.A03[i6];
                if (count == i) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.R0
    public final void A42(int i, int i4) {
        if (i >= 0) {
            if (i4 >= 0) {
                int i6 = this.A00 * 2;
                if (this.A03 == null) {
                    this.A03 = new int[4];
                    Arrays.fill(this.A03, -1);
                } else {
                    int storagePosition = this.A03.length;
                    if (i6 >= storagePosition) {
                        int[] iArr = this.A03;
                        int storagePosition2 = i6 * 2;
                        this.A03 = new int[storagePosition2];
                        System.arraycopy(iArr, 0, this.A03, 0, iArr.length);
                    }
                }
                this.A03[i6] = i;
                int storagePosition3 = i6 + 1;
                this.A03[storagePosition3] = i4;
                int storagePosition4 = this.A00;
                this.A00 = storagePosition4 + 1;
                return;
            }
            throw new IllegalArgumentException(A00(37, 35, 8));
        }
        throw new IllegalArgumentException(A00(0, 37, 34));
    }
}
