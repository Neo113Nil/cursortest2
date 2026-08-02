package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0953Gp implements InterfaceC1399Yf {
    public final /* synthetic */ AbstractC0947Gj A00;

    public C0953Gp(AbstractC0947Gj abstractC0947Gj) {
        this.A00 = abstractC0947Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1399Yf
    public final void AEZ(int i) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
