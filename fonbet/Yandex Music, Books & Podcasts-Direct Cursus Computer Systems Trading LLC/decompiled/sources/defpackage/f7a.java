package defpackage;

/* loaded from: classes4.dex */
public final class f7a extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ i7a k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7a(i7a i7aVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = i7aVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, null, this);
    }
}
