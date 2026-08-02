package defpackage;

/* loaded from: classes5.dex */
public final class zc0 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ mmo k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc0(mmo mmoVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = mmoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.u(null, this);
    }
}
