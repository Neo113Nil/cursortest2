package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class IU implements XN {
    public final /* synthetic */ C5S A00;

    public IU(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        InterfaceC1680dm interfaceC1680dm;
        int i;
        InterfaceC1680dm interfaceC1680dm2;
        interfaceC1680dm = this.A00.A0P;
        i = this.A00.A0F;
        interfaceC1680dm.ADc(i);
        interfaceC1680dm2 = this.A00.A0P;
        interfaceC1680dm2.ADA();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f2) {
        int i;
        boolean z6;
        C0897Ek c0897Ek;
        int duration;
        boolean z9;
        int i4;
        InterfaceC1680dm interfaceC1680dm;
        i = this.A00.A0F;
        float f9 = i - f2;
        z6 = this.A00.A0d;
        if (z6) {
            duration = 0;
        } else {
            c0897Ek = this.A00.A0S;
            duration = c0897Ek.getDuration();
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
        interfaceC1680dm = this.A00.A0P;
        interfaceC1680dm.AKd(totalForce2);
    }
}
