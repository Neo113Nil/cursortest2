package defpackage;

/* loaded from: classes.dex */
public final class pgm extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ rgm k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgm(rgm rgmVar, cg6 cg6Var) {
        super(cg6Var);
        this.k = rgmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(this);
    }
}
