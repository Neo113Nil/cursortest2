package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class rlc extends cg6 {
    public slc j;
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ slc m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlc(slc slcVar, Continuation continuation) {
        super(continuation);
        this.m = slcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
