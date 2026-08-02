package defpackage;

/* loaded from: classes3.dex */
public final class ibj extends cg6 {
    public lt j;
    public String k;
    public String l;
    public String m;
    public /* synthetic */ Object n;
    public final /* synthetic */ jbj o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibj(jbj jbjVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = jbjVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, null, null, this);
    }
}
