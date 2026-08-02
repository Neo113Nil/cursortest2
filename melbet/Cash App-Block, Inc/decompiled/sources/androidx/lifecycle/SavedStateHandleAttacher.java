package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {
    public final SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(SavedStateHandlesProvider savedStateHandlesProvider) {
        this.provider = savedStateHandlesProvider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_CREATE) {
            Handlers$$ExternalSyntheticBUOutline0.m(event, "Next event must be ON_CREATE, it was ");
        } else {
            lifecycleOwner.getLifecycle().removeObserver(this);
            this.provider.performRestore();
        }
    }
}
