package defpackage;

/* loaded from: classes3.dex */
public final class hid extends cg6 {
    public ckd j;
    public qqi k;
    public /* synthetic */ Object l;
    public final /* synthetic */ hgp m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hid(hgp hgpVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = hgpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.j(null, this);
    }
}
