package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class nxe extends cg6 {
    public int j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ Continuation l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxe(Continuation continuation, CoroutineContext coroutineContext, Function2 function2, Continuation continuation2) {
        super(continuation, coroutineContext);
        this.k = function2;
        this.l = continuation2;
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        if (i != 0) {
            if (i != 1) {
                xq0.q("This coroutine had already completed");
                return null;
            }
            this.j = 2;
            qgg.h0(obj);
            return obj;
        }
        this.j = 1;
        qgg.h0(obj);
        Function2 function2 = this.k;
        function2.getClass();
        wct.o(2, function2);
        return function2.invoke(this.l, this);
    }
}
