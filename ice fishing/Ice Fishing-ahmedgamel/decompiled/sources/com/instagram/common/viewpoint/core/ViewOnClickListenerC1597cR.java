package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1597cR implements View.OnClickListener {
    public final /* synthetic */ KE A00;

    public ViewOnClickListenerC1597cR(KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z6;
        boolean z9;
        AbstractC1112Mt abstractC1112Mt;
        AbstractC2025jd abstractC2025jd;
        Handler handler;
        Runnable runnable;
        AbstractC2025jd abstractC2025jd2;
        AbstractC1112Mt abstractC1112Mt2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z6 = this.A00.A0M;
            if (!z6) {
                this.A00.A0N = true;
                abstractC1112Mt = this.A00.A0b;
                if (abstractC1112Mt != null) {
                    KE ke = this.A00;
                    abstractC1112Mt2 = this.A00.A0b;
                    ke.A0f(((AnonymousClass85) abstractC1112Mt2).A0M().toString());
                }
                abstractC2025jd = this.A00.A0E;
                if (abstractC2025jd.A0q() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0h;
                    abstractC2025jd2 = this.A00.A0E;
                    handler.postDelayed(runnable, abstractC2025jd2.A0q());
                }
            }
            KE ke2 = this.A00;
            z9 = this.A00.A0M;
            ke2.A0i(z9 ? false : true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
