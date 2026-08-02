package com.bugsnag.android;

import com.bugsnag.android.StateEvent;
import com.bugsnag.android.internal.StateObserver;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class MemoryTrimState extends BaseObservable {
    public boolean isLowMemory;
    public Integer memoryTrimLevel;

    public final void emitObservableEvent() {
        if (getObservers$bugsnag_android_core_release().isEmpty()) {
            return;
        }
        StateEvent.UpdateMemoryTrimEvent updateMemoryTrimEvent = new StateEvent.UpdateMemoryTrimEvent(this.isLowMemory, getTrimLevelDescription());
        Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
        while (it.hasNext()) {
            ((StateObserver) it.next()).onStateChange(updateMemoryTrimEvent);
        }
    }

    public final String getTrimLevelDescription() {
        Integer num = this.memoryTrimLevel;
        if (num == null) {
            return "None";
        }
        if (num.intValue() == 80) {
            return "Complete";
        }
        if (num.intValue() == 60) {
            return "Moderate";
        }
        if (num.intValue() == 40) {
            return "Background";
        }
        if (num.intValue() == 20) {
            return "UI hidden";
        }
        if (num.intValue() == 15) {
            return "Running critical";
        }
        if (num.intValue() == 10) {
            return "Running low";
        }
        if (num.intValue() == 5) {
            return "Running moderate";
        }
        return "Unknown (" + num + ')';
    }
}
