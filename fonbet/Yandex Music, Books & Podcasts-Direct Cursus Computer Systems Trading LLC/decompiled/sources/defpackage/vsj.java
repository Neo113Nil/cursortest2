package defpackage;

/* loaded from: classes4.dex */
public final class vsj extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ wsj l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vsj(wsj wsjVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = wsjVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(false, this);
    }
}
