package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class nx4 extends cg6 {
    public Collection j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yx4 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx4(yx4 yx4Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = yx4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.r(null, this);
    }
}
