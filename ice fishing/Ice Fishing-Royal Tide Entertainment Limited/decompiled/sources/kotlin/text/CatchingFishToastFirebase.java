package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToastFirebase {
    public final Integer CatchingFishParcelableFAB;
    public final Object CatchingFishSnackbar;

    public CatchingFishToastFirebase(Integer num, Object obj) {
        this.CatchingFishParcelableFAB = num;
        this.CatchingFishSnackbar = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishToastFirebase)) {
            return false;
        }
        CatchingFishToastFirebase catchingFishToastFirebase = (CatchingFishToastFirebase) obj;
        return this.CatchingFishParcelableFAB.equals(catchingFishToastFirebase.CatchingFishParcelableFAB) && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishSnackbar, catchingFishToastFirebase.CatchingFishSnackbar);
    }

    public final int hashCode() {
        int hashCode = this.CatchingFishParcelableFAB.hashCode() * 31;
        Object obj = this.CatchingFishSnackbar;
        return (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final String toString() {
        return "JoinedKey(left=" + this.CatchingFishParcelableFAB + ", right=" + this.CatchingFishSnackbar + ')';
    }
}
