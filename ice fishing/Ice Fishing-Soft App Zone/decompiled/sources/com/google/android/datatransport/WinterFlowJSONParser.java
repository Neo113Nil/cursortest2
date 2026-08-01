package com.google.android.datatransport;

import java.util.Arrays;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowJSONParser extends WinterFlowParserThread {
    public final int WinterFlowRouterRouter;
    public final Object[] WinterFlowTransactionManagerStrategy;
    public final int WinterFlowUnitTestResponse;
    public final Object[] WinterFlowVariableVersionControl;

    public WinterFlowJSONParser(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.WinterFlowVariableVersionControl = objArr;
        this.WinterFlowTransactionManagerStrategy = objArr2;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = i2;
        if (!(WinterFlowRouterStructure() > 32)) {
            WinterFlowResponseCloud.WinterFlowRouterStructure("Trie-based persistent vector should have at least 33 elements, got " + WinterFlowRouterStructure());
        }
        int length = objArr2.length;
    }

    public static Object[] WinterFlowResponseEngine(Object[] objArr, int i, int i2, Object obj, WinterFlowNodeEngine winterFlowNodeEngine) {
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i2, i);
        if (i == 0) {
            Object[] copyOf = WinterFlowRouterRouter == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, copyOf, WinterFlowRouterRouter + 1, WinterFlowRouterRouter, 31);
            winterFlowNodeEngine.WinterFlowRouterStructure = objArr[31];
            copyOf[WinterFlowRouterRouter] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[WinterFlowRouterRouter];
        obj2.getClass();
        copyOf2[WinterFlowRouterRouter] = WinterFlowResponseEngine((Object[]) obj2, i3, i2, obj, winterFlowNodeEngine);
        while (true) {
            WinterFlowRouterRouter++;
            if (WinterFlowRouterRouter >= 32 || copyOf2[WinterFlowRouterRouter] == null) {
                break;
            }
            Object obj3 = objArr[WinterFlowRouterRouter];
            obj3.getClass();
            copyOf2[WinterFlowRouterRouter] = WinterFlowResponseEngine((Object[]) obj3, i3, 0, winterFlowNodeEngine.WinterFlowRouterStructure, winterFlowNodeEngine);
        }
        return copyOf2;
    }

    public static Object[] WinterFlowServerProtocol(Object[] objArr, int i, int i2, WinterFlowNodeEngine winterFlowNodeEngine) {
        Object[] WinterFlowServerProtocol;
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i2, i);
        if (i == 5) {
            winterFlowNodeEngine.WinterFlowRouterStructure = objArr[WinterFlowRouterRouter];
            WinterFlowServerProtocol = null;
        } else {
            Object obj = objArr[WinterFlowRouterRouter];
            obj.getClass();
            WinterFlowServerProtocol = WinterFlowServerProtocol((Object[]) obj, i - 5, i2, winterFlowNodeEngine);
        }
        if (WinterFlowServerProtocol == null && WinterFlowRouterRouter == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[WinterFlowRouterRouter] = WinterFlowServerProtocol;
        return copyOf;
    }

    public static Object[] WinterFlowSingletonPlatform(Object[] objArr, int i, int i2, Object obj) {
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i2, i);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[WinterFlowRouterRouter] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[WinterFlowRouterRouter];
        obj2.getClass();
        copyOf[WinterFlowRouterRouter] = WinterFlowSingletonPlatform((Object[]) obj2, i - 5, i2, obj);
        return copyOf;
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowParserThread WinterFlowArrayNetwork(Object obj) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread();
        int i = this.WinterFlowUnitTestResponse;
        int i2 = i - WinterFlowConcurrencyThread;
        Object[] objArr = this.WinterFlowVariableVersionControl;
        Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
        if (i2 < 32) {
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            copyOf[i2] = obj;
            return new WinterFlowJSONParser(objArr, copyOf, i + 1, this.WinterFlowRouterRouter);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return WinterFlowThreadListener(objArr, objArr2, objArr3);
    }

    public final Object[] WinterFlowBandwidthObject(Object[] objArr, int i, int i2, WinterFlowNodeEngine winterFlowNodeEngine) {
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i2, i);
        if (i == 0) {
            Object[] copyOf = WinterFlowRouterRouter == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, copyOf, WinterFlowRouterRouter, WinterFlowRouterRouter + 1, 32);
            copyOf[31] = winterFlowNodeEngine.WinterFlowRouterStructure;
            winterFlowNodeEngine.WinterFlowRouterStructure = objArr[WinterFlowRouterRouter];
            return copyOf;
        }
        int WinterFlowRouterRouter2 = objArr[31] == null ? WinterFlowWorkerVersionControl.WinterFlowRouterRouter(WinterFlowConcurrencyThread() - 1, i) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = WinterFlowRouterRouter + 1;
        if (i4 <= WinterFlowRouterRouter2) {
            while (true) {
                Object obj = copyOf2[WinterFlowRouterRouter2];
                obj.getClass();
                copyOf2[WinterFlowRouterRouter2] = WinterFlowBandwidthObject((Object[]) obj, i3, 0, winterFlowNodeEngine);
                if (WinterFlowRouterRouter2 == i4) {
                    break;
                }
                WinterFlowRouterRouter2--;
            }
        }
        Object obj2 = copyOf2[WinterFlowRouterRouter];
        obj2.getClass();
        copyOf2[WinterFlowRouterRouter] = WinterFlowBandwidthObject((Object[]) obj2, i3, i2, winterFlowNodeEngine);
        return copyOf2;
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowParserThread WinterFlowCacheManagerAgent(int i, Object obj) {
        int i2 = this.WinterFlowUnitTestResponse;
        WinterFlowQuerySyntax.WinterFlowCacheManagerAgent(i, i2);
        if (i == i2) {
            return WinterFlowArrayNetwork(obj);
        }
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread();
        Object[] objArr = this.WinterFlowVariableVersionControl;
        if (i >= WinterFlowConcurrencyThread) {
            return WinterFlowTransactionAgent(objArr, i - WinterFlowConcurrencyThread, obj);
        }
        WinterFlowNodeEngine winterFlowNodeEngine = new WinterFlowNodeEngine(null);
        return WinterFlowTransactionAgent(WinterFlowResponseEngine(objArr, this.WinterFlowRouterRouter, i, obj, winterFlowNodeEngine), 0, winterFlowNodeEngine.WinterFlowRouterStructure);
    }

    public final int WinterFlowConcurrencyThread() {
        return (this.WinterFlowUnitTestResponse - 1) & (-32);
    }

    public final WinterFlowParserThread WinterFlowOrchestrationSubsystem(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.WinterFlowUnitTestResponse - i;
        if (i4 != 1) {
            Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, copyOf, i3, i3 + 1, i4);
            }
            copyOf[i5] = null;
            return new WinterFlowJSONParser(objArr, copyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new WinterFlowExceptionComponent(objArr);
        }
        WinterFlowNodeEngine winterFlowNodeEngine = new WinterFlowNodeEngine(null);
        Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(objArr, i2, i - 1, winterFlowNodeEngine);
        WinterFlowServerProtocol.getClass();
        Object obj = winterFlowNodeEngine.WinterFlowRouterStructure;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (WinterFlowServerProtocol[1] != null) {
            return new WinterFlowJSONParser(WinterFlowServerProtocol, objArr3, i, i2);
        }
        Object obj2 = WinterFlowServerProtocol[0];
        obj2.getClass();
        return new WinterFlowJSONParser((Object[]) obj2, objArr3, i, i2 - 5);
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowParserThread WinterFlowRouterRouter(int i) {
        WinterFlowQuerySyntax.WinterFlowHookDataSource(i, WinterFlowRouterStructure());
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread();
        int i2 = this.WinterFlowRouterRouter;
        Object[] objArr = this.WinterFlowVariableVersionControl;
        return i >= WinterFlowConcurrencyThread ? WinterFlowOrchestrationSubsystem(objArr, WinterFlowConcurrencyThread, i2, i - WinterFlowConcurrencyThread) : WinterFlowOrchestrationSubsystem(WinterFlowBandwidthObject(objArr, i2, i, new WinterFlowNodeEngine(this.WinterFlowTransactionManagerStrategy[0])), WinterFlowConcurrencyThread, i2, 0);
    }

    @Override // com.google.android.datatransport.WinterFlowResolverRefactoring
    public final int WinterFlowRouterStructure() {
        return this.WinterFlowUnitTestResponse;
    }

    public final Object[] WinterFlowServiceUtility(int i, Object[] objArr, Object[] objArr2) {
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(WinterFlowRouterStructure() - 1, i);
        Object[] copyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            copyOf[WinterFlowRouterRouter] = objArr2;
            return copyOf;
        }
        copyOf[WinterFlowRouterRouter] = WinterFlowServiceUtility(i - 5, (Object[]) copyOf[WinterFlowRouterRouter], objArr2);
        return copyOf;
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowParserThread WinterFlowSyntax(int i, Object obj) {
        int i2 = this.WinterFlowUnitTestResponse;
        WinterFlowQuerySyntax.WinterFlowHookDataSource(i, i2);
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread();
        Object[] objArr = this.WinterFlowVariableVersionControl;
        Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
        int i3 = this.WinterFlowRouterRouter;
        if (WinterFlowConcurrencyThread > i) {
            return new WinterFlowJSONParser(WinterFlowSingletonPlatform(objArr, i3, i, obj), objArr2, i2, i3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        copyOf[i & 31] = obj;
        return new WinterFlowJSONParser(objArr, copyOf, i2, i3);
    }

    public final WinterFlowJSONParser WinterFlowThreadListener(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.WinterFlowUnitTestResponse;
        int i2 = i >> 5;
        int i3 = this.WinterFlowRouterRouter;
        if (i2 <= (1 << i3)) {
            return new WinterFlowJSONParser(WinterFlowServiceUtility(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new WinterFlowJSONParser(WinterFlowServiceUtility(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final WinterFlowJSONParser WinterFlowTransactionAgent(Object[] objArr, int i, Object obj) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread();
        int i2 = this.WinterFlowUnitTestResponse;
        int i3 = i2 - WinterFlowConcurrencyThread;
        Object[] objArr2 = this.WinterFlowTransactionManagerStrategy;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, copyOf, i + 1, i, i3);
            copyOf[i] = obj;
            return new WinterFlowJSONParser(objArr, copyOf, i2 + 1, this.WinterFlowRouterRouter);
        }
        Object obj2 = objArr2[31];
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, copyOf, i + 1, i, i3 - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return WinterFlowThreadListener(objArr, copyOf, objArr3);
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowDataSourceController WinterFlowTransactionManagerStrategy() {
        return new WinterFlowDataSourceController(this, this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowRouterRouter);
    }

    @Override // com.google.android.datatransport.WinterFlowParserThread
    public final WinterFlowParserThread WinterFlowUnitTestResponse(WinterFlowManagerCache winterFlowManagerCache) {
        WinterFlowDataSourceController winterFlowDataSourceController = new WinterFlowDataSourceController(this, this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, this.WinterFlowRouterRouter);
        winterFlowDataSourceController.WinterFlowBackendCacheManager(winterFlowManagerCache);
        return winterFlowDataSourceController.WinterFlowArrayNetwork();
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        WinterFlowQuerySyntax.WinterFlowHookDataSource(i, WinterFlowRouterStructure());
        if (WinterFlowConcurrencyThread() <= i) {
            objArr = this.WinterFlowTransactionManagerStrategy;
        } else {
            Object[] objArr2 = this.WinterFlowVariableVersionControl;
            for (int i2 = this.WinterFlowRouterRouter; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // com.google.android.datatransport.WinterFlowConcurrencyQueue, java.util.List
    public final ListIterator listIterator(int i) {
        WinterFlowQuerySyntax.WinterFlowCacheManagerAgent(i, this.WinterFlowUnitTestResponse);
        return new WinterFlowManagerQueue(this.WinterFlowVariableVersionControl, this.WinterFlowTransactionManagerStrategy, i, this.WinterFlowUnitTestResponse, (this.WinterFlowRouterRouter / 5) + 1);
    }
}
