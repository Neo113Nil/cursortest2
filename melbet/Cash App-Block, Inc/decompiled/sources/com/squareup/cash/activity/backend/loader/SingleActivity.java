package com.squareup.cash.activity.backend.loader;

import com.squareup.cash.activity.backend.ActivityItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class SingleActivity {
    public final ActivityItem activityItem;
    public final LoadingState loadingState;

    public SingleActivity(LoadingState loadingState) {
        this.activityItem = null;
        this.loadingState = loadingState;
    }

    public static SingleActivity copy$default(SingleActivity singleActivity, ActivityItem activityItem, LoadingState loadingState, int i) {
        if ((i & 1) != 0) {
            activityItem = singleActivity.activityItem;
        }
        if ((i & 2) != 0) {
            loadingState = singleActivity.loadingState;
        }
        singleActivity.getClass();
        loadingState.getClass();
        return new SingleActivity(activityItem, loadingState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleActivity)) {
            return false;
        }
        SingleActivity singleActivity = (SingleActivity) obj;
        return Intrinsics.areEqual(this.activityItem, singleActivity.activityItem) && this.loadingState == singleActivity.loadingState;
    }

    public final int hashCode() {
        ActivityItem activityItem = this.activityItem;
        return this.loadingState.hashCode() + ((activityItem == null ? 0 : activityItem.hashCode()) * 31);
    }

    public final String toString() {
        return "SingleActivity(activityItem=" + this.activityItem + ", loadingState=" + this.loadingState + ")";
    }

    public SingleActivity(ActivityItem activityItem, LoadingState loadingState) {
        this.activityItem = activityItem;
        this.loadingState = loadingState;
    }
}
