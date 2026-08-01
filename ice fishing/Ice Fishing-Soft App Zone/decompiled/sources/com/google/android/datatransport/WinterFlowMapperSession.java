package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowMapperSession extends RuntimeException {
    public final WinterFlowAdapterEntity WinterFlowVariableVersionControl;

    public WinterFlowMapperSession(WinterFlowAdapterEntity winterFlowAdapterEntity) {
        this.WinterFlowVariableVersionControl = winterFlowAdapterEntity;
        if (winterFlowAdapterEntity.WinterFlowHookDataSource) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = winterFlowAdapterEntity.WinterFlowRouterStructure;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            WinterFlowProviderService winterFlowProviderService = (WinterFlowProviderService) list.get(i);
            int i3 = winterFlowProviderService.WinterFlowRouterStructure;
            int i4 = 0;
            while (true) {
                if (i4 >= 9) {
                    i4 = -1;
                    break;
                } else if (i3 == iArr[i4]) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                if (winterFlowProviderService.WinterFlowRouterStructure == 100) {
                    int i5 = i + 2;
                    if (i5 < size && ((WinterFlowProviderService) list.get(i5)).WinterFlowRouterStructure == 1000) {
                        break;
                    } else {
                        WinterFlowEventEmitterNode.WinterFlowCacheManagerException(arrayList);
                    }
                } else {
                    arrayList.add(winterFlowProviderService);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i6 = 0; i6 < size2; i6++) {
            stackTraceElementArr[i6] = new StackTraceElement("$$compose", "m$" + ((WinterFlowProviderService) arrayList.get(i6)).WinterFlowRouterStructure, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        WinterFlowAdapterEntity winterFlowAdapterEntity = this.WinterFlowVariableVersionControl;
        if (!winterFlowAdapterEntity.WinterFlowHookDataSource) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        WinterFlowUserManagerResolver WinterFlowBatchUI = WinterFlowUnitTestLibrary.WinterFlowBatchUI();
        List list = winterFlowAdapterEntity.WinterFlowRouterStructure;
        list.getClass();
        WinterFlowWebsocketEngine winterFlowWebsocketEngine = new WinterFlowWebsocketEngine(list);
        int WinterFlowRouterStructure = winterFlowWebsocketEngine.WinterFlowRouterStructure();
        for (int i = 0; i < WinterFlowRouterStructure; i++) {
            ((WinterFlowProviderService) winterFlowWebsocketEngine.get(i)).getClass();
        }
        WinterFlowUserManagerResolver WinterFlowServerProtocol = WinterFlowUnitTestLibrary.WinterFlowServerProtocol(WinterFlowBatchUI);
        WinterFlowServerProtocol.getClass();
        WinterFlowWebsocketEngine winterFlowWebsocketEngine2 = new WinterFlowWebsocketEngine(WinterFlowServerProtocol);
        int WinterFlowRouterStructure2 = winterFlowWebsocketEngine2.WinterFlowRouterStructure();
        for (int i2 = 0; i2 < WinterFlowRouterStructure2; i2++) {
            String str = (String) winterFlowWebsocketEngine2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
