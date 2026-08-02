package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Qe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1197Qe extends AbstractRunnableC1347Wc {
    public final /* synthetic */ XO A00;

    public C1197Qe(XO xo) {
        this.A00 = xo;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        Handler handler;
        long j6;
        if (!this.A00.A05()) {
            return;
        }
        this.A00.A02();
        handler = this.A00.A05;
        j6 = this.A00.A02;
        handler.postDelayed(this, j6);
    }
}
