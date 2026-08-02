package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class me extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public me(CoroutineExceptionHandler.Key key) {
        super(key);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) ne.a, BrazeLogger.Priority.E, th, false, (Function0) new le(th), 4, (Object) null);
            r7 r7Var = ne.b;
            if (r7Var != null) {
                r7Var.b(th, Throwable.class);
            }
        } catch (Exception unused) {
        }
    }
}
