package kotlin.text;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishRealmMVI extends Thread {
    public final long CatchingFishDaggerWebsocket;
    public final WeakReference CatchingFishReduxKtor;
    public final CountDownLatch CatchingFishWorkManager = new CountDownLatch(1);
    public boolean CatchingFishViewModelScope = false;

    public CatchingFishRealmMVI(AdvertisingIdClient advertisingIdClient, long j) {
        this.CatchingFishReduxKtor = new WeakReference(advertisingIdClient);
        this.CatchingFishDaggerWebsocket = j;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AdvertisingIdClient advertisingIdClient;
        WeakReference weakReference = this.CatchingFishReduxKtor;
        try {
            if (this.CatchingFishWorkManager.await(this.CatchingFishDaggerWebsocket, TimeUnit.MILLISECONDS) || (advertisingIdClient = (AdvertisingIdClient) weakReference.get()) == null) {
                return;
            }
            advertisingIdClient.CatchingFishParcelableFAB();
            this.CatchingFishViewModelScope = true;
        } catch (InterruptedException unused) {
            AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) weakReference.get();
            if (advertisingIdClient2 != null) {
                advertisingIdClient2.CatchingFishParcelableFAB();
                this.CatchingFishViewModelScope = true;
            }
        }
    }
}
