package kotlin.text;

import android.os.Build;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.AccessControlException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class CatchingFishCoroutineRoom {
    public static final CatchingFishCoroutineRoom CatchingFishParcelableFAB;
    public static final Logger CatchingFishSnackbar;

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a7, code lost:
    
        if (r1 != null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    static {
        String str;
        CatchingFishHiltOkHttpGlide catchingFishHiltOkHttpGlide;
        CatchingFishCoroutineRoom catchingFishCoroutineRoom;
        CatchingFishContextKtor CatchingFishAnimationMockk;
        int i = 0;
        CatchingFishCoroutineRoom catchingFishCoroutineRoom2 = null;
        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
            if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                try {
                    try {
                        i = Build.VERSION.SDK_INT;
                    } catch (NoClassDefFoundError unused) {
                    }
                } catch (ReflectiveOperationException unused2) {
                }
                if (i >= 29) {
                    Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                    catchingFishCoroutineRoom = new CatchingFishMVPGsonRealm(null, null, null, null, null);
                    if (catchingFishCoroutineRoom == null) {
                        if ("Dalvik".equals(System.getProperty("java.vm.name"))) {
                            try {
                                Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                                Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
                                try {
                                    catchingFishCoroutineRoom2 = new CatchingFishAnimationGlide(cls, cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls.getMethod("setHostname", String.class), cls.getMethod("getAlpnSelectedProtocol", null), cls.getMethod("setAlpnProtocols", byte[].class));
                                } catch (NoSuchMethodException unused3) {
                                    throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
                                }
                            } catch (ClassNotFoundException unused4) {
                            }
                        }
                        if (catchingFishCoroutineRoom2 == null) {
                            throw new NullPointerException("No platform found on Android");
                        }
                        catchingFishCoroutineRoom = catchingFishCoroutineRoom2;
                    }
                    CatchingFishParcelableFAB = catchingFishCoroutineRoom;
                    CatchingFishSnackbar = Logger.getLogger(CatchingFishMoshiMVP.class.getName());
                }
            }
            catchingFishCoroutineRoom = null;
            if (catchingFishCoroutineRoom == null) {
            }
            CatchingFishParcelableFAB = catchingFishCoroutineRoom;
            CatchingFishSnackbar = Logger.getLogger(CatchingFishMoshiMVP.class.getName());
        }
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        try {
            str = System.getProperty("okhttp.platform");
        } catch (AccessControlException unused5) {
        }
        str = null;
        if (!("conscrypt".equals(str) ? true : "Conscrypt".equals(Security.getProviders()[0].getName())) || (CatchingFishAnimationMockk = CatchingFishContextKtor.CatchingFishAnimationMockk()) == null) {
            try {
                catchingFishHiltOkHttpGlide = new CatchingFishHiltOkHttpGlide(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
            } catch (NoSuchMethodException unused6) {
                catchingFishHiltOkHttpGlide = null;
            }
            if (catchingFishHiltOkHttpGlide == null) {
                catchingFishCoroutineRoom = catchingFishHiltOkHttpGlide;
            } else {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    catchingFishCoroutineRoom2 = new CatchingFishMVIAsyncTask(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                } catch (ClassNotFoundException | NoSuchMethodException unused7) {
                }
                if (catchingFishCoroutineRoom2 == null) {
                    catchingFishCoroutineRoom = new CatchingFishCoroutineRoom();
                }
                catchingFishCoroutineRoom = catchingFishCoroutineRoom2;
            }
        } else {
            catchingFishCoroutineRoom = CatchingFishAnimationMockk;
        }
        CatchingFishParcelableFAB = catchingFishCoroutineRoom;
        CatchingFishSnackbar = Logger.getLogger(CatchingFishMoshiMVP.class.getName());
        if (catchingFishHiltOkHttpGlide == null) {
        }
        CatchingFishParcelableFAB = catchingFishCoroutineRoom;
        CatchingFishSnackbar = Logger.getLogger(CatchingFishMoshiMVP.class.getName());
        if (catchingFishCoroutineRoom2 == null) {
        }
        catchingFishCoroutineRoom = catchingFishCoroutineRoom2;
        CatchingFishParcelableFAB = catchingFishCoroutineRoom;
        CatchingFishSnackbar = Logger.getLogger(CatchingFishMoshiMVP.class.getName());
    }

    public static byte[] CatchingFishDaggerWebsocket(List list) {
        CatchingFishWidgetGradle catchingFishWidgetGradle = new CatchingFishWidgetGradle();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            CatchingFishServicePicasso catchingFishServicePicasso = (CatchingFishServicePicasso) list.get(i);
            if (catchingFishServicePicasso != CatchingFishServicePicasso.HTTP_1_0) {
                catchingFishWidgetGradle.CatchingFishCardViewView(catchingFishServicePicasso.CatchingFishReduxKtor.length());
                catchingFishWidgetGradle.CatchingFishMutableLiveData(catchingFishServicePicasso.CatchingFishReduxKtor);
            }
        }
        return catchingFishWidgetGradle.CatchingFishOkHttp(catchingFishWidgetGradle.CatchingFishDaggerWebsocket);
    }

    public static ArrayList CatchingFishSnackbar(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            CatchingFishServicePicasso catchingFishServicePicasso = (CatchingFishServicePicasso) list.get(i);
            if (catchingFishServicePicasso != CatchingFishServicePicasso.HTTP_1_0) {
                arrayList.add(catchingFishServicePicasso.CatchingFishReduxKtor);
            }
        }
        return arrayList;
    }

    public Object CatchingFishCloudMessaging() {
        if (CatchingFishSnackbar.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public CatchingFishGsonCardView CatchingFishCoroutine(X509TrustManager x509TrustManager) {
        return new CatchingFishRoomWorkManager(CatchingFishReduxKtor(x509TrustManager));
    }

    public boolean CatchingFishEspressoTesting(String str) {
        return true;
    }

    public String CatchingFishFragmentHandler(SSLSocket sSLSocket) {
        return null;
    }

    public SSLContext CatchingFishLayout() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public void CatchingFishOkHttp(int i, String str, Throwable th) {
        CatchingFishSnackbar.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public CatchingFishRealmEspresso CatchingFishReduxKtor(X509TrustManager x509TrustManager) {
        return new CatchingFishRoomUnitTesting(x509TrustManager.getAcceptedIssuers());
    }

    public void CatchingFishUnitTesting(Object obj, String str) {
        if (obj == null) {
            str = CatchingFishMVPLiveData.CatchingFishEspressoTesting(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        CatchingFishOkHttp(5, str, (Throwable) obj);
    }

    public void CatchingFishViewModelFAB(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }

    public void CatchingFishParcelableFAB(SSLSocket sSLSocket) {
    }

    public void CatchingFishWorkManager(SSLSocketFactory sSLSocketFactory) {
    }

    public void CatchingFishViewModelScope(SSLSocket sSLSocket, String str, List list) {
    }
}
