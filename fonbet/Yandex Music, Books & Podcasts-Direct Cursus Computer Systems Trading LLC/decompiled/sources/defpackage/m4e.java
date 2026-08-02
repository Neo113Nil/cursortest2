package defpackage;

/* loaded from: classes.dex */
public final class m4e extends cg6 {
    public p4e j;
    public k4e k;
    public /* synthetic */ Object l;
    public final /* synthetic */ p4e m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4e(p4e p4eVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = p4eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return p4e.S0(this.m, this);
    }
}
