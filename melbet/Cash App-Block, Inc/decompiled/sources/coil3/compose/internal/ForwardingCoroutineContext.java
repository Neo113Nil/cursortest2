package coil3.compose.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;

/* loaded from: classes3.dex */
public abstract class ForwardingCoroutineContext implements CoroutineContext {
    public final CoroutineContext delegate;

    public ForwardingCoroutineContext(CoroutineContext coroutineContext) {
        this.delegate = coroutineContext;
    }

    public final boolean equals(Object obj) {
        return Intrinsics.areEqual(this.delegate, obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.delegate.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.delegate.get(key);
    }

    public final int hashCode() {
        return this.delegate.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        CoroutineContext minusKey = this.delegate.minusKey(key);
        int i = UtilsKt.$r8$clinit;
        CoroutineDispatcher.Key key2 = CoroutineDispatcher.Key;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) get(key2);
        CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) minusKey.get(key2);
        if ((coroutineDispatcher instanceof DeferredDispatchCoroutineDispatcher) && coroutineDispatcher != coroutineDispatcher2) {
            ((DeferredDispatchCoroutineDispatcher) coroutineDispatcher)._unconfined$volatile = 0;
        }
        return new DeferredDispatchCoroutineContext(minusKey);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        CoroutineContext plus = this.delegate.plus(coroutineContext);
        int i = UtilsKt.$r8$clinit;
        CoroutineDispatcher.Key key = CoroutineDispatcher.Key;
        CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) get(key);
        CoroutineDispatcher coroutineDispatcher2 = (CoroutineDispatcher) plus.get(key);
        if ((coroutineDispatcher instanceof DeferredDispatchCoroutineDispatcher) && coroutineDispatcher != coroutineDispatcher2) {
            ((DeferredDispatchCoroutineDispatcher) coroutineDispatcher)._unconfined$volatile = 0;
        }
        return new DeferredDispatchCoroutineContext(plus);
    }

    public final String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.delegate + ")";
    }
}
