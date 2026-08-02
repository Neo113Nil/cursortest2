package defpackage;

/* loaded from: classes4.dex */
public final class w9b extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ y9b k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9b(y9b y9bVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = y9bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
