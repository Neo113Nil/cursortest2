package com.gamericefishpro.space.o8;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Thread {
    public final WeakReference d;
    public final long e;
    public final CountDownLatch i;

    public d(b bVar, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.d = new WeakReference(bVar);
        this.e = j;
        this.i = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar;
        WeakReference weakReference = this.d;
        try {
            if (this.i.await(this.e, TimeUnit.MILLISECONDS) || (bVar = (b) weakReference.get()) == null) {
                return;
            }
            bVar.c();
        } catch (InterruptedException unused) {
            b bVar2 = (b) weakReference.get();
            if (bVar2 != null) {
                bVar2.c();
            }
        }
    }
}
