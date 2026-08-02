package defpackage;

/* loaded from: classes4.dex */
public final class q8j extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ r8j k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8j(r8j r8jVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = r8jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
