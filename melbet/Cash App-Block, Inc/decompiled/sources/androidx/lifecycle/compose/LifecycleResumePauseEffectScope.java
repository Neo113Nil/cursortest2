package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes3.dex */
public final class LifecycleResumePauseEffectScope implements LifecycleOwner {
    public final Lifecycle lifecycle;

    public LifecycleResumePauseEffectScope(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }
}
