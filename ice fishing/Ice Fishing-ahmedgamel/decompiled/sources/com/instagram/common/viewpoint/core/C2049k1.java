package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.k1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2049k1 extends AbstractC1804fo {
    public static byte[] A01;
    public final /* synthetic */ AnonymousClass81 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{78, 77, 66, 66, 73, 94};
    }

    public C2049k1(AnonymousClass81 anonymousClass81) {
        this.A00 = anonymousClass81;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1804fo
    public final void A03() {
        Y2 y22;
        Y2 y23;
        AnonymousClass76 anonymousClass76;
        C2033jl c2033jl;
        AnonymousClass76 anonymousClass762;
        C07387o c07387o;
        C1805fp c1805fp;
        Y2 y24;
        C07387o c07387o2;
        VA va;
        C07387o c07387o3;
        AnonymousClass76 anonymousClass763;
        C07387o c07387o4;
        C07387o c07387o5;
        C1124Ng A2A;
        AnonymousClass76 anonymousClass764;
        C1805fp c1805fp2;
        AnonymousClass76 anonymousClass765;
        C07387o c07387o6;
        y22 = this.A00.A0H;
        if (!y22.A07()) {
            y23 = this.A00.A0H;
            y23.A05();
            anonymousClass76 = this.A00.A04;
            InterfaceC2087kf A0F = anonymousClass76.A0F();
            c2033jl = this.A00.A02;
            A0F.A4Q(c2033jl != null);
            anonymousClass762 = this.A00.A04;
            anonymousClass762.A0F().A3L();
            c07387o = this.A00.A03;
            AbstractC1144Oa.A02(c07387o.A0y(), AbstractC1380Xm.A00(A00(0, 6, 63)));
            C1517b9 c1517b9 = new C1517b9();
            c1805fp = this.A00.A0B;
            C1517b9 A03 = c1517b9.A03(c1805fp);
            y24 = this.A00.A0H;
            C1517b9 A02 = A03.A02(y24);
            c07387o2 = this.A00.A03;
            Map<String, String> A05 = A02.A04(c07387o2.A0z()).A05();
            va = this.A00.A05;
            c07387o3 = this.A00.A03;
            va.ABJ(c07387o3.A2E(), A05);
            anonymousClass763 = this.A00.A04;
            if (C1310Up.A1A(anonymousClass763)) {
                anonymousClass765 = this.A00.A04;
                C1356Wl A00 = C1356Wl.A00(anonymousClass765);
                String adPlacementType = AdPlacementType.BANNER.toString();
                c07387o6 = this.A00.A03;
                A00.A0E(adPlacementType, c07387o6.A2E());
            }
            c07387o4 = this.A00.A03;
            if (c07387o4 == null) {
                A2A = null;
            } else {
                c07387o5 = this.A00.A03;
                A2A = c07387o5.A2A();
            }
            anonymousClass764 = this.A00.A04;
            C1124Ng.A07(A2A, anonymousClass764);
            c1805fp2 = this.A00.A0B;
            c1805fp2.A0V();
        }
    }
}
