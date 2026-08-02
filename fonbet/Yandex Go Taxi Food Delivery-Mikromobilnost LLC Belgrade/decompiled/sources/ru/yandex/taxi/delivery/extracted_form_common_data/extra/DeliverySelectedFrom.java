package ru.yandex.taxi.delivery.extracted_form_common_data.extra;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/delivery/extracted_form_common_data/extra/DeliverySelectedFrom;", "", "", "analyticsName", "Ljava/lang/String;", "getAnalyticsName", "()Ljava/lang/String;", "CONTACTS", "LAST_CONTACTS", "MANUAL", "STANDALONE", "ORDER_FOR_ANOTHER", "SUGGEST", "extracted_form_common_data"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DeliverySelectedFrom {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliverySelectedFrom[] $VALUES;
    public static final DeliverySelectedFrom CONTACTS;
    public static final DeliverySelectedFrom LAST_CONTACTS;
    public static final DeliverySelectedFrom MANUAL;
    public static final DeliverySelectedFrom ORDER_FOR_ANOTHER;
    public static final DeliverySelectedFrom STANDALONE;
    public static final DeliverySelectedFrom SUGGEST;
    private final String analyticsName;

    static {
        DeliverySelectedFrom deliverySelectedFrom = new DeliverySelectedFrom("CONTACTS", 0, ContactsFragment.WEBVIEW_NAME);
        CONTACTS = deliverySelectedFrom;
        DeliverySelectedFrom deliverySelectedFrom2 = new DeliverySelectedFrom("LAST_CONTACTS", 1, "last_orders");
        LAST_CONTACTS = deliverySelectedFrom2;
        DeliverySelectedFrom deliverySelectedFrom3 = new DeliverySelectedFrom("MANUAL", 2, "manual");
        MANUAL = deliverySelectedFrom3;
        DeliverySelectedFrom deliverySelectedFrom4 = new DeliverySelectedFrom("STANDALONE", 3, "standalone");
        STANDALONE = deliverySelectedFrom4;
        DeliverySelectedFrom deliverySelectedFrom5 = new DeliverySelectedFrom("ORDER_FOR_ANOTHER", 4, "order_for_another");
        ORDER_FOR_ANOTHER = deliverySelectedFrom5;
        DeliverySelectedFrom deliverySelectedFrom6 = new DeliverySelectedFrom("SUGGEST", 5, "suggest");
        SUGGEST = deliverySelectedFrom6;
        DeliverySelectedFrom[] deliverySelectedFromArr = {deliverySelectedFrom, deliverySelectedFrom2, deliverySelectedFrom3, deliverySelectedFrom4, deliverySelectedFrom5, deliverySelectedFrom6};
        $VALUES = deliverySelectedFromArr;
        $ENTRIES = a.a(deliverySelectedFromArr);
    }

    public DeliverySelectedFrom(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static DeliverySelectedFrom valueOf(String str) {
        return (DeliverySelectedFrom) Enum.valueOf(DeliverySelectedFrom.class, str);
    }

    public static DeliverySelectedFrom[] values() {
        return (DeliverySelectedFrom[]) $VALUES.clone();
    }
}
