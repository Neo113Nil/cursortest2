package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class wb0 extends cg6 {
    public Object j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ vb0 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb0(vb0 vb0Var, Continuation continuation) {
        super(continuation);
        this.q = vb0Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.b(this);
    }
}
