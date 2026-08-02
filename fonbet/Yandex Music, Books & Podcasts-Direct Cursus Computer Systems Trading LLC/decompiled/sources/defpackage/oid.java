package defpackage;

/* loaded from: classes3.dex */
public final class oid extends cg6 {
    public o3f j;
    public String k;
    public oqi l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ hgp p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oid(hgp hgpVar, cg6 cg6Var) {
        super(cg6Var);
        this.p = hgpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.v(null, this);
    }
}
