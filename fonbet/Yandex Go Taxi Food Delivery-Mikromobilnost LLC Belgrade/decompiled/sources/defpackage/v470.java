package defpackage;

import com.yandex.go.places.impl.domain.interactors.a;
import com.yandex.go.places.models.data.entities.network.actions.DeliveryOrderFormRoutePointFlexDto;
import com.yandex.go.places.models.data.entities.network.actions.OpenDeliveryFormFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.OpenNavigatorFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.OpenOrganizationCardFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.OpenTaxiFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.WebCustomTabsFlexAction;

/* loaded from: classes13.dex */
public final class v470 extends j15 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v470(Object obj, a aVar, int i) {
        super(aVar);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.j15
    public final fr a(kr krVar) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                OpenDeliveryFormFlexAction openDeliveryFormFlexAction = (OpenDeliveryFormFlexAction) krVar;
                ((x470) obj).getClass();
                String str = openDeliveryFormFlexAction.a;
                String str2 = openDeliveryFormFlexAction.b;
                DeliveryOrderFormRoutePointFlexDto deliveryOrderFormRoutePointFlexDto = openDeliveryFormFlexAction.c;
                return new cq(str2, str, deliveryOrderFormRoutePointFlexDto != null ? x470.a(deliveryOrderFormRoutePointFlexDto.c, deliveryOrderFormRoutePointFlexDto.b, deliveryOrderFormRoutePointFlexDto.a, deliveryOrderFormRoutePointFlexDto.d) : null);
            case 1:
                OpenNavigatorFlexAction openNavigatorFlexAction = (OpenNavigatorFlexAction) krVar;
                ((j670) obj).getClass();
                return j670.a(openNavigatorFlexAction.a, openNavigatorFlexAction.b);
            case 2:
                OpenOrganizationCardFlexAction openOrganizationCardFlexAction = (OpenOrganizationCardFlexAction) krVar;
                ((r670) obj).getClass();
                return r670.a(openOrganizationCardFlexAction.b, openOrganizationCardFlexAction.a, openOrganizationCardFlexAction.c, null, null, null);
            case 3:
                ((m870) obj).getClass();
                return new fq(((OpenTaxiFlexAction) krVar).a);
            default:
                WebCustomTabsFlexAction webCustomTabsFlexAction = (WebCustomTabsFlexAction) krVar;
                ((mg41) obj).getClass();
                return new gq(webCustomTabsFlexAction.a, webCustomTabsFlexAction.b);
        }
    }
}
