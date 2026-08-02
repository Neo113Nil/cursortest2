package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ub0 extends cg6 {
    public cvl j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ vb0 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub0(vb0 vb0Var, Continuation continuation) {
        super(continuation);
        this.r = vb0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(this);
    }
}
