package kotlin.text;

import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishMoshiLifecycle {
    public final List CatchingFishParcelableFAB;
    public final int CatchingFishSnackbar;

    public CatchingFishMoshiLifecycle(int i, List list) {
        this.CatchingFishParcelableFAB = list;
        this.CatchingFishSnackbar = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        throw new IllegalArgumentException(("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '" + i + "', bounds = '" + new CatchingFishLifecycleMoshi(0, list.size() - 1, 1) + "'.").toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CatchingFishMoshiLifecycle.class != obj.getClass()) {
            return false;
        }
        CatchingFishMoshiLifecycle catchingFishMoshiLifecycle = (CatchingFishMoshiLifecycle) obj;
        return this.CatchingFishSnackbar == catchingFishMoshiLifecycle.CatchingFishSnackbar && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishParcelableFAB, catchingFishMoshiLifecycle.CatchingFishParcelableFAB);
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode() + (this.CatchingFishSnackbar * 31);
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.CatchingFishSnackbar + ", mergedHistory=" + this.CatchingFishParcelableFAB + ')';
    }

    public CatchingFishMoshiLifecycle() {
        this(-1, CatchingFishViewPagerDagger.CatchingFishReduxKtor);
    }
}
