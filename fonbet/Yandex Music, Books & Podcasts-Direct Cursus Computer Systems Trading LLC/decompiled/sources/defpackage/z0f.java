package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class z0f extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ c1f k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0f(c1f c1fVar, Continuation continuation) {
        super(continuation);
        this.k = c1fVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(this);
    }
}
