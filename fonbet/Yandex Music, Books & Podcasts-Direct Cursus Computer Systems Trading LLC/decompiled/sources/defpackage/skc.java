package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class skc extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ wjc k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public skc(wjc wjcVar, Continuation continuation) {
        super(continuation);
        this.k = wjcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.emit(null, this);
    }
}
