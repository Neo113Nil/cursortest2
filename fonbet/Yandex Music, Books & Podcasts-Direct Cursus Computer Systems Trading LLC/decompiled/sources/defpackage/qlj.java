package defpackage;

/* loaded from: classes4.dex */
public final class qlj extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ rlj k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlj(rlj rljVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = rljVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, null, null, this);
    }
}
