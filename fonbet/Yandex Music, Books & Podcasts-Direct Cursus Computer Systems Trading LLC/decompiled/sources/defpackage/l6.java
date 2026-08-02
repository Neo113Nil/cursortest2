package defpackage;

/* loaded from: classes3.dex */
public final class l6 implements Runnable {
    public final v6 a;
    public final lcg b;

    public l6(v6 v6Var, lcg lcgVar) {
        this.a = v6Var;
        this.b = lcgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a != this) {
            return;
        }
        if (v6.f.B(this.a, this, v6.i(this.b))) {
            v6.f(this.a, false);
        }
    }
}
