package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0945Gh implements InterfaceC1680dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0942Ge A01;

    public C0945Gh(C0942Ge c0942Ge, int i) {
        this.A01 = c0942Ge;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1680dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1680dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1680dm
    public final void ADc(int i) {
        C0942Ge.A03(this.A01, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1680dm
    public final void ADw(float f2) {
        boolean z6;
        z6 = this.A01.A08;
        if (!z6) {
            this.A01.A0L(f2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1680dm
    public final void AFw(boolean z6) {
        this.A01.A0W(z6);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1680dm
    public final void AGQ(String str) {
        C1860gi c1860gi;
        C2019jT c2019jT;
        InterfaceC1401Yh interfaceC1401Yh;
        ZU zu;
        int i;
        C2019jT c2019jT2;
        C1860gi c1860gi2;
        c1860gi = this.A01.A0D;
        c1860gi.A0F().A3a(str);
        c2019jT = this.A01.A0A;
        if (c2019jT.A2H()) {
            i = this.A01.A00;
            c2019jT2 = this.A01.A0A;
            if (i < c2019jT2.A23()) {
                c1860gi2 = this.A01.A0D;
                c1860gi2.A0F().AC2();
                this.A01.A0X(false, this.A00);
                return;
            }
        }
        interfaceC1401Yh = this.A01.A0I;
        zu = this.A01.A0J;
        interfaceC1401Yh.A4j(zu.A81());
        this.A01.A0M(3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1680dm
    public final void AKc() {
        AbstractC1395Yb abstractC1395Yb;
        AbstractC1395Yb abstractC1395Yb2;
        this.A01.setUnskippableSecondsComplete(false);
        abstractC1395Yb = this.A01.A0H;
        abstractC1395Yb.setProgressImmediate(0.0f);
        abstractC1395Yb2 = this.A01.A0H;
        abstractC1395Yb2.setToolbarActionMode(2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1680dm
    public final void AKd(float f2) {
        AbstractC1395Yb abstractC1395Yb;
        abstractC1395Yb = this.A01.A0H;
        abstractC1395Yb.setProgress(100.0f * f2);
    }
}
