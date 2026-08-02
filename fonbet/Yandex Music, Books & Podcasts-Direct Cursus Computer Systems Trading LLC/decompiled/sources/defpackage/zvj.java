package defpackage;

/* loaded from: classes3.dex */
public final class zvj extends cg6 {
    public evj j;
    public /* synthetic */ Object k;
    public final /* synthetic */ cwj l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvj(cwj cwjVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = cwjVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return cwj.a(this.l, null, false, this);
    }
}
