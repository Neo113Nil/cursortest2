package com.squareup.cash.genericelements.viewmodels;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class GenericAnalyticsData {
    public final String name;
    public final Map parameters;

    public GenericAnalyticsData(String str, Map map) {
        str.getClass();
        map.getClass();
        this.name = str;
        this.parameters = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenericAnalyticsData)) {
            return false;
        }
        GenericAnalyticsData genericAnalyticsData = (GenericAnalyticsData) obj;
        return Intrinsics.areEqual(this.name, genericAnalyticsData.name) && Intrinsics.areEqual(this.parameters, genericAnalyticsData.parameters);
    }

    public final int hashCode() {
        return this.parameters.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        return "GenericAnalyticsData(name=" + this.name + ", parameters=" + this.parameters + ")";
    }
}
