package defpackage;

/* loaded from: classes3.dex */
public final class fti extends cg6 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gti l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fti(gti gtiVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = gtiVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, this);
    }
}
