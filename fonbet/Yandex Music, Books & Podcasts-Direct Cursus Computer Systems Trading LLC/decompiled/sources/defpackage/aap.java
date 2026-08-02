package defpackage;

/* loaded from: classes4.dex */
public final class aap extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ bap k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aap(bap bapVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = bapVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
