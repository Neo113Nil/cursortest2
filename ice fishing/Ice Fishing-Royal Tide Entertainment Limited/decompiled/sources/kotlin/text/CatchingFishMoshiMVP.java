package kotlin.text;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class CatchingFishMoshiMVP implements Cloneable {
    public final CatchingFishServiceHilt CatchingFish;
    public final CatchingFishGlideOkHttp CatchingFishAnimationMockk;
    public final int CatchingFishCardViewRealm;
    public final CatchingFishGradleMVVM CatchingFishCloudMessaging;
    public final boolean CatchingFishCoroutineFlow;
    public final boolean CatchingFishDaggerHiltFAB;
    public final List CatchingFishDaggerWebsocket;
    public final SocketFactory CatchingFishEspressoTesting;
    public final ProxySelector CatchingFishFragmentHandler;
    public final int CatchingFishGsonAppCompat;
    public final CatchingFishLayoutLayout CatchingFishJetpackCompose;
    public final CatchingFishLayoutLayout CatchingFishLayout;
    public final CatchingFishLayoutLayout CatchingFishNavigation;
    public final SSLSocketFactory CatchingFishOkHttp;
    public final int CatchingFishParcelableFlux;
    public final CatchingFishFluxFluxBundle CatchingFishReduxKtor;
    public final CatchingFishLayoutLayout CatchingFishRoomDatabase;
    public final boolean CatchingFishSpannableWidget;
    public final CatchingFishCameraXHilt CatchingFishStateLiveData;
    public final CatchingFishGsonCardView CatchingFishUnitTesting;
    public final List CatchingFishViewModelFAB;
    public final List CatchingFishViewModelScope;
    public final List CatchingFishWorkManager;
    public static final List CatchingFishPayPal = CatchingFishEspressoDagger.CatchingFishLayout(CatchingFishServicePicasso.HTTP_2, CatchingFishServicePicasso.HTTP_1_1);
    public static final List CatchingFishCardViewView = CatchingFishEspressoDagger.CatchingFishLayout(CatchingFishMVPFAB.CatchingFishDaggerWebsocket, CatchingFishMVPFAB.CatchingFishWorkManager);

    static {
        CatchingFishWidgetContext.CatchingFishUnitTesting = new CatchingFishWidgetContext();
    }

    public CatchingFishMoshiMVP(CatchingFishAppCompatMoshi catchingFishAppCompatMoshi) {
        boolean z;
        this.CatchingFishReduxKtor = catchingFishAppCompatMoshi.CatchingFishParcelableFAB;
        this.CatchingFishDaggerWebsocket = catchingFishAppCompatMoshi.CatchingFishSnackbar;
        List list = catchingFishAppCompatMoshi.CatchingFishCoroutine;
        this.CatchingFishWorkManager = list;
        this.CatchingFishViewModelScope = Collections.unmodifiableList(new ArrayList(catchingFishAppCompatMoshi.CatchingFishReduxKtor));
        this.CatchingFishViewModelFAB = Collections.unmodifiableList(new ArrayList(catchingFishAppCompatMoshi.CatchingFishDaggerWebsocket));
        this.CatchingFishLayout = catchingFishAppCompatMoshi.CatchingFishWorkManager;
        this.CatchingFishFragmentHandler = catchingFishAppCompatMoshi.CatchingFishViewModelScope;
        this.CatchingFishCloudMessaging = catchingFishAppCompatMoshi.CatchingFishViewModelFAB;
        this.CatchingFishEspressoTesting = catchingFishAppCompatMoshi.CatchingFishLayout;
        Iterator it = list.iterator();
        loop0: while (true) {
            z = false;
            while (it.hasNext()) {
                z = (z || ((CatchingFishMVPFAB) it.next()).CatchingFishParcelableFAB) ? true : z;
            }
        }
        SSLSocketFactory sSLSocketFactory = catchingFishAppCompatMoshi.CatchingFishFragmentHandler;
        if (sSLSocketFactory == null && z) {
            try {
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            CatchingFishCoroutineRoom catchingFishCoroutineRoom = CatchingFishCoroutineRoom.CatchingFishParcelableFAB;
                            SSLContext CatchingFishLayout = catchingFishCoroutineRoom.CatchingFishLayout();
                            CatchingFishLayout.init(null, new TrustManager[]{x509TrustManager}, null);
                            this.CatchingFishOkHttp = CatchingFishLayout.getSocketFactory();
                            this.CatchingFishUnitTesting = catchingFishCoroutineRoom.CatchingFishCoroutine(x509TrustManager);
                        } catch (GeneralSecurityException e) {
                            throw new AssertionError("No System TLS", e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e2) {
                throw new AssertionError("No System TLS", e2);
            }
        }
        this.CatchingFishOkHttp = sSLSocketFactory;
        this.CatchingFishUnitTesting = catchingFishAppCompatMoshi.CatchingFishCloudMessaging;
        SSLSocketFactory sSLSocketFactory2 = this.CatchingFishOkHttp;
        if (sSLSocketFactory2 != null) {
            CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishWorkManager(sSLSocketFactory2);
        }
        this.CatchingFishAnimationMockk = catchingFishAppCompatMoshi.CatchingFishEspressoTesting;
        CatchingFishCameraXHilt catchingFishCameraXHilt = catchingFishAppCompatMoshi.CatchingFishOkHttp;
        CatchingFishGsonCardView catchingFishGsonCardView = this.CatchingFishUnitTesting;
        this.CatchingFishStateLiveData = Objects.equals(catchingFishCameraXHilt.CatchingFishSnackbar, catchingFishGsonCardView) ? catchingFishCameraXHilt : new CatchingFishCameraXHilt(catchingFishCameraXHilt.CatchingFishParcelableFAB, catchingFishGsonCardView);
        this.CatchingFishRoomDatabase = catchingFishAppCompatMoshi.CatchingFishUnitTesting;
        this.CatchingFishNavigation = catchingFishAppCompatMoshi.CatchingFishAnimationMockk;
        this.CatchingFish = catchingFishAppCompatMoshi.CatchingFishStateLiveData;
        this.CatchingFishJetpackCompose = catchingFishAppCompatMoshi.CatchingFishRoomDatabase;
        this.CatchingFishCoroutineFlow = catchingFishAppCompatMoshi.CatchingFishNavigation;
        this.CatchingFishDaggerHiltFAB = catchingFishAppCompatMoshi.CatchingFish;
        this.CatchingFishSpannableWidget = catchingFishAppCompatMoshi.CatchingFishJetpackCompose;
        this.CatchingFishParcelableFlux = catchingFishAppCompatMoshi.CatchingFishCoroutineFlow;
        this.CatchingFishGsonAppCompat = catchingFishAppCompatMoshi.CatchingFishDaggerHiltFAB;
        this.CatchingFishCardViewRealm = catchingFishAppCompatMoshi.CatchingFishSpannableWidget;
        if (this.CatchingFishViewModelScope.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.CatchingFishViewModelScope);
        }
        if (this.CatchingFishViewModelFAB.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.CatchingFishViewModelFAB);
        }
    }

    public final CatchingFishWidgetMVVMAdMob CatchingFishParcelableFAB(CatchingFishReduxBundleMVP catchingFishReduxBundleMVP, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle) {
        CatchingFishWidgetMVVMAdMob catchingFishWidgetMVVMAdMob = new CatchingFishWidgetMVVMAdMob(catchingFishReduxBundleMVP, catchingFishFluxFluxBundle, new Random(), 0);
        CatchingFishAppCompatMoshi catchingFishAppCompatMoshi = new CatchingFishAppCompatMoshi(this);
        catchingFishAppCompatMoshi.CatchingFishWorkManager = new CatchingFishLayoutLayout(13);
        ArrayList arrayList = new ArrayList(CatchingFishWidgetMVVMAdMob.CatchingFishDaggerHiltFAB);
        CatchingFishServicePicasso catchingFishServicePicasso = CatchingFishServicePicasso.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(catchingFishServicePicasso) && !arrayList.contains(CatchingFishServicePicasso.HTTP_1_1)) {
            throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
        }
        if (arrayList.contains(catchingFishServicePicasso) && arrayList.size() > 1) {
            throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
        }
        if (arrayList.contains(CatchingFishServicePicasso.HTTP_1_0)) {
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
        }
        if (arrayList.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayList.remove(CatchingFishServicePicasso.SPDY_3);
        catchingFishAppCompatMoshi.CatchingFishSnackbar = Collections.unmodifiableList(arrayList);
        CatchingFishMoshiMVP catchingFishMoshiMVP = new CatchingFishMoshiMVP(catchingFishAppCompatMoshi);
        CatchingFishFluxFluxBundle CatchingFishParcelableFAB = catchingFishWidgetMVVMAdMob.CatchingFishParcelableFAB.CatchingFishParcelableFAB();
        ((CatchingFishViewPagerMockk) CatchingFishParcelableFAB.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("Upgrade", "websocket");
        ((CatchingFishViewPagerMockk) CatchingFishParcelableFAB.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("Connection", "Upgrade");
        ((CatchingFishViewPagerMockk) CatchingFishParcelableFAB.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("Sec-WebSocket-Key", catchingFishWidgetMVVMAdMob.CatchingFishDaggerWebsocket);
        ((CatchingFishViewPagerMockk) CatchingFishParcelableFAB.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("Sec-WebSocket-Version", "13");
        CatchingFishReduxBundleMVP CatchingFishDaggerWebsocket = CatchingFishParcelableFAB.CatchingFishDaggerWebsocket();
        CatchingFishWidgetContext.CatchingFishUnitTesting.getClass();
        CatchingFishDaggerWebSocket catchingFishDaggerWebSocket = new CatchingFishDaggerWebSocket(catchingFishMoshiMVP, CatchingFishDaggerWebsocket);
        catchingFishDaggerWebSocket.CatchingFishDaggerWebsocket = new CatchingFishDaggerHiltRedux(catchingFishMoshiMVP, catchingFishDaggerWebSocket);
        catchingFishWidgetMVVMAdMob.CatchingFishWorkManager = catchingFishDaggerWebSocket;
        CatchingFishViewModelIntent catchingFishViewModelIntent = new CatchingFishViewModelIntent(10, catchingFishWidgetMVVMAdMob, CatchingFishDaggerWebsocket, false);
        synchronized (catchingFishDaggerWebSocket) {
            if (catchingFishDaggerWebSocket.CatchingFishViewModelScope) {
                throw new IllegalStateException("Already Executed");
            }
            catchingFishDaggerWebSocket.CatchingFishViewModelScope = true;
        }
        CatchingFishDaggerHiltRedux catchingFishDaggerHiltRedux = catchingFishDaggerWebSocket.CatchingFishDaggerWebsocket;
        catchingFishDaggerHiltRedux.getClass();
        catchingFishDaggerHiltRedux.CatchingFishWorkManager = CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishCloudMessaging();
        catchingFishDaggerHiltRedux.CatchingFishReduxKtor.getClass();
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2 = catchingFishMoshiMVP.CatchingFishReduxKtor;
        CatchingFishRealmAsyncTask catchingFishRealmAsyncTask = new CatchingFishRealmAsyncTask(catchingFishDaggerWebSocket, catchingFishViewModelIntent);
        synchronized (catchingFishFluxFluxBundle2) {
            ((ArrayDeque) catchingFishFluxFluxBundle2.CatchingFishViewModelScope).add(catchingFishRealmAsyncTask);
        }
        catchingFishFluxFluxBundle2.CatchingFishPayPal();
        return catchingFishWidgetMVVMAdMob;
    }
}
