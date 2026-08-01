package com.google.android.datatransport;

import java.util.Iterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDecoratorBackend implements WinterFlowXMLInterface, Iterable, WinterFlowLoaderProcess {
    public boolean WinterFlowRouterRouter;
    public WinterFlowSessionEngine WinterFlowTransactionManagerStrategy;
    public boolean WinterFlowUnitTestResponse;
    public final WinterFlowDatabaseSchemaStructure WinterFlowVariableVersionControl;

    public WinterFlowDecoratorBackend() {
        long[] jArr = WinterFlowDatabaseSchemaUtility.WinterFlowRouterStructure;
        this.WinterFlowVariableVersionControl = new WinterFlowDatabaseSchemaStructure();
    }

    public final Object WinterFlowArrayNetwork(WinterFlowRendererOrchestration winterFlowRendererOrchestration) {
        Object WinterFlowUnitTestResponse = this.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(winterFlowRendererOrchestration);
        if (WinterFlowUnitTestResponse != null) {
            return WinterFlowUnitTestResponse;
        }
        throw new IllegalStateException("Key not present: " + winterFlowRendererOrchestration + " - consider getOrElse or getOrNull");
    }

    public final WinterFlowDecoratorBackend WinterFlowCacheManagerAgent() {
        WinterFlowDecoratorBackend winterFlowDecoratorBackend = new WinterFlowDecoratorBackend();
        winterFlowDecoratorBackend.WinterFlowUnitTestResponse = this.WinterFlowUnitTestResponse;
        winterFlowDecoratorBackend.WinterFlowRouterRouter = this.WinterFlowRouterRouter;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowVariableVersionControl;
        Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource;
        Object[] objArr2 = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
        long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowThreadListener(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return winterFlowDecoratorBackend;
    }

    @Override // com.google.android.datatransport.WinterFlowXMLInterface
    public final void WinterFlowRouterStructure(WinterFlowRendererOrchestration winterFlowRendererOrchestration, Object obj) {
        boolean z = obj instanceof WinterFlowDecoratorStrategy;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowVariableVersionControl;
        if (z && winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration)) {
            Object WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(winterFlowRendererOrchestration);
            WinterFlowUnitTestResponse.getClass();
            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy = (WinterFlowDecoratorStrategy) WinterFlowUnitTestResponse;
            WinterFlowDecoratorStrategy winterFlowDecoratorStrategy2 = (WinterFlowDecoratorStrategy) obj;
            String str = winterFlowDecoratorStrategy2.WinterFlowRouterStructure;
            if (str == null) {
                str = winterFlowDecoratorStrategy.WinterFlowRouterStructure;
            }
            WinterFlowOrchestrationIDE winterFlowOrchestrationIDE = winterFlowDecoratorStrategy2.WinterFlowHookDataSource;
            if (winterFlowOrchestrationIDE == null) {
                winterFlowOrchestrationIDE = winterFlowDecoratorStrategy.WinterFlowHookDataSource;
            }
            winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(winterFlowRendererOrchestration, new WinterFlowDecoratorStrategy(str, winterFlowOrchestrationIDE));
        } else {
            winterFlowDatabaseSchemaStructure.WinterFlowThreadListener(winterFlowRendererOrchestration, obj);
        }
        winterFlowRendererOrchestration.getClass();
    }

    public final void WinterFlowVariableVersionControl(WinterFlowDecoratorBackend winterFlowDecoratorBackend) {
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowDecoratorBackend.WinterFlowVariableVersionControl;
        Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource;
        Object[] objArr2 = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
        long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        WinterFlowRendererOrchestration winterFlowRendererOrchestration = (WinterFlowRendererOrchestration) obj;
                        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2 = this.WinterFlowVariableVersionControl;
                        Object WinterFlowUnitTestResponse = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(winterFlowRendererOrchestration);
                        winterFlowRendererOrchestration.getClass();
                        Object WinterFlowVariableVersionControl = winterFlowRendererOrchestration.WinterFlowHookDataSource.WinterFlowVariableVersionControl(WinterFlowUnitTestResponse, obj2);
                        if (WinterFlowVariableVersionControl != null) {
                            winterFlowDatabaseSchemaStructure2.WinterFlowThreadListener(winterFlowRendererOrchestration, WinterFlowVariableVersionControl);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinterFlowDecoratorBackend)) {
            return false;
        }
        WinterFlowDecoratorBackend winterFlowDecoratorBackend = (WinterFlowDecoratorBackend) obj;
        return this.WinterFlowVariableVersionControl.equals(winterFlowDecoratorBackend.WinterFlowVariableVersionControl) && this.WinterFlowUnitTestResponse == winterFlowDecoratorBackend.WinterFlowUnitTestResponse && this.WinterFlowRouterRouter == winterFlowDecoratorBackend.WinterFlowRouterRouter;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.WinterFlowRouterRouter) + WinterFlowSingletonMapper.WinterFlowRouterStructure(this.WinterFlowVariableVersionControl.hashCode() * 31, 31, this.WinterFlowUnitTestResponse);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        WinterFlowSessionEngine winterFlowSessionEngine = this.WinterFlowTransactionManagerStrategy;
        if (winterFlowSessionEngine == null) {
            winterFlowSessionEngine = new WinterFlowSessionEngine(this.WinterFlowVariableVersionControl);
            this.WinterFlowTransactionManagerStrategy = winterFlowSessionEngine;
        }
        return ((WinterFlowJavaScript) winterFlowSessionEngine.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.WinterFlowUnitTestResponse) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.WinterFlowRouterRouter) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = this.WinterFlowVariableVersionControl;
        Object[] objArr = winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource;
        Object[] objArr2 = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
        long[] jArr = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((WinterFlowRendererOrchestration) obj).WinterFlowRouterStructure);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return WinterFlowSoftwareException.WinterFlowFrameworkTransaction(this) + "{ " + ((Object) sb) + " }";
    }
}
