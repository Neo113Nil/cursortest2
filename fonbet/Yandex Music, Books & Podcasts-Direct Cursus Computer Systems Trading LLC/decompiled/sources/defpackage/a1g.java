package defpackage;

/* loaded from: classes4.dex */
public final class a1g extends cg6 {
    public m0g j;
    public /* synthetic */ Object k;
    public final /* synthetic */ e1g l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1g(e1g e1gVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = e1gVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.i(null, null, this);
    }
}
