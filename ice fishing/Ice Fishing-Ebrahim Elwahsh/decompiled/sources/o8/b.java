package o8;

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
import p8.h;
import p8.k;
import p8.m;
import p8.n;
import r7.AbstractC4978i;

/* loaded from: classes2.dex */
public final class b extends f implements e {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f39731e;

    /* renamed from: c, reason: collision with root package name */
    public Context f39732c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f39733d;

    static {
        f39731e = Build.VERSION.SDK_INT >= 29;
    }

    public b() {
        ArrayList N8 = AbstractC4978i.N(new n[]{Build.VERSION.SDK_INT >= 29 ? new p8.a() : null, new m(p8.e.f39840e), new m(k.f39847a), new m(h.f39845a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = N8.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((n) next).b()) {
                arrayList.add(next);
            }
        }
        this.f39733d = arrayList;
    }

    @Override // o8.e
    public final void a(Context context) {
        this.f39732c = context;
    }

    @Override // o8.e
    public final Context b() {
        return this.f39732c;
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
        StrictMode.noteSlowCall("buildTrustRootIndex");
        return super.d(trustManager);
    }

    @Override // o8.f
    public final void e(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        kotlin.jvm.internal.h.e(protocols, "protocols");
        Iterator it = this.f39733d.iterator();
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
    public final String g(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f39733d.iterator();
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
    public final Object h() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.h();
        }
        CloseGuard i = D0.i();
        i.open("response.body().close()");
        return i;
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
            boolean z8 = d.f39736e;
            Log.w("OkHttp", message, th);
        } else {
            boolean z9 = d.f39736e;
            Log.i("OkHttp", message, th);
        }
    }

    @Override // o8.f
    public final void k(Object obj, String message) {
        kotlin.jvm.internal.h.e(message, "message");
        if (Build.VERSION.SDK_INT < 30) {
            super.k(obj, message);
        } else {
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type android.util.CloseGuard");
            a.b(obj).warnIfOpen();
        }
    }

    @Override // o8.f
    public final SSLContext l() {
        StrictMode.noteSlowCall("newSSLContext");
        return super.l();
    }
}
