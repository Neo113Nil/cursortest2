package com.squareup.cash.savings.presenters;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class SavingsActivitySectionParams {
    public final ActivitiesCache activityCache;
    public final ActivitiesManager.ActivityContext activityContext;
    public final Screen screenContext;

    public SavingsActivitySectionParams(ActivitiesManager.ActivityContext activityContext, ActivitiesCache activitiesCache, Screen screen) {
        screen.getClass();
        this.activityContext = activityContext;
        this.activityCache = activitiesCache;
        this.screenContext = screen;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SavingsActivitySectionParams)) {
            return false;
        }
        SavingsActivitySectionParams savingsActivitySectionParams = (SavingsActivitySectionParams) obj;
        return Intrinsics.areEqual(this.activityContext, savingsActivitySectionParams.activityContext) && Intrinsics.areEqual(this.activityCache, savingsActivitySectionParams.activityCache) && Intrinsics.areEqual(this.screenContext, savingsActivitySectionParams.screenContext);
    }

    public final int hashCode() {
        ActivitiesManager.ActivityContext activityContext = this.activityContext;
        int hashCode = (activityContext == null ? 0 : activityContext.hashCode()) * 31;
        ActivitiesCache activitiesCache = this.activityCache;
        return this.screenContext.hashCode() + ((hashCode + (activitiesCache != null ? activitiesCache.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "SavingsActivitySectionParams(activityContext=" + this.activityContext + ", activityCache=" + this.activityCache + ", screenContext=" + this.screenContext + ")";
    }
}
