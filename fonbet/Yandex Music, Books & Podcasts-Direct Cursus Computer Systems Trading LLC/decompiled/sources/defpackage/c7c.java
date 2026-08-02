package defpackage;

/* loaded from: classes4.dex */
public final class c7c extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ d7c k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7c(d7c d7cVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = d7cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(false, this);
    }
}
