package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class vy1 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ wy1 l;
    public rjc m;
    public Object n;
    public int o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vy1(wy1 wy1Var, Continuation continuation) {
        super(continuation);
        this.l = wy1Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
