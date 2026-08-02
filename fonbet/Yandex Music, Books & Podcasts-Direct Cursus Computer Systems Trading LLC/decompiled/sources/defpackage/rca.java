package defpackage;

/* loaded from: classes4.dex */
public final class rca extends cg6 {
    public ica j;
    public /* synthetic */ Object k;
    public final /* synthetic */ sca l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rca(sca scaVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = scaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.f(null, null, this);
    }
}
