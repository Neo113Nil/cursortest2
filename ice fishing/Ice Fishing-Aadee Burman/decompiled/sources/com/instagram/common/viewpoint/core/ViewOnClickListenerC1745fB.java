package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.fB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1745fB implements View.OnClickListener {
    public final /* synthetic */ C0846Df A00;

    public ViewOnClickListenerC1745fB(C0846Df c0846Df) {
        this.A00 = c0846Df;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        VI vi;
        C1840gi c1840gi;
        C0877Ek c0877Ek;
        boolean A07;
        C0877Ek c0877Ek2;
        C0877Ek c0877Ek3;
        if (WU.A02(this)) {
            return;
        }
        try {
            vi = this.A00.A04;
            vi.A04(VH.A0l, null);
            c1840gi = this.A00.A03;
            c1840gi.A0F().A3m();
            c0877Ek = this.A00.A00;
            if (c0877Ek != null) {
                A07 = this.A00.A07();
                if (A07) {
                    c0877Ek3 = this.A00.A00;
                    c0877Ek3.setVolume(1.0f);
                } else {
                    c0877Ek2 = this.A00.A00;
                    c0877Ek2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
