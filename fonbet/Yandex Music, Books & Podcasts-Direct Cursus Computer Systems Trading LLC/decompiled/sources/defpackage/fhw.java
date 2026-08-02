package defpackage;

/* loaded from: classes3.dex */
public final class fhw extends cg6 {
    public Long j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ghw l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fhw(ghw ghwVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = ghwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return ghw.b(this.l, this);
    }
}
