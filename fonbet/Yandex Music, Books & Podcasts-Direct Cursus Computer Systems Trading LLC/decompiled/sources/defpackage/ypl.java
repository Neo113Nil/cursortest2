package defpackage;

/* loaded from: classes4.dex */
public final class ypl implements f8l {
    public final /* synthetic */ tqn a;
    public final /* synthetic */ i8l b;
    public final /* synthetic */ zt3 c;

    public ypl(tqn tqnVar, i8l i8lVar, zt3 zt3Var) {
        this.a = tqnVar;
        this.b = i8lVar;
        this.c = zt3Var;
    }

    @Override // defpackage.f8l
    public final void N(i8l i8lVar, e8l e8lVar) {
        i8lVar.getClass();
        if (i8lVar.c() != 3 || i8lVar.V().p()) {
            return;
        }
        tqn tqnVar = this.a;
        if (tqnVar.a) {
            return;
        }
        tqnVar.a = true;
        this.b.x0(this);
        zt3 zt3Var = this.c;
        if (zt3Var.w()) {
            r7o r7oVar = z7o.b;
            zt3Var.resumeWith(Long.valueOf(i8lVar.J0()));
        }
    }
}
