package kotlin.text;

import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class CatchingFishJobSchedulerFAB extends CatchingFishOkHttpFAB {
    public static volatile CatchingFishJobSchedulerFAB CatchingFishSnackbar;
    public final Object CatchingFishParcelableFAB;

    public CatchingFishJobSchedulerFAB(int i) {
        switch (i) {
            case 1:
                this.CatchingFishParcelableFAB = new Object();
                Executors.newFixedThreadPool(4, new CatchingFishWorkManagerFlux());
                break;
            default:
                this.CatchingFishParcelableFAB = new CatchingFishJobSchedulerFAB(1);
                break;
        }
    }

    public static CatchingFishJobSchedulerFAB CatchingFishRedux() {
        if (CatchingFishSnackbar != null) {
            return CatchingFishSnackbar;
        }
        synchronized (CatchingFishJobSchedulerFAB.class) {
            try {
                if (CatchingFishSnackbar == null) {
                    CatchingFishSnackbar = new CatchingFishJobSchedulerFAB(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return CatchingFishSnackbar;
    }
}
