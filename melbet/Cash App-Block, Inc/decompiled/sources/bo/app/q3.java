package bo.app;

/* loaded from: classes3.dex */
public final class q3 extends c7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(q5 q5Var) {
        super(c9.d, q5Var);
        q5Var.getClass();
    }

    @Override // bo.app.c7
    public final void a(long j, id idVar, nb nbVar) {
        idVar.getClass();
        nbVar.getClass();
        super.a(j, idVar, nbVar);
        Long l = nbVar.b;
        if (l != null) {
            idVar.b = l.longValue() + j;
            idVar.a(j, jd.PENDING_RETRY);
            d9 d9Var = idVar.a;
            y3 y3Var = d9Var instanceof y3 ? (y3) d9Var : null;
            if (y3Var != null) {
                y3Var.n = idVar.h;
            }
        }
    }

    @Override // bo.app.c7
    public final void a(long j) {
        c(j);
    }
}
