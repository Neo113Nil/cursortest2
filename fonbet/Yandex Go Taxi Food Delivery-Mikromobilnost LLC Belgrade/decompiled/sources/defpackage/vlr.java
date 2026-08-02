package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class vlr {
    public final String a;
    public final hir b;
    public final t6o c;
    public final g0p d;
    public final q3l0 e;
    public final bki0 f;
    public final xxw0 g;
    public final szl h;
    public final List i;
    public final List j;
    public final k6x k;
    public final jp50 l;
    public final fxl m;
    public final p0m n;
    public final List o;
    public final xei0 p;
    public final pav q;
    public final jn11 r;
    public final o631 s;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ vlr(java.lang.String r23, defpackage.hir r24, defpackage.t6o r25, defpackage.g0p r26, defpackage.q3l0 r27, defpackage.bki0 r28, defpackage.zgl r29, defpackage.szl r30, java.util.List r31, java.util.List r32, defpackage.k6x r33, defpackage.jp50 r34, defpackage.fxl r35, defpackage.p0m r36, java.util.List r37, defpackage.xei0 r38, defpackage.ynq r39, defpackage.jn11 r40, defpackage.o631 r41, int r42) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vlr.<init>(java.lang.String, hir, t6o, g0p, q3l0, bki0, zgl, szl, java.util.List, java.util.List, k6x, jp50, fxl, p0m, java.util.List, xei0, ynq, jn11, o631, int):void");
    }

    public static vlr a(vlr vlrVar, String str, q3l0 q3l0Var, int i) {
        String str2 = (i & 1) != 0 ? vlrVar.a : str;
        vlrVar.getClass();
        hir hirVar = vlrVar.b;
        t6o t6oVar = vlrVar.c;
        g0p g0pVar = vlrVar.d;
        bki0 bki0Var = vlrVar.f;
        xxw0 xxw0Var = vlrVar.g;
        szl szlVar = vlrVar.h;
        List list = vlrVar.i;
        List list2 = vlrVar.j;
        k6x k6xVar = vlrVar.k;
        jp50 jp50Var = vlrVar.l;
        fxl fxlVar = vlrVar.m;
        p0m p0mVar = vlrVar.n;
        List list3 = vlrVar.o;
        xei0 xei0Var = vlrVar.p;
        pav pavVar = vlrVar.q;
        jn11 jn11Var = vlrVar.r;
        o631 o631Var = vlrVar.s;
        vlrVar.getClass();
        return new vlr(str2, hirVar, t6oVar, g0pVar, q3l0Var, bki0Var, xxw0Var, szlVar, list, list2, k6xVar, jp50Var, fxlVar, p0mVar, list3, xei0Var, pavVar, jn11Var, o631Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlr)) {
            return false;
        }
        vlr vlrVar = (vlr) obj;
        return jl40.l(this.a, vlrVar.a) && jl40.l(this.b, vlrVar.b) && jl40.l(this.c, vlrVar.c) && jl40.l(this.d, vlrVar.d) && jl40.l(this.e, vlrVar.e) && jl40.l(this.f, vlrVar.f) && jl40.l(this.g, vlrVar.g) && jl40.l(this.h, vlrVar.h) && jl40.l(this.i, vlrVar.i) && jl40.l(this.j, vlrVar.j) && jl40.l(this.k, vlrVar.k) && jl40.l(this.l, vlrVar.l) && jl40.l(this.m, vlrVar.m) && jl40.l(this.n, vlrVar.n) && jl40.l(this.o, vlrVar.o) && jl40.l(this.p, vlrVar.p) && jl40.l(this.q, vlrVar.q) && jl40.l(this.r, vlrVar.r) && jl40.l(this.s, vlrVar.s);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 31)) * 31;
        q3l0 q3l0Var = this.e;
        int hashCode2 = (hashCode + (q3l0Var == null ? 0 : q3l0Var.hashCode())) * 31;
        bki0 bki0Var = this.f;
        int hashCode3 = (hashCode2 + (bki0Var == null ? 0 : bki0Var.hashCode())) * 31;
        xxw0 xxw0Var = this.g;
        int hashCode4 = (hashCode3 + (xxw0Var == null ? 0 : xxw0Var.hashCode())) * 31;
        szl szlVar = this.h;
        int c = unr0.c((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + unr0.c(unr0.c((hashCode4 + (szlVar == null ? 0 : szlVar.hashCode())) * 31, 31, this.i), 31, this.j)) * 31)) * 31)) * 31)) * 31, 31, this.o);
        xei0 xei0Var = this.p;
        int hashCode5 = (c + (xei0Var == null ? 0 : xei0Var.hashCode())) * 31;
        pav pavVar = this.q;
        int hashCode6 = (this.r.hashCode() + ((hashCode5 + (pavVar == null ? 0 : pavVar.hashCode())) * 31)) * 31;
        o631 o631Var = this.s;
        return hashCode6 + (o631Var != null ? o631Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlexSdkConfig(componentOwner=");
        sb.append(this.a);
        sb.append(", feedMapiClient=null, divkitConfigurator=");
        sb.append(this.b);
        sb.append(", errorControllerFactory=");
        sb.append(this.c);
        sb.append(", externalDescriptors=");
        sb.append(this.d);
        sb.append(", routeHandlerFactory=");
        sb.append(this.e);
        sb.append(", recyclerViewConfigurator=");
        sb.append(this.f);
        sb.append(", swipeRefreshConfigurator=");
        sb.append(this.g);
        sb.append(", documentEventTracker=");
        sb.append(this.h);
        sb.append(", extraDocumentTrackers=");
        nnm.w(sb, this.i, ", documentPatchers=", this.j, ", jasonStateStore=");
        sb.append(this.k);
        sb.append(", networkCaching=");
        sb.append(this.l);
        sb.append(", documentCacheFallbacksProvider=");
        sb.append(this.m);
        sb.append(", documentLoaderInterceptorProvider=");
        sb.append(this.n);
        sb.append(", bduiInterceptors=");
        sb.append(this.o);
        sb.append(", realtimeAnalyticsConfig=");
        sb.append(this.p);
        sb.append(", imageLoader=");
        sb.append(this.q);
        sb.append(", typedDivKitSnippetFeature=");
        sb.append(this.r);
        sb.append(", velocityMonitoring=");
        sb.append(this.s);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public vlr(String str, hir hirVar, t6o t6oVar, g0p g0pVar, q3l0 q3l0Var, bki0 bki0Var, xxw0 xxw0Var, szl szlVar, List list, List list2, k6x k6xVar, jp50 jp50Var, fxl fxlVar, p0m p0mVar, List list3, xei0 xei0Var, pav pavVar, jn11 jn11Var, o631 o631Var) {
        this.a = str;
        this.b = hirVar;
        this.c = t6oVar;
        this.d = g0pVar;
        this.e = q3l0Var;
        this.f = bki0Var;
        this.g = xxw0Var;
        this.h = szlVar;
        this.i = list;
        this.j = list2;
        this.k = k6xVar;
        this.l = jp50Var;
        this.m = fxlVar;
        this.n = p0mVar;
        this.o = list3;
        this.p = xei0Var;
        this.q = pavVar;
        this.r = jn11Var;
        this.s = o631Var;
    }
}
