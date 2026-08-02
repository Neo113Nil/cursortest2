package ru.yandex.taxi.intercity.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/intercity/analytics/IntercityPhoneSelectOrigin;", "", "BUBBLE", "TARIFF_CARD", "ORDER_BUTTON", "CHECKOUT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IntercityPhoneSelectOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ IntercityPhoneSelectOrigin[] $VALUES;
    public static final IntercityPhoneSelectOrigin BUBBLE;
    public static final IntercityPhoneSelectOrigin CHECKOUT;
    public static final IntercityPhoneSelectOrigin ORDER_BUTTON;
    public static final IntercityPhoneSelectOrigin TARIFF_CARD;

    static {
        IntercityPhoneSelectOrigin intercityPhoneSelectOrigin = new IntercityPhoneSelectOrigin("BUBBLE", 0);
        BUBBLE = intercityPhoneSelectOrigin;
        IntercityPhoneSelectOrigin intercityPhoneSelectOrigin2 = new IntercityPhoneSelectOrigin("TARIFF_CARD", 1);
        TARIFF_CARD = intercityPhoneSelectOrigin2;
        IntercityPhoneSelectOrigin intercityPhoneSelectOrigin3 = new IntercityPhoneSelectOrigin("ORDER_BUTTON", 2);
        ORDER_BUTTON = intercityPhoneSelectOrigin3;
        IntercityPhoneSelectOrigin intercityPhoneSelectOrigin4 = new IntercityPhoneSelectOrigin("CHECKOUT", 3);
        CHECKOUT = intercityPhoneSelectOrigin4;
        IntercityPhoneSelectOrigin[] intercityPhoneSelectOriginArr = {intercityPhoneSelectOrigin, intercityPhoneSelectOrigin2, intercityPhoneSelectOrigin3, intercityPhoneSelectOrigin4};
        $VALUES = intercityPhoneSelectOriginArr;
        $ENTRIES = a.a(intercityPhoneSelectOriginArr);
    }

    public static IntercityPhoneSelectOrigin valueOf(String str) {
        return (IntercityPhoneSelectOrigin) Enum.valueOf(IntercityPhoneSelectOrigin.class, str);
    }

    public static IntercityPhoneSelectOrigin[] values() {
        return (IntercityPhoneSelectOrigin[]) $VALUES.clone();
    }
}
