package defpackage;

/* loaded from: classes3.dex */
public final class imw extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ jmw k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public imw(jmw jmwVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = jmwVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
