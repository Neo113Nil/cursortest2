package defpackage;

/* loaded from: classes4.dex */
public final class vmr implements h6s {
    public final w55 a;
    public final int b;
    public final int c;

    public vmr(w55 w55Var, int i, int i2) {
        this.a = w55Var;
        this.b = i;
        if (i < 0) {
            e7o.o(dfi.c(i, "Start index ", " < 0"));
            throw null;
        }
        int i3 = w55Var.b;
        if (i2 > i3) {
            e7o.o(f1d.e(i2, i3, "End index ", " > size "));
            throw null;
        }
        if (i <= i2) {
            this.c = i2 - i;
        } else {
            e7o.o(f1d.e(i, i2, "Start index ", " > end index "));
            throw null;
        }
    }

    @Override // defpackage.h6s
    public final int f() {
        return this.c;
    }

    @Override // defpackage.h6s
    public final Object get(int i) {
        if (i < 0) {
            e7o.o(k5r.i(i, "Index "));
            return null;
        }
        int i2 = this.c;
        if (i < i2) {
            return this.a.a.get(i + this.b);
        }
        e7o.o(f1d.e(i, i2, "Index ", " with size "));
        return null;
    }
}
