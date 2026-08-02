package defpackage;

/* loaded from: classes4.dex */
public final class h8a extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ i8a k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8a(i8a i8aVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = i8aVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.q(null, this);
    }
}
