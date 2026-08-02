package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.Place;
import com.google.common.collect.RegularImmutableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes4.dex */
public abstract class zzjp {
    public static final RegularImmutableMap zza;

    static {
        StatusLine builder = RegularImmutableMap.builder();
        builder.put(Place.Field.ACCESSIBILITY_OPTIONS, "accessibilityOptions");
        builder.put(Place.Field.ADDRESS_COMPONENTS, "addressComponents");
        builder.put(Place.Field.ADDRESS_DESCRIPTOR, "addressDescriptor");
        builder.put(Place.Field.ADR_FORMAT_ADDRESS, "adrFormatAddress");
        builder.put(Place.Field.ALLOWS_DOGS, "allowsDogs");
        builder.put(Place.Field.BUSINESS_STATUS, "businessStatus");
        builder.put(Place.Field.CONSUMER_ALERT, "consumerAlert");
        builder.put(Place.Field.CONTAINING_PLACES, "containingPlaces");
        builder.put(Place.Field.CURBSIDE_PICKUP, "curbsidePickup");
        builder.put(Place.Field.CURRENT_OPENING_HOURS, "currentOpeningHours");
        builder.put(Place.Field.CURRENT_SECONDARY_OPENING_HOURS, "currentSecondaryOpeningHours");
        builder.put(Place.Field.DELIVERY, "delivery");
        builder.put(Place.Field.DINE_IN, "dineIn");
        builder.put(Place.Field.DISPLAY_NAME, "displayName");
        builder.put(Place.Field.EDITORIAL_SUMMARY, "editorialSummary");
        builder.put(Place.Field.EV_CHARGE_AMENITY_SUMMARY, "evChargeAmenitySummary");
        builder.put(Place.Field.EV_CHARGE_OPTIONS, "evChargeOptions");
        builder.put(Place.Field.FORMATTED_ADDRESS, "formattedAddress");
        builder.put(Place.Field.FUEL_OPTIONS, "fuelOptions");
        builder.put(Place.Field.GENERATIVE_SUMMARY, "generativeSummary");
        builder.put(Place.Field.GOOD_FOR_CHILDREN, "goodForChildren");
        builder.put(Place.Field.GOOD_FOR_GROUPS, "goodForGroups");
        builder.put(Place.Field.GOOD_FOR_WATCHING_SPORTS, "goodForWatchingSports");
        builder.put(Place.Field.GOOGLE_MAPS_LINKS, "googleMapsLinks");
        builder.put(Place.Field.GOOGLE_MAPS_URI, "googleMapsUri");
        builder.put(Place.Field.ICON_BACKGROUND_COLOR, "iconBackgroundColor");
        builder.put(Place.Field.ICON_MASK_URL, "iconMaskBaseUri");
        builder.put(Place.Field.ID, "id");
        builder.put(Place.Field.INTERNATIONAL_PHONE_NUMBER, "internationalPhoneNumber");
        builder.put(Place.Field.LIVE_MUSIC, "liveMusic");
        builder.put(Place.Field.LOCATION, "location");
        builder.put(Place.Field.MENU_FOR_CHILDREN, "menuForChildren");
        builder.put(Place.Field.NATIONAL_PHONE_NUMBER, "nationalPhoneNumber");
        builder.put(Place.Field.NEIGHBORHOOD_SUMMARY, "neighborhoodSummary");
        builder.put(Place.Field.OPENING_HOURS, "regularOpeningHours");
        builder.put(Place.Field.OUTDOOR_SEATING, "outdoorSeating");
        builder.put(Place.Field.PARKING_OPTIONS, "parkingOptions");
        builder.put(Place.Field.PAYMENT_OPTIONS, "paymentOptions");
        builder.put(Place.Field.PHOTO_METADATAS, "photos");
        builder.put(Place.Field.PLUS_CODE, "plusCode");
        builder.put(Place.Field.POSTAL_ADDRESS, "postalAddress");
        builder.put(Place.Field.PRICE_LEVEL, "priceLevel");
        builder.put(Place.Field.PRICE_RANGE, "priceRange");
        builder.put(Place.Field.PRIMARY_TYPE, "primaryType");
        builder.put(Place.Field.PRIMARY_TYPE_DISPLAY_NAME, "primaryTypeDisplayName");
        builder.put(Place.Field.PURE_SERVICE_AREA_BUSINESS, "pureServiceAreaBusiness");
        builder.put(Place.Field.RATING, "rating");
        builder.put(Place.Field.RESERVABLE, "reservable");
        builder.put(Place.Field.RESOURCE_NAME, "name");
        builder.put(Place.Field.RESTROOM, "restroom");
        builder.put(Place.Field.REVIEWS, "reviews");
        builder.put(Place.Field.REVIEW_SUMMARY, "reviewSummary");
        builder.put(Place.Field.SECONDARY_OPENING_HOURS, "regularSecondaryOpeningHours");
        builder.put(Place.Field.SERVES_BEER, "servesBeer");
        builder.put(Place.Field.SERVES_BREAKFAST, "servesBreakfast");
        builder.put(Place.Field.SERVES_BRUNCH, "servesBrunch");
        builder.put(Place.Field.SERVES_COCKTAILS, "servesCocktails");
        builder.put(Place.Field.SERVES_COFFEE, "servesCoffee");
        builder.put(Place.Field.SERVES_DESSERT, "servesDessert");
        builder.put(Place.Field.SERVES_DINNER, "servesDinner");
        builder.put(Place.Field.SERVES_LUNCH, "servesLunch");
        builder.put(Place.Field.SERVES_VEGETARIAN_FOOD, "servesVegetarianFood");
        builder.put(Place.Field.SERVES_WINE, "servesWine");
        builder.put(Place.Field.SHORT_FORMATTED_ADDRESS, "shortFormattedAddress");
        builder.put(Place.Field.SUB_DESTINATIONS, "subDestinations");
        builder.put(Place.Field.TAKEOUT, "takeout");
        builder.put(Place.Field.TIME_ZONE, "timeZone");
        builder.put(Place.Field.TYPES, "types");
        builder.put(Place.Field.USER_RATING_COUNT, "userRatingCount");
        builder.put(Place.Field.UTC_OFFSET, "utcOffsetMinutes");
        builder.put(Place.Field.VIEWPORT, "viewport");
        builder.put(Place.Field.WEBSITE_URI, "websiteUri");
        zza = builder.build(true);
    }

    public static ArrayList zza(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) zza.get((Place.Field) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }
}
