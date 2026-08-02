package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.go.flex.common.api.actions.TaxiRouteInputAction;
import com.yandex.go.flex.common.api.actions.t0;
import com.yandex.go.multimodal_route.network.models.TaxiTransportInfoResponseDto;
import com.yandex.go.multimodal_route.network.models.s;
import com.yandex.go.shortcuts.dto.response.TextStyleDto;
import com.yandex.go.shortcuts.dto.response.ThumbStackItem;
import com.yandex.go.shortcuts.dto.response.u2;
import com.yandex.go.shortcuts.dto.response.x2;
import com.yandex.go.taxi.order.experiments.m;
import com.yandex.go.taxi.order.experiments.q;
import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse;
import com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse$TrackPoint$$serializer;
import com.yandex.go.taxi.order.net.taxi.dto.response.a;
import com.yandex.go.taxi.order.net.taxi.dto.response.c;
import com.yandex.go.taxi.order.net.taxi.dto.response.d;
import com.yandex.go.taxi.order.net.taxi.dto.response.e;
import com.yandex.go.taxi.order.net.taxi.dto.response.f;
import com.yandex.go.taxi.order.net.taxi.dto.response.i;
import com.yandex.go.telemetry.experiment.TelemetryReportConfigExperiment;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.summary.promotions.models.TextAlign;
import ru.yandex.taxi.surge.models.dto.TextBlockSize;

/* loaded from: classes14.dex */
public final /* synthetic */ class y6y0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ y6y0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        long j = 0;
        switch (this.a) {
            case 0:
                return "trackingBottomContainer";
            case 1:
                return "Failed to convert formatted text for OrderViewHolder";
            case 2:
                return "Error while loading icon";
            case 3:
                t0 t0Var = TaxiRouteInputAction.AdditionalAction.Companion;
                return vez0.g("com.yandex.go.flex.common.api.actions.TaxiRouteInputAction.AdditionalActionType", TaxiRouteInputAction.AdditionalActionType.values(), new String[]{"preorder", "order_to_another", "none"}, new Annotation[][]{null, null, null});
            case 4:
                a aVar = TaxiRouteResponse.Companion;
                return new p53(TaxiRouteResponse$TrackPoint$$serializer.INSTANCE, 0);
            case 5:
                d dVar = TaxiRouteResponse.DriverPath.Companion;
                return new p53(TaxiRouteResponse$TrackPoint$$serializer.INSTANCE, 0);
            case 6:
                c cVar = TaxiRouteResponse.DriverPath.ActiveRoute.Companion;
                return new p53(qke.n(b0t.a), 0);
            case 7:
                return new o4o("com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse.DriverRouteGeometry.Previous", e.INSTANCE, new Annotation[0]);
            case 8:
                return new o4o("com.yandex.go.taxi.order.net.taxi.dto.response.TaxiRouteResponse.DriverRouteGeometry.Unknown", f.INSTANCE, new Annotation[0]);
            case 9:
                i iVar = TaxiRouteResponse.DriverRouteGeometryPolyline.Companion;
                return new p53(e6m.a, 0);
            case 10:
                i iVar2 = TaxiRouteResponse.DriverRouteGeometryPolyline.Companion;
                return new p53(e6m.a, 0);
            case 11:
                s sVar = TaxiTransportInfoResponseDto.Companion;
                return new p53(auu0.a, 0);
            case 12:
                return new o4o("com.yandex.go.taxi.order.experiments.TaxiTravelerMovementExperiment.BatchProcessingStrategy.Append", pby0.INSTANCE, new Annotation[0]);
            case 13:
                return new o4o("com.yandex.go.taxi.order.experiments.TaxiTravelerMovementExperiment.BatchProcessingStrategy.NewBatchOnly", rby0.INSTANCE, new Annotation[0]);
            case 14:
                return new o4o("com.yandex.go.taxi.order.experiments.TaxiTravelerMovementExperiment.BatchProcessingStrategy.Unknown", tby0.INSTANCE, new Annotation[0]);
            case 15:
                return new o4o("com.yandex.go.taxi.order.experiments.TaxiTravelerMovementExperiment.TurboMode.Strategy.Adaptive", m.INSTANCE, new Annotation[0]);
            case 16:
                return new o4o("com.yandex.go.taxi.order.experiments.TaxiTravelerMovementExperiment.TurboMode.Strategy.Unknown", q.INSTANCE, new Annotation[0]);
            case 17:
                com.yandex.go.telemetry.experiment.a aVar2 = TelemetryReportConfigExperiment.Companion;
                return new p53(auu0.a, 0);
            case 18:
                return new ghy0(null, null, null);
            case 19:
                return vez0.g("ru.yandex.taxi.summary.promotions.models.TextAlign", TextAlign.values(), new String[]{"left", "center", "right"}, new Annotation[][]{null, null, null});
            case 20:
                return vez0.g("ru.yandex.taxi.communications.model.TextAlign", ru.yandex.taxi.communications.model.TextAlign.values(), new String[]{"start", "center"}, new Annotation[][]{null, null});
            case 21:
                return vez0.g("ru.yandex.taxi.surge.models.dto.TextBlockSize", TextBlockSize.values(), new String[]{"XS", "S", "M", "L", null}, new Annotation[][]{null, null, null, null, null});
            case 22:
                qwd qwdVar = jly0.a;
                return null;
            case 23:
                return fq11.a;
            case 24:
                return new z5w(j);
            case 25:
                return new z5w(j);
            case 26:
                u2 u2Var = TextStyleDto.Companion;
                return TextStyleDto.HorizontalAlignment.Companion.serializer();
            case 27:
                return vez0.g("com.yandex.go.shortcuts.dto.response.TextStyleDto.HorizontalAlignment", TextStyleDto.HorizontalAlignment.values(), new String[]{"leading", "center", "trailing"}, new Annotation[][]{null, null, null});
            case 28:
                return new Handler(Looper.getMainLooper());
            default:
                x2 x2Var = ThumbStackItem.Companion;
                return new p53(p0z0.e, 0);
        }
    }
}
