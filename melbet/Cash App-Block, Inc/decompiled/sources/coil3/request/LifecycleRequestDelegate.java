package coil3.request;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil3.RealImageLoader$execute$3;
import coil3.util.LifecyclesKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final class LifecycleRequestDelegate implements RequestDelegate, DefaultLifecycleObserver {
    public final Job job;
    public final Lifecycle lifecycle;

    public LifecycleRequestDelegate(Lifecycle lifecycle, Job job) {
        this.lifecycle = lifecycle;
        this.job = job;
    }

    @Override // coil3.request.RequestDelegate
    public final Object awaitStarted(RealImageLoader$execute$3 realImageLoader$execute$3) {
        Object awaitStarted = LifecyclesKt.awaitStarted(this.lifecycle, realImageLoader$execute$3);
        return awaitStarted == CoroutineSingletons.COROUTINE_SUSPENDED ? awaitStarted : Unit.INSTANCE;
    }

    @Override // coil3.request.RequestDelegate
    public final void complete() {
        this.lifecycle.removeObserver(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.job.cancel(null);
    }

    @Override // coil3.request.RequestDelegate
    public final void start() {
        this.lifecycle.addObserver(this);
    }
}
