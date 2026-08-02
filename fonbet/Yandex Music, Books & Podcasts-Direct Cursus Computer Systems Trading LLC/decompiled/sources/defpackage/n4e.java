package defpackage;

/* loaded from: classes.dex */
public final class n4e extends cg6 {
    public p4e j;
    public /* synthetic */ Object k;
    public final /* synthetic */ p4e l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4e(p4e p4eVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = p4eVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return p4e.T0(this.l, this);
    }
}
