package defpackage;

/* loaded from: classes4.dex */
public final class v6l extends cg6 {
    public qqi j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x6l l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6l(x6l x6lVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = x6lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l(this);
    }
}
