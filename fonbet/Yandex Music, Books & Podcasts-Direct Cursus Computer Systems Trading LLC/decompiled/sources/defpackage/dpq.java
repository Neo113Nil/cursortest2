package defpackage;

/* loaded from: classes4.dex */
public final class dpq extends cg6 {
    public String j;
    public String k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ gpq n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpq(gpq gpqVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = gpqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.V(null, null, false, this);
    }
}
