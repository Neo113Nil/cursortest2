package defpackage;

import androidx.lifecycle.v;

/* loaded from: classes10.dex */
public class wv00 extends ch10 {
    public final Object m;
    public final ims n;
    public v o;

    public wv00(Object obj, ims imsVar) {
        this.m = obj;
        this.n = imsVar;
    }

    @Override // androidx.lifecycle.v
    public final Object d() {
        v vVar = this.o;
        return vVar == null ? this.m : this.n.mo104apply(vVar.d());
    }

    public final void o(v vVar) {
        bh10 bh10Var;
        v vVar2 = this.o;
        if (vVar2 != null && (bh10Var = (bh10) this.l.b(vVar2)) != null) {
            bh10Var.a.j(bh10Var);
        }
        this.o = vVar;
        tob1.g(new p500(8, this, vVar));
    }
}
