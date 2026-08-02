package androidx.activity;

import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigationevent.NavigationEventDispatcher;
import androidx.navigationevent.NavigationEventInput;
import androidx.navigationevent.OnBackInvokedDefaultInput;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "", "OnBackPressedEventInput", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    public final Lazy eventInput$delegate;
    public final Runnable fallbackOnBackPressed;
    public boolean hasEnabledCallbacks;

    public final class OnBackPressedEventInput extends NavigationEventInput {
        public final NavigationEventDispatcher dispatcher;

        public OnBackPressedEventInput() {
            NavigationEventDispatcher navigationEventDispatcher = new NavigationEventDispatcher(new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(OnBackPressedDispatcher.this, 0));
            navigationEventDispatcher.addInput(this);
            this.dispatcher = navigationEventDispatcher;
        }

        @Override // androidx.navigationevent.NavigationEventInput
        public final void onHasEnabledHandlersChanged(boolean z) {
            OnBackPressedDispatcher.this.hasEnabledCallbacks = z;
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.fallbackOnBackPressed = runnable;
        this.eventInput$delegate = LazyKt.lazy(new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 1));
    }

    public final void addCallback(OnBackPressedCallback onBackPressedCallback, LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
        onBackPressedCallback.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        OnBackPressedCallback.OnBackPressedEventHandler createNavigationEventHandler$activity = onBackPressedCallback.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(onBackPressedCallback, lifecycleOwner));
        createNavigationEventHandler$activity.setLifecycleActive(false);
        NavigationEventDispatcher.addHandler$default(getEventInput().dispatcher, createNavigationEventHandler$activity);
        OnBackPressedDispatcher$addCallback$lifecycleObserver$1 onBackPressedDispatcher$addCallback$lifecycleObserver$1 = new OnBackPressedDispatcher$addCallback$lifecycleObserver$1(createNavigationEventHandler$activity, this, lifecycle);
        lifecycle.addObserver(onBackPressedDispatcher$addCallback$lifecycleObserver$1);
        onBackPressedCallback.addCloseable$activity(onBackPressedDispatcher$addCallback$lifecycleObserver$1);
    }

    public final OnBackPressedEventInput getEventInput() {
        return (OnBackPressedEventInput) this.eventInput$delegate.getValue();
    }

    public final void onBackPressed() {
        getEventInput().dispatchOnBackCompleted();
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        onBackInvokedDispatcher.getClass();
        getEventInput().dispatcher.addInput(new OnBackInvokedDefaultInput(onBackInvokedDispatcher, 0), 1);
        getEventInput().dispatcher.addInput(new OnBackInvokedDefaultInput(onBackInvokedDispatcher, 1000000), 0);
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        onBackPressedCallback.getClass();
        NavigationEventDispatcher.addHandler$default(getEventInput().dispatcher, onBackPressedCallback.createNavigationEventHandler$activity(new OnBackPressedCallbackInfo(onBackPressedCallback, null)));
    }
}
