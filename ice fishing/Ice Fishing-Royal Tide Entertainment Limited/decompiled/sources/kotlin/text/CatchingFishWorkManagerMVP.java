package kotlin.text;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CatchingFishWorkManagerMVP {
    public boolean CatchingFishCoroutine;
    public Object CatchingFishDaggerWebsocket;
    public final Object CatchingFishParcelableFAB = new Object();
    public volatile boolean CatchingFishReduxKtor;
    public final CatchingFishGlideFAB CatchingFishSnackbar;
    public Exception CatchingFishWorkManager;

    public CatchingFishWorkManagerMVP() {
        CatchingFishGlideFAB catchingFishGlideFAB = new CatchingFishGlideFAB();
        catchingFishGlideFAB.CatchingFishSnackbar = new Object();
        this.CatchingFishSnackbar = catchingFishGlideFAB;
    }

    public final void CatchingFishCloudMessaging(Exception exc) {
        CatchingFishToastHiltBundle.CatchingFishStateLiveData(exc, "Exception must not be null");
        synchronized (this.CatchingFishParcelableFAB) {
            CatchingFishOkHttp();
            this.CatchingFishCoroutine = true;
            this.CatchingFishWorkManager = exc;
        }
        this.CatchingFishSnackbar.CatchingFishCoroutine(this);
    }

    public final CatchingFishWorkManagerMVP CatchingFishCoroutine(Executor executor, CatchingFishJUnitBiometric catchingFishJUnitBiometric) {
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = new CatchingFishWorkManagerMVP();
        this.CatchingFishSnackbar.CatchingFishSnackbar(new CatchingFishRoomRealm(executor, catchingFishJUnitBiometric, catchingFishWorkManagerMVP, 0));
        CatchingFishUnitTesting();
        return catchingFishWorkManagerMVP;
    }

    public final Exception CatchingFishDaggerWebsocket() {
        Exception exc;
        synchronized (this.CatchingFishParcelableFAB) {
            exc = this.CatchingFishWorkManager;
        }
        return exc;
    }

    public final void CatchingFishEspressoTesting() {
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                if (this.CatchingFishCoroutine) {
                    return;
                }
                this.CatchingFishCoroutine = true;
                this.CatchingFishReduxKtor = true;
                this.CatchingFishSnackbar.CatchingFishCoroutine(this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishFragmentHandler(Object obj) {
        synchronized (this.CatchingFishParcelableFAB) {
            CatchingFishOkHttp();
            this.CatchingFishCoroutine = true;
            this.CatchingFishDaggerWebsocket = obj;
        }
        this.CatchingFishSnackbar.CatchingFishCoroutine(this);
    }

    public final CatchingFishWorkManagerMVP CatchingFishLayout(Executor executor, CatchingFishReduxIntent catchingFishReduxIntent) {
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = new CatchingFishWorkManagerMVP();
        this.CatchingFishSnackbar.CatchingFishSnackbar(new CatchingFishEspressoContext(executor, catchingFishReduxIntent, catchingFishWorkManagerMVP));
        CatchingFishUnitTesting();
        return catchingFishWorkManagerMVP;
    }

    public final void CatchingFishOkHttp() {
        if (this.CatchingFishCoroutine) {
            int i = CatchingFishRealmStripeAPI.CatchingFishReduxKtor;
            if (!CatchingFishViewModelScope()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception CatchingFishDaggerWebsocket = CatchingFishDaggerWebsocket();
        }
    }

    public final void CatchingFishParcelableFAB(Executor executor, CatchingFishFragmentFAB catchingFishFragmentFAB) {
        this.CatchingFishSnackbar.CatchingFishSnackbar(new CatchingFishEspressoContext(executor, catchingFishFragmentFAB));
        CatchingFishUnitTesting();
    }

    public final CatchingFishWorkManagerMVP CatchingFishReduxKtor(Executor executor, CatchingFishJUnitBiometric catchingFishJUnitBiometric) {
        CatchingFishWorkManagerMVP catchingFishWorkManagerMVP = new CatchingFishWorkManagerMVP();
        this.CatchingFishSnackbar.CatchingFishSnackbar(new CatchingFishRoomRealm(executor, catchingFishJUnitBiometric, catchingFishWorkManagerMVP, 1));
        CatchingFishUnitTesting();
        return catchingFishWorkManagerMVP;
    }

    public final void CatchingFishSnackbar(Executor executor, CatchingFishMoshiJUnitRoom catchingFishMoshiJUnitRoom) {
        this.CatchingFishSnackbar.CatchingFishSnackbar(new CatchingFishEspressoContext(executor, catchingFishMoshiJUnitRoom));
        CatchingFishUnitTesting();
    }

    public final void CatchingFishUnitTesting() {
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                if (this.CatchingFishCoroutine) {
                    this.CatchingFishSnackbar.CatchingFishCoroutine(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean CatchingFishViewModelFAB() {
        boolean z;
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                z = false;
                if (this.CatchingFishCoroutine && !this.CatchingFishReduxKtor && this.CatchingFishWorkManager == null) {
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public final boolean CatchingFishViewModelScope() {
        boolean z;
        synchronized (this.CatchingFishParcelableFAB) {
            z = this.CatchingFishCoroutine;
        }
        return z;
    }

    public final Object CatchingFishWorkManager() {
        Object obj;
        synchronized (this.CatchingFishParcelableFAB) {
            try {
                if (!this.CatchingFishCoroutine) {
                    throw new IllegalStateException("Task is not yet complete");
                }
                if (this.CatchingFishReduxKtor) {
                    throw new CancellationException("Task is already canceled.");
                }
                Exception exc = this.CatchingFishWorkManager;
                if (exc != null) {
                    throw new CatchingFishDaggerGsonFlux(exc);
                }
                obj = this.CatchingFishDaggerWebsocket;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
