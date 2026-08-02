package defpackage;

/* loaded from: classes4.dex */
public final class fiv extends cg6 {
    public gm5 j;
    public /* synthetic */ Object k;
    public final /* synthetic */ giv l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fiv(giv givVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = givVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
