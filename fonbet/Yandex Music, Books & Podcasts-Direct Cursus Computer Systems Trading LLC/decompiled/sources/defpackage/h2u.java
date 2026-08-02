package defpackage;

/* loaded from: classes3.dex */
public final class h2u extends cg6 {
    public eno j;
    public eno k;
    public /* synthetic */ Object l;
    public final /* synthetic */ i2u m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2u(i2u i2uVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = i2uVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, null, this);
    }
}
