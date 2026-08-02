package defpackage;

/* loaded from: classes4.dex */
public final class w6l extends cg6 {
    public pmt j;
    public qqi k;
    public /* synthetic */ Object l;
    public final /* synthetic */ x6l m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6l(x6l x6lVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = x6lVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.m(null, this);
    }
}
