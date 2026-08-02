package defpackage;

/* loaded from: classes3.dex */
public final class lud extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ mud k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lud(mud mudVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = mudVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return mud.f(this.k, this);
    }
}
