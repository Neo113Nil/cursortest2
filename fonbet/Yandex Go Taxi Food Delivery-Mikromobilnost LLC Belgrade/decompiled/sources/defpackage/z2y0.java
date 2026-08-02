package defpackage;

import com.yandex.go.shortcuts.dto.request.SavedPlace$$serializer;
import com.yandex.go.taxi.order.feed.data.mapper.TaxiOrderToDocumentBodyMapper$UserLocations;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.models.api.TaxiOrderOverrides;
import com.yandex.go.taxi.order.models.api.TaxiOrderPendingChanges;
import com.yandex.go.taxi.order.models.api.cost_center.CostCenterParam$$serializer;
import com.yandex.go.taxi.order.models.api.e;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.go.taxi.order.models.api.feedback.b;
import com.yandex.go.taxi.order.models.api.j;
import com.yandex.go.taxi.order.models.api.k;
import com.yandex.go.taxi.order.models.api.l;
import com.yandex.go.taxi.order.models.api.objects.OrderForegroundNotificationOverrides$$serializer;
import com.yandex.go.taxi.order.models.api.status.OrderStatusWindowNotification$$serializer;
import com.yandex.go.taxi.order.perf.experiment.TaxiOrderPerfTweaksExperiment;
import com.yandex.go.taxi.order.perf.experiment.a;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final /* synthetic */ class z2y0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ z2y0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                j jVar = TaxiOrderLocalData.Companion;
                return DriveState.Companion.serializer();
            case 1:
                j jVar2 = TaxiOrderLocalData.Companion;
                return new p53(auu0.a, 1);
            case 2:
                j jVar3 = TaxiOrderLocalData.Companion;
                return new p53(auu0.a, 1);
            case 3:
                j jVar4 = TaxiOrderLocalData.Companion;
                return DriveState.Companion.serializer();
            case 4:
                j jVar5 = TaxiOrderLocalData.Companion;
                return new p53(auu0.a, 1);
            case 5:
                j jVar6 = TaxiOrderLocalData.Companion;
                return new p53(DriveState.Companion.serializer(), 1);
            case 6:
                j jVar7 = TaxiOrderLocalData.Companion;
                return new k8u(auu0.a, OrderStatusWindowNotification$$serializer.INSTANCE, 1);
            case 7:
                j jVar8 = TaxiOrderLocalData.Companion;
                return DriveState.Companion.serializer();
            case 8:
                j jVar9 = TaxiOrderLocalData.Companion;
                return new p53(auu0.a, 1);
            case 9:
                j jVar10 = TaxiOrderLocalData.Companion;
                return new k8u(auu0.a, OrderForegroundNotificationOverrides$$serializer.INSTANCE, 1);
            case 10:
                j jVar11 = TaxiOrderLocalData.Companion;
                return new k8u(auu0.a, h6w.a, 1);
            case 11:
                j jVar12 = TaxiOrderLocalData.Companion;
                return new p53(auu0.a, 1);
            case 12:
                j jVar13 = TaxiOrderLocalData.Companion;
                return new p53(auu0.a, 1);
            case 13:
                return "Unsupported sender role role for text message";
            case 14:
                k kVar = TaxiOrderOverrides.Companion;
                return DriveState.Companion.serializer();
            case 15:
                l lVar = TaxiOrderPendingChanges.Companion;
                return new p53(CostCenterParam$$serializer.INSTANCE, 0);
            case 16:
                l lVar2 = TaxiOrderPendingChanges.Companion;
                return new p53(qke.n(e.Companion.serializer()), 0);
            case 17:
                a aVar = TaxiOrderPerfTweaksExperiment.Companion;
                return TaxiOrderPerfTweaksExperiment.DelayType.Companion.serializer();
            case 18:
                a aVar2 = TaxiOrderPerfTweaksExperiment.Companion;
                return TaxiOrderPerfTweaksExperiment.DelayType.Companion.serializer();
            case 19:
                a aVar3 = TaxiOrderPerfTweaksExperiment.Companion;
                return TaxiOrderPerfTweaksExperiment.DelayType.Companion.serializer();
            case 20:
                a aVar4 = TaxiOrderPerfTweaksExperiment.Companion;
                return TaxiOrderPerfTweaksExperiment.DelayType.Companion.serializer();
            case 21:
                a aVar5 = TaxiOrderPerfTweaksExperiment.Companion;
                return TaxiOrderPerfTweaksExperiment.DelayType.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.taxi.order.perf.experiment.TaxiOrderPerfTweaksExperiment.DelayType", TaxiOrderPerfTweaksExperiment.DelayType.values(), new String[]{"fcp", "lcp_defaults", "lcp"}, new Annotation[][]{null, null, null});
            case 23:
                return "We got more than one client message in response";
            case 24:
                b bVar = TaxiOrderSelectedTipsChoiceState.Companion;
                return TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.Companion.serializer();
            case 25:
                b bVar2 = TaxiOrderSelectedTipsChoiceState.Companion;
                return TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.Companion.serializer();
            case 26:
                return vez0.g("com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType", TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.values(), new String[]{"value_choice", "custom_choice", "preferred_choice", "zero_choice"}, new Annotation[][]{null, null, null, null});
            case 27:
                return vez0.g("com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType", TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.values(), new String[]{"flat", "percent"}, new Annotation[][]{null, null});
            case 28:
                com.yandex.go.taxi.order.models.api.feedback.e eVar = TaxiOrderTipsState.Companion;
                return new p53(auu0.a, 0);
            default:
                com.yandex.go.taxi.order.feed.data.mapper.b bVar3 = TaxiOrderToDocumentBodyMapper$UserLocations.Companion;
                return new p53(SavedPlace$$serializer.INSTANCE, 0);
        }
    }
}
