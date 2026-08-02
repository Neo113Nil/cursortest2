package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class uru extends bfu {
    public final squ k;
    public final frt l;
    public final g0l m;
    public final kxi n;
    public final uiq o;
    public final x0q p;
    public final dkn q;
    public final x0q r;
    public final dkn s;
    public final xdr t;
    public final fkn u;
    public rar v;
    public rar w;
    public rar x;
    public rar y;

    public uru(squ squVar, frt frtVar, oq7 oq7Var, g0l g0lVar, kxi kxiVar, uiq uiqVar) {
        frtVar.getClass();
        oq7Var.getClass();
        g0lVar.getClass();
        this.k = squVar;
        this.l = frtVar;
        this.m = g0lVar;
        this.n = kxiVar;
        this.o = uiqVar;
        x0q b = y0q.b(0, 1, null, 5);
        this.p = b;
        this.q = new dkn(b);
        x0q b2 = y0q.b(0, 1, null, 5);
        this.r = b2;
        this.s = new dkn(b2);
        xdr a = ydr.a(new rru(false, false));
        this.t = a;
        this.u = zsd.F0(new u21(10, a, oq7Var.a.c, new laq(3, 5, (Continuation) null)), ot0.F(this), new hdr(5000L, Long.MAX_VALUE), new rru(false, false));
        K();
    }

    public static final void G(uru uruVar, boolean z) {
        Object value;
        Object qruVar;
        xdr xdrVar = uruVar.t;
        do {
            value = xdrVar.getValue();
            tru truVar = (tru) value;
            if (truVar instanceof pru) {
                qruVar = new pru(((pru) truVar).a, z);
            } else if (truVar instanceof rru) {
                qruVar = new rru(((rru) truVar).a, z);
            } else if (truVar instanceof sru) {
                qruVar = sru.a((sru) truVar, false, null, z, 3);
            } else {
                if (!(truVar instanceof qru)) {
                    b6e.s();
                    return;
                }
                qruVar = new qru(z);
            }
        } while (!xdrVar.k(value, qruVar));
    }

    public static final void H(uru uruVar, Function1 function1) {
        Object value;
        tru truVar;
        xdr xdrVar = uruVar.t;
        do {
            value = xdrVar.getValue();
            truVar = (tru) value;
            if (!(truVar instanceof pru) && !(truVar instanceof rru)) {
                if (truVar instanceof sru) {
                    sru sruVar = (sru) function1.invoke(truVar);
                    boolean isEmpty = sruVar.b.isEmpty();
                    tru truVar2 = sruVar;
                    if (isEmpty) {
                        truVar2 = new pru(((sru) truVar).a, false);
                    }
                    truVar = truVar2;
                } else if (!(truVar instanceof qru)) {
                    b6e.s();
                    return;
                }
            }
        } while (!xdrVar.k(value, truVar));
    }

    public static final void a(uru uruVar, boolean z) {
        Object value;
        Object obj;
        Object rruVar;
        xdr xdrVar = uruVar.t;
        do {
            value = xdrVar.getValue();
            obj = (tru) value;
            if (obj instanceof pru) {
                rruVar = new pru(z, ((pru) obj).b);
            } else if (obj instanceof rru) {
                rruVar = new rru(z, ((rru) obj).b);
            } else if (obj instanceof sru) {
                obj = sru.a((sru) obj, z, null, false, 6);
            } else if (!(obj instanceof qru)) {
                b6e.s();
                return;
            }
            obj = rruVar;
        } while (!xdrVar.k(value, obj));
    }

    public final void J(lgq lgqVar) {
        rar rarVar = this.v;
        if (rarVar == null || !rarVar.b()) {
            this.v = x97.y(ot0.F(this), null, null, new npt(this, lgqVar, (Continuation) null, 17), 3);
        }
    }

    public final void K() {
        rar rarVar = this.w;
        if (rarVar == null || !rarVar.b()) {
            this.w = x97.y(ot0.F(this), null, null, new npt(this, null, 19), 3);
        }
    }
}
