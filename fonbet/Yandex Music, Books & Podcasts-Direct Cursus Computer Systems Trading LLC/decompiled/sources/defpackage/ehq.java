package defpackage;

/* loaded from: classes4.dex */
public final class ehq extends cg6 {
    public mwk j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fhq l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehq(fhq fhqVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = fhqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.k(null, this);
    }
}
