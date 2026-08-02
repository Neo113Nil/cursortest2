package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class JC extends AbstractRunnableC1347Wc {
    public static byte[] A01;
    public final /* synthetic */ C1636d4 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-87, -68, -73, -72, -62, 115, -63, -72, -55, -72, -59, 115, -58, -57, -76, -59, -57, -72, -73, 115, -61, -65, -76, -52, -68, -63, -70};
    }

    public JC(C1636d4 c1636d4) {
        this.A00 = c1636d4;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        boolean z6;
        z6 = this.A00.A04;
        if (z6) {
            return;
        }
        this.A00.A0I(A00(0, 27, 64));
    }
}
