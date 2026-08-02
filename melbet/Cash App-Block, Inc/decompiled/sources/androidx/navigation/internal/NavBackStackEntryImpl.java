package androidx.navigation.internal;

import android.os.Bundle;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda0;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.NavDestination;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public final class NavBackStackEntryImpl {
    public final Lazy defaultFactory$delegate;
    public final SavedStateViewModelFactory defaultViewModelProviderFactory;
    public final NavDestination destination;
    public final NavBackStackEntry entry;
    public Lifecycle.State hostLifecycleState;
    public final String id;
    public final Bundle immutableArgs;
    public final LifecycleRegistry lifecycle;
    public Lifecycle.State maxLifecycle;
    public final Lazy navResultSavedStateFactory$delegate;
    public final Bundle savedState;
    public boolean savedStateRegistryAttached;
    public final SavedStateRegistryController savedStateRegistryController;
    public final NavControllerViewModel viewModelStoreProvider;

    public final class SavedStateViewModel extends ViewModel {
        public final SavedStateHandle handle;

        public SavedStateViewModel(SavedStateHandle savedStateHandle) {
            savedStateHandle.getClass();
            this.handle = savedStateHandle;
        }
    }

    public NavBackStackEntryImpl(NavBackStackEntry navBackStackEntry) {
        this.entry = navBackStackEntry;
        this.destination = navBackStackEntry.destination;
        this.immutableArgs = navBackStackEntry.immutableArgs;
        this.hostLifecycleState = navBackStackEntry.hostLifecycleState;
        this.viewModelStoreProvider = navBackStackEntry.viewModelStoreProvider;
        this.id = navBackStackEntry.id;
        this.savedState = navBackStackEntry.savedState;
        this.savedStateRegistryController = new SavedStateRegistryController(new SavedStateRegistryImpl(navBackStackEntry, new ImageLoader$Builder$$ExternalSyntheticLambda1(navBackStackEntry, 18)));
        Lazy lazy = LazyKt.lazy(new TextKt$$ExternalSyntheticLambda0(27));
        this.defaultFactory$delegate = lazy;
        this.lifecycle = new LifecycleRegistry(navBackStackEntry, true);
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
        this.defaultViewModelProviderFactory = (SavedStateViewModelFactory) lazy.getValue();
        this.navResultSavedStateFactory$delegate = LazyKt.lazy(new TextKt$$ExternalSyntheticLambda0(28));
    }

    public final Bundle getArguments$navigation_common_release() {
        Bundle bundle = this.immutableArgs;
        if (bundle == null) {
            return null;
        }
        EmptyMap.INSTANCE.getClass();
        Bundle bundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(new Pair[0], 0));
        bundleOf.putAll(bundle);
        return bundleOf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Reflection.factory.getOrCreateKotlinClass(NavBackStackEntry.class).getSimpleName());
        sb.append("(" + this.id + ')');
        sb.append(" destination=");
        sb.append(this.destination);
        return sb.toString();
    }

    public final void updateState$navigation_common_release() {
        if (!this.savedStateRegistryAttached) {
            SavedStateRegistryController savedStateRegistryController = this.savedStateRegistryController;
            savedStateRegistryController.impl.performAttach();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this.entry);
            }
            savedStateRegistryController.performRestore(this.savedState);
        }
        int ordinal = this.hostLifecycleState.ordinal();
        int ordinal2 = this.maxLifecycle.ordinal();
        LifecycleRegistry lifecycleRegistry = this.lifecycle;
        if (ordinal < ordinal2) {
            lifecycleRegistry.setCurrentState(this.hostLifecycleState);
        } else {
            lifecycleRegistry.setCurrentState(this.maxLifecycle);
        }
    }
}
