package defpackage;

/* loaded from: classes4.dex */
public final class nze extends cg6 {
    public boolean j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ oze m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nze(oze ozeVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = ozeVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.a(null, false, this);
    }
}
