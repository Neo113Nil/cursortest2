package defpackage;

/* loaded from: classes3.dex */
public final class nc6 extends jcc {
    public long f;
    public long g;
    public om3 h;

    @Override // defpackage.jcc, defpackage.u97
    public final void Q(aa7 aa7Var, om3 om3Var) {
        int i = om3Var.c;
        long j = this.f;
        long min = Math.min(j - this.g, i);
        om3 om3Var2 = this.h;
        om3Var.g(om3Var2, (int) min);
        int i2 = om3Var2.c;
        super.Q(aa7Var, om3Var2);
        this.g += i2 - om3Var2.c;
        om3Var2.f(om3Var);
        if (this.g == j) {
            b(null);
        }
    }

    @Override // defpackage.jcc
    public final void b(Exception exc) {
        long j = this.f;
        if (exc == null && this.g != j) {
            StringBuilder sb = new StringBuilder("End of data reached before content length was read: ");
            sb.append(this.g);
            ouj.C(sb, "/", j, " Paused: ");
            sb.append(this.d.g());
            exc = new my1(sb.toString());
        }
        super.b(exc);
    }
}
