package com.google.android.datatransport;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowGatewaySerializer {
    public final ArrayList WinterFlowCacheManagerAgent;
    public final ArrayList WinterFlowHookDataSource;
    public final ViewGroup WinterFlowRouterStructure;

    public WinterFlowGatewaySerializer(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.WinterFlowRouterStructure = viewGroup;
        this.WinterFlowHookDataSource = new ArrayList();
        this.WinterFlowCacheManagerAgent = new ArrayList();
    }

    public final void WinterFlowRouterStructure(ArrayList arrayList) {
        if (arrayList.size() > 0) {
            throw null;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((WinterFlowTestingEventEmitter) obj).getClass();
            WinterFlowEventEmitterNode.WinterFlowVariableInterface(arrayList2, null);
        }
        List WinterFlowProtocolConsumer = WinterFlowSerializerUtility.WinterFlowProtocolConsumer(WinterFlowSerializerUtility.WinterFlowDatabaseSchemaUtility(arrayList2));
        int size2 = WinterFlowProtocolConsumer.size();
        for (int i2 = 0; i2 < size2; i2++) {
            WinterFlowCacheConfiguration winterFlowCacheConfiguration = (WinterFlowCacheConfiguration) WinterFlowProtocolConsumer.get(i2);
            winterFlowCacheConfiguration.getClass();
            ViewGroup viewGroup = this.WinterFlowRouterStructure;
            viewGroup.getClass();
            if (!winterFlowCacheConfiguration.WinterFlowRouterStructure) {
                winterFlowCacheConfiguration.WinterFlowHookDataSource(viewGroup);
            }
            winterFlowCacheConfiguration.WinterFlowRouterStructure = true;
        }
    }
}
