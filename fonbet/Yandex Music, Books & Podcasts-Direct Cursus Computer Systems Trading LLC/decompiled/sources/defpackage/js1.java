package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class js1 extends j66 {
    public final /* synthetic */ kr1 n;

    public js1(kr1 kr1Var) {
        this.n = kr1Var;
    }

    @Override // defpackage.j66
    public final boolean I(int i, int i2) {
        kr1 kr1Var = this.n;
        Object obj = ((List) kr1Var.c).get(i);
        Object obj2 = ((List) kr1Var.d).get(i2);
        if (obj != null && obj2 != null) {
            return ((up6) ((ls1) kr1Var.f).b.c).o(obj, obj2);
        }
        if (obj == null && obj2 == null) {
            return true;
        }
        wvs.b();
        return false;
    }

    @Override // defpackage.j66
    public final boolean J(int i, int i2) {
        kr1 kr1Var = this.n;
        Object obj = ((List) kr1Var.c).get(i);
        Object obj2 = ((List) kr1Var.d).get(i2);
        return (obj == null || obj2 == null) ? obj == null && obj2 == null : ((up6) ((ls1) kr1Var.f).b.c).p(obj, obj2);
    }

    @Override // defpackage.j66
    public final Object T(int i, int i2) {
        kr1 kr1Var = this.n;
        Object obj = ((List) kr1Var.c).get(i);
        Object obj2 = ((List) kr1Var.d).get(i2);
        if (obj != null && obj2 != null) {
            return ((up6) ((ls1) kr1Var.f).b.c).v(obj, obj2);
        }
        wvs.b();
        return null;
    }

    @Override // defpackage.j66
    public final int Z() {
        return ((List) this.n.d).size();
    }

    @Override // defpackage.j66
    public final int a0() {
        return ((List) this.n.c).size();
    }
}
