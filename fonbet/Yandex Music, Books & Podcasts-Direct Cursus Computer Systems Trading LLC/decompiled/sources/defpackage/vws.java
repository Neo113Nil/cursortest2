package defpackage;

/* loaded from: classes4.dex */
public final class vws extends cg6 {
    public Iterable j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f4m l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vws(f4m f4mVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = f4mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.w(null, null, this);
    }
}
