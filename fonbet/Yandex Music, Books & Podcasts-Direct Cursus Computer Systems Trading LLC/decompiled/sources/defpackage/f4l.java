package defpackage;

/* loaded from: classes4.dex */
public final class f4l extends cg6 {
    public x3l j;
    public oqi k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ g4l p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4l(g4l g4lVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = g4lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.c(this);
    }
}
