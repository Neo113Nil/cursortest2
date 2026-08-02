package defpackage;

/* loaded from: classes4.dex */
public final class e2b extends cg6 {
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f2b l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2b(f2b f2bVar, cg6 cg6Var) {
        super(cg6Var);
        this.l = f2bVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(false, this);
    }
}
