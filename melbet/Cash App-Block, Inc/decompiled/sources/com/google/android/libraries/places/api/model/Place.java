package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.review.zzb;

/* loaded from: classes4.dex */
public abstract class Place implements Parcelable {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BooleanPlaceAttributeValue implements Parcelable {
        public static final Parcelable.Creator<BooleanPlaceAttributeValue> CREATOR;
        public static final BooleanPlaceAttributeValue FALSE;
        public static final BooleanPlaceAttributeValue TRUE;
        public static final BooleanPlaceAttributeValue UNKNOWN;
        public static final /* synthetic */ BooleanPlaceAttributeValue[] zza;

        static {
            BooleanPlaceAttributeValue booleanPlaceAttributeValue = new BooleanPlaceAttributeValue("UNKNOWN", 0);
            UNKNOWN = booleanPlaceAttributeValue;
            BooleanPlaceAttributeValue booleanPlaceAttributeValue2 = new BooleanPlaceAttributeValue("TRUE", 1);
            TRUE = booleanPlaceAttributeValue2;
            BooleanPlaceAttributeValue booleanPlaceAttributeValue3 = new BooleanPlaceAttributeValue("FALSE", 2);
            FALSE = booleanPlaceAttributeValue3;
            zza = new BooleanPlaceAttributeValue[]{booleanPlaceAttributeValue, booleanPlaceAttributeValue2, booleanPlaceAttributeValue3};
            CREATOR = new zzb(5);
        }

        public static BooleanPlaceAttributeValue valueOf(String str) {
            return (BooleanPlaceAttributeValue) Enum.valueOf(BooleanPlaceAttributeValue.class, str);
        }

