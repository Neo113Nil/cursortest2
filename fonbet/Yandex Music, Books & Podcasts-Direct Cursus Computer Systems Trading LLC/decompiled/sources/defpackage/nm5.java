package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class nm5 extends AtomicReference implements jm5, ka8, Runnable {
    private static final long serialVersionUID = 7000911171163930287L;
    public final jm5 a;
    public final khp b = new khp();
    public final fm5 c;

    public nm5(jm5 jm5Var, fm5 fm5Var) {
        this.a = jm5Var;
        this.c = fm5Var;
    }

    @Override // defpackage.ka8
    public final void a() {
        ra8.b(this);
        this.b.a();
    }

    @Override // defpackage.jm5, defpackage.xeh
    public final void b(ka8 ka8Var) {
        ra8.g(this, ka8Var);
    }

    @Override // defpackage.jm5, defpackage.xeh
    public final void onComplete() {
        this.a.onComplete();
    }

    @Override // defpackage.jm5, defpackage.xeh
    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this);
    }
}
