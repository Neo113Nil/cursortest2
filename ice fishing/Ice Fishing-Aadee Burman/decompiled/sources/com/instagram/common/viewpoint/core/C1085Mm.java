package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Mm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1085Mm implements InterfaceC1208Rk {
    public static String[] A01 = {"OzZgVge9f1M6v6ECGvfzE2lelYGRNpcR", "wWE4h2nZ4zwlNyDcFF4AKhs", "2tlTz3YI6lX4F9BnCi72Ebdo8SjZZSMc", "OEQW3vRvYAQWgt7PHCfPR8E", "3OILw1bCaEkMk35ZNNqR0SRTWeQg1PRg", "i6GFbsYgPXu23Z4kIsNVdeySMROLxMHq", "jYSQemNdDQ7ZZ3K3t", "DXND3IEKe4RSyw4IFeihHP08ajxTSSoO"};
    public final /* synthetic */ MW A00;

    public C1085Mm(MW mw) {
        this.A00 = mw;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1208Rk
    public final boolean AAI() {
        boolean z3;
        C1701eS c1701eS;
        C1701eS c1701eS2;
        VI vi;
        InterfaceC1381Yh interfaceC1381Yh;
        ZU zu;
        VI vi2;
        InterfaceC1381Yh interfaceC1381Yh2;
        ZU zu2;
        z3 = this.A00.A0E;
        if (z3) {
            if (this.A00.A0U.getToolbarActionMode() == 1) {
                AbstractC1375Yb abstractC1375Yb = this.A00.A0U;
                if (A01[6].length() != 17) {
                    throw new RuntimeException();
                }
                A01[6] = "6SLOwM6DBUuyj18aF";
                abstractC1375Yb.setToolbarActionMode(2);
                this.A00.A0N();
            } else if (this.A00.A0U.getToolbarActionMode() == 0) {
                vi2 = this.A00.A0L;
                vi2.A04(VH.A07, null);
                interfaceC1381Yh2 = this.A00.A0O;
                zu2 = this.A00.A0P;
                interfaceC1381Yh2.A4j(zu2.A7w());
            } else {
                c1701eS = this.A00.A09;
                if (c1701eS != null) {
                    c1701eS2 = this.A00.A09;
                    if (c1701eS2.A0h()) {
                        vi = this.A00.A0L;
                        vi.A04(VH.A07, null);
                        interfaceC1381Yh = this.A00.A0O;
                        zu = this.A00.A0P;
                        interfaceC1381Yh.A4j(zu.A7w());
                    }
                }
            }
            return true;
        }
        return false;
    }
}
