package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowResolverFunction implements WinterFlowWorkerModule {
    public boolean WinterFlowHookDataSource;
    public final WinterFlowPackageEntity WinterFlowRouterStructure;

    public WinterFlowResolverFunction(WinterFlowPackageEntity winterFlowPackageEntity) {
        this.WinterFlowRouterStructure = winterFlowPackageEntity;
    }

    @Override // com.google.android.datatransport.WinterFlowWorkerModule
    public final WinterFlowTransactionPlatform WinterFlowArrayNetwork(WinterFlowNodeException winterFlowNodeException, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            WinterFlowViewTesting WinterFlowVariableVersionControl = ((WinterFlowRuntimeVersion) list.get(i3)).WinterFlowVariableVersionControl(j);
            i = Math.max(i, WinterFlowVariableVersionControl.WinterFlowVariableVersionControl);
            i2 = Math.max(i2, WinterFlowVariableVersionControl.WinterFlowTransactionManagerStrategy);
            arrayList.add(WinterFlowVariableVersionControl);
        }
        boolean WinterFlowServiceUtility = winterFlowNodeException.WinterFlowServiceUtility();
        WinterFlowPackageEntity winterFlowPackageEntity = this.WinterFlowRouterStructure;
        if (WinterFlowServiceUtility) {
            this.WinterFlowHookDataSource = true;
            winterFlowPackageEntity.WinterFlowRouterStructure.setValue(new WinterFlowJavaEntity((i2 & 4294967295L) | (i << 32)));
        } else if (!this.WinterFlowHookDataSource) {
            winterFlowPackageEntity.WinterFlowRouterStructure.setValue(new WinterFlowJavaEntity((i2 & 4294967295L) | (i << 32)));
        }
        return winterFlowNodeException.WinterFlowThreadListener(i, i2, WinterFlowFrontendNode.WinterFlowVariableVersionControl, new WinterFlowConfigurationTool(1, arrayList));
    }
}
