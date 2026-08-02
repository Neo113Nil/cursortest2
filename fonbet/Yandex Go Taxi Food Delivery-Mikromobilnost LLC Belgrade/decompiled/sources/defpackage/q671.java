package defpackage;

/* loaded from: classes7.dex */
public final class q671 {
    public final String a;
    public int b;
    public long c;
    public final v281 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ x971 g;

    public q671(x971 x971Var, String str, int i, v281 v281Var) {
        this.g = x971Var;
        this.a = str;
        this.b = i;
        this.c = v281Var == null ? -1L : v281Var.d;
        if (v281Var == null || !v281Var.a()) {
            return;
        }
        this.d = v281Var;
    }

    public final boolean a(wc71 wc71Var) {
        long j = this.c;
        if (j == -1) {
            return false;
        }
        v281 v281Var = wc71Var.d;
        yn81 yn81Var = wc71Var.b;
        if (v281Var == null) {
            return this.b != wc71Var.c;
        }
        if (v281Var.d > j) {
            return true;
        }
        v281 v281Var2 = this.d;
        if (v281Var2 == null) {
            return false;
        }
        int i = v281Var2.b;
        int a = yn81Var.a(v281Var.a);
        int a2 = yn81Var.a(v281Var2.a);
        if (v281Var.d < v281Var2.d || a < a2) {
            return false;
        }
        if (a > a2) {
            return true;
        }
        if (!v281Var.a()) {
            int i2 = v281Var.e;
            return i2 == -1 || i2 > i;
        }
        int i3 = v281Var.b;
        int i4 = v281Var.c;
        if (i3 <= i) {
            return i3 == i && i4 > v281Var2.c;
        }
        return true;
    }
}
