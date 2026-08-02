package androidx.savedstate.internal;

import android.os.Bundle;
import androidx.collection.internal.Lock;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistryOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class SavedStateRegistryImpl {
    public boolean attached;
    public boolean isRestored;
    public final ImageLoader$Builder$$ExternalSyntheticLambda1 onAttach;
    public final SavedStateRegistryOwner owner;
    public Bundle restoredState;
    public final Lock lock = new Lock(7);
    public final LinkedHashMap keyToProviders = new LinkedHashMap();
    public boolean isAllowingSavingState = true;

    public SavedStateRegistryImpl(SavedStateRegistryOwner savedStateRegistryOwner, ImageLoader$Builder$$ExternalSyntheticLambda1 imageLoader$Builder$$ExternalSyntheticLambda1) {
        this.owner = savedStateRegistryOwner;
        this.onAttach = imageLoader$Builder$$ExternalSyntheticLambda1;
    }

    public final void performAttach() {
        SavedStateRegistryOwner savedStateRegistryOwner = this.owner;
        if (savedStateRegistryOwner.getLifecycle().getCurrentState() != Lifecycle.State.INITIALIZED) {
            a$$ExternalSyntheticBUOutline0.m$1("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.attached) {
                a$$ExternalSyntheticBUOutline0.m$1("SavedStateRegistry was already attached.");
                return;
            }
            this.onAttach.invoke();
            savedStateRegistryOwner.getLifecycle().addObserver(new SavedStateRegistryImpl$$ExternalSyntheticLambda0(this, 0));
            this.attached = true;
        }
    }
}
