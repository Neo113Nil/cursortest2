package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.He, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0968He {
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

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 90);
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

    public final void A03(InterfaceC2211ms interfaceC2211ms) throws IOException {
        if (this.A05) {
            return;
        }
        interfaceC2211ms.AGt(this.A06, 0, 10);
        interfaceC2211ms.AIl();
        if (AbstractC0955Gr.A06(this.A06) == 0) {
            return;
        }
        this.A05 = true;
    }

    public final void A04(InterfaceC0967Hd interfaceC0967Hd, long j6, int i, int i4, int i6, C0965Hb c0965Hb) {
        AbstractC06443y.A0A(this.A01 <= i4 + i6, A00(0, 60, 64));
        if (!this.A05) {
            return;
        }
        int i9 = this.A02;
        this.A02 = i9 + 1;
        if (i9 == 0) {
            this.A04 = j6;
            this.A00 = i;
            this.A03 = 0;
        }
        this.A03 += i4;
        this.A01 = i6;
        if (this.A02 >= 16) {
            A05(interfaceC0967Hd, c0965Hb);
        }
    }

    public final void A05(InterfaceC0967Hd interfaceC0967Hd, C0965Hb c0965Hb) {
        if (this.A02 > 0) {
            interfaceC0967Hd.AIu(this.A04, this.A00, this.A03, this.A01, c0965Hb);
            this.A02 = 0;
        }
    }
}
