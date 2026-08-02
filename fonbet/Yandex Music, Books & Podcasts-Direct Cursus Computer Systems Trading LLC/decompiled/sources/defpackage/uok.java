package defpackage;

/* loaded from: classes4.dex */
public final class uok extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ epk k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uok(epk epkVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = epkVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
