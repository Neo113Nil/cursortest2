package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class H0 implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC1327Wc A01;
    public final /* synthetic */ AbstractC0927Gj A02;
    public final /* synthetic */ DZ A03;

    public H0(AbstractC0927Gj abstractC0927Gj, int i, DZ dz, AbstractRunnableC1327Wc abstractRunnableC1327Wc) {
        this.A02 = abstractC0927Gj;
        this.A00 = i;
        this.A03 = dz;
        this.A01 = abstractRunnableC1327Wc;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        this.A01.run();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f3) {
        this.A02.A09.setProgress(100.0f * (1.0f - (f3 / this.A00)));
        if (this.A03 != null) {
            DZ dz = this.A03;
            float percentage = this.A00;
            dz.A07((int) ((percentage - f3) * 1000.0f));
        }
    }
}
