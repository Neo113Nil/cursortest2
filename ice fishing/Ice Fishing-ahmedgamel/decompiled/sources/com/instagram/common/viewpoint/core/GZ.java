package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GZ extends AbstractRunnableC1327Wc {
    public final /* synthetic */ C06494x A00;

    public GZ(C06494x c06494x) {
        this.A00 = c06494x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        AbstractC1553c3 abstractC1553c3;
        AbstractC1553c3 abstractC1553c32;
        abstractC1553c3 = this.A00.A00;
        if (abstractC1553c3 != null) {
            abstractC1553c32 = this.A00.A00;
            if (abstractC1553c32.A1N()) {
                ((AbstractC0927Gj) this.A00).A02 = true;
                this.A00.A09.setToolbarActionMode(8);
            }
        }
    }
}
