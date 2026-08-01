package o2;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4786d extends Thread {

    /* renamed from: n, reason: collision with root package name */
    public final WeakReference f39567n;

    /* renamed from: u, reason: collision with root package name */
    public final long f39568u;

    /* renamed from: v, reason: collision with root package name */
    public final CountDownLatch f39569v = new CountDownLatch(1);

    /* renamed from: w, reason: collision with root package name */
    public boolean f39570w = false;

    public C4786d(C4784b c4784b, long j6) {
        this.f39567n = new WeakReference(c4784b);
        this.f39568u = j6;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        C4784b c4784b;
        WeakReference weakReference = this.f39567n;
        try {
            if (this.f39569v.await(this.f39568u, TimeUnit.MILLISECONDS) || (c4784b = (C4784b) weakReference.get()) == null) {
                return;
            }
            c4784b.c();
            this.f39570w = true;
        } catch (InterruptedException unused) {
            C4784b c4784b2 = (C4784b) weakReference.get();
            if (c4784b2 != null) {
                c4784b2.c();
                this.f39570w = true;
            }
        }
    }
}
