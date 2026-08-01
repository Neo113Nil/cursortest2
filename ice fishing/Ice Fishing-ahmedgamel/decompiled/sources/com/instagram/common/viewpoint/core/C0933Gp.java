package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0933Gp implements InterfaceC1379Yf {
    public final /* synthetic */ AbstractC0927Gj A00;

    public C0933Gp(AbstractC0927Gj abstractC0927Gj) {
        this.A00 = abstractC0927Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1379Yf
    public final void AEZ(int i) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
