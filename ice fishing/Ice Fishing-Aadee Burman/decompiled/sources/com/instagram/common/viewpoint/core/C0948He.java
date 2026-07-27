package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.He, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0948He {
    public static byte[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public final byte[] A06 = new byte[10];

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 90);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{78, 104, 111, Byte.MAX_VALUE, 82, 94, 58, 121, 114, 111, 116, 113, 58, 105, 123, 119, 106, 118, Byte.MAX_VALUE, 105, 58, 119, 111, 105, 110, 58, 120, Byte.MAX_VALUE, 58, 121, 117, 116, 110, 115, 125, 111, 117, 111, 105, 58, 115, 116, 58, 110, 114, Byte.MAX_VALUE, 58, 105, 123, 119, 106, 118, Byte.MAX_VALUE, 58, 107, 111, Byte.MAX_VALUE, 111, Byte.MAX_VALUE, 52};
    }

    public final void A02() {
        this.A05 = false;
        this.A02 = 0;
    }

    public final void A03(InterfaceC2191ms interfaceC2191ms) throws IOException {
        if (this.A05) {
            return;
        }
        interfaceC2191ms.AGt(this.A06, 0, 10);
        interfaceC2191ms.AIl();
        if (AbstractC0935Gr.A06(this.A06) == 0) {
            return;
        }
        this.A05 = true;
    }

    public final void A04(InterfaceC0947Hd interfaceC0947Hd, long j6, int i, int i6, int i9, C0945Hb c0945Hb) {
        AbstractC06243y.A0A(this.A01 <= i6 + i9, A00(0, 60, 64));
        if (!this.A05) {
            return;
        }
        int i10 = this.A02;
        this.A02 = i10 + 1;
        if (i10 == 0) {
            this.A04 = j6;
            this.A00 = i;
            this.A03 = 0;
        }
        this.A03 += i6;
        this.A01 = i9;
        if (this.A02 >= 16) {
            A05(interfaceC0947Hd, c0945Hb);
        }
    }

    public final void A05(InterfaceC0947Hd interfaceC0947Hd, C0945Hb c0945Hb) {
        if (this.A02 > 0) {
            interfaceC0947Hd.AIu(this.A04, this.A00, this.A03, this.A01, c0945Hb);
            this.A02 = 0;
        }
    }
}
