package defpackage;

/* loaded from: classes3.dex */
public final class ip1 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ jp1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip1(jp1 jp1Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = jp1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
