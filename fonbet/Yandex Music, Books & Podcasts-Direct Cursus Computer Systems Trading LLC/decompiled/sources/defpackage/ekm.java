package defpackage;

/* loaded from: classes4.dex */
public final class ekm extends cg6 {
    public kjm j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fkm l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekm(fkm fkmVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = fkmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.e(null, null, this);
    }
}
