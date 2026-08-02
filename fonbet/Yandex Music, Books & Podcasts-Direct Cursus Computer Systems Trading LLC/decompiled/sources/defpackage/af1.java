package defpackage;

/* loaded from: classes3.dex */
public final class af1 extends cg6 {
    public nnd j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cf1 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af1(cf1 cf1Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = cf1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.p(this);
    }
}
