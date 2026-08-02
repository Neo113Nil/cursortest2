package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.navigation.fragment.NavHostFragment$$ExternalSyntheticLambda1;
import androidx.savedstate.SavedStateRegistry;
import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class SavedStateHandleController implements LifecycleEventObserver, AutoCloseable {
    public final SavedStateHandle handle;
    public boolean isAttached;
    public final String key;

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
        this.key = str;
        this.handle = savedStateHandle;
    }

    public final void attachToLifecycle(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        savedStateRegistry.getClass();
        lifecycle.getClass();
        if (this.isAttached) {
            a$$ExternalSyntheticBUOutline0.m$1("Already attached to lifecycleOwner");
            return;
        }
        this.isAttached = true;
        lifecycle.addObserver(this);
        savedStateRegistry.registerSavedStateProvider(this.key, (NavHostFragment$$ExternalSyntheticLambda1) this.handle.impl.authenticationTag);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.isAttached = false;
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }
}
