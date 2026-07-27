package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class CatchingFishPayPalSnackbar implements CatchingFishGradleStripeAPI {
    public final Object CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final Object CatchingFishWorkManager;

    public /* synthetic */ CatchingFishPayPalSnackbar(int i, Object obj, Object obj2) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = obj;
        this.CatchingFishWorkManager = obj2;
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final CatchingFishMoshiFirebase CatchingFishParcelableFAB() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (CatchingFishGoogleMapsRedux) this.CatchingFishDaggerWebsocket;
            default:
                return (CatchingFishMoshiFirebase) this.CatchingFishWorkManager;
        }
    }

    @Override // kotlin.text.CatchingFishGradleStripeAPI
    public final long CatchingFishSpannableWidget(CatchingFishWidgetGradle catchingFishWidgetGradle, long j) {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishGoogleMapsRedux catchingFishGoogleMapsRedux = (CatchingFishGoogleMapsRedux) this.CatchingFishDaggerWebsocket;
                CatchingFishPayPalSnackbar catchingFishPayPalSnackbar = (CatchingFishPayPalSnackbar) this.CatchingFishWorkManager;
                catchingFishGoogleMapsRedux.CatchingFishLayout();
                try {
                    long CatchingFishSpannableWidget = catchingFishPayPalSnackbar.CatchingFishSpannableWidget(catchingFishWidgetGradle, 8192L);
                    if (catchingFishGoogleMapsRedux.CatchingFishFragmentHandler()) {
                        throw catchingFishGoogleMapsRedux.CatchingFishEspressoTesting(null);
                    }
                    return CatchingFishSpannableWidget;
                } catch (IOException e) {
                    if (catchingFishGoogleMapsRedux.CatchingFishFragmentHandler()) {
                        throw catchingFishGoogleMapsRedux.CatchingFishEspressoTesting(e);
                    }
                    throw e;
                } finally {
                    catchingFishGoogleMapsRedux.CatchingFishFragmentHandler();
                }
            default:
                try {
                    ((CatchingFishMoshiFirebase) this.CatchingFishWorkManager).CatchingFishWorkManager();
                    CatchingFishMoshiDaggerMVP CatchingFishNavigation = catchingFishWidgetGradle.CatchingFishNavigation(1);
                    int read = ((InputStream) this.CatchingFishDaggerWebsocket).read(CatchingFishNavigation.CatchingFishParcelableFAB, CatchingFishNavigation.CatchingFishCoroutine, (int) Math.min(8192L, 8192 - CatchingFishNavigation.CatchingFishCoroutine));
                    if (read == -1) {
                        if (CatchingFishNavigation.CatchingFishSnackbar == CatchingFishNavigation.CatchingFishCoroutine) {
                            catchingFishWidgetGradle.CatchingFishReduxKtor = CatchingFishNavigation.CatchingFishParcelableFAB();
                            CatchingFishAnimationFlux.CatchingFishParcelableFAB(CatchingFishNavigation);
                        }
                        return -1L;
                    }
                    CatchingFishNavigation.CatchingFishCoroutine += read;
                    long j2 = read;
                    catchingFishWidgetGradle.CatchingFishDaggerWebsocket += j2;
                    return j2;
                } catch (AssertionError e2) {
                    if (CatchingFishViewMVIMVVM.CatchingFishOkHttp(e2)) {
                        throw new IOException(e2);
                    }
                    throw e2;
                }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishGoogleMapsRedux catchingFishGoogleMapsRedux = (CatchingFishGoogleMapsRedux) this.CatchingFishDaggerWebsocket;
                CatchingFishPayPalSnackbar catchingFishPayPalSnackbar = (CatchingFishPayPalSnackbar) this.CatchingFishWorkManager;
                catchingFishGoogleMapsRedux.CatchingFishLayout();
                try {
                    catchingFishPayPalSnackbar.close();
                    if (catchingFishGoogleMapsRedux.CatchingFishFragmentHandler()) {
                        throw catchingFishGoogleMapsRedux.CatchingFishEspressoTesting(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!catchingFishGoogleMapsRedux.CatchingFishFragmentHandler()) {
                        throw e;
                    }
                    throw catchingFishGoogleMapsRedux.CatchingFishEspressoTesting(e);
                } finally {
                    catchingFishGoogleMapsRedux.CatchingFishFragmentHandler();
                }
            default:
                ((InputStream) this.CatchingFishDaggerWebsocket).close();
                return;
        }
    }

    public final String toString() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return "AsyncTimeout.source(" + ((CatchingFishPayPalSnackbar) this.CatchingFishWorkManager) + ')';
            default:
                return "source(" + ((InputStream) this.CatchingFishDaggerWebsocket) + ')';
        }
    }
}
