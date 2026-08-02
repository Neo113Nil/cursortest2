package defpackage;

/* loaded from: classes4.dex */
public final class u8f extends cg6 {
    public p8f j;
    public /* synthetic */ Object k;
    public final /* synthetic */ z8f l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8f(z8f z8fVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = z8fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(this);
    }
}
