package androidx.navigationevent;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public abstract class OnBackInvokedInput extends NavigationEventInput {
    public boolean backInvokedCallbackRegistered;
    public final OnBackInvokedCallback onBackInvokedCallback;
    public final int onBackInvokedCallbackPriority;
    public final OnBackInvokedDispatcher onBackInvokedDispatcher;

    public OnBackInvokedInput(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.onBackInvokedDispatcher = onBackInvokedDispatcher;
        this.onBackInvokedCallbackPriority = i;
        this.onBackInvokedCallback = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: androidx.navigationevent.OnBackInvokedInput$$ExternalSyntheticLambda0
            public final void onBackInvoked() {
                OnBackInvokedInput.this.dispatchOnBackCompleted();
            }
        } : new OnBackAnimationCallback() { // from class: androidx.navigationevent.OnBackInvokedInput$createOnBackAnimationCallback$1
            public final void onBackCancelled() {
                OnBackInvokedInput onBackInvokedInput = OnBackInvokedInput.this;
                NavigationEventDispatcher navigationEventDispatcher = onBackInvokedInput.dispatcher;
                if (navigationEventDispatcher == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("This input is not added to any dispatcher.");
                    return;
                }
                if (!onBackInvokedInput.isPredictiveBackInProgress) {
                    navigationEventDispatcher.dispatchOnStarted$navigationevent(onBackInvokedInput, null);
                }
                NavigationEventProcessor navigationEventProcessor = navigationEventDispatcher.sharedProcessor;
                navigationEventProcessor.getClass();
                if (onBackInvokedInput.equals(navigationEventProcessor.inProgressInput) && -1 == navigationEventProcessor.inProgressDirection) {
                    NavigationEventHandler navigationEventHandler = navigationEventProcessor.inProgressHandler;
                    if (navigationEventHandler == null) {
                        navigationEventHandler = navigationEventProcessor.resolveEnabledHandler(-1);
                    }
                    navigationEventProcessor.inProgressHandler = null;
                    navigationEventProcessor.inProgressDirection = 0;
                    navigationEventProcessor.inProgressInput = null;
                    if (navigationEventHandler != null) {
                        navigationEventHandler.onBackCancelled();
                    }
                    StateFlowImpl stateFlowImpl = navigationEventProcessor._transitionState;
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, NavigationEventTransitionState$Idle.INSTANCE);
                }
                onBackInvokedInput.isPredictiveBackInProgress = false;
            }

            public final void onBackInvoked() {
                OnBackInvokedInput.this.dispatchOnBackCompleted();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                backEvent.getClass();
                NavigationEvent NavigationEvent = NavigationEvent_androidKt.NavigationEvent(backEvent);
                OnBackInvokedInput onBackInvokedInput = OnBackInvokedInput.this;
                NavigationEventDispatcher navigationEventDispatcher = onBackInvokedInput.dispatcher;
                if (navigationEventDispatcher == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("This input is not added to any dispatcher.");
                    return;
                }
                if (onBackInvokedInput.isPredictiveBackInProgress) {
                    NavigationEventProcessor navigationEventProcessor = navigationEventDispatcher.sharedProcessor;
                    navigationEventProcessor.getClass();
                    if (onBackInvokedInput.equals(navigationEventProcessor.inProgressInput) && -1 == navigationEventProcessor.inProgressDirection) {
                        NavigationEventHandler navigationEventHandler = navigationEventProcessor.inProgressHandler;
                        if (navigationEventHandler == null) {
                            navigationEventHandler = navigationEventProcessor.resolveEnabledHandler(-1);
                        }
                        if (navigationEventHandler != null) {
                            navigationEventHandler.onBackProgressed(NavigationEvent);
                        }
                        StateFlowImpl stateFlowImpl = navigationEventProcessor._transitionState;
                        NavigationEventTransitionState$InProgress navigationEventTransitionState$InProgress = new NavigationEventTransitionState$InProgress(NavigationEvent);
                        stateFlowImpl.getClass();
                        stateFlowImpl.updateState(null, navigationEventTransitionState$InProgress);
                    }
                }
            }

            public final void onBackStarted(BackEvent backEvent) {
                backEvent.getClass();
                NavigationEvent NavigationEvent = NavigationEvent_androidKt.NavigationEvent(backEvent);
                OnBackInvokedInput onBackInvokedInput = OnBackInvokedInput.this;
                NavigationEventDispatcher navigationEventDispatcher = onBackInvokedInput.dispatcher;
                if (navigationEventDispatcher == null) {
                    a$$ExternalSyntheticBUOutline0.m$1("This input is not added to any dispatcher.");
                } else {
                    if (onBackInvokedInput.isPredictiveBackInProgress) {
                        return;
                    }
                    navigationEventDispatcher.dispatchOnStarted$navigationevent(onBackInvokedInput, NavigationEvent);
                    onBackInvokedInput.isPredictiveBackInProgress = true;
                }
            }
        };
    }

    @Override // androidx.navigationevent.NavigationEventInput
    public final void onHasEnabledHandlersChanged(boolean z) {
        if (z && !this.backInvokedCallbackRegistered) {
            this.onBackInvokedDispatcher.registerOnBackInvokedCallback(this.onBackInvokedCallbackPriority, this.onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (z || !this.backInvokedCallbackRegistered) {
                return;
            }
            this.onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }
}
