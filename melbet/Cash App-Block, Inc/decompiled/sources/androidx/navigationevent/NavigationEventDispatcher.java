package androidx.navigationevent;

import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashSet;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class NavigationEventDispatcher {
    public final LinkedHashSet handlers;
    public final LinkedHashSet inputs;
    public final OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackCompletedFallback;
    public final NavigationEventProcessor sharedProcessor = new NavigationEventProcessor();

    public NavigationEventDispatcher(OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0) {
        this.onBackCompletedFallback = onBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
        new LinkedHashSet();
        this.handlers = new LinkedHashSet();
        this.inputs = new LinkedHashSet();
    }

    public static void addHandler$default(NavigationEventDispatcher navigationEventDispatcher, NavigationEventHandler navigationEventHandler) {
        navigationEventDispatcher.getClass();
        navigationEventHandler.getClass();
        if (navigationEventDispatcher.handlers.add(navigationEventHandler)) {
            NavigationEventProcessor navigationEventProcessor = navigationEventDispatcher.sharedProcessor;
            navigationEventProcessor.getClass();
            if (navigationEventHandler.dispatcher != null) {
                a$$ExternalSyntheticBUOutline0.m("Handler '", navigationEventHandler, "' is already registered with a dispatcher");
                return;
            }
            navigationEventProcessor.defaultHandlers.addFirst(navigationEventHandler);
            navigationEventHandler.dispatcher = navigationEventDispatcher;
            navigationEventProcessor.refreshEnabledHandlers();
        }
    }

    public final void addInput(OnBackInvokedInput onBackInvokedInput, int i) {
        if (i != 1 && i != 0) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Unsupported priority value: "));
        } else if (this.inputs.add(onBackInvokedInput)) {
            this.sharedProcessor.addInput(this, onBackInvokedInput, i);
        }
    }

    public final void dispatchOnStarted$navigationevent(NavigationEventInput navigationEventInput, NavigationEvent navigationEvent) {
        NavigationEventProcessor navigationEventProcessor = this.sharedProcessor;
        navigationEventProcessor.getClass();
        if (navigationEventProcessor.inProgressDirection != 0) {
            return;
        }
        NavigationEventHandler resolveEnabledHandler = navigationEventProcessor.resolveEnabledHandler(-1);
        navigationEventProcessor.inProgressHandler = resolveEnabledHandler;
        navigationEventProcessor.inProgressDirection = -1;
        navigationEventProcessor.inProgressInput = navigationEventInput;
        if (navigationEvent != null) {
            if (resolveEnabledHandler != null) {
                resolveEnabledHandler.onBackStarted(navigationEvent);
            }
            StateFlowImpl stateFlowImpl = navigationEventProcessor._transitionState;
            NavigationEventTransitionState$InProgress navigationEventTransitionState$InProgress = new NavigationEventTransitionState$InProgress(navigationEvent);
            stateFlowImpl.getClass();
            stateFlowImpl.updateState(null, navigationEventTransitionState$InProgress);
        }
    }

    public final void addInput(NavigationEventInput navigationEventInput) {
        if (this.inputs.add(navigationEventInput)) {
            this.sharedProcessor.addInput(this, navigationEventInput, -1);
        }
    }
}
