package defpackage;

/* loaded from: classes3.dex */
public final class mlg extends cg6 {
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ xlg l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlg(xlg xlgVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = xlgVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return xlg.c(this.l, null, this);
    }
}
