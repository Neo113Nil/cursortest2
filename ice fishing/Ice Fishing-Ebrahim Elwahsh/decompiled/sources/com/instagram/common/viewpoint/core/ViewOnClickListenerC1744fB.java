package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1744fB implements View.OnClickListener {
    public final /* synthetic */ C0845Df A00;

    public ViewOnClickListenerC1744fB(C0845Df c0845Df) {
        this.A00 = c0845Df;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VI vi;
        C1839gi c1839gi;
        C0876Ek c0876Ek;
        boolean A07;
        C0876Ek c0876Ek2;
        C0876Ek c0876Ek3;
        if (WU.A02(this)) {
            return;
        }
        try {
            vi = this.A00.A04;
            vi.A04(VH.A0l, null);
            c1839gi = this.A00.A03;
            c1839gi.A0F().A3m();
            c0876Ek = this.A00.A00;
            if (c0876Ek != null) {
                A07 = this.A00.A07();
                if (A07) {
                    c0876Ek3 = this.A00.A00;
                    c0876Ek3.setVolume(1.0f);
                } else {
                    c0876Ek2 = this.A00.A00;
                    c0876Ek2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
