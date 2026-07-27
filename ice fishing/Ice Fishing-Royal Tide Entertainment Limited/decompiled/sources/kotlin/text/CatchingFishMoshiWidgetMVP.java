package kotlin.text;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class CatchingFishMoshiWidgetMVP implements ThreadFactory {
    public final String CatchingFishParcelableFAB;
    public final ThreadFactory CatchingFishSnackbar = Executors.defaultThreadFactory();

    public CatchingFishMoshiWidgetMVP(String str) {
        this.CatchingFishParcelableFAB = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.CatchingFishSnackbar.newThread(new CatchingFishFABXMLLayout(runnable, 2));
        newThread.setName(this.CatchingFishParcelableFAB);
        return newThread;
    }
}
