package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public class qxe {
    /* JADX WARN: Multi-variable type inference failed */
    public static Continuation a(Continuation continuation, Continuation continuation2, Function2 function2) {
        function2.getClass();
        if (function2 instanceof kq2) {
            return ((kq2) function2).create(continuation, continuation2);
        }
        CoroutineContext context = continuation2.getContext();
        return context == g.a ? new mxe(continuation2, continuation, function2) : new nxe(continuation2, context, function2, continuation);
    }

    public static Continuation b(Continuation continuation) {
        Continuation<Object> intercepted;
        continuation.getClass();
        cg6 cg6Var = continuation instanceof cg6 ? (cg6) continuation : null;
        return (cg6Var == null || (intercepted = cg6Var.intercepted()) == null) ? continuation : intercepted;
    }

    public static Object c(Function2 function2, Object obj, Continuation continuation) {
        function2.getClass();
        CoroutineContext context = continuation.getContext();
        Object oxeVar = context == g.a ? new oxe(continuation) : new pxe(continuation, context);
        wct.o(2, function2);
        return function2.invoke(obj, oxeVar);
    }
}
