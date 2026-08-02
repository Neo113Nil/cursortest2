package defpackage;

/* loaded from: classes4.dex */
public final class xo4 extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yo4 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo4(yo4 yo4Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = yo4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(false, this);
    }
}
