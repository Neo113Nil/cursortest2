package kotlin.text;

import java.util.Set;

/* loaded from: classes.dex */
public final class CatchingFishWorkManagerView {
    public final Set CatchingFishCoroutine;
    public final long CatchingFishParcelableFAB;
    public final long CatchingFishSnackbar;

    public CatchingFishWorkManagerView(long j, long j2, Set set) {
        this.CatchingFishParcelableFAB = j;
        this.CatchingFishSnackbar = j2;
        this.CatchingFishCoroutine = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishWorkManagerView) {
            CatchingFishWorkManagerView catchingFishWorkManagerView = (CatchingFishWorkManagerView) obj;
            if (this.CatchingFishParcelableFAB == catchingFishWorkManagerView.CatchingFishParcelableFAB && this.CatchingFishSnackbar == catchingFishWorkManagerView.CatchingFishSnackbar && this.CatchingFishCoroutine.equals(catchingFishWorkManagerView.CatchingFishCoroutine)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.CatchingFishParcelableFAB;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.CatchingFishSnackbar;
        return ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.CatchingFishCoroutine.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.CatchingFishParcelableFAB + ", maxAllowedDelay=" + this.CatchingFishSnackbar + ", flags=" + this.CatchingFishCoroutine + "}";
    }
}
