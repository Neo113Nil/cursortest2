package defpackage;

/* loaded from: classes.dex */
public interface bdi extends ddi, sv7 {
    default tyf D() {
        return f5b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [kotlin.jvm.functions.Function0, uif] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [xci] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [xci] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [eqi] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [eqi] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [bdi, sv7] */
    @Override // defpackage.ddi
    default Object d(pzm pzmVar) {
        cr crVar;
        xci xciVar = (xci) this;
        if (!xciVar.a.n) {
            sme.a("ModifierLocal accessed from an unattached node");
        }
        if (!xciVar.a.n) {
            sme.b("visitAncestors called on an unattached node");
        }
        xci xciVar2 = xciVar.a.e;
        mpf F = bcx.F(this);
        while (F != null) {
            if ((((xci) F.F.f).d & 32) != 0) {
                while (xciVar2 != null) {
                    if ((xciVar2.c & 32) != 0) {
                        cw7 cw7Var = xciVar2;
                        ?? r4 = 0;
                        while (cw7Var != 0) {
                            if (cw7Var instanceof bdi) {
                                bdi bdiVar = (bdi) cw7Var;
                                if (bdiVar.D().o(pzmVar)) {
                                    return bdiVar.D().u(pzmVar);
                                }
                            } else if ((cw7Var.c & 32) != 0 && (cw7Var instanceof cw7)) {
                                xci xciVar3 = cw7Var.p;
                                int i = 0;
                                cw7Var = cw7Var;
                                r4 = r4;
                                while (xciVar3 != null) {
                                    if ((xciVar3.c & 32) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            cw7Var = xciVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new eqi(new xci[16]);
                                            }
                                            if (cw7Var != 0) {
                                                r4.d(cw7Var);
                                                cw7Var = 0;
                                            }
                                            r4.d(xciVar3);
                                        }
                                    }
                                    xciVar3 = xciVar3.f;
                                    cw7Var = cw7Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            cw7Var = bcx.p(r4);
                        }
                    }
                    xciVar2 = xciVar2.e;
                }
            }
            F = F.u();
            xciVar2 = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
        }
        return pzmVar.a.invoke();
    }
}
