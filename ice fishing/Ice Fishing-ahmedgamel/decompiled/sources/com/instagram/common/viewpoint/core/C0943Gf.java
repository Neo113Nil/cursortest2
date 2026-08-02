package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0943Gf implements InterfaceC1394Ya {
    public static byte[] A01;
    public static String[] A02 = {"csDJTKMsYdQDTZ6oaAKl5T8I2UfElmlw", "ZPoBWwRbmlxJW4JBXeHiCznpgduRwX0R", "YnHNxwrcL4VP2rzDabEPBpSRhKQlF70O", "ZXjFBdL6N8QRVPocRq4T6yjW", "DvDV4BG5U2fSuPxyYCt3atNQBem4gb3r", "Lz5NxPzXDVZYAcKGP0xvxFjIAyYktO5Y", "USLnjf5V4FwfzNcoOXwUO87ZM5qcDzRn", "2jpbWPspWwKCP4YD7vZxOkEv1N6M1MwD"};
    public final /* synthetic */ C0942Ge A00;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A02[0].charAt(1) == '2') {
            throw new RuntimeException();
        }
        A02[3] = "dLINtRlzHu";
        A01 = new byte[]{117, 109, 111, 118};
    }

    static {
        A01();
    }

    public C0943Gf(C0942Ge c0942Ge) {
        this.A00 = c0942Ge;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1394Ya
    public final void ACl(AbstractC1395Yb abstractC1395Yb) {
        AbstractC0999Ij abstractC0999Ij;
        VI vi;
        AbstractC0999Ij abstractC0999Ij2;
        if (abstractC1395Yb.getToolbarActionMode() == 8) {
            abstractC0999Ij = this.A00.A04;
            if (abstractC0999Ij != null) {
                vi = this.A00.A0F;
                vi.A04(VH.A0Y, null);
                abstractC0999Ij2 = this.A00.A04;
                abstractC0999Ij2.A1D(A00(0, 4, 95));
                this.A00.A0G();
                return;
            }
        }
        this.A00.A0E();
    }
}
