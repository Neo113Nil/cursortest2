package defpackage;

/* loaded from: classes4.dex */
public final class rkt implements knq {
    @Override // defpackage.knq
    public final rrf a(rnq rnqVar, qnq qnqVar) {
        skt sktVar = (skt) rnqVar;
        qnqVar.getClass();
        nrf nrfVar = sktVar.a.a;
        String str = nrfVar.b;
        String str2 = nrfVar.a;
        ssg.a(3, "Skeleton:UnknownTypeBlock", hrg.r("createBlockUi: type=", str, " id=", str2), null);
        return rzf.Q(new g73(nrfVar.a, nrfVar.b, new wn5(new f5r(12, sktVar), -2108733138, true), (cma) null, 24), "Unknown block (debug mode)", hrg.r("type=", str, " id=", str2), null, null, null, 60);
    }

    @Override // defpackage.knq
    public final rnq b(s63 s63Var) {
        qkt qktVar = (qkt) s63Var.a;
        ssg.a(3, "Skeleton:UnknownTypeBlock", "createViewModel: block=" + qktVar.a, null);
        return new skt(qktVar);
    }
}
