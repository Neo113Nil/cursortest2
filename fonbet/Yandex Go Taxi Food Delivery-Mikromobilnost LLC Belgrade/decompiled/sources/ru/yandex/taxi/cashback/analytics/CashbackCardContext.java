package ru.yandex.taxi.cashback.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/cashback/analytics/CashbackCardContext;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "TARIFF_CARD", "ORDER_STATUS_NOTIFICATION", "TEASER", "MENU", "DEEPLINK", "MENU_PAYMENT_METHODS_PROMO", "SUMMARY_PAYMENT_METHODS_PROMO", "ORDER_COMPLETE", "SUMMARY", "ORDER", "DRIVE", "SCOOTERS", "PLACES", "CHARGERS", "DRIVE_PAYMENTS", "SUPERAPP", "PERSONAL_WALLET", "STARTUP", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CashbackCardContext {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CashbackCardContext[] $VALUES;
    public static final CashbackCardContext CHARGERS;
    public static final CashbackCardContext DEEPLINK;
    public static final CashbackCardContext DRIVE;
    public static final CashbackCardContext DRIVE_PAYMENTS;
    public static final CashbackCardContext MENU;
    public static final CashbackCardContext MENU_PAYMENT_METHODS_PROMO;
    public static final CashbackCardContext ORDER;
    public static final CashbackCardContext ORDER_COMPLETE;
    public static final CashbackCardContext ORDER_STATUS_NOTIFICATION;
    public static final CashbackCardContext PERSONAL_WALLET;
    public static final CashbackCardContext PLACES;
    public static final CashbackCardContext SCOOTERS;
    public static final CashbackCardContext STARTUP;
    public static final CashbackCardContext SUMMARY;
    public static final CashbackCardContext SUMMARY_PAYMENT_METHODS_PROMO;
    public static final CashbackCardContext SUPERAPP;
    public static final CashbackCardContext TARIFF_CARD;
    public static final CashbackCardContext TEASER;
    private final String value;

    static {
        CashbackCardContext cashbackCardContext = new CashbackCardContext("TARIFF_CARD", 0, "TariffCard");
        TARIFF_CARD = cashbackCardContext;
        CashbackCardContext cashbackCardContext2 = new CashbackCardContext("ORDER_STATUS_NOTIFICATION", 1, "OrderStatusNotification");
        ORDER_STATUS_NOTIFICATION = cashbackCardContext2;
        CashbackCardContext cashbackCardContext3 = new CashbackCardContext("TEASER", 2, "Teaser");
        TEASER = cashbackCardContext3;
        CashbackCardContext cashbackCardContext4 = new CashbackCardContext("MENU", 3, "Menu");
        MENU = cashbackCardContext4;
        CashbackCardContext cashbackCardContext5 = new CashbackCardContext("DEEPLINK", 4, "Deeplink");
        DEEPLINK = cashbackCardContext5;
        CashbackCardContext cashbackCardContext6 = new CashbackCardContext("MENU_PAYMENT_METHODS_PROMO", 5, "MenuPaymentMethodsPromo");
        MENU_PAYMENT_METHODS_PROMO = cashbackCardContext6;
        CashbackCardContext cashbackCardContext7 = new CashbackCardContext("SUMMARY_PAYMENT_METHODS_PROMO", 6, "SummaryPaymentMethodsPromo");
        SUMMARY_PAYMENT_METHODS_PROMO = cashbackCardContext7;
        CashbackCardContext cashbackCardContext8 = new CashbackCardContext("ORDER_COMPLETE", 7, "OrderComplete");
        ORDER_COMPLETE = cashbackCardContext8;
        CashbackCardContext cashbackCardContext9 = new CashbackCardContext("SUMMARY", 8, "Summary");
        SUMMARY = cashbackCardContext9;
        CashbackCardContext cashbackCardContext10 = new CashbackCardContext("ORDER", 9, "Order");
        ORDER = cashbackCardContext10;
        CashbackCardContext cashbackCardContext11 = new CashbackCardContext("DRIVE", 10, "Drive");
        DRIVE = cashbackCardContext11;
        CashbackCardContext cashbackCardContext12 = new CashbackCardContext("SCOOTERS", 11, "Scooters");
        SCOOTERS = cashbackCardContext12;
        CashbackCardContext cashbackCardContext13 = new CashbackCardContext("PLACES", 12, "Places");
        PLACES = cashbackCardContext13;
        CashbackCardContext cashbackCardContext14 = new CashbackCardContext("CHARGERS", 13, "Chargers");
        CHARGERS = cashbackCardContext14;
        CashbackCardContext cashbackCardContext15 = new CashbackCardContext("DRIVE_PAYMENTS", 14, "Drive.Payments");
        DRIVE_PAYMENTS = cashbackCardContext15;
        CashbackCardContext cashbackCardContext16 = new CashbackCardContext("SUPERAPP", 15, "Superapp");
        SUPERAPP = cashbackCardContext16;
        CashbackCardContext cashbackCardContext17 = new CashbackCardContext("PERSONAL_WALLET", 16, "PersonalWallet");
        PERSONAL_WALLET = cashbackCardContext17;
        CashbackCardContext cashbackCardContext18 = new CashbackCardContext("STARTUP", 17, "Startup");
        STARTUP = cashbackCardContext18;
        CashbackCardContext[] cashbackCardContextArr = {cashbackCardContext, cashbackCardContext2, cashbackCardContext3, cashbackCardContext4, cashbackCardContext5, cashbackCardContext6, cashbackCardContext7, cashbackCardContext8, cashbackCardContext9, cashbackCardContext10, cashbackCardContext11, cashbackCardContext12, cashbackCardContext13, cashbackCardContext14, cashbackCardContext15, cashbackCardContext16, cashbackCardContext17, cashbackCardContext18};
        $VALUES = cashbackCardContextArr;
        $ENTRIES = a.a(cashbackCardContextArr);
    }

    public CashbackCardContext(String str, int i, String str2) {
        this.value = str2;
    }

    public static CashbackCardContext valueOf(String str) {
        return (CashbackCardContext) Enum.valueOf(CashbackCardContext.class, str);
    }

    public static CashbackCardContext[] values() {
        return (CashbackCardContext[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
