package defpackage;

/* loaded from: classes3.dex */
public final class h30 extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ i30 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(i30 i30Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = i30Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
