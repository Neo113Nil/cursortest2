package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.dO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1656dO implements Runnable {
    public final /* synthetic */ C5S A00;

    public RunnableC1656dO(C5S c5s) {
        this.A00 = c5s;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1680dm interfaceC1680dm;
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A08 = true;
            interfaceC1680dm = this.A00.A0P;
            interfaceC1680dm.AFw(true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
