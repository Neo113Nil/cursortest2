package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishToastGraphQL {
    public final long CatchingFishParcelableFAB;
    public final long CatchingFishSnackbar;

    public CatchingFishToastGraphQL(long j, long j2) {
        this.CatchingFishParcelableFAB = j;
        this.CatchingFishSnackbar = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishToastGraphQL)) {
            return false;
        }
        CatchingFishToastGraphQL catchingFishToastGraphQL = (CatchingFishToastGraphQL) obj;
        return CatchingFishToastFragment.CatchingFishCoroutine(this.CatchingFishParcelableFAB, catchingFishToastGraphQL.CatchingFishParcelableFAB) && CatchingFishToastFragment.CatchingFishCoroutine(this.CatchingFishSnackbar, catchingFishToastGraphQL.CatchingFishSnackbar);
    }

    public final int hashCode() {
        int i = CatchingFishToastFragment.CatchingFishViewModelScope;
        return Long.hashCode(this.CatchingFishSnackbar) + (Long.hashCode(this.CatchingFishParcelableFAB) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        CatchingFishMVPLiveData.CatchingFishCoroutineFlow(this.CatchingFishParcelableFAB, sb, ", selectionBackgroundColor=");
        sb.append((Object) CatchingFishToastFragment.CatchingFishViewModelFAB(this.CatchingFishSnackbar));
        sb.append(')');
        return sb.toString();
    }
}
