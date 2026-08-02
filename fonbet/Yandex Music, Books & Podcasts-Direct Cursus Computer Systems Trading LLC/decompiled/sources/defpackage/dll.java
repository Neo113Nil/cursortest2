package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class dll extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ ell k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dll(ell ellVar, Continuation continuation) {
        super(continuation);
        this.k = ellVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, this);
    }
}
