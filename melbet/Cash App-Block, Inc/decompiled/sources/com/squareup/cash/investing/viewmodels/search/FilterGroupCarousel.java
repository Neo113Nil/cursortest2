package com.squareup.cash.investing.viewmodels.search;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FilterGroupCarousel {
    public final List filterGroups;

    public FilterGroupCarousel(List list) {
        list.getClass();
        this.filterGroups = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FilterGroupCarousel) && Intrinsics.areEqual(this.filterGroups, ((FilterGroupCarousel) obj).filterGroups);
    }

    public final int hashCode() {
        return this.filterGroups.hashCode();
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("FilterGroupCarousel(filterGroups=", ")", this.filterGroups);
    }
}
