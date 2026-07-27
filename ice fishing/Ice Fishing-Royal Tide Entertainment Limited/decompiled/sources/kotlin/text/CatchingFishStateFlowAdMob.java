package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishStateFlowAdMob {
    public final String CatchingFishParcelableFAB;
    public final ArrayList CatchingFishSnackbar;

    public CatchingFishStateFlowAdMob(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.CatchingFishParcelableFAB = str;
        this.CatchingFishSnackbar = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishStateFlowAdMob)) {
            return false;
        }
        CatchingFishStateFlowAdMob catchingFishStateFlowAdMob = (CatchingFishStateFlowAdMob) obj;
        return this.CatchingFishParcelableFAB.equals(catchingFishStateFlowAdMob.CatchingFishParcelableFAB) && this.CatchingFishSnackbar.equals(catchingFishStateFlowAdMob.CatchingFishSnackbar);
    }

    public final int hashCode() {
        return ((this.CatchingFishParcelableFAB.hashCode() ^ 1000003) * 1000003) ^ this.CatchingFishSnackbar.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.CatchingFishParcelableFAB + ", usedDates=" + this.CatchingFishSnackbar + "}";
    }
}
