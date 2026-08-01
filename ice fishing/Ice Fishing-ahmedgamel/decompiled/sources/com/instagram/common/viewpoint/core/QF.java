package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QF implements InterfaceC1365Xr {
    public final C1364Xq A00;
    public final InterfaceC1365Xr A01;

    public QF(InterfaceC1365Xr interfaceC1365Xr, int i, int i6) {
        this.A01 = interfaceC1365Xr;
        this.A00 = new C1364Xq(i, i6);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1365Xr
    public final void AH8(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() == null) {
            return;
        }
        A08 = AbstractC1367Xt.A08(this.A00);
        if (A08) {
            this.A01.AH8(this.A00.A02());
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1365Xr
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = AbstractC1367Xt.A08(this.A00);
            if (A08) {
                this.A01.AH8(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
