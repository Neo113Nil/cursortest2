package com.squareup.cash.activity.backend.loader;

import com.squareup.cash.activity.backend.ActivityItem;

/* loaded from: classes5.dex */
public final class ActivitiesManager$ActivityGetHandler$Success implements ActivitiesManager$ActivityGetHandler$Result {
    public final ActivityItem item;

    public ActivitiesManager$ActivityGetHandler$Success(ActivityItem activityItem) {
        this.item = activityItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ActivitiesManager$ActivityGetHandler$Success) && this.item.equals(((ActivitiesManager$ActivityGetHandler$Success) obj).item);
    }

    public final int hashCode() {
        return this.item.hashCode();
    }

    public final String toString() {
        return "Success(item=" + this.item + ")";
    }
}
