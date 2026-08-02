package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class t1k extends cg6 {
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public w1k q;
    public /* synthetic */ Object r;
    public final /* synthetic */ u1k s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1k(u1k u1kVar, Continuation continuation) {
        super(continuation);
        this.s = u1kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(this);
    }
}
