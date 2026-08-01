package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ci, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1594ci implements Runnable {
    public final /* synthetic */ C1003Ji A00;

    public RunnableC1594ci(C1003Ji c1003Ji) {
        this.A00 = c1003Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z3;
        if (WU.A02(this)) {
            return;
        }
        try {
            z3 = this.A00.A0D;
            if (z3) {
                this.A00.A0M();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
