package defpackage;

/* loaded from: classes.dex */
public final class sgg extends voi {
    public final dzw l;
    public Object m;
    public tgg n;

    public sgg(dzw dzwVar) {
        this.l = dzwVar;
        if (dzwVar.a == null) {
            dzwVar.a = this;
        } else {
            xq0.q("There is already a listener registered");
            throw null;
        }
    }

    @Override // defpackage.qdg
    public final void h() {
        dzw dzwVar = this.l;
        dzwVar.b = true;
        dzwVar.d = false;
        dzwVar.c = false;
        dzwVar.i.drainPermits();
        dzwVar.c();
    }

    @Override // defpackage.qdg
    public final void i() {
        this.l.b = false;
    }

    @Override // defpackage.qdg
    public final void j(xjj xjjVar) {
        super.j(xjjVar);
        this.m = null;
        this.n = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [dzf, java.lang.Object] */
    public final void n() {
        ?? r0 = this.m;
        tgg tggVar = this.n;
        if (r0 == 0 || tggVar == null) {
            return;
        }
        super.j(tggVar);
        f(r0, tggVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        Class<?> cls = this.l.getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append("}}");
        return sb.toString();
    }
}
