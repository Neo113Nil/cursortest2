package defpackage;

import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment$SearchbarAction$Deeplink;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType;
import com.yandex.go.superapp.discovery.map.impl.experiments.l;
import com.yandex.go.superapp.discovery.map.impl.experiments.n;
import com.yandex.go.superapp.discovery.map.impl.experiments.o;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class ytv0 extends lnt {
    public static final ytv0 f = new ytv0();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, o.INSTANCE.serializer(), qoi0.a(o.class));
    }

    @Override // defpackage.h9
    public final List f() {
        SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType = SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType.CLOSE;
        f9 f9Var = new f9((String) h().invoke(superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType), l.INSTANCE.serializer(), qoi0.a(l.class));
        SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType2 = SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType.SUPERAPP_SEARCH;
        f9 f9Var2 = new f9((String) h().invoke(superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType2), n.INSTANCE.serializer(), qoi0.a(n.class));
        SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType3 = SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType.DEEPLINK;
        return Arrays.asList(f9Var, f9Var2, new f9((String) h().invoke(superAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType3), SuperAppDiscoveryMapExperiment$SearchbarAction$Deeplink.Companion.serializer(), qoi0.a(SuperAppDiscoveryMapExperiment$SearchbarAction$Deeplink.class)));
    }

    @Override // defpackage.n4o
    public final KSerializer g() {
        return SuperAppDiscoveryMapExperiment$SearchbarAction$SearchbarActionType.Companion.serializer();
    }
}
