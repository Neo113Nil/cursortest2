package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class ct4 extends cg6 {
    public /* synthetic */ Object j;
    public final /* synthetic */ gl k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct4(gl glVar, Continuation continuation) {
        super(continuation);
        this.k = glVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(false, this);
    }
}
