package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.dg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1674dg implements Runnable {
    public final /* synthetic */ AnonymousClass55 A00;

    public RunnableC1674dg(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1680dm interfaceC1680dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A0B = true;
            interfaceC1680dm = this.A00.A0Z;
            interfaceC1680dm.AFw(true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
