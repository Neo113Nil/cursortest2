package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchRequestDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResponseDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResultItemDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResultItemDto$$serializer;
import com.yandex.go.masstransit.sdk.client_api.data.dto.b0;
import com.yandex.go.masstransit.sdk.client_api.data.dto.c0;
import com.yandex.go.masstransit.sdk.client_api.data.dto.d0;
import com.yandex.go.masstransit.sdk.client_api.data.dto.g0;
import com.yandex.go.masstransit.sdk.client_api.data.dto.y;
import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$CompanionsSearch;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$CompanionsSearch$TravelCompanion$$serializer;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$QueueSearch;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse$$serializer;
import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.models.api.response.c7;
import com.yandex.go.taxi.order.models.api.response.i7;
import com.yandex.go.taxi.order.models.api.response.l7;
import com.yandex.go.taxi.order.models.api.response.o7;
import com.yandex.go.taxi.order.models.api.response.p7;
import com.yandex.go.taxi.order.state.search.SearchState;
import com.yandex.go.taxi.order.state.search.c;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.dto.response.SearchScreen;
import com.yandex.go.zone.dto.response.e;
import flex.engine.section.model.Side;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes12.dex */
public final /* synthetic */ class wpp0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ wpp0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new xpp0();
            case 1:
                return new o4o("com.yandex.go.masstransit.sdk.client_api.data.dto.SearchDataItemDto.UnsupportedSearchDataItemDto", y.INSTANCE, new Annotation[0]);
            case 2:
                c7 c7Var = SearchInfoResponse$CompanionsSearch.Companion;
                return new p53(SearchInfoResponse$CompanionsSearch$TravelCompanion$$serializer.INSTANCE, 0);
            case 3:
                return new o4o("com.yandex.go.taxi.order.models.api.response.SearchInfoResponse.None", i7.INSTANCE, new Annotation[0]);
            case 4:
                l7 l7Var = SearchInfoResponse$QueueSearch.QueueInfo.QueueNotification.Companion;
                return ChangeOrderNotificationActionResponse.Companion.serializer();
            case 5:
                o7 o7Var = SearchInfoResponse$TaxiSearch.Companion;
                return SearchInfoResponse$TaxiSearch.CandidateSearchState.Companion.serializer();
            case 6:
                o7 o7Var2 = SearchInfoResponse$TaxiSearch.Companion;
                return SearchOverlayType.Companion.serializer();
            case 7:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.SearchInfoResponse.TaxiSearch.CandidateSearchState", SearchInfoResponse$TaxiSearch.CandidateSearchState.values(), new String[]{"search", "waiting_response", "rejected"}, new Annotation[][]{null, null, null});
            case 8:
                p7 p7Var = SearchInfoResponse$TaxiSearch.PerformerInfoResponse.Companion;
                return new p53(SearchInfoResponse$TaxiSearch$PerformerInfoResponse$DriverPositionResponse$$serializer.INSTANCE, 0);
            case 9:
                return "Unsupported SearchInfoResponse type";
            case 10:
                return vez0.g("com.yandex.go.taxi.order.models.api.response.SearchOverlayType", SearchOverlayType.values(), new String[]{null, "uber_long_search", "search_cars_overlay_strategy", "fast", "ordinary", Constants.LONG, "display_banners", "search_companions", "queue"}, new Annotation[][]{null, null, null, null, null, null, null, null, null});
            case 11:
                b0 b0Var = SearchRequestDto.Companion;
                return new p53(ttp0.e, 0);
            case 12:
                c0 c0Var = SearchResponseDto.Companion;
                return new p53(SearchResultItemDto$$serializer.INSTANCE, 0);
            case 13:
                d0 d0Var = SearchResultItemDto.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 14:
                return new o4o("com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResultListItemDto.UnsupportedSearchListItemDto", g0.INSTANCE, new Annotation[0]);
            case 15:
                e eVar = SearchScreen.DisplaySettings.Companion;
                return SearchScreen.DisplaySettings.PreferredOrderDetailsType.Companion.serializer();
            case 16:
                return new rwp0(RoutePointType.DISCOVERY_ORGANIZATION, false);
            case 17:
                c cVar = SearchState.Companion;
                return ServiceLevel.SearchingPulsarDTO.SearchingPulsar.Companion.serializer();
            case 18:
                c cVar2 = SearchState.Companion;
                return SearchOverlayType.Companion.serializer();
            case 19:
                c cVar3 = SearchState.Companion;
                return SearchInfoResponse$TaxiSearch.CandidateSearchState.Companion.serializer();
            case 20:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 21:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 22:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 23:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 24:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 25:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 26:
                return new p53(h2q0.a, 0);
            case 27:
                return new oke(qoi0.a(tg2.class), null, new KSerializer[0]);
            case 28:
                return new oke(qoi0.a(tg2.class), null, new KSerializer[0]);
            default:
                return new p53(Side.Companion.serializer(), 0);
        }
    }
}
