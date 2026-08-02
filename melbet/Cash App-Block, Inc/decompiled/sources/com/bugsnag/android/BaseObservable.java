package com.bugsnag.android;

import com.bugsnag.android.internal.StateObserver;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class BaseObservable {
    private final CopyOnWriteArrayList<StateObserver> observers = new CopyOnWriteArrayList<>();

    public final void addObserver(StateObserver stateObserver) {
        this.observers.addIfAbsent(stateObserver);
    }

    public final CopyOnWriteArrayList<StateObserver> getObservers$bugsnag_android_core_release() {
        return this.observers;
    }

    public final void removeObserver(StateObserver stateObserver) {
        this.observers.remove(stateObserver);
    }

    public final void updateState(StateEvent stateEvent) {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((StateObserver) it.next()).onStateChange(stateEvent);
        }
    }

    public final void updateState$bugsnag_android_core_release(Function0<? extends StateEvent> function0) {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        StateEvent stateEvent = (StateEvent) function0.invoke();
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((StateObserver) it.next()).onStateChange(stateEvent);
        }
    }
}
