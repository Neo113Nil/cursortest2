package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class r1m extends cg6 {
    public String j;
    public List k;
    public Integer l;
    public long m;
    public /* synthetic */ Object n;
    public final /* synthetic */ i2m o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1m(i2m i2mVar, cg6 cg6Var) {
        super(cg6Var);
        this.o = i2mVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, 0L, null, null, this);
    }
}
