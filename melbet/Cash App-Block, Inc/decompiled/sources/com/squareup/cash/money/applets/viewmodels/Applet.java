package com.squareup.cash.money.applets.viewmodels;

import com.squareup.cash.money.core.ids.AppletId;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes6.dex */
public final class Applet {
    public final StateFlow availabilityState;
    public final AppletId id;
    public final Function2 tileBuilder;

    public Applet(AppletId appletId, StateFlow stateFlow, Function2 function2) {
        appletId.getClass();
        stateFlow.getClass();
        this.id = appletId;
        this.availabilityState = stateFlow;
        this.tileBuilder = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Applet)) {
            return false;
        }
        Applet applet = (Applet) obj;
        return this.id == applet.id && Intrinsics.areEqual(this.availabilityState, applet.availabilityState) && this.tileBuilder.equals(applet.tileBuilder);
    }

    public final int hashCode() {
        return this.tileBuilder.hashCode() + ((this.availabilityState.hashCode() + (this.id.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Applet(id=" + this.id + ", availabilityState=" + this.availabilityState + ", tileBuilder=" + this.tileBuilder + ")";
    }
}
