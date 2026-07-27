package i8;

import com.google.android.gms.internal.ads.C2941aq;
import g1.C4523c;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: C, reason: collision with root package name */
    public static final List f38191C = j8.d.k(new s[]{s.f38227y, s.f38225w});

    /* renamed from: D, reason: collision with root package name */
    public static final List f38192D = j8.d.k(new i[]{i.f38126e, i.f38127f});

    /* renamed from: A, reason: collision with root package name */
    public final l8.d f38193A;

    /* renamed from: B, reason: collision with root package name */
    public final I0.j f38194B;

    /* renamed from: a, reason: collision with root package name */
    public final C2941aq f38195a;

    /* renamed from: b, reason: collision with root package name */
    public final List f38196b;

    /* renamed from: c, reason: collision with root package name */
    public final List f38197c;

    /* renamed from: d, reason: collision with root package name */
    public final d4.f f38198d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38199e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38200f;

    /* renamed from: g, reason: collision with root package name */
    public final b f38201g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f38202h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f38203j;

    /* renamed from: k, reason: collision with root package name */
    public final b f38204k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f38205l;

    /* renamed from: m, reason: collision with root package name */
    public final b f38206m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f38207n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f38208o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f38209p;

    /* renamed from: q, reason: collision with root package name */
    public final List f38210q;

    /* renamed from: r, reason: collision with root package name */
    public final List f38211r;

    /* renamed from: s, reason: collision with root package name */
    public final w8.c f38212s;

    /* renamed from: t, reason: collision with root package name */
    public final d f38213t;

    /* renamed from: u, reason: collision with root package name */
    public final com.bumptech.glide.e f38214u;

    /* renamed from: v, reason: collision with root package name */
    public final int f38215v;

    /* renamed from: w, reason: collision with root package name */
    public final int f38216w;

    /* renamed from: x, reason: collision with root package name */
    public final int f38217x;

    /* renamed from: y, reason: collision with root package name */
    public final int f38218y;

    /* renamed from: z, reason: collision with root package name */
    public final C4523c f38219z;

    /* JADX WARN: Removed duplicated region for block: B:14:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(q qVar) {
        List list;
        this.f38195a = qVar.f38170a;
        this.f38196b = j8.d.j(qVar.f38172c);
        this.f38197c = j8.d.j(qVar.f38173d);
        this.f38198d = qVar.f38174e;
        boolean z3 = qVar.f38175f;
        this.f38199e = z3;
        boolean z6 = qVar.f38176g;
        this.f38200f = z6;
        this.f38201g = qVar.f38177h;
        this.f38202h = qVar.i;
        this.i = qVar.f38178j;
        this.f38203j = qVar.f38179k;
        this.f38204k = qVar.f38180l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f38205l = proxySelector == null ? u8.a.f41353a : proxySelector;
        this.f38206m = qVar.f38181m;
        this.f38207n = qVar.f38182n;
        List list2 = qVar.f38183o;
        this.f38210q = list2;
        this.f38211r = qVar.f38184p;
        this.f38212s = qVar.f38185q;
        this.f38215v = qVar.f38187s;
        int i = qVar.f38188t;
        this.f38216w = i;
        int i6 = qVar.f38189u;
        this.f38217x = i6;
        int i9 = qVar.f38190v;
        this.f38218y = i9;
        C4523c c4523c = new C4523c(27);
        this.f38219z = c4523c;
        this.f38193A = l8.d.f38947l;
        I0.j jVar = qVar.f38171b;
        if (jVar == null) {
            jVar = new I0.j(i6, i9, i, i6, z3, z6, c4523c);
            qVar.f38171b = jVar;
        }
        this.f38194B = jVar;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f38128a) {
                    s8.f fVar = s8.f.f40497a;
                    s8.f.f40497a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    kotlin.jvm.internal.h.b(trustManagers);
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            kotlin.jvm.internal.h.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.f38209p = x509TrustManager;
                            s8.f fVar2 = s8.f.f40497a;
                            fVar2.getClass();
                            try {
                                SSLContext l9 = fVar2.l();
                                l9.init(null, new TrustManager[]{x509TrustManager}, null);
                                SSLSocketFactory socketFactory = l9.getSocketFactory();
                                kotlin.jvm.internal.h.d(socketFactory, "getSocketFactory(...)");
                                this.f38208o = socketFactory;
                                com.bumptech.glide.e c9 = s8.f.f40497a.c(x509TrustManager);
                                this.f38214u = c9;
                                d dVar = qVar.f38186r;
                                dVar.getClass();
                                this.f38213t = kotlin.jvm.internal.h.a(dVar.f38094b, c9) ? dVar : new d(dVar.f38093a, c9);
                                list = this.f38196b;
                                kotlin.jvm.internal.h.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (!list.contains(null)) {
                                    throw new IllegalStateException(("Null interceptor: " + list).toString());
                                }
                                List list3 = this.f38197c;
                                kotlin.jvm.internal.h.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (list3.contains(null)) {
                                    throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                                }
                                X509TrustManager x509TrustManager2 = this.f38209p;
                                com.bumptech.glide.e eVar = this.f38214u;
                                SSLSocketFactory sSLSocketFactory = this.f38208o;
                                List list4 = this.f38210q;
                                if (list4 == null || !list4.isEmpty()) {
                                    Iterator it2 = list4.iterator();
                                    while (it2.hasNext()) {
                                        if (((i) it2.next()).f38128a) {
                                            if (sSLSocketFactory == null) {
                                                throw new IllegalStateException("sslSocketFactory == null");
                                            }
                                            if (eVar == null) {
                                                throw new IllegalStateException("certificateChainCleaner == null");
                                            }
                                            if (x509TrustManager2 == null) {
                                                throw new IllegalStateException("x509TrustManager == null");
                                            }
                                            return;
                                        }
                                    }
                                }
                                if (sSLSocketFactory != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (eVar != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (x509TrustManager2 != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (!kotlin.jvm.internal.h.a(this.f38213t, d.f38092c)) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                return;
                            } catch (GeneralSecurityException e9) {
                                throw new AssertionError("No System TLS: " + e9, e9);
                            }
                        }
                    }
                    String arrays = Arrays.toString(trustManagers);
                    kotlin.jvm.internal.h.d(arrays, "toString(...)");
                    throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
                }
            }
        }
        this.f38208o = null;
        this.f38214u = null;
        this.f38209p = null;
        this.f38213t = d.f38092c;
        list = this.f38196b;
        kotlin.jvm.internal.h.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }
}
