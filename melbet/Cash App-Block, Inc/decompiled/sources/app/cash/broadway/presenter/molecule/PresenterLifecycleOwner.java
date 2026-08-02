package app.cash.broadway.presenter.molecule;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* loaded from: classes.dex */
public final class PresenterLifecycleOwner implements LifecycleOwner {
    public final LifecycleRegistry lifecycleRegistry;

    public PresenterLifecycleOwner() {
        Lifecycle.State state = Lifecycle.State.STARTED;
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this, true);
        lifecycleRegistry.setCurrentState(state);
        this.lifecycleRegistry = lifecycleRegistry;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }
}
