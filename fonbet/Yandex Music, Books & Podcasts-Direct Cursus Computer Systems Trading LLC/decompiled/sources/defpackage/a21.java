package defpackage;

/* loaded from: classes3.dex */
public final class a21 extends cg6 {
    public String j;
    public String k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ b21 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a21(b21 b21Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = b21Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return b21.a(this.n, this);
    }
}
