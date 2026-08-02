package androidx.navigationevent;

import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public abstract class NavigationEventHandler {
    public final EmptyList backInfo;
    public final NavigationEventInfo currentInfo;
    public NavigationEventDispatcher dispatcher;
    public final EmptyList forwardInfo;
    public boolean isBackEnabled;

    public NavigationEventHandler(NavigationEventInfo navigationEventInfo, boolean z) {
        navigationEventInfo.getClass();
        this.currentInfo = navigationEventInfo;
        EmptyList emptyList = EmptyList.INSTANCE;
        this.backInfo = emptyList;
        this.forwardInfo = emptyList;
        this.isBackEnabled = z;
    }

    public abstract void onBackCancelled();

    public abstract void onBackCompleted();

    public abstract void onBackProgressed(NavigationEvent navigationEvent);

    public abstract void onBackStarted(NavigationEvent navigationEvent);

    public final void remove() {
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || !navigationEventDispatcher.handlers.remove(this)) {
            return;
        }
        NavigationEventProcessor navigationEventProcessor = navigationEventDispatcher.sharedProcessor;
        navigationEventProcessor.getClass();
        if (equals(navigationEventProcessor.inProgressHandler)) {
            if (navigationEventProcessor.inProgressDirection == -1) {
                onBackCancelled();
            }
            navigationEventProcessor.inProgressHandler = null;
            navigationEventProcessor.inProgressDirection = 0;
            navigationEventProcessor.inProgressInput = null;
        }
        navigationEventProcessor.overlayHandlers.remove(this);
        navigationEventProcessor.defaultHandlers.remove(this);
        this.dispatcher = null;
        navigationEventProcessor.refreshEnabledHandlers();
    }

    public final void setBackEnabled(boolean z) {
        NavigationEventProcessor navigationEventProcessor;
        if (this.isBackEnabled == z) {
            return;
        }
        this.isBackEnabled = z;
        NavigationEventDispatcher navigationEventDispatcher = this.dispatcher;
        if (navigationEventDispatcher == null || (navigationEventProcessor = navigationEventDispatcher.sharedProcessor) == null) {
            return;
        }
        navigationEventProcessor.refreshEnabledHandlers();
    }
}
