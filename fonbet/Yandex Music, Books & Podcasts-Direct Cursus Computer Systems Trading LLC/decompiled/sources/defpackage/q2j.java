package defpackage;

/* loaded from: classes4.dex */
public final class q2j extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ r2j k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2j(r2j r2jVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = r2jVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(false, this);
    }
}
