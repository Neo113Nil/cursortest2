package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishSnackbarLayout {
    public final int CatchingFishCoroutine;
    public final int CatchingFishParcelableFAB;
    public final int CatchingFishReduxKtor;
    public final int CatchingFishSnackbar;

    public CatchingFishSnackbarLayout(int i, int i2, int i3, int i4) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = i2;
        this.CatchingFishCoroutine = i3;
        this.CatchingFishReduxKtor = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatchingFishSnackbarLayout)) {
            return false;
        }
        CatchingFishSnackbarLayout catchingFishSnackbarLayout = (CatchingFishSnackbarLayout) obj;
        return this.CatchingFishParcelableFAB == catchingFishSnackbarLayout.CatchingFishParcelableFAB && this.CatchingFishSnackbar == catchingFishSnackbarLayout.CatchingFishSnackbar && this.CatchingFishCoroutine == catchingFishSnackbarLayout.CatchingFishCoroutine && this.CatchingFishReduxKtor == catchingFishSnackbarLayout.CatchingFishReduxKtor;
    }

    public final int hashCode() {
        return Integer.hashCode(this.CatchingFishReduxKtor) + CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishCoroutine, CatchingFishMVPLiveData.CatchingFishViewModelScope(this.CatchingFishSnackbar, Integer.hashCode(this.CatchingFishParcelableFAB) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.CatchingFishParcelableFAB);
        sb.append(", ");
        sb.append(this.CatchingFishSnackbar);
        sb.append(", ");
        sb.append(this.CatchingFishCoroutine);
        sb.append(", ");
        return CatchingFishMVPLiveData.CatchingFishAnimationMockk(sb, this.CatchingFishReduxKtor, ')');
    }
}
