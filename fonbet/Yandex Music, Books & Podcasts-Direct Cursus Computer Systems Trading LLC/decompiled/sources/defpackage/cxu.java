package defpackage;

/* loaded from: classes4.dex */
public final class cxu extends cg6 {
    public a5q j;
    public /* synthetic */ Object k;
    public final /* synthetic */ hxu l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxu(hxu hxuVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = hxuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return hxu.e(this.l, null, null, this);
    }
}
