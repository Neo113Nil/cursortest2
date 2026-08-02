package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.cancel.CancelSimilarOrdersNotification;
import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import com.yandex.go.taxi.order.models.api.cancel.p;
import com.yandex.go.taxi.order.models.api.objects.LackOfMoneyNotificationDto;
import com.yandex.go.taxi.order.models.api.objects.OrderPushNotification;
import com.yandex.go.taxi.order.models.api.objects.PickupPointPinNotification;
import com.yandex.go.taxi.order.models.api.objects.TextNotification;
import com.yandex.go.taxi.order.models.api.objects.p0;
import com.yandex.go.taxi.order.models.api.ride_support.OrderRideSupportNotification;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification;
import com.yandex.go.zone.dto.objects.Notification;
import com.yandex.go.zone.dto.objects.o2;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.c;

/* loaded from: classes14.dex */
public final class w280 extends vfx {
    public static final w280 a = new w280();
    public static final a3y0 b = new a3y0(TaxiOrderLogGroup.NOTIFICATION.getTag(), "OrderNotificationsSerializer");
    public static final Map c;
    public static final SerialDescriptor d;

    static {
        o2 o2Var = Notification.Companion;
        Pair pair = new Pair("max_waiting_time", o2Var.serializer());
        p0 p0Var = OrderPushNotification.Companion;
        c = b.i(pair, new Pair("prepaid_time_ends_soon", p0Var.serializer()), new Pair("prepaid_time_ends_now", p0Var.serializer()), new Pair("requirement_card_title", o2Var.serializer()), new Pair("cashback", TextNotification.Companion.serializer()), new Pair("multiclass_assign", o2Var.serializer()), new Pair("order_status_alert", o2Var.serializer()), new Pair("payment_informer", LackOfMoneyNotificationDto.Companion.serializer()), new Pair("order_status_window", OrderStatusWindowNotification.Companion.serializer()), new Pair("order_cancel_notification", OrderCancelNotification.Companion.serializer()), new Pair("after_cancel_popup", p.Companion.serializer()), new Pair("order_support_notification", OrderRideSupportNotification.Companion.serializer()), new Pair("cancel_similar_orders", CancelSimilarOrdersNotification.Companion.serializer()), new Pair("pickup_point_pin", PickupPointPinNotification.Companion.serializer()));
        d = c.Companion.serializer().getDescriptor();
    }

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        Object t = ncxVar.t();
        if (!(t instanceof c)) {
            v280.Companion.getClass();
            return v280.b;
        }
        MapBuilder mapBuilder = new MapBuilder();
        for (Map.Entry entry : ((Map) t).entrySet()) {
            String str = (String) entry.getKey();
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) entry.getValue();
            KSerializer kSerializer = (KSerializer) c.get(str);
            if (kSerializer != null) {
                try {
                    mapBuilder.put(str, new xh60(str, (wh60) ncxVar.d().a(kSerializer, bVar)));
                } catch (Exception e) {
                    b.b("deserialize", e, new xc8(str, 17));
                }
            }
        }
        return new v280(mapBuilder.j());
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        throw new SerializationException("OrderNotifications.Serializer does not support serialization");
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return d;
    }
}
