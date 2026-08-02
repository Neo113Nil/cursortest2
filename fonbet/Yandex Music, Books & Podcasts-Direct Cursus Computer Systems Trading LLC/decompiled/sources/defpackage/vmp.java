package defpackage;

/* loaded from: classes5.dex */
public final class vmp extends cg6 {
    public onh j;
    public /* synthetic */ Object k;
    public final /* synthetic */ lum l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmp(lum lumVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = lumVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.i0(null, null, this);
    }
}
