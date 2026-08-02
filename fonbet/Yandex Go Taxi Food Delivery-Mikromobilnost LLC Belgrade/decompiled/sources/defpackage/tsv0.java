package defpackage;

import com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenDocumentLoaderExperiment;
import com.yandex.go.flex.main_screen.shared_data.SuperAppGrid;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppConfigMenuExperiment;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppMainScreenLogoImageExperiment;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.c;
import com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment;
import com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment$ElementBehaviour$$serializer;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment$CategoryFilter$$serializer;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType;
import com.yandex.go.superapp.discovery.map.impl.experiments.b;
import com.yandex.go.superapp.discovery.map.impl.experiments.d;
import com.yandex.go.superapp.discovery.map.impl.experiments.e;
import com.yandex.go.superapp.discovery.map.impl.experiments.h;
import com.yandex.go.superapp.discovery.map.impl.experiments.i;
import com.yandex.go.superapp.discovery.map.impl.experiments.transport.SuperAppDiscoveryMapTransportExperiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.transport.SuperAppDiscoveryMapTransportExperiment$TransportModeScreenConfig$$serializer;
import com.yandex.go.superapp.discovery.map.impl.experiments.transport.a;
import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment;
import com.yandex.go.superapp.order_tracking.common.experiments.SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService;
import java.lang.annotation.Annotation;

