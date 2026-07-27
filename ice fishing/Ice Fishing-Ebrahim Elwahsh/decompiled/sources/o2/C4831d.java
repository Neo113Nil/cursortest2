package o2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4831d extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f39698n;

    /* renamed from: u, reason: collision with root package name */
    public final long f39699u;

    /* renamed from: v, reason: collision with root package name */
    public final CountDownLatch f39700v = new CountDownLatch(1);

    /* renamed from: w, reason: collision with root package name */
    public boolean f39701w = false;

    public C4831d(C4829b c4829b, long j9) {
        this.f39698n = new WeakReference(c4829b);
        this.f39699u = j9;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C4829b c4829b;
        WeakReference weakReference = this.f39698n;
        try {
            if (this.f39700v.await(this.f39699u, TimeUnit.MILLISECONDS) || (c4829b = (C4829b) weakReference.get()) == null) {
                return;
            }
            c4829b.c();
            this.f39701w = true;
        } catch (InterruptedException unused) {
            C4829b c4829b2 = (C4829b) weakReference.get();
            if (c4829b2 != null) {
                c4829b2.c();
                this.f39701w = true;
            }
        }
    }
}
