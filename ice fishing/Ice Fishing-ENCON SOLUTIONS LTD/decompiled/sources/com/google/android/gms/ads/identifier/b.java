package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2659a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2660b;

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f2661c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f2662d = false;

    public b(AdvertisingIdClient advertisingIdClient, long j2) {
        this.f2659a = new WeakReference(advertisingIdClient);
        this.f2660b = j2;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.f2659a;
        try {
            if (this.f2661c.await(this.f2660b, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zza();
            this.f2662d = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zza();
                this.f2662d = true;
            }
        }
    }
}
