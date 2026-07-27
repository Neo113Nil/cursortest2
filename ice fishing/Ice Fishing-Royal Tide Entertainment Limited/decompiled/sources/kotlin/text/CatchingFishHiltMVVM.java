package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHiltMVVM {
    public final int CatchingFishParcelableFAB;
    public final Integer CatchingFishSnackbar;

    public CatchingFishHiltMVVM(int i, Integer num) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishHiltMVVM)) {
            return false;
        }
        CatchingFishHiltMVVM catchingFishHiltMVVM = (CatchingFishHiltMVVM) obj;
        return this.CatchingFishParcelableFAB == catchingFishHiltMVVM.CatchingFishParcelableFAB && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishHiltMVVM.CatchingFishSnackbar);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.CatchingFishParcelableFAB) * 31;
        Integer num = this.CatchingFishSnackbar;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.CatchingFishParcelableFAB + ", dataOffset=" + this.CatchingFishSnackbar + ')';
    }
}
