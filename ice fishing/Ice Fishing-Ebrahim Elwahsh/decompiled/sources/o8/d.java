package o8;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.Log;
import e8.s;
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
import p8.h;
import p8.k;
import p8.m;
import p8.n;
import p8.o;
import r7.AbstractC4978i;

/* loaded from: classes2.dex */
public final class d extends f implements e {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f39736e;

    /* renamed from: c, reason: collision with root package name */
    public Context f39737c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f39738d;

    static {
        f39736e = Build.VERSION.SDK_INT < 29;
    }

    public d() {
        o oVar;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            oVar = new o(cls);
        } catch (Exception e6) {
            CopyOnWriteArraySet copyOnWriteArraySet = p8.c.f39837a;
            p8.c.a(s.class.getName(), 5, "unable to load android socket classes", e6);
            oVar = null;
        }
        ArrayList N8 = AbstractC4978i.N(new n[]{oVar, new m(p8.e.f39840e), new m(k.f39847a), new m(h.f39845a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = N8.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n) next).b()) {
                arrayList.add(next);
            }
        }
        this.f39738d = arrayList;
    }

    @Override // o8.e
    public final void a(Context context) {
        this.f39737c = context;
    }

    @Override // o8.e
    public final Context b() {
        return this.f39737c;
    }

    @Override // o8.f
    public final com.bumptech.glide.d c(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        kotlin.jvm.internal.h.e(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        p8.b bVar = x509TrustManagerExtensions != null ? new p8.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar != null ? bVar : super.c(trustManager);
    }

    @Override // o8.f
    public final s8.d d(X509TrustManager trustManager) {
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

    @Override // o8.f
    public final void e(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        kotlin.jvm.internal.h.e(protocols, "protocols");
        Iterator it = this.f39738d.iterator();
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

    @Override // o8.f
    public final void f(Socket socket, InetSocketAddress address, int i) {
        kotlin.jvm.internal.h.e(address, "address");
        try {
            socket.connect(address, i);
        } catch (ClassCastException e6) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e6;
            }
            throw new IOException("Exception in connect", e6);
        }
    }

    @Override // o8.f
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f39738d.iterator();
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

    @Override // o8.f
    public final boolean i(String hostname) {
        kotlin.jvm.internal.h.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // o8.f
    public final void j(int i, String message, Throwable th) {
        kotlin.jvm.internal.h.e(message, "message");
        if (i == 5) {
            Log.w("OkHttp", message, th);
        } else {
            Log.i("OkHttp", message, th);
        }
    }

    @Override // o8.f
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
