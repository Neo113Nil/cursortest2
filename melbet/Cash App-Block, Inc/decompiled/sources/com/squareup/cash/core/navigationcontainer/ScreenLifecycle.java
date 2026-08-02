package com.squareup.cash.core.navigationcontainer;

import android.os.Bundle;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
public final class ScreenLifecycle implements LifecycleOwner, OnBackPressedDispatcherOwner, SavedStateRegistryOwner {
    public final LifecycleRegistry lifecycleRegistry;
    public final OnBackPressedDispatcher onBackPressedDispatcher;
    public final SavedStateRegistryController savedStateRegistryController;

    public ScreenLifecycle(Bundle bundle, OnBackPressedDispatcher onBackPressedDispatcher) {
        onBackPressedDispatcher.getClass();
        this.onBackPressedDispatcher = onBackPressedDispatcher;
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this, true);
        this.lifecycleRegistry = lifecycleRegistry;
        SavedStateRegistryController savedStateRegistryController = new SavedStateRegistryController(new SavedStateRegistryImpl(this, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 18)));
        savedStateRegistryController.performRestore(bundle);
        this.savedStateRegistryController = savedStateRegistryController;
        lifecycleRegistry.setCurrentState(Lifecycle.State.RESUMED);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.savedStateRegistry;
    }
}
