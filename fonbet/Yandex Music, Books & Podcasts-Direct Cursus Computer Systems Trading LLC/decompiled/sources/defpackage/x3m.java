package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class x3m extends cg6 {
    public String j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ b4m m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3m(b4m b4mVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = b4mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.f(this, null, null);
    }
}
