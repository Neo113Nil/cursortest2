package defpackage;

/* loaded from: classes6.dex */
public final class zx extends cg6 {
    public Object j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ay m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx(ay ayVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = ayVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e(null, false, this);
    }
}
