package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class zor extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ zhl l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zor(zhl zhlVar, Continuation continuation) {
        super(continuation);
        this.l = zhlVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
