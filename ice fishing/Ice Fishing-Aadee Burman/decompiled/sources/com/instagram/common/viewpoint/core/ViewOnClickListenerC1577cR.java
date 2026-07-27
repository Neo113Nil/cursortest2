package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1577cR implements View.OnClickListener {
    public final /* synthetic */ KE A00;

    public ViewOnClickListenerC1577cR(KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z3;
        boolean z6;
        AbstractC1092Mt abstractC1092Mt;
        AbstractC2005jd abstractC2005jd;
        Handler handler;
        Runnable runnable;
        AbstractC2005jd abstractC2005jd2;
        AbstractC1092Mt abstractC1092Mt2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z3 = this.A00.A0M;
            if (!z3) {
                this.A00.A0N = true;
                abstractC1092Mt = this.A00.A0b;
                if (abstractC1092Mt != null) {
                    KE ke = this.A00;
                    abstractC1092Mt2 = this.A00.A0b;
                    ke.A0f(((AnonymousClass85) abstractC1092Mt2).A0M().toString());
                }
                abstractC2005jd = this.A00.A0E;
                if (abstractC2005jd.A0q() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0h;
                    abstractC2005jd2 = this.A00.A0E;
                    handler.postDelayed(runnable, abstractC2005jd2.A0q());
                }
            }
            KE ke2 = this.A00;
            z6 = this.A00.A0M;
            ke2.A0i(z6 ? false : true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
