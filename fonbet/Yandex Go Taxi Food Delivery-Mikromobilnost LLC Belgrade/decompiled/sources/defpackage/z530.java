package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.masstransit.sdk.ble.impl.network.MtPaymentBleResponse;
import com.yandex.go.masstransit.sdk.ble.impl.network.b;
import com.yandex.go.morphlex.data.dto.MorphlexRequestDto;
import com.yandex.go.morphlex.data.dto.d;
import com.yandex.go.yb.lack_of_order.experiments.MoneyNotEnoughExperiment;
import com.yandex.go.yb.lack_of_order.experiments.a;
import java.lang.annotation.Annotation;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.yandex.taxi.masstransit.model.MtPositionOverMap;
import ru.yandex.taxi.masstransit.promo.CommunicationType;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam;
import ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse;
import ru.yandex.taxi.masstransit.promo.models.c;
import ru.yandex.taxi.masstransit.promo.models.e;
import ru.yandex.taxi.masstransit.promo.models.g;
import ru.yandex.taxi.masstransit.promo.models.i;
import ru.yandex.taxi.masstransit.promo.models.j;
import ru.yandex.taxi.masstransit.promo.models.l;
import ru.yandex.taxi.masstransit.promo.models.m;
import ru.yandex.taxi.masstransit.promo.models.q;
import ru.yandex.taxi.masstransit.promo.models.s;
import ru.yandex.taxi.masstransit.trains.schedule.dto.MtScheduleScenario;

/* loaded from: classes6.dex */
public final /* synthetic */ class z530 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ z530(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 zy11Var3;
        switch (this.a) {
            case 0:
                a aVar = MoneyNotEnoughExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 1:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (evu0.J("kotlinx.datetime.MonthBased")) {
                    ny61.g("Blank serial names are prohibited");
                    return null;
                }
                h0c h0cVar = new h0c("kotlinx.datetime.MonthBased");
                h0cVar.a("months", h6w.b, false);
                return new asq0("kotlinx.datetime.MonthBased", ovu0.g, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
            case 2:
                zy11Var = zy11.a;
                return zy11Var;
            case 3:
                return new o4o("com.yandex.go.morphlex.ui.controllers.preview.MorphlexPreviewScaffold", t730.INSTANCE, new Annotation[0]);
            case 4:
                d dVar = MorphlexRequestDto.Companion;
                return new p53(Address.Companion.serializer(), 0);
            case 5:
                d dVar2 = MorphlexRequestDto.Companion;
                return new p53(imx0.a, 0);
            case 6:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 7:
                zy11Var3 = zy11.a;
                return zy11Var3;
            case 8:
                hq30 hq30Var = kq30.Companion;
                return MtPositionOverMap.Companion.serializer();
            case 9:
                hq30 hq30Var2 = kq30.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 10:
                or30 or30Var = pr30.Companion;
                return new p53(auu0.a, 0);
            case 11:
                b bVar = MtPaymentBleResponse.Companion;
                return new p53(auu0.a, 0);
            case 12:
                return vez0.g("ru.yandex.taxi.masstransit.model.MtPositionOverMap", MtPositionOverMap.values(), new String[]{"center_start", "center_end"}, new Annotation[][]{null, null});
            case 13:
                return vez0.g("ru.yandex.taxi.masstransit.trains.schedule.dto.MtScheduleScenario", MtScheduleScenario.values(), new String[]{"v1", "v2", null}, new Annotation[][]{null, null, null});
            case 14:
                return vez0.g("com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtScheduleScenario", com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtScheduleScenario.values(), new String[]{"v1", "v2", null}, new Annotation[][]{null, null, null});
            case 15:
                return new o4o("ru.yandex.taxi.masstransit.main.flex.shimmer.MtShimmerSection", oz30.INSTANCE, new Annotation[0]);
            case 16:
                a540 a540Var = MtSummaryCommunicationsParam.Companion;
                return jsq0.Companion.serializer(CommunicationType.Companion.serializer());
            case 17:
                c cVar = MtSummaryCommunicationsParam.a.Companion;
                return new p53(ru.yandex.taxi.masstransit.promo.models.d.a, 0);
            case 18:
                e eVar = MtSummaryCommunicationsParam.a.C0106a.Companion;
                return new p53(auu0.a, 0);
            case 19:
                e eVar2 = MtSummaryCommunicationsParam.a.C0106a.Companion;
                return new p53(auu0.a, 0);
            case 20:
                g gVar = MtSummaryCommunicationsParam.CommunicationState.Companion;
                return MtSummaryCommunicationsParam.CommunicationState.MtScreenType.Companion.serializer();
            case 21:
                g gVar2 = MtSummaryCommunicationsParam.CommunicationState.Companion;
                return new p53(c5v0.a, 0);
            case 22:
                g gVar3 = MtSummaryCommunicationsParam.CommunicationState.Companion;
                return new p53(auu0.a, 0);
            case 23:
                g gVar4 = MtSummaryCommunicationsParam.CommunicationState.Companion;
                return new p53(auu0.a, 0);
            case 24:
                return vez0.g("ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsParam.CommunicationState.MtScreenType", MtSummaryCommunicationsParam.CommunicationState.MtScreenType.values(), new String[]{"masstransit_main", "masstransit_summary"}, new Annotation[][]{null, null});
            case 25:
                j jVar = MtSummaryCommunicationsParam.CommunicationState.a.Companion;
                return new p53(m.a, 0);
            case 26:
                l lVar = MtSummaryCommunicationsParam.CommunicationState.b.Companion;
                return new p53(i.a, 0);
            case 27:
                q qVar = MtSummaryCommunicationsResponse.a.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 28:
                s sVar = MtSummaryCommunicationsResponse.a.C0107a.Companion;
                return MtSummaryCommunicationsResponse.OfferAvailability.Companion.serializer();
            default:
                return vez0.g("ru.yandex.taxi.masstransit.promo.models.MtSummaryCommunicationsResponse.OfferAvailability", MtSummaryCommunicationsResponse.OfferAvailability.values(), new String[]{"all", "original", "alternative"}, new Annotation[][]{null, null, null});
        }
    }
}
