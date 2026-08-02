package defpackage;

/* loaded from: classes5.dex */
public final class x4l extends cg6 {
    public pst j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ z4l m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4l(z4l z4lVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = z4lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return z4l.a(this.m, null, this);
    }
}
