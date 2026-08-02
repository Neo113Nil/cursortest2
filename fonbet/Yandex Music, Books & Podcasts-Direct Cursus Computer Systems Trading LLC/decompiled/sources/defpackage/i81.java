package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class i81 implements knq {
    public final /* synthetic */ int a = 0;
    public final u51 b;
    public final tmb c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Function2 g;

    public i81(h81 h81Var, u51 u51Var, tmb tmbVar, arf arfVar, a91 a91Var, rj1 rj1Var) {
        h81Var.getClass();
        u51Var.getClass();
        tmbVar.getClass();
        arfVar.getClass();
        a91Var.getClass();
        this.d = h81Var;
        this.b = u51Var;
        this.c = tmbVar;
        this.e = arfVar;
        this.f = a91Var;
        this.g = rj1Var;
    }

    @Override // defpackage.knq
    public final rrf a(rnq rnqVar, qnq qnqVar) {
        switch (this.a) {
            case 0:
                x81 x81Var = (x81) rnqVar;
                qnqVar.getClass();
                h81 h81Var = (h81) this.d;
                s63 s63Var = x81Var.e;
                h81Var.getClass();
                s63Var.getClass();
                return (rrf) ((rj1) this.g).invoke(x81Var.j, new l81(x81Var, new k81(qnqVar.b), x81Var.g));
            default:
                cf1 cf1Var = (cf1) rnqVar;
                qnqVar.getClass();
                ((ue1) this.d).getClass();
                return (rrf) ((j3) this.g).invoke(cf1Var.l, new xe1(qnqVar.c, cf1Var, new ve1(qnqVar.b, qnqVar.a, 0), cf1Var.f));
        }
    }

    @Override // defpackage.knq
    public final rnq b(s63 s63Var) {
        switch (this.a) {
            case 0:
                rmb x = q5g.x(this.c, s63Var);
                arf arfVar = (arf) this.e;
                a91 a91Var = (a91) this.f;
                f81 f81Var = (f81) s63Var.a;
                h81 h81Var = (h81) this.d;
                imp impVar = h81Var.a;
                o8q o8qVar = (o8q) h81Var.b.getValue();
                f81Var.getClass();
                o8qVar.getClass();
                le3 le3Var = new le3();
                le3Var.a = f81Var;
                le3Var.b = o8qVar;
                return new x81(s63Var, this.b, x, arfVar, le3Var, a91Var);
            default:
                rmb x2 = q5g.x(this.c, s63Var);
                ue1 ue1Var = (ue1) this.d;
                f91 f91Var = (f91) ue1Var.a.getValue();
                return new cf1(s63Var, this.b, x2, (wa) ue1Var.c.getValue(), f91Var, (si1) ue1Var.b.getValue(), (oj1) this.f, (gf1) this.e, new d51(14));
        }
    }

    public i81(ue1 ue1Var, u51 u51Var, tmb tmbVar, gf1 gf1Var, oj1 oj1Var, j3 j3Var) {
        ue1Var.getClass();
        u51Var.getClass();
        tmbVar.getClass();
        gf1Var.getClass();
        oj1Var.getClass();
        this.d = ue1Var;
        this.b = u51Var;
        this.c = tmbVar;
        this.e = gf1Var;
        this.f = oj1Var;
        this.g = j3Var;
    }
}
