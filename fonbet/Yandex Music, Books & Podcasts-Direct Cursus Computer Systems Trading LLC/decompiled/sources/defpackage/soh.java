package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class soh extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ pm l;
    public rjc m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public soh(pm pmVar, Continuation continuation) {
        super(continuation);
        this.l = pmVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
