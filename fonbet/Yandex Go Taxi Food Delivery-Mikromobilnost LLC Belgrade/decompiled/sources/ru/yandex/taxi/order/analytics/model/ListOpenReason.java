package ru.yandex.taxi.order.analytics.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/yandex/taxi/order/analytics/model/ListOpenReason;", "", "", "alias", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SHOWN", "ORDERS_CHANGED", "ORDER_STATUS_CHANGES", JCP.RAW_PREFIX, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ListOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ListOpenReason[] $VALUES;
    public static final ListOpenReason NONE;
    public static final ListOpenReason ORDERS_CHANGED;
    public static final ListOpenReason ORDER_STATUS_CHANGES;
    public static final ListOpenReason SHOWN;
    private final String alias;

    static {
        ListOpenReason listOpenReason = new ListOpenReason("SHOWN", 0, "shown");
        SHOWN = listOpenReason;
        ListOpenReason listOpenReason2 = new ListOpenReason("ORDERS_CHANGED", 1, "orders_list_changes");
        ORDERS_CHANGED = listOpenReason2;
        ListOpenReason listOpenReason3 = new ListOpenReason("ORDER_STATUS_CHANGES", 2, "orders_status_changes");
        ORDER_STATUS_CHANGES = listOpenReason3;
        ListOpenReason listOpenReason4 = new ListOpenReason(JCP.RAW_PREFIX, 3, "");
        NONE = listOpenReason4;
        ListOpenReason[] listOpenReasonArr = {listOpenReason, listOpenReason2, listOpenReason3, listOpenReason4};
        $VALUES = listOpenReasonArr;
        $ENTRIES = a.a(listOpenReasonArr);
    }

    public ListOpenReason(String str, int i, String str2) {
        this.alias = str2;
    }

    public static ListOpenReason valueOf(String str) {
        return (ListOpenReason) Enum.valueOf(ListOpenReason.class, str);
    }

    public static ListOpenReason[] values() {
        return (ListOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }
}
