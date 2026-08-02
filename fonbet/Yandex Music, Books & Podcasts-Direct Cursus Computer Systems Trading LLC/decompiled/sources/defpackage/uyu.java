package defpackage;

/* loaded from: classes4.dex */
public final class uyu extends cg6 {
    public kr7 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ vyu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyu(vyu vyuVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = vyuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
