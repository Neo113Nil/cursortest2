package defpackage;

/* loaded from: classes6.dex */
public final class jsl extends cg6 {
    public cvl j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nsl l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsl(nsl nslVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = nslVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
