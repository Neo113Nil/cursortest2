package androidx.lifecycle;

import android.os.Bundle;
import androidx.collection.internal.Lock;
import androidx.core.os.BundleKt;
import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzf;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.dynamite.zzh;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public abstract class SavedStateHandleSupport {
    public static final zzg SAVED_STATE_REGISTRY_OWNER_KEY = new zzg(5);
    public static final zzh VIEW_MODEL_STORE_OWNER_KEY = new zzh(5);
    public static final Lock DEFAULT_ARGS_KEY = new Lock(5);

    public static final SavedStateHandle createSavedStateHandle(CreationExtras creationExtras) {
        creationExtras.getClass();
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) creationExtras.get(SAVED_STATE_REGISTRY_OWNER_KEY);
        Bundle bundle = null;
        if (savedStateRegistryOwner == null) {
            a$$ExternalSyntheticBUOutline0.m$3("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) creationExtras.get(VIEW_MODEL_STORE_OWNER_KEY);
        if (viewModelStoreOwner == null) {
            a$$ExternalSyntheticBUOutline0.m$3("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) creationExtras.get(DEFAULT_ARGS_KEY);
        String str = (String) creationExtras.get(AtomicReference.VIEW_MODEL_KEY);
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        SavedStateRegistry.SavedStateProvider savedStateProvider = savedStateRegistryOwner.getSavedStateRegistry().getSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider");
        SavedStateHandlesProvider savedStateHandlesProvider = savedStateProvider instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) savedStateProvider : null;
        if (savedStateHandlesProvider == null) {
            a$$ExternalSyntheticBUOutline0.m$1("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap = getSavedStateHandlesVM(viewModelStoreOwner).handles;
        SavedStateHandle savedStateHandle = (SavedStateHandle) linkedHashMap.get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        savedStateHandlesProvider.performRestore();
        Bundle bundle3 = savedStateHandlesProvider.restoredState;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                EmptyMap.INSTANCE.getClass();
                bundle4 = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                savedStateHandlesProvider.restoredState = null;
            }
            bundle = bundle4;
        }
        SavedStateHandle createHandle = ViewModelKt.createHandle(bundle, bundle2);
        linkedHashMap.put(str, createHandle);
        return createHandle;
    }

    public static final void enableSavedStateHandles(SavedStateRegistryOwner savedStateRegistryOwner) {
        Lifecycle.State currentState = savedStateRegistryOwner.getLifecycle().getCurrentState();
        if (currentState != Lifecycle.State.INITIALIZED && currentState != Lifecycle.State.CREATED) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        } else if (savedStateRegistryOwner.getSavedStateRegistry().getSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(savedStateRegistryOwner.getSavedStateRegistry(), (ViewModelStoreOwner) savedStateRegistryOwner);
            savedStateRegistryOwner.getSavedStateRegistry().registerSavedStateProvider("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            savedStateRegistryOwner.getLifecycle().addObserver(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    public static final SavedStateHandlesVM getSavedStateHandlesVM(ViewModelStoreOwner viewModelStoreOwner) {
        AtomicReference create$default = zzf.create$default(viewModelStoreOwner, new SavedStateHandleSupport$savedStateHandlesVM$1(), 4);
        return (SavedStateHandlesVM) ((SimpleActor) create$default.base).getViewModel$lifecycle_viewmodel("androidx.lifecycle.internal.SavedStateHandlesVM", Reflection.factory.getOrCreateKotlinClass(SavedStateHandlesVM.class));
    }
}
