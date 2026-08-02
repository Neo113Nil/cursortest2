package defpackage;

/* loaded from: classes3.dex */
public final class m3h extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ n3h k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3h(n3h n3hVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = n3hVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, this);
    }
}
