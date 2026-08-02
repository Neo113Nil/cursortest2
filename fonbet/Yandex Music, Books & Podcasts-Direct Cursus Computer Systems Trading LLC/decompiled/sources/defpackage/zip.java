package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class zip extends cg6 {
    public Object j;
    public Object k;
    public Object l;
    public xip m;
    public /* synthetic */ Object n;
    public final /* synthetic */ ajp o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zip(ajp ajpVar, Continuation continuation) {
        super(continuation);
        this.o = ajpVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.emit(null, this);
    }
}
