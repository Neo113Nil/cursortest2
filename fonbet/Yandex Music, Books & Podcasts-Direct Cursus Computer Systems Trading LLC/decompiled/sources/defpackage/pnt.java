package defpackage;

/* loaded from: classes4.dex */
public final class pnt extends cg6 {
    public tnt j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tnt l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pnt(tnt tntVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = tntVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        Object a = this.l.a(null, null, this);
        return a == nm6.a ? a : new z7o(a);
    }
}
