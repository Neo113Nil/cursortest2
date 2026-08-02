package defpackage;

/* loaded from: classes4.dex */
public final class g64 {
    public final frt a;
    public final afw b;
    public final odd c;
    public final dk4 d;
    public final c74 e;
    public boolean f;
    public final mm6 g = hld.r(new yiq(), dm6.b());
    public final xdr h;
    public final xdr i;
    public final xdr j;

    public g64(frt frtVar, afw afwVar, odd oddVar, dk4 dk4Var, c74 c74Var) {
        this.a = frtVar;
        this.b = afwVar;
        this.c = oddVar;
        this.d = dk4Var;
        this.e = c74Var;
        h74 a = a(gfw.a, false, false);
        this.h = ydr.a(a == null ? h74.d : a);
        this.i = ydr.a(r64.a);
        yxc E = v3g.E(frtVar);
        this.j = ydr.a((E.a.d && E.h) ? new a74(true) : new a74(false));
    }

    public static h74 a(gfw gfwVar, boolean z, boolean z2) {
        if (z) {
            return h74.a;
        }
        if (z2) {
            return h74.b;
        }
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        if (!((Boolean) ((qgw) ((byb) qdcVar.C(I)).c(ern.a(qgw.class))).e.getValue()).booleanValue()) {
            return h74.d;
        }
        int ordinal = gfwVar.ordinal();
        if (ordinal == 0) {
            return h74.d;
        }
        if (ordinal == 1) {
            return h74.c;
        }
        if (ordinal == 2) {
            return null;
        }
        if (ordinal == 3) {
            return h74.d;
        }
        if (ordinal == 4) {
            return h74.d;
        }
        b6e.s();
        return null;
    }
}
