package defpackage;

/* loaded from: classes4.dex */
public final class baj extends cg6 {
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ caj m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baj(caj cajVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = cajVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.o(false, this);
    }
}
