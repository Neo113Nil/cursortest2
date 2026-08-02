package defpackage;

/* loaded from: classes3.dex */
public final class b7i extends cg6 {
    public s6i j;
    public yrj k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j7i m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7i(j7i j7iVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = j7iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.R(null, this);
    }
}
