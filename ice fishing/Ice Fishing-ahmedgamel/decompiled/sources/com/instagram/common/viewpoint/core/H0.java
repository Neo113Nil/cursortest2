package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class H0 implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC1347Wc A01;
    public final /* synthetic */ AbstractC0947Gj A02;
    public final /* synthetic */ DZ A03;

    public H0(AbstractC0947Gj abstractC0947Gj, int i, DZ dz, AbstractRunnableC1347Wc abstractRunnableC1347Wc) {
        this.A02 = abstractC0947Gj;
        this.A00 = i;
        this.A03 = dz;
        this.A01 = abstractRunnableC1347Wc;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        this.A01.run();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f2) {
        this.A02.A09.setProgress(100.0f * (1.0f - (f2 / this.A00)));
        if (this.A03 != null) {
            DZ dz = this.A03;
            float percentage = this.A00;
            dz.A07((int) ((percentage - f2) * 1000.0f));
        }
    }
}
