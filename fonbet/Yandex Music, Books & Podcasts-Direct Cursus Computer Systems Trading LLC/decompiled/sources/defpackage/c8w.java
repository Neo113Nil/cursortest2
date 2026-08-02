package defpackage;

/* loaded from: classes4.dex */
public final class c8w extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ e8w k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8w(e8w e8wVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = e8wVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object a = this.k.a(this);
        return a == nm6.a ? a : new z7o(a);
    }
}
