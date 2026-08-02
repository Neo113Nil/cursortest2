package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class gha extends bfu {
    public final xdr k = ydr.a(iha.b);
    public final xdr l = ydr.a(null);
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final xdr q;
    public final xdr r;

    public gha() {
        bdt I = hag.I(zx4.class);
        l18 l18Var = l18.b;
        this.m = l18Var.b(I, true);
        this.n = l18Var.b(hag.I(z66.class), true);
        this.o = btf.b(new yg6(25, this));
        this.p = btf.b(new bv7(23));
        c5b c5bVar = c5b.a;
        this.q = ydr.a(c5bVar);
        this.r = ydr.a(c5bVar);
        x97.y(ot0.F(this), null, null, new f98(this, null, 12), 3);
    }

    public static final void G(gha ghaVar, tga tgaVar) {
        xdr xdrVar = ghaVar.q;
        ghaVar.H().getClass();
        tgaVar.getClass();
        xdrVar.l(u75.h(new pbc(tgaVar == tga.d), new mbc(tgaVar == tga.b), new kbc(tgaVar == tga.c)));
    }

    public static List J(List list, tga tgaVar) {
        int ordinal = tgaVar.ordinal();
        if (ordinal == 0) {
            return CollectionsKt.o0(list, new zda(2));
        }
        if (ordinal == 1) {
            return CollectionsKt.o0(list, new zda(3));
        }
        if (ordinal == 2) {
            return CollectionsKt.o0(list, new zda(1));
        }
        if (ordinal == 3) {
            return CollectionsKt.o0(list, new zda(4));
        }
        b6e.s();
        return null;
    }

    public static final void a(gha ghaVar, tga tgaVar) {
        xdr xdrVar = ghaVar.r;
        ghaVar.H().getClass();
        tgaVar.getClass();
        xdrVar.l(u75.h(new pbc(tgaVar == tga.d), new kbc(tgaVar == tga.c)));
    }

    public final hha H() {
        return (hha) this.p.getValue();
    }
}
