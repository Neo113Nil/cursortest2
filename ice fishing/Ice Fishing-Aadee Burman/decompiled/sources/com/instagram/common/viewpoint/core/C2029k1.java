package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.k1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2029k1 extends AbstractC1784fo {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass81 A00;

    static {
        A01();
    }

    public static String A00(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C2029k1(AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1784fo
    public final void A03() {
        Y2 y22;
        Y2 y23;
        AnonymousClass76 anonymousClass76;
        C2013jl c2013jl;
        AnonymousClass76 anonymousClass762;
        C07187o c07187o;
        C1785fp c1785fp;
        Y2 y24;
        C07187o c07187o2;
        VA va;
        C07187o c07187o3;
        AnonymousClass76 anonymousClass763;
        C07187o c07187o4;
        C07187o c07187o5;
        C1104Ng A2A;
        AnonymousClass76 anonymousClass764;
        C1785fp c1785fp2;
        AnonymousClass76 anonymousClass765;
        C07187o c07187o6;
        y22 = this.A00.A0H;
        if (!y22.A07()) {
            y23 = this.A00.A0H;
            y23.A05();
            anonymousClass76 = this.A00.A04;
            InterfaceC2067kf A0F = anonymousClass76.A0F();
            c2013jl = this.A00.A02;
            A0F.A4Q(c2013jl != null);
            anonymousClass762 = this.A00.A04;
            anonymousClass762.A0F().A3L();
            c07187o = this.A00.A03;
            AbstractC1124Oa.A02(c07187o.A0y(), AbstractC1360Xm.A00(A00(0, 6, 63)));
            C1497b9 c1497b9 = new C1497b9();
            c1785fp = this.A00.A0B;
            C1497b9 A03 = c1497b9.A03(c1785fp);
            y24 = this.A00.A0H;
            C1497b9 A02 = A03.A02(y24);
            c07187o2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(c07187o2.A0z()).A05();
            va = this.A00.A05;
            c07187o3 = this.A00.A03;
            va.ABJ(c07187o3.A2E(), A05);
            anonymousClass763 = this.A00.A04;
            if (C1290Up.A1A(anonymousClass763)) {
                anonymousClass765 = this.A00.A04;
                C1336Wl A00 = C1336Wl.A00(anonymousClass765);
                String adPlacementType = AdPlacementType.BANNER.toString();
                c07187o6 = this.A00.A03;
                A00.A0E(adPlacementType, c07187o6.A2E());
            }
            c07187o4 = this.A00.A03;
            if (c07187o4 == null) {
                A2A = null;
            } else {
                c07187o5 = this.A00.A03;
                A2A = c07187o5.A2A();
            }
            anonymousClass764 = this.A00.A04;
            C1104Ng.A07(A2A, anonymousClass764);
            c1785fp2 = this.A00.A0B;
            c1785fp2.A0V();
        }
    }
}
