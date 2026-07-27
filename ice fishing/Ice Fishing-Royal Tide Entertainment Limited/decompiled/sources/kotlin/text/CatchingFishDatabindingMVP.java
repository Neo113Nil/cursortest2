package kotlin.text;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class CatchingFishDatabindingMVP {
    public final CatchingFishWidgetViewModel CatchingFishCoroutine;
    public CatchingFishRoomManifest CatchingFishDaggerWebsocket;
    public CatchingFishHiltMVIEspresso CatchingFishLayout;
    public final CatchingFishDaggerHiltRedux CatchingFishParcelableFAB;
    public final CatchingFishWidgetContext CatchingFishReduxKtor;
    public final CatchingFishRoomCardView CatchingFishSnackbar;
    public boolean CatchingFishViewModelFAB;
    public CatchingFishAdMobGson CatchingFishViewModelScope;
    public final CatchingFishKtorReduxBundle CatchingFishWorkManager;

    public CatchingFishDatabindingMVP(CatchingFishDaggerHiltRedux catchingFishDaggerHiltRedux, CatchingFishWidgetViewModel catchingFishWidgetViewModel, CatchingFishRoomCardView catchingFishRoomCardView, CatchingFishDaggerWebSocket catchingFishDaggerWebSocket, CatchingFishWidgetContext catchingFishWidgetContext) {
        this.CatchingFishParcelableFAB = catchingFishDaggerHiltRedux;
        this.CatchingFishCoroutine = catchingFishWidgetViewModel;
        this.CatchingFishSnackbar = catchingFishRoomCardView;
        this.CatchingFishReduxKtor = catchingFishWidgetContext;
        CatchingFishEspressoPayPal catchingFishEspressoPayPal = catchingFishWidgetViewModel.CatchingFishDaggerWebsocket;
        CatchingFishKtorReduxBundle catchingFishKtorReduxBundle = new CatchingFishKtorReduxBundle();
        List list = Collections.EMPTY_LIST;
        catchingFishKtorReduxBundle.CatchingFishDaggerWebsocket = list;
        catchingFishKtorReduxBundle.CatchingFishWorkManager = list;
        catchingFishKtorReduxBundle.CatchingFishViewModelScope = new ArrayList();
        catchingFishKtorReduxBundle.CatchingFishSnackbar = catchingFishRoomCardView;
        catchingFishKtorReduxBundle.CatchingFishCoroutine = catchingFishEspressoPayPal;
        catchingFishKtorReduxBundle.CatchingFishReduxKtor = catchingFishWidgetContext;
        List<Proxy> select = catchingFishRoomCardView.CatchingFishViewModelScope.select(catchingFishRoomCardView.CatchingFishParcelableFAB.CatchingFishEspressoTesting());
        catchingFishKtorReduxBundle.CatchingFishDaggerWebsocket = (select == null || select.isEmpty()) ? CatchingFishEspressoDagger.CatchingFishLayout(Proxy.NO_PROXY) : Collections.unmodifiableList(new ArrayList(select));
        catchingFishKtorReduxBundle.CatchingFishParcelableFAB = 0;
        this.CatchingFishWorkManager = catchingFishKtorReduxBundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if ((r1.CatchingFishReduxKtor < ((java.util.ArrayList) r1.CatchingFishDaggerWebsocket).size()) == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0050 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishCoroutine() {
        boolean z;
        synchronized (this.CatchingFishCoroutine) {
            try {
                boolean z2 = true;
                if (this.CatchingFishLayout != null) {
                    return true;
                }
                if (CatchingFishReduxKtor()) {
                    this.CatchingFishLayout = this.CatchingFishParcelableFAB.CatchingFishLayout.CatchingFishCoroutine;
                    return true;
                }
                CatchingFishRoomManifest catchingFishRoomManifest = this.CatchingFishDaggerWebsocket;
                if (catchingFishRoomManifest != null) {
                }
                CatchingFishKtorReduxBundle catchingFishKtorReduxBundle = this.CatchingFishWorkManager;
                if (catchingFishKtorReduxBundle.CatchingFishParcelableFAB >= ((List) catchingFishKtorReduxBundle.CatchingFishDaggerWebsocket).size() && ((ArrayList) catchingFishKtorReduxBundle.CatchingFishViewModelScope).isEmpty()) {
                    z = false;
                    if (z) {
                        z2 = false;
                    }
                    return z2;
                }
                z = true;
                if (z) {
                }
                return z2;
            } finally {
            }
        }
    }

    public final CatchingFishAdMobGson CatchingFishParcelableFAB(int i, int i2, int i3, boolean z) {
        CatchingFishAdMobGson catchingFishAdMobGson;
        Socket socket;
        Socket CatchingFishViewModelScope;
        CatchingFishAdMobGson catchingFishAdMobGson2;
        int i4;
        boolean z2;
        CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso;
        boolean z3;
        ArrayList arrayList;
        CatchingFishAdMobGson catchingFishAdMobGson3;
        CatchingFishRoomManifest catchingFishRoomManifest;
        String str;
        int i5;
        boolean contains;
        synchronized (this.CatchingFishCoroutine) {
            try {
                if (this.CatchingFishParcelableFAB.CatchingFishReduxKtor()) {
                    throw new IOException("Canceled");
                }
                this.CatchingFishViewModelFAB = false;
                CatchingFishDaggerHiltRedux catchingFishDaggerHiltRedux = this.CatchingFishParcelableFAB;
                catchingFishAdMobGson = catchingFishDaggerHiltRedux.CatchingFishLayout;
                socket = null;
                CatchingFishViewModelScope = (catchingFishAdMobGson == null || !catchingFishAdMobGson.CatchingFishCloudMessaging) ? null : catchingFishDaggerHiltRedux.CatchingFishViewModelScope();
                CatchingFishDaggerHiltRedux catchingFishDaggerHiltRedux2 = this.CatchingFishParcelableFAB;
                catchingFishAdMobGson2 = catchingFishDaggerHiltRedux2.CatchingFishLayout;
                if (catchingFishAdMobGson2 != null) {
                    catchingFishAdMobGson = null;
                } else {
                    catchingFishAdMobGson2 = null;
                }
                i4 = 1;
                if (catchingFishAdMobGson2 == null) {
                    if (this.CatchingFishCoroutine.CatchingFishCoroutine(this.CatchingFishSnackbar, catchingFishDaggerHiltRedux2, null, false)) {
                        catchingFishAdMobGson2 = this.CatchingFishParcelableFAB.CatchingFishLayout;
                        catchingFishHiltMVIEspresso = null;
                        z2 = true;
                    } else {
                        catchingFishHiltMVIEspresso = this.CatchingFishLayout;
                        if (catchingFishHiltMVIEspresso != null) {
                            this.CatchingFishLayout = null;
                        } else if (CatchingFishReduxKtor()) {
                            catchingFishHiltMVIEspresso = this.CatchingFishParcelableFAB.CatchingFishLayout.CatchingFishCoroutine;
                        }
                        z2 = false;
                    }
                }
                z2 = false;
                catchingFishHiltMVIEspresso = null;
            } finally {
            }
        }
        CatchingFishEspressoDagger.CatchingFishCoroutine(CatchingFishViewModelScope);
        if (catchingFishAdMobGson != null) {
            this.CatchingFishReduxKtor.getClass();
        }
        if (z2) {
            this.CatchingFishReduxKtor.getClass();
        }
        if (catchingFishAdMobGson2 != null) {
            return catchingFishAdMobGson2;
        }
        if (catchingFishHiltMVIEspresso != null || ((catchingFishRoomManifest = this.CatchingFishDaggerWebsocket) != null && catchingFishRoomManifest.CatchingFishReduxKtor < ((ArrayList) catchingFishRoomManifest.CatchingFishDaggerWebsocket).size())) {
            z3 = false;
        } else {
            CatchingFishKtorReduxBundle catchingFishKtorReduxBundle = this.CatchingFishWorkManager;
            if (catchingFishKtorReduxBundle.CatchingFishParcelableFAB >= ((List) catchingFishKtorReduxBundle.CatchingFishDaggerWebsocket).size() && ((ArrayList) catchingFishKtorReduxBundle.CatchingFishViewModelScope).isEmpty()) {
                throw new NoSuchElementException();
            }
            ArrayList arrayList2 = new ArrayList();
            while (catchingFishKtorReduxBundle.CatchingFishParcelableFAB < ((List) catchingFishKtorReduxBundle.CatchingFishDaggerWebsocket).size()) {
                CatchingFishRoomCardView catchingFishRoomCardView = (CatchingFishRoomCardView) catchingFishKtorReduxBundle.CatchingFishSnackbar;
                if (catchingFishKtorReduxBundle.CatchingFishParcelableFAB >= ((List) catchingFishKtorReduxBundle.CatchingFishDaggerWebsocket).size()) {
                    throw new SocketException("No route to " + catchingFishRoomCardView.CatchingFishParcelableFAB.CatchingFishReduxKtor + "; exhausted proxy configurations: " + ((List) catchingFishKtorReduxBundle.CatchingFishDaggerWebsocket));
                }
                List list = (List) catchingFishKtorReduxBundle.CatchingFishDaggerWebsocket;
                int i6 = catchingFishKtorReduxBundle.CatchingFishParcelableFAB;
                catchingFishKtorReduxBundle.CatchingFishParcelableFAB = i6 + 1;
                Proxy proxy = (Proxy) list.get(i6);
                CatchingFishWidgetContext catchingFishWidgetContext = (CatchingFishWidgetContext) catchingFishKtorReduxBundle.CatchingFishReduxKtor;
                catchingFishKtorReduxBundle.CatchingFishWorkManager = new ArrayList();
                if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                    CatchingFishBundleView catchingFishBundleView = catchingFishRoomCardView.CatchingFishParcelableFAB;
                    str = catchingFishBundleView.CatchingFishReduxKtor;
                    i5 = catchingFishBundleView.CatchingFishDaggerWebsocket;
                } else {
                    SocketAddress address = proxy.address();
                    if (!(address instanceof InetSocketAddress)) {
                        throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address.getClass());
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    InetAddress address2 = inetSocketAddress.getAddress();
                    str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                    i5 = inetSocketAddress.getPort();
                }
                if (i5 < i4 || i5 > 65535) {
                    throw new SocketException("No route to " + str + ":" + i5 + "; port is out of range");
                }
                if (proxy.type() == Proxy.Type.SOCKS) {
                    ((List) catchingFishKtorReduxBundle.CatchingFishWorkManager).add(InetSocketAddress.createUnresolved(str, i5));
                } else {
                    catchingFishWidgetContext.getClass();
                    catchingFishRoomCardView.CatchingFishSnackbar.getClass();
                    if (str == null) {
                        throw new UnknownHostException("hostname == null");
                    }
                    try {
                        List asList = Arrays.asList(InetAddress.getAllByName(str));
                        if (asList.isEmpty()) {
                            throw new UnknownHostException(catchingFishRoomCardView.CatchingFishSnackbar + " returned no addresses for " + str);
                        }
                        int size = asList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            ((List) catchingFishKtorReduxBundle.CatchingFishWorkManager).add(new InetSocketAddress((InetAddress) asList.get(i7), i5));
                        }
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                int size2 = ((List) catchingFishKtorReduxBundle.CatchingFishWorkManager).size();
                for (int i8 = 0; i8 < size2; i8++) {
                    CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso2 = new CatchingFishHiltMVIEspresso((CatchingFishRoomCardView) catchingFishKtorReduxBundle.CatchingFishSnackbar, proxy, (InetSocketAddress) ((List) catchingFishKtorReduxBundle.CatchingFishWorkManager).get(i8));
                    CatchingFishEspressoPayPal catchingFishEspressoPayPal = (CatchingFishEspressoPayPal) catchingFishKtorReduxBundle.CatchingFishCoroutine;
                    synchronized (catchingFishEspressoPayPal) {
                        contains = ((LinkedHashSet) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket).contains(catchingFishHiltMVIEspresso2);
                    }
                    if (contains) {
                        ((ArrayList) catchingFishKtorReduxBundle.CatchingFishViewModelScope).add(catchingFishHiltMVIEspresso2);
                    } else {
                        arrayList2.add(catchingFishHiltMVIEspresso2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    break;
                }
                i4 = 1;
            }
            if (arrayList2.isEmpty()) {
                arrayList2.addAll((ArrayList) catchingFishKtorReduxBundle.CatchingFishViewModelScope);
                ((ArrayList) catchingFishKtorReduxBundle.CatchingFishViewModelScope).clear();
            }
            this.CatchingFishDaggerWebsocket = new CatchingFishRoomManifest(arrayList2);
            z3 = true;
        }
        synchronized (this.CatchingFishCoroutine) {
            try {
                if (this.CatchingFishParcelableFAB.CatchingFishReduxKtor()) {
                    throw new IOException("Canceled");
                }
                if (z3) {
                    CatchingFishRoomManifest catchingFishRoomManifest2 = this.CatchingFishDaggerWebsocket;
                    catchingFishRoomManifest2.getClass();
                    arrayList = new ArrayList((ArrayList) catchingFishRoomManifest2.CatchingFishDaggerWebsocket);
                    if (this.CatchingFishCoroutine.CatchingFishCoroutine(this.CatchingFishSnackbar, this.CatchingFishParcelableFAB, arrayList, false)) {
                        catchingFishAdMobGson2 = this.CatchingFishParcelableFAB.CatchingFishLayout;
                        z2 = true;
                    }
                } else {
                    arrayList = null;
                }
                if (!z2) {
                    if (catchingFishHiltMVIEspresso == null) {
                        CatchingFishRoomManifest catchingFishRoomManifest3 = this.CatchingFishDaggerWebsocket;
                        if (!(catchingFishRoomManifest3.CatchingFishReduxKtor < ((ArrayList) catchingFishRoomManifest3.CatchingFishDaggerWebsocket).size())) {
                            throw new NoSuchElementException();
                        }
                        ArrayList arrayList3 = (ArrayList) catchingFishRoomManifest3.CatchingFishDaggerWebsocket;
                        int i9 = catchingFishRoomManifest3.CatchingFishReduxKtor;
                        catchingFishRoomManifest3.CatchingFishReduxKtor = i9 + 1;
                        catchingFishHiltMVIEspresso = (CatchingFishHiltMVIEspresso) arrayList3.get(i9);
                    }
                    catchingFishAdMobGson2 = new CatchingFishAdMobGson(this.CatchingFishCoroutine, catchingFishHiltMVIEspresso);
                    this.CatchingFishViewModelScope = catchingFishAdMobGson2;
                }
                catchingFishAdMobGson3 = catchingFishAdMobGson2;
            } finally {
            }
        }
        if (z2) {
            this.CatchingFishReduxKtor.getClass();
            return catchingFishAdMobGson3;
        }
        catchingFishAdMobGson3.CatchingFishCoroutine(i, i2, i3, z, this.CatchingFishReduxKtor);
        this.CatchingFishCoroutine.CatchingFishDaggerWebsocket.CatchingFishViewModelScope(catchingFishAdMobGson3.CatchingFishCoroutine);
        synchronized (this.CatchingFishCoroutine) {
            try {
                this.CatchingFishViewModelScope = null;
                if (this.CatchingFishCoroutine.CatchingFishCoroutine(this.CatchingFishSnackbar, this.CatchingFishParcelableFAB, arrayList, true)) {
                    catchingFishAdMobGson3.CatchingFishCloudMessaging = true;
                    socket = catchingFishAdMobGson3.CatchingFishDaggerWebsocket;
                    catchingFishAdMobGson3 = this.CatchingFishParcelableFAB.CatchingFishLayout;
                    this.CatchingFishLayout = catchingFishHiltMVIEspresso;
                } else {
                    CatchingFishWidgetViewModel catchingFishWidgetViewModel = this.CatchingFishCoroutine;
                    if (!catchingFishWidgetViewModel.CatchingFishWorkManager) {
                        catchingFishWidgetViewModel.CatchingFishWorkManager = true;
                        CatchingFishWidgetViewModel.CatchingFishViewModelScope.execute(catchingFishWidgetViewModel.CatchingFishCoroutine);
                    }
                    catchingFishWidgetViewModel.CatchingFishReduxKtor.add(catchingFishAdMobGson3);
                    CatchingFishDaggerHiltRedux catchingFishDaggerHiltRedux3 = this.CatchingFishParcelableFAB;
                    if (catchingFishDaggerHiltRedux3.CatchingFishLayout != null) {
                        throw new IllegalStateException();
                    }
                    catchingFishDaggerHiltRedux3.CatchingFishLayout = catchingFishAdMobGson3;
                    catchingFishAdMobGson3.CatchingFishStateLiveData.add(new CatchingFishPayPalKtor(catchingFishDaggerHiltRedux3, catchingFishDaggerHiltRedux3.CatchingFishWorkManager));
                }
            } finally {
            }
        }
        CatchingFishEspressoDagger.CatchingFishCoroutine(socket);
        this.CatchingFishReduxKtor.getClass();
        return catchingFishAdMobGson3;
    }

    public final boolean CatchingFishReduxKtor() {
        CatchingFishAdMobGson catchingFishAdMobGson = this.CatchingFishParcelableFAB.CatchingFishLayout;
        return catchingFishAdMobGson != null && catchingFishAdMobGson.CatchingFishEspressoTesting == 0 && CatchingFishEspressoDagger.CatchingFishOkHttp(catchingFishAdMobGson.CatchingFishCoroutine.CatchingFishParcelableFAB.CatchingFishParcelableFAB, this.CatchingFishSnackbar.CatchingFishParcelableFAB);
    }

    public final CatchingFishAdMobGson CatchingFishSnackbar(int i, int i2, int i3, boolean z, boolean z2) {
        CatchingFishAdMobGson CatchingFishParcelableFAB;
        while (true) {
            CatchingFishParcelableFAB = CatchingFishParcelableFAB(i, i2, i3, z);
            synchronized (this.CatchingFishCoroutine) {
                try {
                    if (CatchingFishParcelableFAB.CatchingFishOkHttp == 0) {
                        if (!(CatchingFishParcelableFAB.CatchingFishViewModelFAB != null)) {
                            break;
                        }
                    }
                    if (!CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.isClosed() && !CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.isInputShutdown() && !CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.isOutputShutdown()) {
                        CatchingFishSharedFlowMoshi catchingFishSharedFlowMoshi = CatchingFishParcelableFAB.CatchingFishViewModelFAB;
                        if (catchingFishSharedFlowMoshi == null) {
                            if (!z2) {
                                break;
                            }
                            try {
                                int soTimeout = CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.getSoTimeout();
                                try {
                                    CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.setSoTimeout(1);
                                    if (!CatchingFishParcelableFAB.CatchingFishLayout.CatchingFishSnackbar()) {
                                        CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.setSoTimeout(soTimeout);
                                        break;
                                    }
                                    CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.setSoTimeout(soTimeout);
                                } catch (Throwable th) {
                                    CatchingFishParcelableFAB.CatchingFishDaggerWebsocket.setSoTimeout(soTimeout);
                                    throw th;
                                }
                            } catch (SocketTimeoutException unused) {
                            } catch (IOException unused2) {
                                continue;
                            }
                        } else {
                            long nanoTime = System.nanoTime();
                            synchronized (catchingFishSharedFlowMoshi) {
                                if (!catchingFishSharedFlowMoshi.CatchingFishFragmentHandler) {
                                    if (catchingFishSharedFlowMoshi.CatchingFishStateLiveData >= catchingFishSharedFlowMoshi.CatchingFishAnimationMockk || nanoTime < catchingFishSharedFlowMoshi.CatchingFishRoomDatabase) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    CatchingFishParcelableFAB.CatchingFishViewModelFAB();
                } finally {
                }
            }
        }
        return CatchingFishParcelableFAB;
    }
}
