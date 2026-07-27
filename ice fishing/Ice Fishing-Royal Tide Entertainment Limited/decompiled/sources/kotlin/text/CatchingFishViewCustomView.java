package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishViewCustomView {
    public int CatchingFishCoroutine;
    public int CatchingFishParcelableFAB;
    public int CatchingFishSnackbar;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CatchingFishViewCustomView)) {
                return false;
            }
            CatchingFishViewCustomView catchingFishViewCustomView = (CatchingFishViewCustomView) obj;
            int i = this.CatchingFishParcelableFAB;
            if (i != catchingFishViewCustomView.CatchingFishParcelableFAB) {
                return false;
            }
            if (i != 8 || Math.abs(this.CatchingFishCoroutine - this.CatchingFishSnackbar) != 1 || this.CatchingFishCoroutine != catchingFishViewCustomView.CatchingFishSnackbar || this.CatchingFishSnackbar != catchingFishViewCustomView.CatchingFishCoroutine) {
                return this.CatchingFishCoroutine == catchingFishViewCustomView.CatchingFishCoroutine && this.CatchingFishSnackbar == catchingFishViewCustomView.CatchingFishSnackbar;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.CatchingFishParcelableFAB * 31) + this.CatchingFishSnackbar) * 31) + this.CatchingFishCoroutine;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.CatchingFishParcelableFAB;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.CatchingFishSnackbar);
        sb.append("c:");
        sb.append(this.CatchingFishCoroutine);
        sb.append(",p:null]");
        return sb.toString();
    }
}
