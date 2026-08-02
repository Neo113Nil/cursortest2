package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1253Sk extends Thread {
    public final long A00;

    public C1253Sk(long j6) {
        this.A00 = j6;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (WU.A02(this)) {
            return;
        }
        while (true) {
            try {
                try {
                    Thread.sleep(this.A00);
                } catch (Throwable th) {
                    WU.A00(th, this);
                    return;
                }
            } catch (InterruptedException unused) {
            }
            C1251Si.A01();
        }
    }
}
