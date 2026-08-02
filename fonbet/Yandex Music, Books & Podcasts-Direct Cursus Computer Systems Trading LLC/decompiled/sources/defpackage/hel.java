package defpackage;

/* loaded from: classes4.dex */
public final class hel extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ kel k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hel(kel kelVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = kelVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
