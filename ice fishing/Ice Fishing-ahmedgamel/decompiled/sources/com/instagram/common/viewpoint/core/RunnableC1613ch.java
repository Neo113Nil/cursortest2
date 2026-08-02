package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ch, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class RunnableC1613ch implements Runnable {
    public final /* synthetic */ C1023Ji A00;

    public RunnableC1613ch(C1023Ji c1023Ji) {
        this.A00 = c1023Ji;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1537bT c1537bT;
        C1537bT c1537bT2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1537bT = this.A00.A09;
            if (c1537bT != null && this.A00.getResources().getConfiguration().orientation == 1) {
                c1537bT2 = this.A00.A09;
                c1537bT2.A0A();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
