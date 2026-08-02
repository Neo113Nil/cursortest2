package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class jx4 extends cg6 {
    public Set j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yx4 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx4(yx4 yx4Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = yx4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.o(null, this);
    }
}
