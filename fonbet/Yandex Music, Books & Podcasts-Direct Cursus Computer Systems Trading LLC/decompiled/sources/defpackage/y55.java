package defpackage;

/* loaded from: classes4.dex */
public final class y55 extends cg6 {
    public String j;
    public pjc k;
    public /* synthetic */ Object l;
    public final /* synthetic */ a65 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y55(a65 a65Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = a65Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
