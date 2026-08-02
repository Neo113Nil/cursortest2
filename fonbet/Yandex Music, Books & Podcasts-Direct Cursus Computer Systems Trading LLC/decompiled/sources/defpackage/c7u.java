package defpackage;

/* loaded from: classes4.dex */
public final class c7u extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ yks k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7u(yks yksVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = yksVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.p(null, null, null, this);
    }
}
