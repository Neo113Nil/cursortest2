package defpackage;

/* loaded from: classes5.dex */
public final class l45 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ v55 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l45(v55 v55Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = v55Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k(this);
    }
}
