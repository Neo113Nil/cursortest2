package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class n51 extends cg6 {
    public lm1 j;
    public ArrayList k;
    public /* synthetic */ Object l;
    public final /* synthetic */ p51 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n51(p51 p51Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = p51Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.g(null, this);
    }
}
