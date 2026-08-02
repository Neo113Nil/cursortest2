package com.squareup.cash.activity.backend;

import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemId;
import com.squareup.protos.cash.activity.api.v1.ActivityItemType;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public abstract class ActivityItemKt {
    public static final ActivityItemId getActivityItemId(ActivityItemGlobalId.ActivityId activityId) {
        ActivityItemGlobalId.ActivityId.ActivityItemId activityItemId = activityId instanceof ActivityItemGlobalId.ActivityId.ActivityItemId ? (ActivityItemGlobalId.ActivityId.ActivityItemId) activityId : null;
        if (activityItemId != null) {
            return activityItemId.getValue();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002a, code lost:
    
        r3 = kotlin.text.StringsKt__StringsKt.split$default(r3, new java.lang.String[]{"-"}, false, 2, 2, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getItemId(ActivityItemGlobalId activityItemGlobalId) {
        List split$default;
        ActivityItemId activityItemId;
        String str;
        activityItemGlobalId.getClass();
        ActivityItemGlobalId.ActivityId activityId = activityItemGlobalId.activity_id;
        if (activityId != null && (activityItemId = getActivityItemId(activityId)) != null && (str = activityItemId.id) != null) {
            return str;
        }
        ActivityItemGlobalId.ActivityId activityId2 = activityItemGlobalId.activity_id;
        String str2 = null;
        if (activityId2 != null) {
            ActivityItemGlobalId.ActivityId.ActivityRowId activityRowId = activityId2 instanceof ActivityItemGlobalId.ActivityId.ActivityRowId ? (ActivityItemGlobalId.ActivityId.ActivityRowId) activityId2 : null;
            String value = activityRowId != null ? activityRowId.getValue() : null;
            if (value != null && split$default != null) {
                str2 = (String) CollectionsKt.last(split$default);
            }
        }
        return str2 == null ? "" : str2;
    }

    public static final ActivityItemType getItemType(ActivityItem activityItem) {
        ActivityItemId activityItemId;
        activityItem.getClass();
        ActivityItemGlobalId.ActivityId activityId = activityItem.getActivityItemGlobalId().activity_id;
        if (activityId == null || (activityItemId = getActivityItemId(activityId)) == null) {
            return null;
        }
        return activityItemId.type;
    }

    public static final String getItemId(ActivityItem activityItem) {
        activityItem.getClass();
        ActivityItemGlobalId.ActivityId activityId = activityItem.getActivityItemGlobalId().activity_id;
        activityId.getClass();
        String str = ((ActivityItemGlobalId.ActivityId.ActivityItemId) activityId).getValue().id;
        str.getClass();
        return str;
    }
}
