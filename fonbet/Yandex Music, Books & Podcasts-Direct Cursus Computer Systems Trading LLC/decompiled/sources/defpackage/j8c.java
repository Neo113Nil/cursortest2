package defpackage;

/* loaded from: classes4.dex */
public final class j8c extends cg6 {
    public k8c j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k8c l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8c(k8c k8cVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = k8cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(false, this);
    }
}
