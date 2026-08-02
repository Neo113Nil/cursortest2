package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import com.fillr.e0;
import com.google.android.gms.dynamite.zzh;
import kotlin.NotImplementedError;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.android.HandlerContext;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* loaded from: classes3.dex */
public abstract class ViewModelKt {
    public static final zzh VIEW_MODEL_SCOPE_LOCK = new zzh(6);

    public static SavedStateHandle createHandle(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            return new SavedStateHandle();
        }
        ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        MapBuilder mapBuilder = new MapBuilder(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            mapBuilder.put(str, bundle.get(str));
        }
        return new SavedStateHandle(mapBuilder.build());
    }

    public static final LifecycleCoroutineScopeImpl getCoroutineScope(Lifecycle lifecycle) {
        lifecycle.getClass();
        AtomicReference atomicReference = lifecycle.internalScopeRef;
        while (true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) ((java.util.concurrent.atomic.AtomicReference) atomicReference.base).get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            SupervisorJobImpl SupervisorJob$default = JobKt.SupervisorJob$default();
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            HandlerContext handlerContext = MainDispatcherLoader.dispatcher;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, CoroutineContext.Element.DefaultImpls.plus(SupervisorJob$default, handlerContext.immediate));
            java.util.concurrent.atomic.AtomicReference atomicReference2 = (java.util.concurrent.atomic.AtomicReference) atomicReference.base;
            while (!atomicReference2.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                if (atomicReference2.get() != null) {
                    break;
                }
            }
            JobKt.launch$default(lifecycleCoroutineScopeImpl2, handlerContext.immediate, null, new LifecycleCoroutineScopeImpl$register$1(lifecycleCoroutineScopeImpl2, null), 2);
            return lifecycleCoroutineScopeImpl2;
        }
    }

    public static final CloseableCoroutineScope getViewModelScope(ViewModel viewModel) {
        CloseableCoroutineScope closeableCoroutineScope;
        CoroutineContext coroutineContext;
        viewModel.getClass();
        synchronized (VIEW_MODEL_SCOPE_LOCK) {
            closeableCoroutineScope = (CloseableCoroutineScope) viewModel.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (closeableCoroutineScope == null) {
                try {
                    try {
                        DefaultScheduler defaultScheduler = Dispatchers.Default;
                        coroutineContext = MainDispatcherLoader.dispatcher.immediate;
                    } catch (NotImplementedError unused) {
                        coroutineContext = EmptyCoroutineContext.INSTANCE;
                    }
                } catch (IllegalStateException unused2) {
                    coroutineContext = EmptyCoroutineContext.INSTANCE;
                }
                CloseableCoroutineScope closeableCoroutineScope2 = new CloseableCoroutineScope(coroutineContext.plus(JobKt.SupervisorJob$default()));
                viewModel.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", closeableCoroutineScope2);
                closeableCoroutineScope = closeableCoroutineScope2;
            }
        }
        return closeableCoroutineScope;
    }

    public static CoroutineLiveData liveData$default(Function2 function2) {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        emptyCoroutineContext.getClass();
        CoroutineLiveData coroutineLiveData = new CoroutineLiveData();
        SupervisorJobImpl supervisorJobImpl = new SupervisorJobImpl(null);
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        coroutineLiveData.blockRunner = new e0(coroutineLiveData, function2, JobKt.CoroutineScope(MainDispatcherLoader.dispatcher.immediate.plus(emptyCoroutineContext).plus(supervisorJobImpl)), new Worker$$ExternalSyntheticLambda0(coroutineLiveData, 10));
        return coroutineLiveData;
    }
}
