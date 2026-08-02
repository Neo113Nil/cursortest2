package defpackage;

/* loaded from: classes4.dex */
public final class r7r extends cg6 {
    public cc7 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ s7r l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7r(s7r s7rVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = s7rVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return s7r.a(this.l, this);
    }
}
