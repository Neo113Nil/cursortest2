package defpackage;

/* loaded from: classes3.dex */
public final class d11 extends cg6 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ e11 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d11(e11 e11Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = e11Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, this);
    }
}
