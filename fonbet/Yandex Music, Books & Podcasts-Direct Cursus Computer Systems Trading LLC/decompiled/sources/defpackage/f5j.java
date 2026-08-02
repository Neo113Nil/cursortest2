package defpackage;

/* loaded from: classes5.dex */
public final class f5j extends cg6 {
    public lt j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cr l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5j(cr crVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = crVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.E(null, this);
    }
}
