package defpackage;

/* loaded from: classes4.dex */
public final class vq7 extends cg6 {
    public oqi j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ kr7 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq7(kr7 kr7Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = kr7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(this);
    }
}
