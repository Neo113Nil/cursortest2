package defpackage;

/* loaded from: classes4.dex */
public final class zwu extends cg6 {
    public u4q j;
    public /* synthetic */ Object k;
    public final /* synthetic */ hxu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwu(hxu hxuVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = hxuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.l(null, null, null, this);
    }
}
