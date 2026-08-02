package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ele extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ fle k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ele(fle fleVar, Continuation continuation) {
        super(continuation);
        this.k = fleVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.b(null, false, this);
    }
}
