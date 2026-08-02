package defpackage;

/* loaded from: classes6.dex */
public final class anf {
    public final int a;
    public final zx0 b;

    public anf(int i) {
        this.a = i;
        this.b = new zx0(i + 1);
    }

    public final synchronized void a(inn innVar) {
        this.b.addLast(innVar);
        zx0 zx0Var = this.b;
        if (zx0Var.c > this.a) {
            zx0Var.removeFirst();
        }
    }
}
