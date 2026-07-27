package kotlin.text;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class CatchingFishAdMobGson extends CatchingFishFABMockk {
    public boolean CatchingFishCloudMessaging;
    public final CatchingFishHiltMVIEspresso CatchingFishCoroutine;
    public Socket CatchingFishDaggerWebsocket;
    public int CatchingFishEspressoTesting;
    public CatchingFishLayoutFlux CatchingFishFragmentHandler;
    public CatchingFishAdMobMVVM CatchingFishLayout;
    public int CatchingFishOkHttp;
    public Socket CatchingFishReduxKtor;
    public final CatchingFishWidgetViewModel CatchingFishSnackbar;
    public int CatchingFishUnitTesting;
    public CatchingFishSharedFlowMoshi CatchingFishViewModelFAB;
    public CatchingFishServicePicasso CatchingFishViewModelScope;
    public CatchingFishRealmWidget CatchingFishWorkManager;
    public int CatchingFishAnimationMockk = 1;
    public final ArrayList CatchingFishStateLiveData = new ArrayList();
    public long CatchingFishRoomDatabase = Long.MAX_VALUE;

    public CatchingFishAdMobGson(CatchingFishWidgetViewModel catchingFishWidgetViewModel, CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso) {
        this.CatchingFishSnackbar = catchingFishWidgetViewModel;
        this.CatchingFishCoroutine = catchingFishHiltMVIEspresso;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void CatchingFishCoroutine(int i, int i2, int i3, boolean z, CatchingFishWidgetContext catchingFishWidgetContext) {
        boolean z2;
        CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso;
        if (this.CatchingFishViewModelScope != null) {
            throw new IllegalStateException("already connected");
        }
        CatchingFishRoomCardView catchingFishRoomCardView = this.CatchingFishCoroutine.CatchingFishParcelableFAB;
        List list = catchingFishRoomCardView.CatchingFishWorkManager;
        CatchingFishLiveDataGradle catchingFishLiveDataGradle = new CatchingFishLiveDataGradle(list);
        if (catchingFishRoomCardView.CatchingFishViewModelFAB == null) {
            if (!list.contains(CatchingFishMVPFAB.CatchingFishWorkManager)) {
                throw new CatchingFishToastAdMob(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String str = this.CatchingFishCoroutine.CatchingFishParcelableFAB.CatchingFishParcelableFAB.CatchingFishReduxKtor;
            if (!CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishEspressoTesting(str)) {
                throw new CatchingFishToastAdMob(new UnknownServiceException(CatchingFishMVPLiveData.CatchingFishOkHttp("CLEARTEXT communication to ", str, " not permitted by network security policy")));
            }
        } else if (catchingFishRoomCardView.CatchingFishDaggerWebsocket.contains(CatchingFishServicePicasso.H2_PRIOR_KNOWLEDGE)) {
            throw new CatchingFishToastAdMob(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        CatchingFishToastAdMob catchingFishToastAdMob = null;
        do {
            z2 = false;
            try {
                CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso2 = this.CatchingFishCoroutine;
                if (catchingFishHiltMVIEspresso2.CatchingFishParcelableFAB.CatchingFishViewModelFAB != null && catchingFishHiltMVIEspresso2.CatchingFishSnackbar.type() == Proxy.Type.HTTP) {
                    CatchingFishDaggerWebsocket(i, i2, i3, catchingFishWidgetContext);
                    if (this.CatchingFishReduxKtor == null) {
                        catchingFishHiltMVIEspresso = this.CatchingFishCoroutine;
                        if (catchingFishHiltMVIEspresso.CatchingFishParcelableFAB.CatchingFishViewModelFAB == null && catchingFishHiltMVIEspresso.CatchingFishSnackbar.type() == Proxy.Type.HTTP && this.CatchingFishReduxKtor == null) {
                            throw new CatchingFishToastAdMob(new ProtocolException("Too many tunnel connections attempted: 21"));
                        }
                        if (this.CatchingFishViewModelFAB == null) {
                            synchronized (this.CatchingFishSnackbar) {
                                this.CatchingFishAnimationMockk = this.CatchingFishViewModelFAB.CatchingFishReduxKtor();
                            }
                            return;
                        }
                        return;
                    }
                } else {
                    CatchingFishReduxKtor(i, i2, catchingFishWidgetContext);
                }
                CatchingFishWorkManager(catchingFishLiveDataGradle, catchingFishWidgetContext);
                InetSocketAddress inetSocketAddress = this.CatchingFishCoroutine.CatchingFishCoroutine;
                catchingFishWidgetContext.getClass();
                catchingFishHiltMVIEspresso = this.CatchingFishCoroutine;
                if (catchingFishHiltMVIEspresso.CatchingFishParcelableFAB.CatchingFishViewModelFAB == null) {
                }
                if (this.CatchingFishViewModelFAB == null) {
                }
            } catch (IOException e) {
                CatchingFishEspressoDagger.CatchingFishCoroutine(this.CatchingFishDaggerWebsocket);
                CatchingFishEspressoDagger.CatchingFishCoroutine(this.CatchingFishReduxKtor);
                this.CatchingFishDaggerWebsocket = null;
                this.CatchingFishReduxKtor = null;
                this.CatchingFishLayout = null;
                this.CatchingFishFragmentHandler = null;
                this.CatchingFishWorkManager = null;
                this.CatchingFishViewModelScope = null;
                this.CatchingFishViewModelFAB = null;
                InetSocketAddress inetSocketAddress2 = this.CatchingFishCoroutine.CatchingFishCoroutine;
                catchingFishWidgetContext.getClass();
                if (catchingFishToastAdMob == null) {
                    catchingFishToastAdMob = new CatchingFishToastAdMob(e);
                } else {
                    IOException iOException = catchingFishToastAdMob.CatchingFishReduxKtor;
                    Method method = CatchingFishEspressoDagger.CatchingFishViewModelScope;
                    if (method != null) {
                        try {
                            method.invoke(iOException, e);
                        } catch (IllegalAccessException | InvocationTargetException unused) {
                        }
                    }
                    catchingFishToastAdMob.CatchingFishDaggerWebsocket = e;
                }
                if (!z) {
                    throw catchingFishToastAdMob;
                }
                catchingFishLiveDataGradle.CatchingFishReduxKtor = true;
                if (catchingFishLiveDataGradle.CatchingFishCoroutine && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException))) {
                    z2 = e instanceof SSLException;
                }
            }
        } while (z2);
        throw catchingFishToastAdMob;
    }

    public final void CatchingFishDaggerWebsocket(int i, int i2, int i3, CatchingFishWidgetContext catchingFishWidgetContext) {
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle = new CatchingFishFluxFluxBundle(16);
        CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso = this.CatchingFishCoroutine;
        CatchingFishRoomCardView catchingFishRoomCardView = catchingFishHiltMVIEspresso.CatchingFishParcelableFAB;
        CatchingFishRoomCardView catchingFishRoomCardView2 = catchingFishHiltMVIEspresso.CatchingFishParcelableFAB;
        CatchingFishBundleView catchingFishBundleView = catchingFishRoomCardView.CatchingFishParcelableFAB;
        if (catchingFishBundleView == null) {
            throw new NullPointerException("url == null");
        }
        catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket = catchingFishBundleView;
        catchingFishFluxFluxBundle.CatchingFishSpannableWidget("CONNECT", null);
        ((CatchingFishViewPagerMockk) catchingFishFluxFluxBundle.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("Host", CatchingFishEspressoDagger.CatchingFishViewModelFAB(catchingFishRoomCardView2.CatchingFishParcelableFAB, true));
        ((CatchingFishViewPagerMockk) catchingFishFluxFluxBundle.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("Proxy-Connection", "Keep-Alive");
        ((CatchingFishViewPagerMockk) catchingFishFluxFluxBundle.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("User-Agent", "okhttp/3.14.9");
        CatchingFishReduxBundleMVP CatchingFishDaggerWebsocket = catchingFishFluxFluxBundle.CatchingFishDaggerWebsocket();
        CatchingFishGsonReduxWidget catchingFishGsonReduxWidget = new CatchingFishGsonReduxWidget();
        catchingFishGsonReduxWidget.CatchingFishParcelableFAB = CatchingFishDaggerWebsocket;
        catchingFishGsonReduxWidget.CatchingFishSnackbar = CatchingFishServicePicasso.HTTP_1_1;
        catchingFishGsonReduxWidget.CatchingFishCoroutine = 407;
        catchingFishGsonReduxWidget.CatchingFishReduxKtor = "Preemptive Authenticate";
        catchingFishGsonReduxWidget.CatchingFishViewModelScope = CatchingFishEspressoDagger.CatchingFishReduxKtor;
        catchingFishGsonReduxWidget.CatchingFishCloudMessaging = -1L;
        catchingFishGsonReduxWidget.CatchingFishEspressoTesting = -1L;
        catchingFishGsonReduxWidget.CatchingFishWorkManager.CatchingFishDaggerHiltFAB("Proxy-Authenticate", "OkHttp-Preemptive");
        catchingFishGsonReduxWidget.CatchingFishParcelableFAB();
        catchingFishRoomCardView2.CatchingFishReduxKtor.getClass();
        CatchingFishBundleView catchingFishBundleView2 = CatchingFishDaggerWebsocket.CatchingFishParcelableFAB;
        CatchingFishReduxKtor(i, i2, catchingFishWidgetContext);
        String str = "CONNECT " + CatchingFishEspressoDagger.CatchingFishViewModelFAB(catchingFishBundleView2, true) + " HTTP/1.1";
        CatchingFishAdMobMVVM catchingFishAdMobMVVM = this.CatchingFishLayout;
        CatchingFishFragmentMockk catchingFishFragmentMockk = new CatchingFishFragmentMockk(null, null, catchingFishAdMobMVVM, this.CatchingFishFragmentHandler);
        CatchingFishMoshiFirebase CatchingFishParcelableFAB = catchingFishAdMobMVVM.CatchingFishReduxKtor.CatchingFishParcelableFAB();
        long j = i2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        CatchingFishParcelableFAB.CatchingFishViewModelScope(j, timeUnit);
        this.CatchingFishFragmentHandler.CatchingFishReduxKtor.CatchingFishParcelableFAB().CatchingFishViewModelScope(i3, timeUnit);
        catchingFishFragmentMockk.CatchingFishCloudMessaging(CatchingFishDaggerWebsocket.CatchingFishCoroutine, str);
        catchingFishFragmentMockk.CatchingFishParcelableFAB();
        CatchingFishGsonReduxWidget CatchingFishViewModelScope = catchingFishFragmentMockk.CatchingFishViewModelScope(false);
        CatchingFishViewModelScope.CatchingFishParcelableFAB = CatchingFishDaggerWebsocket;
        CatchingFishLayoutRedux CatchingFishParcelableFAB2 = CatchingFishViewModelScope.CatchingFishParcelableFAB();
        int i4 = CatchingFishParcelableFAB2.CatchingFishWorkManager;
        long CatchingFishParcelableFAB3 = CatchingFishWidgetEspresso.CatchingFishParcelableFAB(CatchingFishParcelableFAB2);
        if (CatchingFishParcelableFAB3 != -1) {
            CatchingFishJUnitHandler CatchingFishLayout = catchingFishFragmentMockk.CatchingFishLayout(CatchingFishParcelableFAB3);
            CatchingFishEspressoDagger.CatchingFishUnitTesting(CatchingFishLayout, Integer.MAX_VALUE);
            CatchingFishLayout.close();
        }
        if (i4 != 200) {
            if (i4 != 407) {
                throw new IOException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Unexpected response code for CONNECT: ", i4));
            }
            catchingFishRoomCardView2.CatchingFishReduxKtor.getClass();
            throw new IOException("Failed to authenticate with proxy");
        }
        if (!this.CatchingFishLayout.CatchingFishDaggerWebsocket.CatchingFishReduxKtor() || !this.CatchingFishFragmentHandler.CatchingFishDaggerWebsocket.CatchingFishReduxKtor()) {
            throw new IOException("TLS tunnel buffered too many bytes!");
        }
    }

    public final boolean CatchingFishFragmentHandler(CatchingFishBundleView catchingFishBundleView) {
        int i = catchingFishBundleView.CatchingFishDaggerWebsocket;
        String str = catchingFishBundleView.CatchingFishReduxKtor;
        CatchingFishBundleView catchingFishBundleView2 = this.CatchingFishCoroutine.CatchingFishParcelableFAB.CatchingFishParcelableFAB;
        if (i == catchingFishBundleView2.CatchingFishDaggerWebsocket) {
            if (str.equals(catchingFishBundleView2.CatchingFishReduxKtor)) {
                return true;
            }
            CatchingFishRealmWidget catchingFishRealmWidget = this.CatchingFishWorkManager;
            if (catchingFishRealmWidget != null && CatchingFishGlideOkHttp.CatchingFishCoroutine(str, (X509Certificate) catchingFishRealmWidget.CatchingFishCoroutine.get(0))) {
                return true;
            }
        }
        return false;
    }

    public final void CatchingFishLayout() {
        this.CatchingFishDaggerWebsocket.setSoTimeout(0);
        CatchingFishGsonFragment catchingFishGsonFragment = new CatchingFishGsonFragment();
        catchingFishGsonFragment.CatchingFishLayout = CatchingFishFABMockk.CatchingFishParcelableFAB;
        catchingFishGsonFragment.CatchingFishReduxKtor = true;
        Socket socket = this.CatchingFishDaggerWebsocket;
        String str = this.CatchingFishCoroutine.CatchingFishParcelableFAB.CatchingFishParcelableFAB.CatchingFishReduxKtor;
        CatchingFishAdMobMVVM catchingFishAdMobMVVM = this.CatchingFishLayout;
        CatchingFishLayoutFlux catchingFishLayoutFlux = this.CatchingFishFragmentHandler;
        catchingFishGsonFragment.CatchingFishDaggerWebsocket = socket;
        catchingFishGsonFragment.CatchingFishWorkManager = str;
        catchingFishGsonFragment.CatchingFishViewModelScope = catchingFishAdMobMVVM;
        catchingFishGsonFragment.CatchingFishViewModelFAB = catchingFishLayoutFlux;
        catchingFishGsonFragment.CatchingFishLayout = this;
        CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = new CatchingFishSharedFlowMoshi(catchingFishGsonFragment);
        this.CatchingFishViewModelFAB = catchingFishSharedFlowMoshi;
        CatchingFishKtorRedux catchingFishKtorRedux = catchingFishSharedFlowMoshi.CatchingFishSpannableWidget;
        synchronized (catchingFishKtorRedux) {
            try {
                if (catchingFishKtorRedux.CatchingFishViewModelFAB) {
                    throw new IOException("closed");
                }
                if (catchingFishKtorRedux.CatchingFishDaggerWebsocket) {
                    Logger logger = CatchingFishKtorRedux.CatchingFishFragmentHandler;
                    if (logger.isLoggable(Level.FINE)) {
                        String CatchingFishDaggerWebsocket = CatchingFishViewModelRedux.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket();
                        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
                        Locale locale = Locale.US;
                        logger.fine(">> CONNECTION " + CatchingFishDaggerWebsocket);
                    }
                    CatchingFishAnimationMVI catchingFishAnimationMVI = catchingFishKtorRedux.CatchingFishReduxKtor;
                    byte[] bArr2 = CatchingFishViewModelRedux.CatchingFishParcelableFAB.CatchingFishReduxKtor;
                    byte[] copyOf = Arrays.copyOf(bArr2, bArr2.length);
                    CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(this, size)");
                    catchingFishAnimationMVI.write(copyOf);
                    catchingFishKtorRedux.CatchingFishReduxKtor.flush();
                }
            } finally {
            }
        }
        CatchingFishKtorRedux catchingFishKtorRedux2 = catchingFishSharedFlowMoshi.CatchingFishSpannableWidget;
        CatchingFishWidgetToolbar catchingFishWidgetToolbar = catchingFishSharedFlowMoshi.CatchingFishJetpackCompose;
        synchronized (catchingFishKtorRedux2) {
            try {
                if (catchingFishKtorRedux2.CatchingFishViewModelFAB) {
                    throw new IOException("closed");
                }
                catchingFishKtorRedux2.CatchingFishReduxKtor(0, Integer.bitCount(catchingFishWidgetToolbar.CatchingFishSnackbar) * 6, (byte) 4, (byte) 0);
                int i = 0;
                while (i < 10) {
                    if (((1 << i) & catchingFishWidgetToolbar.CatchingFishSnackbar) != 0) {
                        catchingFishKtorRedux2.CatchingFishReduxKtor.writeShort(i == 4 ? 3 : i == 7 ? 4 : i);
                        catchingFishKtorRedux2.CatchingFishReduxKtor.writeInt(catchingFishWidgetToolbar.CatchingFishParcelableFAB[i]);
                    }
                    i++;
                }
                catchingFishKtorRedux2.CatchingFishReduxKtor.flush();
            } finally {
            }
        }
        if (catchingFishSharedFlowMoshi.CatchingFishJetpackCompose.CatchingFishParcelableFAB() != 65535) {
            catchingFishSharedFlowMoshi.CatchingFishSpannableWidget.CatchingFishAnimationMockk(0, r0 - 65535);
        }
        new Thread(catchingFishSharedFlowMoshi.CatchingFishParcelableFlux).start();
    }

    @Override // kotlin.text.CatchingFishFABMockk
    public final void CatchingFishParcelableFAB(CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi) {
        synchronized (this.CatchingFishSnackbar) {
            this.CatchingFishAnimationMockk = catchingFishSharedFlowMoshi.CatchingFishReduxKtor();
        }
    }

    public final void CatchingFishReduxKtor(int i, int i2, CatchingFishWidgetContext catchingFishWidgetContext) {
        CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso = this.CatchingFishCoroutine;
        Proxy proxy = catchingFishHiltMVIEspresso.CatchingFishSnackbar;
        InetSocketAddress inetSocketAddress = catchingFishHiltMVIEspresso.CatchingFishCoroutine;
        this.CatchingFishReduxKtor = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? catchingFishHiltMVIEspresso.CatchingFishParcelableFAB.CatchingFishCoroutine.createSocket() : new Socket(proxy);
        catchingFishWidgetContext.getClass();
        this.CatchingFishReduxKtor.setSoTimeout(i2);
        try {
            CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishViewModelFAB(this.CatchingFishReduxKtor, inetSocketAddress, i);
            try {
                this.CatchingFishLayout = new CatchingFishAdMobMVVM(CatchingFishViewMVIMVVM.CatchingFishSpannableWidget(this.CatchingFishReduxKtor));
                this.CatchingFishFragmentHandler = new CatchingFishLayoutFlux(CatchingFishViewMVIMVVM.CatchingFishDaggerHiltFAB(this.CatchingFishReduxKtor));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // kotlin.text.CatchingFishFABMockk
    public final void CatchingFishSnackbar(CatchingFishPayPalMVI catchingFishPayPalMVI) {
        catchingFishPayPalMVI.CatchingFishCoroutine(5, null);
    }

    public final void CatchingFishViewModelFAB() {
        synchronized (this.CatchingFishSnackbar) {
            this.CatchingFishCloudMessaging = true;
        }
    }

    public final CatchingFishFragmentFlux CatchingFishViewModelScope(CatchingFishMoshiMVP catchingFishMoshiMVP, CatchingFishBiometricDagger catchingFishBiometricDagger) {
        int i = catchingFishBiometricDagger.CatchingFishViewModelFAB;
        if (this.CatchingFishViewModelFAB != null) {
            return new CatchingFishFragmentGraphQL(catchingFishMoshiMVP, this, catchingFishBiometricDagger, this.CatchingFishViewModelFAB);
        }
        this.CatchingFishDaggerWebsocket.setSoTimeout(i);
        CatchingFishMoshiFirebase CatchingFishParcelableFAB = this.CatchingFishLayout.CatchingFishReduxKtor.CatchingFishParcelableFAB();
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        CatchingFishParcelableFAB.CatchingFishViewModelScope(j, timeUnit);
        this.CatchingFishFragmentHandler.CatchingFishReduxKtor.CatchingFishParcelableFAB().CatchingFishViewModelScope(catchingFishBiometricDagger.CatchingFishLayout, timeUnit);
        return new CatchingFishFragmentMockk(catchingFishMoshiMVP, this, this.CatchingFishLayout, this.CatchingFishFragmentHandler);
    }

    public final void CatchingFishWorkManager(CatchingFishLiveDataGradle catchingFishLiveDataGradle, CatchingFishWidgetContext catchingFishWidgetContext) {
        String str;
        SSLSocket sSLSocket;
        CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso = this.CatchingFishCoroutine;
        CatchingFishRoomCardView catchingFishRoomCardView = catchingFishHiltMVIEspresso.CatchingFishParcelableFAB;
        SSLSocketFactory sSLSocketFactory = catchingFishRoomCardView.CatchingFishViewModelFAB;
        CatchingFishServicePicasso catchingFishServicePicasso = CatchingFishServicePicasso.HTTP_1_1;
        if (sSLSocketFactory == null) {
            List list = catchingFishRoomCardView.CatchingFishDaggerWebsocket;
            CatchingFishServicePicasso catchingFishServicePicasso2 = CatchingFishServicePicasso.H2_PRIOR_KNOWLEDGE;
            if (!list.contains(catchingFishServicePicasso2)) {
                this.CatchingFishDaggerWebsocket = this.CatchingFishReduxKtor;
                this.CatchingFishViewModelScope = catchingFishServicePicasso;
                return;
            } else {
                this.CatchingFishDaggerWebsocket = this.CatchingFishReduxKtor;
                this.CatchingFishViewModelScope = catchingFishServicePicasso2;
                CatchingFishLayout();
                return;
            }
        }
        catchingFishWidgetContext.getClass();
        CatchingFishRoomCardView catchingFishRoomCardView2 = catchingFishHiltMVIEspresso.CatchingFishParcelableFAB;
        SSLSocketFactory sSLSocketFactory2 = catchingFishRoomCardView2.CatchingFishViewModelFAB;
        CatchingFishBundleView catchingFishBundleView = catchingFishRoomCardView2.CatchingFishParcelableFAB;
        SSLSocket sSLSocket2 = null;
        try {
            try {
                Socket socket = this.CatchingFishReduxKtor;
                str = catchingFishBundleView.CatchingFishReduxKtor;
                sSLSocket = (SSLSocket) sSLSocketFactory2.createSocket(socket, str, catchingFishBundleView.CatchingFishDaggerWebsocket, true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean z = catchingFishLiveDataGradle.CatchingFishParcelableFAB(sSLSocket).CatchingFishSnackbar;
            if (z) {
                CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishViewModelScope(sSLSocket, str, catchingFishRoomCardView2.CatchingFishDaggerWebsocket);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            CatchingFishRealmWidget CatchingFishParcelableFAB = CatchingFishRealmWidget.CatchingFishParcelableFAB(session);
            List list2 = CatchingFishParcelableFAB.CatchingFishCoroutine;
            if (catchingFishRoomCardView2.CatchingFishLayout.verify(str, session)) {
                catchingFishRoomCardView2.CatchingFishFragmentHandler.CatchingFishParcelableFAB(str, list2);
                String CatchingFishFragmentHandler = z ? CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishFragmentHandler(sSLSocket) : null;
                this.CatchingFishDaggerWebsocket = sSLSocket;
                this.CatchingFishLayout = new CatchingFishAdMobMVVM(CatchingFishViewMVIMVVM.CatchingFishSpannableWidget(sSLSocket));
                this.CatchingFishFragmentHandler = new CatchingFishLayoutFlux(CatchingFishViewMVIMVVM.CatchingFishDaggerHiltFAB(this.CatchingFishDaggerWebsocket));
                this.CatchingFishWorkManager = CatchingFishParcelableFAB;
                if (CatchingFishFragmentHandler != null) {
                    catchingFishServicePicasso = CatchingFishServicePicasso.CatchingFishParcelableFAB(CatchingFishFragmentHandler);
                }
                this.CatchingFishViewModelScope = catchingFishServicePicasso;
                CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishParcelableFAB(sSLSocket);
                if (this.CatchingFishViewModelScope == CatchingFishServicePicasso.HTTP_2) {
                    CatchingFishLayout();
                    return;
                }
                return;
            }
            if (list2.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + str + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) list2.get(0);
            throw new SSLPeerUnverifiedException("Hostname " + str + " not verified:\n    certificate: " + CatchingFishCameraXHilt.CatchingFishSnackbar(x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + CatchingFishGlideOkHttp.CatchingFishParcelableFAB(x509Certificate));
        } catch (AssertionError e2) {
            e = e2;
            if (!CatchingFishEspressoDagger.CatchingFishCloudMessaging(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            sSLSocket2 = sSLSocket;
            if (sSLSocket2 != null) {
                CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishParcelableFAB(sSLSocket2);
            }
            CatchingFishEspressoDagger.CatchingFishCoroutine(sSLSocket2);
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso = this.CatchingFishCoroutine;
        sb.append(catchingFishHiltMVIEspresso.CatchingFishParcelableFAB.CatchingFishParcelableFAB.CatchingFishReduxKtor);
        sb.append(":");
        sb.append(catchingFishHiltMVIEspresso.CatchingFishParcelableFAB.CatchingFishParcelableFAB.CatchingFishDaggerWebsocket);
        sb.append(", proxy=");
        sb.append(catchingFishHiltMVIEspresso.CatchingFishSnackbar);
        sb.append(" hostAddress=");
        sb.append(catchingFishHiltMVIEspresso.CatchingFishCoroutine);
        sb.append(" cipherSuite=");
        CatchingFishRealmWidget catchingFishRealmWidget = this.CatchingFishWorkManager;
        sb.append(catchingFishRealmWidget != null ? catchingFishRealmWidget.CatchingFishSnackbar : "none");
        sb.append(" protocol=");
        sb.append(this.CatchingFishViewModelScope);
        sb.append('}');
        return sb.toString();
    }
}
