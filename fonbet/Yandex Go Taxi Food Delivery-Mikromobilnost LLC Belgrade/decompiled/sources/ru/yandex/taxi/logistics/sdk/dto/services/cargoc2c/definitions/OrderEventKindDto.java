package ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions;

import com.squareup.moshi.Json;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001d\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/cargoc2c/definitions/OrderEventKindDto;", "", "<init>", "(Ljava/lang/String;I)V", "ORDER_CREATE_REQUESTED", "ORDER_CREATE_SUCCEEDED", "ORDER_CREATE_FAILED", "ORDER_CANCEL_REQUESTED", "ORDER_CANCEL_SUCCEEDED", "ORDER_CANCEL_FAILED", "FEEDBACK_REQUESTED", "FEEDBACK_SUCCEEDED", "ORDER_TERMINATED", "POLL_REQUESTED", "ORDER_EDIT_REQUESTED", "ORDER_EDIT_SUBMITTED", "ORDER_EDIT_FAILED", "ORDER_EDIT_SUCCEEDED", "ORDER_PAY_NOW_REQUESTED", "ORDER_PAY_NOW_SUCCEEDED", "ORDER_PAY_NOW_FAILED", "CANCEL_CHEQUE_ORDER_REQUESTED", "ROVER_ACTION_REQUESTED", "ROVER_ACTION_SUBMITTED", "ROVER_ACTION_SUCCEEDED", "ROVER_ACTION_FAILED", "AI_POSTCARD_REQUESTED", "AI_POSTCARD_GENERATED", "AI_POSTCARD_FAILED", "AI_POSTCARD_SUBMITTED", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OrderEventKindDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrderEventKindDto[] $VALUES;

    @Json(name = "order-create-requested")
    public static final OrderEventKindDto ORDER_CREATE_REQUESTED = new OrderEventKindDto("ORDER_CREATE_REQUESTED", 0);

    @Json(name = "order-create-succeeded")
    public static final OrderEventKindDto ORDER_CREATE_SUCCEEDED = new OrderEventKindDto("ORDER_CREATE_SUCCEEDED", 1);

    @Json(name = "order-create-failed")
    public static final OrderEventKindDto ORDER_CREATE_FAILED = new OrderEventKindDto("ORDER_CREATE_FAILED", 2);

    @Json(name = "order-cancel-requested")
    public static final OrderEventKindDto ORDER_CANCEL_REQUESTED = new OrderEventKindDto("ORDER_CANCEL_REQUESTED", 3);

    @Json(name = "order-cancel-succeeded")
    public static final OrderEventKindDto ORDER_CANCEL_SUCCEEDED = new OrderEventKindDto("ORDER_CANCEL_SUCCEEDED", 4);

    @Json(name = "order-cancel-failed")
    public static final OrderEventKindDto ORDER_CANCEL_FAILED = new OrderEventKindDto("ORDER_CANCEL_FAILED", 5);

    @Json(name = "feedback-requested")
    public static final OrderEventKindDto FEEDBACK_REQUESTED = new OrderEventKindDto("FEEDBACK_REQUESTED", 6);

    @Json(name = "feedback-succeeded")
    public static final OrderEventKindDto FEEDBACK_SUCCEEDED = new OrderEventKindDto("FEEDBACK_SUCCEEDED", 7);

    @Json(name = "order-terminated")
    public static final OrderEventKindDto ORDER_TERMINATED = new OrderEventKindDto("ORDER_TERMINATED", 8);

    @Json(name = "poll-requested")
    public static final OrderEventKindDto POLL_REQUESTED = new OrderEventKindDto("POLL_REQUESTED", 9);

    @Json(name = "order-edit-requested")
    public static final OrderEventKindDto ORDER_EDIT_REQUESTED = new OrderEventKindDto("ORDER_EDIT_REQUESTED", 10);

    @Json(name = "order-edit-submitted")
    public static final OrderEventKindDto ORDER_EDIT_SUBMITTED = new OrderEventKindDto("ORDER_EDIT_SUBMITTED", 11);

    @Json(name = "order-edit-failed")
    public static final OrderEventKindDto ORDER_EDIT_FAILED = new OrderEventKindDto("ORDER_EDIT_FAILED", 12);

    @Json(name = "order-edit-succeeded")
    public static final OrderEventKindDto ORDER_EDIT_SUCCEEDED = new OrderEventKindDto("ORDER_EDIT_SUCCEEDED", 13);

    @Json(name = "order-pay-now-requested")
    public static final OrderEventKindDto ORDER_PAY_NOW_REQUESTED = new OrderEventKindDto("ORDER_PAY_NOW_REQUESTED", 14);

    @Json(name = "order-pay-now-succeeded")
    public static final OrderEventKindDto ORDER_PAY_NOW_SUCCEEDED = new OrderEventKindDto("ORDER_PAY_NOW_SUCCEEDED", 15);

    @Json(name = "order-pay-now-failed")
    public static final OrderEventKindDto ORDER_PAY_NOW_FAILED = new OrderEventKindDto("ORDER_PAY_NOW_FAILED", 16);

    @Json(name = "cancel-cheque-order-requested")
    public static final OrderEventKindDto CANCEL_CHEQUE_ORDER_REQUESTED = new OrderEventKindDto("CANCEL_CHEQUE_ORDER_REQUESTED", 17);

    @Json(name = "rover-action-requested")
    public static final OrderEventKindDto ROVER_ACTION_REQUESTED = new OrderEventKindDto("ROVER_ACTION_REQUESTED", 18);

    @Json(name = "rover-action-submitted")
    public static final OrderEventKindDto ROVER_ACTION_SUBMITTED = new OrderEventKindDto("ROVER_ACTION_SUBMITTED", 19);

    @Json(name = "rover-action-succeeded")
    public static final OrderEventKindDto ROVER_ACTION_SUCCEEDED = new OrderEventKindDto("ROVER_ACTION_SUCCEEDED", 20);

    @Json(name = "rover-action-failed")
    public static final OrderEventKindDto ROVER_ACTION_FAILED = new OrderEventKindDto("ROVER_ACTION_FAILED", 21);

    @Json(name = "ai-postcard-requested")
    public static final OrderEventKindDto AI_POSTCARD_REQUESTED = new OrderEventKindDto("AI_POSTCARD_REQUESTED", 22);

    @Json(name = "ai-postcard-generated")
    public static final OrderEventKindDto AI_POSTCARD_GENERATED = new OrderEventKindDto("AI_POSTCARD_GENERATED", 23);

    @Json(name = "ai-postcard-failed")
    public static final OrderEventKindDto AI_POSTCARD_FAILED = new OrderEventKindDto("AI_POSTCARD_FAILED", 24);

    @Json(name = "ai-postcard-submitted")
    public static final OrderEventKindDto AI_POSTCARD_SUBMITTED = new OrderEventKindDto("AI_POSTCARD_SUBMITTED", 25);

    private static final /* synthetic */ OrderEventKindDto[] $values() {
        return new OrderEventKindDto[]{ORDER_CREATE_REQUESTED, ORDER_CREATE_SUCCEEDED, ORDER_CREATE_FAILED, ORDER_CANCEL_REQUESTED, ORDER_CANCEL_SUCCEEDED, ORDER_CANCEL_FAILED, FEEDBACK_REQUESTED, FEEDBACK_SUCCEEDED, ORDER_TERMINATED, POLL_REQUESTED, ORDER_EDIT_REQUESTED, ORDER_EDIT_SUBMITTED, ORDER_EDIT_FAILED, ORDER_EDIT_SUCCEEDED, ORDER_PAY_NOW_REQUESTED, ORDER_PAY_NOW_SUCCEEDED, ORDER_PAY_NOW_FAILED, CANCEL_CHEQUE_ORDER_REQUESTED, ROVER_ACTION_REQUESTED, ROVER_ACTION_SUBMITTED, ROVER_ACTION_SUCCEEDED, ROVER_ACTION_FAILED, AI_POSTCARD_REQUESTED, AI_POSTCARD_GENERATED, AI_POSTCARD_FAILED, AI_POSTCARD_SUBMITTED};
    }

    static {
        OrderEventKindDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private OrderEventKindDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static OrderEventKindDto valueOf(String str) {
        return (OrderEventKindDto) Enum.valueOf(OrderEventKindDto.class, str);
    }

    public static OrderEventKindDto[] values() {
        return (OrderEventKindDto[]) $VALUES.clone();
    }
}
