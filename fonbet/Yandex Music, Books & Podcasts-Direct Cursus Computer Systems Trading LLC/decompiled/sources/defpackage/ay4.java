package defpackage;

import java.util.List;

/* loaded from: classes5.dex */
public final class ay4 extends cg6 {
    public int j;
    public int k;
    public int l;
    public List m;
    public List n;
    public List o;
    public long p;
    public /* synthetic */ Object q;
    public final /* synthetic */ by4 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay4(by4 by4Var, cg6 cg6Var) {
        super(cg6Var);
        this.r = by4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d(0, this);
    }
}
