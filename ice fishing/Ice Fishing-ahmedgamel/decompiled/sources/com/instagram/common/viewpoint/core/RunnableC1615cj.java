package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1615cj implements Runnable {
    public final /* synthetic */ C1023Ji A00;

    public RunnableC1615cj(C1023Ji c1023Ji) {
        this.A00 = c1023Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1577c7 c1577c7;
        C1577c7 c1577c72;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0C = true;
            c1577c7 = this.A00.A0b;
            if (c1577c7.A0D() != null) {
                c1577c72 = this.A00.A0b;
                c1577c72.A0D().AFw(true);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
