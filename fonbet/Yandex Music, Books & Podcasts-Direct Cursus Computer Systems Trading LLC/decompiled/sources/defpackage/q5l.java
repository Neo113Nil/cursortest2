package defpackage;

/* loaded from: classes4.dex */
public final class q5l extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ t5l l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5l(t5l t5lVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = t5lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
