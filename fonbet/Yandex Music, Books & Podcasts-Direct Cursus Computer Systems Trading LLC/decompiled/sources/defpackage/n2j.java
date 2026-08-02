package defpackage;

/* loaded from: classes4.dex */
public final class n2j implements uun {
    public final jnq a;

    public n2j(jnq jnqVar) {
        jnqVar.getClass();
        this.a = jnqVar;
    }

    @Override // defpackage.knq
    public final rrf a(rnq rnqVar, qnq qnqVar) {
        r2j r2jVar = (r2j) rnqVar;
        qnqVar.getClass();
        tun tunVar = r2jVar.d;
        nrf nrfVar = tunVar.a;
        ssg.a(3, "Skeleton:NeuromusicBlock", hrg.r("createBlockUi: type=", nrfVar.b, " id=", nrfVar.a), null);
        return rzf.Q(new g73(nrfVar, new wn5(new m2g(19, r2jVar, qnqVar.d), 423714483, true)), tunVar.d, tunVar.e, null, null, null, 60);
    }

    @Override // defpackage.knq
    public final rnq b(s63 s63Var) {
        tun tunVar = (tun) s63Var.a;
        ssg.a(3, "Skeleton:NeuromusicBlock", "createViewModel: block=" + tunVar.a, null);
        return new r2j(tunVar, new q43(s63Var, this.a));
    }
}
