package kotlin.text;

import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class CatchingFishServiceRoom implements CatchingFishViewOkHttp {
    public boolean CatchingFishDaggerWebsocket;
    public final CatchingFishWidgetGradle CatchingFishReduxKtor = new CatchingFishWidgetGradle();
    public final /* synthetic */ CatchingFishPayPalMVI CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishServiceRoom(CatchingFishPayPalMVI catchingFishPayPalMVI) {
        this.CatchingFishViewModelScope = catchingFishPayPalMVI;
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final void CatchingFishCloudMessaging(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        CatchingFishWidgetGradle catchingFishWidgetGradle2 = this.CatchingFishReduxKtor;
        catchingFishWidgetGradle2.CatchingFishCloudMessaging(catchingFishWidgetGradle, j);
        while (catchingFishWidgetGradle2.CatchingFishDaggerWebsocket >= 16384) {
            CatchingFishSnackbar(false);
        }
    }

    @Override // kotlin.text.CatchingFishViewOkHttp
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishViewModelScope.CatchingFishFragmentHandler;
    }

    public final void CatchingFishSnackbar(boolean z) {
        CatchingFishPayPalMVI catchingFishPayPalMVI;
        long min;
        CatchingFishPayPalMVI catchingFishPayPalMVI2;
        boolean z2;
        synchronized (this.CatchingFishViewModelScope) {
            this.CatchingFishViewModelScope.CatchingFishFragmentHandler.CatchingFishLayout();
            while (true) {
                try {
                    catchingFishPayPalMVI = this.CatchingFishViewModelScope;
                    if (catchingFishPayPalMVI.CatchingFishSnackbar > 0 || this.CatchingFishWorkManager || this.CatchingFishDaggerWebsocket || catchingFishPayPalMVI.CatchingFishCloudMessaging != 0) {
                        break;
                    }
                    try {
                        catchingFishPayPalMVI.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } finally {
                    this.CatchingFishViewModelScope.CatchingFishFragmentHandler.CatchingFishEspressoTesting();
                }
            }
            catchingFishPayPalMVI.CatchingFishFragmentHandler.CatchingFishEspressoTesting();
            this.CatchingFishViewModelScope.CatchingFishSnackbar();
            min = Math.min(this.CatchingFishViewModelScope.CatchingFishSnackbar, this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket);
            catchingFishPayPalMVI2 = this.CatchingFishViewModelScope;
            catchingFishPayPalMVI2.CatchingFishSnackbar -= min;
        }
        catchingFishPayPalMVI2.CatchingFishFragmentHandler.CatchingFishLayout();
        if (z) {
            try {
                if (min == this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket) {
                    z2 = true;
                    boolean z3 = z2;
                    CatchingFishPayPalMVI catchingFishPayPalMVI3 = this.CatchingFishViewModelScope;
                    catchingFishPayPalMVI3.CatchingFishReduxKtor.CatchingFishAnimationMockk(catchingFishPayPalMVI3.CatchingFishCoroutine, z3, this.CatchingFishReduxKtor, min);
                    this.CatchingFishViewModelScope.CatchingFishFragmentHandler.CatchingFishEspressoTesting();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z2 = false;
        boolean z32 = z2;
        CatchingFishPayPalMVI catchingFishPayPalMVI32 = this.CatchingFishViewModelScope;
        catchingFishPayPalMVI32.CatchingFishReduxKtor.CatchingFishAnimationMockk(catchingFishPayPalMVI32.CatchingFishCoroutine, z32, this.CatchingFishReduxKtor, min);
        this.CatchingFishViewModelScope.CatchingFishFragmentHandler.CatchingFishEspressoTesting();
    }

    @Override // kotlin.text.CatchingFishViewOkHttp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.CatchingFishViewModelScope) {
            try {
                if (this.CatchingFishDaggerWebsocket) {
                    return;
                }
                CatchingFishPayPalMVI catchingFishPayPalMVI = this.CatchingFishViewModelScope;
                if (!catchingFishPayPalMVI.CatchingFishViewModelFAB.CatchingFishWorkManager) {
                    if (this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket > 0) {
                        while (this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket > 0) {
                            CatchingFishSnackbar(true);
                        }
                    } else {
                        catchingFishPayPalMVI.CatchingFishReduxKtor.CatchingFishAnimationMockk(catchingFishPayPalMVI.CatchingFishCoroutine, true, null, 0L);
                    }
                }
                synchronized (this.CatchingFishViewModelScope) {
                    this.CatchingFishDaggerWebsocket = true;
                }
                this.CatchingFishViewModelScope.CatchingFishReduxKtor.flush();
                this.CatchingFishViewModelScope.CatchingFishParcelableFAB();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlin.text.CatchingFishViewOkHttp, java.io.Flushable
    public final void flush() {
        synchronized (this.CatchingFishViewModelScope) {
            this.CatchingFishViewModelScope.CatchingFishSnackbar();
        }
        while (this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket > 0) {
            CatchingFishSnackbar(false);
            this.CatchingFishViewModelScope.CatchingFishReduxKtor.flush();
        }
    }
}
