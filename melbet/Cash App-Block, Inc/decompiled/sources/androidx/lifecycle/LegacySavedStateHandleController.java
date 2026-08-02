package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.builders.MapBuilder;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class LegacySavedStateHandleController {

    public final class OnRecreation implements SavedStateRegistry.AutoRecreated {
        public final void onRecreated(SavedStateRegistryOwner savedStateRegistryOwner) {
            if (!(savedStateRegistryOwner instanceof ViewModelStoreOwner)) {
                Handlers$$ExternalSyntheticBUOutline0.m(savedStateRegistryOwner, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
                return;
            }
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) savedStateRegistryOwner).getViewModelStore();
            SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.map;
            Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                str.getClass();
                ViewModel viewModel = (ViewModel) linkedHashMap.get(str);
                if (viewModel != null) {
                    LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, savedStateRegistryOwner.getLifecycle());
                }
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.runOnNextRecreation();
        }
    }

    public static final void attachHandleIfNeeded(ViewModel viewModel, SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        savedStateRegistry.getClass();
        lifecycle.getClass();
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.isAttached) {
            return;
        }
        savedStateHandleController.attachToLifecycle(savedStateRegistry, lifecycle);
        tryToAddRecreator(savedStateRegistry, lifecycle);
    }

    public static final SavedStateHandleController create(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle, String str, Bundle bundle) {
        SavedStateHandle savedStateHandle;
        savedStateRegistry.getClass();
        lifecycle.getClass();
        Bundle consumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey(str);
        if (consumeRestoredStateForKey != null) {
            bundle = consumeRestoredStateForKey;
        }
        if (bundle == null) {
            savedStateHandle = new SavedStateHandle();
        } else {
            ClassLoader classLoader = SavedStateHandle.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            MapBuilder mapBuilder = new MapBuilder(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                mapBuilder.put(str2, bundle.get(str2));
            }
            savedStateHandle = new SavedStateHandle(mapBuilder.build());
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, savedStateHandle);
        savedStateHandleController.attachToLifecycle(savedStateRegistry, lifecycle);
        tryToAddRecreator(savedStateRegistry, lifecycle);
        return savedStateHandleController;
    }

    public static void tryToAddRecreator(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        Lifecycle.State currentState = lifecycle.getCurrentState();
        if (currentState == Lifecycle.State.INITIALIZED || currentState.isAtLeast(Lifecycle.State.STARTED)) {
            savedStateRegistry.runOnNextRecreation();
        } else {
            lifecycle.addObserver(new FragmentStateAdapter.AnonymousClass1(1, lifecycle, savedStateRegistry));
        }
    }
}
