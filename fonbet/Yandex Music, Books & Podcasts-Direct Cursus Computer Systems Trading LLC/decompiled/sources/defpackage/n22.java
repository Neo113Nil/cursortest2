package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class n22 extends cg6 {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ gl l;
    public rjc m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n22(gl glVar, Continuation continuation) {
        super(continuation);
        this.l = glVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.emit(null, this);
    }
}
