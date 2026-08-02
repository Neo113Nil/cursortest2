package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.navigation.compose.DialogHostKt$$ExternalSyntheticLambda0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class LaunchedEffectImpl implements RememberObserver, CoroutineExceptionHandler {
    public StandaloneCoroutine job;
    public final CoroutineContext parentCoroutineContext;
    public final ContextScope scope;
    public final Function2 task;

    public LaunchedEffectImpl(CoroutineContext coroutineContext, Function2 function2) {
        this.parentCoroutineContext = coroutineContext;
        this.task = function2;
        this.scope = JobKt.CoroutineScope(coroutineContext.plus(this));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return CoroutineExceptionHandler.Key.$$INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) coroutineContext.get(CompositionErrorContextImpl.Key);
        if (compositionErrorContextImpl != null) {
            SourceInformationKt.tryAttachComposeStackTrace(th, new DialogHostKt$$ExternalSyntheticLambda0(24, compositionErrorContextImpl, this));
        }
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) this.parentCoroutineContext.get(CoroutineExceptionHandler.Key.$$INSTANCE);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.handleException(coroutineContext, th);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.minusKey(this, key);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        StandaloneCoroutine standaloneCoroutine = this.job;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancelInternal(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        StandaloneCoroutine standaloneCoroutine = this.job;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancelInternal(new LeftCompositionCancellationException());
        }
        this.job = null;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        StandaloneCoroutine standaloneCoroutine = this.job;
        if (standaloneCoroutine != null) {
            standaloneCoroutine.cancel(JobKt.CancellationException("Old job was still running!", null));
        }
        this.job = JobKt.launch$default(this.scope, null, null, this.task, 3);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.plus(this, coroutineContext);
    }
}
