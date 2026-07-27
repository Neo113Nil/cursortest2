package kotlin.text;

import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class CatchingFishAsyncTaskJUnit implements CatchingFishDaggerGson {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishAsyncTaskJUnit(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0130, code lost:
    
        if (r14 > 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0133, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0172, code lost:
    
        if (r14 == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0187, code lost:
    
        if (r11.equals("HEAD") == false) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0276 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x020d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b2  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.IOException, kotlin.text.CatchingFishDatabindingMVP] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r22v1, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [kotlin.text.CatchingFishCameraXHilt] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r29v0, types: [kotlin.text.CatchingFishAsyncTaskJUnit] */
    /* JADX WARN: Type inference failed for: r30v0, types: [kotlin.text.CatchingFishBiometricDagger] */
    /* JADX WARN: Type inference failed for: r4v7, types: [kotlin.text.CatchingFishDaggerHiltRedux] */
    @Override // kotlin.text.CatchingFishDaggerGson
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CatchingFishLayoutRedux CatchingFishParcelableFAB(CatchingFishBiometricDagger catchingFishBiometricDagger) {
        boolean z;
        boolean z2;
        SSLSocketFactory sSLSocketFactory;
        ?? r23;
        ?? r22;
        Object obj;
        CatchingFishFluxFluxBundle catchingFishFluxFluxBundle;
        CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso;
        CatchingFishMoshiMVP catchingFishMoshiMVP;
        CatchingFishLayoutRedux catchingFishLayoutRedux;
        CatchingFishReduxBundleMVP catchingFishReduxBundleMVP;
        int i;
        String str;
        String CatchingFishSnackbar;
        CatchingFishViewHilt catchingFishViewHilt;
        CatchingFishBundleView CatchingFishSnackbar2;
        boolean z3;
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishGradleMVVM catchingFishGradleMVVM = (CatchingFishGradleMVVM) this.CatchingFishSnackbar;
                CatchingFishReduxBundleMVP catchingFishReduxBundleMVP2 = catchingFishBiometricDagger.CatchingFishDaggerWebsocket;
                CatchingFishFluxFluxBundle CatchingFishParcelableFAB = catchingFishReduxBundleMVP2.CatchingFishParcelableFAB();
                CatchingFishBundleView catchingFishBundleView = catchingFishReduxBundleMVP2.CatchingFishParcelableFAB;
                CatchingFishKtorStripeAPI catchingFishKtorStripeAPI = catchingFishReduxBundleMVP2.CatchingFishCoroutine;
                if (catchingFishKtorStripeAPI.CatchingFishCoroutine("Host") == null) {
                    ((CatchingFishViewPagerMockk) CatchingFishParcelableFAB.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("Host", CatchingFishEspressoDagger.CatchingFishViewModelFAB(catchingFishBundleView, false));
                }
                if (catchingFishKtorStripeAPI.CatchingFishCoroutine("Connection") == null) {
                    ((CatchingFishViewPagerMockk) CatchingFishParcelableFAB.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("Connection", "Keep-Alive");
                }
                if (catchingFishKtorStripeAPI.CatchingFishCoroutine("Accept-Encoding") == null && catchingFishKtorStripeAPI.CatchingFishCoroutine("Range") == null) {
                    ((CatchingFishViewPagerMockk) CatchingFishParcelableFAB.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("Accept-Encoding", "gzip");
                    z = true;
                } else {
                    z = false;
                }
                catchingFishGradleMVVM.getClass();
                List list = Collections.EMPTY_LIST;
                if (list.isEmpty()) {
                    z2 = z;
                } else {
                    StringBuilder sb = new StringBuilder();
                    int size = list.size();
                    int i2 = 0;
                    while (i2 < size) {
                        boolean z4 = z;
                        if (i2 > 0) {
                            sb.append("; ");
                        }
                        CatchingFishSharedFlowGson catchingFishSharedFlowGson = (CatchingFishSharedFlowGson) list.get(i2);
                        sb.append(catchingFishSharedFlowGson.CatchingFishParcelableFAB);
                        sb.append('=');
                        sb.append(catchingFishSharedFlowGson.CatchingFishSnackbar);
                        i2++;
                        z = z4;
                    }
                    z2 = z;
                    ((CatchingFishViewPagerMockk) CatchingFishParcelableFAB.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("Cookie", sb.toString());
                }
                if (catchingFishKtorStripeAPI.CatchingFishCoroutine("User-Agent") == null) {
                    ((CatchingFishViewPagerMockk) CatchingFishParcelableFAB.CatchingFishWorkManager).CatchingFishDaggerHiltFAB("User-Agent", "okhttp/3.14.9");
                }
                CatchingFishLayoutRedux CatchingFishParcelableFAB2 = catchingFishBiometricDagger.CatchingFishParcelableFAB(CatchingFishParcelableFAB.CatchingFishDaggerWebsocket());
                CatchingFishKtorStripeAPI catchingFishKtorStripeAPI2 = CatchingFishParcelableFAB2.CatchingFishLayout;
                CatchingFishWidgetEspresso.CatchingFishReduxKtor(catchingFishGradleMVVM, catchingFishBundleView, catchingFishKtorStripeAPI2);
                CatchingFishGsonReduxWidget CatchingFishCoroutine = CatchingFishParcelableFAB2.CatchingFishCoroutine();
                CatchingFishCoroutine.CatchingFishParcelableFAB = catchingFishReduxBundleMVP2;
                if (z2 && "gzip".equalsIgnoreCase(CatchingFishParcelableFAB2.CatchingFishSnackbar("Content-Encoding")) && CatchingFishWidgetEspresso.CatchingFishSnackbar(CatchingFishParcelableFAB2)) {
                    CatchingFishDaggerCardView catchingFishDaggerCardView = new CatchingFishDaggerCardView(CatchingFishParcelableFAB2.CatchingFishFragmentHandler.CatchingFishCoroutine());
                    CatchingFishViewPagerMockk CatchingFishDaggerWebsocket = catchingFishKtorStripeAPI2.CatchingFishDaggerWebsocket();
                    CatchingFishDaggerWebsocket.CatchingFishCoroutineFlow("Content-Encoding");
                    CatchingFishDaggerWebsocket.CatchingFishCoroutineFlow("Content-Length");
                    ArrayList arrayList = (ArrayList) CatchingFishDaggerWebsocket.CatchingFishDaggerWebsocket;
                    String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                    CatchingFishViewPagerMockk catchingFishViewPagerMockk = new CatchingFishViewPagerMockk(12);
                    Collections.addAll((ArrayList) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket, strArr);
                    CatchingFishCoroutine.CatchingFishWorkManager = catchingFishViewPagerMockk;
                    CatchingFishParcelableFAB2.CatchingFishSnackbar("Content-Type");
                    CatchingFishCoroutine.CatchingFishViewModelScope = new CatchingFishGsonLifecycle(-1L, new CatchingFishAdMobMVVM(catchingFishDaggerCardView), 0);
                }
                return CatchingFishCoroutine.CatchingFishParcelableFAB();
            default:
                CatchingFishReduxBundleMVP catchingFishReduxBundleMVP3 = catchingFishBiometricDagger.CatchingFishDaggerWebsocket;
                ?? r4 = catchingFishBiometricDagger.CatchingFishSnackbar;
                ?? r10 = 0;
                CatchingFishReduxBundleMVP catchingFishReduxBundleMVP4 = catchingFishReduxBundleMVP3;
                CatchingFishLayoutRedux catchingFishLayoutRedux2 = null;
                int i3 = 0;
                while (true) {
                    CatchingFishReduxBundleMVP catchingFishReduxBundleMVP5 = r4.CatchingFishViewModelScope;
                    if (catchingFishReduxBundleMVP5 != null) {
                        if (!CatchingFishEspressoDagger.CatchingFishOkHttp(catchingFishReduxBundleMVP5.CatchingFishParcelableFAB, catchingFishReduxBundleMVP4.CatchingFishParcelableFAB) || !r4.CatchingFishViewModelFAB.CatchingFishCoroutine()) {
                            if (r4.CatchingFishFragmentHandler != null) {
                                throw new IllegalStateException();
                            }
                            if (r4.CatchingFishViewModelFAB != null) {
                                r4.CatchingFishDaggerWebsocket(r10, true);
                                r4.CatchingFishViewModelFAB = r10;
                            }
                        }
                        if (!r4.CatchingFishReduxKtor()) {
                            throw new IOException("Canceled");
                        }
                        try {
                            try {
                                CatchingFishLayoutRedux CatchingFishSnackbar3 = catchingFishBiometricDagger.CatchingFishSnackbar(catchingFishReduxBundleMVP4, r4, null);
                                if (catchingFishLayoutRedux2 != null) {
                                    CatchingFishGsonReduxWidget CatchingFishCoroutine2 = CatchingFishSnackbar3.CatchingFishCoroutine();
                                    CatchingFishGsonReduxWidget CatchingFishCoroutine3 = catchingFishLayoutRedux2.CatchingFishCoroutine();
                                    CatchingFishCoroutine3.CatchingFishViewModelScope = null;
                                    CatchingFishLayoutRedux CatchingFishParcelableFAB3 = CatchingFishCoroutine3.CatchingFishParcelableFAB();
                                    if (CatchingFishParcelableFAB3.CatchingFishFragmentHandler != null) {
                                        throw new IllegalArgumentException("priorResponse.body != null");
                                    }
                                    CatchingFishCoroutine2.CatchingFishFragmentHandler = CatchingFishParcelableFAB3;
                                    CatchingFishSnackbar3 = CatchingFishCoroutine2.CatchingFishParcelableFAB();
                                }
                                catchingFishLayoutRedux2 = CatchingFishSnackbar3;
                                CatchingFishWidgetContext.CatchingFishUnitTesting.getClass();
                                catchingFishFluxFluxBundle = catchingFishLayoutRedux2.CatchingFishStateLiveData;
                                catchingFishHiltMVIEspresso = catchingFishFluxFluxBundle != null ? ((CatchingFishFragmentFlux) catchingFishFluxFluxBundle.CatchingFishViewModelScope).CatchingFishViewModelFAB().CatchingFishCoroutine : null;
                                catchingFishMoshiMVP = (CatchingFishMoshiMVP) this.CatchingFishSnackbar;
                                catchingFishLayoutRedux = catchingFishLayoutRedux2.CatchingFishOkHttp;
                                catchingFishReduxBundleMVP = catchingFishLayoutRedux2.CatchingFishReduxKtor;
                                i = catchingFishLayoutRedux2.CatchingFishWorkManager;
                                str = catchingFishReduxBundleMVP.CatchingFishSnackbar;
                            } catch (IOException e) {
                                obj = null;
                                if (!CatchingFishSnackbar(e, r4, !(e instanceof CatchingFishRoomWebsocket), catchingFishReduxBundleMVP4)) {
                                    throw e;
                                }
                                r4.CatchingFishSnackbar();
                            } catch (CatchingFishToastAdMob e2) {
                                obj = null;
                                if (!CatchingFishSnackbar(e2.CatchingFishDaggerWebsocket, r4, false, catchingFishReduxBundleMVP4)) {
                                    throw e2.CatchingFishReduxKtor;
                                }
                                r4.CatchingFishSnackbar();
                            }
                            if (i == 307 || i == 308) {
                                if (!str.equals("GET")) {
                                    break;
                                }
                                if (catchingFishMoshiMVP.CatchingFishDaggerHiltFAB && (CatchingFishSnackbar = catchingFishLayoutRedux2.CatchingFishSnackbar("Location")) != null) {
                                    CatchingFishBundleView catchingFishBundleView2 = catchingFishReduxBundleMVP.CatchingFishParcelableFAB;
                                    catchingFishBundleView2.getClass();
                                    try {
                                        catchingFishViewHilt = new CatchingFishViewHilt(0);
                                        catchingFishViewHilt.CatchingFishReduxKtor(catchingFishBundleView2, CatchingFishSnackbar);
                                    } catch (IllegalArgumentException unused) {
                                        catchingFishViewHilt = null;
                                    }
                                    CatchingFishSnackbar2 = catchingFishViewHilt == null ? catchingFishViewHilt.CatchingFishSnackbar() : null;
                                    if (CatchingFishSnackbar2 != null && (CatchingFishSnackbar2.CatchingFishParcelableFAB.equals(catchingFishReduxBundleMVP.CatchingFishParcelableFAB.CatchingFishParcelableFAB) || catchingFishMoshiMVP.CatchingFishCoroutineFlow)) {
                                        CatchingFishFluxFluxBundle CatchingFishParcelableFAB4 = catchingFishReduxBundleMVP.CatchingFishParcelableFAB();
                                        if (CatchingFishAdMobFAB.CatchingFishCustomView(str)) {
                                            boolean equals = str.equals("PROPFIND");
                                            if (str.equals("PROPFIND")) {
                                                CatchingFishParcelableFAB4.CatchingFishSpannableWidget(str, null);
                                            } else {
                                                CatchingFishParcelableFAB4.CatchingFishSpannableWidget("GET", null);
                                            }
                                            if (!equals) {
                                                CatchingFishParcelableFAB4.CatchingFishCustomView("Transfer-Encoding");
                                                CatchingFishParcelableFAB4.CatchingFishCustomView("Content-Length");
                                                CatchingFishParcelableFAB4.CatchingFishCustomView("Content-Type");
                                            }
                                        }
                                        if (!CatchingFishEspressoDagger.CatchingFishOkHttp(catchingFishReduxBundleMVP.CatchingFishParcelableFAB, CatchingFishSnackbar2)) {
                                            CatchingFishParcelableFAB4.CatchingFishCustomView("Authorization");
                                        }
                                        CatchingFishParcelableFAB4.CatchingFishDaggerWebsocket = CatchingFishSnackbar2;
                                        catchingFishReduxBundleMVP4 = CatchingFishParcelableFAB4.CatchingFishDaggerWebsocket();
                                        if (catchingFishReduxBundleMVP4 != null) {
                                            return catchingFishLayoutRedux2;
                                        }
                                        CatchingFishEspressoDagger.CatchingFishSnackbar(catchingFishLayoutRedux2.CatchingFishFragmentHandler);
                                        synchronized (r4.CatchingFishSnackbar) {
                                            z3 = r4.CatchingFishFragmentHandler != null;
                                        }
                                        if (z3) {
                                            ((CatchingFishFragmentFlux) catchingFishFluxFluxBundle.CatchingFishViewModelScope).cancel();
                                            obj = null;
                                            ((CatchingFishDaggerHiltRedux) catchingFishFluxFluxBundle.CatchingFishReduxKtor).CatchingFishCoroutine(catchingFishFluxFluxBundle, true, true, null);
                                        } else {
                                            obj = null;
                                        }
                                        i3++;
                                        if (i3 > 20) {
                                            throw new ProtocolException(CatchingFishMVPLiveData.CatchingFishCloudMessaging("Too many follow-up requests: ", i3));
                                        }
                                        r10 = obj;
                                    }
                                }
                                catchingFishReduxBundleMVP4 = null;
                                if (catchingFishReduxBundleMVP4 != null) {
                                }
                            } else {
                                if (i != 401) {
                                    int i4 = Integer.MAX_VALUE;
                                    if (i == 503) {
                                        if (catchingFishLayoutRedux == null || catchingFishLayoutRedux.CatchingFishWorkManager != 503) {
                                            String CatchingFishSnackbar4 = catchingFishLayoutRedux2.CatchingFishSnackbar("Retry-After");
                                            if (CatchingFishSnackbar4 != null && CatchingFishSnackbar4.matches("\\d+")) {
                                                i4 = Integer.valueOf(CatchingFishSnackbar4).intValue();
                                                break;
                                            }
                                        }
                                    } else if (i == 407) {
                                        if ((catchingFishHiltMVIEspresso != null ? catchingFishHiltMVIEspresso.CatchingFishSnackbar : null).type() != Proxy.Type.HTTP) {
                                            throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                                        }
                                        catchingFishMoshiMVP.CatchingFishRoomDatabase.getClass();
                                    } else if (i == 408) {
                                        if (catchingFishMoshiMVP.CatchingFishSpannableWidget && (catchingFishLayoutRedux == null || catchingFishLayoutRedux.CatchingFishWorkManager != 408)) {
                                            String CatchingFishSnackbar5 = catchingFishLayoutRedux2.CatchingFishSnackbar("Retry-After");
                                            if (CatchingFishSnackbar5 != null) {
                                                if (CatchingFishSnackbar5.matches("\\d+")) {
                                                    i4 = Integer.valueOf(CatchingFishSnackbar5).intValue();
                                                    break;
                                                }
                                            } else {
                                                i4 = 0;
                                                break;
                                            }
                                        }
                                    } else {
                                        switch (i) {
                                            case 300:
                                            case 301:
                                            case 302:
                                            case 303:
                                                if (catchingFishMoshiMVP.CatchingFishDaggerHiltFAB) {
                                                    CatchingFishBundleView catchingFishBundleView22 = catchingFishReduxBundleMVP.CatchingFishParcelableFAB;
                                                    catchingFishBundleView22.getClass();
                                                    catchingFishViewHilt = new CatchingFishViewHilt(0);
                                                    catchingFishViewHilt.CatchingFishReduxKtor(catchingFishBundleView22, CatchingFishSnackbar);
                                                    if (catchingFishViewHilt == null) {
                                                    }
                                                    if (CatchingFishSnackbar2 != null) {
                                                        CatchingFishFluxFluxBundle CatchingFishParcelableFAB42 = catchingFishReduxBundleMVP.CatchingFishParcelableFAB();
                                                        if (CatchingFishAdMobFAB.CatchingFishCustomView(str)) {
                                                        }
                                                        if (!CatchingFishEspressoDagger.CatchingFishOkHttp(catchingFishReduxBundleMVP.CatchingFishParcelableFAB, CatchingFishSnackbar2)) {
                                                        }
                                                        CatchingFishParcelableFAB42.CatchingFishDaggerWebsocket = CatchingFishSnackbar2;
                                                        catchingFishReduxBundleMVP4 = CatchingFishParcelableFAB42.CatchingFishDaggerWebsocket();
                                                        break;
                                                    }
                                                    break;
                                                }
                                                break;
                                            default:
                                                catchingFishReduxBundleMVP4 = null;
                                                break;
                                        }
                                    }
                                    if (catchingFishReduxBundleMVP4 != null) {
                                    }
                                } else {
                                    catchingFishMoshiMVP.CatchingFishNavigation.getClass();
                                }
                                catchingFishReduxBundleMVP4 = null;
                                if (catchingFishReduxBundleMVP4 != null) {
                                }
                            }
                        } catch (Throwable th) {
                            r4.CatchingFishSnackbar();
                            throw th;
                        }
                    }
                    r4.CatchingFishViewModelScope = catchingFishReduxBundleMVP4;
                    CatchingFishWidgetViewModel catchingFishWidgetViewModel = r4.CatchingFishSnackbar;
                    CatchingFishBundleView catchingFishBundleView3 = catchingFishReduxBundleMVP4.CatchingFishParcelableFAB;
                    CatchingFishMoshiMVP catchingFishMoshiMVP2 = r4.CatchingFishParcelableFAB;
                    if (catchingFishBundleView3.CatchingFishParcelableFAB.equals(Constants.SCHEME)) {
                        sSLSocketFactory = catchingFishMoshiMVP2.CatchingFishOkHttp;
                        r22 = catchingFishMoshiMVP2.CatchingFishAnimationMockk;
                        r23 = catchingFishMoshiMVP2.CatchingFishStateLiveData;
                    } else {
                        sSLSocketFactory = r10;
                        SSLSocketFactory sSLSocketFactory2 = sSLSocketFactory;
                        r23 = sSLSocketFactory2;
                        r22 = sSLSocketFactory2;
                    }
                    r4.CatchingFishViewModelFAB = new CatchingFishDatabindingMVP(r4, catchingFishWidgetViewModel, new CatchingFishRoomCardView(catchingFishBundleView3.CatchingFishReduxKtor, catchingFishBundleView3.CatchingFishDaggerWebsocket, catchingFishMoshiMVP2.CatchingFishJetpackCompose, catchingFishMoshiMVP2.CatchingFishEspressoTesting, sSLSocketFactory, r22, r23, catchingFishMoshiMVP2.CatchingFishRoomDatabase, catchingFishMoshiMVP2.CatchingFishDaggerWebsocket, catchingFishMoshiMVP2.CatchingFishWorkManager, catchingFishMoshiMVP2.CatchingFishFragmentHandler), r4.CatchingFishCoroutine, r4.CatchingFishReduxKtor);
                    if (!r4.CatchingFishReduxKtor()) {
                    }
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r4 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean CatchingFishSnackbar(IOException iOException, CatchingFishDaggerHiltRedux catchingFishDaggerHiltRedux, boolean z, CatchingFishReduxBundleMVP catchingFishReduxBundleMVP) {
        boolean z2;
        if (!((CatchingFishMoshiMVP) this.CatchingFishSnackbar).CatchingFishSpannableWidget || ((z && (iOException instanceof FileNotFoundException)) || (iOException instanceof ProtocolException))) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (iOException instanceof SocketTimeoutException) {
            }
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        CatchingFishDatabindingMVP catchingFishDatabindingMVP = catchingFishDaggerHiltRedux.CatchingFishViewModelFAB;
        synchronized (catchingFishDatabindingMVP.CatchingFishCoroutine) {
            z2 = catchingFishDatabindingMVP.CatchingFishViewModelFAB;
        }
        return z2 && catchingFishDaggerHiltRedux.CatchingFishViewModelFAB.CatchingFishCoroutine();
    }
}
