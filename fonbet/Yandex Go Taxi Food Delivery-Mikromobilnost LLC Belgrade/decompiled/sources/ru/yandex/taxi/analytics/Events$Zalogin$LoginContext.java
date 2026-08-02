package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.yandex.video.m3.preload_manager.tracking.PreloadEventTracker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b \b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"ru/yandex/taxi/analytics/Events$Zalogin$LoginContext", "", "Lru/yandex/taxi/analytics/Events$Zalogin$LoginContext;", "AUTOLOGIN", "PLUS_HOME", "PLUS_PROMO", "DRIVE", "BANK", "YANDEX_PAY", "SCOOTERS", "REAUTH", "MAAS", "MASSTRANSIT", "MENU", "SUMMARY", "DEEPLINK", "AGREEMENT", "FAVORITES", "EATSKIT", "BLOCKED_USER", "PROFILE", "GO_PLATFORM", "YANGOPAY", PreloadEventTracker.PRELOAD_ERROR_CATEGORY, "AUTH_CHALLENGE", "CAR_TECH", "MARKETPLACE", "DELIVERY", "INTERCITY_DASHBOARD", "LOYALTY_PROGRAM", "MOBILITY_HUB", "PLACES", "NAVIGATOR", "CARE", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Events$Zalogin$LoginContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Events$Zalogin$LoginContext[] $VALUES;
    public static final Events$Zalogin$LoginContext AGREEMENT;
    public static final Events$Zalogin$LoginContext AUTH_CHALLENGE;
    public static final Events$Zalogin$LoginContext AUTOLOGIN;
    public static final Events$Zalogin$LoginContext BANK;
    public static final Events$Zalogin$LoginContext BLOCKED_USER;
    public static final Events$Zalogin$LoginContext CARE;
    public static final Events$Zalogin$LoginContext CAR_TECH;
    public static final Events$Zalogin$LoginContext DEEPLINK;
    public static final Events$Zalogin$LoginContext DELIVERY;
    public static final Events$Zalogin$LoginContext DRIVE;
    public static final Events$Zalogin$LoginContext EATSKIT;
    public static final Events$Zalogin$LoginContext FAVORITES;
    public static final Events$Zalogin$LoginContext GO_PLATFORM;
    public static final Events$Zalogin$LoginContext INTERCITY_DASHBOARD;
    public static final Events$Zalogin$LoginContext LOYALTY_PROGRAM;
    public static final Events$Zalogin$LoginContext MAAS;
    public static final Events$Zalogin$LoginContext MARKETPLACE;
    public static final Events$Zalogin$LoginContext MASSTRANSIT;
    public static final Events$Zalogin$LoginContext MENU;
    public static final Events$Zalogin$LoginContext MOBILITY_HUB;
    public static final Events$Zalogin$LoginContext NAVIGATOR;
    public static final Events$Zalogin$LoginContext PLACES;
    public static final Events$Zalogin$LoginContext PLUS_HOME;
    public static final Events$Zalogin$LoginContext PLUS_PROMO;
    public static final Events$Zalogin$LoginContext PRELOAD;
    public static final Events$Zalogin$LoginContext PROFILE;
    public static final Events$Zalogin$LoginContext REAUTH;
    public static final Events$Zalogin$LoginContext SCOOTERS;
    public static final Events$Zalogin$LoginContext SUMMARY;
    public static final Events$Zalogin$LoginContext YANDEX_PAY;
    public static final Events$Zalogin$LoginContext YANGOPAY;

    static {
        Events$Zalogin$LoginContext events$Zalogin$LoginContext = new Events$Zalogin$LoginContext("AUTOLOGIN", 0);
        AUTOLOGIN = events$Zalogin$LoginContext;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext2 = new Events$Zalogin$LoginContext("PLUS_HOME", 1);
        PLUS_HOME = events$Zalogin$LoginContext2;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext3 = new Events$Zalogin$LoginContext("PLUS_PROMO", 2);
        PLUS_PROMO = events$Zalogin$LoginContext3;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext4 = new Events$Zalogin$LoginContext("DRIVE", 3);
        DRIVE = events$Zalogin$LoginContext4;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext5 = new Events$Zalogin$LoginContext("BANK", 4);
        BANK = events$Zalogin$LoginContext5;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext6 = new Events$Zalogin$LoginContext("YANDEX_PAY", 5);
        YANDEX_PAY = events$Zalogin$LoginContext6;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext7 = new Events$Zalogin$LoginContext("SCOOTERS", 6);
        SCOOTERS = events$Zalogin$LoginContext7;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext8 = new Events$Zalogin$LoginContext("REAUTH", 7);
        REAUTH = events$Zalogin$LoginContext8;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext9 = new Events$Zalogin$LoginContext("MAAS", 8);
        MAAS = events$Zalogin$LoginContext9;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext10 = new Events$Zalogin$LoginContext("MASSTRANSIT", 9);
        MASSTRANSIT = events$Zalogin$LoginContext10;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext11 = new Events$Zalogin$LoginContext("MENU", 10);
        MENU = events$Zalogin$LoginContext11;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext12 = new Events$Zalogin$LoginContext("SUMMARY", 11);
        SUMMARY = events$Zalogin$LoginContext12;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext13 = new Events$Zalogin$LoginContext("DEEPLINK", 12);
        DEEPLINK = events$Zalogin$LoginContext13;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext14 = new Events$Zalogin$LoginContext("AGREEMENT", 13);
        AGREEMENT = events$Zalogin$LoginContext14;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext15 = new Events$Zalogin$LoginContext("FAVORITES", 14);
        FAVORITES = events$Zalogin$LoginContext15;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext16 = new Events$Zalogin$LoginContext("EATSKIT", 15);
        EATSKIT = events$Zalogin$LoginContext16;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext17 = new Events$Zalogin$LoginContext("BLOCKED_USER", 16);
        BLOCKED_USER = events$Zalogin$LoginContext17;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext18 = new Events$Zalogin$LoginContext("PROFILE", 17);
        PROFILE = events$Zalogin$LoginContext18;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext19 = new Events$Zalogin$LoginContext("GO_PLATFORM", 18);
        GO_PLATFORM = events$Zalogin$LoginContext19;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext20 = new Events$Zalogin$LoginContext("YANGOPAY", 19);
        YANGOPAY = events$Zalogin$LoginContext20;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext21 = new Events$Zalogin$LoginContext(PreloadEventTracker.PRELOAD_ERROR_CATEGORY, 20);
        PRELOAD = events$Zalogin$LoginContext21;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext22 = new Events$Zalogin$LoginContext("AUTH_CHALLENGE", 21);
        AUTH_CHALLENGE = events$Zalogin$LoginContext22;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext23 = new Events$Zalogin$LoginContext("CAR_TECH", 22);
        CAR_TECH = events$Zalogin$LoginContext23;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext24 = new Events$Zalogin$LoginContext("MARKETPLACE", 23);
        MARKETPLACE = events$Zalogin$LoginContext24;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext25 = new Events$Zalogin$LoginContext("DELIVERY", 24);
        DELIVERY = events$Zalogin$LoginContext25;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext26 = new Events$Zalogin$LoginContext("INTERCITY_DASHBOARD", 25);
        INTERCITY_DASHBOARD = events$Zalogin$LoginContext26;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext27 = new Events$Zalogin$LoginContext("LOYALTY_PROGRAM", 26);
        LOYALTY_PROGRAM = events$Zalogin$LoginContext27;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext28 = new Events$Zalogin$LoginContext("MOBILITY_HUB", 27);
        MOBILITY_HUB = events$Zalogin$LoginContext28;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext29 = new Events$Zalogin$LoginContext("PLACES", 28);
        PLACES = events$Zalogin$LoginContext29;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext30 = new Events$Zalogin$LoginContext("NAVIGATOR", 29);
        NAVIGATOR = events$Zalogin$LoginContext30;
        Events$Zalogin$LoginContext events$Zalogin$LoginContext31 = new Events$Zalogin$LoginContext("CARE", 30);
        CARE = events$Zalogin$LoginContext31;
        Events$Zalogin$LoginContext[] events$Zalogin$LoginContextArr = {events$Zalogin$LoginContext, events$Zalogin$LoginContext2, events$Zalogin$LoginContext3, events$Zalogin$LoginContext4, events$Zalogin$LoginContext5, events$Zalogin$LoginContext6, events$Zalogin$LoginContext7, events$Zalogin$LoginContext8, events$Zalogin$LoginContext9, events$Zalogin$LoginContext10, events$Zalogin$LoginContext11, events$Zalogin$LoginContext12, events$Zalogin$LoginContext13, events$Zalogin$LoginContext14, events$Zalogin$LoginContext15, events$Zalogin$LoginContext16, events$Zalogin$LoginContext17, events$Zalogin$LoginContext18, events$Zalogin$LoginContext19, events$Zalogin$LoginContext20, events$Zalogin$LoginContext21, events$Zalogin$LoginContext22, events$Zalogin$LoginContext23, events$Zalogin$LoginContext24, events$Zalogin$LoginContext25, events$Zalogin$LoginContext26, events$Zalogin$LoginContext27, events$Zalogin$LoginContext28, events$Zalogin$LoginContext29, events$Zalogin$LoginContext30, events$Zalogin$LoginContext31};
        $VALUES = events$Zalogin$LoginContextArr;
        $ENTRIES = a.a(events$Zalogin$LoginContextArr);
    }

    public static Events$Zalogin$LoginContext valueOf(String str) {
        return (Events$Zalogin$LoginContext) Enum.valueOf(Events$Zalogin$LoginContext.class, str);
    }

    public static Events$Zalogin$LoginContext[] values() {
        return (Events$Zalogin$LoginContext[]) $VALUES.clone();
    }
}
