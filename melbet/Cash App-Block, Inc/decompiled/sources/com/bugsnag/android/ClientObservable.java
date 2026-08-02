package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.StateObserver;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ClientObservable extends BaseObservable {
    public final void postSynchronizeState() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((StateObserver) it.next()).onStateChange(StateEvent.SynchronizeState.INSTANCE);
        }
    }
}
