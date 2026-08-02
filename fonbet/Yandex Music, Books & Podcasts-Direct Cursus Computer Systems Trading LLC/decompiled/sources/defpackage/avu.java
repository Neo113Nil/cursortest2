package defpackage;

/* loaded from: classes4.dex */
public final class avu extends cg6 {
    public tnu j;
    public jzs k;
    public jzs l;
    public jzs m;
    public Object n;
    public wlj o;
    public mqs p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ cvu t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avu(cvu cvuVar, cg6 cg6Var) {
        super(cg6Var);
        this.t = cvuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.g(null, null, this);
    }
}
