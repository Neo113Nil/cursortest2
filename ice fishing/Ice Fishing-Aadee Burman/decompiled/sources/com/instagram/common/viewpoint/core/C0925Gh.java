package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0925Gh implements InterfaceC1660dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0922Ge A01;

    public C0925Gh(C0922Ge c0922Ge, int i) {
        this.A01 = c0922Ge;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1660dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1660dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1660dm
    public final void ADc(int i) {
        C0922Ge.A03(this.A01, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1660dm
    public final void ADw(float f3) {
        boolean z3;
        z3 = this.A01.A08;
        if (!z3) {
            this.A01.A0L(f3);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1660dm
    public final void AFw(boolean z3) {
        this.A01.A0W(z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1660dm
    public final void AGQ(String str) {
        C1840gi c1840gi;
        C1999jT c1999jT;
        InterfaceC1381Yh interfaceC1381Yh;
        ZU zu;
        int i;
        C1999jT c1999jT2;
        C1840gi c1840gi2;
        c1840gi = this.A01.A0D;
        c1840gi.A0F().A3a(str);
        c1999jT = this.A01.A0A;
        if (c1999jT.A2H()) {
            i = this.A01.A00;
            c1999jT2 = this.A01.A0A;
            if (i < c1999jT2.A23()) {
                c1840gi2 = this.A01.A0D;
                c1840gi2.A0F().AC2();
                this.A01.A0X(false, this.A00);
                return;
            }
        }
        interfaceC1381Yh = this.A01.A0I;
        zu = this.A01.A0J;
        interfaceC1381Yh.A4j(zu.A81());
        this.A01.A0M(3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1660dm
    public final void AKc() {
        AbstractC1375Yb abstractC1375Yb;
        AbstractC1375Yb abstractC1375Yb2;
        this.A01.setUnskippableSecondsComplete(false);
        abstractC1375Yb = this.A01.A0H;
        abstractC1375Yb.setProgressImmediate(0.0f);
        abstractC1375Yb2 = this.A01.A0H;
        abstractC1375Yb2.setToolbarActionMode(2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1660dm
    public final void AKd(float f3) {
        AbstractC1375Yb abstractC1375Yb;
        abstractC1375Yb = this.A01.A0H;
        abstractC1375Yb.setProgress(100.0f * f3);
    }
}
