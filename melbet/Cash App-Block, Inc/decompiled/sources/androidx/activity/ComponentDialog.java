package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.camera.core.Preview$$ExternalSyntheticLambda0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.navigationevent.DirectNavigationEventInput;
import androidx.navigationevent.NavigationEventDispatcher;
import androidx.navigationevent.NavigationEventDispatcherOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.internal.SavedStateRegistryImpl;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import com.squareup.cash.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class ComponentDialog extends Dialog implements LifecycleOwner, OnBackPressedDispatcherOwner, NavigationEventDispatcherOwner, SavedStateRegistryOwner {
    public LifecycleRegistry _lifecycleRegistry;
    public final Lazy onBackPressedDispatcher$delegate;
    public final Lazy onBackPressedInput$delegate;
    public final SavedStateRegistryController savedStateRegistryController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComponentDialog(Context context, int i) {
        super(context, i);
        context.getClass();
        this.savedStateRegistryController = new SavedStateRegistryController(new SavedStateRegistryImpl(this, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 18)));
        final int i2 = 0;
        this.onBackPressedInput$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            public final /* synthetic */ ComponentDialog f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ComponentDialog componentDialog = this.f$0;
                switch (i3) {
                    case 0:
                        DirectNavigationEventInput directNavigationEventInput = new DirectNavigationEventInput();
                        componentDialog.getNavigationEventDispatcher().addInput(directNavigationEventInput);
                        return directNavigationEventInput;
                    default:
                        return new OnBackPressedDispatcher(new Preview$$ExternalSyntheticLambda0(componentDialog, 1));
                }
            }
        });
        final int i3 = 1;
        this.onBackPressedDispatcher$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.activity.ComponentDialog$$ExternalSyntheticLambda0
            public final /* synthetic */ ComponentDialog f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                ComponentDialog componentDialog = this.f$0;
                switch (i32) {
                    case 0:
                        DirectNavigationEventInput directNavigationEventInput = new DirectNavigationEventInput();
                        componentDialog.getNavigationEventDispatcher().addInput(directNavigationEventInput);
                        return directNavigationEventInput;
                    default:
                        return new OnBackPressedDispatcher(new Preview$$ExternalSyntheticLambda0(componentDialog, 1));
                }
            }
        });
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    public final LifecycleRegistry getLifecycleRegistry() {
        LifecycleRegistry lifecycleRegistry = this._lifecycleRegistry;
        if (lifecycleRegistry != null) {
            return lifecycleRegistry;
        }
        LifecycleRegistry lifecycleRegistry2 = new LifecycleRegistry(this, true);
        this._lifecycleRegistry = lifecycleRegistry2;
        return lifecycleRegistry2;
    }

    @Override // androidx.navigationevent.NavigationEventDispatcherOwner
    public final NavigationEventDispatcher getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().getEventInput().dispatcher;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.savedStateRegistry;
    }

    public final void initializeViewTreeOwners() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((DirectNavigationEventInput) this.onBackPressedInput$delegate.getValue()).dispatchOnBackCompleted();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.setOnBackInvokedDispatcher(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.performRestore(bundle);
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.savedStateRegistryController.performSave(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        initializeViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }
}
