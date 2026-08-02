package q2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4872d extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f40050n;

    /* renamed from: u, reason: collision with root package name */
    public final long f40051u;

    /* renamed from: v, reason: collision with root package name */
    public final CountDownLatch f40052v = new CountDownLatch(1);

    /* renamed from: w, reason: collision with root package name */
    public boolean f40053w = false;

    public C4872d(C4870b c4870b, long j6) {
        this.f40050n = new WeakReference(c4870b);
        this.f40051u = j6;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C4870b c4870b;
        WeakReference weakReference = this.f40050n;
        try {
            if (this.f40052v.await(this.f40051u, TimeUnit.MILLISECONDS) || (c4870b = (C4870b) weakReference.get()) == null) {
                return;
            }
            c4870b.c();
            this.f40053w = true;
        } catch (InterruptedException unused) {
            C4870b c4870b2 = (C4870b) weakReference.get();
            if (c4870b2 != null) {
                c4870b2.c();
                this.f40053w = true;
            }
        }
    }
}
