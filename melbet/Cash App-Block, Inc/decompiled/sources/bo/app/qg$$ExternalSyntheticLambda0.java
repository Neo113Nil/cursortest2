package bo.app;

import com.squareup.cash.treehouse.android.RegisteredTreehouseApp;
import com.squareup.cash.treehouse.discover.HostDiscoverDataBridge;
import dev.zacsweers.metro.Provider;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class qg$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Map f$0;

    public /* synthetic */ qg$$ExternalSyntheticLambda0(int i, Map map) {
        this.$r8$classId = i;
        this.f$0 = map;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Map map = this.f$0;
        switch (i) {
            case 0:
                return qg.b(map);
            case 1:
                Object obj = map.get("discover");
                obj.getClass();
                return new HostDiscoverDataBridge(((RegisteredTreehouseApp) ((Provider) obj).invoke()).getTreehouseApp());
            default:
                return CollectionsKt.toSet(map.keySet());
        }
    }
}
