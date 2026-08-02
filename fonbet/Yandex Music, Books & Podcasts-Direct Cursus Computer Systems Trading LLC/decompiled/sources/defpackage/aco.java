package defpackage;

/* loaded from: classes4.dex */
public final class aco extends cg6 {
    public boolean j;
    public Exception k;
    public /* synthetic */ Object l;
    public final /* synthetic */ bco m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aco(bco bcoVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = bcoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(false, null, this);
    }
}
