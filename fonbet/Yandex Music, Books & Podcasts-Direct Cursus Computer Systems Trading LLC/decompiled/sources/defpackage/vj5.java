package defpackage;

import android.app.Activity;

/* loaded from: classes3.dex */
public final class vj5 extends cg6 {
    public zh5 j;
    public Activity k;
    public xqn l;
    public /* synthetic */ Object m;
    public final /* synthetic */ xj5 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj5(xj5 xj5Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = xj5Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.e(null, null, false, null, this);
    }
}
