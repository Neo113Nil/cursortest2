package kotlin.text;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public class CatchingFishAnimationGlide extends CatchingFishCoroutineRoom {
    public final Class CatchingFishCoroutine;
    public final Method CatchingFishDaggerWebsocket;
    public final Method CatchingFishReduxKtor;
    public final CatchingFishGlideJUnitFAB CatchingFishViewModelFAB;
    public final Method CatchingFishViewModelScope;
    public final Method CatchingFishWorkManager;

    public CatchingFishAnimationGlide(Class cls, Method method, Method method2, Method method3, Method method4) {
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method8 = cls2.getMethod("get", null);
            method6 = cls2.getMethod("open", String.class);
            method5 = cls2.getMethod("warnIfOpen", null);
            method7 = method8;
        } catch (Exception unused) {
            method5 = null;
            method6 = null;
        }
        this.CatchingFishViewModelFAB = new CatchingFishGlideJUnitFAB(method7, method6, method5);
        this.CatchingFishCoroutine = cls;
        this.CatchingFishReduxKtor = method;
        this.CatchingFishDaggerWebsocket = method2;
        this.CatchingFishWorkManager = method3;
        this.CatchingFishViewModelScope = method4;
    }

    public static boolean CatchingFishAnimationMockk(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final Object CatchingFishCloudMessaging() {
        CatchingFishGlideJUnitFAB catchingFishGlideJUnitFAB = this.CatchingFishViewModelFAB;
        Method method = catchingFishGlideJUnitFAB.CatchingFishParcelableFAB;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                catchingFishGlideJUnitFAB.CatchingFishSnackbar.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final CatchingFishGsonCardView CatchingFishCoroutine(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new CatchingFishLayoutXMLLayout(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.CatchingFishCoroutine(x509TrustManager);
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final boolean CatchingFishEspressoTesting(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return CatchingFishAnimationMockk(str, cls, cls.getMethod("getInstance", null).invoke(null, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public String CatchingFishFragmentHandler(SSLSocket sSLSocket) {
        if (this.CatchingFishCoroutine.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.CatchingFishWorkManager.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }
        return null;
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final SSLContext CatchingFishLayout() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final void CatchingFishOkHttp(int i, String str, Throwable th) {
        int min;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int indexOf = str.indexOf(10, i2);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i2 + 4000);
                str.substring(i2, min);
                if (min >= indexOf) {
                    break;
                } else {
                    i2 = min;
                }
            }
            i2 = min + 1;
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final CatchingFishRealmEspresso CatchingFishReduxKtor(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new CatchingFishRoomService(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.CatchingFishReduxKtor(x509TrustManager);
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final void CatchingFishUnitTesting(Object obj, String str) {
        CatchingFishGlideJUnitFAB catchingFishGlideJUnitFAB = this.CatchingFishViewModelFAB;
        catchingFishGlideJUnitFAB.getClass();
        if (obj != null) {
            try {
                catchingFishGlideJUnitFAB.CatchingFishCoroutine.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        CatchingFishOkHttp(5, str, null);
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public final void CatchingFishViewModelFAB(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!CatchingFishEspressoDagger.CatchingFishCloudMessaging(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // kotlin.text.CatchingFishCoroutineRoom
    public void CatchingFishViewModelScope(SSLSocket sSLSocket, String str, List list) {
        if (this.CatchingFishCoroutine.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.CatchingFishReduxKtor.invoke(sSLSocket, Boolean.TRUE);
                    this.CatchingFishDaggerWebsocket.invoke(sSLSocket, str);
                } catch (IllegalAccessException e) {
                    e = e;
                    throw new AssertionError(e);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw new AssertionError(e);
                }
            }
            this.CatchingFishViewModelScope.invoke(sSLSocket, CatchingFishCoroutineRoom.CatchingFishDaggerWebsocket(list));
        }
    }
}
