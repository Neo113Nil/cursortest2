package defpackage;

/* loaded from: classes4.dex */
public final class ayu extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cyu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayu(cyu cyuVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = cyuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return cyu.a(this.l, null, this);
    }
}
