package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class c7e extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ pm l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7e(pm pmVar, Continuation continuation) {
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
