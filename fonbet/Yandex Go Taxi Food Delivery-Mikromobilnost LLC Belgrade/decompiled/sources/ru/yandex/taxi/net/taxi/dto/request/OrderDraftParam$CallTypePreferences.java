package ru.yandex.taxi.net.taxi.dto.request;

import defpackage.fs70;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.st70;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"ru/yandex/taxi/net/taxi/dto/request/OrderDraftParam$CallTypePreferences", "", "Lru/yandex/taxi/net/taxi/dto/request/OrderDraftParam$CallTypePreferences;", "Companion", "st70", "INAPP_ONLY", "PREFER_DONT_CALL", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class OrderDraftParam$CallTypePreferences {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderDraftParam$CallTypePreferences[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final st70 Companion;
    public static final OrderDraftParam$CallTypePreferences INAPP_ONLY;
    public static final OrderDraftParam$CallTypePreferences PREFER_DONT_CALL;

    static {
        OrderDraftParam$CallTypePreferences orderDraftParam$CallTypePreferences = new OrderDraftParam$CallTypePreferences("INAPP_ONLY", 0);
        INAPP_ONLY = orderDraftParam$CallTypePreferences;
        OrderDraftParam$CallTypePreferences orderDraftParam$CallTypePreferences2 = new OrderDraftParam$CallTypePreferences("PREFER_DONT_CALL", 1);
        PREFER_DONT_CALL = orderDraftParam$CallTypePreferences2;
        OrderDraftParam$CallTypePreferences[] orderDraftParam$CallTypePreferencesArr = {orderDraftParam$CallTypePreferences, orderDraftParam$CallTypePreferences2};
        $VALUES = orderDraftParam$CallTypePreferencesArr;
        $ENTRIES = kotlin.enums.a.a(orderDraftParam$CallTypePreferencesArr);
        Companion = new st70();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fs70(11));
    }

    public static OrderDraftParam$CallTypePreferences valueOf(String str) {
        return (OrderDraftParam$CallTypePreferences) Enum.valueOf(OrderDraftParam$CallTypePreferences.class, str);
    }

    public static OrderDraftParam$CallTypePreferences[] values() {
        return (OrderDraftParam$CallTypePreferences[]) $VALUES.clone();
    }
}
