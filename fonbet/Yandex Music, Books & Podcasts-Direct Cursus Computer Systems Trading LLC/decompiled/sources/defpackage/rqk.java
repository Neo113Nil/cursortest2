package defpackage;

/* loaded from: classes4.dex */
public final class rqk extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ yqk k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqk(yqk yqkVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = yqkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(this);
    }
}
