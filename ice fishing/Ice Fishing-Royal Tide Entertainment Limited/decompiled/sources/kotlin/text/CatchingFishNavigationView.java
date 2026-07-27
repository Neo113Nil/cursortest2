package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishNavigationView {
    public int CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public boolean CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public int CatchingFishWorkManager;

    public final void CatchingFishParcelableFAB(int i, int i2) {
        this.CatchingFishCoroutine = i;
        this.CatchingFishReduxKtor = i2;
        this.CatchingFishViewModelFAB = true;
        if (this.CatchingFishViewModelScope) {
            if (i2 != Integer.MIN_VALUE) {
                this.CatchingFishParcelableFAB = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.CatchingFishSnackbar = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.CatchingFishParcelableFAB = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.CatchingFishSnackbar = i2;
        }
    }
}
