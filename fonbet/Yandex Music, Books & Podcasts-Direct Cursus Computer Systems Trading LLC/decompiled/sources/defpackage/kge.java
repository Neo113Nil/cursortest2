package defpackage;

/* loaded from: classes3.dex */
public final class kge extends cg6 {
    public String j;
    public Object k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ lge n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kge(lge lgeVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = lgeVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.e(null, false, this);
    }
}
