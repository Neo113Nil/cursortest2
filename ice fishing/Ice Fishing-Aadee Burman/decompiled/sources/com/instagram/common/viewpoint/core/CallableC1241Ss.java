package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1241Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C1246Sx A01;

    public CallableC1241Ss(C1246Sx c1246Sx, C1242St c1242St) {
        this.A01 = c1246Sx;
        new Handler(Looper.getMainLooper()).post(new C1843gl(this, c1246Sx, c1242St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C1242St c1242St) {
        T8 t82;
        T8 t83;
        long currentTimeMillis = System.currentTimeMillis();
        t82 = this.A01.A04;
        C1771fb A06 = C1771fb.A06(t82.A02());
        Uri A00 = XB.A00(c1242St.A08);
        long j6 = c1242St.A00;
        if (j6 == -1) {
            t83 = this.A01.A04;
            j6 = C1290Up.A0S(t83);
        }
        A06.A0I(A00, new C1842gk(this, c1242St, j6, currentTimeMillis), j6);
    }
}
