package defpackage;

/* loaded from: classes.dex */
public final class vs3 {
    public Object a;
    public ys3 b;
    public h2o c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        ys3 ys3Var = this.b;
        if (ys3Var == null || !ys3Var.b.l(obj)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void b(Throwable th) {
        this.d = true;
        ys3 ys3Var = this.b;
        if (ys3Var == null || !ys3Var.b.m(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        h2o h2oVar;
        ys3 ys3Var = this.b;
        if (ys3Var != null) {
            xs3 xs3Var = ys3Var.b;
            if (!xs3Var.isDone()) {
                xs3Var.m(new h6("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 2));
            }
        }
        if (this.d || (h2oVar = this.c) == null) {
            return;
        }
        h2oVar.l(null);
    }
}
