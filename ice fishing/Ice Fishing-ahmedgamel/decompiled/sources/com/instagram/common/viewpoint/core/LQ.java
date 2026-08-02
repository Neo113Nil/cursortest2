package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* loaded from: assets/audience_network/classes2.dex */
public class LQ extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C1514b6 A00;

    public LQ(C1514b6 c1514b6) {
        this.A00 = c1514b6;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        boolean z6;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z6 = this.A00.A08;
        if (!z6) {
            return;
        }
        handler = this.A00.A0D;
        runnable = this.A00.A0F;
        handler.postDelayed(runnable, 250L);
    }
}
