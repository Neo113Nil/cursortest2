package kotlin.text;

import com.adjust.sdk.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* loaded from: classes.dex */
public final class CatchingFishFragmentMockk implements CatchingFishFragmentFlux {
    public final CatchingFishLayoutFragment CatchingFishCoroutine;
    public final CatchingFishMoshiMVP CatchingFishParcelableFAB;
    public final CatchingFishAnimationMVI CatchingFishReduxKtor;
    public final CatchingFishAdMobGson CatchingFishSnackbar;
    public int CatchingFishDaggerWebsocket = 0;
    public long CatchingFishWorkManager = 262144;

    public CatchingFishFragmentMockk(CatchingFishMoshiMVP catchingFishMoshiMVP, CatchingFishAdMobGson catchingFishAdMobGson, CatchingFishAdMobMVVM catchingFishAdMobMVVM, CatchingFishLayoutFlux catchingFishLayoutFlux) {
        this.CatchingFishParcelableFAB = catchingFishMoshiMVP;
        this.CatchingFishSnackbar = catchingFishAdMobGson;
        this.CatchingFishCoroutine = catchingFishAdMobMVVM;
        this.CatchingFishReduxKtor = catchingFishLayoutFlux;
    }

    public final void CatchingFishCloudMessaging(CatchingFishKtorStripeAPI catchingFishKtorStripeAPI, String str) {
        if (this.CatchingFishDaggerWebsocket != 0) {
            throw new IllegalStateException("state: " + this.CatchingFishDaggerWebsocket);
        }
        CatchingFishAnimationMVI catchingFishAnimationMVI = this.CatchingFishReduxKtor;
        catchingFishAnimationMVI.CatchingFishDaggerHiltFAB(str).CatchingFishDaggerHiltFAB("\r\n");
        int CatchingFishWorkManager = catchingFishKtorStripeAPI.CatchingFishWorkManager();
        for (int i = 0; i < CatchingFishWorkManager; i++) {
            catchingFishAnimationMVI.CatchingFishDaggerHiltFAB(catchingFishKtorStripeAPI.CatchingFishReduxKtor(i)).CatchingFishDaggerHiltFAB(": ").CatchingFishDaggerHiltFAB(catchingFishKtorStripeAPI.CatchingFishViewModelScope(i)).CatchingFishDaggerHiltFAB("\r\n");
        }
        catchingFishAnimationMVI.CatchingFishDaggerHiltFAB("\r\n");
        this.CatchingFishDaggerWebsocket = 1;
    }

    @Override // kotlin.text.CatchingFishFragmentFlux
    public final long CatchingFishCoroutine(CatchingFishLayoutRedux catchingFishLayoutRedux) {
        if (!CatchingFishWidgetEspresso.CatchingFishSnackbar(catchingFishLayoutRedux)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(catchingFishLayoutRedux.CatchingFishSnackbar("Transfer-Encoding"))) {
            return -1L;
        }
        return CatchingFishWidgetEspresso.CatchingFishParcelableFAB(catchingFishLayoutRedux);
    }

    @Override // kotlin.text.CatchingFishFragmentFlux
    public final CatchingFishGradleStripeAPI CatchingFishDaggerWebsocket(CatchingFishLayoutRedux catchingFishLayoutRedux) {
        if (!CatchingFishWidgetEspresso.CatchingFishSnackbar(catchingFishLayoutRedux)) {
            return CatchingFishLayout(0L);
        }
        if ("chunked".equalsIgnoreCase(catchingFishLayoutRedux.CatchingFishSnackbar("Transfer-Encoding"))) {
            CatchingFishBundleView catchingFishBundleView = catchingFishLayoutRedux.CatchingFishReduxKtor.CatchingFishParcelableFAB;
            if (this.CatchingFishDaggerWebsocket == 4) {
                this.CatchingFishDaggerWebsocket = 5;
                return new CatchingFishReduxAppCompat(this, catchingFishBundleView);
            }
            throw new IllegalStateException("state: " + this.CatchingFishDaggerWebsocket);
        }
        long CatchingFishParcelableFAB = CatchingFishWidgetEspresso.CatchingFishParcelableFAB(catchingFishLayoutRedux);
        if (CatchingFishParcelableFAB != -1) {
            return CatchingFishLayout(CatchingFishParcelableFAB);
        }
        if (this.CatchingFishDaggerWebsocket == 4) {
            this.CatchingFishDaggerWebsocket = 5;
            this.CatchingFishSnackbar.CatchingFishViewModelFAB();
            return new CatchingFishMVPMVVM(this);
        }
        throw new IllegalStateException("state: " + this.CatchingFishDaggerWebsocket);
    }

