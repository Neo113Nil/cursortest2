package defpackage;

/* loaded from: classes.dex */
public final class qgp extends cg6 {
    public tgp j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tgp l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgp(tgp tgpVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = tgpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, this);
    }
}
