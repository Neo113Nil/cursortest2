package defpackage;

/* loaded from: classes3.dex */
public final class t8k extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ c9k k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8k(c9k c9kVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = c9kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(this);
    }
}
