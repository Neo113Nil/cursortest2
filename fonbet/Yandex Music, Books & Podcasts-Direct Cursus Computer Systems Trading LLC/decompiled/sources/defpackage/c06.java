package defpackage;

/* loaded from: classes3.dex */
public final class c06 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ d06 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c06(d06 d06Var, cg6 cg6Var) {
        super(cg6Var);
        this.k = d06Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return d06.a(this.k, false, this);
    }
}
