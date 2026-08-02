package defpackage;

/* loaded from: classes4.dex */
public final class ufo extends cg6 {
    public vfo j;
    public qj6 k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ qzc n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufo(qzc qzcVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = qzcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.r(null, null, false, null, null, this);
    }
}
