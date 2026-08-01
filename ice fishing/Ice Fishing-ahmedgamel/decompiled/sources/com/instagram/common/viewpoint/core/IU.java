package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class IU implements XN {
    public final /* synthetic */ C5S A00;

    public IU(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        InterfaceC1660dm interfaceC1660dm;
        int i;
        InterfaceC1660dm interfaceC1660dm2;
        interfaceC1660dm = this.A00.A0P;
        i = this.A00.A0F;
        interfaceC1660dm.ADc(i);
        interfaceC1660dm2 = this.A00.A0P;
        interfaceC1660dm2.ADA();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f3) {
        int i;
        boolean z3;
        C0877Ek c0877Ek;
        int duration;
        boolean z6;
        int i6;
        InterfaceC1660dm interfaceC1660dm;
        i = this.A00.A0F;
        float f9 = i - f3;
        z3 = this.A00.A0d;
        if (z3) {
            duration = 0;
        } else {
            c0877Ek = this.A00.A0S;
            duration = c0877Ek.getDuration();
        }
        float totalForce = f9 + duration;
        z6 = this.A00.A0d;
        if (z6) {
            i6 = this.A00.A0F;
        } else {
            i6 = this.A00.A0E;
        }
        float seenTime = i6;
        float totalForce2 = totalForce / seenTime;
        interfaceC1660dm = this.A00.A0P;
        interfaceC1660dm.AKd(totalForce2);
    }
}
