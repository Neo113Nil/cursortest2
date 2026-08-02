package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class tel extends cg6 {
    public vbn j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ uel m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tel(uel uelVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = uelVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, this);
    }
}
