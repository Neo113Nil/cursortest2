package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class o5u extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ zzs l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5u(zzs zzsVar, Continuation continuation) {
        super(continuation);
        this.l = zzsVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
