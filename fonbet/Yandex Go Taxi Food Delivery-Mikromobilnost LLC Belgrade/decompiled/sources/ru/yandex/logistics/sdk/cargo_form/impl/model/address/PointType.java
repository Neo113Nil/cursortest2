package ru.yandex.logistics.sdk.cargo_form.impl.model.address;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/logistics/sdk/cargo_form/impl/model/address/PointType;", "", "SOURCE", "DESTINATION", Card.CARD_TYPE_TRANSIT, "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PointType[] $VALUES;
    public static final PointType DESTINATION;
    public static final PointType SOURCE;
    public static final PointType TRANSIT;

    static {
        PointType pointType = new PointType("SOURCE", 0);
        SOURCE = pointType;
        PointType pointType2 = new PointType("DESTINATION", 1);
        DESTINATION = pointType2;
        PointType pointType3 = new PointType(Card.CARD_TYPE_TRANSIT, 2);
        TRANSIT = pointType3;
        PointType[] pointTypeArr = {pointType, pointType2, pointType3};
        $VALUES = pointTypeArr;
        $ENTRIES = a.a(pointTypeArr);
    }

    public static PointType valueOf(String str) {
        return (PointType) Enum.valueOf(PointType.class, str);
    }

    public static PointType[] values() {
        return (PointType[]) $VALUES.clone();
    }
}
