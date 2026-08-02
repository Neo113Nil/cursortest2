package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class q1k extends cg6 {
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public qqi t;
    public /* synthetic */ Object u;
    public final /* synthetic */ w1k v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1k(w1k w1kVar, Continuation continuation) {
        super(continuation);
        this.v = w1kVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return w1k.b(this.v, null, null, this);
    }
}
