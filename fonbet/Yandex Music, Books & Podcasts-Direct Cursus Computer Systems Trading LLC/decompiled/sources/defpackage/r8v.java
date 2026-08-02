package defpackage;

/* loaded from: classes4.dex */
public final class r8v extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ v8v k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8v(v8v v8vVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = v8vVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(this);
    }
}
