package defpackage;

/* loaded from: classes3.dex */
public final class ep9 implements xfu {
    public final e23 a;
    public final qg8 b;
    public final yb8 c;
    public final w1a d;
    public final lp9 e;
    public vo9 f;
    public int g = -1;

    public ep9(e23 e23Var, qg8 qg8Var, yb8 yb8Var, w1a w1aVar, lp9 lp9Var, vo9 vo9Var) {
        this.a = e23Var;
        this.b = qg8Var;
        this.c = yb8Var;
        this.d = w1aVar;
        this.e = lp9Var;
        this.f = vo9Var;
    }

    @Override // defpackage.xfu
    public final void b(int i) {
        this.c.c(i);
        d(i);
    }

    public final void d(int i) {
        e23 e23Var = this.a;
        gc8 gc8Var = e23Var.a;
        int i2 = this.g;
        if (i == i2) {
            return;
        }
        w1a w1aVar = this.d;
        lp9 lp9Var = this.e;
        if (i2 != -1) {
            jc8 jc8Var = ((ro9) this.f.q.get(i2)).a;
            w1aVar.getClass();
            w1a.f(e23Var, lp9Var, jc8Var, new r1a(w1aVar, e23Var, 0));
            gc8Var.Y(lp9Var);
        }
        ro9 ro9Var = (ro9) this.f.q.get(i);
        jc8 jc8Var2 = ro9Var.a;
        w1aVar.getClass();
        w1a.f(e23Var, lp9Var, jc8Var2, new r1a(w1aVar, e23Var, 1));
        gc8Var.u(lp9Var, ro9Var.a);
        this.g = i;
    }

    @Override // defpackage.xfu
    public final void c(int i) {
    }

    @Override // defpackage.xfu
    public final void a(int i, float f, int i2) {
    }
}
