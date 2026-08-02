package defpackage;

/* loaded from: classes4.dex */
public final class sp4 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ tp4 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp4(tp4 tp4Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = tp4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, this);
    }
}
