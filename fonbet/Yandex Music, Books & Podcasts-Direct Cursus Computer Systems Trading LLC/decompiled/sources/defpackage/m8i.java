package defpackage;

/* loaded from: classes3.dex */
public final class m8i extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n8i k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8i(n8i n8iVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = n8iVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.o(false, this);
    }
}
