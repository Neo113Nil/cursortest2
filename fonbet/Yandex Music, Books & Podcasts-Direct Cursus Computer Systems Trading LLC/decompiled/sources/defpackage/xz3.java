package defpackage;

/* loaded from: classes5.dex */
public final class xz3 extends cg6 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ a04 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz3(a04 a04Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = a04Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(0, this);
    }
}
