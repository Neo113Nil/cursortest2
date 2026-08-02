package defpackage;

/* loaded from: classes5.dex */
public final class dzk extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ fzk k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzk(fzk fzkVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = fzkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        this.k.d(null, this);
        return nm6.a;
    }
}
