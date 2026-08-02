package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class g2m extends cg6 {
    public List j;
    public long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ i2m m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2m(i2m i2mVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = i2mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.l(null, 0L, null, this);
    }
}
