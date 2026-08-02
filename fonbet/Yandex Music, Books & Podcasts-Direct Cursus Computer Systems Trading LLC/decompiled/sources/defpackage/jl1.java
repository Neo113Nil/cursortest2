package defpackage;

/* loaded from: classes3.dex */
public final class jl1 extends cg6 {
    public ap0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ kl1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl1(kl1 kl1Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = kl1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, this);
    }
}