        public static BooleanPlaceAttributeValue[] values() {
            return (BooleanPlaceAttributeValue[]) zza.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class BusinessStatus implements Parcelable {
        public static final BusinessStatus CLOSED_PERMANENTLY;
        public static final BusinessStatus CLOSED_TEMPORARILY;
        public static final Parcelable.Creator<BusinessStatus> CREATOR;
        public static final BusinessStatus OPERATIONAL;
        public static final /* synthetic */ BusinessStatus[] zza;

        static {
            BusinessStatus businessStatus = new BusinessStatus("OPERATIONAL", 0);
            OPERATIONAL = businessStatus;
            BusinessStatus businessStatus2 = new BusinessStatus("CLOSED_TEMPORARILY", 1);
            CLOSED_TEMPORARILY = businessStatus2;
            BusinessStatus businessStatus3 = new BusinessStatus("CLOSED_PERMANENTLY", 2);
            CLOSED_PERMANENTLY = businessStatus3;
            zza = new BusinessStatus[]{businessStatus, businessStatus2, businessStatus3};
            CREATOR = new zzb(6);
        }

        public static BusinessStatus valueOf(String str) {
            return (BusinessStatus) Enum.valueOf(BusinessStatus.class, str);
        }

        public static BusinessStatus[] values() {
            return (BusinessStatus[]) zza.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Field implements Parcelable {
        public static final Field ACCESSIBILITY_OPTIONS;
        public static final Field ADDRESS_COMPONENTS;
        public static final Field ADDRESS_DESCRIPTOR;
        public static final Field ADR_FORMAT_ADDRESS;
        public static final Field ALLOWS_DOGS;
        public static final Field BUSINESS_STATUS;
        public static final Field CONSUMER_ALERT;
        public static final Field CONTAINING_PLACES;
        public static final Parcelable.Creator<Field> CREATOR;
        public static final Field CURBSIDE_PICKUP;
        public static final Field CURRENT_OPENING_HOURS;
        public static final Field CURRENT_SECONDARY_OPENING_HOURS;
        public static final Field DELIVERY;
        public static final Field DINE_IN;
        public static final Field DISPLAY_NAME;
        public static final Field EDITORIAL_SUMMARY;
        public static final Field EV_CHARGE_AMENITY_SUMMARY;
        public static final Field EV_CHARGE_OPTIONS;
        public static final Field FORMATTED_ADDRESS;
        public static final Field FUEL_OPTIONS;
        public static final Field GENERATIVE_SUMMARY;
        public static final Field GOOD_FOR_CHILDREN;
        public static final Field GOOD_FOR_GROUPS;
        public static final Field GOOD_FOR_WATCHING_SPORTS;
        public static final Field GOOGLE_MAPS_LINKS;
        public static final Field GOOGLE_MAPS_URI;
        public static final Field ICON_BACKGROUND_COLOR;
        public static final Field ICON_MASK_URL;
        public static final Field ID;
        public static final Field INTERNATIONAL_PHONE_NUMBER;
        public static final Field LIVE_MUSIC;
        public static final Field LOCATION;
        public static final Field MENU_FOR_CHILDREN;
        public static final Field NATIONAL_PHONE_NUMBER;
        public static final Field NEIGHBORHOOD_SUMMARY;
        public static final Field OPENING_HOURS;
        public static final Field OUTDOOR_SEATING;
        public static final Field PARKING_OPTIONS;
        public static final Field PAYMENT_OPTIONS;
        public static final Field PHOTO_METADATAS;
        public static final Field PLUS_CODE;
        public static final Field POSTAL_ADDRESS;
        public static final Field PRICE_LEVEL;
        public static final Field PRICE_RANGE;
        public static final Field PRIMARY_TYPE;
        public static final Field PRIMARY_TYPE_DISPLAY_NAME;
        public static final Field PURE_SERVICE_AREA_BUSINESS;
        public static final Field RATING;
        public static final Field RESERVABLE;
        public static final Field RESOURCE_NAME;
        public static final Field RESTROOM;
        public static final Field REVIEWS;
        public static final Field REVIEW_SUMMARY;
        public static final Field SECONDARY_OPENING_HOURS;
        public static final Field SERVES_BEER;
        public static final Field SERVES_BREAKFAST;
        public static final Field SERVES_BRUNCH;
        public static final Field SERVES_COCKTAILS;
        public static final Field SERVES_COFFEE;
        public static final Field SERVES_DESSERT;
        public static final Field SERVES_DINNER;
        public static final Field SERVES_LUNCH;
        public static final Field SERVES_VEGETARIAN_FOOD;
        public static final Field SERVES_WINE;
        public static final Field SHORT_FORMATTED_ADDRESS;
        public static final Field SUB_DESTINATIONS;
        public static final Field TAKEOUT;
        public static final Field TIME_ZONE;
        public static final Field TYPES;
        public static final Field USER_RATING_COUNT;
        public static final Field UTC_OFFSET;
        public static final Field VIEWPORT;
        public static final Field WEBSITE_URI;
        public static final /* synthetic */ Field[] zza;

        static {
            Field field = new Field("ACCESSIBILITY_OPTIONS", 0);
            ACCESSIBILITY_OPTIONS = field;
            Field field2 = new Field("ADDRESS_COMPONENTS", 1);
            ADDRESS_COMPONENTS = field2;
            Field field3 = new Field("ADDRESS_DESCRIPTOR", 2);
            ADDRESS_DESCRIPTOR = field3;
            Field field4 = new Field("ADR_FORMAT_ADDRESS", 3);
            ADR_FORMAT_ADDRESS = field4;
            Field field5 = new Field("ALLOWS_DOGS", 4);
            ALLOWS_DOGS = field5;
            Field field6 = new Field("BUSINESS_STATUS", 5);
            BUSINESS_STATUS = field6;
            Field field7 = new Field("CONSUMER_ALERT", 6);
            CONSUMER_ALERT = field7;
            Field field8 = new Field("CONTAINING_PLACES", 7);
            CONTAINING_PLACES = field8;
            Field field9 = new Field("CURBSIDE_PICKUP", 8);
            CURBSIDE_PICKUP = field9;
            Field field10 = new Field("CURRENT_OPENING_HOURS", 9);
            CURRENT_OPENING_HOURS = field10;
            Field field11 = new Field("CURRENT_SECONDARY_OPENING_HOURS", 10);
            CURRENT_SECONDARY_OPENING_HOURS = field11;
            Field field12 = new Field("DELIVERY", 11);
            DELIVERY = field12;
            Field field13 = new Field("DINE_IN", 12);
            DINE_IN = field13;
            Field field14 = new Field("DISPLAY_NAME", 13);
            DISPLAY_NAME = field14;
            Field field15 = new Field("EDITORIAL_SUMMARY", 14);
            EDITORIAL_SUMMARY = field15;
            Field field16 = new Field("EV_CHARGE_AMENITY_SUMMARY", 15);
            EV_CHARGE_AMENITY_SUMMARY = field16;
            Field field17 = new Field("EV_CHARGE_OPTIONS", 16);
            EV_CHARGE_OPTIONS = field17;
            Field field18 = new Field("FORMATTED_ADDRESS", 17);
            FORMATTED_ADDRESS = field18;
            Field field19 = new Field("FUEL_OPTIONS", 18);
            FUEL_OPTIONS = field19;
            Field field20 = new Field("GENERATIVE_SUMMARY", 19);
            GENERATIVE_SUMMARY = field20;
            Field field21 = new Field("GOOD_FOR_CHILDREN", 20);
            GOOD_FOR_CHILDREN = field21;
            Field field22 = new Field("GOOD_FOR_GROUPS", 21);
            GOOD_FOR_GROUPS = field22;
            Field field23 = new Field("GOOD_FOR_WATCHING_SPORTS", 22);
            GOOD_FOR_WATCHING_SPORTS = field23;
            Field field24 = new Field("GOOGLE_MAPS_LINKS", 23);
            GOOGLE_MAPS_LINKS = field24;
            Field field25 = new Field("GOOGLE_MAPS_URI", 24);
            GOOGLE_MAPS_URI = field25;
            Field field26 = new Field("ICON_BACKGROUND_COLOR", 25);
            ICON_BACKGROUND_COLOR = field26;
            Field field27 = new Field("ICON_MASK_URL", 26);
            ICON_MASK_URL = field27;
            Field field28 = new Field("ID", 27);
            ID = field28;
            Field field29 = new Field("INTERNATIONAL_PHONE_NUMBER", 28);
            INTERNATIONAL_PHONE_NUMBER = field29;
            Field field30 = new Field("LIVE_MUSIC", 29);
            LIVE_MUSIC = field30;
            Field field31 = new Field("LOCATION", 30);
            LOCATION = field31;
            Field field32 = new Field("MENU_FOR_CHILDREN", 31);
            MENU_FOR_CHILDREN = field32;
            Field field33 = new Field("NATIONAL_PHONE_NUMBER", 32);
            NATIONAL_PHONE_NUMBER = field33;
            Field field34 = new Field("NEIGHBORHOOD_SUMMARY", 33);
            NEIGHBORHOOD_SUMMARY = field34;
            Field field35 = new Field("OPENING_HOURS", 34);
            OPENING_HOURS = field35;
            Field field36 = new Field("OUTDOOR_SEATING", 35);
            OUTDOOR_SEATING = field36;
            Field field37 = new Field("PARKING_OPTIONS", 36);
            PARKING_OPTIONS = field37;
            Field field38 = new Field("PAYMENT_OPTIONS", 37);
            PAYMENT_OPTIONS = field38;
            Field field39 = new Field("PHOTO_METADATAS", 38);
            PHOTO_METADATAS = field39;
            Field field40 = new Field("PLUS_CODE", 39);
            PLUS_CODE = field40;
            Field field41 = new Field("POSTAL_ADDRESS", 40);
            POSTAL_ADDRESS = field41;
            Field field42 = new Field("PRICE_LEVEL", 41);
            PRICE_LEVEL = field42;
            Field field43 = new Field("PRICE_RANGE", 42);
            PRICE_RANGE = field43;
            Field field44 = new Field("PRIMARY_TYPE", 43);
            PRIMARY_TYPE = field44;
            Field field45 = new Field("PRIMARY_TYPE_DISPLAY_NAME", 44);
            PRIMARY_TYPE_DISPLAY_NAME = field45;
            Field field46 = new Field("PURE_SERVICE_AREA_BUSINESS", 45);
            PURE_SERVICE_AREA_BUSINESS = field46;
            Field field47 = new Field("RATING", 46);
            RATING = field47;
            Field field48 = new Field("RESERVABLE", 47);
            RESERVABLE = field48;
            Field field49 = new Field("RESOURCE_NAME", 48);
            RESOURCE_NAME = field49;
            Field field50 = new Field("RESTROOM", 49);
            RESTROOM = field50;
            Field field51 = new Field("REVIEWS", 50);
            REVIEWS = field51;
            Field field52 = new Field("REVIEW_SUMMARY", 51);
            REVIEW_SUMMARY = field52;
            Field field53 = new Field("SECONDARY_OPENING_HOURS", 52);
            SECONDARY_OPENING_HOURS = field53;
            Field field54 = new Field("SERVES_BEER", 53);
            SERVES_BEER = field54;
            Field field55 = new Field("SERVES_BREAKFAST", 54);
            SERVES_BREAKFAST = field55;
            Field field56 = new Field("SERVES_BRUNCH", 55);
            SERVES_BRUNCH = field56;
            Field field57 = new Field("SERVES_COCKTAILS", 56);
            SERVES_COCKTAILS = field57;
            Field field58 = new Field("SERVES_COFFEE", 57);
            SERVES_COFFEE = field58;
            Field field59 = new Field("SERVES_DESSERT", 58);
            SERVES_DESSERT = field59;
            Field field60 = new Field("SERVES_DINNER", 59);
            SERVES_DINNER = field60;
            Field field61 = new Field("SERVES_LUNCH", 60);
            SERVES_LUNCH = field61;
            Field field62 = new Field("SERVES_VEGETARIAN_FOOD", 61);
            SERVES_VEGETARIAN_FOOD = field62;
            Field field63 = new Field("SERVES_WINE", 62);
            SERVES_WINE = field63;
            Field field64 = new Field("SHORT_FORMATTED_ADDRESS", 63);
            SHORT_FORMATTED_ADDRESS = field64;
            Field field65 = new Field("SUB_DESTINATIONS", 64);
            SUB_DESTINATIONS = field65;
            Field field66 = new Field("TAKEOUT", 65);
            TAKEOUT = field66;
            Field field67 = new Field("TIME_ZONE", 66);
            TIME_ZONE = field67;
            Field field68 = new Field("TYPES", 67);
            TYPES = field68;
            Field field69 = new Field("USER_RATING_COUNT", 68);
            USER_RATING_COUNT = field69;
            Field field70 = new Field("UTC_OFFSET", 69);
            UTC_OFFSET = field70;
            Field field71 = new Field("VIEWPORT", 70);
            VIEWPORT = field71;
            Field field72 = new Field("WEBSITE_URI", 71);
            WEBSITE_URI = field72;
            zza = new Field[]{field, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19, field20, field21, field22, field23, field24, field25, field26, field27, field28, field29, field30, field31, field32, field33, field34, field35, field36, field37, field38, field39, field40, field41, field42, field43, field44, field45, field46, field47, field48, field49, field50, field51, field52, field53, field54, field55, field56, field57, field58, field59, field60, field61, field62, field63, field64, field65, field66, field67, field68, field69, field70, field71, field72};
            CREATOR = new zzb(7);
        }

        public static Field valueOf(String str) {
            return (Field) Enum.valueOf(Field.class, str);
        }

        public static Field[] values() {
            return (Field[]) zza.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    public static zzbm builder() {
        zzbm zzbmVar = new zzbm();
        BooleanPlaceAttributeValue booleanPlaceAttributeValue = BooleanPlaceAttributeValue.UNKNOWN;
        zzbmVar.zzh = booleanPlaceAttributeValue;
        zzbmVar.zzj = booleanPlaceAttributeValue;
        zzbmVar.zzk = booleanPlaceAttributeValue;
        zzbmVar.zzH = booleanPlaceAttributeValue;
        zzbmVar.zzK = booleanPlaceAttributeValue;
        zzbmVar.zzL = booleanPlaceAttributeValue;
        zzbmVar.zzM = booleanPlaceAttributeValue;
        zzbmVar.zzN = booleanPlaceAttributeValue;
        zzbmVar.zzO = booleanPlaceAttributeValue;
        zzbmVar.zzP = booleanPlaceAttributeValue;
        zzbmVar.zzQ = booleanPlaceAttributeValue;
        zzbmVar.zzR = booleanPlaceAttributeValue;
        zzbmVar.zzab = booleanPlaceAttributeValue;
        zzbmVar.zzac = booleanPlaceAttributeValue;
        zzbmVar.zzad = booleanPlaceAttributeValue;
        zzbmVar.zzae = booleanPlaceAttributeValue;
        zzbmVar.zzaf = booleanPlaceAttributeValue;
        zzbmVar.zzag = booleanPlaceAttributeValue;
        zzbmVar.zzah = booleanPlaceAttributeValue;
        zzbmVar.zzai = booleanPlaceAttributeValue;
        zzbmVar.zzaj = booleanPlaceAttributeValue;
        zzbmVar.zzak = booleanPlaceAttributeValue;
        zzbmVar.zzal = booleanPlaceAttributeValue;
        zzbmVar.zzao = booleanPlaceAttributeValue;
        return zzbmVar;
    }
}
