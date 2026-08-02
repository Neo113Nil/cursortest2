package defpackage;

/* loaded from: classes7.dex */
public final class yr81 implements z971 {
    public final hv81 a;
    public final bc71 b;
    public final nr41 c;
    public boolean d;

    public yr81(i971 i971Var, hv81 hv81Var, bc71 bc71Var) {
        nr41 nr41Var = new nr41(8, i971Var);
        this.a = hv81Var;
        this.b = bc71Var;
        this.c = nr41Var;
    }

    @Override // defpackage.z971
    public final void c(long j, long j2) {
        if (this.d || j2 <= 0 || !this.c.h()) {
            return;
        }
        this.d = true;
        ek71 ek71Var = this.b.a.a;
        ek71Var.v();
        this.a.a.d(ek71Var.V, j);
    }
}
