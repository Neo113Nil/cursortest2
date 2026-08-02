package com.squareup.cash.activity.backend.loader;

import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Activities {
    public final List aggregations;
    public final boolean hasMore;
    public final LoadingState loadingState;
    public final ActivitiesManager.ActivityPage.PageOffset nextPageCursor;
    public final List recentActivities;
    public final Lazy recentActivitiesByTokens$delegate;

    public Activities(List list, List list2, ActivitiesManager.ActivityPage.PageOffset pageOffset, boolean z, LoadingState loadingState) {
        this.recentActivities = list;
        this.aggregations = list2;
        this.nextPageCursor = pageOffset;
        this.hasMore = z;
        this.loadingState = loadingState;
        this.recentActivitiesByTokens$delegate = LazyKt.lazy(new yf$$ExternalSyntheticLambda2(this, 16));
    }

    public static Activities copy$default(Activities activities, List list, LoadingState loadingState, int i) {
        if ((i & 1) != 0) {
            list = activities.recentActivities;
        }
        List list2 = list;
        List list3 = activities.aggregations;
        ActivitiesManager.ActivityPage.PageOffset pageOffset = activities.nextPageCursor;
        boolean z = activities.hasMore;
        if ((i & 16) != 0) {
            loadingState = activities.loadingState;
        }
        LoadingState loadingState2 = loadingState;
        activities.getClass();
        loadingState2.getClass();
        return new Activities(list2, list3, pageOffset, z, loadingState2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Activities)) {
            return false;
        }
        Activities activities = (Activities) obj;
        return Intrinsics.areEqual(this.recentActivities, activities.recentActivities) && Intrinsics.areEqual(this.aggregations, activities.aggregations) && Intrinsics.areEqual(this.nextPageCursor, activities.nextPageCursor) && this.hasMore == activities.hasMore && this.loadingState == activities.loadingState;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final ActivitiesManager.ActivityPage.PageOffset getNextPageCursor() {
        return this.nextPageCursor;
    }

    public final List getRecentActivities() {
        return this.recentActivities;
    }

    public final int hashCode() {
        List list = this.recentActivities;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.aggregations;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        ActivitiesManager.ActivityPage.PageOffset pageOffset = this.nextPageCursor;
        return this.loadingState.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode2 + (pageOffset != null ? pageOffset.offset.hashCode() : 0)) * 31, 31, this.hasMore);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Activities(recentActivities=", ", aggregations=", ", nextPageCursor=", this.recentActivities, this.aggregations);
        m.append(this.nextPageCursor);
        m.append(", hasMore=");
        m.append(this.hasMore);
        m.append(", loadingState=");
        m.append(this.loadingState);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ Activities(List list, LoadingState loadingState, int i) {
        this((i & 1) != 0 ? null : list, null, null, false, loadingState);
    }
}
