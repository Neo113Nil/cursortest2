package defpackage;

/* loaded from: classes6.dex */
public final class w4n extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ x4n k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4n(x4n x4nVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = x4nVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, this);
    }
}
