package kotlin.text;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishJUnitStripeAPI implements ThreadFactory {
    public final /* synthetic */ String CatchingFishParcelableFAB;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.CatchingFishParcelableFAB);
        thread.setPriority(10);
        return thread;
    }
}
