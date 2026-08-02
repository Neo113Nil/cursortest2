package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fpc extends cw7 implements ofp, amd, yr5, ekj, w9t {
    public static final fs7 x = new fs7(23);
    public uoi q;
    public final Function1 r;
    public poc s;
    public auf t;
    public f8j u;
    public final dpc v;
    public ypb w;

    public fpc(uoi uoiVar, int i, m5 m5Var) {
        this.q = uoiVar;
        this.r = m5Var;
        dpc dpcVar = new dpc(i, 4, new le0(2, this, fpc.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 15));
        S0(dpcVar);
        this.v = dpcVar;
    }

    @Override // defpackage.amd
    public final void G(f8j f8jVar) {
        gpc W0;
        this.u = f8jVar;
        if (this.v.U0().b()) {
            if (!f8jVar.b1().n) {
                gpc W02 = W0();
                if (W02 != null) {
                    W02.S0(null);
                    return;
                }
                return;
            }
            f8j f8jVar2 = this.u;
            if (f8jVar2 == null || !f8jVar2.b1().n || (W0 = W0()) == null) {
                return;
            }
            W0.S0(this.u);
        }
    }

    @Override // defpackage.ekj
    public final void J() {
        xqn xqnVar = new xqn();
        neg.y(this, new ssb(xqnVar, this, 2));
        auf aufVar = (auf) xqnVar.a;
        if (this.v.U0().b()) {
            auf aufVar2 = this.t;
            if (aufVar2 != null) {
                aufVar2.b();
            }
            if (aufVar != null) {
                aufVar.a();
            } else {
                aufVar = null;
            }
            this.t = aufVar;
        }
    }

    @Override // defpackage.xci
    public final void M0() {
        auf aufVar = this.t;
        if (aufVar != null) {
            aufVar.b();
        }
        this.t = null;
    }

    public final void V0(uoi uoiVar, tre treVar) {
        if (!this.n) {
            uoiVar.b(treVar);
            return;
        }
        r2f r2fVar = (r2f) ((tf6) G0()).a.get(o6c.l);
        x97.y(G0(), null, null, new akc(uoiVar, treVar, r2fVar != null ? r2fVar.R(new sea(10, uoiVar, treVar)) : null, null, 5), 3);
    }

    public final gpc W0() {
        if (!this.n) {
            return null;
        }
        w9t E = q7g.E(this, gpc.p);
        if (E instanceof gpc) {
            return (gpc) E;
        }
        return null;
    }

    @Override // defpackage.ofp
    public final void X(jfp jfpVar) {
        boolean b = this.v.U0().b();
        s9f[] s9fVarArr = wfp.a;
        xfp xfpVar = ufp.k;
        s9f s9fVar = wfp.a[4];
        Boolean valueOf = Boolean.valueOf(b);
        xfpVar.getClass();
        jfpVar.o(xfpVar, valueOf);
        if (this.w == null) {
            this.w = new ypb(3, this);
        }
        jfpVar.o(hfp.v, new sa(null, this.w));
    }

    public final void X0(uoi uoiVar) {
        poc pocVar;
        if (Intrinsics.d(this.q, uoiVar)) {
            return;
        }
        uoi uoiVar2 = this.q;
        if (uoiVar2 != null && (pocVar = this.s) != null) {
            uoiVar2.b(new qoc(pocVar));
        }
        this.s = null;
        this.q = uoiVar;
    }

    @Override // defpackage.w9t
    public final Object h() {
        return x;
    }
}
