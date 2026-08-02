package androidx.activity;

import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher$addCallback$lifecycleObserver$1 implements LifecycleEventObserver, AutoCloseable {
    public final /* synthetic */ OnBackPressedCallback.OnBackPressedEventHandler $eventHandler;
    public final /* synthetic */ Lifecycle $lifecycle;

    public OnBackPressedDispatcher$addCallback$lifecycleObserver$1(OnBackPressedCallback.OnBackPressedEventHandler onBackPressedEventHandler, OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle) {
        this.$eventHandler = onBackPressedEventHandler;
        this.$lifecycle = lifecycle;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.$lifecycle.removeObserver(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle.Event event2 = Lifecycle.Event.ON_START;
        OnBackPressedCallback.OnBackPressedEventHandler onBackPressedEventHandler = this.$eventHandler;
        if (event == event2) {
            onBackPressedEventHandler.setLifecycleActive(true);
        } else if (event == Lifecycle.Event.ON_STOP) {
            onBackPressedEventHandler.setLifecycleActive(false);
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            onBackPressedEventHandler.remove();
            this.$lifecycle.removeObserver(this);
        }
    }
}
