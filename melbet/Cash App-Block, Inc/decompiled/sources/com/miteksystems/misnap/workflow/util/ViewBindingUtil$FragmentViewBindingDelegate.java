package com.miteksystems.misnap.workflow.util;

import android.view.View;
import androidx.camera.core.impl.LiveDataObservable$$ExternalSyntheticLambda5;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewbinding.ViewBinding;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

/* loaded from: classes4.dex */
public final class ViewBindingUtil$FragmentViewBindingDelegate implements ReadOnlyProperty {
    public final Fragment a;
    public final Function1 b;
    public ViewBinding c;

    public ViewBindingUtil$FragmentViewBindingDelegate(Fragment fragment, Function1 function1) {
        fragment.getClass();
        function1.getClass();
        this.a = fragment;
        this.b = function1;
        fragment.getLifecycle().addObserver(new DefaultLifecycleObserver() { // from class: com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate.1
            public final LiveDataObservable$$ExternalSyntheticLambda5 a;

            {
                this.a = new LiveDataObservable$$ExternalSyntheticLambda5(ViewBindingUtil$FragmentViewBindingDelegate.this, 13);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onCreate(LifecycleOwner lifecycleOwner) {
                ViewBindingUtil$FragmentViewBindingDelegate.this.a.getViewLifecycleOwnerLiveData().observeForever(this.a);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(LifecycleOwner lifecycleOwner) {
                ViewBindingUtil$FragmentViewBindingDelegate.this.a.getViewLifecycleOwnerLiveData().removeObserver(this.a);
            }
        });
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final ViewBinding getValue(Fragment fragment, KProperty kProperty) {
        fragment.getClass();
        kProperty.getClass();
        ViewBinding viewBinding = this.c;
        if (viewBinding != null) {
            return viewBinding;
        }
        Lifecycle lifecycle = this.a.getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        if (!lifecycle.getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
            a$$ExternalSyntheticBUOutline0.m$1("Should not attempt to get bindings when Fragment views are destroyed.");
            return null;
        }
        View requireView = fragment.requireView();
        requireView.getClass();
        ViewBinding viewBinding2 = (ViewBinding) this.b.invoke(requireView);
        this.c = viewBinding2;
        return viewBinding2;
    }
}
