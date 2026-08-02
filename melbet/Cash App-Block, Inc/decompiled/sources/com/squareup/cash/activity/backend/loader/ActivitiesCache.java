package com.squareup.cash.activity.backend.loader;

import com.squareup.cash.activity.backend.ActivityItem;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public interface ActivitiesCache {
    void clear();

    ActivityItem get(String str);

    Activities get();

    void set(Activities activities);

    public class InMemory implements ActivitiesCache {
        public final LinkedHashMap activitiesById = new LinkedHashMap();
        public Activities activity;

        @Override // com.squareup.cash.activity.backend.loader.ActivitiesCache
        public final void clear() {
            this.activity = null;
            this.activitiesById.clear();
        }

        @Override // com.squareup.cash.activity.backend.loader.ActivitiesCache
        public final ActivityItem get(String str) {
            str.getClass();
            return (ActivityItem) this.activitiesById.get(str);
        }

        @Override // com.squareup.cash.activity.backend.loader.ActivitiesCache
        public final void set(Activities activities) {
            List recentActivities;
            this.activity = activities;
            if (activities == null || (recentActivities = activities.getRecentActivities()) == null) {
                return;
            }
            for (Object obj : recentActivities) {
                this.activitiesById.put(((ActivityItem) obj).getRowId(), obj);
            }
        }

        @Override // com.squareup.cash.activity.backend.loader.ActivitiesCache
        public final Activities get() {
            return this.activity;
        }
    }
}
