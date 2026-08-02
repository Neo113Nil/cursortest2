package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class nt7 extends cg6 {
    public List j;
    public /* synthetic */ Object k;
    public final /* synthetic */ gs4 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt7(gs4 gs4Var, cg6 cg6Var) {
        super(cg6Var);
        this.l = gs4Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return gs4.g(this.l, null, this);
    }
}
