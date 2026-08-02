package defpackage;

/* loaded from: classes10.dex */
public final class ui6 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public int f;
    public int g;
    public final Object h;
    public final Object i;

    public ui6(dl81 dl81Var, dl81 dl81Var2, boolean z) {
        this.i = dl81Var;
        this.h = dl81Var2;
        this.e = z;
        dl81Var2.m(12);
        this.a = dl81Var2.v();
        dl81Var.m(12);
        this.g = dl81Var.v();
        nea1.a("first_chunk must be 1", dl81Var.a() == 1);
        this.b = -1;
    }

    public boolean a() {
        dl81 dl81Var = (dl81) this.i;
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        dl81 dl81Var2 = (dl81) this.h;
        this.d = this.e ? dl81Var2.w() : dl81Var2.t();
        if (this.b == this.f) {
            this.c = dl81Var.v();
            dl81Var.m(dl81Var.b + 4);
            int i2 = this.g - 1;
            this.g = i2;
            this.f = i2 > 0 ? dl81Var.v() - 1 : -1;
        }
        return true;
    }

    public boolean b() {
        ef90 ef90Var = (ef90) this.i;
        int i = this.b + 1;
        this.b = i;
        if (i == this.a) {
            return false;
        }
        ef90 ef90Var2 = (ef90) this.h;
        this.d = this.e ? ef90Var2.D() : ef90Var2.A();
        if (this.b == this.f) {
            this.c = ef90Var.C();
            ef90Var.L(4);
            int i2 = this.g - 1;
            this.g = i2;
            this.f = i2 > 0 ? ef90Var.C() - 1 : -1;
        }
        return true;
    }

    public ui6(ef90 ef90Var, ef90 ef90Var2, boolean z) {
        this.i = ef90Var;
        this.h = ef90Var2;
        this.e = z;
        ef90Var2.K(12);
        this.a = ef90Var2.C();
        ef90Var.K(12);
        this.g = ef90Var.C();
        aja1.b("first_chunk must be 1", ef90Var.k() == 1);
        this.b = -1;
    }
}
