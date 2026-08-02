package defpackage;

/* loaded from: classes5.dex */
public final class xyq extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ yyq k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyq(yyq yyqVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = yyqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
