package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.libraries.places.api.model.Place;
import com.google.common.collect.RegularImmutableMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public abstract class zzmq {
    public static final RegularImmutableMap zza;

    static {
        StatusLine builder = RegularImmutableMap.builder();
        builder.put(Place.Field.ADDRESS_COMPONENTS, "address_components");
        builder.put(Place.Field.BUSINESS_STATUS, "business_status");
        builder.put(Place.Field.CURBSIDE_PICKUP, "curbside_pickup");
        builder.put(Place.Field.CURRENT_OPENING_HOURS, "current_opening_hours");
        builder.put(Place.Field.DELIVERY, "delivery");
        builder.put(Place.Field.DINE_IN, "dine_in");
        builder.put(Place.Field.DISPLAY_NAME, "name");
        builder.put(Place.Field.EDITORIAL_SUMMARY, "editorial_summary");
        builder.put(Place.Field.FORMATTED_ADDRESS, "formatted_address");
        builder.put(Place.Field.ICON_BACKGROUND_COLOR, "icon_background_color");
        builder.put(Place.Field.ICON_MASK_URL, "icon_mask_base_uri");
        builder.put(Place.Field.ID, "place_id");
        builder.put(Place.Field.INTERNATIONAL_PHONE_NUMBER, "international_phone_number");
        builder.put(Place.Field.LOCATION, "geometry/location");
        builder.put(Place.Field.OPENING_HOURS, "opening_hours");
        builder.put(Place.Field.PHOTO_METADATAS, "photos");
        builder.put(Place.Field.PLUS_CODE, "plus_code");
        builder.put(Place.Field.PRICE_LEVEL, "price_level");
        builder.put(Place.Field.RATING, "rating");
        builder.put(Place.Field.RESERVABLE, "reservable");
        builder.put(Place.Field.SECONDARY_OPENING_HOURS, "secondary_opening_hours");
        builder.put(Place.Field.SERVES_BEER, "serves_beer");
        builder.put(Place.Field.SERVES_BREAKFAST, "serves_breakfast");
        builder.put(Place.Field.SERVES_BRUNCH, "serves_brunch");
        builder.put(Place.Field.SERVES_DINNER, "serves_dinner");
        builder.put(Place.Field.SERVES_LUNCH, "serves_lunch");
        builder.put(Place.Field.SERVES_VEGETARIAN_FOOD, "serves_vegetarian_food");
        builder.put(Place.Field.SERVES_WINE, "serves_wine");
        builder.put(Place.Field.TAKEOUT, "takeout");
        builder.put(Place.Field.TYPES, "types");
        builder.put(Place.Field.USER_RATING_COUNT, "user_ratings_total");
        builder.put(Place.Field.UTC_OFFSET, "utc_offset");
        builder.put(Place.Field.VIEWPORT, "geometry/viewport");
        builder.put(Place.Field.WEBSITE_URI, "website");
        zza = builder.build(true);
    }

    public static String zzb(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zza.get((Place.Field) it.next());
            if (!TextUtils.isEmpty(str)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
