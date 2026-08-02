package defpackage;

/* loaded from: classes4.dex */
public final class t3u extends cg6 {
    public b4u j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ b4u m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3u(b4u b4uVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = b4uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(null, null, this);
    }
}
