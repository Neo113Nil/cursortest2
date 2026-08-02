package defpackage;

/* loaded from: classes4.dex */
public final class o6l extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ x6l k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6l(x6l x6lVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = x6lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
