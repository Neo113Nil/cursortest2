package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1593ch implements Runnable {
    public final /* synthetic */ C1003Ji A00;

    public RunnableC1593ch(C1003Ji c1003Ji) {
        this.A00 = c1003Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1517bT c1517bT;
        C1517bT c1517bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1517bT = this.A00.A09;
            if (c1517bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c1517bT2 = this.A00.A09;
                c1517bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
