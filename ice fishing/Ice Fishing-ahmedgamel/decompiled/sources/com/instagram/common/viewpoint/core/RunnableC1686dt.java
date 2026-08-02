package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.dt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1686dt implements Runnable {
    public final /* synthetic */ C4V A00;

    public RunnableC1686dt(C4V c4v) {
        this.A00 = c4v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        try {
            ((AbstractC0947Gj) this.A00).A0A.A4j(((AbstractC0947Gj) this.A00).A0B.A7w());
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
