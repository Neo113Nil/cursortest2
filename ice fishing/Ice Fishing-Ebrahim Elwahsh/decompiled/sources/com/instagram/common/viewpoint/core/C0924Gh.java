package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0924Gh implements InterfaceC1659dm {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0921Ge A01;

    public C0924Gh(C0921Ge c0921Ge, int i) {
        this.A01 = c0921Ge;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1659dm
    public final void ACQ() {
        this.A01.A0G();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1659dm
    public final void ADA() {
        this.A01.A0X(false, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1659dm
    public final void ADc(int i) {
        C0921Ge.A03(this.A01, i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1659dm
    public final void ADw(float f6) {
        boolean z8;
        z8 = this.A01.A08;
        if (!z8) {
            this.A01.A0L(f6);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1659dm
    public final void AFw(boolean z8) {
        this.A01.A0W(z8);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1659dm
    public final void AGQ(String str) {
        C1839gi c1839gi;
        C1998jT c1998jT;
        InterfaceC1380Yh interfaceC1380Yh;
        ZU zu;
        int i;
        C1998jT c1998jT2;
        C1839gi c1839gi2;
        c1839gi = this.A01.A0D;
        c1839gi.A0F().A3a(str);
        c1998jT = this.A01.A0A;
        if (c1998jT.A2H()) {
            i = this.A01.A00;
            c1998jT2 = this.A01.A0A;
            if (i < c1998jT2.A23()) {
                c1839gi2 = this.A01.A0D;
                c1839gi2.A0F().AC2();
                this.A01.A0X(false, this.A00);
                return;
            }
        }
        interfaceC1380Yh = this.A01.A0I;
        zu = this.A01.A0J;
        interfaceC1380Yh.A4j(zu.A81());
        this.A01.A0M(3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1659dm
    public final void AKc() {
        AbstractC1374Yb abstractC1374Yb;
        AbstractC1374Yb abstractC1374Yb2;
        this.A01.setUnskippableSecondsComplete(false);
        abstractC1374Yb = this.A01.A0H;
        abstractC1374Yb.setProgressImmediate(0.0f);
        abstractC1374Yb2 = this.A01.A0H;
        abstractC1374Yb2.setToolbarActionMode(2);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1659dm
    public final void AKd(float f6) {
        AbstractC1374Yb abstractC1374Yb;
        abstractC1374Yb = this.A01.A0H;
        abstractC1374Yb.setProgress(100.0f * f6);
    }
}
