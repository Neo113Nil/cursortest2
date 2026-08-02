package defpackage;

/* loaded from: classes4.dex */
public final class hsw extends cg6 {
    public orw j;
    public ohw k;
    public /* synthetic */ Object l;
    public final /* synthetic */ jsw m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsw(jsw jswVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = jswVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, this);
    }
}
