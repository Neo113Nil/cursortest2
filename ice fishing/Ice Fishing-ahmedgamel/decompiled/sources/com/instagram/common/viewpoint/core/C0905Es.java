package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Es, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0905Es extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C0897Ek A00;

    public C0905Es(C0897Ek c0897Ek) {
        this.A00 = c0897Ek;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        boolean z6;
        UM um;
        Handler handler;
        int i;
        z6 = this.A00.A04;
        if (!z6) {
            um = this.A00.A0C;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            um.A02(new EB(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.4A
            });
            handler = this.A00.A08;
            i = this.A00.A01;
            handler.postDelayed(this, i);
        }
    }
}
