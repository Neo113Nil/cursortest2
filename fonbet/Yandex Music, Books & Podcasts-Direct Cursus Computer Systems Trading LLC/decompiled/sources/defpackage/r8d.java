package defpackage;

/* loaded from: classes4.dex */
public final class r8d extends cg6 {
    public zvs j;
    public String k;
    public String l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ s8d o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8d(s8d s8dVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = s8dVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, null, null, this);
    }
}
