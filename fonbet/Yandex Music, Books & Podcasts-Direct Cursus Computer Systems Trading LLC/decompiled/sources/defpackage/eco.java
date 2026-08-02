package defpackage;

/* loaded from: classes4.dex */
public final class eco extends cg6 {
    public boolean j;
    public Exception k;
    public fys l;
    public zvs m;
    public /* synthetic */ Object n;
    public final /* synthetic */ fco o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eco(fco fcoVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = fcoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(false, null, this);
    }
}
