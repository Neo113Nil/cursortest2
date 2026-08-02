package defpackage;

import android.os.HandlerThread;
import com.yandex.go.dto.response.FlexScreenType;
import com.yandex.go.payments.paymentlist.experiments.CardNetwork;
import com.yandex.go.payments.paymentlist.experiments.GPayAllowedCardNetworksExperiment;
import com.yandex.go.places.impl.data.entities.flex.actions.FlexActionWrapper;
import com.yandex.go.places.impl.data.entities.flex.actions.a;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.FiltersAndSortingResponseDto;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.SortDto$$serializer;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.i;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.q;
import com.yandex.go.taxi.order.models.api.response.ContractItem$$serializer;
import com.yandex.go.taxi.order.models.api.response.FreightageContract;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo$ExtraItem$$serializer;
import com.yandex.go.taxi.order.models.api.response.m0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.FooterTicketDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.FooterTicketType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.h;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.delivery.experiments.FormType;
import ru.yandex.taxi.orderforanother.model.FormedFrom;

/* loaded from: classes14.dex */
public final /* synthetic */ class v5r implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ v5r(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = 0;
        switch (this.a) {
            case 0:
                i iVar = FiltersAndSortingResponseDto.Companion;
                return new p53(SortDto$$serializer.INSTANCE, 0);
            case 1:
                i iVar2 = FiltersAndSortingResponseDto.Companion;
                return new p53(q.Companion.serializer(), 0);
            case 2:
                return new p53(h6w.a, 0);
            case 3:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 4:
                return new p53(m2o.a, 0);
            case 5:
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 6:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 7:
                return new oke(qoi0.a(vm50.class), qke.n(new v5e0(qoi0.a(vm50.class), new Annotation[0])), new KSerializer[0]);
            case 8:
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, new p53(auu0Var3, 0), 1);
            case 9:
                a aVar = FlexActionWrapper.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 10:
                return vez0.g("com.yandex.go.dto.response.FlexScreenType", FlexScreenType.values(), new String[]{"intercity"}, new Annotation[][]{null});
            case 11:
                h hVar = FooterTicketDto.Companion;
                return FooterTicketType.Companion.serializer();
            case 12:
                h hVar2 = FooterTicketDto.Companion;
                return new p53(auu0.a, 0);
            case 13:
                return vez0.g("com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.FooterTicketType", FooterTicketType.values(), new String[]{"masstransit", "aeroexpress", "suburban", null}, new Annotation[][]{null, null, null, null});
            case 14:
                return new o4o("com.yandex.go.taxi.summary.models.ForceTariffSwitchForIntercityOrdersExperiment.AfterSwitchToTariffAction.OpenIntercityMain", d2s.INSTANCE, new Annotation[0]);
            case 15:
                return new o4o("com.yandex.go.taxi.summary.models.ForceTariffSwitchForIntercityOrdersExperiment.AfterSwitchToTariffAction.Serializer", e2s.INSTANCE, new Annotation[0]);
            case 16:
                return vez0.g("ru.yandex.taxi.delivery.experiments.FormType", FormType.values(), new String[]{"short", "reduced", "full", "minimal", null}, new Annotation[][]{null, null, null, null, null});
            case 17:
                return vez0.g("ru.yandex.taxi.common_models.net.FormattedText.LineThroughStyle", FormattedText.LineThroughStyle.values(), new String[]{"default", "diagonally"}, new Annotation[][]{null, null});
            case 18:
                return vez0.g("ru.yandex.taxi.orderforanother.model.FormedFrom", FormedFrom.values(), new String[]{"DIALOG", "REQUIREMENTS", null}, new Annotation[][]{null, null, null});
            case 19:
                return new oke(qoi0.a(u1m.class), null, new KSerializer[0]);
            case 20:
                return new oke(qoi0.a(ywl.class), null, new KSerializer[0]);
            case 21:
                return new t8j0();
            case 22:
                return new HandlerThread("FrameRenderDataCollectorThread");
            case 23:
                m0 m0Var = FreightageContract.Companion;
                return new p53(ContractItem$$serializer.INSTANCE, 0);
            case 24:
                m0 m0Var2 = FreightageContract.Companion;
                return new p53(OrderStatusInfo$ExtraItem$$serializer.INSTANCE, 0);
            case 25:
                return new ins(null, new fns(null, null), null, null, null, null);
            case 26:
                return new cos(i);
            case 27:
                return new cps(null, new zos(null, null), null, null, null, null);
            case 28:
                return new t8j0();
            default:
                com.yandex.go.payments.paymentlist.experiments.h hVar3 = GPayAllowedCardNetworksExperiment.Companion;
                return jsq0.Companion.serializer(CardNetwork.Companion.serializer());
        }
    }
}
