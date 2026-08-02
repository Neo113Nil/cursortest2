package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class wa0 extends cg6 {
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ k90 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa0(k90 k90Var, Continuation continuation) {
        super(continuation);
        this.l = k90Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
