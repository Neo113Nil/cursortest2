package s8;

import O.D0;
import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import t8.h;
import t8.k;
import t8.m;
import t8.n;
import v7.AbstractC5128i;

/* loaded from: classes2.dex */
public final class b extends f implements e {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f40492e;

    /* renamed from: c, reason: collision with root package name */
    public Context f40493c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f40494d;

    static {
        f40492e = Build.VERSION.SDK_INT >= 29;
    }

    public b() {
        ArrayList w6 = AbstractC5128i.w(new n[]{Build.VERSION.SDK_INT >= 29 ? new t8.a() : null, new m(t8.e.f40929e), new m(k.f40937a), new m(h.f40935a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = w6.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n) next).b()) {
                arrayList.add(next);
            }
        }
        this.f40494d = arrayList;
    }

    @Override // s8.e
    public final void a(Context context) {
        this.f40493c = context;
    }

    @Override // s8.e
    public final Context b() {
        return this.f40493c;
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(trustManager);
    }

    @Override // s8.f
    public final void e(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        kotlin.jvm.internal.h.e(protocols, "protocols");
        Iterator it = this.f40494d.iterator();
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
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f40494d.iterator();
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
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard i = D0.i();
        i.open("response.body().close()");
        return i;
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
            boolean z3 = d.f40497e;
            Log.w("OkHttp", message, th);
        } else {
            boolean z6 = d.f40497e;
            Log.i("OkHttp", message, th);
        }
    }

    @Override // s8.f
    public final void k(Object obj, String message) {
        kotlin.jvm.internal.h.e(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, message);
        } else {
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            a.b(obj).warnIfOpen();
        }
    }

    @Override // s8.f
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
