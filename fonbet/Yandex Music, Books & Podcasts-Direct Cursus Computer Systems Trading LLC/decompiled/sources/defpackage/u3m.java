package defpackage;

/* loaded from: classes4.dex */
public final class u3m extends cg6 {
    public nvl j;
    public /* synthetic */ Object k;
    public final /* synthetic */ b4m l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3m(b4m b4mVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = b4mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, null, this);
    }
}
