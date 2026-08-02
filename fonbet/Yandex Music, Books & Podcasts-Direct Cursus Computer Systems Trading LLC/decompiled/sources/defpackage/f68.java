package defpackage;

/* loaded from: classes3.dex */
public final class f68 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ k68 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f68(k68 k68Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = k68Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
