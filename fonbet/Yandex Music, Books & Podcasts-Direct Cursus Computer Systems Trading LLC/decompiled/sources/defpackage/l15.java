package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class l15 extends cg6 {
    public int j;
    public int k;
    public int l;
    public List m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ n15 p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l15(n15 n15Var, cg6 cg6Var) {
        super(cg6Var);
        this.p = n15Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.d(0, this);
    }
}
