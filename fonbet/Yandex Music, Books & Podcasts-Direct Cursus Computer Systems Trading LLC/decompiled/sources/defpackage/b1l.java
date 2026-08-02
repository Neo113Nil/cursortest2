package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b1l extends cg6 {
    public e1l j;
    public /* synthetic */ Object k;
    public final /* synthetic */ fmi l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1l(fmi fmiVar, Continuation continuation) {
        super(continuation);
        this.l = fmiVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(null, this);
    }
}
