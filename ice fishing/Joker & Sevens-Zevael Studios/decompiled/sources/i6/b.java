package i6;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: g, reason: collision with root package name */
    public final WeakReference f3206g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3207h;

    /* renamed from: i, reason: collision with root package name */
    public final CountDownLatch f3208i;

    public b(a aVar, long j3) {
        super("AdIdClientAutoDisconnectThread");
        this.f3206g = new WeakReference(aVar);
        this.f3207h = j3;
        this.f3208i = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        a aVar;
        WeakReference weakReference = this.f3206g;
        try {
            if (this.f3208i.await(this.f3207h, TimeUnit.MILLISECONDS) || (aVar = (a) weakReference.get()) == null) {
                return;
            }
            aVar.b();
        } catch (InterruptedException unused) {
            a aVar2 = (a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
            }
        }
    }
}
