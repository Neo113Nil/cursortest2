package defpackage;

/* loaded from: classes4.dex */
public final class x1b extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ y1b k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1b(y1b y1bVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = y1bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, false, this);
    }
}
