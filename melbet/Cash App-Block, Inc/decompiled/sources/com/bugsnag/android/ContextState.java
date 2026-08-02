package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.StateObserver;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ContextState extends BaseObservable {
    public String automaticContext;
    public String manualContext;

    public final void emitObservableEvent() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        String str = this.automaticContext;
        if (str == "__BUGSNAG_MANUAL_CONTEXT__") {
            str = null;
        }
        if (str == null) {
            str = this.manualContext;
        }
        StateEvent.UpdateContext updateContext = new StateEvent.UpdateContext(str);
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((StateObserver) it.next()).onStateChange(updateContext);
        }
    }
}
