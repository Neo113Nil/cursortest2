package defpackage;

/* loaded from: classes5.dex */
public final class m87 extends cg6 {
    public /* synthetic */ Object A;
    public final /* synthetic */ n87 B;
    public int C;
    public boolean j;
    public boolean k;
    public e87 l;
    public int[] m;
    public x6a n;
    public int[] o;
    public Object p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m87(n87 n87Var, cg6 cg6Var) {
        super(cg6Var);
        this.B = n87Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object a = n87.a(this.B, false, null, this);
        return a == nm6.a ? a : new z7o(a);
    }
}
