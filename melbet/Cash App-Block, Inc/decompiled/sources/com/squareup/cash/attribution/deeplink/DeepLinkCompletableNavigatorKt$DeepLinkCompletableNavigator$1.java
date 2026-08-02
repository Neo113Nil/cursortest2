package com.squareup.cash.attribution.deeplink;

import app.cash.broadway.navigation.Navigator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import okio.internal.DefaultSocket;
import papa.internal.LaunchTracker;
import radiography.Radiography$renderScannableViewTree$1$2;

/* loaded from: classes.dex */
public final class DeepLinkCompletableNavigatorKt$DeepLinkCompletableNavigator$1 implements DeepLinkCompletableNavigator, CompletableDeferred {
    public final /* synthetic */ CompletableDeferredImpl $$delegate_0 = new CompletableDeferredImpl();

    @Override // kotlinx.coroutines.Job
    public final ChildHandle attachChild(JobSupport jobSupport) {
        return this.$$delegate_0.attachChild(jobSupport);
    }

    @Override // kotlinx.coroutines.Deferred
    public final Object await(Continuation continuation) {
        Object awaitInternal = this.$$delegate_0.awaitInternal(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return awaitInternal;
    }

    @Override // kotlinx.coroutines.Job
    public final void cancel(CancellationException cancellationException) {
        this.$$delegate_0.cancel(cancellationException);
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public final boolean complete(Object obj) {
        Navigator navigator = (Navigator) obj;
        navigator.getClass();
        return this.$$delegate_0.makeCompleting$kotlinx_coroutines_core(navigator);
    }

    @Override // kotlinx.coroutines.CompletableDeferred
    public final boolean completeExceptionally(Throwable th) {
        th.getClass();
        return this.$$delegate_0.completeExceptionally(th);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        CompletableDeferredImpl completableDeferredImpl = this.$$delegate_0;
        completableDeferredImpl.getClass();
        return function2.invoke(obj, completableDeferredImpl);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        key.getClass();
        CompletableDeferredImpl completableDeferredImpl = this.$$delegate_0;
        completableDeferredImpl.getClass();
        return CoroutineContext.Element.DefaultImpls.get(completableDeferredImpl, key);
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException getCancellationException() {
        return this.$$delegate_0.getCancellationException();
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence getChildren() {
        return this.$$delegate_0.getChildren();
    }

    @Override // kotlinx.coroutines.Deferred
    public final Object getCompleted() {
        return (Navigator) this.$$delegate_0.getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        this.$$delegate_0.getClass();
        return Job.Key.$$INSTANCE;
    }

    @Override // kotlinx.coroutines.Deferred
    public final DefaultSocket getOnAwait() {
        return this.$$delegate_0.getOnAwaitInternal();
    }

    @Override // kotlinx.coroutines.Job
    public final LaunchTracker getOnJoin() {
        return this.$$delegate_0.getOnJoin();
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(Function1 function1) {
        return this.$$delegate_0.invokeOnCompletion(function1);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isActive() {
        return this.$$delegate_0.isActive();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        return this.$$delegate_0.isCancelled();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return this.$$delegate_0.isCompleted();
    }

    @Override // kotlinx.coroutines.Job
    public final Object join(Continuation continuation) {
        return this.$$delegate_0.join(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        key.getClass();
        CompletableDeferredImpl completableDeferredImpl = this.$$delegate_0;
        completableDeferredImpl.getClass();
        return CoroutineContext.Element.DefaultImpls.minusKey(completableDeferredImpl, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        CompletableDeferredImpl completableDeferredImpl = this.$$delegate_0;
        completableDeferredImpl.getClass();
        return CoroutineContext.Element.DefaultImpls.plus(completableDeferredImpl, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        return this.$$delegate_0.start();
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle invokeOnCompletion(boolean z, boolean z2, Radiography$renderScannableViewTree$1$2 radiography$renderScannableViewTree$1$2) {
        return this.$$delegate_0.invokeOnCompletion(z, z2, radiography$renderScannableViewTree$1$2);
    }
}
