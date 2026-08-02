package com.squareup.cash.family.activity.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.LoadingState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class FamilySharedActivityCache implements ActivitiesCache {
    public final ActivitiesManager.ActivityContext context;
    public final FamilyActivitiesStorage storage;

    public FamilySharedActivityCache(ActivitiesManager.ActivityContext activityContext, FamilyActivitiesStorage familyActivitiesStorage) {
        this.context = activityContext;
        this.storage = familyActivitiesStorage;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesCache
    public final void clear() {
        this.storage.loadedDependentActivitiesCache.clear();
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesCache
    public final ActivityItem get(String str) {
        str.getClass();
        Activities activities = (Activities) this.storage.loadedDependentActivitiesCache.get(this.context);
        Object obj = null;
        if (activities != null) {
            if (activities.loadingState == LoadingState.LOADED) {
                List list = activities.recentActivities;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (Intrinsics.areEqual(((ActivityItem) next).getRowId(), str)) {
                            obj = next;
                            break;
                        }
                    }
                    return (ActivityItem) obj;
                }
            } else {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
            }
        }
        return null;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesCache
    public final void set(Activities activities) {
        HashMap hashMap = this.storage.loadedDependentActivitiesCache;
        ActivitiesManager.ActivityContext activityContext = this.context;
        if (activities == null) {
            hashMap.remove(activityContext);
        } else {
            hashMap.put(activityContext, activities);
        }
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesCache
    public final Activities get() {
        Activities activities = (Activities) this.storage.loadedDependentActivitiesCache.get(this.context);
        if (activities != null) {
            if (activities.loadingState == LoadingState.LOADED) {
                return activities;
            }
            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
        }
        return null;
    }
}
