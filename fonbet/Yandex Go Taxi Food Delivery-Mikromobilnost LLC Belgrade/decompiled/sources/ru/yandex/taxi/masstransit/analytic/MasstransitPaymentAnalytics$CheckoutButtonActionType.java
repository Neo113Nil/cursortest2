package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"ru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$CheckoutButtonActionType", "", "Lru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$CheckoutButtonActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "StopSelector", "DirectionSelector", "NumericInputUp", "NumericInputDown", "PaymentMethod", "PaymentButton", "ErrorButton", "Other", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MasstransitPaymentAnalytics$CheckoutButtonActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitPaymentAnalytics$CheckoutButtonActionType[] $VALUES;
    public static final MasstransitPaymentAnalytics$CheckoutButtonActionType Back;
    public static final MasstransitPaymentAnalytics$CheckoutButtonActionType DirectionSelector;
    public static final MasstransitPaymentAnalytics$CheckoutButtonActionType ErrorButton;
    public static final MasstransitPaymentAnalytics$CheckoutButtonActionType NumericInputDown;
    public static final MasstransitPaymentAnalytics$CheckoutButtonActionType NumericInputUp;
    public static final MasstransitPaymentAnalytics$CheckoutButtonActionType Other;
    public static final MasstransitPaymentAnalytics$CheckoutButtonActionType PaymentButton;
    public static final MasstransitPaymentAnalytics$CheckoutButtonActionType PaymentMethod;
    public static final MasstransitPaymentAnalytics$CheckoutButtonActionType StopSelector;
    private final String eventValue;

    static {
        MasstransitPaymentAnalytics$CheckoutButtonActionType masstransitPaymentAnalytics$CheckoutButtonActionType = new MasstransitPaymentAnalytics$CheckoutButtonActionType("Back", 0, "back");
        Back = masstransitPaymentAnalytics$CheckoutButtonActionType;
        MasstransitPaymentAnalytics$CheckoutButtonActionType masstransitPaymentAnalytics$CheckoutButtonActionType2 = new MasstransitPaymentAnalytics$CheckoutButtonActionType("StopSelector", 1, "stop_selector");
        StopSelector = masstransitPaymentAnalytics$CheckoutButtonActionType2;
        MasstransitPaymentAnalytics$CheckoutButtonActionType masstransitPaymentAnalytics$CheckoutButtonActionType3 = new MasstransitPaymentAnalytics$CheckoutButtonActionType("DirectionSelector", 2, "direction_selector");
        DirectionSelector = masstransitPaymentAnalytics$CheckoutButtonActionType3;
        MasstransitPaymentAnalytics$CheckoutButtonActionType masstransitPaymentAnalytics$CheckoutButtonActionType4 = new MasstransitPaymentAnalytics$CheckoutButtonActionType("NumericInputUp", 3, "numeric_input_up");
        NumericInputUp = masstransitPaymentAnalytics$CheckoutButtonActionType4;
        MasstransitPaymentAnalytics$CheckoutButtonActionType masstransitPaymentAnalytics$CheckoutButtonActionType5 = new MasstransitPaymentAnalytics$CheckoutButtonActionType("NumericInputDown", 4, "numeric_input_down");
        NumericInputDown = masstransitPaymentAnalytics$CheckoutButtonActionType5;
        MasstransitPaymentAnalytics$CheckoutButtonActionType masstransitPaymentAnalytics$CheckoutButtonActionType6 = new MasstransitPaymentAnalytics$CheckoutButtonActionType("PaymentMethod", 5, "payment_method");
        PaymentMethod = masstransitPaymentAnalytics$CheckoutButtonActionType6;
        MasstransitPaymentAnalytics$CheckoutButtonActionType masstransitPaymentAnalytics$CheckoutButtonActionType7 = new MasstransitPaymentAnalytics$CheckoutButtonActionType("PaymentButton", 6, "payment_button");
        PaymentButton = masstransitPaymentAnalytics$CheckoutButtonActionType7;
        MasstransitPaymentAnalytics$CheckoutButtonActionType masstransitPaymentAnalytics$CheckoutButtonActionType8 = new MasstransitPaymentAnalytics$CheckoutButtonActionType("ErrorButton", 7, "error_button");
        ErrorButton = masstransitPaymentAnalytics$CheckoutButtonActionType8;
        MasstransitPaymentAnalytics$CheckoutButtonActionType masstransitPaymentAnalytics$CheckoutButtonActionType9 = new MasstransitPaymentAnalytics$CheckoutButtonActionType("Other", 8, "other");
        Other = masstransitPaymentAnalytics$CheckoutButtonActionType9;
        MasstransitPaymentAnalytics$CheckoutButtonActionType[] masstransitPaymentAnalytics$CheckoutButtonActionTypeArr = {masstransitPaymentAnalytics$CheckoutButtonActionType, masstransitPaymentAnalytics$CheckoutButtonActionType2, masstransitPaymentAnalytics$CheckoutButtonActionType3, masstransitPaymentAnalytics$CheckoutButtonActionType4, masstransitPaymentAnalytics$CheckoutButtonActionType5, masstransitPaymentAnalytics$CheckoutButtonActionType6, masstransitPaymentAnalytics$CheckoutButtonActionType7, masstransitPaymentAnalytics$CheckoutButtonActionType8, masstransitPaymentAnalytics$CheckoutButtonActionType9};
        $VALUES = masstransitPaymentAnalytics$CheckoutButtonActionTypeArr;
        $ENTRIES = a.a(masstransitPaymentAnalytics$CheckoutButtonActionTypeArr);
    }

    public MasstransitPaymentAnalytics$CheckoutButtonActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitPaymentAnalytics$CheckoutButtonActionType valueOf(String str) {
        return (MasstransitPaymentAnalytics$CheckoutButtonActionType) Enum.valueOf(MasstransitPaymentAnalytics$CheckoutButtonActionType.class, str);
    }

    public static MasstransitPaymentAnalytics$CheckoutButtonActionType[] values() {
        return (MasstransitPaymentAnalytics$CheckoutButtonActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
