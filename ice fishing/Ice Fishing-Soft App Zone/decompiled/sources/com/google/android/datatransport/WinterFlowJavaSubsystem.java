package com.google.android.datatransport;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
@WinterFlowJavaHelper("dialog")
/* loaded from: classes.dex */
public final class WinterFlowJavaSubsystem extends WinterFlowRendererRenderer {
    @Override // com.google.android.datatransport.WinterFlowRendererRenderer
    public final void WinterFlowArrayNetwork(List list, WinterFlowQueueView winterFlowQueueView) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WinterFlowHookDataSource().WinterFlowTransactionManagerStrategy((WinterFlowLibrarySessionManager) it.next());
        }
    }

    @Override // com.google.android.datatransport.WinterFlowRendererRenderer
    public final WinterFlowServerLayer WinterFlowRouterStructure() {
        WinterFlowEventTool winterFlowEventTool = WinterFlowCacheManagerDeployment.WinterFlowRouterStructure;
        return new WinterFlowProxyWidget(this);
    }

    @Override // com.google.android.datatransport.WinterFlowRendererRenderer
    public final void WinterFlowVariableVersionControl(WinterFlowLibrarySessionManager winterFlowLibrarySessionManager, boolean z) {
        WinterFlowHookDataSource().WinterFlowVariableVersionControl(winterFlowLibrarySessionManager, z);
        int WinterFlowParserPipeline = WinterFlowSerializerUtility.WinterFlowParserPipeline((Iterable) WinterFlowHookDataSource().WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl.getValue(), winterFlowLibrarySessionManager);
        int i = 0;
        for (Object obj : (Iterable) WinterFlowHookDataSource().WinterFlowTransactionManagerStrategy.WinterFlowVariableVersionControl.getValue()) {
            int i2 = i + 1;
            if (i < 0) {
                WinterFlowUnitTestLibrary.WinterFlowProxyStructure();
                throw null;
            }
            WinterFlowLibrarySessionManager winterFlowLibrarySessionManager2 = (WinterFlowLibrarySessionManager) obj;
            if (i > WinterFlowParserPipeline) {
                WinterFlowHookDataSource().WinterFlowCacheManagerAgent(winterFlowLibrarySessionManager2);
            }
            i = i2;
        }
    }
}
