package defpackage;

/* loaded from: classes3.dex */
public final class jb3 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ob3 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb3(ob3 ob3Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = ob3Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return ob3.G(this.k, this);
    }
}
