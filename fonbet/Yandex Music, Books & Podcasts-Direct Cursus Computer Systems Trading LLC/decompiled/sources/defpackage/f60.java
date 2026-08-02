package defpackage;

/* loaded from: classes3.dex */
public final class f60 extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ g60 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f60(g60 g60Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = g60Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
