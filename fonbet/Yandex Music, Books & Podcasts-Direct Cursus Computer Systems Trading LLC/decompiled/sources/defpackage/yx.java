package defpackage;

/* loaded from: classes6.dex */
public final class yx extends cg6 {
    public Object j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ay m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx(ay ayVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = ayVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, false, this);
    }
}
