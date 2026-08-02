package defpackage;

/* loaded from: classes3.dex */
public final class p72 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ s72 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p72(s72 s72Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = s72Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.m(null, this);
    }
}
