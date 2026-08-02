package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"ru/yandex/taxi/analytics/Events$Zalogin$LinkageContext", "", "Lru/yandex/taxi/analytics/Events$Zalogin$LinkageContext;", "MENU", "PROFILE", "PROMO", "DIALOG", "INSTANT_LINK", "PLUS_PROMO", "PUSH", "SHARED_PAYMENT", "WALLET_DEPOSIT", "DEEPLINK", "DRIVE", "PLUS_HOME", "EATSKIT", "FAMILY_ACCOUNT", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Events$Zalogin$LinkageContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Events$Zalogin$LinkageContext[] $VALUES;
    public static final Events$Zalogin$LinkageContext DEEPLINK;
    public static final Events$Zalogin$LinkageContext DIALOG;
    public static final Events$Zalogin$LinkageContext DRIVE;
    public static final Events$Zalogin$LinkageContext EATSKIT;
    public static final Events$Zalogin$LinkageContext FAMILY_ACCOUNT;
    public static final Events$Zalogin$LinkageContext INSTANT_LINK;
    public static final Events$Zalogin$LinkageContext MENU;
    public static final Events$Zalogin$LinkageContext PLUS_HOME;
    public static final Events$Zalogin$LinkageContext PLUS_PROMO;
    public static final Events$Zalogin$LinkageContext PROFILE;
    public static final Events$Zalogin$LinkageContext PROMO;
    public static final Events$Zalogin$LinkageContext PUSH;
    public static final Events$Zalogin$LinkageContext SHARED_PAYMENT;
    public static final Events$Zalogin$LinkageContext WALLET_DEPOSIT;

    static {
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext = new Events$Zalogin$LinkageContext("MENU", 0);
        MENU = events$Zalogin$LinkageContext;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext2 = new Events$Zalogin$LinkageContext("PROFILE", 1);
        PROFILE = events$Zalogin$LinkageContext2;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext3 = new Events$Zalogin$LinkageContext("PROMO", 2);
        PROMO = events$Zalogin$LinkageContext3;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext4 = new Events$Zalogin$LinkageContext("DIALOG", 3);
        DIALOG = events$Zalogin$LinkageContext4;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext5 = new Events$Zalogin$LinkageContext("INSTANT_LINK", 4);
        INSTANT_LINK = events$Zalogin$LinkageContext5;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext6 = new Events$Zalogin$LinkageContext("PLUS_PROMO", 5);
        PLUS_PROMO = events$Zalogin$LinkageContext6;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext7 = new Events$Zalogin$LinkageContext("PUSH", 6);
        PUSH = events$Zalogin$LinkageContext7;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext8 = new Events$Zalogin$LinkageContext("SHARED_PAYMENT", 7);
        SHARED_PAYMENT = events$Zalogin$LinkageContext8;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext9 = new Events$Zalogin$LinkageContext("WALLET_DEPOSIT", 8);
        WALLET_DEPOSIT = events$Zalogin$LinkageContext9;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext10 = new Events$Zalogin$LinkageContext("DEEPLINK", 9);
        DEEPLINK = events$Zalogin$LinkageContext10;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext11 = new Events$Zalogin$LinkageContext("DRIVE", 10);
        DRIVE = events$Zalogin$LinkageContext11;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext12 = new Events$Zalogin$LinkageContext("PLUS_HOME", 11);
        PLUS_HOME = events$Zalogin$LinkageContext12;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext13 = new Events$Zalogin$LinkageContext("EATSKIT", 12);
        EATSKIT = events$Zalogin$LinkageContext13;
        Events$Zalogin$LinkageContext events$Zalogin$LinkageContext14 = new Events$Zalogin$LinkageContext("FAMILY_ACCOUNT", 13);
        FAMILY_ACCOUNT = events$Zalogin$LinkageContext14;
        Events$Zalogin$LinkageContext[] events$Zalogin$LinkageContextArr = {events$Zalogin$LinkageContext, events$Zalogin$LinkageContext2, events$Zalogin$LinkageContext3, events$Zalogin$LinkageContext4, events$Zalogin$LinkageContext5, events$Zalogin$LinkageContext6, events$Zalogin$LinkageContext7, events$Zalogin$LinkageContext8, events$Zalogin$LinkageContext9, events$Zalogin$LinkageContext10, events$Zalogin$LinkageContext11, events$Zalogin$LinkageContext12, events$Zalogin$LinkageContext13, events$Zalogin$LinkageContext14};
        $VALUES = events$Zalogin$LinkageContextArr;
        $ENTRIES = a.a(events$Zalogin$LinkageContextArr);
    }

    public static Events$Zalogin$LinkageContext valueOf(String str) {
        return (Events$Zalogin$LinkageContext) Enum.valueOf(Events$Zalogin$LinkageContext.class, str);
    }

    public static Events$Zalogin$LinkageContext[] values() {
        return (Events$Zalogin$LinkageContext[]) $VALUES.clone();
    }
}
