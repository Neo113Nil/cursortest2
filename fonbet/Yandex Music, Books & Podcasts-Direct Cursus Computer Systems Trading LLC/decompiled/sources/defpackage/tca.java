package defpackage;

/* loaded from: classes3.dex */
public final class tca extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ wca k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tca(wca wcaVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = wcaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
