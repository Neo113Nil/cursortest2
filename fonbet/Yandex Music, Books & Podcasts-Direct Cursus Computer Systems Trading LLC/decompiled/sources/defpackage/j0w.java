package defpackage;

/* loaded from: classes4.dex */
public final class j0w extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n0w k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0w(n0w n0wVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = n0wVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, 0, 0, null, this);
    }
}
