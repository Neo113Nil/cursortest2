package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class uof extends cg6 {
    public Context j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ovn m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uof(ovn ovnVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = ovnVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.I(null, 0, this);
    }
}
