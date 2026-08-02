package defpackage;

/* loaded from: classes4.dex */
public final class w9p extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ y9p k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9p(y9p y9pVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = y9pVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
