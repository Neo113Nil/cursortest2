package defpackage;

/* loaded from: classes3.dex */
public final class w6m extends cg6 {
    public cc7 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ z6m l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6m(z6m z6mVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = z6mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
