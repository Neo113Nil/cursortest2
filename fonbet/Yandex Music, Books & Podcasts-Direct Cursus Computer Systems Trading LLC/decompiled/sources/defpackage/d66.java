package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class d66 extends cg6 {
    public boolean j;
    public Object k;
    public Object l;
    public xqn m;
    public CoroutineContext n;
    public xqn o;
    public imp p;
    public /* synthetic */ Object q;
    public final /* synthetic */ e66 r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d66(e66 e66Var, cg6 cg6Var) {
        super(cg6Var);
        this.r = e66Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.d0(false, null, this);
    }
}
