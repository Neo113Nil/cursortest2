package defpackage;

/* loaded from: classes3.dex */
public final class peh extends cg6 {
    public jeh j;
    public geh k;
    public tm0 l;
    public /* synthetic */ Object m;
    public final /* synthetic */ rxv n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public peh(rxv rxvVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = rxvVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.s(null, null, null, this);
    }
}
