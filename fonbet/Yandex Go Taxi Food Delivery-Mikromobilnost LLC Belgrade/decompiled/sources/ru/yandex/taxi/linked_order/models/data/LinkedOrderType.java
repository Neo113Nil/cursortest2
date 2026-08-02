package ru.yandex.taxi.linked_order.models.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/linked_order/models/data/LinkedOrderType;", "", "DEFAULT", "AMBULANCE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LinkedOrderType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LinkedOrderType[] $VALUES;
    public static final LinkedOrderType AMBULANCE;
    public static final LinkedOrderType DEFAULT;

    static {
        LinkedOrderType linkedOrderType = new LinkedOrderType("DEFAULT", 0);
        DEFAULT = linkedOrderType;
        LinkedOrderType linkedOrderType2 = new LinkedOrderType("AMBULANCE", 1);
        AMBULANCE = linkedOrderType2;
        LinkedOrderType[] linkedOrderTypeArr = {linkedOrderType, linkedOrderType2};
        $VALUES = linkedOrderTypeArr;
        $ENTRIES = a.a(linkedOrderTypeArr);
    }

    public static LinkedOrderType valueOf(String str) {
        return (LinkedOrderType) Enum.valueOf(LinkedOrderType.class, str);
    }

    public static LinkedOrderType[] values() {
        return (LinkedOrderType[]) $VALUES.clone();
    }
}
