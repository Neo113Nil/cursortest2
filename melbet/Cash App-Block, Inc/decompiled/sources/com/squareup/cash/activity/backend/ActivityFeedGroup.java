package com.squareup.cash.activity.backend;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ActivityFeedGroup {
    public final Object aggregation;
    public final ActivityGrouping grouping;
    public final List items;

    public ActivityFeedGroup(ActivityGrouping activityGrouping, List list, Object obj) {
        activityGrouping.getClass();
        list.getClass();
        this.grouping = activityGrouping;
        this.items = list;
        this.aggregation = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityFeedGroup)) {
            return false;
        }
        ActivityFeedGroup activityFeedGroup = (ActivityFeedGroup) obj;
        return Intrinsics.areEqual(this.grouping, activityFeedGroup.grouping) && Intrinsics.areEqual(this.items, activityFeedGroup.items) && Intrinsics.areEqual(this.aggregation, activityFeedGroup.aggregation);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.grouping.hashCode() * 31, 31, this.items);
        Object obj = this.aggregation;
        return m + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityFeedGroup(grouping=");
        sb.append(this.grouping);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", aggregation=");
        return Recorder$$ExternalSyntheticOutline1.m(sb, this.aggregation, ")");
    }
}
