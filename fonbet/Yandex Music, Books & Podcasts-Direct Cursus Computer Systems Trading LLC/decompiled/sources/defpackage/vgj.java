package defpackage;

/* loaded from: classes.dex */
public final class vgj implements pj {
    public final pj a;

    public vgj(pj pjVar) {
        pjVar.getClass();
        this.a = pjVar;
        if (pjVar instanceof vgj) {
            xq0.q("The adapter is already nullable");
            throw null;
        }
    }

    @Override // defpackage.pj
    public final void a(r7f r7fVar, fx6 fx6Var, Object obj) {
        r7fVar.getClass();
        fx6Var.getClass();
        if (obj == null) {
            r7fVar.B0();
        } else {
            this.a.a(r7fVar, fx6Var, obj);
        }
    }

    @Override // defpackage.pj
    public final Object b(a7f a7fVar, fx6 fx6Var) {
        a7fVar.getClass();
        fx6Var.getClass();
        if (a7fVar.peek() != 10) {
            return this.a.b(a7fVar, fx6Var);
        }
        a7fVar.w();
        return null;
    }
}
