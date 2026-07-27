package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.k1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2028k1 extends AbstractC1783fo {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass81 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C2028k1(AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1783fo
    public final void A03() {
        Y2 y22;
        Y2 y23;
        AnonymousClass76 anonymousClass76;
        C2012jl c2012jl;
        AnonymousClass76 anonymousClass762;
        C07177o c07177o;
        C1784fp c1784fp;
        Y2 y24;
        C07177o c07177o2;
        VA va;
        C07177o c07177o3;
        AnonymousClass76 anonymousClass763;
        C07177o c07177o4;
        C07177o c07177o5;
        C1103Ng A2A;
        AnonymousClass76 anonymousClass764;
        C1784fp c1784fp2;
        AnonymousClass76 anonymousClass765;
        C07177o c07177o6;
        y22 = this.A00.A0H;
        if (!y22.A07()) {
            y23 = this.A00.A0H;
            y23.A05();
            anonymousClass76 = this.A00.A04;
            InterfaceC2066kf A0F = anonymousClass76.A0F();
            c2012jl = this.A00.A02;
            A0F.A4Q(c2012jl != null);
            anonymousClass762 = this.A00.A04;
            anonymousClass762.A0F().A3L();
            c07177o = this.A00.A03;
            AbstractC1123Oa.A02(c07177o.A0y(), AbstractC1359Xm.A00(A00(0, 6, 63)));
            C1496b9 c1496b9 = new C1496b9();
            c1784fp = this.A00.A0B;
            C1496b9 A03 = c1496b9.A03(c1784fp);
            y24 = this.A00.A0H;
            C1496b9 A02 = A03.A02(y24);
            c07177o2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(c07177o2.A0z()).A05();
            va = this.A00.A05;
            c07177o3 = this.A00.A03;
            va.ABJ(c07177o3.A2E(), A05);
            anonymousClass763 = this.A00.A04;
            if (C1289Up.A1A(anonymousClass763)) {
                anonymousClass765 = this.A00.A04;
                C1335Wl A00 = C1335Wl.A00(anonymousClass765);
                String adPlacementType = AdPlacementType.BANNER.toString();
                c07177o6 = this.A00.A03;
                A00.A0E(adPlacementType, c07177o6.A2E());
            }
            c07177o4 = this.A00.A03;
            if (c07177o4 == null) {
                A2A = null;
            } else {
                c07177o5 = this.A00.A03;
                A2A = c07177o5.A2A();
            }
            anonymousClass764 = this.A00.A04;
            C1103Ng.A07(A2A, anonymousClass764);
            c1784fp2 = this.A00.A0B;
            c1784fp2.A0V();
        }
    }
}
