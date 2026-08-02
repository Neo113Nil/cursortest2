package defpackage;

/* loaded from: classes.dex */
public final class m5w extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n5w k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5w(n5w n5wVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = n5wVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return n5w.a(this.k, this);
    }
}
