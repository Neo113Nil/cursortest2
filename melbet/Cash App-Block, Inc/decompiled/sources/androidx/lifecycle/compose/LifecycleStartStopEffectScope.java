package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes.dex */
public final class LifecycleStartStopEffectScope implements LifecycleOwner {
    public final Lifecycle lifecycle;

    public LifecycleStartStopEffectScope(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }
}
