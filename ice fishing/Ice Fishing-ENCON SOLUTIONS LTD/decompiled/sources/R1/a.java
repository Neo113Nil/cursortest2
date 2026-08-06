package R1;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import i1.AbstractC0253j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class a extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f1741d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1742c;

    static {
        f1741d = m0.j.k() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        ArrayList C2 = AbstractC0253j.C((!m0.j.k() || Build.VERSION.SDK_INT < 29) ? null : new S1.a(), new S1.m(S1.f.f1779f), new S1.m(S1.k.f1789a), new S1.m(S1.h.f1785a));
        ArrayList arrayList = new ArrayList();
        Iterator it = C2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((S1.n) next).c()) {
                arrayList.add(next);
            }
        }
        this.f1742c = arrayList;
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
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        Object obj;
        kotlin.jvm.internal.i.e(protocols, "protocols");
        Iterator it = this.f1742c.iterator();
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
    public final String f(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f1742c.iterator();
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
    public final boolean h(String hostname) {
        kotlin.jvm.internal.i.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
