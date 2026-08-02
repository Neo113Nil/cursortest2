package com.squareup.cash.genericelements.presenters.analytics;

import com.squareup.cash.cdf.Event;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class GenericCdfEvent implements Event {
    public final String name;
    public final Map parameters;

    public GenericCdfEvent(String str, Map map) {
        str.getClass();
        map.getClass();
        this.name = str;
        this.parameters = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericCdfEvent)) {
            return false;
        }
        GenericCdfEvent genericCdfEvent = (GenericCdfEvent) obj;
        return Intrinsics.areEqual(this.name, genericCdfEvent.name) && Intrinsics.areEqual(this.parameters, genericCdfEvent.parameters);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return this.name;
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.parameters.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "GenericCdfEvent(name=" + this.name + ", parameters=" + this.parameters + ")";
    }
}
