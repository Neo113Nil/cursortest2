package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1121Nx implements XN {
    public static byte[] A01;
    public final /* synthetic */ NO A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{69, 81, 80, 75, 71, 72, 77, 71, 79};
    }

    public C1121Nx(NO no) {
        this.A00 = no;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        boolean z3;
        boolean z6;
        z3 = this.A00.A0H;
        if (!z3) {
            z6 = this.A00.A0G;
            if (!z6) {
                this.A00.A0W(false, A00(0, 9, 80));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f3) {
    }
}
