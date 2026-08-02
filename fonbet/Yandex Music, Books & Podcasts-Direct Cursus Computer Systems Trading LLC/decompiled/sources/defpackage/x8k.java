package defpackage;

/* loaded from: classes3.dex */
public final class x8k extends cg6 {
    public String j;
    public String k;
    public /* synthetic */ Object l;
    public final /* synthetic */ c9k m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x8k(c9k c9kVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = c9kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.i(null, null, this);
    }
}
