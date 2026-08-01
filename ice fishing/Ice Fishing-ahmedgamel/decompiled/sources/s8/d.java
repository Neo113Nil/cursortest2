package s8;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import i8.r;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import t8.h;
import t8.k;
import t8.m;
import t8.n;
import t8.o;
import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class d extends f implements e {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f40497e;

    /* renamed from: c, reason: collision with root package name */
    public Context f40498c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f40499d;

    static {
        f40497e = Build.VERSION.SDK_INT < 29;
    }

    public d() {
        o oVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e9) {
            CopyOnWriteArraySet copyOnWriteArraySet = t8.c.f40926a;
            t8.c.a(r.class.getName(), 5, "unable to load android socket classes", e9);
            oVar = null;
        }
        ArrayList w6 = AbstractC5128i.w(new n[]{oVar, new m(t8.e.f40929e), new m(k.f40937a), new m(h.f40935a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = w6.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n) next).b()) {
                arrayList.add(next);
            }
        }
        this.f40499d = arrayList;
    }

    @Override // s8.e
    public final void a(Context context) {
        this.f40498c = context;
    }

    @Override // s8.e
    public final Context b() {
        return this.f40498c;
    }

    @Override // s8.f
    public final com.bumptech.glide.e c(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        kotlin.jvm.internal.h.e(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        t8.b bVar = x509TrustManagerExtensions != null ? new t8.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.c(trustManager);
    }

    @Override // s8.f
    public final w8.d d(X509TrustManager trustManager) {
        kotlin.jvm.internal.h.e(trustManager, "trustManager");
        try {
            StrictMode.noteSlowCall("buildTrustRootIndex");
            Method declaredMethod = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(trustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // s8.f
    public final void e(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        kotlin.jvm.internal.h.e(protocols, "protocols");
        Iterator it = this.f40499d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((n) obj).a(sSLSocket)) {
                    break;
                }
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            nVar.d(sSLSocket, str, protocols);
        }
    }

    @Override // s8.f
    public final void f(Socket socket, InetSocketAddress address, int i) {
        kotlin.jvm.internal.h.e(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e9) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e9;
            }
            throw new IOException("Exception in connect", e9);
        }
    }

    @Override // s8.f
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f40499d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((n) obj).a(sSLSocket)) {
                break;
            }
        }
        n nVar = (n) obj;
        if (nVar != null) {
            return nVar.c(sSLSocket);
        }
        return null;
    }

    @Override // s8.f
    public final boolean i(String hostname) {
        kotlin.jvm.internal.h.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // s8.f
    public final void j(int i, String message, Throwable th) {
        kotlin.jvm.internal.h.e(message, "message");
        if (i == 5) {
            Log.w("OkHttp", message, th);
        } else {
            Log.i("OkHttp", message, th);
        }
    }

    @Override // s8.f
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
