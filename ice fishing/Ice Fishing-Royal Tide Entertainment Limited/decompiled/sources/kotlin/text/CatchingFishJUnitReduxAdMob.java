package kotlin.text;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.scheduler.SingleThreadCachedScheduler;

/* loaded from: classes.dex */
public final class CatchingFishJUnitReduxAdMob implements Runnable {
    public final /* synthetic */ Runnable CatchingFishDaggerWebsocket;
    public final /* synthetic */ long CatchingFishReduxKtor;
    public final /* synthetic */ SingleThreadCachedScheduler CatchingFishWorkManager;

    public CatchingFishJUnitReduxAdMob(SingleThreadCachedScheduler singleThreadCachedScheduler, long j, Runnable runnable) {
        this.CatchingFishWorkManager = singleThreadCachedScheduler;
        this.CatchingFishReduxKtor = j;
        this.CatchingFishDaggerWebsocket = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Thread.sleep(this.CatchingFishReduxKtor);
        } catch (InterruptedException e) {
            AdjustFactory.getLogger().warn("Sleep delay exception: %s", e.getMessage());
        }
        this.CatchingFishWorkManager.submit(this.CatchingFishDaggerWebsocket);
    }
}
