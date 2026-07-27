package kotlin.text;

import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class CatchingFishHiltPicassoView implements CatchingFishGradleStripeAPI {
    public final long CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishFluxFluxBundle CatchingFishLayout;
    public final CatchingFishGradleStripeAPI CatchingFishReduxKtor;
    public boolean CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public long CatchingFishWorkManager;

    public CatchingFishHiltPicassoView(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, CatchingFishGradleStripeAPI catchingFishGradleStripeAPI, long j) {
        this.CatchingFishLayout = catchingFishFluxFluxBundle;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishGradleStripeAPI, "delegate");
        this.CatchingFishReduxKtor = catchingFishGradleStripeAPI;
        this.CatchingFishDaggerWebsocket = j;
        if (j == 0) {
            CatchingFishCoroutine(null);
        }
    }

    public final IOException CatchingFishCoroutine(IOException iOException) {
        if (this.CatchingFishViewModelScope) {
            return iOException;
        }
        this.CatchingFishViewModelScope = true;
        return this.CatchingFishLayout.CatchingFishReduxKtor(true, false, iOException);
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        return this.CatchingFishReduxKtor.CatchingFishParcelableFAB();
    }

    public final void CatchingFishSnackbar() {
        this.CatchingFishReduxKtor.close();
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final long CatchingFishSpannableWidget(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        if (this.CatchingFishViewModelFAB) {
            throw new IllegalStateException("closed");
        }
        try {
            long CatchingFishSpannableWidget = this.CatchingFishReduxKtor.CatchingFishSpannableWidget(catchingFishWidgetGradle, 8192L);
            if (CatchingFishSpannableWidget == -1) {
                CatchingFishCoroutine(null);
                return -1L;
            }
            long j2 = this.CatchingFishWorkManager + CatchingFishSpannableWidget;
            long j3 = this.CatchingFishDaggerWebsocket;
            if (j3 == -1 || j2 <= j3) {
                this.CatchingFishWorkManager = j2;
                if (j2 == j3) {
                    CatchingFishCoroutine(null);
                }
                return CatchingFishSpannableWidget;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw CatchingFishCoroutine(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.CatchingFishViewModelFAB) {
            return;
        }
        this.CatchingFishViewModelFAB = true;
        try {
            CatchingFishSnackbar();
            CatchingFishCoroutine(null);
        } catch (IOException e) {
            throw CatchingFishCoroutine(e);
        }
    }

    public final String toString() {
        return CatchingFishHiltPicassoView.class.getSimpleName() + '(' + this.CatchingFishReduxKtor + ')';
    }
}
