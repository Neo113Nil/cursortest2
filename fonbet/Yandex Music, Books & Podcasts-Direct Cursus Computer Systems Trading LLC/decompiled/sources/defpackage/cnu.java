package defpackage;

/* loaded from: classes4.dex */
public final class cnu extends cg6 {
    public oqi j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dnu m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnu(dnu dnuVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = dnuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return dnu.b(this.m, this);
    }
}
