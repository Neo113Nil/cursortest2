package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class EE implements InterfaceC1745er {
    public final View A00;
    public final C1860gi A01;

    public EE(C1860gi c1860gi, View view) {
        this.A01 = c1860gi;
        this.A00 = view;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1745er
    public final double A9V() {
        C1806fq result = C1805fp.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
