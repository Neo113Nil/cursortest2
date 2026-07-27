package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishHandler {
    public static final CatchingFishHandler CatchingFishCoroutine;
    public static final CatchingFishHandler CatchingFishReduxKtor;
    public final boolean CatchingFishParcelableFAB;
    public final Throwable CatchingFishSnackbar;

    static {
        if (CatchingFishAsyncTask.CatchingFishViewModelScope) {
            CatchingFishReduxKtor = null;
            CatchingFishCoroutine = null;
        } else {
            CatchingFishReduxKtor = new CatchingFishHandler(null, false);
            CatchingFishCoroutine = new CatchingFishHandler(null, true);
        }
    }

    public CatchingFishHandler(Throwable th, boolean z) {
        this.CatchingFishParcelableFAB = z;
        this.CatchingFishSnackbar = th;
    }
}
