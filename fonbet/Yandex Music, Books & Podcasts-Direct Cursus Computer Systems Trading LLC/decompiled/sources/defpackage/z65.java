package defpackage;

/* loaded from: classes3.dex */
public final class z65 extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ a75 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z65(a75 a75Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = a75Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(false, this);
    }
}
