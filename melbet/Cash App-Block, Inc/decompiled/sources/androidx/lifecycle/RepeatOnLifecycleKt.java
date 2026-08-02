package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public abstract class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        Object coroutineScope;
        if (state != Lifecycle.State.INITIALIZED) {
            return (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED && (coroutineScope = JobKt.coroutineScope(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, function2, null), continuation)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? coroutineScope : Unit.INSTANCE;
        }
        a$$ExternalSyntheticBUOutline0.m$3("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }
}
