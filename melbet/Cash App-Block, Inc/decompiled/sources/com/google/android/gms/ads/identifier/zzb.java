package com.google.android.gms.ads.identifier;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzb extends Thread {
    public final CountDownLatch zza;
    public final WeakReference zzb;
    public final long zzc;

    public zzb(AdvertisingIdClient advertisingIdClient, long j) {
        super("AdIdClientAutoDisconnectThread");
        this.zzb = new WeakReference(advertisingIdClient);
        this.zzc = j;
        this.zza = new CountDownLatch(1);
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.zzb;
        try {
            if (this.zza.await(this.zzc, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.zzc();
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.zzc();
            }
        }
    }
}
