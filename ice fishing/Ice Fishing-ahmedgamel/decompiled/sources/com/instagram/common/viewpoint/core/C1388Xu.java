package com.instagram.common.viewpoint.core;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Xu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1388Xu implements InterfaceC1838gM {
    public static byte[] A02;
    public static String[] A03 = {"11yowYa9SjobATSyd4jbcYQKUh4edG44", "bHv0W2DtzV8d9jrYb9gmoc8MmzdN0fpB", "oW", "tKoi6cKGljbVocPn31APtwXZRyGd7igq", "ywmFCSl3Vn78B2eGXobUvwrScWlSo3bc", "aFROHHWcme9RokkBpAaOqFeveGyJeM2s", "QLtd5uCJprXFRqzwd31bhpzpUHhxzcVz", "aKhknuldK0UVZxwEW2ZbTGmFeUx0ymlu"};
    public final /* synthetic */ C1856ge A00;
    public final /* synthetic */ InterfaceC1836gK A01;

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            byte b9 = (byte) ((copyOfRange[i9] ^ i6) ^ 80);
            if (A03[0].charAt(21) == 'R') {
                throw new RuntimeException();
            }
            A03[0] = "rnyHoYqJfuEUpW7gm8XbWdjDtWL8fGmk";
            copyOfRange[i9] = b9;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 102, 98, 119, 118, 113, 102, 92, 96, 108, 109, 101, 106, 100};
    }

    static {
        A01();
    }

    public C1388Xu(InterfaceC1836gK interfaceC1836gK, C1856ge c1856ge) {
        this.A01 = interfaceC1836gK;
        this.A00 = c1856ge;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1838gM
    public final void A4m() {
        try {
            C1310Up.A0V(this.A00).A37(this.A01.A7i().optJSONObject(A00(0, 14, 83)));
        } catch (JSONException e9) {
            this.A00.A08().A4I(e9);
        }
    }
}
