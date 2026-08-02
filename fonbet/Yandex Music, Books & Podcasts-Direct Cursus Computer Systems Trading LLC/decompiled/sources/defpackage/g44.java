package defpackage;

/* loaded from: classes3.dex */
public final class g44 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ i44 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g44(i44 i44Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = i44Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return i44.a(this.k, this);
    }
}
