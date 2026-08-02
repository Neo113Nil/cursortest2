package defpackage;

/* loaded from: classes5.dex */
public final class ldd extends cg6 {
    public hed j;
    public bz2 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ odd m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldd(odd oddVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = oddVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return odd.a(this.m, null, false, null, this);
    }
}
