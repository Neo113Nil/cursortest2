package defpackage;

/* loaded from: classes4.dex */
public final class ign extends cg6 {
    public String j;
    public f7u k;
    public /* synthetic */ Object l;
    public final /* synthetic */ cr m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ign(cr crVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = crVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.e0(null, null, this);
    }
}
