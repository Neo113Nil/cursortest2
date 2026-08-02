package ru.yandex.taxi.intercity.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/intercity/analytics/IntercityContactsAnalytics$OpenOriginV2", "", "Lru/yandex/taxi/intercity/analytics/IntercityContactsAnalytics$OpenOriginV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Bubble", "TariffCard", "OrderButton", "Checkout", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntercityContactsAnalytics$OpenOriginV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityContactsAnalytics$OpenOriginV2[] $VALUES;
    public static final IntercityContactsAnalytics$OpenOriginV2 Bubble;
    public static final IntercityContactsAnalytics$OpenOriginV2 Checkout;
    public static final IntercityContactsAnalytics$OpenOriginV2 OrderButton;
    public static final IntercityContactsAnalytics$OpenOriginV2 TariffCard;
    private final String eventValue;

    static {
        IntercityContactsAnalytics$OpenOriginV2 intercityContactsAnalytics$OpenOriginV2 = new IntercityContactsAnalytics$OpenOriginV2("Bubble", 0, "bubble");
        Bubble = intercityContactsAnalytics$OpenOriginV2;
        IntercityContactsAnalytics$OpenOriginV2 intercityContactsAnalytics$OpenOriginV22 = new IntercityContactsAnalytics$OpenOriginV2("TariffCard", 1, "tariff_card");
        TariffCard = intercityContactsAnalytics$OpenOriginV22;
        IntercityContactsAnalytics$OpenOriginV2 intercityContactsAnalytics$OpenOriginV23 = new IntercityContactsAnalytics$OpenOriginV2("OrderButton", 2, "order_button");
        OrderButton = intercityContactsAnalytics$OpenOriginV23;
        IntercityContactsAnalytics$OpenOriginV2 intercityContactsAnalytics$OpenOriginV24 = new IntercityContactsAnalytics$OpenOriginV2("Checkout", 3, "checkout");
        Checkout = intercityContactsAnalytics$OpenOriginV24;
        IntercityContactsAnalytics$OpenOriginV2[] intercityContactsAnalytics$OpenOriginV2Arr = {intercityContactsAnalytics$OpenOriginV2, intercityContactsAnalytics$OpenOriginV22, intercityContactsAnalytics$OpenOriginV23, intercityContactsAnalytics$OpenOriginV24};
        $VALUES = intercityContactsAnalytics$OpenOriginV2Arr;
        $ENTRIES = a.a(intercityContactsAnalytics$OpenOriginV2Arr);
    }

    public IntercityContactsAnalytics$OpenOriginV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static IntercityContactsAnalytics$OpenOriginV2 valueOf(String str) {
        return (IntercityContactsAnalytics$OpenOriginV2) Enum.valueOf(IntercityContactsAnalytics$OpenOriginV2.class, str);
    }

    public static IntercityContactsAnalytics$OpenOriginV2[] values() {
        return (IntercityContactsAnalytics$OpenOriginV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
