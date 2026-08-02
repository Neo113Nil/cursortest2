package defpackage;

/* loaded from: classes3.dex */
public final class k06 extends cg6 {
    public String j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ l06 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k06(l06 l06Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = l06Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return l06.a(this.m, false, this);
    }
}
