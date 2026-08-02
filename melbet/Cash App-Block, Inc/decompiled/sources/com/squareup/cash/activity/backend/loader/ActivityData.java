package com.squareup.cash.activity.backend.loader;

import android.os.Parcelable;
import com.squareup.cash.activity.backend.ActivityItem;

/* loaded from: classes5.dex */
public interface ActivityData extends Parcelable, ActivityItem {
    String getToken();

    @Override // com.squareup.cash.activity.backend.ActivityItem
    long getVersion();

    @Override // com.squareup.cash.activity.backend.ActivityItem
    boolean isBadged();
}
