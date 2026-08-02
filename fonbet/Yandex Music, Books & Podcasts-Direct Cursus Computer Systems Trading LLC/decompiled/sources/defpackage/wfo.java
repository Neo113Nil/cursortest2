package defpackage;

/* loaded from: classes4.dex */
public final class wfo extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ qzc k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wfo(qzc qzcVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = qzcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return qzc.a(this.k, null, null, false, null, null, this);
    }
}
