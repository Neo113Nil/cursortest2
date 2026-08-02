package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public final /* synthetic */ CompositionErrorContextImpl $traceContext$inlined;
    public final /* synthetic */ RememberedCoroutineScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(CompositionErrorContextImpl compositionErrorContextImpl, RememberedCoroutineScope rememberedCoroutineScope) {
        super(CoroutineExceptionHandler.Key.$$INSTANCE);
        this.$traceContext$inlined = compositionErrorContextImpl;
        this.this$0 = rememberedCoroutineScope;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        CompositionErrorContextImpl compositionErrorContextImpl = this.$traceContext$inlined;
        RememberedCoroutineScope rememberedCoroutineScope = this.this$0;
        SourceInformationKt.tryAttachComposeStackTrace(th, new DialogHostKt$$ExternalSyntheticLambda0(24, compositionErrorContextImpl, rememberedCoroutineScope));
        CoroutineContext coroutineContext2 = rememberedCoroutineScope.overlayContext;
        CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key.$$INSTANCE;
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) coroutineContext2.get(key);
        if (coroutineExceptionHandler != null) {
            coroutineExceptionHandler.handleException(coroutineContext, th);
            return;
        }
        CoroutineExceptionHandler coroutineExceptionHandler2 = (CoroutineExceptionHandler) rememberedCoroutineScope.parentContext.get(key);
        if (coroutineExceptionHandler2 == null) {
            throw th;
        }
        coroutineExceptionHandler2.handleException(coroutineContext, th);
    }
}
