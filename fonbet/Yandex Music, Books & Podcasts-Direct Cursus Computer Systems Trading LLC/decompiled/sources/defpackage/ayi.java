package defpackage;

/* loaded from: classes.dex */
public final class ayi extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ cyi k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayi(cyi cyiVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = cyiVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(0L, 0L, this);
    }
}
