package androidx.savedstate;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.savedstate.Recreator;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "SavedStateProvider", "AutoRecreated", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateRegistry {
    public final SavedStateRegistryImpl impl;
    public Recreator.SavedStateProvider recreatorProvider;

    /* loaded from: classes3.dex */
    public interface AutoRecreated {
    }

    public interface SavedStateProvider {
        Bundle saveState();
    }

    public SavedStateRegistry(SavedStateRegistryImpl savedStateRegistryImpl) {
        this.impl = savedStateRegistryImpl;
    }

    public final Bundle consumeRestoredStateForKey(String str) {
        str.getClass();
        SavedStateRegistryImpl savedStateRegistryImpl = this.impl;
        if (!savedStateRegistryImpl.isRestored) {
            a$$ExternalSyntheticBUOutline0.m$1("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
            return null;
        }
        Bundle bundle = savedStateRegistryImpl.restoredState;
        if (bundle == null) {
            return null;
        }
        Bundle m1096getSavedStateimpl = bundle.containsKey(str) ? BundleKt.m1096getSavedStateimpl(bundle, str) : null;
        bundle.remove(str);
        if (bundle.isEmpty()) {
            savedStateRegistryImpl.restoredState = null;
        }
        return m1096getSavedStateimpl;
    }

    public final SavedStateProvider getSavedStateProvider(String str) {
        SavedStateProvider savedStateProvider;
        SavedStateRegistryImpl savedStateRegistryImpl = this.impl;
        synchronized (savedStateRegistryImpl.lock) {
            Iterator it = savedStateRegistryImpl.keyToProviders.entrySet().iterator();
            do {
                savedStateProvider = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                SavedStateProvider savedStateProvider2 = (SavedStateProvider) entry.getValue();
                if (Intrinsics.areEqual(str2, str)) {
                    savedStateProvider = savedStateProvider2;
                }
            } while (savedStateProvider == null);
        }
        return savedStateProvider;
    }

    public final void registerSavedStateProvider(String str, SavedStateProvider savedStateProvider) {
        savedStateProvider.getClass();
        SavedStateRegistryImpl savedStateRegistryImpl = this.impl;
        synchronized (savedStateRegistryImpl.lock) {
            if (savedStateRegistryImpl.keyToProviders.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            savedStateRegistryImpl.keyToProviders.put(str, savedStateProvider);
        }
    }

    public final void runOnNextRecreation() {
        if (!this.impl.isAllowingSavingState) {
            a$$ExternalSyntheticBUOutline0.m$1("Can not perform this action after onSaveInstanceState");
            return;
        }
        Recreator.SavedStateProvider savedStateProvider = this.recreatorProvider;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.recreatorProvider = savedStateProvider;
        try {
            LegacySavedStateHandleController.OnRecreation.class.getDeclaredConstructor(null);
            Recreator.SavedStateProvider savedStateProvider2 = this.recreatorProvider;
            if (savedStateProvider2 != null) {
                savedStateProvider2.add(LegacySavedStateHandleController.OnRecreation.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + LegacySavedStateHandleController.OnRecreation.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }

    public final void unregisterSavedStateProvider(String str) {
        str.getClass();
        SavedStateRegistryImpl savedStateRegistryImpl = this.impl;
        synchronized (savedStateRegistryImpl.lock) {
        }
    }
}
