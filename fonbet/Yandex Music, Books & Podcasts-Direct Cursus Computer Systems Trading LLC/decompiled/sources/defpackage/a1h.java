package defpackage;

/* loaded from: classes3.dex */
public final class a1h extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ b1h k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1h(b1h b1hVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = b1hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(false, this);
    }
}
