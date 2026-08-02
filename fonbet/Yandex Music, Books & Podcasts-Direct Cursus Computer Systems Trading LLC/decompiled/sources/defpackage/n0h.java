package defpackage;

/* loaded from: classes3.dex */
public final class n0h extends cg6 {
    public boolean j;
    public rj6 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ q0h m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0h(q0h q0hVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = q0hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return q0h.a(this.m, false, this);
    }
}
