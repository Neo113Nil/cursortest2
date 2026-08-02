package defpackage;

/* loaded from: classes4.dex */
public final class rrm extends cg6 {
    public vx6 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ srm l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrm(srm srmVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = srmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, this);
    }
}
