package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Constructor;
import kotlin.reflect.KClass;
import papa.PapaEvent;

/* loaded from: classes3.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider$OnRequeryFactory implements ViewModelProvider$Factory {
    public final Application application;
    public final Bundle defaultArgs;
    public final ViewModelProvider$AndroidViewModelFactory factory;
    public final Lifecycle lifecycle;
    public final SavedStateRegistry savedStateRegistry;

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        ViewModelProvider$AndroidViewModelFactory viewModelProvider$AndroidViewModelFactory;
        this.savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
        this.lifecycle = savedStateRegistryOwner.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            if (ViewModelProvider$AndroidViewModelFactory._instance == null) {
                ViewModelProvider$AndroidViewModelFactory._instance = new ViewModelProvider$AndroidViewModelFactory(application);
            }
            viewModelProvider$AndroidViewModelFactory = ViewModelProvider$AndroidViewModelFactory._instance;
            viewModelProvider$AndroidViewModelFactory.getClass();
        } else {
            viewModelProvider$AndroidViewModelFactory = new ViewModelProvider$AndroidViewModelFactory(null);
        }
        this.factory = viewModelProvider$AndroidViewModelFactory;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(Class cls, CreationExtras creationExtras) {
        creationExtras.getClass();
        String str = (String) creationExtras.get(AtomicReference.VIEW_MODEL_KEY);
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$1("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (creationExtras.get(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) == null || creationExtras.get(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) == null) {
            if (this.lifecycle != null) {
                return create$1(cls, str);
            }
            a$$ExternalSyntheticBUOutline0.m$1("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) creationExtras.get(ViewModelProvider$AndroidViewModelFactory.APPLICATION_KEY);
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor findMatchingConstructor = (!isAssignableFrom || application == null) ? SavedStateViewModelFactory_androidKt.findMatchingConstructor(SavedStateViewModelFactory_androidKt.VIEWMODEL_SIGNATURE, cls) : SavedStateViewModelFactory_androidKt.findMatchingConstructor(SavedStateViewModelFactory_androidKt.ANDROID_VIEWMODEL_SIGNATURE, cls);
        return findMatchingConstructor == null ? this.factory.create(cls, creationExtras) : (!isAssignableFrom || application == null) ? SavedStateViewModelFactory_androidKt.newInstance(cls, findMatchingConstructor, SavedStateHandleSupport.createSavedStateHandle(creationExtras)) : SavedStateViewModelFactory_androidKt.newInstance(cls, findMatchingConstructor, application, SavedStateHandleSupport.createSavedStateHandle(creationExtras));
    }

    public final ViewModel create$1(Class cls, String str) {
        cls.getClass();
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle == null) {
            a$$ExternalSyntheticBUOutline0.m("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean isAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Application application = this.application;
        Constructor findMatchingConstructor = (!isAssignableFrom || application == null) ? SavedStateViewModelFactory_androidKt.findMatchingConstructor(SavedStateViewModelFactory_androidKt.VIEWMODEL_SIGNATURE, cls) : SavedStateViewModelFactory_androidKt.findMatchingConstructor(SavedStateViewModelFactory_androidKt.ANDROID_VIEWMODEL_SIGNATURE, cls);
        if (findMatchingConstructor == null) {
            if (application != null) {
                return this.factory.create(cls);
            }
            if (ViewModelProvider$NewInstanceFactory._instance == null) {
                ViewModelProvider$NewInstanceFactory._instance = new ViewModelProvider$NewInstanceFactory();
            }
            ViewModelProvider$NewInstanceFactory._instance.getClass();
            return BundleKt.createViewModel(cls);
        }
        SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
        savedStateRegistry.getClass();
        SavedStateHandleController create = LegacySavedStateHandleController.create(savedStateRegistry, lifecycle, str, this.defaultArgs);
        SavedStateHandle savedStateHandle = create.handle;
        ViewModel newInstance = (!isAssignableFrom || application == null) ? SavedStateViewModelFactory_androidKt.newInstance(cls, findMatchingConstructor, savedStateHandle) : SavedStateViewModelFactory_androidKt.newInstance(cls, findMatchingConstructor, application, savedStateHandle);
        newInstance.addCloseable("androidx.lifecycle.savedstate.vm.tag", create);
        return newInstance;
    }

    @Override // androidx.lifecycle.ViewModelProvider$OnRequeryFactory
    public final void onRequery(ViewModel viewModel) {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            SavedStateRegistry savedStateRegistry = this.savedStateRegistry;
            savedStateRegistry.getClass();
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public SavedStateViewModelFactory() {
        this.factory = new ViewModelProvider$AndroidViewModelFactory(null);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(KClass kClass, CreationExtras creationExtras) {
        kClass.getClass();
        return create(PapaEvent.getJavaClass(kClass), creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel create(Class cls) {
        cls.getClass();
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return create$1(cls, canonicalName);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
