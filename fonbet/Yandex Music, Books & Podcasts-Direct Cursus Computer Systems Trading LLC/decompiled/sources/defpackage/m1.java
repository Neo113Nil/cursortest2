package defpackage;

/* loaded from: classes6.dex */
public final class m1 extends cg6 {
    public n1 j;
    public qqi k;
    public /* synthetic */ Object l;
    public final /* synthetic */ n1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(n1 n1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = n1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return n1.a(this.m, this);
    }
}
