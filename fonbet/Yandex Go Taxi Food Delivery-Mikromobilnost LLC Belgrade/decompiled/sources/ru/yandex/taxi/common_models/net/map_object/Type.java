package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.k801;
import defpackage.ll11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b*\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006,"}, d2 = {"Lru/yandex/taxi/common_models/net/map_object/Type;", "", "", "analyticsName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "ll11", "SHOW_POPUP", "CHANGE_ZONE_MODE", "CHANGE_TARIFF", "SHOW_WEBVIEW", "DEEPLINK", "DRIVE_CARD", "SHOW_SCREEN_THROUGH_PROMO", "STOP_CARD", "SELECT_SHUTTLE_STOP_POINT", "FINALIZE", "PULL_OUT_OF_ZONE", "SHOW_POINT_CLARIFICATION_SCREEN", "DRIVE_SUMMARY_OFFER", "WALK_ROUTE", "WALK_TO_DELIVERY_POINT", "ORGANIZATION_CARD", "PICK_SCOOTER", "PICK_SCOOTER_PARKING", "SHOW_PARKING_DESCRIPTION", "PICK_CHARGERS_STATION", "PICK_DRIVE_PARKING", "WHERE_YOU_ARE", "ZOOM_MAP_BBOX", "SHOW_NAVIGATION", "REPEAT_REQUEST", "SELECT_AS_DESTINATION", "SELECT_AS_NAVIGATION_DESTINATION", "BUILD_ROUTE_NAVIGATION", "ADDRESS_SELECTION", "SELECT_SCOOTERS_ZONE", "POSITION_CONFIRMATION", "CALL_LINK_BACKGROUND", "ADDITIONAL_REQUEST", "SELECT_NDD_PICKUP_POINT", "UNKNOWN", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Type[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final Type ADDITIONAL_REQUEST;
    public static final Type ADDRESS_SELECTION;
    public static final Type BUILD_ROUTE_NAVIGATION;
    public static final Type CALL_LINK_BACKGROUND;
    public static final Type CHANGE_TARIFF;
    public static final Type CHANGE_ZONE_MODE;
    public static final ll11 Companion;
    public static final Type DEEPLINK;
    public static final Type DRIVE_CARD;
    public static final Type DRIVE_SUMMARY_OFFER;
    public static final Type FINALIZE;
    public static final Type ORGANIZATION_CARD;
    public static final Type PICK_CHARGERS_STATION;
    public static final Type PICK_DRIVE_PARKING;
    public static final Type PICK_SCOOTER;
    public static final Type PICK_SCOOTER_PARKING;
    public static final Type POSITION_CONFIRMATION;
    public static final Type PULL_OUT_OF_ZONE;
    public static final Type REPEAT_REQUEST;
    public static final Type SELECT_AS_DESTINATION;
    public static final Type SELECT_AS_NAVIGATION_DESTINATION;
    public static final Type SELECT_NDD_PICKUP_POINT;
    public static final Type SELECT_SCOOTERS_ZONE;
    public static final Type SELECT_SHUTTLE_STOP_POINT;
    public static final Type SHOW_NAVIGATION;
    public static final Type SHOW_PARKING_DESCRIPTION;
    public static final Type SHOW_POINT_CLARIFICATION_SCREEN;
    public static final Type SHOW_POPUP;
    public static final Type SHOW_SCREEN_THROUGH_PROMO;
    public static final Type SHOW_WEBVIEW;
    public static final Type STOP_CARD;
    public static final Type UNKNOWN;
    public static final Type WALK_ROUTE;
    public static final Type WALK_TO_DELIVERY_POINT;
    public static final Type WHERE_YOU_ARE;
    public static final Type ZOOM_MAP_BBOX;
    private final String analyticsName;

    static {
        Type type = new Type("SHOW_POPUP", 0, "SHOW_POPUP");
        SHOW_POPUP = type;
        Type type2 = new Type("CHANGE_ZONE_MODE", 1, "CHANGE_ZONE_MODE");
        CHANGE_ZONE_MODE = type2;
        Type type3 = new Type("CHANGE_TARIFF", 2, "CHANGE_TARIFF");
        CHANGE_TARIFF = type3;
        Type type4 = new Type("SHOW_WEBVIEW", 3, "SHOW_WEBVIEW");
        SHOW_WEBVIEW = type4;
        Type type5 = new Type("DEEPLINK", 4, "DEEPLINK");
        DEEPLINK = type5;
        Type type6 = new Type("DRIVE_CARD", 5, "DRIVE_CARD");
        DRIVE_CARD = type6;
        Type type7 = new Type("SHOW_SCREEN_THROUGH_PROMO", 6, "SHOW_SCREEN_THROUGH_PROMO");
        SHOW_SCREEN_THROUGH_PROMO = type7;
        Type type8 = new Type("STOP_CARD", 7, "STOP_CARD");
        STOP_CARD = type8;
        Type type9 = new Type("SELECT_SHUTTLE_STOP_POINT", 8, "SELECT_SHUTTLE_STOP_POINT");
        SELECT_SHUTTLE_STOP_POINT = type9;
        Type type10 = new Type("FINALIZE", 9, "FINALIZE");
        FINALIZE = type10;
        Type type11 = new Type("PULL_OUT_OF_ZONE", 10, "PULL_OUT_OF_ZONE");
        PULL_OUT_OF_ZONE = type11;
        Type type12 = new Type("SHOW_POINT_CLARIFICATION_SCREEN", 11, "SHOW_POINT_CLARIFICATION_SCREEN");
        SHOW_POINT_CLARIFICATION_SCREEN = type12;
        Type type13 = new Type("DRIVE_SUMMARY_OFFER", 12, "DRIVE_SUMMARY_OFFER");
        DRIVE_SUMMARY_OFFER = type13;
        Type type14 = new Type("WALK_ROUTE", 13, "WALK_ROUTE");
        WALK_ROUTE = type14;
        Type type15 = new Type("WALK_TO_DELIVERY_POINT", 14, "WALK_TO_DELIVERY_POINT");
        WALK_TO_DELIVERY_POINT = type15;
        Type type16 = new Type("ORGANIZATION_CARD", 15, "ORGANIZATION_CARD");
        ORGANIZATION_CARD = type16;
        Type type17 = new Type("PICK_SCOOTER", 16, "PICK_SCOOTER");
        PICK_SCOOTER = type17;
        Type type18 = new Type("PICK_SCOOTER_PARKING", 17, "PICK_SCOOTER_PARKING");
        PICK_SCOOTER_PARKING = type18;
        Type type19 = new Type("SHOW_PARKING_DESCRIPTION", 18, "SHOW_PARKING_DESCRIPTION");
        SHOW_PARKING_DESCRIPTION = type19;
        Type type20 = new Type("PICK_CHARGERS_STATION", 19, "PICK_CHARGERS_STATION");
        PICK_CHARGERS_STATION = type20;
        Type type21 = new Type("PICK_DRIVE_PARKING", 20, "PICK_DRIVE_PARKING");
        PICK_DRIVE_PARKING = type21;
        Type type22 = new Type("WHERE_YOU_ARE", 21, "WHERE_YOU_ARE");
        WHERE_YOU_ARE = type22;
        Type type23 = new Type("ZOOM_MAP_BBOX", 22, "ZOOM_MAP_BBOX");
        ZOOM_MAP_BBOX = type23;
        Type type24 = new Type("SHOW_NAVIGATION", 23, "SHOW_NAVIGATION");
        SHOW_NAVIGATION = type24;
        Type type25 = new Type("REPEAT_REQUEST", 24, "REPEAT_REQUEST");
        REPEAT_REQUEST = type25;
        Type type26 = new Type("SELECT_AS_DESTINATION", 25, "SELECT_AS_DESTINATION");
        SELECT_AS_DESTINATION = type26;
        Type type27 = new Type("SELECT_AS_NAVIGATION_DESTINATION", 26, "SELECT_AS_NAVIGATION_DESTINATION");
        SELECT_AS_NAVIGATION_DESTINATION = type27;
        Type type28 = new Type("BUILD_ROUTE_NAVIGATION", 27, "BUILD_ROUTE_NAVIGATION");
        BUILD_ROUTE_NAVIGATION = type28;
        Type type29 = new Type("ADDRESS_SELECTION", 28, "ADDRESS_SELECTION");
        ADDRESS_SELECTION = type29;
        Type type30 = new Type("SELECT_SCOOTERS_ZONE", 29, "SELECT_SCOOTERS_ZONE");
        SELECT_SCOOTERS_ZONE = type30;
        Type type31 = new Type("POSITION_CONFIRMATION", 30, "POSITION_CONFIRMATION");
        POSITION_CONFIRMATION = type31;
        Type type32 = new Type("CALL_LINK_BACKGROUND", 31, "CALL_LINK_BACKGROUND");
        CALL_LINK_BACKGROUND = type32;
        Type type33 = new Type("ADDITIONAL_REQUEST", 32, "ADDITIONAL_REQUEST");
        ADDITIONAL_REQUEST = type33;
        Type type34 = new Type("SELECT_NDD_PICKUP_POINT", 33, "SELECT_NDD_PICKUP_POINT");
        SELECT_NDD_PICKUP_POINT = type34;
        Type type35 = new Type("UNKNOWN", 34, "UNKNOWN");
        UNKNOWN = type35;
        Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15, type16, type17, type18, type19, type20, type21, type22, type23, type24, type25, type26, type27, type28, type29, type30, type31, type32, type33, type34, type35};
        $VALUES = typeArr;
        $ENTRIES = kotlin.enums.a.a(typeArr);
        Companion = new ll11();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new k801(28));
    }

    public Type(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static Type valueOf(String str) {
        return (Type) Enum.valueOf(Type.class, str);
    }

    public static Type[] values() {
        return (Type[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
