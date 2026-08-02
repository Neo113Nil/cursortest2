package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobImpl;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class RememberedCoroutineScope implements CoroutineScope, RememberObserver {
    public static final CancelledCoroutineContext CancelledCoroutineContext = new CancelledCoroutineContext();
    public volatile CoroutineContext _coroutineContext;
    public final RememberedCoroutineScope lock = this;
    public final CoroutineContext overlayContext;
    public final CoroutineContext parentContext;

    public RememberedCoroutineScope(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        this.parentContext = coroutineContext;
        this.overlayContext = coroutineContext2;
    }

    public final void cancelIfCreated() {
        synchronized (this.lock) {
            try {
                CoroutineContext coroutineContext = this._coroutineContext;
                if (coroutineContext == null) {
                    this._coroutineContext = CancelledCoroutineContext;
                } else {
                    JobKt.cancel(coroutineContext, new ForgottenCoroutineScopeException());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        CoroutineContext coroutineContext;
        CoroutineContext coroutineContext2 = this._coroutineContext;
        if (coroutineContext2 == null || coroutineContext2 == CancelledCoroutineContext) {
            CompositionErrorContextImpl compositionErrorContextImpl = (CompositionErrorContextImpl) this.parentContext.get(CompositionErrorContextImpl.Key);
            CoroutineContext rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1 = compositionErrorContextImpl != null ? new RememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1(compositionErrorContextImpl, this) : EmptyCoroutineContext.INSTANCE;
            synchronized (this.lock) {
                try {
                    CoroutineContext coroutineContext3 = this._coroutineContext;
                    if (coroutineContext3 == null) {
                        CoroutineContext coroutineContext4 = this.parentContext;
                        coroutineContext = coroutineContext4.plus(new JobImpl((Job) coroutineContext4.get(Job.Key.$$INSTANCE))).plus(this.overlayContext).plus(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                    } else if (coroutineContext3 == CancelledCoroutineContext) {
                        CoroutineContext coroutineContext5 = this.parentContext;
                        JobImpl jobImpl = new JobImpl((Job) coroutineContext5.get(Job.Key.$$INSTANCE));
                        jobImpl.cancelImpl$kotlinx_coroutines_core(new ForgottenCoroutineScopeException());
                        coroutineContext = coroutineContext5.plus(jobImpl).plus(this.overlayContext).plus(rememberedCoroutineScope$special$$inlined$CoroutineExceptionHandler$1);
                    } else {
                        coroutineContext = coroutineContext3;
                    }
                    this._coroutineContext = coroutineContext;
                } catch (Throwable th) {
                    throw th;
                }
            }
            coroutineContext2 = coroutineContext;
        }
        coroutineContext2.getClass();
        return coroutineContext2;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        cancelIfCreated();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }
}
