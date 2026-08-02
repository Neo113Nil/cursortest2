package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.OpeningHours$HoursType;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.collect.RegularImmutableMap;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public final class zzmk {
    static {
        StatusLine builder = RegularImmutableMap.builder();
        builder.put("OPERATIONAL", Place.BusinessStatus.OPERATIONAL);
        builder.put("CLOSED_TEMPORARILY", Place.BusinessStatus.CLOSED_TEMPORARILY);
        builder.put("CLOSED_PERMANENTLY", Place.BusinessStatus.CLOSED_PERMANENTLY);
        builder.build(true);
        StatusLine builder2 = RegularImmutableMap.builder();
        builder2.put("ACCESS", OpeningHours$HoursType.ACCESS);
        builder2.put("BREAKFAST", OpeningHours$HoursType.BREAKFAST);
        builder2.put("BRUNCH", OpeningHours$HoursType.BRUNCH);
        builder2.put("DELIVERY", OpeningHours$HoursType.DELIVERY);
        builder2.put("DINNER", OpeningHours$HoursType.DINNER);
        builder2.put("DRIVE_THROUGH", OpeningHours$HoursType.DRIVE_THROUGH);
        builder2.put("HAPPY_HOUR", OpeningHours$HoursType.HAPPY_HOUR);
        builder2.put("KITCHEN", OpeningHours$HoursType.KITCHEN);
        builder2.put("LUNCH", OpeningHours$HoursType.LUNCH);
        builder2.put("ONLINE_SERVICE_HOURS", OpeningHours$HoursType.ONLINE_SERVICE_HOURS);
        builder2.put("PICKUP", OpeningHours$HoursType.PICKUP);
        builder2.put("SENIOR_HOURS", OpeningHours$HoursType.SENIOR_HOURS);
        builder2.put("TAKEOUT", OpeningHours$HoursType.TAKEOUT);
        builder2.build(true);
    }
}
