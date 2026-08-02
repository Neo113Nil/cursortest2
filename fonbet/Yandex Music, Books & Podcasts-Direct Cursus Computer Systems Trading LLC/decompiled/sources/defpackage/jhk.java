package defpackage;

/* loaded from: classes3.dex */
public final class jhk extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ lhk k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhk(lhk lhkVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = lhkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return lhk.a(this.k, null, false, this);
    }
}
