package okhttp3;

import android.os.StrictMode;
import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.bg61;
import defpackage.bgo;
import defpackage.d5e;
import defpackage.d5j0;
import defpackage.d72;
import defpackage.dvc0;
import defpackage.ek41;
import defpackage.i79;
import defpackage.ine;
import defpackage.j5e;
import defpackage.jl40;
import defpackage.km3;
import defpackage.lm3;
import defpackage.lm60;
import defpackage.mtx0;
import defpackage.nci0;
import defpackage.ny61;
import defpackage.p79;
import defpackage.p8w;
import defpackage.ryj;
import defpackage.sa7;
import defpackage.twl;
import defpackage.vg10;
import defpackage.vv60;
import defpackage.xf7;
import defpackage.xfo;
import defpackage.y1l0;
import defpackage.ycc;
import defpackage.ydi0;
import defpackage.yf7;
import defpackage.yfo;
import defpackage.yj41;
import defpackage.zf61;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lokhttp3/OkHttpClient;", "Lxf7;", "Lyj41;", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public class OkHttpClient implements xf7, yj41 {
    public static final List a0 = bg61.l(new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
    public static final List b0 = bg61.l(new j5e[]{j5e.e, j5e.f});
    public final boolean A;
    public final boolean B;
    public final ine C;
    public final sa7 D;
    public final twl E;
    public final ProxySelector F;
    public final lm3 G;
    public final SocketFactory H;
    public final SSLSocketFactory I;
    public final X509TrustManager J;
    public final List K;
    public final List L;
    public final HostnameVerifier M;
    public final p79 N;
    public final i79 O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final long U;
    public final y1l0 V;
    public final mtx0 W;
    public final d5e Z;
    public final ryj a;
    public final List b;
    public final List c;
    public final yfo w;
    public final boolean x;
    public final boolean y;
    public final lm3 z;

    public static final class a {
        public int A;
        public int B;
        public long C;
        public y1l0 D;
        public mtx0 E;
        public d5e b;
        public yfo e;
        public boolean f;
        public boolean g;
        public lm3 h;
        public boolean i;
        public boolean j;
        public ine k;
        public sa7 l;
        public twl m;
        public ProxySelector n;
        public lm3 o;
        public SocketFactory p;
        public SSLSocketFactory q;
        public X509TrustManager r;
        public List s;
        public List t;
        public HostnameVerifier u;
        public p79 v;
        public i79 w;
        public int x;
        public int y;
        public int z;
        public ryj a = new ryj();
        public final ArrayList c = new ArrayList();
        public final ArrayList d = new ArrayList();

        public a() {
            bgo bgoVar = bgo.NONE;
            TimeZone timeZone = bg61.a;
            this.e = new zf61(bgoVar, 0);
            this.f = true;
            this.g = true;
            km3 km3Var = lm3.a;
            this.h = km3Var;
            this.i = true;
            this.j = true;
            this.k = ine.a;
            this.m = twl.W1;
            this.o = km3Var;
            this.p = SocketFactory.getDefault();
            this.s = OkHttpClient.b0;
            this.t = OkHttpClient.a0;
            this.u = vv60.a;
            this.v = p79.c;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 60000;
            this.C = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }

        public final void a(p8w p8wVar) {
            this.c.add(p8wVar);
        }

        public final void b(long j, TimeUnit timeUnit) {
            this.y = bg61.b(j, timeUnit);
        }

        public final void c(twl twlVar) {
            if (!twlVar.equals(this.m)) {
                this.D = null;
            }
            this.m = twlVar;
        }

        public final void d(bgo bgoVar) {
            TimeZone timeZone = bg61.a;
            this.e = new zf61(bgoVar, 0);
        }

        public final void e(HostnameVerifier hostnameVerifier) {
            if (!hostnameVerifier.equals(this.u)) {
                this.D = null;
            }
            this.u = hostnameVerifier;
        }

        public final void f(List list) {
            ArrayList arrayList = new ArrayList(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                vg10.r(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
                return;
            }
            if (arrayList.contains(protocol) && arrayList.size() > 1) {
                vg10.r(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
                return;
            }
            if (arrayList.contains(Protocol.HTTP_1_0)) {
                vg10.r(arrayList, "protocols must not contain http/1.0: ");
                return;
            }
            if (arrayList.contains(null)) {
                ny61.g("protocols must not contain null");
                return;
            }
            arrayList.remove(Protocol.SPDY_3);
            if (!arrayList.equals(this.t)) {
                this.D = null;
            }
            this.t = Collections.unmodifiableList(arrayList);
        }

        public final void g(long j, TimeUnit timeUnit) {
            this.z = bg61.b(j, timeUnit);
        }

        public final void h(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (!sSLSocketFactory.equals(this.q) || !x509TrustManager.equals(this.r)) {
                this.D = null;
            }
            this.q = sSLSocketFactory;
            d72 d72Var = dvc0.a;
            this.w = dvc0.a.a(x509TrustManager);
            this.r = x509TrustManager;
        }

        public final void i(long j) {
            this.A = bg61.b(j, TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OkHttpClient(a aVar) {
        List list;
        this.a = aVar.a;
        this.b = bg61.k(aVar.c);
        this.c = bg61.k(aVar.d);
        this.w = aVar.e;
        this.x = aVar.f;
        this.y = aVar.g;
        this.z = aVar.h;
        this.A = aVar.i;
        this.B = aVar.j;
        this.C = aVar.k;
        this.D = aVar.l;
        this.E = aVar.m;
        ProxySelector proxySelector = aVar.n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = lm60.a;
        }
        this.F = proxySelector;
        this.G = aVar.o;
        this.H = aVar.p;
        List list2 = aVar.s;
        this.K = list2;
        this.L = aVar.t;
        this.M = aVar.u;
        this.P = aVar.x;
        this.Q = aVar.y;
        this.R = aVar.z;
        this.S = aVar.A;
        this.T = aVar.B;
        this.U = aVar.C;
        y1l0 y1l0Var = aVar.D;
        this.V = y1l0Var == null ? new y1l0() : y1l0Var;
        mtx0 mtx0Var = aVar.E;
        this.W = mtx0Var == null ? mtx0.l : mtx0Var;
        d5e d5eVar = aVar.b;
        if (d5eVar == null) {
            d5eVar = new d5e();
            aVar.b = d5eVar;
        }
        this.Z = d5eVar;
        List list3 = list2;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                if (((j5e) it.next()).a) {
                    SSLSocketFactory sSLSocketFactory = aVar.q;
                    if (sSLSocketFactory == null) {
                        d72 d72Var = dvc0.a;
                        dvc0.a.getClass();
                        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                        trustManagerFactory.init((KeyStore) null);
                        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                        if (trustManagers.length == 1) {
                            TrustManager trustManager = trustManagers[0];
                            if (trustManager instanceof X509TrustManager) {
                                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                                this.J = x509TrustManager;
                                dvc0.a.getClass();
                                try {
                                    StrictMode.noteSlowCall("newSSLContext");
                                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                                    sSLContext.init(null, new TrustManager[]{x509TrustManager}, null);
                                    this.I = sSLContext.getSocketFactory();
                                    i79 a2 = dvc0.a.a(x509TrustManager);
                                    this.O = a2;
                                    p79 p79Var = aVar.v;
                                    this.N = jl40.l(p79Var.b, a2) ? p79Var : new p79(p79Var.a, a2);
                                } catch (GeneralSecurityException e) {
                                    throw new AssertionError("No System TLS: " + e, e);
                                }
                            }
                        }
                        xfo.g("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
                        throw null;
                    }
                    this.I = sSLSocketFactory;
                    i79 i79Var = aVar.w;
                    this.O = i79Var;
                    this.J = aVar.r;
                    p79 p79Var2 = aVar.v;
                    this.N = jl40.l(p79Var2.b, i79Var) ? p79Var2 : new p79(p79Var2.a, i79Var);
                    X509TrustManager x509TrustManager2 = this.J;
                    i79 i79Var2 = this.O;
                    SSLSocketFactory sSLSocketFactory2 = this.I;
                    List list4 = this.c;
                    list = this.b;
                    if (!list.contains(null)) {
                        vg10.o(list, "Null interceptor: ");
                        throw null;
                    }
                    if (list4.contains(null)) {
                        vg10.o(list4, "Null network interceptor: ");
                        throw null;
                    }
                    List list5 = this.K;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it2 = list5.iterator();
                        while (it2.hasNext()) {
                            if (((j5e) it2.next()).a) {
                                if (sSLSocketFactory2 == null) {
                                    ny61.r("sslSocketFactory == null");
                                    throw null;
                                }
                                if (i79Var2 == null) {
                                    ny61.r("certificateChainCleaner == null");
                                    throw null;
                                }
                                if (x509TrustManager2 != null) {
                                    return;
                                }
                                ny61.r("x509TrustManager == null");
                                throw null;
                            }
                        }
                    }
                    if (sSLSocketFactory2 != null) {
                        ny61.r("Check failed.");
                        throw null;
                    }
                    if (i79Var2 != null) {
                        ny61.r("Check failed.");
                        throw null;
                    }
                    if (x509TrustManager2 != null) {
                        ny61.r("Check failed.");
                        throw null;
                    }
                    if (jl40.l(this.N, p79.c)) {
                        return;
                    }
                    ny61.r("Check failed.");
                    throw null;
                }
            }
        }
        this.I = null;
        this.O = null;
        this.J = null;
        this.N = p79.c;
        X509TrustManager x509TrustManager22 = this.J;
        i79 i79Var22 = this.O;
        SSLSocketFactory sSLSocketFactory22 = this.I;
        List list42 = this.c;
        list = this.b;
        if (!list.contains(null)) {
        }
    }

    public final a b() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.Z;
        ycc.r(this.b, aVar.c);
        ycc.r(this.c, aVar.d);
        aVar.e = this.w;
        aVar.f = this.x;
        aVar.g = this.y;
        aVar.h = this.z;
        aVar.i = this.A;
        aVar.j = this.B;
        aVar.k = this.C;
        aVar.l = this.D;
        aVar.m = this.E;
        aVar.n = this.F;
        aVar.o = this.G;
        aVar.p = this.H;
        aVar.q = this.I;
        aVar.r = this.J;
        aVar.s = this.K;
        aVar.t = this.L;
        aVar.u = this.M;
        aVar.v = this.N;
        aVar.w = this.O;
        aVar.x = this.P;
        aVar.y = this.Q;
        aVar.z = this.R;
        aVar.A = this.S;
        aVar.B = this.T;
        aVar.C = this.U;
        aVar.D = this.V;
        aVar.E = this.W;
        return aVar;
    }

    public final ydi0 c(d5j0 d5j0Var, ek41 ek41Var) {
        ydi0 ydi0Var = new ydi0(this.W, d5j0Var, ek41Var, new Random(), 0L, this.U, this.T);
        ydi0Var.d(this);
        return ydi0Var;
    }

    @Override // defpackage.xf7
    public final yf7 newCall(d5j0 d5j0Var) {
        return new nci0(this, d5j0Var, false);
    }

    public OkHttpClient() {
        this(new a());
    }
}
