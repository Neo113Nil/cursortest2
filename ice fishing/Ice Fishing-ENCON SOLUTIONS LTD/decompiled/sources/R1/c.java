package R1;

import S1.o;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import i1.AbstractC0253j;
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

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f1745e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1746c;

    /* renamed from: d, reason: collision with root package name */
    public final S1.i f1747d;

    static {
        boolean z2 = false;
        if (m0.j.k() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f1745e = z2;
    }

    public c() {
        o oVar;
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(kotlin.jvm.internal.i.h(".OpenSSLSocketImpl", "com.android.org.conscrypt"));
            Class.forName(kotlin.jvm.internal.i.h(".OpenSSLSocketFactoryImpl", "com.android.org.conscrypt"));
            Class.forName(kotlin.jvm.internal.i.h(".SSLParametersImpl", "com.android.org.conscrypt"));
            oVar = new o(cls);
        } catch (Exception e2) {
            n.f1772a.getClass();
            n.i("unable to load android socket classes", 5, e2);
            oVar = null;
        }
        ArrayList C2 = AbstractC0253j.C(oVar, new S1.m(S1.f.f1779f), new S1.m(S1.k.f1789a), new S1.m(S1.h.f1785a));
        ArrayList arrayList = new ArrayList();
        Iterator it = C2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((S1.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f1746c = arrayList;
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
        this.f1747d = new S1.i(method3, method2, method);
    }

    @Override // R1.n
    public final l b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        S1.b bVar = x509TrustManagerExtensions != null ? new S1.b(x509TrustManager, x509TrustManagerExtensions) : null;
        return bVar == null ? new V1.a(c(x509TrustManager)) : bVar;
    }

    @Override // R1.n
    public final V1.d c(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // R1.n
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        kotlin.jvm.internal.i.e(protocols, "protocols");
        Iterator it = this.f1746c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((S1.n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        S1.n nVar = (S1.n) obj;
        if (nVar == null) {
            return;
        }
        nVar.d(sSLSocket, str, protocols);
    }

    @Override // R1.n
    public final void e(Socket socket, InetSocketAddress address, int i2) {
        kotlin.jvm.internal.i.e(address, "address");
        try {
            socket.connect(address, i2);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // R1.n
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f1746c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((S1.n) obj).a(sSLSocket)) {
                break;
            }
        }
        S1.n nVar = (S1.n) obj;
        if (nVar == null) {
            return null;
        }
        return nVar.b(sSLSocket);
    }

    @Override // R1.n
    public final Object g() {
        S1.i iVar = this.f1747d;
        iVar.getClass();
        Method method = iVar.f1786a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, null);
            Method method2 = iVar.f1787b;
            kotlin.jvm.internal.i.b(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // R1.n
    public final boolean h(String hostname) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // R1.n
    public final void j(Object obj, String message) {
        kotlin.jvm.internal.i.e(message, "message");
        S1.i iVar = this.f1747d;
        iVar.getClass();
        if (obj != null) {
            try {
                Method method = iVar.f1788c;
                kotlin.jvm.internal.i.b(method);
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(message, 5, null);
    }
}
