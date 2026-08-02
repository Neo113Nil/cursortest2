package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class nmp extends cg6 {
    public omp j;
    public Context k;
    public /* synthetic */ Object l;
    public final /* synthetic */ omp m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmp(omp ompVar, cg6 cg6Var) {
        super(cg6Var);
        this.m = ompVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, null, this);
    }
}
