package defpackage;

/* loaded from: classes4.dex */
public final class a5g extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ f5g k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5g(f5g f5gVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = f5gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.i(this, null, null);
    }
}
