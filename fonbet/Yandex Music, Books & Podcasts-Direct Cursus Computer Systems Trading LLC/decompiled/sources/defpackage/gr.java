package defpackage;

/* loaded from: classes3.dex */
public final class gr extends cg6 {
    public String j;
    public String k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ hr n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr(hr hrVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = hrVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return hr.b(this.n, this);
    }
}
