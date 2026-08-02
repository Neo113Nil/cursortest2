package defpackage;

import android.app.Application;
import flex.engine.document.a;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class xpq {
    public final z1o A;
    public final xke B;
    public final jn11 C;
    public final r631 D;
    public final jul E;
    public final eul F;
    public final mw5 G;
    public final List H;
    public final vqq I;
    public final a851 J;
    public final Application a;
    public final m40 b;
    public final ctl c;
    public final lu00 d;
    public final vv2 e;
    public final xei0 f;
    public final vpq g;
    public final qeu h;
    public final pul i;
    public final g0p j;
    public final r3l0 k;
    public final t6o l;
    public final jah m;
    public final jp50 n;
    public final fxl o;
    public final xxw0 p;
    public final bki0 q;
    public final qxl r;
    public final o631 s;
    public final ow50 t;
    public final List u;
    public final aqq v;
    public final seu w;
    public final wjr x;
    public final o0m y;
    public final ra10 z;

    public xpq(Application application, m40 m40Var, ctl ctlVar, lu00 lu00Var, vv2 vv2Var, xei0 xei0Var, vpq vpqVar, qeu qeuVar, pul pulVar, g0p g0pVar, r3l0 r3l0Var, t6o t6oVar, jah jahVar, jp50 jp50Var, fxl fxlVar, xxw0 xxw0Var, bki0 bki0Var, qxl qxlVar, o631 o631Var, ow50 ow50Var, List list, aqq aqqVar, seu seuVar, wjr wjrVar, o0m o0mVar, ra10 ra10Var, z1o z1oVar, xke xkeVar, jn11 jn11Var, r631 r631Var, jul julVar, eul eulVar, mw5 mw5Var, List list2, vqq vqqVar, int i, int i2) {
        r631 r631Var2;
        jah jahVar2 = (i & 4096) != 0 ? new jah() : jahVar;
        qxl a = (131072 & i) != 0 ? a.a() : qxlVar;
        ow50 ow50Var2 = (524288 & i) != 0 ? new ow50() : ow50Var;
        seu seuVar2 = (8388608 & i) != 0 ? null : seuVar;
        wjr hwnVar = (16777216 & i) != 0 ? new hwn() : wjrVar;
        z1o z1oVar2 = (134217728 & i) != 0 ? new z1o() : z1oVar;
        xke xkeVar2 = (268435456 & i) != 0 ? null : xkeVar;
        if ((i & 1073741824) != 0) {
            new s631();
            if (o631Var == null) {
                ny61.g("Required value was null.");
                throw null;
            }
            r631Var2 = new r631(o631Var);
        } else {
            r631Var2 = r631Var;
        }
        mw5 g0x0Var = (i2 & 2) != 0 ? new g0x0() : mw5Var;
        List list3 = (i2 & 4) != 0 ? EmptyList.a : list2;
        vqq vqqVar2 = (i2 & 8) != 0 ? new vqq() : vqqVar;
        a851 a851Var = new a851(new s7s0(23));
        this.a = application;
        this.b = m40Var;
        this.c = ctlVar;
        this.d = lu00Var;
        this.e = vv2Var;
        this.f = xei0Var;
        this.g = vpqVar;
        this.h = qeuVar;
        this.i = pulVar;
        this.j = g0pVar;
        this.k = r3l0Var;
        this.l = t6oVar;
        this.m = jahVar2;
        this.n = jp50Var;
        this.o = fxlVar;
        this.p = xxw0Var;
        this.q = bki0Var;
        this.r = a;
        this.s = o631Var;
        this.t = ow50Var2;
        this.u = list;
        this.v = aqqVar;
        this.w = seuVar2;
        this.x = hwnVar;
        this.y = o0mVar;
        this.z = ra10Var;
        this.A = z1oVar2;
        this.B = xkeVar2;
        this.C = jn11Var;
        this.D = r631Var2;
        this.E = julVar;
        this.F = eulVar;
        this.G = g0x0Var;
        this.H = list3;
        this.I = vqqVar2;
        this.J = a851Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!xpq.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        xpq xpqVar = (xpq) obj;
        return jl40.l(this.a, xpqVar.a) && jl40.l(this.b, xpqVar.b) && jl40.l(this.c, xpqVar.c) && jl40.l(this.d, xpqVar.d) && jl40.l(this.e, xpqVar.e) && jl40.l(this.f, xpqVar.f) && jl40.l(this.g, xpqVar.g) && jl40.l(this.h, xpqVar.h) && jl40.l(this.i, xpqVar.i) && jl40.l(this.j, xpqVar.j) && jl40.l(this.k, xpqVar.k) && jl40.l(this.l, xpqVar.l) && jl40.l(this.m, xpqVar.m) && jl40.l(this.n, xpqVar.n) && jl40.l(this.o, xpqVar.o) && jl40.l(this.p, xpqVar.p) && jl40.l(this.q, xpqVar.q) && jl40.l(this.r, xpqVar.r) && jl40.l(this.s, xpqVar.s) && jl40.l(this.t, xpqVar.t) && jl40.l(this.u, xpqVar.u) && jl40.l(this.v, xpqVar.v) && jl40.l(this.w, xpqVar.w) && jl40.l(this.x, xpqVar.x) && jl40.l(this.y, xpqVar.y) && jl40.l(this.z, xpqVar.z) && jl40.l(this.A, xpqVar.A) && jl40.l(this.B, xpqVar.B) && jl40.l(this.C, xpqVar.C) && jl40.l(this.D, xpqVar.D) && jl40.l(this.E, xpqVar.E) && jl40.l(this.F, xpqVar.F) && jl40.l(this.G, xpqVar.G) && jl40.l(this.H, xpqVar.H) && jl40.l(this.I, xpqVar.I) && jl40.l(this.J, xpqVar.J);
    }

    public final int hashCode() {
        int hashCode = (this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        xxw0 xxw0Var = this.p;
        int hashCode2 = (hashCode + (xxw0Var != null ? xxw0Var.hashCode() : 0)) * 31;
        bki0 bki0Var = this.q;
        int hashCode3 = (this.s.hashCode() + ((this.r.hashCode() + ((hashCode2 + (bki0Var != null ? bki0Var.hashCode() : 0)) * 31)) * 31)) * 31;
        this.t.getClass();
        int c = unr0.c((Boolean.hashCode(false) + hashCode3) * 961, 31, this.u);
        aqq aqqVar = this.v;
        int hashCode4 = (c + (aqqVar != null ? aqqVar.hashCode() : 0)) * 31;
        seu seuVar = this.w;
        int hashCode5 = (this.y.hashCode() + ((this.x.hashCode() + ((hashCode4 + (seuVar != null ? seuVar.hashCode() : 0)) * 31)) * 31)) * 31;
        ra10 ra10Var = this.z;
        int hashCode6 = (this.A.hashCode() + ((hashCode5 + (ra10Var != null ? ra10Var.hashCode() : 0)) * 31)) * 31;
        xke xkeVar = this.B;
        return this.J.hashCode() + ((this.I.hashCode() + unr0.c((this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + ((this.D.hashCode() + ((this.C.hashCode() + ((hashCode6 + (xkeVar != null ? xkeVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.H)) * 31);
    }

    public final String toString() {
        return "FeedSdkDependencies(context=" + this.a + ", activityProvider=" + this.b + ", divkitConfigurationProvider=" + this.c + ", mapiClient=" + this.d + ", appMetricaFacadeFactory=" + this.e + ", realtimeAnalyticsConfig=" + this.f + ", config=" + this.g + ", healthFacade=" + this.h + ", divParseHealthFacade=" + this.i + ", externalDescriptors=" + this.j + ", actionRouter=" + this.k + ", issueMapper=" + this.m + ", networkCaching=" + this.n + ", documentCacheFallbacksProvider=" + this.o + ", swipeRefreshConfigurator=" + this.p + ", recyclerViewConfigurator=" + this.q + ", documentConverter=" + this.r + ", velocityMonitoring=" + this.s + ", networkLossRetryPolicy=" + this.t + ", advertisementUserData=null, documentPatchers=" + this.u + ", colorConverter=" + this.v + ", errorReporter=" + this.w + ", logHandler=" + this.x + ", documentLoaderInterceptor=" + this.y + ", advertisementHostProvider=" + this.z + ", engineLifecycleCallbacks=" + this.A + ", continueIndicatorFactory=" + this.B + ", typedDivKitSnippetFeature=" + this.C + ", velocityMonitoringFacade=" + this.D + ", divKitViewHolderFactoryWithTypes=" + this.E + ", divKitViewHolderFactory=" + this.F + ", divkitBindingMethod=" + this.G + ", externalRemoteTrackerSerializerSelectors=" + this.H + ", sectionParallelDecodingConfig=" + this.I + ", windowMetricsCalculatorFeature=" + this.J + Extension.C_BRAKE;
    }
}
