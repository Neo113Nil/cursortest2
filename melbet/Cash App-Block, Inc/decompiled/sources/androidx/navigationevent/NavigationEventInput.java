package androidx.navigationevent;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes.dex */
public abstract class NavigationEventInput {
    public NavigationEventDispatcher dispatcher;
    public boolean isPredictiveBackInProgress;

    public final void dispatchOnBackCompleted() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null) {
            a$$ExternalSyntheticBUOutline0.m$1("This input is not added to any dispatcher.");
            return;
        }
        if (!this.isPredictiveBackInProgress) {
            navigationEventDispatcher.dispatchOnStarted$navigationevent(this, null);
        }
        NavigationEventProcessor navigationEventProcessor = navigationEventDispatcher.sharedProcessor;
        OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 = navigationEventDispatcher.onBackCompletedFallback;
        navigationEventProcessor.getClass();
        if (equals(navigationEventProcessor.inProgressInput) && -1 == navigationEventProcessor.inProgressDirection) {
            NavigationEventHandler navigationEventHandler = navigationEventProcessor.inProgressHandler;
            if (navigationEventHandler == null) {
                navigationEventHandler = navigationEventProcessor.resolveEnabledHandler(-1);
            }
            navigationEventProcessor.inProgressHandler = null;
            navigationEventProcessor.inProgressDirection = 0;
            navigationEventProcessor.inProgressInput = null;
            if (navigationEventHandler == null) {
                Runnable runnable = ((OnBackPressedDispatcher) onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0.f$0).fallbackOnBackPressed;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                navigationEventHandler.onBackCompleted();
            }
            StateFlowImpl stateFlowImpl = navigationEventProcessor._transitionState;
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, NavigationEventTransitionState$Idle.INSTANCE);
        }
        this.isPredictiveBackInProgress = false;
    }

    public void onHasEnabledHandlersChanged(boolean z) {
    }
}
