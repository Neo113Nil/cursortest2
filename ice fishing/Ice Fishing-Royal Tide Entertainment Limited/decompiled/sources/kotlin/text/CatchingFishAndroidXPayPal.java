package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishAndroidXPayPal {
    public final CatchingFishWorkManagerMVP CatchingFishParcelableFAB = new CatchingFishWorkManagerMVP();

    public final void CatchingFishCoroutine(Object obj) {
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = this.CatchingFishParcelableFAB;
        synchronized (catchingFishWorkManagerMVP.CatchingFishParcelableFAB) {
            try {
                if (catchingFishWorkManagerMVP.CatchingFishCoroutine) {
                    return;
                }
                catchingFishWorkManagerMVP.CatchingFishCoroutine = true;
                catchingFishWorkManagerMVP.CatchingFishDaggerWebsocket = obj;
                catchingFishWorkManagerMVP.CatchingFishSnackbar.CatchingFishCoroutine(catchingFishWorkManagerMVP);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishParcelableFAB(Object obj) {
        this.CatchingFishParcelableFAB.CatchingFishFragmentHandler(obj);
    }

    public final void CatchingFishSnackbar(Exception exc) {
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = this.CatchingFishParcelableFAB;
        catchingFishWorkManagerMVP.getClass();
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(exc, "Exception must not be null");
        synchronized (catchingFishWorkManagerMVP.CatchingFishParcelableFAB) {
            try {
                if (catchingFishWorkManagerMVP.CatchingFishCoroutine) {
                    return;
                }
                catchingFishWorkManagerMVP.CatchingFishCoroutine = true;
                catchingFishWorkManagerMVP.CatchingFishWorkManager = exc;
                catchingFishWorkManagerMVP.CatchingFishSnackbar.CatchingFishCoroutine(catchingFishWorkManagerMVP);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
