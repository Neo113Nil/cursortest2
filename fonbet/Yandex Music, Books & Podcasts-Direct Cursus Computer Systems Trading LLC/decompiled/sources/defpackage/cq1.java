package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class cq1 extends cg6 {
    public mwk j;
    public ArrayList k;
    public /* synthetic */ Object l;
    public final /* synthetic */ dq1 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq1(dq1 dq1Var, cg6 cg6Var) {
        super(cg6Var);
        this.m = dq1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.k(null, this);
    }
}
