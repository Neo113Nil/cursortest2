package defpackage;

/* loaded from: classes4.dex */
public final class nzs extends cg6 {
    public zvs j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qzs l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzs(qzs qzsVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = qzsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return qzs.a(this.l, null, null, null, null, false, this);
    }
}
