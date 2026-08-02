package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class xc4 extends cg6 {
    public pm j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ pm m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc4(pm pmVar, Continuation continuation) {
        super(continuation);
        this.m = pmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
