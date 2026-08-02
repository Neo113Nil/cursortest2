package androidx.savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class SavedStateRegistryController {
    public final SavedStateRegistryImpl impl;
    public final SavedStateRegistry savedStateRegistry;

    public SavedStateRegistryController(SavedStateRegistryImpl savedStateRegistryImpl) {
        this.impl = savedStateRegistryImpl;
        this.savedStateRegistry = new SavedStateRegistry(savedStateRegistryImpl);
    }

    public final void performRestore(Bundle bundle) {
        SavedStateRegistryImpl savedStateRegistryImpl = this.impl;
        SavedStateRegistryOwner savedStateRegistryOwner = savedStateRegistryImpl.owner;
        if (!savedStateRegistryImpl.attached) {
            savedStateRegistryImpl.performAttach();
        }
        if (savedStateRegistryOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            Handlers$$ExternalSyntheticBUOutline0.m(savedStateRegistryOwner.getLifecycle().getCurrentState(), "performRestore cannot be called when owner is ");
            return;
        }
        if (savedStateRegistryImpl.isRestored) {
            a$$ExternalSyntheticBUOutline0.m$1("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundle2 = BundleKt.m1096getSavedStateimpl(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        savedStateRegistryImpl.restoredState = bundle2;
        savedStateRegistryImpl.isRestored = true;
    }

    public final void performSave(Bundle bundle) {
        bundle.getClass();
        SavedStateRegistryImpl savedStateRegistryImpl = this.impl;
        EmptyMap.INSTANCE.getClass();
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = savedStateRegistryImpl.restoredState;
        if (bundle2 != null) {
            bundleOf.putAll(bundle2);
        }
        synchronized (savedStateRegistryImpl.lock) {
            for (Map.Entry entry : savedStateRegistryImpl.keyToProviders.entrySet()) {
                String str = (String) entry.getKey();
                Bundle saveState = ((SavedStateRegistry.SavedStateProvider) entry.getValue()).saveState();
                str.getClass();
                bundleOf.putBundle(str, saveState);
            }
        }
        if (bundleOf.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleOf);
    }
}
