package defpackage;

import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class j8h extends t7h implements pue {
    public static final Logger c0 = Logger.getLogger(j8h.class.getName());
    public static final Pattern d0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");
    public static final sgr e0;
    public static final sgr f0;
    public static final sgr g0;
    public static final q8h h0;
    public static final u7h i0;
    public static final hv7 j0;
    public LinkedHashSet A;
    public final Object B;
    public final HashSet C;
    public final mv7 D;
    public final g06 E;
    public final AtomicBoolean F;
    public boolean G;
    public boolean H;
    public volatile boolean I;
    public final CountDownLatch J;
    public final d51 K;
    public final kkp L;
    public final jd4 M;
    public final ad4 N;
    public final lte O;
    public final g8h P;
    public q8h Q;
    public boolean R;
    public final boolean S;
    public final gao T;
    public final long U;
    public final long V;
    public final boolean W;
    public final fs7 X;
    public final fwe Y;
    public final u76 Z;
    public final sue a;
    public final o1o a0;
    public final String b;
    public int b0;
    public final owi c;
    public final rd2 d;
    public final nnk e;
    public final is3 f;
    public final h8h g;
    public final Executor h;
    public final xhj i;
    public final z7h j;
    public final z7h k;
    public final hs4 l;
    public final vq6 m;
    public final ch7 n;
    public final ms5 o;
    public final yqr p;
    public final long q;
    public final u76 r;
    public final wvo s;
    public final mc4 t;
    public xco u;
    public boolean v;
    public a8h w;
    public volatile aeg x;
    public boolean y;
    public final HashSet z;

    static {
        sgr sgrVar = sgr.o;
        e0 = sgrVar.i("Channel shutdownNow invoked");
        f0 = sgrVar.i("Channel shutdown invoked");
        g0 = sgrVar.i("Subchannel shutdown invoked");
        h0 = new q8h(null, new HashMap(), new HashMap(), null, null, null);
        i0 = new u7h();
        j0 = new hv7(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v19, types: [jo4] */
    public j8h(k8h k8hVar, goj gojVar, wvo wvoVar, gao gaoVar, yqr yqrVar, ArrayList arrayList) {
        int i;
        hs4 hs4Var = hs4.m;
        vq6 vq6Var = new vq6(new ap6(1, this));
        this.m = vq6Var;
        u76 u76Var = new u76();
        u76Var.a = new ArrayList();
        u76Var.b = r76.d;
        this.r = u76Var;
        this.z = new HashSet(16, 0.75f);
        this.B = new Object();
        this.C = new HashSet(1, 0.75f);
        this.E = new g06(this);
        this.F = new AtomicBoolean(false);
        this.J = new CountDownLatch(1);
        this.b0 = 1;
        this.Q = h0;
        this.R = false;
        this.T = new gao(0);
        this.X = ce7.d;
        qzc qzcVar = new qzc(11, this);
        this.Y = new fwe(this, 1);
        this.Z = new u76(this);
        String str = k8hVar.e;
        o2g.O(str, "target");
        this.b = str;
        sue sueVar = new sue(sue.d.incrementAndGet(), "Channel", str);
        this.a = sueVar;
        this.l = hs4Var;
        xhj xhjVar = k8hVar.a;
        o2g.O(xhjVar, "executorPool");
        this.i = xhjVar;
        Executor executor = (Executor) xhjVar.e();
        o2g.O(executor, "executor");
        this.h = executor;
        xhj xhjVar2 = k8hVar.b;
        o2g.O(xhjVar2, "offloadExecutorPool");
        z7h z7hVar = new z7h(xhjVar2);
        this.k = z7hVar;
        is3 is3Var = new is3(gojVar, z7hVar);
        this.f = is3Var;
        h8h h8hVar = new h8h(gojVar.d);
        this.g = h8hVar;
        jd4 jd4Var = new jd4(sueVar, hs4Var.x(), hrg.q("Channel for '", str, "'"));
        this.M = jd4Var;
        ad4 ad4Var = new ad4(jd4Var, hs4Var);
        this.N = ad4Var;
        xzm xzmVar = xqd.o;
        boolean z = k8hVar.n;
        this.W = z;
        String str2 = k8hVar.f;
        eeg a = eeg.a();
        nnk nnkVar = new nnk();
        o2g.O(a, "registry");
        nnkVar.a = a;
        o2g.O(str2, "defaultPolicy");
        nnkVar.b = str2;
        this.e = nnkVar;
        owi owiVar = k8hVar.d;
        this.c = owiVar;
        int i2 = k8hVar.j;
        int i3 = k8hVar.k;
        krd krdVar = new krd();
        krdVar.c = z;
        krdVar.a = i2;
        krdVar.b = i3;
        krdVar.d = nnkVar;
        hoj hojVar = (hoj) k8hVar.w.a;
        int D = ouj.D(hojVar.g);
        if (D == 0) {
            i = 443;
        } else if (D == 1) {
            i = 80;
        } else {
            xq0.w(dfi.v(hojVar.g).concat(" not handled"));
            i = 0;
        }
        Integer valueOf = Integer.valueOf(i);
        xzmVar.getClass();
        rd2 rd2Var = new rd2(valueOf, xzmVar, vq6Var, krdVar, h8hVar, ad4Var, z7hVar);
        this.d = rd2Var;
        is3Var.a.getClass();
        this.u = t(str, owiVar, rd2Var, Collections.singleton(InetSocketAddress.class));
        this.j = new z7h(gaoVar);
        mv7 mv7Var = new mv7(executor, vq6Var);
        this.D = mv7Var;
        mv7Var.d(qzcVar);
        this.s = wvoVar;
        this.S = k8hVar.p;
        g8h g8hVar = new g8h(this, this.u.v());
        this.P = g8hVar;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g8hVar = new jo4(g8hVar, (ho4) it.next());
        }
        this.t = g8hVar;
        o2g.O(yqrVar, "stopwatchSupplier");
        this.p = yqrVar;
        long j = k8hVar.i;
        if (j == -1) {
            this.q = j;
        } else {
            o2g.I("invalid idleTimeoutMillis %s", j, j >= k8h.z);
            this.q = k8hVar.i;
        }
        this.a0 = new o1o(new v7h(this, 6), this.m, this.f.a.d, (hhr) yqrVar.get());
        ch7 ch7Var = k8hVar.g;
        o2g.O(ch7Var, "decompressorRegistry");
        this.n = ch7Var;
        ms5 ms5Var = k8hVar.h;
        o2g.O(ms5Var, "compressorRegistry");
        this.o = ms5Var;
        this.V = k8hVar.l;
        this.U = k8hVar.m;
        this.K = new d51(27);
        this.L = new kkp(2);
        lte lteVar = k8hVar.o;
        lteVar.getClass();
        this.O = lteVar;
        lte.a(lteVar.b, this);
        if (this.S) {
            return;
        }
        this.R = true;
    }

    public static void o(j8h j8hVar) {
        j8hVar.v(true);
        mv7 mv7Var = j8hVar.D;
        mv7Var.h(null);
        j8hVar.N.I(2, "Entering IDLE state");
        j8hVar.r.i(r76.d);
        fwe fweVar = j8hVar.Y;
        Object[] objArr = {j8hVar.B, mv7Var};
        fweVar.getClass();
        for (int i = 0; i < 2; i++) {
            if (((Set) fweVar.a).contains(objArr[i])) {
                j8hVar.s();
                return;
            }
        }
    }

    public static void p(j8h j8hVar) {
        if (j8hVar.G) {
            Iterator it = j8hVar.z.iterator();
            while (it.hasNext()) {
                owe oweVar = (owe) it.next();
                vq6 vq6Var = oweVar.j;
                sgr sgrVar = e0;
                vq6Var.execute(new hwe(oweVar, sgrVar, 0));
                vq6Var.execute(new hwe(oweVar, sgrVar, 1));
            }
            Iterator it2 = j8hVar.C.iterator();
            if (it2.hasNext()) {
                throw hrg.j(it2);
            }
        }
    }

    public static void q(j8h j8hVar) {
        if (!j8hVar.I && j8hVar.F.get() && j8hVar.z.isEmpty() && j8hVar.C.isEmpty()) {
            j8hVar.N.I(2, "Terminated");
            lte.b(j8hVar.O.b, j8hVar);
            j8hVar.i.K(j8hVar.h);
            j8hVar.j.a();
            j8hVar.k.a();
            j8hVar.f.close();
            j8hVar.I = true;
            j8hVar.J.countDown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static xco t(String str, owi owiVar, rd2 rd2Var, Collection collection) {
        URI uri;
        nwi nwiVar;
        rd2 rd2Var2;
        String str2;
        String str3;
        String str4;
        cee ceeVar;
        cee ceeVar2;
        StringBuilder sb = new StringBuilder();
        g2a g2aVar = null;
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        if (uri != null) {
            String scheme = uri.getScheme();
            if (scheme != null) {
                synchronized (owiVar) {
                    ceeVar2 = owiVar.c;
                }
                nwiVar = (nwi) ceeVar2.get(scheme.toLowerCase(Locale.US));
                if (nwiVar == null && !d0.matcher(str).matches()) {
                    try {
                        synchronized (owiVar) {
                            str4 = owiVar.a;
                        }
                        uri = new URI(str4, "", "/" + str, null);
                        String scheme2 = uri.getScheme();
                        if (scheme2 == null) {
                            nwiVar = null;
                        } else {
                            synchronized (owiVar) {
                                ceeVar = owiVar.c;
                            }
                            nwiVar = (nwi) ceeVar.get(scheme2.toLowerCase(Locale.US));
                        }
                    } catch (URISyntaxException e2) {
                        xq0.t(e2);
                        return null;
                    }
                }
                if (nwiVar != null) {
                    if (sb.length() > 0) {
                        str3 = " (" + ((Object) sb) + ")";
                    } else {
                        str3 = "";
                    }
                    throw new IllegalArgumentException(hrg.q("Could not find a NameResolverProvider for ", str, str3));
                }
                if (collection != null && !collection.containsAll(Collections.singleton(InetSocketAddress.class))) {
                    xq0.x(hrg.s("Address types of NameResolver '", uri.getScheme(), "' for '", str, "' not supported by transport"));
                    return null;
                }
                if ("dns".equals(uri.getScheme())) {
                    String path = uri.getPath();
                    o2g.O(path, "targetPath");
                    o2g.M(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
                    String substring = path.substring(1);
                    uri.getAuthority();
                    rd2Var2 = rd2Var;
                    g2aVar = new g2a(substring, rd2Var2, xqd.r, new hhr(), h2a.a);
                } else {
                    rd2Var2 = rd2Var;
                }
                if (g2aVar != null) {
                    wvo wvoVar = new wvo(22);
                    h8h h8hVar = (h8h) rd2Var2.f;
                    if (h8hVar != null) {
                        vq6 vq6Var = (vq6) rd2Var2.d;
                        return new xco(g2aVar, new ck2(wvoVar, h8hVar, vq6Var), vq6Var);
                    }
                    xq0.q("ScheduledExecutorService not set in Builder");
                    return null;
                }
                if (sb.length() > 0) {
                    str2 = " (" + ((Object) sb) + ")";
                } else {
                    str2 = "";
                }
                throw new IllegalArgumentException(hrg.q("cannot create a NameResolver for ", str, str2));
            }
            owiVar.getClass();
        }
        nwiVar = null;
        if (nwiVar == null) {
            synchronized (owiVar) {
            }
        }
        if (nwiVar != null) {
        }
    }

    @Override // defpackage.pue
    public final sue a() {
        return this.a;
    }

    @Override // defpackage.mc4
    public final String e() {
        return this.t.e();
    }

    @Override // defpackage.mc4
    public final vn4 g(k3i k3iVar, ks3 ks3Var) {
        return this.t.g(k3iVar, ks3Var);
    }

    @Override // defpackage.t7h
    public final void h() {
        this.m.execute(new v7h(this, 1));
    }

    @Override // defpackage.t7h
    public final r76 i(boolean z) {
        r76 r76Var = (r76) this.r.b;
        if (r76Var == null) {
            qq6.d("Channel state API is not implemented");
            return null;
        }
        if (z && r76Var == r76.d) {
            this.m.execute(new v7h(this, 2));
        }
        return r76Var;
    }

    @Override // defpackage.t7h
    public final boolean j() {
        return this.F.get();
    }

    @Override // defpackage.t7h
    public final boolean k() {
        return this.I;
    }

    @Override // defpackage.t7h
    public final void l(r76 r76Var, e8h e8hVar) {
        this.m.execute(new nud(11, this, e8hVar, r76Var));
    }

    @Override // defpackage.t7h
    public final void m() {
        this.m.execute(new v7h(this, 3));
    }

    @Override // defpackage.t7h
    public final t7h n() {
        ad4 ad4Var = this.N;
        ad4Var.I(1, "shutdownNow() called");
        ad4Var.I(1, "shutdown() called");
        boolean compareAndSet = this.F.compareAndSet(false, true);
        g8h g8hVar = this.P;
        vq6 vq6Var = this.m;
        if (compareAndSet) {
            vq6Var.execute(new v7h(this, 4));
            g8hVar.d.m.execute(new d8h(g8hVar, 0));
            vq6Var.execute(new v7h(this, 0));
        }
        g8hVar.d.m.execute(new d8h(g8hVar, 1));
        vq6Var.execute(new v7h(this, 5));
        return this;
    }

    public final void r(boolean z) {
        ScheduledFuture scheduledFuture;
        o1o o1oVar = this.a0;
        o1oVar.f = false;
        if (!z || (scheduledFuture = o1oVar.g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        o1oVar.g = null;
    }

    public final void s() {
        this.m.e();
        if (this.F.get() || this.y) {
            return;
        }
        if (((Set) this.Y.a).isEmpty()) {
            u();
        } else {
            r(false);
        }
        if (this.w != null) {
            return;
        }
        this.N.I(2, "Exiting idle mode");
        a8h a8hVar = new a8h(this);
        nnk nnkVar = this.e;
        nnkVar.getClass();
        a8hVar.a = new kkp(nnkVar, a8hVar);
        this.w = a8hVar;
        this.u.K(new b8h(this, a8hVar, this.u));
        this.v = true;
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.n(this.a.c, "logId");
        Y.q(this.b, "target");
        return Y.toString();
    }

    public final void u() {
        long j = this.q;
        if (j == -1) {
            return;
        }
        o1o o1oVar = this.a0;
        o1oVar.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(j);
        long a = o1oVar.d.a() + nanos;
        o1oVar.f = true;
        if (a - o1oVar.e < 0 || o1oVar.g == null) {
            ScheduledFuture scheduledFuture = o1oVar.g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            o1oVar.g = o1oVar.a.schedule(new n1o(o1oVar, 1), nanos, TimeUnit.NANOSECONDS);
        }
        o1oVar.e = a;
    }

    public final void v(boolean z) {
        this.m.e();
        if (z) {
            o2g.U("nameResolver is not started", this.v);
            o2g.U("lbHelper is null", this.w != null);
        }
        xco xcoVar = this.u;
        if (xcoVar != null) {
            xcoVar.I();
            this.v = false;
            if (z) {
                String str = this.b;
                owi owiVar = this.c;
                rd2 rd2Var = this.d;
                this.f.a.getClass();
                this.u = t(str, owiVar, rd2Var, Collections.singleton(InetSocketAddress.class));
            } else {
                this.u = null;
            }
        }
        a8h a8hVar = this.w;
        if (a8hVar != null) {
            kkp kkpVar = a8hVar.a;
            ((ceg) kkpVar.c).y();
            kkpVar.c = null;
            this.w = null;
        }
        this.x = null;
    }
}
