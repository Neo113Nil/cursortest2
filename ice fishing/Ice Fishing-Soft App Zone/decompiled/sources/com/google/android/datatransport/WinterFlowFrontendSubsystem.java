package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class WinterFlowFrontendSubsystem extends WinterFlowJSONProtocol {
    public static List WinterFlowBandwidthObject(WinterFlowHookTool winterFlowHookTool) {
        Iterator it = winterFlowHookTool.iterator();
        if (!it.hasNext()) {
            return WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static WinterFlowHookTool WinterFlowServiceUtility(Object obj, WinterFlowObjectSession winterFlowObjectSession) {
        return obj == null ? WinterFlowServicePipeline.WinterFlowRouterStructure : new WinterFlowThreadPoolView(new WinterFlowAPISystem(21, obj), winterFlowObjectSession, 1);
    }

    public static WinterFlowHookTool WinterFlowThreadListener(Iterator it) {
        it.getClass();
        return new WinterFlowConfigurationFrontend(new WinterFlowServiceValidator(1, it));
    }
}
