package androidx.lifecycle;

import androidx.datastore.core.SimpleActor;
import androidx.lifecycle.viewmodel.CreationExtras;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* loaded from: classes3.dex */
public final class ViewModelLazy implements Lazy {
    public ViewModel cached;
    public final Function0 extrasProducer;
    public final Function0 factoryProducer;
    public final Function0 storeProducer;
    public final KClass viewModelClass;

    public ViewModelLazy(KClass kClass, Function0 function0, Function0 function02, Function0 function03) {
        kClass.getClass();
        this.viewModelClass = kClass;
        this.storeProducer = function0;
        this.factoryProducer = function02;
        this.extrasProducer = function03;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        ViewModel viewModel = this.cached;
        if (viewModel != null) {
            return viewModel;
        }
        ViewModelStore viewModelStore = (ViewModelStore) this.storeProducer.invoke();
        ViewModelProvider$Factory viewModelProvider$Factory = (ViewModelProvider$Factory) this.factoryProducer.invoke();
        CreationExtras creationExtras = (CreationExtras) this.extrasProducer.invoke();
        viewModelStore.getClass();
        viewModelProvider$Factory.getClass();
        creationExtras.getClass();
        SimpleActor simpleActor = new SimpleActor(viewModelStore, viewModelProvider$Factory, creationExtras);
        KClass kClass = this.viewModelClass;
        kClass.getClass();
        String qualifiedName = kClass.getQualifiedName();
        if (qualifiedName == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Local and anonymous classes can not be ViewModels");
            return null;
        }
        ViewModel viewModel$lifecycle_viewmodel = simpleActor.getViewModel$lifecycle_viewmodel("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), kClass);
        this.cached = viewModel$lifecycle_viewmodel;
        return viewModel$lifecycle_viewmodel;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.cached != null;
    }
}
