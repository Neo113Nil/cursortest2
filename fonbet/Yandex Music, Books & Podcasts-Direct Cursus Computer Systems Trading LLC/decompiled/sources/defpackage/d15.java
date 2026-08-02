package defpackage;

/* loaded from: classes4.dex */
public final class d15 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ e15 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d15(e15 e15Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = e15Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return e15.a(this.k, null, this);
    }
}
