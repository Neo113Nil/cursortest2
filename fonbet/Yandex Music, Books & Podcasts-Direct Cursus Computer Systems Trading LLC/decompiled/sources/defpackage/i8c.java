package defpackage;

/* loaded from: classes4.dex */
public final class i8c extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ k8c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8c(k8c k8cVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = k8cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
