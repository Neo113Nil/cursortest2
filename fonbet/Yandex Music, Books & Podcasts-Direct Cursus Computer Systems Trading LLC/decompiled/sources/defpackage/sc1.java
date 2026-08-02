package defpackage;

import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class sc1 implements uun {
    public final rc1 a;
    public final bd1 b;
    public final tmb c;
    public final Function2 d;

    public sc1(rc1 rc1Var, bd1 bd1Var, tmb tmbVar, qc1 qc1Var) {
        rc1Var.getClass();
        bd1Var.getClass();
        tmbVar.getClass();
        qc1Var.getClass();
        this.a = rc1Var;
        this.b = bd1Var;
        this.c = tmbVar;
        this.d = qc1Var;
    }

    @Override // defpackage.knq
    public final rrf a(rnq rnqVar, qnq qnqVar) {
        zc1 zc1Var = (zc1) rnqVar;
        qnqVar.getClass();
        tun tunVar = zc1Var.g;
        nrf nrfVar = tunVar.a;
        ssg.a(3, "Skeleton:ArtistLinkBlock", hrg.r("createBlockUi: type=", nrfVar.b, " id=", nrfVar.a), null);
        this.a.getClass();
        return (rrf) this.d.invoke(tunVar, new uc1(zc1Var, zc1Var.d, new tc1(qnqVar.b, 0)));
    }

    @Override // defpackage.knq
    public final rnq b(s63 s63Var) {
        ssg.a(3, "Skeleton:ArtistLinkBlock", "createViewModel: block=" + ((tun) s63Var.a).a, null);
        return new zc1(s63Var, q5g.x(this.c, s63Var), this.b, btf.b(new z3(23, this)));
    }
}
