package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1261Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C1266Sx A01;

    public CallableC1261Ss(C1266Sx c1266Sx, C1262St c1262St) {
        this.A01 = c1266Sx;
        new Handler(Looper.getMainLooper()).post(new C1863gl(this, c1266Sx, c1262St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C1262St c1262St) {
        T8 t82;
        T8 t83;
        long currentTimeMillis = System.currentTimeMillis();
        t82 = this.A01.A04;
        C1791fb A06 = C1791fb.A06(t82.A02());
        Uri A00 = XB.A00(c1262St.A08);
        long j6 = c1262St.A00;
        if (j6 == -1) {
            t83 = this.A01.A04;
            j6 = C1310Up.A0S(t83);
        }
        A06.A0I(A00, new C1862gk(this, c1262St, j6, currentTimeMillis), j6);
    }
}
