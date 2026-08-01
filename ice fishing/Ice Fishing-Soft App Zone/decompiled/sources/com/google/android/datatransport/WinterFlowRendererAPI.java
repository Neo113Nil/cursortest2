package com.google.android.datatransport;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRendererAPI {
    public final HashMap WinterFlowHookDataSource;
    public final HashMap WinterFlowRouterStructure = new HashMap();

    public WinterFlowRendererAPI(HashMap hashMap) {
        this.WinterFlowHookDataSource = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            WinterFlowMicroserviceProcess winterFlowMicroserviceProcess = (WinterFlowMicroserviceProcess) entry.getValue();
            List list = (List) this.WinterFlowRouterStructure.get(winterFlowMicroserviceProcess);
            if (list == null) {
                list = new ArrayList();
                this.WinterFlowRouterStructure.put(winterFlowMicroserviceProcess, list);
            }
            list.add((WinterFlowVersionControlDeserialization) entry.getKey());
        }
    }

    public static void WinterFlowRouterStructure(List list, WinterFlowDecoratorVersion winterFlowDecoratorVersion, WinterFlowMicroserviceProcess winterFlowMicroserviceProcess, WinterFlowClassDecorator winterFlowClassDecorator) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                WinterFlowVersionControlDeserialization winterFlowVersionControlDeserialization = (WinterFlowVersionControlDeserialization) list.get(size);
                Method method = winterFlowVersionControlDeserialization.WinterFlowHookDataSource;
                try {
                    int i = winterFlowVersionControlDeserialization.WinterFlowRouterStructure;
                    if (i == 0) {
                        method.invoke(winterFlowClassDecorator, null);
                    } else if (i == 1) {
                        method.invoke(winterFlowClassDecorator, winterFlowDecoratorVersion);
                    } else if (i == 2) {
                        method.invoke(winterFlowClassDecorator, winterFlowDecoratorVersion, winterFlowMicroserviceProcess);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
