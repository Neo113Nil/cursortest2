package defpackage;

/* loaded from: classes6.dex */
public final class mov extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ pov k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mov(pov povVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = povVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return pov.a(this.k, this);
    }
}
