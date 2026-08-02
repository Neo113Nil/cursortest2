package defpackage;

/* loaded from: classes4.dex */
public final class b8a extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ c8a k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8a(c8a c8aVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = c8aVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, this);
    }
}
