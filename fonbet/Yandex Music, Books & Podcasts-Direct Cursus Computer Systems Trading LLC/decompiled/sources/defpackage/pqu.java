package defpackage;

/* loaded from: classes4.dex */
public final class pqu extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ squ k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqu(squ squVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = squVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(this);
    }
}
