package defpackage;

/* loaded from: classes3.dex */
public final class ow4 {
    public final le3 a;
    public final q04 b;
    public final mg1 c;
    public final u12 d;
    public final qja e;
    public final a04 f;
    public final wia g;
    public final jyr h = btf.b(new r93(25, this));

    public ow4(le3 le3Var, q04 q04Var, mg1 mg1Var, u12 u12Var) {
        this.a = le3Var;
        this.b = q04Var;
        this.c = mg1Var;
        this.d = u12Var;
        this.e = (qja) ((jyr) le3Var.a).getValue();
        this.f = (a04) q04Var.c.getValue();
        this.g = (wia) mg1Var.a.getValue();
    }

    public final ce a(tmb tmbVar) {
        p21 a = q04.a();
        q04 q04Var = this.b;
        return new ce(a, (tz3) q04Var.e.getValue(), tmbVar, new bz2(this.f, q04.a() == p21.c), (jp1) q04Var.b.getValue());
    }
}
