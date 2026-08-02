package defpackage;

/* loaded from: classes4.dex */
public final class kjj extends cg6 {
    public ljj j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ljj l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjj(ljj ljjVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = ljjVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
