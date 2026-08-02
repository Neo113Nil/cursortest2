package defpackage;

/* loaded from: classes.dex */
public final class ip3 implements va7 {
    public so3 a;
    public ra7 c;
    public boolean e;
    public va7 f;
    public ssm g;
    public int h;
    public int i;
    public va7 b = new l9c();
    public vp3 d = vp3.R;

    @Override // defpackage.va7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jp3 a() {
        va7 va7Var = this.f;
        return d(va7Var != null ? va7Var.a() : null, this.i, this.h);
    }

    public final jp3 c() {
        va7 va7Var = this.f;
        return d(va7Var != null ? va7Var.a() : null, this.i | 1, -4000);
    }

    public final jp3 d(db7 db7Var, int i, int i2) {
        ta7 ta7Var;
        so3 so3Var = this.a;
        so3Var.getClass();
        if (this.e || db7Var == null) {
            ta7Var = null;
        } else {
            ra7 ra7Var = this.c;
            ta7Var = ra7Var != null ? ra7Var.e() : new hp3(so3Var, 5242880L);
        }
        return new jp3(so3Var, db7Var, this.b.a(), ta7Var, this.d, i, this.g, i2);
    }
}
