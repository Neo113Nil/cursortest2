package defpackage;

/* loaded from: classes3.dex */
public final class w4m extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ x4m l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4m(x4m x4mVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = x4mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