    public final CatchingFishKtorStripeAPI CatchingFishFragmentHandler() {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = new CatchingFishViewPagerMockk(12);
        while (true) {
            String CatchingFish = this.CatchingFishCoroutine.CatchingFish(this.CatchingFishWorkManager);
            this.CatchingFishWorkManager -= CatchingFish.length();
            if (CatchingFish.length() == 0) {
                return new CatchingFishKtorStripeAPI(catchingFishViewPagerMockk);
            }
            CatchingFishWidgetContext.CatchingFishUnitTesting.getClass();
            int indexOf = CatchingFish.indexOf(":", 1);
            if (indexOf != -1) {
                catchingFishViewPagerMockk.CatchingFishViewModelScope(CatchingFish.substring(0, indexOf), CatchingFish.substring(indexOf + 1));
            } else if (CatchingFish.startsWith(":")) {
                catchingFishViewPagerMockk.CatchingFishViewModelScope("", CatchingFish.substring(1));
            } else {
                catchingFishViewPagerMockk.CatchingFishViewModelScope("", CatchingFish);
            }
        }
    }

    public final CatchingFishJUnitHandler CatchingFishLayout(long j) {
        if (this.CatchingFishDaggerWebsocket == 4) {
            this.CatchingFishDaggerWebsocket = 5;
            return new CatchingFishJUnitHandler(this, j);
        }
        throw new IllegalStateException("state: " + this.CatchingFishDaggerWebsocket);
    }

    @Override // kotlin.text.CatchingFishFragmentFlux
    public final void CatchingFishParcelableFAB() {
        this.CatchingFishReduxKtor.flush();
    }

    @Override // kotlin.text.CatchingFishFragmentFlux
    public final void CatchingFishReduxKtor(CatchingFishReduxBundleMVP catchingFishReduxBundleMVP) {
        Proxy.Type type = this.CatchingFishSnackbar.CatchingFishCoroutine.CatchingFishSnackbar.type();
        StringBuilder sb = new StringBuilder();
        sb.append(catchingFishReduxBundleMVP.CatchingFishSnackbar);
        sb.append(' ');
        CatchingFishBundleView catchingFishBundleView = catchingFishReduxBundleMVP.CatchingFishParcelableFAB;
        if (catchingFishBundleView.CatchingFishParcelableFAB.equals(Constants.SCHEME) || type != Proxy.Type.HTTP) {
            String str = catchingFishBundleView.CatchingFishViewModelFAB;
            int indexOf = str.indexOf(47, catchingFishBundleView.CatchingFishParcelableFAB.length() + 3);
            String substring = str.substring(indexOf, CatchingFishEspressoDagger.CatchingFishWorkManager(indexOf, str.length(), str, "?#"));
            String CatchingFishDaggerWebsocket = catchingFishBundleView.CatchingFishDaggerWebsocket();
            if (CatchingFishDaggerWebsocket != null) {
                substring = substring + '?' + CatchingFishDaggerWebsocket;
            }
            sb.append(substring);
        } else {
            sb.append(catchingFishBundleView);
        }
        sb.append(" HTTP/1.1");
        CatchingFishCloudMessaging(catchingFishReduxBundleMVP.CatchingFishCoroutine, sb.toString());
    }

