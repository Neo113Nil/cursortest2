package defpackage;

/* loaded from: classes3.dex */
public final class z81 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ a91 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z81(a91 a91Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = a91Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, this);
    }
}
