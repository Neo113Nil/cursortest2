package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class e6 extends cg6 {
    public xmo j;
    public /* synthetic */ Object k;
    public final /* synthetic */ f6 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6(f6 f6Var, Continuation continuation) {
        super(continuation);
        this.l = f6Var;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
