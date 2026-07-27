package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishToastPayPal extends CatchingFishOkHttpWebsocket {
    public final ArrayList CatchingFishParcelableFAB;

    public CatchingFishToastPayPal(ArrayList arrayList) {
        this.CatchingFishParcelableFAB = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishOkHttpWebsocket)) {
            return false;
        }
        return this.CatchingFishParcelableFAB.equals(((CatchingFishToastPayPal) ((CatchingFishOkHttpWebsocket) obj)).CatchingFishParcelableFAB);
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.CatchingFishParcelableFAB + "}";
    }
}
