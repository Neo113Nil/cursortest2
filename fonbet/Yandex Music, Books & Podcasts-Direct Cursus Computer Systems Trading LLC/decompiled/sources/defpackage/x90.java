package defpackage;

/* loaded from: classes.dex */
public final class x90 extends cg6 {
    public ia0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ia0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x90(ia0 ia0Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = ia0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(null, null, null, this);
    }
}
