package defpackage;

/* loaded from: classes.dex */
public final class d8x implements Runnable {
    public final j8x a;
    public final a9x b;

    public d8x(j8x j8xVar, a9x a9xVar) {
        this.a = j8xVar;
        this.b = a9xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        a9x a9xVar = this.b;
        if (j8x.f.X(this.a, this, j8x.f(a9xVar))) {
            j8x.h(this.a);
        }
    }
}
