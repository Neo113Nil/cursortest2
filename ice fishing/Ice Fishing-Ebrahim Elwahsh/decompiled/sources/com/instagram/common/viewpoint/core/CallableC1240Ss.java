package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Ss, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class CallableC1240Ss implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C1245Sx A01;

    public CallableC1240Ss(C1245Sx c1245Sx, C1241St c1241St) {
        this.A01 = c1245Sx;
        new Handler(Looper.getMainLooper()).post(new C1842gl(this, c1245Sx, c1241St));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C1241St c1241St) {
        T8 t82;
        T8 t83;
        long currentTimeMillis = System.currentTimeMillis();
        t82 = this.A01.A04;
        C1770fb A06 = C1770fb.A06(t82.A02());
        Uri A00 = XB.A00(c1241St.A08);
        long j9 = c1241St.A00;
        if (j9 == -1) {
            t83 = this.A01.A04;
            j9 = C1289Up.A0S(t83);
        }
        A06.A0I(A00, new C1841gk(this, c1241St, j9, currentTimeMillis), j9);
    }
}
