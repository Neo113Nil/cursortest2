package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0917Fz implements InterfaceC1604cs {
    public final /* synthetic */ C0916Fy A00;

    public C0917Fz(C0916Fy c0916Fy) {
        this.A00 = c0916Fy;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1604cs
    public final void AGW(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1604cs
    public final void AGY(View view) {
        AbstractC1001Jg abstractC1001Jg = (AbstractC1001Jg) view;
        abstractC1001Jg.A1T();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC1001Jg.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
