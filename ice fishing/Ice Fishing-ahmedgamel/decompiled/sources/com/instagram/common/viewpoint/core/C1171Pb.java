package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1171Pb implements InterfaceC1502au {
    public static byte[] A01;
    public final /* synthetic */ PZ A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -19, -33, -20, -39, -36, -17, -32, -32, -33, -20, -33, -34, -39, -35, -26, -29, -35, -27, -39, -29, -37, -36, -39, -33, -14, -18, -33, -20, -24, -37, -26, -39, -24, -37, -16, -29, -31, -37, -18, -29, -23, -24};
    }

    public C1171Pb(PZ pz) {
        this.A00 = pz;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1502au
    public final void ADO() {
        this.A00.A0H();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1502au
    public final void AF0() {
        this.A00.A0I(A00(0, 43, 56));
    }
}
