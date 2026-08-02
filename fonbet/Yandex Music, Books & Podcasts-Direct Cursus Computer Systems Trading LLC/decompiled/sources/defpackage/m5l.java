package defpackage;

/* loaded from: classes3.dex */
public final class m5l extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ p5l k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5l(p5l p5lVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = p5lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
