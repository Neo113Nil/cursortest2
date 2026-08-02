package defpackage;

/* loaded from: classes3.dex */
public final class p5s extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ t5s k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5s(t5s t5sVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = t5sVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
