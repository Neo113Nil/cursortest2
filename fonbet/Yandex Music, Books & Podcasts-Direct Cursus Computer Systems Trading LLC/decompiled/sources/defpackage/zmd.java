package defpackage;

/* loaded from: classes5.dex */
public final class zmd extends cg6 {
    public vmd j;
    public /* synthetic */ Object k;
    public final /* synthetic */ and l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmd(and andVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = andVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(null, null, this);
    }
}
