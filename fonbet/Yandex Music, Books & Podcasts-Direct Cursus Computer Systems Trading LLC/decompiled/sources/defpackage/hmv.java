package defpackage;

/* loaded from: classes6.dex */
public final class hmv extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ lmv k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmv(lmv lmvVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = lmvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
