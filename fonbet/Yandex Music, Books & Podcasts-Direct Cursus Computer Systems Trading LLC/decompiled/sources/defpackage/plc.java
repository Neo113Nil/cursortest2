package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class plc extends cg6 {
    public qlc j;
    public /* synthetic */ Object k;
    public int l;
    public final /* synthetic */ qlc m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public plc(qlc qlcVar, Continuation continuation) {
        super(continuation);
        this.m = qlcVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.l |= Integer.MIN_VALUE;
        return this.m.emit(null, this);
    }
}
