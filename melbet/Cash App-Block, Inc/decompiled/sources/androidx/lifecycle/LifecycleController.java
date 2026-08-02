package androidx.lifecycle;

import androidx.core.view.MenuHostHelper$$ExternalSyntheticLambda1;
import androidx.lifecycle.Lifecycle;
import kotlinx.coroutines.Job;

/* loaded from: classes3.dex */
public final class LifecycleController {
    public final DispatchQueue dispatchQueue;
    public final Lifecycle lifecycle;
    public final Lifecycle.State minState;
    public final MenuHostHelper$$ExternalSyntheticLambda1 observer;

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State state, DispatchQueue dispatchQueue, Job job) {
        lifecycle.getClass();
        dispatchQueue.getClass();
        this.lifecycle = lifecycle;
        this.minState = state;
        this.dispatchQueue = dispatchQueue;
        MenuHostHelper$$ExternalSyntheticLambda1 menuHostHelper$$ExternalSyntheticLambda1 = new MenuHostHelper$$ExternalSyntheticLambda1(1, this, job);
        this.observer = menuHostHelper$$ExternalSyntheticLambda1;
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(menuHostHelper$$ExternalSyntheticLambda1);
        } else {
            job.cancel(null);
            finish();
        }
    }

    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        DispatchQueue dispatchQueue = this.dispatchQueue;
        dispatchQueue.finished = true;
        dispatchQueue.drainQueue();
    }
}
