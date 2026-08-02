package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0937Fz implements InterfaceC1624cs {
    public final /* synthetic */ C0936Fy A00;

    public C0937Fz(C0936Fy c0936Fy) {
        this.A00 = c0936Fy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1624cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1624cs
    public final void AGY(View view) {
        AbstractC1021Jg abstractC1021Jg = (AbstractC1021Jg) view;
        abstractC1021Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1021Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