/* loaded from: classes.dex */
public final /* synthetic */ class tsv0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ tsv0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                c cVar = SuperAppConfigMenuExperiment.Companion;
                return SuperAppConfigMenuExperiment.MenuIconType.Companion.serializer();
            case 1:
                return vez0.g("com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppConfigMenuExperiment.MenuIconType", SuperAppConfigMenuExperiment.MenuIconType.values(), new String[]{"avatar", "hamburger", "floating_avatar"}, new Annotation[][]{null, null, null});
            case 2:
                h hVar = SuperAppDiscoveryMapExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 3:
                b bVar = SuperAppDiscoveryMapExperiment.CategoryFilter.Companion;
                return SuperAppDiscoveryMapExperiment.CategoryFilterType.Companion.serializer();
            case 4:
                return vez0.g("com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment.CategoryFilterAction.CategoryFilterActionType", SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType.values(), new String[]{"openOrganizationsAction", "openServiceAction", null}, new Annotation[][]{null, null, null});
            case 5:
                return new o4o("com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment.CategoryFilterAction.OpenServiceAction", d.INSTANCE, new Annotation[0]);
            case 6:
                return new o4o("com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment.CategoryFilterAction.Unknown", e.INSTANCE, new Annotation[0]);
            case 7:
                return vez0.g("com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment.CategoryFilterType", SuperAppDiscoveryMapExperiment.CategoryFilterType.values(), new String[]{"chargers", "scooters", "transport", "favourites", "category", null}, new Annotation[][]{null, null, null, null, null, null});
            case 8:
                i iVar = SuperAppDiscoveryMapExperiment.ScreenOptions.Companion;
                return new p53(SuperAppDiscoveryMapExperiment$CategoryFilter$$serializer.INSTANCE, 0);
            case 9:
                a aVar = SuperAppDiscoveryMapTransportExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 10:
                a aVar2 = SuperAppDiscoveryMapTransportExperiment.Companion;
                return new k8u(auu0.a, SuperAppDiscoveryMapTransportExperiment$TransportModeScreenConfig$$serializer.INSTANCE, 1);
            case 11:
                com.yandex.go.superapp.discovery.map.impl.experiments.transport.b bVar2 = SuperAppDiscoveryMapTransportExperiment.TransportModeScreenConfig.Companion;
                return new k8u(auu0.a, t231.a, 1);
            case 12:
                com.yandex.go.superapp.discovery.map.impl.experiments.transport.b bVar3 = SuperAppDiscoveryMapTransportExperiment.TransportModeScreenConfig.Companion;
                return new p53(qiu0.a, 0);
            case 13:
                qzv0 qzv0Var = szv0.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 14:
                qzv0 qzv0Var2 = szv0.Companion;
                return new p53(swq0.a, 0);
            case 15:
                com.yandex.go.mainscreen.superapp.popup.data.experiments.a aVar3 = SuperAppFallbackBehaviourExperiment.Companion;
                return jsq0.Companion.serializer(SuperAppFallbackBehaviourExperiment.State.Companion.serializer());
            case 16:
                com.yandex.go.mainscreen.superapp.popup.data.experiments.a aVar4 = SuperAppFallbackBehaviourExperiment.Companion;
                return new p53(SuperAppFallbackBehaviourExperiment$ElementBehaviour$$serializer.INSTANCE, 0);
            case 17:
                com.yandex.go.mainscreen.superapp.popup.data.experiments.a aVar5 = SuperAppFallbackBehaviourExperiment.Companion;
                return new p53(SuperAppFallbackBehaviourExperiment$ElementBehaviour$$serializer.INSTANCE, 0);
            case 18:
                com.yandex.go.mainscreen.superapp.popup.data.experiments.a aVar6 = SuperAppFallbackBehaviourExperiment.Companion;
                return new p53(SuperAppFallbackBehaviourExperiment$ElementBehaviour$$serializer.INSTANCE, 0);
            case 19:
                com.yandex.go.mainscreen.superapp.popup.data.experiments.a aVar7 = SuperAppFallbackBehaviourExperiment.Companion;
                return new p53(SuperAppFallbackBehaviourExperiment$ElementBehaviour$$serializer.INSTANCE, 0);
            case 20:
                com.yandex.go.mainscreen.superapp.popup.data.experiments.a aVar8 = SuperAppFallbackBehaviourExperiment.Companion;
                return new p53(SuperAppFallbackBehaviourExperiment$ElementBehaviour$$serializer.INSTANCE, 0);
            case 21:
                com.yandex.go.mainscreen.superapp.popup.data.experiments.a aVar9 = SuperAppFallbackBehaviourExperiment.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(auu0Var4, auu0Var4, 1);
            case 22:
                com.yandex.go.mainscreen.superapp.popup.data.experiments.b bVar4 = SuperAppFallbackBehaviourExperiment.ElementBehaviour.Companion;
                return jsq0.Companion.serializer(SuperAppFallbackBehaviourExperiment.State.Companion.serializer());
            case 23:
                return vez0.g("com.yandex.go.mainscreen.superapp.popup.data.experiments.SuperAppFallbackBehaviourExperiment.State", SuperAppFallbackBehaviourExperiment.State.values(), new String[]{"loading_with_taxi", "failure_with_taxi", "retry_with_taxi", "loading_no_taxi", "failure_no_taxi", "retry_no_taxi", "no_network_connection_no_taxi", "no_network_connection_with_taxi"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 24:
                com.yandex.go.flex.main_screen.shared_data.d dVar = SuperAppGrid.Companion;
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
            case 25:
                com.yandex.go.flex.main_screen.experiments.d dVar2 = SuperAppMainScreenDocumentLoaderExperiment.Companion;
                return SuperAppMainScreenDocumentLoaderExperiment.Type.Companion.serializer();
            case 26:
                return vez0.g("com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenDocumentLoaderExperiment.Type", SuperAppMainScreenDocumentLoaderExperiment.Type.values(), new String[]{"default", "linked"}, new Annotation[][]{null, null});
            case 27:
                com.yandex.go.mainscreen.superapp.impl.header.experiment.e eVar = SuperAppMainScreenLogoImageExperiment.Companion;
                auu0 auu0Var6 = auu0.a;
                return new k8u(auu0Var6, auu0Var6, 1);
            case 28:
                com.yandex.go.superapp.order_tracking.common.experiments.a aVar10 = SuperAppOrderTrackingExperiment.Companion;
                return new p53(x5w0.e, 0);
            default:
                com.yandex.go.superapp.order_tracking.common.experiments.b bVar5 = SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService.Companion;
                return SuperAppOrderTrackingExperiment$OrderService$ExternalOrderService.PreferredTrackingType.Companion.serializer();
        }
    }
}
