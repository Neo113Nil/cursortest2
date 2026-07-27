package com.instagram.common.viewpoint.core;

import java.util.concurrent.CountDownLatch;

/* renamed from: com.facebook.ads.redexgen.X.kD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2041kD extends AbstractRunnableC1327Wc {
    public final /* synthetic */ N8 A00;

    public C2041kD(N8 n82) {
        this.A00 = n82;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        N7 n72;
        CountDownLatch countDownLatch;
        this.A00.A07();
        n72 = this.A00.A02;
        n72.A06();
        countDownLatch = this.A00.A05;
        countDownLatch.countDown();
    }
}
