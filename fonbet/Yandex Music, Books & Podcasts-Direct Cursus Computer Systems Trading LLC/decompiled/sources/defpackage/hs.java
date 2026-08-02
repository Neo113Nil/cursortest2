package defpackage;

/* loaded from: classes6.dex */
public final class hs extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ms k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs(ms msVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = msVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
