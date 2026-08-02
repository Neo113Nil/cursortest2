package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ci, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1614ci implements Runnable {
    public final /* synthetic */ C1023Ji A00;

    public RunnableC1614ci(C1023Ji c1023Ji) {
        this.A00 = c1023Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        if (WU.A02(this)) {
            return;
        }
        try {
            z6 = this.A00.A0D;
            if (z6) {
                this.A00.A0M();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
