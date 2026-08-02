package defpackage;

/* loaded from: classes4.dex */
public final class xou extends cg6 {
    public rdg j;
    public /* synthetic */ Object k;
    public final /* synthetic */ mmo l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xou(mmo mmoVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = mmoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c0(null, this);
    }
}
