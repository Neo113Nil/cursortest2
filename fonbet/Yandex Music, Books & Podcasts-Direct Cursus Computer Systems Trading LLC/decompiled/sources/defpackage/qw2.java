package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class qw2 extends cg6 {
    public xdr j;
    public rw2 k;
    public Context l;
    public /* synthetic */ Object m;
    public final /* synthetic */ rw2 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw2(rw2 rw2Var, cg6 cg6Var) {
        super(cg6Var);
        this.n = rw2Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.g(null, this);
    }
}
