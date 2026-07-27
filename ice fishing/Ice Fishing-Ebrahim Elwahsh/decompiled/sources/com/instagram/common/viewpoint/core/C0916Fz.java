package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0916Fz implements InterfaceC1603cs {
    public final /* synthetic */ C0915Fy A00;

    public C0916Fz(C0915Fy c0915Fy) {
        this.A00 = c0915Fy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1603cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1603cs
    public final void AGY(View view) {
        AbstractC1000Jg abstractC1000Jg = (AbstractC1000Jg) view;
        abstractC1000Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1000Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
