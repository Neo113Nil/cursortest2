package kotlin.text;

/* loaded from: classes.dex */
public abstract class CatchingFishViewMoshi implements Runnable, Comparable, CatchingFishStripeAPIBundle {
    public int CatchingFishDaggerWebsocket;
    public long CatchingFishReduxKtor;
    private volatile Object _heap;

    @Override // kotlin.text.CatchingFishStripeAPIBundle
    public final void CatchingFishParcelableFAB() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishBiometricBundle.CatchingFishReduxKtor;
                if (obj == catchingFishFluxWorkManager) {
                    return;
                }
                CatchingFishFirebaseContext catchingFishFirebaseContext = obj instanceof CatchingFishFirebaseContext ? (CatchingFishFirebaseContext) obj : null;
                if (catchingFishFirebaseContext != null) {
                    synchronized (catchingFishFirebaseContext) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof CatchingFishManifestFABMVVM ? (CatchingFishManifestFABMVVM) obj2 : null) != null) {
                            catchingFishFirebaseContext.CatchingFishSnackbar(this.CatchingFishDaggerWebsocket);
                        }
                    }
                }
                this._heap = catchingFishFluxWorkManager;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishReduxKtor(CatchingFishFirebaseContext catchingFishFirebaseContext) {
        if (this._heap == CatchingFishBiometricBundle.CatchingFishReduxKtor) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = catchingFishFirebaseContext;
    }

    public final int CatchingFishSnackbar(long j, CatchingFishFirebaseContext catchingFishFirebaseContext, CatchingFishPayPalHilt catchingFishPayPalHilt) {
        synchronized (this) {
            if (this._heap == CatchingFishBiometricBundle.CatchingFishReduxKtor) {
                return 2;
            }
            synchronized (catchingFishFirebaseContext) {
                try {
                    CatchingFishViewMoshi[] catchingFishViewMoshiArr = catchingFishFirebaseContext.CatchingFishParcelableFAB;
                    CatchingFishViewMoshi catchingFishViewMoshi = catchingFishViewMoshiArr != null ? catchingFishViewMoshiArr[0] : null;
                    if (CatchingFishPayPalHilt.CatchingFishEspressoTesting.get(catchingFishPayPalHilt) != 0) {
                        return 1;
                    }
                    if (catchingFishViewMoshi == null) {
                        catchingFishFirebaseContext.CatchingFishCoroutine = j;
                    } else {
                        long j2 = catchingFishViewMoshi.CatchingFishReduxKtor;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - catchingFishFirebaseContext.CatchingFishCoroutine > 0) {
                            catchingFishFirebaseContext.CatchingFishCoroutine = j;
                        }
                    }
                    long j3 = this.CatchingFishReduxKtor;
                    long j4 = catchingFishFirebaseContext.CatchingFishCoroutine;
                    if (j3 - j4 < 0) {
                        this.CatchingFishReduxKtor = j4;
                    }
                    catchingFishFirebaseContext.CatchingFishParcelableFAB(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.CatchingFishReduxKtor - ((CatchingFishViewMoshi) obj).CatchingFishReduxKtor;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.CatchingFishReduxKtor + ']';
    }
}
