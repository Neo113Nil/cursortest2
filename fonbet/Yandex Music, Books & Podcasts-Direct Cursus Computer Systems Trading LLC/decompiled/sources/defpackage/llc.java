package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class llc extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ h7a l;
    public Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llc(h7a h7aVar, Continuation continuation) {
        super(continuation);
        this.l = h7aVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.collect(null, this);
    }
}
