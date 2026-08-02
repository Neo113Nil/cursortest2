package defpackage;

/* loaded from: classes4.dex */
public final class w57 extends cg6 {
    public y57 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ y57 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w57(y57 y57Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = y57Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return y57.J(this.l, this);
    }
}
