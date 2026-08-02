package defpackage;

/* loaded from: classes5.dex */
public final class m9m extends cg6 {
    public boolean j;
    public String k;
    public z77 l;
    public String m;
    public /* synthetic */ Object n;
    public final /* synthetic */ iz7 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9m(iz7 iz7Var, cg6 cg6Var) {
        super(cg6Var);
        this.o = iz7Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return iz7.c(this.o, false, null, null, null, null, this);
    }
}
