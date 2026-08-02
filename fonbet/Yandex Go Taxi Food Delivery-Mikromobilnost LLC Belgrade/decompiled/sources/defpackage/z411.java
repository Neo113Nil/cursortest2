package defpackage;

import com.yandex.go.masstransit.sdk.client_api.data.dto.CommandDto$$serializer;
import com.yandex.go.masstransit.sdk.client_api.data.dto.TripUpdateRequestDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.j0;
import com.yandex.go.places.models.data.entities.network.TriggerActionDto;
import com.yandex.go.places.models.data.entities.network.TriggerDto;
import com.yandex.go.places.models.data.entities.network.d0;
import com.yandex.go.places.models.data.entities.network.s;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportCubeIconBackgroundType;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportRouteSection;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.TransportRouteSection$Cube$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.a1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.z0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorOptionDto$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.TransportSelectorPayloadDto;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.t2;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.data.entities.network.l;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.Trigger;

/* loaded from: classes14.dex */
public final /* synthetic */ class z411 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ z411(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new p53(hbi0.a, 0);
            case 1:
                return new p53(ibi0.a, 0);
            case 2:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 3:
                return new oke(qoi0.a(vm50.class), new v5e0(qoi0.a(vm50.class), new Annotation[0]), new KSerializer[0]);
            case 4:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 5:
                return new oke(qoi0.a(vm50.class), new v5e0(qoi0.a(vm50.class), new Annotation[0]), new KSerializer[0]);
            case 6:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 7:
                return new oke(qoi0.a(vm50.class), new v5e0(qoi0.a(vm50.class), new Annotation[0]), new KSerializer[0]);
            case 8:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 9:
                return new oke(qoi0.a(vm50.class), new v5e0(qoi0.a(vm50.class), new Annotation[0]), new KSerializer[0]);
            case 10:
                z0 z0Var = TransportRouteSection.Companion;
                return new p53(TransportRouteSection$Cube$$serializer.INSTANCE, 0);
            case 11:
                a1 a1Var = TransportRouteSection.Cube.Companion;
                return TransportCubeIconBackgroundType.Companion.serializer();
            case 12:
                t2 t2Var = TransportSelectorPayloadDto.Companion;
                return new p53(TransportSelectorOptionDto$$serializer.INSTANCE, 0);
            case 13:
                return new p53(sb51.a, 0);
            case 14:
                return new p53(tb51.a, 0);
            case 15:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 16:
                return new oke(qoi0.a(vm50.class), new v5e0(qoi0.a(vm50.class), new Annotation[0]), new KSerializer[0]);
            case 17:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 18:
                return new oke(qoi0.a(vm50.class), new v5e0(qoi0.a(vm50.class), new Annotation[0]), new KSerializer[0]);
            case 19:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "TransportingStateViewPresenter");
            case 20:
                uc11 uc11Var = vc11.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 21:
                return new o4o("ru.yandex.taxi.notifications.tips.TransportingTipsNotificationExperiment.ButtonDto.Unknown", sc11.INSTANCE, new Annotation[0]);
            case 22:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.Trigger", Trigger.values(), new String[]{"select", "tap", "drag", "show", null}, new Annotation[][]{new Annotation[]{new i6z(new String[]{"choose"}, 2)}, null, null, null, null});
            case 23:
                return new oke(qoi0.a(v5x.class), null, new KSerializer[0]);
            case 24:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 25:
                d0 d0Var = TriggerActionDto.Companion;
                return TriggerDto.Companion.serializer();
            case 26:
                d0 d0Var2 = TriggerActionDto.Companion;
                return new p53(s.Companion.serializer(), 0);
            case 27:
                return vez0.g("com.yandex.go.places.models.data.entities.network.TriggerDto", TriggerDto.values(), new String[]{"show", "tap", null}, new Annotation[][]{null, null, null});
            case 28:
                j0 j0Var = TripUpdateRequestDto.Companion;
                return new p53(CommandDto$$serializer.INSTANCE, 0);
            default:
                l lVar = TrustedContactDto.Companion;
                return new p53(auu0.a, 0);
        }
    }
}
