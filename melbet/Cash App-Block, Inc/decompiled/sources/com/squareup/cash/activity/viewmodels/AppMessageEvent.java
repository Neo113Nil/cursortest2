package com.squareup.cash.activity.viewmodels;

import com.squareup.cash.appmessages.AppMessageViewEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AppMessageEvent implements ActivityTabViewEvent {
    public final AppMessageViewEvent appMessageEvent;

    public AppMessageEvent(AppMessageViewEvent appMessageViewEvent) {
        appMessageViewEvent.getClass();
        this.appMessageEvent = appMessageViewEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppMessageEvent) && Intrinsics.areEqual(this.appMessageEvent, ((AppMessageEvent) obj).appMessageEvent);
    }

    public final int hashCode() {
        return this.appMessageEvent.hashCode();
    }

    public final String toString() {
        return "AppMessageEvent(appMessageEvent=" + this.appMessageEvent + ")";
    }
}
