package kotlin.text;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class CatchingFishDaggerHiltRedux {
    public boolean CatchingFishAnimationMockk;
    public boolean CatchingFishCloudMessaging;
    public final CatchingFishDaggerWebSocket CatchingFishCoroutine;
    public final CatchingFishMVPAnimation CatchingFishDaggerWebsocket;
    public boolean CatchingFishEspressoTesting;
    public CatchingFishFluxFluxBundle CatchingFishFragmentHandler;
    public CatchingFishAdMobGson CatchingFishLayout;
    public boolean CatchingFishOkHttp;
    public final CatchingFishMoshiMVP CatchingFishParcelableFAB;
    public final CatchingFishWidgetContext CatchingFishReduxKtor;
    public final CatchingFishWidgetViewModel CatchingFishSnackbar;
    public boolean CatchingFishUnitTesting;
    public CatchingFishDatabindingMVP CatchingFishViewModelFAB;
    public CatchingFishReduxBundleMVP CatchingFishViewModelScope;
    public Object CatchingFishWorkManager;

    public CatchingFishDaggerHiltRedux(CatchingFishMoshiMVP catchingFishMoshiMVP, CatchingFishDaggerWebSocket catchingFishDaggerWebSocket) {
        CatchingFishMVPAnimation catchingFishMVPAnimation = new CatchingFishMVPAnimation(this);
        this.CatchingFishDaggerWebsocket = catchingFishMVPAnimation;
        this.CatchingFishParcelableFAB = catchingFishMoshiMVP;
        CatchingFishWidgetContext catchingFishWidgetContext = CatchingFishWidgetContext.CatchingFishUnitTesting;
        CatchingFishServiceHilt catchingFishServiceHilt = catchingFishMoshiMVP.CatchingFish;
        catchingFishWidgetContext.getClass();
        this.CatchingFishSnackbar = (CatchingFishWidgetViewModel) catchingFishServiceHilt.CatchingFishDaggerWebsocket;
        this.CatchingFishCoroutine = catchingFishDaggerWebSocket;
        catchingFishMoshiMVP.CatchingFishLayout.getClass();
        this.CatchingFishReduxKtor = CatchingFishWidgetContext.CatchingFishViewModelScope;
        catchingFishMVPAnimation.CatchingFishViewModelScope(0, TimeUnit.MILLISECONDS);
    }

    public final IOException CatchingFishCoroutine(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        synchronized (this.CatchingFishSnackbar) {
            try {
                CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2 = this.CatchingFishFragmentHandler;
                if (catchingFishFluxFluxBundle != catchingFishFluxFluxBundle2) {
                    return iOException;
                }
                boolean z4 = true;
                if (z) {
                    z3 = !this.CatchingFishCloudMessaging;
                    this.CatchingFishCloudMessaging = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    if (!this.CatchingFishEspressoTesting) {
                        z3 = true;
                    }
                    this.CatchingFishEspressoTesting = true;
                }
                if (this.CatchingFishCloudMessaging && this.CatchingFishEspressoTesting && z3) {
                    ((CatchingFishFragmentFlux) catchingFishFluxFluxBundle2.CatchingFishViewModelScope).CatchingFishViewModelFAB().CatchingFishOkHttp++;
                    this.CatchingFishFragmentHandler = null;
                } else {
                    z4 = false;
                }
                return z4 ? CatchingFishDaggerWebsocket(iOException, false) : iOException;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final IOException CatchingFishDaggerWebsocket(IOException iOException, boolean z) {
        CatchingFishAdMobGson catchingFishAdMobGson;
        Socket CatchingFishViewModelScope;
        boolean z2;
        synchronized (this.CatchingFishSnackbar) {
            if (z) {
                try {
                    if (this.CatchingFishFragmentHandler != null) {
                        throw new IllegalStateException("cannot release connection while it is in use");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            catchingFishAdMobGson = this.CatchingFishLayout;
            CatchingFishViewModelScope = (catchingFishAdMobGson != null && this.CatchingFishFragmentHandler == null && (z || this.CatchingFishAnimationMockk)) ? CatchingFishViewModelScope() : null;
            if (this.CatchingFishLayout != null) {
                catchingFishAdMobGson = null;
            }
            z2 = this.CatchingFishAnimationMockk && this.CatchingFishFragmentHandler == null;
        }
        CatchingFishEspressoDagger.CatchingFishCoroutine(CatchingFishViewModelScope);
        if (catchingFishAdMobGson != null) {
            this.CatchingFishReduxKtor.getClass();
        }
        if (z2) {
            boolean z3 = iOException != null;
            if (!this.CatchingFishUnitTesting && this.CatchingFishDaggerWebsocket.CatchingFishFragmentHandler()) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                iOException = interruptedIOException;
            }
            if (z3) {
                this.CatchingFishReduxKtor.getClass();
                return iOException;
            }
            this.CatchingFishReduxKtor.getClass();
        }
        return iOException;
    }

    public final void CatchingFishParcelableFAB() {
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle;
        CatchingFishAdMobGson catchingFishAdMobGson;
        synchronized (this.CatchingFishSnackbar) {
            try {
                this.CatchingFishOkHttp = true;
                catchingFishFluxFluxBundle = this.CatchingFishFragmentHandler;
                CatchingFishDatabindingMVP catchingFishDatabindingMVP = this.CatchingFishViewModelFAB;
                if (catchingFishDatabindingMVP == null || (catchingFishAdMobGson = catchingFishDatabindingMVP.CatchingFishViewModelScope) == null) {
                    catchingFishAdMobGson = this.CatchingFishLayout;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (catchingFishFluxFluxBundle != null) {
            ((CatchingFishFragmentFlux) catchingFishFluxFluxBundle.CatchingFishViewModelScope).cancel();
        } else if (catchingFishAdMobGson != null) {
            CatchingFishEspressoDagger.CatchingFishCoroutine(catchingFishAdMobGson.CatchingFishReduxKtor);
        }
    }

    public final boolean CatchingFishReduxKtor() {
        boolean z;
        synchronized (this.CatchingFishSnackbar) {
            z = this.CatchingFishOkHttp;
        }
        return z;
    }

    public final void CatchingFishSnackbar() {
        synchronized (this.CatchingFishSnackbar) {
            try {
                if (this.CatchingFishAnimationMockk) {
                    throw new IllegalStateException();
                }
                this.CatchingFishFragmentHandler = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Socket CatchingFishViewModelScope() {
        int size = this.CatchingFishLayout.CatchingFishStateLiveData.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            if (((Reference) this.CatchingFishLayout.CatchingFishStateLiveData.get(i)).get() == this) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException();
        }
        CatchingFishAdMobGson catchingFishAdMobGson = this.CatchingFishLayout;
        catchingFishAdMobGson.CatchingFishStateLiveData.remove(i);
        this.CatchingFishLayout = null;
        if (!catchingFishAdMobGson.CatchingFishStateLiveData.isEmpty()) {
            return null;
        }
        catchingFishAdMobGson.CatchingFishRoomDatabase = System.nanoTime();
        CatchingFishWidgetViewModel catchingFishWidgetViewModel = this.CatchingFishSnackbar;
        catchingFishWidgetViewModel.getClass();
        if (catchingFishAdMobGson.CatchingFishCloudMessaging || catchingFishWidgetViewModel.CatchingFishParcelableFAB == 0) {
            catchingFishWidgetViewModel.CatchingFishReduxKtor.remove(catchingFishAdMobGson);
            return catchingFishAdMobGson.CatchingFishDaggerWebsocket;
        }
        catchingFishWidgetViewModel.notifyAll();
        return null;
    }

    public final IOException CatchingFishWorkManager(IOException iOException) {
        synchronized (this.CatchingFishSnackbar) {
            this.CatchingFishAnimationMockk = true;
        }
        return CatchingFishDaggerWebsocket(iOException, false);
    }
}
