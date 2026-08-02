package ru.yandex.taxi.order.analytics.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/order/analytics/model/WidgetType;", "", "", "typeIdentifier", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ONE_ORDER", "SOME_ORDERS", "go-client-android.features.order.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WidgetType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WidgetType[] $VALUES;
    public static final WidgetType ONE_ORDER;
    public static final WidgetType SOME_ORDERS;
    private final String typeIdentifier;

    static {
        WidgetType widgetType = new WidgetType("ONE_ORDER", 0, "order_widget");
        ONE_ORDER = widgetType;
        WidgetType widgetType2 = new WidgetType("SOME_ORDERS", 1, "orders_widget");
        SOME_ORDERS = widgetType2;
        WidgetType[] widgetTypeArr = {widgetType, widgetType2};
        $VALUES = widgetTypeArr;
        $ENTRIES = a.a(widgetTypeArr);
    }

    public WidgetType(String str, int i, String str2) {
        this.typeIdentifier = str2;
    }

    public static WidgetType valueOf(String str) {
        return (WidgetType) Enum.valueOf(WidgetType.class, str);
    }

    public static WidgetType[] values() {
        return (WidgetType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTypeIdentifier() {
        return this.typeIdentifier;
    }
}
