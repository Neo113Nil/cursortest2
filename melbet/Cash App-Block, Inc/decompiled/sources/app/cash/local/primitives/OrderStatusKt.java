package app.cash.local.primitives;

import com.squareup.protos.cash.local.client.v1.LocalOrder;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public abstract class OrderStatusKt {
    public static final boolean getCompleted(OrderStatus orderStatus) {
        orderStatus.getClass();
        return CollectionsKt__CollectionsKt.getLastIndex(orderStatus.statuses) == orderStatus.currentStatusIndex && !orderStatus.cancelled;
    }

    public static final OrderStatus toOrderStatus(LocalOrder.OrderStatus orderStatus) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        orderStatus.getClass();
        Integer num = orderStatus.current_status_index;
        if (num != null) {
            i = num.intValue();
            z = false;
        } else {
            i = 0;
            z = false;
        }
        List<String> list = orderStatus.possible_statuses;
        boolean z4 = z;
        String str2 = orderStatus.current_status_heading;
        Boolean bool = orderStatus.is_cancelled;
        boolean booleanValue = bool != null ? bool.booleanValue() : z4;
        String str3 = orderStatus.current_status_fulfillment_label;
        Boolean bool2 = orderStatus.is_in_progress;
        if (bool2 != null) {
            z3 = booleanValue;
            str = str3;
            z2 = bool2.booleanValue();
        } else {
            z2 = z4;
            z3 = booleanValue;
            str = str3;
        }
        return new OrderStatus(i, list, str2, z3, str, z2);
    }
}
