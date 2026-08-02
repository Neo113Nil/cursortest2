package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class sao extends cg6 {
    public Object j;
    public Exception k;
    public boolean l;
    public /* synthetic */ Object m;
    public final /* synthetic */ tao n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sao(tao taoVar, Continuation continuation) {
        super(continuation);
        this.n = taoVar;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.m(null, null, this);
    }
}
