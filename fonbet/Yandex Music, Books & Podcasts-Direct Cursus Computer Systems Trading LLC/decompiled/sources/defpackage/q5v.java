package defpackage;

/* loaded from: classes4.dex */
public final class q5v extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ r5v k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5v(r5v r5vVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = r5vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
