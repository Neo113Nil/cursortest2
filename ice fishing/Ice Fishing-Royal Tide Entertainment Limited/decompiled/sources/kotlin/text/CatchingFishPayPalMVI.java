package kotlin.text;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class CatchingFishPayPalMVI {
    public int CatchingFishCloudMessaging;
    public final int CatchingFishCoroutine;
    public final ArrayDeque CatchingFishDaggerWebsocket;
    public IOException CatchingFishEspressoTesting;
    public final CatchingFishHandlerMVVM CatchingFishFragmentHandler;
    public final CatchingFishHandlerMVVM CatchingFishLayout;
    public long CatchingFishParcelableFAB = 0;
    public final CatchingFishSharedFlowMoshi CatchingFishReduxKtor;
    public long CatchingFishSnackbar;
    public final CatchingFishServiceRoom CatchingFishViewModelFAB;
    public final CatchingFishMockkGlide CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishPayPalMVI(int i, CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi, boolean z, boolean z2, CatchingFishKtorStripeAPI catchingFishKtorStripeAPI) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.CatchingFishDaggerWebsocket = arrayDeque;
        this.CatchingFishLayout = new CatchingFishHandlerMVVM(this);
        this.CatchingFishFragmentHandler = new CatchingFishHandlerMVVM(this);
        if (catchingFishSharedFlowMoshi == null) {
            throw new NullPointerException("connection == null");
        }
        this.CatchingFishCoroutine = i;
        this.CatchingFishReduxKtor = catchingFishSharedFlowMoshi;
        this.CatchingFishSnackbar = catchingFishSharedFlowMoshi.CatchingFishCoroutineFlow.CatchingFishParcelableFAB();
        CatchingFishMockkGlide catchingFishMockkGlide = new CatchingFishMockkGlide(this, catchingFishSharedFlowMoshi.CatchingFishJetpackCompose.CatchingFishParcelableFAB());
        this.CatchingFishViewModelScope = catchingFishMockkGlide;
        CatchingFishServiceRoom catchingFishServiceRoom = new CatchingFishServiceRoom(this);
        this.CatchingFishViewModelFAB = catchingFishServiceRoom;
        catchingFishMockkGlide.CatchingFishViewModelFAB = z2;
        catchingFishServiceRoom.CatchingFishWorkManager = z;
        if (catchingFishKtorStripeAPI != null) {
            arrayDeque.add(catchingFishKtorStripeAPI);
        }
        if (CatchingFishViewModelScope() && catchingFishKtorStripeAPI != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!CatchingFishViewModelScope() && catchingFishKtorStripeAPI == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final void CatchingFishCoroutine(int i, IOException iOException) {
        if (CatchingFishReduxKtor(i, iOException)) {
            this.CatchingFishReduxKtor.CatchingFishSpannableWidget.CatchingFishOkHttp(this.CatchingFishCoroutine, i);
        }
    }

    public final void CatchingFishDaggerWebsocket(int i) {
        if (CatchingFishReduxKtor(i, null)) {
            this.CatchingFishReduxKtor.CatchingFishStateLiveData(this.CatchingFishCoroutine, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a A[Catch: all -> 0x000f, TryCatch #0 {all -> 0x000f, blocks: (B:3:0x0001, B:7:0x0009, B:9:0x001a, B:10:0x001e, B:11:0x0025, B:18:0x0011), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishLayout(CatchingFishKtorStripeAPI catchingFishKtorStripeAPI, boolean z) {
        boolean CatchingFishViewModelFAB;
        synchronized (this) {
            try {
                if (this.CatchingFishWorkManager && z) {
                    this.CatchingFishViewModelScope.getClass();
                    if (z) {
                        this.CatchingFishViewModelScope.CatchingFishViewModelFAB = true;
                    }
                    CatchingFishViewModelFAB = CatchingFishViewModelFAB();
                    notifyAll();
                }
                this.CatchingFishWorkManager = true;
                this.CatchingFishDaggerWebsocket.add(catchingFishKtorStripeAPI);
                if (z) {
                }
                CatchingFishViewModelFAB = CatchingFishViewModelFAB();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (CatchingFishViewModelFAB) {
            return;
        }
        this.CatchingFishReduxKtor.CatchingFishLayout(this.CatchingFishCoroutine);
    }

    public final void CatchingFishParcelableFAB() {
        boolean z;
        boolean CatchingFishViewModelFAB;
        synchronized (this) {
            try {
                CatchingFishMockkGlide catchingFishMockkGlide = this.CatchingFishViewModelScope;
                if (!catchingFishMockkGlide.CatchingFishViewModelFAB && catchingFishMockkGlide.CatchingFishViewModelScope) {
                    CatchingFishServiceRoom catchingFishServiceRoom = this.CatchingFishViewModelFAB;
                    if (!catchingFishServiceRoom.CatchingFishWorkManager) {
                        if (catchingFishServiceRoom.CatchingFishDaggerWebsocket) {
                        }
                    }
                    z = true;
                    CatchingFishViewModelFAB = CatchingFishViewModelFAB();
                }
                z = false;
                CatchingFishViewModelFAB = CatchingFishViewModelFAB();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            CatchingFishCoroutine(6, null);
        } else {
            if (CatchingFishViewModelFAB) {
                return;
            }
            this.CatchingFishReduxKtor.CatchingFishLayout(this.CatchingFishCoroutine);
        }
    }

    public final boolean CatchingFishReduxKtor(int i, IOException iOException) {
        synchronized (this) {
            try {
                if (this.CatchingFishCloudMessaging != 0) {
                    return false;
                }
                if (this.CatchingFishViewModelScope.CatchingFishViewModelFAB && this.CatchingFishViewModelFAB.CatchingFishWorkManager) {
                    return false;
                }
                this.CatchingFishCloudMessaging = i;
                this.CatchingFishEspressoTesting = iOException;
                notifyAll();
                this.CatchingFishReduxKtor.CatchingFishLayout(this.CatchingFishCoroutine);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void CatchingFishSnackbar() {
        CatchingFishServiceRoom catchingFishServiceRoom = this.CatchingFishViewModelFAB;
        if (catchingFishServiceRoom.CatchingFishDaggerWebsocket) {
            throw new IOException("stream closed");
        }
        if (catchingFishServiceRoom.CatchingFishWorkManager) {
            throw new IOException("stream finished");
        }
        if (this.CatchingFishCloudMessaging != 0) {
            IOException iOException = this.CatchingFishEspressoTesting;
            if (iOException == null) {
                throw new CatchingFishDaggerContext(this.CatchingFishCloudMessaging);
            }
        }
    }

    public final synchronized boolean CatchingFishViewModelFAB() {
        try {
            if (this.CatchingFishCloudMessaging != 0) {
                return false;
            }
            CatchingFishMockkGlide catchingFishMockkGlide = this.CatchingFishViewModelScope;
            if (!catchingFishMockkGlide.CatchingFishViewModelFAB) {
                if (catchingFishMockkGlide.CatchingFishViewModelScope) {
                }
                return true;
            }
            CatchingFishServiceRoom catchingFishServiceRoom = this.CatchingFishViewModelFAB;
            if (catchingFishServiceRoom.CatchingFishWorkManager || catchingFishServiceRoom.CatchingFishDaggerWebsocket) {
                if (this.CatchingFishWorkManager) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean CatchingFishViewModelScope() {
        return this.CatchingFishReduxKtor.CatchingFishReduxKtor == ((this.CatchingFishCoroutine & 1) == 1);
    }

    public final CatchingFishServiceRoom CatchingFishWorkManager() {
        synchronized (this) {
            try {
                if (!this.CatchingFishWorkManager && !CatchingFishViewModelScope()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.CatchingFishViewModelFAB;
    }
}
