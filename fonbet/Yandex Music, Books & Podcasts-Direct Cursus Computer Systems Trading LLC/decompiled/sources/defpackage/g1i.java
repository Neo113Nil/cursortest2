package defpackage;

/* loaded from: classes3.dex */
public final class g1i extends cg6 {
    public ap0 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ h1i l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1i(h1i h1iVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = h1iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, this);
    }
}
