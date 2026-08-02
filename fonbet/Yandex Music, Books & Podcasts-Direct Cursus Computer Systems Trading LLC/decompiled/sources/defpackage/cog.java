package defpackage;

/* loaded from: classes3.dex */
public final class cog extends cg6 {
    public String j;
    public xdh k;
    public String l;
    public boolean m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ fog p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cog(fog fogVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = fogVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, null, false, null, this);
    }
}
