package defpackage;

/* loaded from: classes6.dex */
public final class js extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ms l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public js(ms msVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = msVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(null, this);
    }
}
