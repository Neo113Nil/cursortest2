package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class pqn extends cg6 {
    public boolean j;
    public List k;
    public /* synthetic */ Object l;
    public final /* synthetic */ qqn m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqn(qqn qqnVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = qqnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.d(false, this);
    }
}
