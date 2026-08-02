package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class joj {
    public long A;
    public vtm B;
    public z98 a = new z98();
    public ozw b = new ozw(5);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public iib e = new put(jib.a);
    public boolean f = true;
    public imp g;
    public boolean h;
    public boolean i;
    public e3s j;
    public to3 k;
    public i9w l;
    public ProxySelector m;
    public imp n;
    public SocketFactory o;
    public SSLSocketFactory p;
    public X509TrustManager q;
    public List r;
    public List s;
    public HostnameVerifier t;
    public ha4 u;
    public irf v;
    public int w;
    public int x;
    public int y;
    public int z;

    public joj() {
        imp impVar = imp.c;
        this.g = impVar;
        this.h = true;
        this.i = true;
        this.j = fk6.a0;
        this.l = i9w.a;
        this.n = impVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.o = socketFactory;
        this.r = OkHttpClient.D;
        this.s = OkHttpClient.C;
        this.t = wnj.a;
        this.u = ha4.c;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.A = 1024L;
    }

    public final void a(bse bseVar) {
        bseVar.getClass();
        this.c.add(bseVar);
    }

    public final void b(bse bseVar) {
        bseVar.getClass();
        this.d.add(bseVar);
    }

    public final void c(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.x = cvt.b("timeout", j, timeUnit);
    }

    public final void d(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        izm izmVar = izm.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(izmVar) && !arrayList.contains(izm.HTTP_1_1)) {
            l1j.p(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
            return;
        }
        if (arrayList.contains(izmVar) && arrayList.size() > 1) {
            l1j.p(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
            return;
        }
        if (arrayList.contains(izm.HTTP_1_0)) {
            l1j.p(arrayList, "protocols must not contain http/1.0: ");
            return;
        }
        if (arrayList.contains(null)) {
            xq0.x("protocols must not contain null");
            return;
        }
        arrayList.remove(izm.SPDY_3);
        if (!arrayList.equals(this.s)) {
            this.B = null;
        }
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        unmodifiableList.getClass();
        this.s = unmodifiableList;
    }

    public final void e(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.y = cvt.b("timeout", j, timeUnit);
    }

    public final void f(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        sSLSocketFactory.getClass();
        x509TrustManager.getClass();
        if (!sSLSocketFactory.equals(this.p) || !x509TrustManager.equals(this.q)) {
            this.B = null;
        }
        this.p = sSLSocketFactory;
        otk otkVar = otk.a;
        this.v = otk.a.b(x509TrustManager);
        this.q = x509TrustManager;
    }

    public final void g(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        this.z = cvt.b("timeout", j, timeUnit);
    }
}
