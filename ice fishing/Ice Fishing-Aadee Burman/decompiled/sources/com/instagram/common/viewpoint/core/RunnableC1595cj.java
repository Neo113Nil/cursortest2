package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1595cj implements Runnable {
    public final /* synthetic */ C1003Ji A00;

    public RunnableC1595cj(C1003Ji c1003Ji) {
        this.A00 = c1003Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1557c7 c1557c7;
        C1557c7 c1557c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            c1557c7 = this.A00.A0b;
            if (c1557c7.A0D() != null) {
                c1557c72 = this.A00.A0b;
                c1557c72.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
