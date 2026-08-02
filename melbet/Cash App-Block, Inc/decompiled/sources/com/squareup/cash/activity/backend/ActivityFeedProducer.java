package com.squareup.cash.activity.backend;

import com.squareup.cash.activity.backend.loader.Activities;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public interface ActivityFeedProducer {
    static Object produceFeed$default(ActivityFeedProducer activityFeedProducer, Activities activities, List list, int i, ContinuationImpl continuationImpl, int i2) {
        if ((i2 & 2) != 0) {
            list = EmptyList.INSTANCE;
        }
        if ((i2 & 4) != 0) {
            i = Integer.MAX_VALUE;
        }
        return activityFeedProducer.produceFeed(activities, list, i);
    }

    ArrayList produceFeed(Activities activities, List list, int i);
}
