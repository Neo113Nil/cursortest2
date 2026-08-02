package defpackage;

/* loaded from: classes4.dex */
public final class tw6 implements va7 {
    public so3 a;
    public va7 b;
    public kj3 c;
    public xq0 d;
    public boolean e;
    public zk7 f;
    public xla g;

    @Override // defpackage.va7
    public final db7 a() {
        zk7 zk7Var = this.f;
        return b(zk7Var != null ? zk7Var.a() : null, 0);
    }

    public final uw6 b(db7 db7Var, int i) {
        ta7 ta7Var;
        so3 so3Var = this.a;
        so3Var.getClass();
        if (this.e || db7Var == null) {
            ta7Var = null;
        } else {
            kj3 kj3Var = this.c;
            ta7Var = kj3Var != null ? kj3Var.e() : new hp3(so3Var, 5242880L);
        }
        return new uw6(so3Var, db7Var, this.b.a(), ta7Var, this.d, i, this.g);
    }
}
