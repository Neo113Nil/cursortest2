package kotlin.text;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class CatchingFishKtorAsyncTask {
    public final CatchingFishMVIWorkManager CatchingFishParcelableFAB;
    public final HashMap CatchingFishSnackbar;

    public CatchingFishKtorAsyncTask(CatchingFishMVIWorkManager catchingFishMVIWorkManager, HashMap hashMap) {
        this.CatchingFishParcelableFAB = catchingFishMVIWorkManager;
        this.CatchingFishSnackbar = hashMap;
    }

    public final long CatchingFishParcelableFAB(CatchingFishContextMVI catchingFishContextMVI, long j, int i) {
        long CatchingFishParcelableFAB = j - this.CatchingFishParcelableFAB.CatchingFishParcelableFAB();
        CatchingFishWorkManagerView catchingFishWorkManagerView = (CatchingFishWorkManagerView) this.CatchingFishSnackbar.get(catchingFishContextMVI);
        long j2 = catchingFishWorkManagerView.CatchingFishParcelableFAB;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), CatchingFishParcelableFAB), catchingFishWorkManagerView.CatchingFishSnackbar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishKtorAsyncTask)) {
            return false;
        }
        CatchingFishKtorAsyncTask catchingFishKtorAsyncTask = (CatchingFishKtorAsyncTask) obj;
        return this.CatchingFishParcelableFAB.equals(catchingFishKtorAsyncTask.CatchingFishParcelableFAB) && this.CatchingFishSnackbar.equals(catchingFishKtorAsyncTask.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return ((this.CatchingFishParcelableFAB.hashCode() ^ 1000003) * 1000003) ^ this.CatchingFishSnackbar.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.CatchingFishParcelableFAB + ", values=" + this.CatchingFishSnackbar + "}";
    }
}
