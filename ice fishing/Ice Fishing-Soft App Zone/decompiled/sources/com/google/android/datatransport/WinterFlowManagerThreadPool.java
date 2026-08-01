package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowManagerThreadPool extends RuntimeException {
    public final int WinterFlowRouterRouter;
    public final WinterFlowMicroserviceFunction WinterFlowTransactionManagerStrategy;
    public final WinterFlowTransactionStructure WinterFlowUnitTestResponse;
    public final WinterFlowMicroserviceFunction WinterFlowVariableVersionControl;

    public WinterFlowManagerThreadPool(WinterFlowMicroserviceFunction winterFlowMicroserviceFunction, WinterFlowMicroserviceFunction winterFlowMicroserviceFunction2, WinterFlowTransactionStructure winterFlowTransactionStructure, int i, Exception exc) {
        super(exc);
        this.WinterFlowVariableVersionControl = winterFlowMicroserviceFunction;
        this.WinterFlowTransactionManagerStrategy = winterFlowMicroserviceFunction2;
        this.WinterFlowUnitTestResponse = winterFlowTransactionStructure;
        this.WinterFlowRouterRouter = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List list;
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.WinterFlowRouterRouter);
        sb.append(":\n            |");
        WinterFlowAPIProcess WinterFlowVariableVersionControl = WinterFlowConfigurationException.WinterFlowVariableVersionControl(new WinterFlowPipelineTool(this, null));
        if (WinterFlowVariableVersionControl.hasNext()) {
            Object next = WinterFlowVariableVersionControl.next();
            if (WinterFlowVariableVersionControl.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (WinterFlowVariableVersionControl.hasNext()) {
                    arrayList.add(WinterFlowVariableVersionControl.next());
                }
                list = arrayList;
            } else {
                list = WinterFlowUnitTestLibrary.WinterFlowCacheManagerListener(next);
            }
        } else {
            list = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        }
        int size = list.size();
        if (50 >= size) {
            collection = WinterFlowSerializerUtility.WinterFlowProtocolConsumer(list);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (list instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(list.get(i));
                }
            } else {
                ListIterator listIterator = list.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            collection = arrayList2;
        }
        sb.append(WinterFlowSerializerUtility.WinterFlowHookQuery(collection, "\n", null, null, null, 62));
        sb.append("\n            ");
        return WinterFlowEventUtility.WinterFlowSerializerStructure(sb.toString());
    }
}
