package defpackage;

/* loaded from: classes3.dex */
public final class zba extends cg6 {
    public mqs j;
    public boolean k;
    public /* synthetic */ Object l;
    public final /* synthetic */ cca m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zba(cca ccaVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = ccaVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, this);
    }
}
