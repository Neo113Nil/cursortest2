package defpackage;

import com.yandex.go.experiments.zoneinfo.ScheduledOrderExperiment;
import com.yandex.go.experiments.zoneinfo.ZoneAnticrisisRequestHeadersExperiment;
import com.yandex.go.feedsdk.log.experiments.FeedSdkErrorReportingExperiment;
import com.yandex.go.feedsdk.log.experiments.a;
import com.yandex.go.navigator.rate_route.experiement.FeedbackItemDto;
import com.yandex.go.navigator.rate_route.experiement.OptionDto$$serializer;
import com.yandex.go.net.taxi.dto.response.typed_experiments.MulticlassTariffPositionExperiment;
import com.yandex.go.tariffs.SummaryHighTariffSelectorExperiment;
import com.yandex.go.yb.lack_of_order.experiments.MoneyNotEnoughExperiment;
import com.yandex.go.zone.repository.ZoneAnticrisisAmExperiment;
import com.yandex.go.zone.repository.ZoneFallbackTtlExperiment;
import ru.yandex.taxi.persuggest.api.LocationProvider;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;

/* loaded from: classes9.dex */
public final /* synthetic */ class wmq implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ wmq(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return MoneyNotEnoughExperiment.Companion.serializer();
            case 1:
                return ZoneAnticrisisRequestHeadersExperiment.Companion.serializer();
            case 2:
                return ScheduledOrderExperiment.Companion.serializer();
            case 3:
                return ZoneAnticrisisAmExperiment.Companion.serializer();
            case 4:
                return ZoneFallbackTtlExperiment.Companion.serializer();
            case 5:
                return MulticlassTariffPositionExperiment.Companion.serializer();
            case 6:
                return SummaryHighTariffSelectorExperiment.Companion.serializer();
            case 7:
                return dot0.Companion.serializer();
            case 8:
                return gjr0.Companion.serializer();
            case 9:
                return d3r0.Companion.serializer();
            case 10:
                return ooe0.Companion.serializer();
            case 11:
                return l0c.INSTANCE.serializer();
            case 12:
                return new m0c(0);
            case 13:
                return he1.Companion.serializer();
            case 14:
                return aiu.INSTANCE.serializer();
            case 15:
                return ywi0.Companion.serializer();
            case 16:
                return new zwi0(0);
            case 17:
                return ue1.Companion.serializer();
            case 18:
                return u13.Companion.serializer();
            case 19:
                return new jys();
            case 20:
                return new fys();
            case 21:
                a aVar = FeedSdkErrorReportingExperiment.Companion;
                return new p53(auu0.a, 1);
            case 22:
                a aVar2 = FeedSdkErrorReportingExperiment.Companion;
                return new p53(auu0.a, 1);
            case 23:
                a aVar3 = FeedSdkErrorReportingExperiment.Companion;
                return new p53(auu0.a, 1);
            case 24:
                com.yandex.go.navigator.rate_route.experiement.a aVar4 = FeedbackItemDto.Companion;
                return new p53(OptionDto$$serializer.INSTANCE, 0);
            case 25:
                return "Feedback queue file: file corrupt.";
            case 26:
                return "Feedback queue file: error after file recreate. Fallback to InMemoryQueue";
            case 27:
                return new p53(b0t.a, 0);
            case 28:
                return Action.Companion.serializer();
            default:
                return LocationProvider.Companion.serializer();
        }
    }
}
