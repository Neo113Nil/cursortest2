package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1091Mt {
    public static byte[] A04;
    public InterfaceC1089Mr A00;
    public final C1839gi A01;
    public final VA A02;
    public final String A03;

    static {
        A0D();
    }

    public static String A0B(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A04 = new byte[]{84, 69, 69, 106, 84, 81, 108, 105, 110, 107, 95, 99, 108, 105, 99, 107, 112, 102, 115, 100, 111, 88, 102, 105, 99, 88, 101, 117, 104, 112, 116, 98};
    }

    public abstract EnumC1088Mq A0G(String str);

    public AbstractC1091Mt(C1839gi c1839gi, VA va, String str) {
        this.A01 = c1839gi;
        this.A02 = va;
        this.A03 = str;
    }

    public static String A0A() {
        return A0B(16, 16, 125);
    }

    public static String A0C(AbstractC1091Mt abstractC1091Mt) {
        if (abstractC1091Mt instanceof AnonymousClass84) {
            return A0B(6, 10, 122);
        }
        return A0B(0, 6, 79);
    }

    public final InterfaceC1089Mr A0E() {
        return this.A00;
    }

    public final void A0F(InterfaceC1089Mr interfaceC1089Mr) {
        this.A00 = interfaceC1089Mr;
    }
}
