package defpackage;

import java.util.Map;

/* loaded from: classes4.dex */
public final class jxs extends cg6 {
    public String j;
    public Map k;
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ kxs n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxs(kxs kxsVar, cg6 cg6Var) {
        super(cg6Var);
        this.n = kxsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.k(null, null, this);
    }
}
