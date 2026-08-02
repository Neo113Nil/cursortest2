package defpackage;

/* loaded from: classes3.dex */
public final class v16 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ w16 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v16(w16 w16Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = w16Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
