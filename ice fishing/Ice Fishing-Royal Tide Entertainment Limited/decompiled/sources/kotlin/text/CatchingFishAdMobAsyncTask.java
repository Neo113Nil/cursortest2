package kotlin.text;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishAdMobAsyncTask implements ThreadFactory {
    public final /* synthetic */ String CatchingFishParcelableFAB;
    public final /* synthetic */ boolean CatchingFishSnackbar;

    public /* synthetic */ CatchingFishAdMobAsyncTask(String str, boolean z) {
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.CatchingFishParcelableFAB);
        thread.setDaemon(this.CatchingFishSnackbar);
        return thread;
    }
}
