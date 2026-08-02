package defpackage;

/* loaded from: classes4.dex */
public final class c4 implements mnq {
    public final /* synthetic */ int a = 0;
    public final jyr b;
    public final Object c;
    public final Object d;
    public final Object e;

    public c4(qp1 qp1Var, wn5 wn5Var) {
        qp1Var.getClass();
        this.d = qp1Var;
        this.e = wn5Var;
        this.b = btf.b(new pa1(29));
        this.c = btf.b(new ri1(8, this));
    }

    @Override // defpackage.prf
    public final knq a() {
        switch (this.a) {
            case 0:
                return ((a4) this.b.getValue()).a();
            case 1:
                return (knq) ((jyr) this.c).getValue();
            default:
                return ((ey5) this.b.getValue()).a();
        }
    }

    @Override // defpackage.mnq
    public final fnq b() {
        switch (this.a) {
            case 0:
                return (fnq) ((jyr) this.c).getValue();
            case 1:
                return (fnq) this.b.getValue();
            default:
                ((i06) this.c).getClass();
                return new td(14);
        }
    }

    public c4(String str, dy5 dy5Var, i06 i06Var, tmb tmbVar) {
        str.getClass();
        dy5Var.getClass();
        i06Var.getClass();
        tmbVar.getClass();
        this.d = str;
        this.e = dy5Var;
        this.c = i06Var;
        this.b = btf.b(new aw5(2, this, tmbVar));
    }

    public c4(ep5 ep5Var, itb itbVar) {
        itbVar.getClass();
        this.d = ep5Var;
        this.e = itbVar;
        this.b = btf.b(new z3(1, this));
        this.c = btf.b(new s2(4));
    }
}
