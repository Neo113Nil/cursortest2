package defpackage;

/* loaded from: classes4.dex */
public final class m4 extends cg6 {
    public nnk j;
    public /* synthetic */ Object k;
    public final /* synthetic */ n4 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(n4 n4Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = n4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(this);
    }
}
