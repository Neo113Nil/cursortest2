package defpackage;

/* loaded from: classes3.dex */
public final class be1 extends cg6 {
    public atn j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ce1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be1(ce1 ce1Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = ce1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
