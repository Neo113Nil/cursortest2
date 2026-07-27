package kotlin.text;

import android.content.Context;

/* loaded from: classes.dex */
public final class CatchingFishHiltSnackbarMVP {
    public static final CatchingFishHiltSnackbarMVP CatchingFishSnackbar;
    public CatchingFishFluxDataStore CatchingFishParcelableFAB;

    static {
        CatchingFishHiltSnackbarMVP catchingFishHiltSnackbarMVP = new CatchingFishHiltSnackbarMVP();
        catchingFishHiltSnackbarMVP.CatchingFishParcelableFAB = null;
        CatchingFishSnackbar = catchingFishHiltSnackbarMVP;
    }

    public static CatchingFishFluxDataStore CatchingFishParcelableFAB(Context context) {
        CatchingFishFluxDataStore catchingFishFluxDataStore;
        CatchingFishHiltSnackbarMVP catchingFishHiltSnackbarMVP = CatchingFishSnackbar;
        synchronized (catchingFishHiltSnackbarMVP) {
            try {
                if (catchingFishHiltSnackbarMVP.CatchingFishParcelableFAB == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    catchingFishHiltSnackbarMVP.CatchingFishParcelableFAB = new CatchingFishFluxDataStore(context, 2);
                }
                catchingFishFluxDataStore = catchingFishHiltSnackbarMVP.CatchingFishParcelableFAB;
            } catch (Throwable th) {
                throw th;
            }
        }
        return catchingFishFluxDataStore;
    }
}
