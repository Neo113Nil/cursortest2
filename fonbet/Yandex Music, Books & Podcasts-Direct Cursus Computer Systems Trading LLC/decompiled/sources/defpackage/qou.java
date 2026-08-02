package defpackage;

/* loaded from: classes3.dex */
public final class qou extends cg6 {
    public String j;
    public int k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ uou n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qou(uou uouVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = uouVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.b(null, this);
    }
}
