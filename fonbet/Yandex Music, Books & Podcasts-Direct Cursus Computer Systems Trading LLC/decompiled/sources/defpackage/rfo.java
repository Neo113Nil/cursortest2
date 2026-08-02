package defpackage;

/* loaded from: classes4.dex */
public final class rfo extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ vw5 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfo(vw5 vw5Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = vw5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, null, this);
    }
}
