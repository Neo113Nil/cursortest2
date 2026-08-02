package defpackage;

/* loaded from: classes3.dex */
public final class bk5 extends cg6 {
    public ik5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ik5 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk5(ik5 ik5Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = ik5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
