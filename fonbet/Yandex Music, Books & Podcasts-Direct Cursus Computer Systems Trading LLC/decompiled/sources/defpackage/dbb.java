package defpackage;

/* loaded from: classes4.dex */
public final class dbb extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ kbb k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbb(kbb kbbVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = kbbVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return kbb.a(this.k, null, false, this);
    }
}
