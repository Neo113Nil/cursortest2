package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public final class LiveDataScopeImpl {
    public final CoroutineContext coroutineContext;
    public final CoroutineLiveData target;

    public LiveDataScopeImpl(CoroutineLiveData coroutineLiveData, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.target = coroutineLiveData;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        this.coroutineContext = coroutineContext.plus(MainDispatcherLoader.dispatcher.immediate);
    }
}
