package defpackage;

/* loaded from: classes4.dex */
public final class skm extends cg6 {
    public String j;
    public pkm k;
    public /* synthetic */ Object l;
    public final /* synthetic */ vkm m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skm(vkm vkmVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = vkmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, null, null, this);
    }
}
