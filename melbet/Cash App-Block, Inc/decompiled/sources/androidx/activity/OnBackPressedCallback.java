package androidx.activity;

import androidx.navigationevent.NavigationEvent;
import androidx.navigationevent.NavigationEventHandler;
import androidx.navigationevent.NavigationEventInfo;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class OnBackPressedCallback {
    private boolean isEnabled;
    private final List<OnBackPressedEventHandler> eventHandlers = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    public final class OnBackPressedEventHandler extends NavigationEventHandler {
        public boolean isLifecycleActive;
        public final OnBackPressedCallback onBackPressedCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnBackPressedEventHandler(OnBackPressedCallback onBackPressedCallback, NavigationEventInfo navigationEventInfo) {
            super(navigationEventInfo, onBackPressedCallback.isEnabled());
            navigationEventInfo.getClass();
            this.onBackPressedCallback = onBackPressedCallback;
            this.isLifecycleActive = true;
        }

        @Override // androidx.navigationevent.NavigationEventHandler
        public final void onBackCancelled() {
            this.onBackPressedCallback.handleOnBackCancelled();
        }

        @Override // androidx.navigationevent.NavigationEventHandler
        public final void onBackCompleted() {
            this.onBackPressedCallback.handleOnBackPressed();
        }

        @Override // androidx.navigationevent.NavigationEventHandler
        public final void onBackProgressed(NavigationEvent navigationEvent) {
            this.onBackPressedCallback.handleOnBackProgressed(new BackEventCompat(navigationEvent));
        }

        @Override // androidx.navigationevent.NavigationEventHandler
        public final void onBackStarted(NavigationEvent navigationEvent) {
            navigationEvent.getClass();
            this.onBackPressedCallback.handleOnBackStarted(new BackEventCompat(navigationEvent));
        }

        public final void setLifecycleActive(boolean z) {
            this.isLifecycleActive = z;
            setBackEnabled(z && this.onBackPressedCallback.isEnabled());
        }
    }

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    public final void addCloseable$activity(AutoCloseable autoCloseable) {
        autoCloseable.getClass();
        this.closeables.add(autoCloseable);
    }

    public final OnBackPressedEventHandler createNavigationEventHandler$activity(NavigationEventInfo navigationEventInfo) {
        navigationEventInfo.getClass();
        OnBackPressedEventHandler onBackPressedEventHandler = new OnBackPressedEventHandler(this, navigationEventInfo);
        this.eventHandlers.add(onBackPressedEventHandler);
        return onBackPressedEventHandler;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(BackEventCompat backEventCompat) {
        backEventCompat.getClass();
    }

    public void handleOnBackStarted(BackEventCompat backEventCompat) {
        backEventCompat.getClass();
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<AutoCloseable> it = this.closeables.iterator();
        it.getClass();
        while (it.hasNext()) {
            JsonLogicResult$Success$$ExternalSyntheticOutline0.m(it.next());
        }
        this.closeables.clear();
        Iterator<OnBackPressedEventHandler> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().remove();
        }
        this.eventHandlers.clear();
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        for (OnBackPressedEventHandler onBackPressedEventHandler : this.eventHandlers) {
            onBackPressedEventHandler.setBackEnabled(onBackPressedEventHandler.isLifecycleActive && z);
        }
    }
}
