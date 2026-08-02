package defpackage;

/* loaded from: classes3.dex */
public final class va2 extends cg6 {
    public drf j;
    public /* synthetic */ Object k;
    public final /* synthetic */ za2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va2(za2 za2Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = za2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return za2.b(this.l, null, this);
    }
}
