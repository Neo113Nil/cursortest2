package defpackage;

/* loaded from: classes4.dex */
public final class gjq extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ hjq k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjq(hjq hjqVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = hjqVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.d(null, false, this);
    }
}
