package androidx.compose.runtime.saveable;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.squareup.wire.GrpcMethod;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SaveableStateRegistryWrapper implements SaveableStateRegistry, SavedStateRegistryOwner {
    public final /* synthetic */ SaveableStateRegistryImpl $$delegate_0;
    public SavedStateRegistryController _controller;
    public LifecycleRegistry _lifecycle;

    public SaveableStateRegistryWrapper(SaveableStateRegistryImpl saveableStateRegistryImpl) {
        this.$$delegate_0 = saveableStateRegistryImpl;
        Object consumeRestored = saveableStateRegistryImpl.consumeRestored("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = consumeRestored instanceof Bundle ? (Bundle) consumeRestored : null;
        if (bundle != null && this._controller == null) {
            SavedStateRegistryController savedStateRegistryController = new SavedStateRegistryController(new SavedStateRegistryImpl(this, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 18)));
            this._controller = savedStateRegistryController;
            savedStateRegistryController.performRestore(bundle);
        }
        saveableStateRegistryImpl.registerProvider("androidx.savedstate.SavedStateRegistry", new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 13));
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean canBeSaved(Object obj) {
        return this.$$delegate_0.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object consumeRestored(String str) {
        return this.$$delegate_0.consumeRestored(str);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LifecycleRegistry lifecycleRegistry = this._lifecycle;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this, false);
        this._lifecycle = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        SavedStateRegistryController savedStateRegistryController = this._controller;
        if (savedStateRegistryController == null) {
            SavedStateRegistryController savedStateRegistryController2 = new SavedStateRegistryController(new SavedStateRegistryImpl(this, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 18)));
            this._controller = savedStateRegistryController2;
            savedStateRegistryController2.performRestore(null);
            savedStateRegistryController = savedStateRegistryController2;
        }
        return savedStateRegistryController.savedStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map performSave() {
        return this.$$delegate_0.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final GrpcMethod registerProvider(String str, Function0 function0) {
        return this.$$delegate_0.registerProvider(str, function0);
    }
}
