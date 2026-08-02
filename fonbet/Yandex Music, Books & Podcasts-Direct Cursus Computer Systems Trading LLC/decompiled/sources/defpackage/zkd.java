package defpackage;

/* loaded from: classes.dex */
public final class zkd extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ bld k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zkd(bld bldVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = bldVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, null, null, this);
    }
}
