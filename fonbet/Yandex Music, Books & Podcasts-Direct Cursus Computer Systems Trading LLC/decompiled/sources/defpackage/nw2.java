package defpackage;

/* loaded from: classes3.dex */
public final class nw2 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ rw2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw2(rw2 rw2Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = rw2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
