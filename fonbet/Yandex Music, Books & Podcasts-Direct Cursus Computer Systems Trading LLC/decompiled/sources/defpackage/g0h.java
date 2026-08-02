package defpackage;

/* loaded from: classes.dex */
public final class g0h extends ck7 {
    public q7b d;

    @Override // defpackage.ck7
    public final int b(Object obj) {
        k2o k2oVar = (k2o) obj;
        if (k2oVar == null) {
            return 1;
        }
        return k2oVar.f();
    }

    @Override // defpackage.ck7
    public final void c(Object obj, Object obj2) {
        k2o k2oVar = (k2o) obj2;
        q7b q7bVar = this.d;
        if (q7bVar == null || k2oVar == null) {
            return;
        }
        q7bVar.e.H(k2oVar, true);
    }
}
