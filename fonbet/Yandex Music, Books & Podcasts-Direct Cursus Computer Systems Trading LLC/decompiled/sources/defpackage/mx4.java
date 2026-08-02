package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class mx4 extends cg6 {
    public uhn j;
    public Set k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ yx4 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx4(yx4 yx4Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = yx4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.q(null, false, this);
    }
}
