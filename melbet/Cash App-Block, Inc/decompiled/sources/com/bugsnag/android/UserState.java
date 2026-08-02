package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.StateObserver;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class UserState extends BaseObservable {
    public User user;

    public UserState(User user) {
        this.user = user;
    }

    public final void emitObservableEvent() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        StateEvent.UpdateUser updateUser = new StateEvent.UpdateUser(this.user);
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((StateObserver) it.next()).onStateChange(updateUser);
        }
    }
}
