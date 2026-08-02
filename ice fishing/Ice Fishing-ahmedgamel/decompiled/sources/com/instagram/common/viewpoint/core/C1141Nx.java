package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1141Nx implements XN {
    public static byte[] A01;
    public final /* synthetic */ NO A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{69, 81, 80, 75, 71, 72, 77, 71, 79};
    }

    public C1141Nx(NO no) {
        this.A00 = no;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        boolean z6;
        boolean z9;
        z6 = this.A00.A0H;
        if (!z6) {
            z9 = this.A00.A0G;
            if (!z9) {
                this.A00.A0W(false, A00(0, 9, 80));
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f2) {
    }
}
