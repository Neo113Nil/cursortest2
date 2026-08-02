package defpackage;

/* loaded from: classes4.dex */
public final class ojw extends cg6 {
    public pj6 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ akw l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojw(akw akwVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = akwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.g(null, null, this);
    }
}
