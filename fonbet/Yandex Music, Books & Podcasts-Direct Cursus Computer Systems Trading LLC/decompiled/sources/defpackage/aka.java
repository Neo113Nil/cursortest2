package defpackage;

/* loaded from: classes3.dex */
public final class aka extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ cka k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aka(cka ckaVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = ckaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
