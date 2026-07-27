package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class JC extends AbstractRunnableC1326Wc {
    public static byte[] A01;
    public final /* synthetic */ C1615d4 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-87, -68, -73, -72, -62, 115, -63, -72, -55, -72, -59, 115, -58, -57, -76, -59, -57, -72, -73, 115, -61, -65, -76, -52, -68, -63, -70};
    }

    public JC(C1615d4 c1615d4) {
        this.A00 = c1615d4;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        boolean z8;
        z8 = this.A00.A04;
        if (z8) {
            return;
        }
        this.A00.A0I(A00(0, 27, 64));
    }
}
