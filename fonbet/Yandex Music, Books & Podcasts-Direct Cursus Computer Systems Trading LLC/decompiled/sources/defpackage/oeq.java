package defpackage;

/* loaded from: classes4.dex */
public final class oeq extends cg6 {
    public mqs j;
    public mqs k;
    public olj l;
    public /* synthetic */ Object m;
    public final /* synthetic */ qeq n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeq(qeq qeqVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = qeqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.c(null, null, null, this);
    }
}
