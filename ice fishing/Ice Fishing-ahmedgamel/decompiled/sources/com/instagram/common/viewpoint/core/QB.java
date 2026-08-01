package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QB extends AbstractRunnableC1327Wc {
    public final /* synthetic */ ViewOnSystemUiVisibilityChangeListenerC1371Xx A00;

    public QB(ViewOnSystemUiVisibilityChangeListenerC1371Xx viewOnSystemUiVisibilityChangeListenerC1371Xx) {
        this.A00 = viewOnSystemUiVisibilityChangeListenerC1371Xx;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        this.A00.A02(false);
    }
}
