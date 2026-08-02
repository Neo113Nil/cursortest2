package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GZ extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C06694x A00;

    public GZ(C06694x c06694x) {
        this.A00 = c06694x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        AbstractC1573c3 abstractC1573c3;
        AbstractC1573c3 abstractC1573c32;
        abstractC1573c3 = this.A00.A00;
        if (abstractC1573c3 != null) {
            abstractC1573c32 = this.A00.A00;
            if (abstractC1573c32.A1N()) {
                ((AbstractC0947Gj) this.A00).A02 = true;
                this.A00.A09.setToolbarActionMode(8);
            }
        }
    }
}
