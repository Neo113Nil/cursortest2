package defpackage;

/* loaded from: classes4.dex */
public final class r5l extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ t5l k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5l(t5l t5lVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = t5lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
