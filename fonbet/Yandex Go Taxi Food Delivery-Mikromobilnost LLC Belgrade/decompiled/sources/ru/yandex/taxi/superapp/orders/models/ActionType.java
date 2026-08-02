package ru.yandex.taxi.superapp.orders.models;

import defpackage.dzg0;
import defpackage.f1h0;
import defpackage.k4o;
import defpackage.kyh0;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.cprocsp.NGate.tools.Constants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"¨\u0006#"}, d2 = {"Lru/yandex/taxi/superapp/orders/models/ActionType;", "", "", "drawableId", CA20Status.STATUS_USER_I, "b", "()I", Constants.INTENT_PARAM_TITLE_ID, "c", "", "isAutofitPreferred", "Z", "f", "()Z", "", "analyticAlias", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "CALL", "CANCEL", "CHECK_IN_INFO", "CHAT", "COMMUNICATION", "SHARE", "DEAF_DRIVER", "DRIVER", "HELP", "ORDER_DETAILS", "MAKE_TAXI_ORDER", "WALK", "TRANSPORT_INFO", "LOGISTICS_PERFORMER", "LOGISTICS_SHOW_CONTENT", "PAYMENT_METHODS", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ActionType[] $VALUES;
    public static final ActionType CALL;
    public static final ActionType CANCEL;
    public static final ActionType CHAT;
    public static final ActionType CHECK_IN_INFO;
    public static final ActionType COMMUNICATION;
    public static final ActionType DEAF_DRIVER;
    public static final ActionType DRIVER;
    public static final ActionType HELP;
    public static final ActionType LOGISTICS_PERFORMER;
    public static final ActionType LOGISTICS_SHOW_CONTENT;
    public static final ActionType MAKE_TAXI_ORDER;
    public static final ActionType ORDER_DETAILS;
    public static final ActionType PAYMENT_METHODS;
    public static final ActionType SHARE;
    public static final ActionType TRANSPORT_INFO;
    public static final ActionType WALK;
    private final String analyticAlias;
    private final int drawableId;
    private final boolean isAutofitPreferred;
    private final int titleId;

    static {
        int i = f1h0.ic_call;
        int i2 = kyh0.taxiotw_call;
        ActionType actionType = new ActionType("CALL", false, "phone_call", 0, i, i2);
        CALL = actionType;
        ActionType actionType2 = new ActionType("CANCEL", false, "cancel_order", 1, dzg0.ic_cross_close, kyh0.order_cancel);
        CANCEL = actionType2;
        int i3 = f1h0.ic_comming_component;
        ActionType actionType3 = new ActionType("CHECK_IN_INFO", false, "check_in_instruction", 2, i3, 0);
        CHECK_IN_INFO = actionType3;
        ActionType actionType4 = new ActionType("CHAT", false, "open_chat", 3, f1h0.ic_message_component, kyh0.taxiotw_chat);
        CHAT = actionType4;
        ActionType actionType5 = new ActionType("COMMUNICATION", false, "communication_to_driver", 4, f1h0.ic_communication_with_driver, kyh0.order_action_communication_with_driver);
        COMMUNICATION = actionType5;
        ActionType actionType6 = new ActionType("SHARE", false, "share_route", 5, f1h0.order_share, kyh0.order_options_share_route);
        SHARE = actionType6;
        ActionType actionType7 = new ActionType("DEAF_DRIVER", false, "inactive_phone_call", 6, f1h0.ic_deaf, 0);
        DEAF_DRIVER = actionType7;
        ActionType actionType8 = new ActionType("DRIVER", false, "driver_info", 7, f1h0.ic_person, 0);
        DRIVER = actionType8;
        ActionType actionType9 = new ActionType("HELP", true, "safety_center", 8, f1h0.ic_safety_center_24, i2);
        HELP = actionType9;
        ActionType actionType10 = new ActionType("ORDER_DETAILS", false, "order_info", 9, f1h0.ic_details_order, kyh0.order_details);
        ORDER_DETAILS = actionType10;
        ActionType actionType11 = new ActionType("MAKE_TAXI_ORDER", false, "add_order", 10, f1h0.ic_add_24, kyh0.make_another_order_card_button_text);
        MAKE_TAXI_ORDER = actionType11;
        ActionType actionType12 = new ActionType("WALK", false, "coming_soon", 11, i3, kyh0.order_options_coming);
        WALK = actionType12;
        ActionType actionType13 = new ActionType("TRANSPORT_INFO", false, "transport_info", 12, f1h0.ic_transport_route_navigation, kyh0.transport_info_button_text);
        TRANSPORT_INFO = actionType13;
        ActionType actionType14 = new ActionType("LOGISTICS_PERFORMER", false, "driver_info", 13, f1h0.ic_courier_avatar, 0);
        LOGISTICS_PERFORMER = actionType14;
        ActionType actionType15 = new ActionType("LOGISTICS_SHOW_CONTENT", false, "show_delivery_from_service_content", 14, f1h0.ic_basket, 0);
        LOGISTICS_SHOW_CONTENT = actionType15;
        ActionType actionType16 = new ActionType("PAYMENT_METHODS", false, "open_payment_methods", 15, f1h0.ic_payment_methods, 0);
        PAYMENT_METHODS = actionType16;
        ActionType[] actionTypeArr = {actionType, actionType2, actionType3, actionType4, actionType5, actionType6, actionType7, actionType8, actionType9, actionType10, actionType11, actionType12, actionType13, actionType14, actionType15, actionType16};
        $VALUES = actionTypeArr;
        $ENTRIES = a.a(actionTypeArr);
    }

    public ActionType(String str, boolean z, String str2, int i, int i2, int i3) {
        this.drawableId = i2;
        this.titleId = i3;
        this.isAutofitPreferred = z;
        this.analyticAlias = str2;
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticAlias() {
        return this.analyticAlias;
    }

    /* renamed from: b, reason: from getter */
    public final int getDrawableId() {
        return this.drawableId;
    }

    /* renamed from: c, reason: from getter */
    public final int getTitleId() {
        return this.titleId;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsAutofitPreferred() {
        return this.isAutofitPreferred;
    }
}
