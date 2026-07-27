package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishFluxStripeAPI {
    public int CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public int CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public int CatchingFishSnackbar;

    public final boolean CatchingFishParcelableFAB() {
        int i = this.CatchingFishParcelableFAB;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.CatchingFishReduxKtor;
            int i4 = this.CatchingFishSnackbar;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.CatchingFishReduxKtor;
            int i6 = this.CatchingFishCoroutine;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.CatchingFishDaggerWebsocket;
            int i8 = this.CatchingFishSnackbar;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.CatchingFishDaggerWebsocket;
            int i10 = this.CatchingFishCoroutine;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
