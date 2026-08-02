package defpackage;

/* loaded from: classes3.dex */
public final class u6i extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ j7i k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6i(j7i j7iVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = j7iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.L(null, null, this);
        return nm6.a;
    }
}
