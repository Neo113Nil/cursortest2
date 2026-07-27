package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class KY implements XN {
    public final /* synthetic */ C6K A00;

    public KY(C6K c6k) {
        this.A00 = c6k;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        AbstractC1375Yb abstractC1375Yb;
        AbstractC1375Yb abstractC1375Yb2;
        this.A00.A02 = false;
        abstractC1375Yb = this.A00.A07;
        if (abstractC1375Yb != null) {
            abstractC1375Yb2 = this.A00.A07;
            abstractC1375Yb2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f3) {
        AbstractC1375Yb abstractC1375Yb;
        AbstractC1375Yb abstractC1375Yb2;
        abstractC1375Yb = this.A00.A07;
        if (abstractC1375Yb != null) {
            abstractC1375Yb2 = this.A00.A07;
            abstractC1375Yb2.setProgressImmediate(100.0f * (1.0f - (f3 / this.A00.getAdInfo().A0K().A00())));
        }
    }
}
