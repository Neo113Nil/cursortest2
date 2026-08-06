package J1;

import F.C0038n;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class s implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final C0038n f939a;

    /* renamed from: b, reason: collision with root package name */
    public final C.j f940b;

    /* renamed from: c, reason: collision with root package name */
    public final List f941c;

    /* renamed from: d, reason: collision with root package name */
    public final List f942d;

    /* renamed from: e, reason: collision with root package name */
    public final H0.b f943e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f944f;

    /* renamed from: g, reason: collision with root package name */
    public final C0051b f945g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f946h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f947i;

    /* renamed from: j, reason: collision with root package name */
    public final C0051b f948j;

    /* renamed from: k, reason: collision with root package name */
    public final C0051b f949k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f950l;

    /* renamed from: m, reason: collision with root package name */
    public final C0051b f951m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f952n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f953o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f954p;

    /* renamed from: q, reason: collision with root package name */
    public final List f955q;

    /* renamed from: r, reason: collision with root package name */
    public final List f956r;

    /* renamed from: s, reason: collision with root package name */
    public final V1.c f957s;
    public final e t;

    /* renamed from: u, reason: collision with root package name */
    public final R1.l f958u;

    /* renamed from: v, reason: collision with root package name */
    public final int f959v;

    /* renamed from: w, reason: collision with root package name */
    public final int f960w;

    /* renamed from: x, reason: collision with root package name */
    public final int f961x;

    /* renamed from: y, reason: collision with root package name */
    public final C.j f962y;

    /* renamed from: z, reason: collision with root package name */
    public static final List f938z = K1.b.l(t.HTTP_2, t.HTTP_1_1);

    /* renamed from: A, reason: collision with root package name */
    public static final List f937A = K1.b.l(i.f870e, i.f871f);

    /* JADX WARN: Removed duplicated region for block: B:11:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(r rVar) {
        List list;
        this.f939a = rVar.f915a;
        this.f940b = rVar.f916b;
        this.f941c = K1.b.w(rVar.f917c);
        this.f942d = K1.b.w(rVar.f918d);
        this.f943e = rVar.f919e;
        this.f944f = rVar.f920f;
        this.f945g = rVar.f921g;
        this.f946h = rVar.f922h;
        this.f947i = rVar.f923i;
        this.f948j = rVar.f924j;
        this.f949k = rVar.f925k;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f950l = proxySelector == null ? T1.a.f1802a : proxySelector;
        this.f951m = rVar.f926l;
        this.f952n = rVar.f927m;
        List list2 = rVar.f930p;
        this.f955q = list2;
        this.f956r = rVar.f931q;
        this.f957s = rVar.f932r;
        this.f959v = rVar.f934u;
        this.f960w = rVar.f935v;
        this.f961x = rVar.f936w;
        this.f962y = new C.j(13);
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f872a) {
                    SSLSocketFactory sSLSocketFactory = rVar.f928n;
                    if (sSLSocketFactory != null) {
                        this.f953o = sSLSocketFactory;
                        R1.l lVar = rVar.t;
                        kotlin.jvm.internal.i.b(lVar);
                        this.f958u = lVar;
                        X509TrustManager x509TrustManager = rVar.f929o;
                        kotlin.jvm.internal.i.b(x509TrustManager);
                        this.f954p = x509TrustManager;
                        e eVar = rVar.f933s;
                        eVar.getClass();
                        this.t = kotlin.jvm.internal.i.a(eVar.f846b, lVar) ? eVar : new e(eVar.f845a, lVar);
                    } else {
                        R1.n nVar = R1.n.f1772a;
                        X509TrustManager m2 = R1.n.f1772a.m();
                        this.f954p = m2;
                        this.f953o = R1.n.f1772a.l(m2);
                        R1.l b2 = R1.n.f1772a.b(m2);
                        this.f958u = b2;
                        e eVar2 = rVar.f933s;
                        eVar2.getClass();
                        this.t = kotlin.jvm.internal.i.a(eVar2.f846b, b2) ? eVar2 : new e(eVar2.f845a, b2);
                    }
                    list = this.f941c;
                    if (!list.contains(null)) {
                        throw new IllegalStateException(kotlin.jvm.internal.i.h(list, "Null interceptor: ").toString());
                    }
                    List list3 = this.f942d;
                    if (list3.contains(null)) {
                        throw new IllegalStateException(kotlin.jvm.internal.i.h(list3, "Null network interceptor: ").toString());
                    }
                    X509TrustManager x509TrustManager2 = this.f954p;
                    R1.l lVar2 = this.f958u;
                    SSLSocketFactory sSLSocketFactory2 = this.f953o;
                    List list4 = this.f955q;
                    if (list4 == null || !list4.isEmpty()) {
                        Iterator it2 = list4.iterator();
                        while (it2.hasNext()) {
                            if (((i) it2.next()).f872a) {
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException("sslSocketFactory == null");
                                }
                                if (lVar2 == null) {
                                    throw new IllegalStateException("certificateChainCleaner == null");
                                }
                                if (x509TrustManager2 == null) {
                                    throw new IllegalStateException("x509TrustManager == null");
                                }
                                return;
                            }
                        }
                    }
                    if (sSLSocketFactory2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (lVar2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (x509TrustManager2 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (!kotlin.jvm.internal.i.a(this.t, e.f844c)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    return;
                }
            }
        }
        this.f953o = null;
        this.f958u = null;
        this.f954p = null;
        this.t = e.f844c;
        list = this.f941c;
        if (!list.contains(null)) {
        }
    }

    public final Object clone() {
        return super.clone();
    }
}
