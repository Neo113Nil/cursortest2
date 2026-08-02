package defpackage;

/* loaded from: classes.dex */
public final class go7 implements fih {
    public final lrh a;
    public final fsb b;
    public at2 c;
    public fih d;
    public boolean e = true;
    public boolean f;

    public go7(fsb fsbVar, dzr dzrVar) {
        this.b = fsbVar;
        this.a = new lrh(dzrVar);
    }

    public final void a(at2 at2Var) {
        fih fihVar;
        fih j = at2Var.j();
        if (j == null || j == (fihVar = this.d)) {
            return;
        }
        if (fihVar != null) {
            throw new pqb(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = j;
        this.c = at2Var;
        j.r((p0l) this.a.e);
    }

    @Override // defpackage.fih
    public final p0l m() {
        fih fihVar = this.d;
        return fihVar != null ? fihVar.m() : (p0l) this.a.e;
    }

    @Override // defpackage.fih
    public final void r(p0l p0lVar) {
        fih fihVar = this.d;
        if (fihVar != null) {
            fihVar.r(p0lVar);
            p0lVar = this.d.m();
        }
        this.a.r(p0lVar);
    }

    @Override // defpackage.fih
    public final boolean s() {
        if (this.e) {
            this.a.getClass();
            return false;
        }
        fih fihVar = this.d;
        fihVar.getClass();
        return fihVar.s();
    }

    @Override // defpackage.fih
    public final long t() {
        if (this.e) {
            return this.a.t();
        }
        fih fihVar = this.d;
        fihVar.getClass();
        return fihVar.t();
    }
}
