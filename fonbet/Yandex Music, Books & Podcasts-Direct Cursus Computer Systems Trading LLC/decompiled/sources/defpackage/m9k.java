package defpackage;

/* loaded from: classes6.dex */
public final class m9k extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n9k k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9k(n9k n9kVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = n9kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
