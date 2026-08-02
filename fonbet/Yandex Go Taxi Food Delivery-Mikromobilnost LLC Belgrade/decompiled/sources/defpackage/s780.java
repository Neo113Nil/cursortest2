package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderDto$$serializer;
import com.yandex.go.multimodal_route.network.models.OrdersRequestDto;
import com.yandex.go.multimodal_route.network.models.OrdersResponseDto;
import com.yandex.go.multimodal_route.network.models.m;
import com.yandex.go.multimodal_route.network.models.n;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryDto;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryItemDto$$serializer;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.h;
import com.yandex.go.places.organization.card.impl.data.entities.network.card.j;
import com.yandex.go.taxi.order.cache.api.data.model.OrderType;
import com.yandex.go.taxi.order.e0;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.objects.Organization;
import com.yandex.go.taxi.order.models.api.objects.UserActions$Action$$serializer;
import com.yandex.go.taxi.order.models.api.objects.q0;
import com.yandex.go.taxi.order.models.api.request.OrderStatusParam;
import com.yandex.go.taxi.order.models.api.request.b;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo$ExtraItem$$serializer;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo$RidaSearchInfo$BidInfoDto$$serializer;
import com.yandex.go.taxi.order.models.api.response.TipsVariant$$serializer;
import com.yandex.go.taxi.order.models.api.response.a3;
import com.yandex.go.taxi.order.models.api.response.h3;
import com.yandex.go.taxi.order.models.api.status.ActionType;
import com.yandex.go.taxi.order.models.api.status.ImageType;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowAction;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification;
import com.yandex.go.taxi.order.models.api.status.ScreenType;
import com.yandex.go.taxi.order.models.api.status.a;
import com.yandex.go.taxi.order.models.api.status.c;
import java.lang.annotation.Annotation;
import java.util.concurrent.atomic.AtomicInteger;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final /* synthetic */ class s780 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ s780(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                a3 a3Var = OrderStatusInfo.RidaSearchInfo.Companion;
                return new p53(OrderStatusInfo$RidaSearchInfo$BidInfoDto$$serializer.INSTANCE, 0);
            case 1:
                h3 h3Var = OrderStatusInfo.TipsSuggestions.Companion;
                return new p53(TipsVariant$$serializer.INSTANCE, 0);
            case 2:
                return new a3y0(TaxiOrderLogGroup.NOTIFICATION.getTag(), "OrderStatusNotificationInteractor");
            case 3:
                b bVar = OrderStatusParam.Companion;
                return OrderStatusParam.Break.Companion.serializer();
            case 4:
                b bVar2 = OrderStatusParam.Companion;
                return new k8u(auu0.a, UserActions$Action$$serializer.INSTANCE, 1);
            case 5:
                b bVar3 = OrderStatusParam.Companion;
                return new p53(auu0.a, 0);
            case 6:
                b bVar4 = OrderStatusParam.Companion;
                return jsq0.Companion.serializer(OrderStatusParam.Widget.Companion.serializer());
            case 7:
                b bVar5 = OrderStatusParam.Companion;
                return jsq0.Companion.serializer(OrderStatusParam.PromoAction.Companion.serializer());
            case 8:
                return vez0.g("com.yandex.go.taxi.order.models.api.request.OrderStatusParam.Break", OrderStatusParam.Break.values(), new String[]{"user", "timeout", "accident"}, new Annotation[][]{null, null, null});
            case 9:
                return vez0.g("com.yandex.go.taxi.order.models.api.request.OrderStatusParam.PromoAction", OrderStatusParam.PromoAction.values(), new String[]{Constants.DEEPLINK, "pick_contact_for_totw", "modal_view", "lootbox", "offer_substitution", "tariff_redirect", "request_totw_with_key_and_value", "car_appearance_override"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 10:
                return vez0.g("com.yandex.go.taxi.order.models.api.request.OrderStatusParam.Widget", OrderStatusParam.Widget.values(), new String[]{"actions_arrow_button", "deeplink_arrow_button", "toggle", "action_buttons", "action_button", "attributed_text"}, new Annotation[][]{null, null, null, null, null, null});
            case 11:
                return "Taxi search connection error";
            case 12:
                AtomicInteger atomicInteger = e0.n;
                return "Failed to update status";
            case 13:
                a aVar = OrderStatusWindowAction.Companion;
                return ActionType.Companion.serializer();
            case 14:
                a aVar2 = OrderStatusWindowAction.Companion;
                return ScreenType.Companion.serializer();
            case 15:
                c cVar = OrderStatusWindowNotification.Companion;
                return ImageType.Companion.serializer();
            case 16:
                c cVar2 = OrderStatusWindowNotification.Companion;
                return jsq0.Companion.serializer(DriveState.Companion.serializer());
            case 17:
                return "Error open delivery deeplink";
            case 18:
                return "Can't resolve user address for new ride on orders list screen";
            case 19:
                return vez0.g("com.yandex.go.taxi.order.cache.api.data.model.OrderType", OrderType.values(), new String[]{"default", "ambulance"}, new Annotation[][]{null, null});
            case 20:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "OrderViewFactory");
            case 21:
                return "Error getting orders count";
            case 22:
                return "Order not found in DB";
            case 23:
                m mVar = OrdersRequestDto.Companion;
                return new p53(auu0.a, 0);
            case 24:
                n nVar = OrdersResponseDto.Companion;
                return new p53(MultimodalRoutesOrderDto$$serializer.INSTANCE, 0);
            case 25:
                return "Root view group cannot be null";
            case 26:
                return "search_animated_fog view not found in hierarchy";
            case 27:
                q0 q0Var = Organization.Companion;
                return new p53(OrderStatusInfo$ExtraItem$$serializer.INSTANCE, 0);
            case 28:
                return new o4o("com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryContentItemDto.Unknown", h.INSTANCE, new Annotation[0]);
            default:
                j jVar = OrganizationGalleryDto.Companion;
                return new p53(OrganizationGalleryItemDto$$serializer.INSTANCE, 0);
        }
    }
}
