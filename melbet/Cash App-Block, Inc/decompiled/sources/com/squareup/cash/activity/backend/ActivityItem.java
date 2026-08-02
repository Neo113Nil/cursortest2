package com.squareup.cash.activity.backend;

import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import java.time.Instant;
import java.util.Set;

/* loaded from: classes5.dex */
public interface ActivityItem {
    ActivityItemGlobalId getActivityItemGlobalId();

    Instant getDisplayInstant();

    Set getProductClassifiers();

    ActivityItemGlobalId getReferenceItemId();

    String getRowId();

    ActivityRowSection getSection();

    long getVersion();

    boolean isBadged();
}
