package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes5.dex */
public final class rh0 extends otk {
    public static final boolean e;
    public final ArrayList c;
    public final bq4 d;

    static {
        boolean z = false;
        if (itk.n() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public rh0() {
        zar zarVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            zarVar = new zar(cls);
        } catch (Exception e2) {
            otk.a.getClass();
            otk.i(5, "unable to load android socket classes", e2);
            zarVar = null;
        }
        List w = xz0.w(new y2r[]{zarVar, new su7(wi0.f), new su7(f86.a), new su7(eg3.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : w) {
            if (((y2r) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new bq4(method3, method2, method);
    }

    @Override // defpackage.otk
    public final irf b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        x509TrustManager.getClass();
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        wd0 wd0Var = x509TrustManagerExtensions != null ? new wd0(x509TrustManager, x509TrustManagerExtensions) : null;
        return wd0Var != null ? wd0Var : super.b(x509TrustManager);
    }

    @Override // defpackage.otk
    public final xat c(X509TrustManager x509TrustManager) {
        x509TrustManager.getClass();
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new qh0(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.otk
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        list.getClass();
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((y2r) obj).b(sSLSocket)) {
                    break;
                }
            }
        }
        y2r y2rVar = (y2r) obj;
        if (y2rVar != null) {
            y2rVar.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.otk
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        inetSocketAddress.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // defpackage.otk
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((y2r) obj).b(sSLSocket)) {
                break;
            }
        }
        y2r y2rVar = (y2r) obj;
        if (y2rVar != null) {
            return y2rVar.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.otk
    public final Object g() {
        bq4 bq4Var = this.d;
        bq4Var.getClass();
        Method method = bq4Var.a;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, null);
                Method method2 = bq4Var.b;
                method2.getClass();
                method2.invoke(invoke, "response.body().close()");
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // defpackage.otk
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.otk
    public final void k(Object obj, String str) {
        bq4 bq4Var = this.d;
        bq4Var.getClass();
        if (obj != null) {
            try {
                Method method = bq4Var.c;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        otk.j(this, str, 4);
    }
}
