package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class odw extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ azu l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odw(azu azuVar, Continuation continuation) {
        super(continuation);
        this.l = azuVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
