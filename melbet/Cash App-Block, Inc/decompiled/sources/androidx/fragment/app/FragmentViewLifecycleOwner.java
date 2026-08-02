package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {
    public ViewModelProvider$Factory mDefaultFactory;
    public final Fragment mFragment;
    public final Fragment$$ExternalSyntheticLambda1 mRestoreViewSavedStateRunnable;
    public final ViewModelStore mViewModelStore;
    public LifecycleRegistry mLifecycleRegistry = null;
    public SavedStateRegistryController mSavedStateRegistryController = null;

    public FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore, Fragment$$ExternalSyntheticLambda1 fragment$$ExternalSyntheticLambda1) {
        this.mFragment = fragment;
        this.mViewModelStore = viewModelStore;
        this.mRestoreViewSavedStateRunnable = fragment$$ExternalSyntheticLambda1;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.mFragment;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(0);
        LinkedHashMap linkedHashMap = mutableCreationExtras.extras;
        if (application != null) {
            linkedHashMap.put(ViewModelProvider$AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        linkedHashMap.put(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, fragment);
        linkedHashMap.put(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(SavedStateHandleSupport.DEFAULT_ARGS_KEY, fragment.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.mFragment;
        ViewModelProvider$Factory defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.mDefaultFactory = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.mDefaultFactory = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        initialize$1();
        return this.mLifecycleRegistry;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        initialize$1();
        return this.mSavedStateRegistryController.savedStateRegistry;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        initialize$1();
        return this.mViewModelStore;
    }

    public final void handleLifecycleEvent(Lifecycle.Event event) {
        this.mLifecycleRegistry.handleLifecycleEvent(event);
    }

    public final void initialize$1() {
        if (this.mLifecycleRegistry == null) {
            this.mLifecycleRegistry = new LifecycleRegistry(this, true);
            SavedStateRegistryImpl savedStateRegistryImpl = new SavedStateRegistryImpl(this, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 18));
            this.mSavedStateRegistryController = new SavedStateRegistryController(savedStateRegistryImpl);
            savedStateRegistryImpl.performAttach();
            this.mRestoreViewSavedStateRunnable.run();
        }
    }

    public final boolean isInitialized() {
        return this.mLifecycleRegistry != null;
    }

    public final void setCurrentState(Lifecycle.State state) {
        this.mLifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
    }
}
