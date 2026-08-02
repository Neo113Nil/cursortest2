package defpackage;

/* loaded from: classes3.dex */
public final class k44 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ p44 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k44(p44 p44Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = p44Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
