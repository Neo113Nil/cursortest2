package defpackage;

/* loaded from: classes3.dex */
public final class ki5 extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pi5 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki5(pi5 pi5Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = pi5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(null, this);
    }
}
