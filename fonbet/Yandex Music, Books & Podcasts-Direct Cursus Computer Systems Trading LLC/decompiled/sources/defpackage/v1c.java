package defpackage;

/* loaded from: classes3.dex */
public final class v1c extends cg6 {
    public vqn j;
    public /* synthetic */ Object k;
    public final /* synthetic */ y1c l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1c(y1c y1cVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = y1cVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return y1c.a(this.l, this);
    }
}
