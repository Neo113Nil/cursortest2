package bo.app;

import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.support.BrazeLogger;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class i1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public i1(CoroutineExceptionHandler.Key key) {
        super(key);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeCoroutineScope, BrazeLogger.Priority.E, th, false, (Function0) new g1(th), 4, (Object) null);
        if (brazeCoroutineScope.getShouldReRaiseExceptions$android_sdk_base_release()) {
            throw th;
        }
    }
}
