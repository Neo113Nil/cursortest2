package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class w4h extends xci implements amd, ipa, ofp, ekj {
    public uif o;
    public uif p;
    public utk q;
    public View r;
    public jx7 s;
    public ttk t;
    public zx7 v;
    public hqe x;
    public zi3 y;
    public final x6k u = new x6k(null, wvo.e);
    public long w = 9205357640488583168L;

    /* JADX WARN: Multi-variable type inference failed */
    public w4h(Function1 function1, Function1 function12, utk utkVar) {
        this.o = (uif) function1;
        this.p = (uif) function12;
        this.q = utkVar;
    }

    @Override // defpackage.amd
    public final void G(f8j f8jVar) {
        this.u.setValue(f8jVar);
    }

    @Override // defpackage.ekj
    public final void J() {
        neg.y(this, new v4h(this, 2));
    }

    @Override // defpackage.xci
    public final void K0() {
        J();
        this.y = men.g(0, 7, null);
        x97.y(G0(), null, pm6.d, new jmd(this, null, 23), 1);
    }

    @Override // defpackage.xci
    public final void L0() {
        ttk ttkVar = this.t;
        if (ttkVar != null) {
            ((vtk) ttkVar).b();
        }
        this.t = null;
    }

    public final long S0() {
        if (this.v == null) {
            this.v = szf.U(new v4h(this, 0));
        }
        zx7 zx7Var = this.v;
        if (zx7Var != null) {
            return ((enj) zx7Var.getValue()).a;
        }
        return 9205357640488583168L;
    }

    public final void T0() {
        ttk ttkVar = this.t;
        if (ttkVar != null) {
            ((vtk) ttkVar).b();
        }
        View view = this.r;
        if (view == null) {
            view = kg5.I(this);
        }
        this.r = view;
        jx7 jx7Var = this.s;
        if (jx7Var == null) {
            jx7Var = bcx.F(this).y;
        }
        this.s = jx7Var;
        this.t = this.q.a(view, jx7Var);
        V0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, uif] */
    public final void U0() {
        jx7 jx7Var = this.s;
        if (jx7Var == null) {
            jx7Var = bcx.F(this).y;
            this.s = jx7Var;
        }
        long j = ((enj) this.o.invoke(jx7Var)).a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & S0()) == 9205357640488583168L) {
            this.w = 9205357640488583168L;
            ttk ttkVar = this.t;
            if (ttkVar != null) {
                ((vtk) ttkVar).b();
                return;
            }
            return;
        }
        this.w = enj.h(S0(), j);
        if (this.t == null) {
            T0();
        }
        ttk ttkVar2 = this.t;
        if (ttkVar2 != null) {
            ttkVar2.a(this.w, 9205357640488583168L);
        }
        V0();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.functions.Function1, uif] */
    public final void V0() {
        jx7 jx7Var;
        ttk ttkVar = this.t;
        if (ttkVar == null || (jx7Var = this.s) == null) {
            return;
        }
        vtk vtkVar = (vtk) ttkVar;
        long c = vtkVar.c();
        hqe hqeVar = this.x;
        if (hqeVar != null && c == hqeVar.a) {
            return;
        }
        this.p.invoke(new fma(jx7Var.m(nt0.Q(vtkVar.c()))));
        this.x = new hqe(vtkVar.c());
    }

    @Override // defpackage.ofp
    public final void X(jfp jfpVar) {
        jfpVar.o(x4h.a, new v4h(this, 1));
    }

    @Override // defpackage.ipa
    public final void t0(opf opfVar) {
        opfVar.a();
        zi3 zi3Var = this.y;
        if (zi3Var != null) {
            zi3Var.c(Unit.a);
        }
    }
}
