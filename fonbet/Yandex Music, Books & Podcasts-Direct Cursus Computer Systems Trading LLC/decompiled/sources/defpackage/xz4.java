package defpackage;

/* loaded from: classes3.dex */
public final class xz4 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ yz4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz4(yz4 yz4Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = yz4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return yz4.a(this.k, null, false, this);
    }
}
