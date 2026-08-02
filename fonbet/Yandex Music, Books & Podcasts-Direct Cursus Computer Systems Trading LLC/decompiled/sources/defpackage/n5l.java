package defpackage;

/* loaded from: classes3.dex */
public final class n5l extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ p5l l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5l(p5l p5lVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = p5lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, this);
    }
}
