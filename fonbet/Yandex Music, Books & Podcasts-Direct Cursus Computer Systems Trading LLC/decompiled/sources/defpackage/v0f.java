package defpackage;

/* loaded from: classes3.dex */
public final class v0f extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ x0f k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0f(x0f x0fVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = x0fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
