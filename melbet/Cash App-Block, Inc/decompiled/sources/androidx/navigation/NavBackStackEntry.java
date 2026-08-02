package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.navigation.internal.NavBackStackEntryImpl;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {
    public final ActionBarPolicy context;
    public NavDestination destination;
    public Lifecycle.State hostLifecycleState;
    public final String id;
    public final Bundle immutableArgs;
    public final Bundle savedState;
    public final NavControllerViewModel viewModelStoreProvider;
    public final NavBackStackEntryImpl impl = new NavBackStackEntryImpl(this);
    public final Lazy savedStateHandle$delegate = LazyKt.lazy(new Worker$$ExternalSyntheticLambda0(this, 11));

    public final class Companion {
        public static NavBackStackEntry create$default(ActionBarPolicy actionBarPolicy, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavControllerViewModel navControllerViewModel) {
            String uuid = UUID.randomUUID().toString();
            uuid.getClass();
            navDestination.getClass();
            state.getClass();
            return new NavBackStackEntry(actionBarPolicy, navDestination, bundle, state, navControllerViewModel, uuid, null);
        }
    }

    public NavBackStackEntry(ActionBarPolicy actionBarPolicy, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavControllerViewModel navControllerViewModel, String str, Bundle bundle2) {
        this.context = actionBarPolicy;
        this.destination = navDestination;
        this.immutableArgs = bundle;
        this.hostLifecycleState = state;
        this.viewModelStoreProvider = navControllerViewModel;
        this.id = str;
        this.savedState = bundle2;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (obj != null && (obj instanceof NavBackStackEntry)) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            Bundle bundle = navBackStackEntry.immutableArgs;
            if (Intrinsics.areEqual(this.id, navBackStackEntry.id) && Intrinsics.areEqual(this.destination, navBackStackEntry.destination) && Intrinsics.areEqual(this.impl.lifecycle, navBackStackEntry.impl.lifecycle) && Intrinsics.areEqual(getSavedStateRegistry(), navBackStackEntry.getSavedStateRegistry())) {
                Bundle bundle2 = this.immutableArgs;
                if (Intrinsics.areEqual(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (keySet = bundle2.keySet()) != null) {
                    Set<String> set = keySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!Intrinsics.areEqual(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Application application2;
        NavBackStackEntryImpl navBackStackEntryImpl = this.impl;
        navBackStackEntryImpl.getClass();
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(0);
        NavBackStackEntry navBackStackEntry = navBackStackEntryImpl.entry;
        LinkedHashMap linkedHashMap = mutableCreationExtras.extras;
        linkedHashMap.put(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, navBackStackEntry);
        linkedHashMap.put(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, navBackStackEntry);
        Bundle arguments$navigation_common_release = navBackStackEntryImpl.getArguments$navigation_common_release();
        if (arguments$navigation_common_release != null) {
            linkedHashMap.put(SavedStateHandleSupport.DEFAULT_ARGS_KEY, arguments$navigation_common_release);
        }
        ActionBarPolicy actionBarPolicy = this.context;
        if (actionBarPolicy != null) {
            Context context = actionBarPolicy.mContext;
            Context applicationContext = context != null ? context.getApplicationContext() : null;
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                application2 = application != null ? application : null;
                if (application2 != null) {
                    linkedHashMap.put(ViewModelProvider$AndroidViewModelFactory.APPLICATION_KEY, application2);
                }
                return mutableCreationExtras;
            }
        }
        application = null;
        if (application != null) {
        }
        if (application2 != null) {
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return this.impl.defaultViewModelProviderFactory;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.impl.lifecycle;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.impl.savedStateRegistryController.savedStateRegistry;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        NavBackStackEntryImpl navBackStackEntryImpl = this.impl;
        if (!navBackStackEntryImpl.savedStateRegistryAttached) {
            a$$ExternalSyntheticBUOutline0.m$1("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
            return null;
        }
        if (navBackStackEntryImpl.lifecycle.state == Lifecycle.State.DESTROYED) {
            a$$ExternalSyntheticBUOutline0.m$1("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
            return null;
        }
        NavControllerViewModel navControllerViewModel = navBackStackEntryImpl.viewModelStoreProvider;
        if (navControllerViewModel == null) {
            a$$ExternalSyntheticBUOutline0.m$1("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
            return null;
        }
        String str = navBackStackEntryImpl.id;
        str.getClass();
        LinkedHashMap linkedHashMap = navControllerViewModel.viewModelStores;
        ViewModelStore viewModelStore = (ViewModelStore) linkedHashMap.get(str);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        linkedHashMap.put(str, viewModelStore2);
        return viewModelStore2;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = this.destination.hashCode() + (this.id.hashCode() * 31);
        Bundle bundle = this.immutableArgs;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            Iterator<T> it = keySet.iterator();
            while (it.hasNext()) {
                int i = hashCode * 31;
                Object obj = bundle.get((String) it.next());
                hashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return getSavedStateRegistry().hashCode() + ((this.impl.lifecycle.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return this.impl.toString();
    }
}
