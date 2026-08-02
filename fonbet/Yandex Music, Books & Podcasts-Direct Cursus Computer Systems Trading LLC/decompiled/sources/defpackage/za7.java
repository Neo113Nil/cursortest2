package defpackage;

/* loaded from: classes5.dex */
public final class za7 extends cg6 {
    public le3 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ le3 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za7(le3 le3Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = le3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.M(this);
    }
}
