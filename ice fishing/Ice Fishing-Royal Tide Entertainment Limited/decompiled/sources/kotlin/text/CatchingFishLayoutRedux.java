package kotlin.text;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class CatchingFishLayoutRedux implements Closeable {
    public final long CatchingFishAnimationMockk;
    public final CatchingFishLayoutRedux CatchingFishCloudMessaging;
    public final CatchingFishServicePicasso CatchingFishDaggerWebsocket;
    public final CatchingFishLayoutRedux CatchingFishEspressoTesting;
    public final CatchingFishGsonLifecycle CatchingFishFragmentHandler;
    public final CatchingFishKtorStripeAPI CatchingFishLayout;
    public final CatchingFishLayoutRedux CatchingFishOkHttp;
    public final CatchingFishReduxBundleMVP CatchingFishReduxKtor;
    public final CatchingFishFluxFluxBundle CatchingFishStateLiveData;
    public final long CatchingFishUnitTesting;
    public final CatchingFishRealmWidget CatchingFishViewModelFAB;
    public final String CatchingFishViewModelScope;
    public final int CatchingFishWorkManager;

    public CatchingFishLayoutRedux(CatchingFishGsonReduxWidget catchingFishGsonReduxWidget) {
        this.CatchingFishReduxKtor = catchingFishGsonReduxWidget.CatchingFishParcelableFAB;
        this.CatchingFishDaggerWebsocket = catchingFishGsonReduxWidget.CatchingFishSnackbar;
        this.CatchingFishWorkManager = catchingFishGsonReduxWidget.CatchingFishCoroutine;
        this.CatchingFishViewModelScope = catchingFishGsonReduxWidget.CatchingFishReduxKtor;
        this.CatchingFishViewModelFAB = catchingFishGsonReduxWidget.CatchingFishDaggerWebsocket;
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = catchingFishGsonReduxWidget.CatchingFishWorkManager;
        catchingFishViewPagerMockk.getClass();
        this.CatchingFishLayout = new CatchingFishKtorStripeAPI(catchingFishViewPagerMockk);
        this.CatchingFishFragmentHandler = catchingFishGsonReduxWidget.CatchingFishViewModelScope;
        this.CatchingFishCloudMessaging = catchingFishGsonReduxWidget.CatchingFishViewModelFAB;
        this.CatchingFishEspressoTesting = catchingFishGsonReduxWidget.CatchingFishLayout;
        this.CatchingFishOkHttp = catchingFishGsonReduxWidget.CatchingFishFragmentHandler;
        this.CatchingFishUnitTesting = catchingFishGsonReduxWidget.CatchingFishCloudMessaging;
        this.CatchingFishAnimationMockk = catchingFishGsonReduxWidget.CatchingFishEspressoTesting;
        this.CatchingFishStateLiveData = catchingFishGsonReduxWidget.CatchingFishOkHttp;
    }

    public final CatchingFishGsonReduxWidget CatchingFishCoroutine() {
        CatchingFishGsonReduxWidget catchingFishGsonReduxWidget = new CatchingFishGsonReduxWidget();
        catchingFishGsonReduxWidget.CatchingFishParcelableFAB = this.CatchingFishReduxKtor;
        catchingFishGsonReduxWidget.CatchingFishSnackbar = this.CatchingFishDaggerWebsocket;
        catchingFishGsonReduxWidget.CatchingFishCoroutine = this.CatchingFishWorkManager;
        catchingFishGsonReduxWidget.CatchingFishReduxKtor = this.CatchingFishViewModelScope;
        catchingFishGsonReduxWidget.CatchingFishDaggerWebsocket = this.CatchingFishViewModelFAB;
        catchingFishGsonReduxWidget.CatchingFishWorkManager = this.CatchingFishLayout.CatchingFishDaggerWebsocket();
        catchingFishGsonReduxWidget.CatchingFishViewModelScope = this.CatchingFishFragmentHandler;
        catchingFishGsonReduxWidget.CatchingFishViewModelFAB = this.CatchingFishCloudMessaging;
        catchingFishGsonReduxWidget.CatchingFishLayout = this.CatchingFishEspressoTesting;
        catchingFishGsonReduxWidget.CatchingFishFragmentHandler = this.CatchingFishOkHttp;
        catchingFishGsonReduxWidget.CatchingFishCloudMessaging = this.CatchingFishUnitTesting;
        catchingFishGsonReduxWidget.CatchingFishEspressoTesting = this.CatchingFishAnimationMockk;
        catchingFishGsonReduxWidget.CatchingFishOkHttp = this.CatchingFishStateLiveData;
        return catchingFishGsonReduxWidget;
    }

    public final String CatchingFishSnackbar(String str) {
        String CatchingFishCoroutine = this.CatchingFishLayout.CatchingFishCoroutine(str);
        if (CatchingFishCoroutine != null) {
            return CatchingFishCoroutine;
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CatchingFishGsonLifecycle catchingFishGsonLifecycle = this.CatchingFishFragmentHandler;
        if (catchingFishGsonLifecycle == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        catchingFishGsonLifecycle.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.CatchingFishDaggerWebsocket + ", code=" + this.CatchingFishWorkManager + ", message=" + this.CatchingFishViewModelScope + ", url=" + this.CatchingFishReduxKtor.CatchingFishParcelableFAB + '}';
    }
}
