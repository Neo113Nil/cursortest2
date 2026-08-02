package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class l5u extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ snc l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5u(snc sncVar, Continuation continuation) {
        super(continuation);
        this.l = sncVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
