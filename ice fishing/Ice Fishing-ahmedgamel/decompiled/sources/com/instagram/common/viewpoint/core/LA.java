package com.instagram.common.viewpoint.core;

import com.anythink.basead.exoplayer.b;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class LA {
    public static byte[] A09;
    public static String[] A0A = {"YKrx4tQL3HFlbX0m6cI7YSMmMtJDnVWt", "EhNKRydGslBNjHwz4Qke8RkUgCBaonuc", "lVt1vjccWtobRJMyEDSjQomkweVugX5V", "X5vaF2wJa8umjlLI", "q53FR06vPOBUDZ08SG0Q3HmIsvEwqM01", "eDYPuZuNQVkkkUOb40HZTr2GxKWyUyQ4", "7DZ3geXrHcZNODb56yin0lXQD6ovjT1O", "oKDHpDD8v386AT9biWd"};
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final AnonymousClass53 A08 = new AnonymousClass53(0);
    public long A01 = b.f6382b;
    public long A02 = b.f6382b;
    public long A00 = b.f6382b;
    public final C06474v A07 = new C06474v();

    public static String A05(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A09 = new byte[]{-89, -103, -50, -20, -30, -25, -32, -103, -51, -62, -58, -66, -40, -50, -57, -52, -66, -51, -103, -30, -25, -20, -19, -34, -38, -35, -89, -119, -82, -74, -95, -84, -87, -92, 96, -92, -75, -78, -95, -76, -87, -81, -82, 122, 96, -95, -64, -111, -62, -65, -82, -63, -74, -68, -69, -97, -78, -82, -79, -78, -65};
    }

    static {
        A06();
    }

    public LA(int i) {
        this.A06 = i;
    }

    private int A00(InterfaceC2191ms interfaceC2191ms) {
        this.A07.A0i(C5C.A07);
        this.A03 = true;
        interfaceC2191ms.AIl();
        return 0;
    }

    private int A01(InterfaceC2191ms interfaceC2191ms, HV hv, int i) throws IOException {
        int min = (int) Math.min(this.A06, interfaceC2191ms.A8O());
        if (interfaceC2191ms.A8n() != 0) {
            hv.A00 = 0;
            return 1;
        }
        this.A07.A0d(min);
        interfaceC2191ms.AIl();
        interfaceC2191ms.AGt(this.A07.A0l(), 0, min);
        this.A01 = A03(this.A07, i);
        this.A04 = true;
        return 0;
    }

    private int A02(InterfaceC2191ms interfaceC2191ms, HV hv, int i) throws IOException {
        long inputLength = interfaceC2191ms.A8O();
        int min = (int) Math.min(this.A06, inputLength);
        long inputLength2 = inputLength - min;
        if (interfaceC2191ms.A8n() != inputLength2) {
            hv.A00 = inputLength2;
            return 1;
        }
        this.A07.A0d(min);
        interfaceC2191ms.AIl();
        interfaceC2191ms.AGt(this.A07.A0l(), 0, min);
        this.A02 = A04(this.A07, i);
        this.A05 = true;
        return 0;
    }

    private long A03(C06474v c06474v, int i) {
        int A0A2 = c06474v.A0A();
        for (int A092 = c06474v.A09(); A092 < A0A2; A092++) {
            int searchEndPosition = c06474v.A0l()[A092];
            if (searchEndPosition == 71) {
                long A01 = LI.A01(c06474v, A092, i);
                if (A01 != b.f6382b) {
                    return A01;
                }
            }
        }
        return b.f6382b;
    }

    private long A04(C06474v c06474v, int i) {
        int A092 = c06474v.A09();
        int A0A2 = c06474v.A0A();
        for (int i6 = A0A2 - 188; i6 >= A092; i6--) {
            if (LI.A03(c06474v.A0l(), A092, A0A2, i6)) {
                long A01 = LI.A01(c06474v, i6, i);
                if (A01 != b.f6382b) {
                    return A01;
                }
            }
        }
        return b.f6382b;
    }

    public final int A07(InterfaceC2191ms interfaceC2191ms, HV hv, int i) throws IOException {
        if (i <= 0) {
            return A00(interfaceC2191ms);
        }
        if (!this.A05) {
            return A02(interfaceC2191ms, hv, i);
        }
        if (this.A02 == b.f6382b) {
            return A00(interfaceC2191ms);
        }
        if (!this.A04) {
            int A01 = A01(interfaceC2191ms, hv, i);
            if (A0A[0].charAt(2) == 'O') {
                throw new RuntimeException();
            }
            A0A[0] = "U4EwafF7WjzJM20D4nSEnM6oLnkPTMDI";
            return A01;
        }
        if (this.A01 == b.f6382b) {
            return A00(interfaceC2191ms);
        }
        this.A00 = this.A08.A06(this.A02) - this.A08.A06(this.A01);
        if (this.A00 < 0) {
            AbstractC06324g.A07(A05(45, 16, 60), A05(27, 18, 47) + this.A00 + A05(0, 27, 104));
            this.A00 = b.f6382b;
        }
        return A00(interfaceC2191ms);
    }

    public final long A08() {
        return this.A00;
    }

    public final AnonymousClass53 A09() {
        return this.A08;
    }

    public final boolean A0A() {
        return this.A03;
    }
}
