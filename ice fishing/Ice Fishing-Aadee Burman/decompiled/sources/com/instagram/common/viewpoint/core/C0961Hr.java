package com.instagram.common.viewpoint.core;

import com.anythink.basead.ui.f.d;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Hr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0961Hr implements InterfaceC1478aq {
    public static byte[] A01;
    public static String[] A02 = {"lymitVL5Elx23yNuagrdcc1tj4byFzuO", "OtHhm4I6MY8qhok47NcALtT", "GJmhN4rXhrf709OMeDU9UKBK4KfDlX2Y", "UKN", "ioCWBc07RK8NAgZ7uqzQ2Ov99bHrMaFb", "vsb8Ufoa8H", "zp4FcHB1hqlJdpy7ZALmHMQwB62WRf78", "qbR"};
    public final /* synthetic */ AnonymousClass55 A00;

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] - i9) + d.f10801c);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A02[1].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "68tvMXLM0DzUKrc9PEEpmru8eIlurAzh";
        strArr[2] = "oZlS45uLmtttWs7KR8Y8sKnmk93hftbi";
        A01 = new byte[]{51, 49, 35, 48, 29, 44, 31, 52, 39, 37, 31, 50, 39, 45, 44, 29, 39, 31, 32};
    }

    static {
        A01();
    }

    public C0961Hr(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1478aq
    public final void AF7(String str) {
        C1469ah c1469ah;
        C1469ah c1469ah2;
        C1469ah c1469ah3;
        this.A00.A0H = false;
        c1469ah = this.A00.A05;
        if (c1469ah != null) {
            c1469ah3 = this.A00.A05;
            c1469ah3.setProgress(100);
        }
        c1469ah2 = this.A00.A05;
        YB.A0O(c1469ah2, 8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1478aq
    public final void AF9(String str) {
        C1469ah c1469ah;
        M8 m82;
        boolean z3;
        int i;
        M8 m83;
        this.A00.A0H = true;
        c1469ah = this.A00.A05;
        YB.A0O(c1469ah, 0);
        m82 = this.A00.A04;
        if (m82 != null) {
            m83 = this.A00.A04;
            m83.setUrl(str);
        }
        z3 = this.A00.A0G;
        if (!z3) {
            i = this.A00.A01;
            if (i > 1) {
                this.A00.A0G = true;
                this.A00.A0r(A00(0, 19, 88));
            }
        }
        AnonymousClass55 anonymousClass55 = this.A00;
        if (A02[1].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "Ijw";
        strArr[3] = "65M";
        AnonymousClass55.A03(anonymousClass55);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1478aq
    public final void AFY(int i) {
        boolean z3;
        C1469ah c1469ah;
        C1469ah c1469ah2;
        z3 = this.A00.A0H;
        if (z3) {
            c1469ah = this.A00.A05;
            if (c1469ah != null) {
                c1469ah2 = this.A00.A05;
                c1469ah2.setProgress(i);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1478aq
    public final void AFb(String str) {
        M8 m82;
        M8 m83;
        m82 = this.A00.A04;
        if (m82 != null) {
            m83 = this.A00.A04;
            m83.setTitle(str);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1478aq
    public final void AFe() {
        ((AbstractC0979Ij) this.A00).A0B.ADJ(14);
    }
}
