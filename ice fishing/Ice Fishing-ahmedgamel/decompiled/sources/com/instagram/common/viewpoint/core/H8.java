package com.instagram.common.viewpoint.core;

import android.text.TextUtils;

/* loaded from: assets/audience_network/classes2.dex */
public class H8 extends AbstractC1804fo {
    public final /* synthetic */ AbstractC0947Gj A00;

    public H8(AbstractC0947Gj abstractC0947Gj) {
        this.A00 = abstractC0947Gj;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC1804fo
    public final void A03() {
        if (!this.A00.A08.A07()) {
            this.A00.A08.A05();
            if (!TextUtils.isEmpty(this.A00.A03.A2E())) {
                this.A00.A06.ABJ(this.A00.A03.A2E(), new C1517b9().A03(this.A00.A0C).A02(this.A00.A08).A04(this.A00.A03.A0z()).A05());
                if (this.A00.A03.A1u()) {
                    this.A00.A05.A0F().AEW();
                }
                C1356Wl.A00(this.A00.A05).A0E(this.A00.A0B.A8l(), this.A00.A03.A2E());
                C1124Ng.A07(this.A00.A03.A2A(), this.A00.A05);
                this.A00.A05.A0F().A3L();
                AbstractC1144Oa.A02(this.A00.A03.A0y(), AbstractC1380Xm.A00(this.A00.A03.A10()));
                this.A00.A0A.A4j(this.A00.A0B.A8G());
            }
        }
    }
}
