package defpackage;

/* loaded from: classes4.dex */
public final class k14 extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ l14 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k14(l14 l14Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = l14Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(false, this);
    }
}