    @Override // kotlin.text.CatchingFishFragmentFlux
    public final void CatchingFishSnackbar() {
        this.CatchingFishReduxKtor.flush();
    }

    @Override // kotlin.text.CatchingFishFragmentFlux
    public final CatchingFishAdMobGson CatchingFishViewModelFAB() {
        return this.CatchingFishSnackbar;
    }

    @Override // kotlin.text.CatchingFishFragmentFlux
    public final CatchingFishGsonReduxWidget CatchingFishViewModelScope(boolean z) {
        int i = this.CatchingFishDaggerWebsocket;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.CatchingFishDaggerWebsocket);
        }
        try {
            String CatchingFish = this.CatchingFishCoroutine.CatchingFish(this.CatchingFishWorkManager);
            this.CatchingFishWorkManager -= CatchingFish.length();
            CatchingFishGsonWebSocket CatchingFishViewModelScope = CatchingFishGsonWebSocket.CatchingFishViewModelScope(CatchingFish);
            int i2 = CatchingFishViewModelScope.CatchingFishSnackbar;
            CatchingFishGsonReduxWidget catchingFishGsonReduxWidget = new CatchingFishGsonReduxWidget();
            catchingFishGsonReduxWidget.CatchingFishSnackbar = (CatchingFishServicePicasso) CatchingFishViewModelScope.CatchingFishCoroutine;
            catchingFishGsonReduxWidget.CatchingFishCoroutine = i2;
            catchingFishGsonReduxWidget.CatchingFishReduxKtor = (String) CatchingFishViewModelScope.CatchingFishReduxKtor;
            catchingFishGsonReduxWidget.CatchingFishWorkManager = CatchingFishFragmentHandler().CatchingFishDaggerWebsocket();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.CatchingFishDaggerWebsocket = 3;
                return catchingFishGsonReduxWidget;
            }
            this.CatchingFishDaggerWebsocket = 4;
            return catchingFishGsonReduxWidget;
        } catch (EOFException e) {
            CatchingFishAdMobGson catchingFishAdMobGson = this.CatchingFishSnackbar;
            throw new IOException("unexpected end of stream on " + (catchingFishAdMobGson != null ? catchingFishAdMobGson.CatchingFishCoroutine.CatchingFishParcelableFAB.CatchingFishParcelableFAB.CatchingFishCloudMessaging() : "unknown"), e);
        }
    }

    @Override // kotlin.text.CatchingFishFragmentFlux
    public final CatchingFishViewOkHttp CatchingFishWorkManager(CatchingFishReduxBundleMVP catchingFishReduxBundleMVP, long j) {
        catchingFishReduxBundleMVP.getClass();
        if ("chunked".equalsIgnoreCase(catchingFishReduxBundleMVP.CatchingFishCoroutine.CatchingFishCoroutine("Transfer-Encoding"))) {
            if (this.CatchingFishDaggerWebsocket == 1) {
                this.CatchingFishDaggerWebsocket = 2;
                return new CatchingFishRetrofitFlux(this);
            }
            throw new IllegalStateException("state: " + this.CatchingFishDaggerWebsocket);
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.CatchingFishDaggerWebsocket == 1) {
            this.CatchingFishDaggerWebsocket = 2;
            return new CatchingFishFluxCoroutine(this);
        }
        throw new IllegalStateException("state: " + this.CatchingFishDaggerWebsocket);
    }

    @Override // kotlin.text.CatchingFishFragmentFlux
    public final void cancel() {
        CatchingFishAdMobGson catchingFishAdMobGson = this.CatchingFishSnackbar;
        if (catchingFishAdMobGson != null) {
            CatchingFishEspressoDagger.CatchingFishCoroutine(catchingFishAdMobGson.CatchingFishReduxKtor);
        }
    }
}
