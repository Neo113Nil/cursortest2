package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.dc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1650dc implements Runnable {
    public final /* synthetic */ AnonymousClass55 A00;

    public RunnableC1650dc(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1517bT c1517bT;
        C1517bT c1517bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1517bT = this.A00.A07;
            if (c1517bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c1517bT2 = this.A00.A07;
                c1517bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
