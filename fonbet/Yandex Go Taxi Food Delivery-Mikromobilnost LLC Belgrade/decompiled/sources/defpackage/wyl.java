package defpackage;

/* loaded from: classes2.dex */
public final class wyl extends yr31 implements mlr {
    public final v1m0 b;

    public wyl(v1m0 v1m0Var) {
        this.b = v1m0Var;
    }

    @Override // defpackage.mlr
    public final void m(Object obj, String str) {
        this.b.a(str, obj);
    }

    @Override // defpackage.mlr
    public final Object w(String str) {
        v1m0 v1m0Var = this.b;
        Object c = v1m0Var.b.c(str);
        if (v1m0Var.a.remove(str) != null) {
            ny61.u();
            return null;
        }
        if (c == null) {
            return null;
        }
        return c;
    }
}
