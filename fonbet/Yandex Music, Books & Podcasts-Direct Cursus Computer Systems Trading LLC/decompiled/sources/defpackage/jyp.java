package defpackage;

/* loaded from: classes5.dex */
public final class jyp extends cg6 {
    public oq j;
    public mq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jml m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jyp(jml jmlVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = jmlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
