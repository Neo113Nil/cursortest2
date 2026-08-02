package ru.yandex.taxi.logistics.explicit_comment_courier.comment;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/logistics/explicit_comment_courier/comment/DeliveryExplicitCommentCourierFlowType;", "", "REGULAR", "REQUIRED_COMMENT", "explicit_comment_courier"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeliveryExplicitCommentCourierFlowType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeliveryExplicitCommentCourierFlowType[] $VALUES;
    public static final DeliveryExplicitCommentCourierFlowType REGULAR;
    public static final DeliveryExplicitCommentCourierFlowType REQUIRED_COMMENT;

    static {
        DeliveryExplicitCommentCourierFlowType deliveryExplicitCommentCourierFlowType = new DeliveryExplicitCommentCourierFlowType("REGULAR", 0);
        REGULAR = deliveryExplicitCommentCourierFlowType;
        DeliveryExplicitCommentCourierFlowType deliveryExplicitCommentCourierFlowType2 = new DeliveryExplicitCommentCourierFlowType("REQUIRED_COMMENT", 1);
        REQUIRED_COMMENT = deliveryExplicitCommentCourierFlowType2;
        DeliveryExplicitCommentCourierFlowType[] deliveryExplicitCommentCourierFlowTypeArr = {deliveryExplicitCommentCourierFlowType, deliveryExplicitCommentCourierFlowType2};
        $VALUES = deliveryExplicitCommentCourierFlowTypeArr;
        $ENTRIES = a.a(deliveryExplicitCommentCourierFlowTypeArr);
    }

    public static DeliveryExplicitCommentCourierFlowType valueOf(String str) {
        return (DeliveryExplicitCommentCourierFlowType) Enum.valueOf(DeliveryExplicitCommentCourierFlowType.class, str);
    }

    public static DeliveryExplicitCommentCourierFlowType[] values() {
        return (DeliveryExplicitCommentCourierFlowType[]) $VALUES.clone();
    }
}
