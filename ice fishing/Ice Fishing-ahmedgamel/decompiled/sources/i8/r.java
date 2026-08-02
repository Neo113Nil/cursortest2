package i8;

import a.AbstractC0426a;
import com.google.android.gms.internal.ads.C2964aq;
import i1.C4585b;
import i1.C4586c;
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
    public static final List f38310C = j8.d.k(new s[]{s.f38346y, s.f38344w});

    /* renamed from: D, reason: collision with root package name */
    public static final List f38311D = j8.d.k(new i[]{i.f38245e, i.f38246f});

    /* renamed from: A, reason: collision with root package name */
    public final l8.d f38312A;

    /* renamed from: B, reason: collision with root package name */
    public final C4585b f38313B;

    /* renamed from: a, reason: collision with root package name */
    public final C2964aq f38314a;

    /* renamed from: b, reason: collision with root package name */
    public final List f38315b;

    /* renamed from: c, reason: collision with root package name */
    public final List f38316c;

    /* renamed from: d, reason: collision with root package name */
    public final com.anythink.core.common.n.b.A f38317d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f38318e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f38319f;

    /* renamed from: g, reason: collision with root package name */
    public final b f38320g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f38321h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final b f38322j;

    /* renamed from: k, reason: collision with root package name */
    public final b f38323k;

    /* renamed from: l, reason: collision with root package name */
    public final ProxySelector f38324l;

    /* renamed from: m, reason: collision with root package name */
    public final b f38325m;

    /* renamed from: n, reason: collision with root package name */
    public final SocketFactory f38326n;

    /* renamed from: o, reason: collision with root package name */
    public final SSLSocketFactory f38327o;

    /* renamed from: p, reason: collision with root package name */
    public final X509TrustManager f38328p;

    /* renamed from: q, reason: collision with root package name */
    public final List f38329q;

    /* renamed from: r, reason: collision with root package name */
    public final List f38330r;

    /* renamed from: s, reason: collision with root package name */
    public final w8.c f38331s;

    /* renamed from: t, reason: collision with root package name */
    public final d f38332t;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC0426a f38333u;

    /* renamed from: v, reason: collision with root package name */
    public final int f38334v;

    /* renamed from: w, reason: collision with root package name */
    public final int f38335w;

    /* renamed from: x, reason: collision with root package name */
    public final int f38336x;

    /* renamed from: y, reason: collision with root package name */
    public final int f38337y;

    /* renamed from: z, reason: collision with root package name */
    public final C4586c f38338z;

    /* JADX WARN: Removed duplicated region for block: B:14:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public r(q qVar) {
        List list;
        this.f38314a = qVar.f38289a;
        this.f38315b = j8.d.j(qVar.f38291c);
        this.f38316c = j8.d.j(qVar.f38292d);
        this.f38317d = qVar.f38293e;
        boolean z6 = qVar.f38294f;
        this.f38318e = z6;
        boolean z9 = qVar.f38295g;
        this.f38319f = z9;
        this.f38320g = qVar.f38296h;
        this.f38321h = qVar.i;
        this.i = qVar.f38297j;
        this.f38322j = qVar.f38298k;
        this.f38323k = qVar.f38299l;
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f38324l = proxySelector == null ? u8.a.f41076a : proxySelector;
        this.f38325m = qVar.f38300m;
        this.f38326n = qVar.f38301n;
        List list2 = qVar.f38302o;
        this.f38329q = list2;
        this.f38330r = qVar.f38303p;
        this.f38331s = qVar.f38304q;
        this.f38334v = qVar.f38306s;
        int i = qVar.f38307t;
        this.f38335w = i;
        int i4 = qVar.f38308u;
        this.f38336x = i4;
        int i6 = qVar.f38309v;
        this.f38337y = i6;
        C4586c c4586c = new C4586c(28);
        this.f38338z = c4586c;
        this.f38312A = l8.d.f39015l;
        C4585b c4585b = qVar.f38290b;
        if (c4585b == null) {
            c4585b = new C4585b(i4, i6, i, i4, z6, z9, c4586c);
            qVar.f38290b = c4585b;
        }
        this.f38313B = c4585b;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((i) it.next()).f38247a) {
                    s8.f fVar = s8.f.f40554a;
                    s8.f.f40554a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    kotlin.jvm.internal.h.b(trustManagers);
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            kotlin.jvm.internal.h.c(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                            X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                            this.f38328p = x509TrustManager;
                            s8.f fVar2 = s8.f.f40554a;
                            fVar2.getClass();
                            try {
                                SSLContext l9 = fVar2.l();
                                l9.init(null, new TrustManager[]{x509TrustManager}, null);
                                SSLSocketFactory socketFactory = l9.getSocketFactory();
                                kotlin.jvm.internal.h.d(socketFactory, "getSocketFactory(...)");
                                this.f38327o = socketFactory;
                                AbstractC0426a c9 = s8.f.f40554a.c(x509TrustManager);
                                this.f38333u = c9;
                                d dVar = qVar.f38305r;
                                dVar.getClass();
                                this.f38332t = kotlin.jvm.internal.h.a(dVar.f38213b, c9) ? dVar : new d(dVar.f38212a, c9);
                                list = this.f38315b;
                                kotlin.jvm.internal.h.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (!list.contains(null)) {
                                    throw new IllegalStateException(("Null interceptor: " + list).toString());
                                }
                                List list3 = this.f38316c;
                                kotlin.jvm.internal.h.c(list3, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
                                if (list3.contains(null)) {
                                    throw new IllegalStateException(("Null network interceptor: " + list3).toString());
                                }
                                X509TrustManager x509TrustManager2 = this.f38328p;
                                AbstractC0426a abstractC0426a = this.f38333u;
                                SSLSocketFactory sSLSocketFactory = this.f38327o;
                                List list4 = this.f38329q;
                                if (list4 == null || !list4.isEmpty()) {
                                    Iterator it2 = list4.iterator();
                                    while (it2.hasNext()) {
                                        if (((i) it2.next()).f38247a) {
                                            if (sSLSocketFactory == null) {
                                                throw new IllegalStateException("sslSocketFactory == null");
                                            }
                                            if (abstractC0426a == null) {
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
                                if (abstractC0426a != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (x509TrustManager2 != null) {
                                    throw new IllegalStateException("Check failed.");
                                }
                                if (!kotlin.jvm.internal.h.a(this.f38332t, d.f38211c)) {
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
        this.f38327o = null;
        this.f38333u = null;
        this.f38328p = null;
        this.f38332t = d.f38211c;
        list = this.f38315b;
        kotlin.jvm.internal.h.c(list, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>");
        if (!list.contains(null)) {
        }
    }
}
