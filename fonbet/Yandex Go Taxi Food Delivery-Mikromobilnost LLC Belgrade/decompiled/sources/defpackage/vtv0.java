package defpackage;

import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction;
import com.yandex.go.superapp.discovery.map.impl.experiments.d;
import com.yandex.go.superapp.discovery.map.impl.experiments.e;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class vtv0 extends lnt {
    public static final vtv0 f = new vtv0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, e.INSTANCE.serializer(), qoi0.a(e.class));
    }

    @Override // defpackage.h9
    public final List f() {
        SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType = SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType.OPEN_ORGANIZATIONS_ACTION;
        f9 f9Var = new f9((String) h().invoke(superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType), SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction.Companion.serializer(), qoi0.a(SuperAppDiscoveryMapExperiment$CategoryFilterAction$OpenOrganizationsAction.class));
        SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType2 = SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType.OPEN_SERVICE_ACTION;
        return Arrays.asList(f9Var, new f9((String) h().invoke(superAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType2), d.INSTANCE.serializer(), qoi0.a(d.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return SuperAppDiscoveryMapExperiment$CategoryFilterAction$CategoryFilterActionType.Companion.serializer();
    }
}
