package defpackage;

/* loaded from: classes4.dex */
public final class cco extends cg6 {
    public boolean j;
    public Exception k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dco m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cco(dco dcoVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = dcoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(false, null, this);
    }
}
