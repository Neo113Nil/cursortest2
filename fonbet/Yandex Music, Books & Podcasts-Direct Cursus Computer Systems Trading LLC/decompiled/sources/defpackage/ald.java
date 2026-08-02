package defpackage;

/* loaded from: classes.dex */
public final class ald extends cg6 {
    public nz5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ bld l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ald(bld bldVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = bldVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(null, null, null, null, this);
    }
}
