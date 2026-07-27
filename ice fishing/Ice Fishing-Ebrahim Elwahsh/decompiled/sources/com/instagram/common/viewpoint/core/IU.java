package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class IU implements XN {
    public final /* synthetic */ C5S A00;

    public IU(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        InterfaceC1659dm interfaceC1659dm;
        int i;
        InterfaceC1659dm interfaceC1659dm2;
        interfaceC1659dm = this.A00.A0P;
        i = this.A00.A0F;
        interfaceC1659dm.ADc(i);
        interfaceC1659dm2 = this.A00.A0P;
        interfaceC1659dm2.ADA();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f6) {
        int i;
        boolean z8;
        C0876Ek c0876Ek;
        int duration;
        boolean z9;
        int i4;
        InterfaceC1659dm interfaceC1659dm;
        i = this.A00.A0F;
        float f9 = i - f6;
        z8 = this.A00.A0d;
        if (z8) {
            duration = 0;
        } else {
            c0876Ek = this.A00.A0S;
            duration = c0876Ek.getDuration();
        }
        float totalForce = f9 + duration;
        z9 = this.A00.A0d;
        if (z9) {
            i4 = this.A00.A0F;
        } else {
            i4 = this.A00.A0E;
        }
        float seenTime = i4;
        float totalForce2 = totalForce / seenTime;
        interfaceC1659dm = this.A00.A0P;
        interfaceC1659dm.AKd(totalForce2);
    }
}
