package defpackage;

import com.yandex.go.copter.city_tour.api.CityToursParam;
import com.yandex.go.copter.city_tour.api.CityToursResponse;
import com.yandex.go.copter.city_tour.api.CityToursResponse$Choice$$serializer;
import com.yandex.go.copter.city_tour.api.CityToursResponse$Choice$TourPoint$$serializer;
import com.yandex.go.copter.city_tour.api.b;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutOrderStatusDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto$DirectionSelectorScreenElementDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto$StopSelectorScreenElementDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenStateDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutStatusDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutTripResponseDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.DirectionDto$$serializer;
import com.yandex.go.masstransit.sdk.client_api.data.dto.StopDto$$serializer;
import com.yandex.go.masstransit.sdk.client_api.data.dto.c;
import com.yandex.go.masstransit.sdk.client_api.data.dto.d;
import com.yandex.go.masstransit.sdk.client_api.data.dto.g;
import com.yandex.go.masstransit.sdk.client_api.data.dto.h;
import com.yandex.go.masstransit.sdk.client_api.data.dto.j;
import com.yandex.go.masstransit.sdk.client_api.data.dto.k;
import com.yandex.go.masstransit.sdk.client_api.data.dto.l;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.CitySuggest$$serializer;
import com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.CitySuggestResponse;
import com.yandex.go.payments.shared.family.web.nativeapi.request.ChooseContactsParams;
import com.yandex.go.payments.shared.family.web.nativeapi.response.ChooseContactsInfoResponse;
import com.yandex.go.payments.shared.family.web.nativeapi.response.Contact$$serializer;
import com.yandex.go.payments.shared.family.web.nativeapi.response.a;
import com.yandex.go.taxi.order.models.api.response.Chevron;
import com.yandex.go.taxi.order.models.api.response.x;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.a0;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.p;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.q;
import ru.yandex.taxi.masstransit.geopayment.checkout.network.model.r;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public final /* synthetic */ class qlb implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ qlb(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 zy11Var3;
        zy11 zy11Var4;
        zy11 zy11Var5;
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.CheckoutPaymentMethods.Source", CheckoutResponse.CheckoutPaymentMethods.Source.values(), new String[]{"default", "mosmetro"}, new Annotation[][]{null, null});
            case 1:
                p pVar = CheckoutResponse.StopsSelector.Companion;
                return new p53(q.a, 0);
            case 2:
                r rVar = CheckoutResponse.StopsSelector.a.Companion;
                return CheckoutResponse.StopsSelector.StopState.Companion.serializer();
            case 3:
                r rVar2 = CheckoutResponse.StopsSelector.a.Companion;
                return CheckoutResponse.StopsSelector.StopState.Companion.serializer();
            case 4:
                return vez0.g("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.StopsSelector.StopState", CheckoutResponse.StopsSelector.StopState.values(), new String[]{"passed", "upcoming"}, new Annotation[][]{null, null});
            case 5:
                a0 a0Var = CheckoutResponse.TransportItem.Companion;
                return CheckoutResponse.TransportItem.TransportType.Companion.serializer();
            case 6:
                return vez0.g("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutResponse.TransportItem.TransportType", CheckoutResponse.TransportItem.TransportType.values(), new String[]{"bus", "tram", "trolley", "electrobus", "water"}, new Annotation[][]{null, null, null, null, null});
            case 7:
                c cVar = CheckoutScreenElementDto$DirectionSelectorScreenElementDto.Companion;
                return new p53(DirectionDto$$serializer.INSTANCE, 0);
            case 8:
                return new o4o("com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto.GroupDividerScreenElementDto", d.INSTANCE, new Annotation[0]);
            case 9:
                g gVar = CheckoutScreenElementDto$StopSelectorScreenElementDto.Companion;
                return new p53(StopDto$$serializer.INSTANCE, 0);
            case 10:
                return new o4o("com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenElementDto.UnsupportedCheckoutScreenElementDto", h.INSTANCE, new Annotation[0]);
            case 11:
                j jVar = CheckoutScreenStateDto.Companion;
                return new p53(cmb.e, 0);
            case 12:
                k kVar = CheckoutStatusDto.Companion;
                return CheckoutOrderStatusDto.Companion.serializer();
            case 13:
                l lVar = CheckoutTripResponseDto.Companion;
                return CheckoutOrderStatusDto.Companion.serializer();
            case 14:
                return new drg();
            case 15:
                x xVar = Chevron.Companion;
                return new p53(yx.e, 0);
            case 16:
                zy11Var = zy11.a;
                return zy11Var;
            case 17:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 18:
                zy11Var3 = zy11.a;
                return zy11Var3;
            case 19:
                zy11Var4 = zy11.a;
                return zy11Var4;
            case 20:
                a aVar = ChooseContactsInfoResponse.Companion;
                return new p53(Contact$$serializer.INSTANCE, 0);
            case 21:
                com.yandex.go.payments.shared.family.web.nativeapi.request.c cVar2 = ChooseContactsParams.Companion;
                return new p53(auu0.a, 0);
            case 22:
                zy11Var5 = zy11.a;
                return zy11Var5;
            case 23:
                com.yandex.go.payments.shared.business.accountcreation.corp.citysuggestdialog.c cVar3 = CitySuggestResponse.Companion;
                return new p53(CitySuggest$$serializer.INSTANCE, 0);
            case 24:
                com.yandex.go.copter.city_tour.api.a aVar2 = CityToursParam.Companion;
                return new p53(h6w.a, 0);
            case 25:
                com.yandex.go.copter.city_tour.api.d dVar = CityToursResponse.Companion;
                return new p53(CityToursResponse$Choice$$serializer.INSTANCE, 0);
            case 26:
                b bVar = CityToursResponse.Choice.Companion;
                return new p53(CityToursResponse$Choice$TourPoint$$serializer.INSTANCE, 0);
            case 27:
                fyb fybVar = gyb.Companion;
                return RoutePointType.Companion.serializer();
            case 28:
                fzb fzbVar = gzb.Companion;
                return new p53(eyb.a, 0);
            default:
                return new o4o("core.flex.preload.actions.CleanPreloadStorageAction", l0c.INSTANCE, new Annotation[0]);
        }
    }
}
