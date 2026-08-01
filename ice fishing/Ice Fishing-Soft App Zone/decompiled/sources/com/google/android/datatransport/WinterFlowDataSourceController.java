package com.google.android.datatransport;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowDataSourceController extends WinterFlowDeserializationDeployment implements Collection, WinterFlowLoaderProcess {
    public Object[] WinterFlowResponseEngine;
    public int WinterFlowRouterRouter;
    public int WinterFlowServerProtocol;
    public WinterFlowThreadPoolProcess WinterFlowSyntax = new WinterFlowThreadPoolProcess(13);
    public Object[] WinterFlowTransactionAgent;
    public Object[] WinterFlowTransactionManagerStrategy;
    public Object[] WinterFlowUnitTestResponse;
    public WinterFlowParserThread WinterFlowVariableVersionControl;

    public WinterFlowDataSourceController(WinterFlowParserThread winterFlowParserThread, Object[] objArr, Object[] objArr2, int i) {
        this.WinterFlowVariableVersionControl = winterFlowParserThread;
        this.WinterFlowTransactionManagerStrategy = objArr;
        this.WinterFlowUnitTestResponse = objArr2;
        this.WinterFlowRouterRouter = i;
        this.WinterFlowResponseEngine = objArr;
        this.WinterFlowTransactionAgent = objArr2;
        this.WinterFlowServerProtocol = winterFlowParserThread.WinterFlowRouterStructure();
    }

    public static void WinterFlowVariableVersionControl(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object WinterFlowArrayHelper(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.WinterFlowServerProtocol - i;
        Object[] objArr2 = this.WinterFlowTransactionAgent;
        if (i4 == 1) {
            Object obj = objArr2[0];
            WinterFlowSingletonPlatform(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(objArr2);
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, WinterFlowServerProtocol, i3, i3 + 1, i4);
        WinterFlowServerProtocol[i4 - 1] = null;
        this.WinterFlowResponseEngine = objArr;
        this.WinterFlowTransactionAgent = WinterFlowServerProtocol;
        this.WinterFlowServerProtocol = (i + i4) - 1;
        this.WinterFlowRouterRouter = i2;
        return obj2;
    }

    public final WinterFlowParserThread WinterFlowArrayNetwork() {
        WinterFlowParserThread winterFlowExceptionComponent;
        Object[] objArr = this.WinterFlowResponseEngine;
        if (objArr == this.WinterFlowTransactionManagerStrategy && this.WinterFlowTransactionAgent == this.WinterFlowUnitTestResponse) {
            winterFlowExceptionComponent = this.WinterFlowVariableVersionControl;
        } else {
            this.WinterFlowSyntax = new WinterFlowThreadPoolProcess(13);
            this.WinterFlowTransactionManagerStrategy = objArr;
            Object[] objArr2 = this.WinterFlowTransactionAgent;
            this.WinterFlowUnitTestResponse = objArr2;
            winterFlowExceptionComponent = objArr == null ? objArr2.length == 0 ? WinterFlowExceptionComponent.WinterFlowTransactionManagerStrategy : new WinterFlowExceptionComponent(Arrays.copyOf(objArr2, this.WinterFlowServerProtocol)) : new WinterFlowJSONParser(objArr, objArr2, this.WinterFlowServerProtocol, this.WinterFlowRouterRouter);
        }
        this.WinterFlowVariableVersionControl = winterFlowExceptionComponent;
        return winterFlowExceptionComponent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (WinterFlowConsumerUserManager(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean WinterFlowBackendCacheManager(WinterFlowObjectSession winterFlowObjectSession) {
        int i;
        WinterFlowObjectSession winterFlowObjectSession2 = winterFlowObjectSession;
        int WinterFlowCacheManagerListener = WinterFlowCacheManagerListener();
        Object[] objArr = null;
        WinterFlowNodeEngine winterFlowNodeEngine = new WinterFlowNodeEngine(null);
        boolean z = false;
        if (this.WinterFlowResponseEngine != null) {
            WinterFlowServiceLayer WinterFlowTransactionAgent = WinterFlowTransactionAgent(0);
            int i2 = 32;
            while (i2 == 32 && WinterFlowTransactionAgent.hasNext()) {
                i2 = WinterFlowResolverController(winterFlowObjectSession2, (Object[]) WinterFlowTransactionAgent.next(), 32, winterFlowNodeEngine);
            }
            if (i2 == 32) {
                int WinterFlowConsumerUserManager = WinterFlowConsumerUserManager(winterFlowObjectSession2, WinterFlowCacheManagerListener, winterFlowNodeEngine);
                if (WinterFlowConsumerUserManager == 0) {
                    WinterFlowSingletonPlatform(this.WinterFlowResponseEngine, this.WinterFlowServerProtocol, this.WinterFlowRouterRouter);
                }
            } else {
                int i3 = (WinterFlowTransactionAgent.WinterFlowVariableVersionControl - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i4 = i2;
                while (WinterFlowTransactionAgent.hasNext()) {
                    i4 = WinterFlowMapperProtocol(winterFlowObjectSession2, (Object[]) WinterFlowTransactionAgent.next(), 32, i4, winterFlowNodeEngine, arrayList2, arrayList);
                    winterFlowObjectSession2 = winterFlowObjectSession;
                }
                int WinterFlowMapperProtocol = WinterFlowMapperProtocol(winterFlowObjectSession, this.WinterFlowTransactionAgent, WinterFlowCacheManagerListener, i4, winterFlowNodeEngine, arrayList2, arrayList);
                Object obj = winterFlowNodeEngine.WinterFlowRouterStructure;
                obj.getClass();
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, WinterFlowMapperProtocol, 32, (Object) null);
                boolean isEmpty = arrayList.isEmpty();
                Object[] objArr3 = this.WinterFlowResponseEngine;
                if (isEmpty) {
                    objArr3.getClass();
                } else {
                    objArr3 = WinterFlowVariableBandwidth(objArr3, i3, this.WinterFlowRouterRouter, arrayList.iterator());
                }
                int size = i3 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    WinterFlowResponseCloud.WinterFlowRouterStructure("invalid size");
                }
                if (size == 0) {
                    this.WinterFlowRouterRouter = 0;
                } else {
                    int i5 = size - 1;
                    while (true) {
                        i = this.WinterFlowRouterRouter;
                        if ((i5 >> i) != 0) {
                            break;
                        }
                        this.WinterFlowRouterRouter = i - 5;
                        Object[] objArr4 = objArr3[0];
                        objArr4.getClass();
                        objArr3 = objArr4;
                    }
                    objArr = WinterFlowOrchestrationSubsystem(objArr3, i5, i);
                }
                this.WinterFlowResponseEngine = objArr;
                this.WinterFlowTransactionAgent = objArr2;
                this.WinterFlowServerProtocol = size + WinterFlowMapperProtocol;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] WinterFlowBandwidthObject(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.WinterFlowSyntax;
        return objArr;
    }

    public final Object[] WinterFlowBatchUI(Object[] objArr, int i, Object[][] objArr2) {
        WinterFlowSoftware winterFlowSoftware = new WinterFlowSoftware(objArr2);
        int i2 = i >> 5;
        int i3 = this.WinterFlowRouterRouter;
        Object[] WinterFlowVariableBandwidth = i2 < (1 << i3) ? WinterFlowVariableBandwidth(objArr, i, i3, winterFlowSoftware) : WinterFlowServerProtocol(objArr);
        while (winterFlowSoftware.hasNext()) {
            this.WinterFlowRouterRouter += 5;
            WinterFlowVariableBandwidth = WinterFlowBandwidthObject(WinterFlowVariableBandwidth);
            int i4 = this.WinterFlowRouterRouter;
            WinterFlowVariableBandwidth(WinterFlowVariableBandwidth, 1 << i4, i4, winterFlowSoftware);
        }
        return WinterFlowVariableBandwidth;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationDeployment
    public final Object WinterFlowCacheManagerAgent(int i) {
        WinterFlowQuerySyntax.WinterFlowHookDataSource(i, WinterFlowRouterStructure());
        ((AbstractList) this).modCount++;
        int WinterFlowCompilerVariable = WinterFlowCompilerVariable();
        if (i >= WinterFlowCompilerVariable) {
            return WinterFlowArrayHelper(this.WinterFlowResponseEngine, WinterFlowCompilerVariable, this.WinterFlowRouterRouter, i - WinterFlowCompilerVariable);
        }
        WinterFlowNodeEngine winterFlowNodeEngine = new WinterFlowNodeEngine(this.WinterFlowTransactionAgent[0]);
        Object[] objArr = this.WinterFlowResponseEngine;
        objArr.getClass();
        WinterFlowArrayHelper(WinterFlowEventEmitterController(objArr, this.WinterFlowRouterRouter, i, winterFlowNodeEngine), WinterFlowCompilerVariable, this.WinterFlowRouterRouter, 0);
        return winterFlowNodeEngine.WinterFlowRouterStructure;
    }

    public final int WinterFlowCacheManagerListener() {
        int i = this.WinterFlowServerProtocol;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    public final int WinterFlowCompilerVariable() {
        int i = this.WinterFlowServerProtocol;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] WinterFlowConcurrencyThread(Object[] objArr, int i, int i2, WinterFlowNodeEngine winterFlowNodeEngine) {
        Object[] WinterFlowConcurrencyThread;
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i2 - 1, i);
        if (i == 5) {
            winterFlowNodeEngine.WinterFlowRouterStructure = objArr[WinterFlowRouterRouter];
            WinterFlowConcurrencyThread = null;
        } else {
            Object obj = objArr[WinterFlowRouterRouter];
            obj.getClass();
            WinterFlowConcurrencyThread = WinterFlowConcurrencyThread((Object[]) obj, i - 5, i2, winterFlowNodeEngine);
        }
        if (WinterFlowConcurrencyThread == null && WinterFlowRouterRouter == 0) {
            return null;
        }
        Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(objArr);
        WinterFlowServerProtocol[WinterFlowRouterRouter] = WinterFlowConcurrencyThread;
        return WinterFlowServerProtocol;
    }

    public final Object[] WinterFlowConfigurationSubsystem(Object[] objArr, int i, int i2, Object obj, WinterFlowNodeEngine winterFlowNodeEngine) {
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i2, i);
        Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(objArr);
        if (i != 0) {
            Object obj2 = WinterFlowServerProtocol[WinterFlowRouterRouter];
            obj2.getClass();
            WinterFlowServerProtocol[WinterFlowRouterRouter] = WinterFlowConfigurationSubsystem((Object[]) obj2, i - 5, i2, obj, winterFlowNodeEngine);
            return WinterFlowServerProtocol;
        }
        if (WinterFlowServerProtocol != objArr) {
            ((AbstractList) this).modCount++;
        }
        winterFlowNodeEngine.WinterFlowRouterStructure = WinterFlowServerProtocol[WinterFlowRouterRouter];
        WinterFlowServerProtocol[WinterFlowRouterRouter] = obj;
        return WinterFlowServerProtocol;
    }

    public final int WinterFlowConsumerUserManager(WinterFlowObjectSession winterFlowObjectSession, int i, WinterFlowNodeEngine winterFlowNodeEngine) {
        int WinterFlowResolverController = WinterFlowResolverController(winterFlowObjectSession, this.WinterFlowTransactionAgent, i, winterFlowNodeEngine);
        Object obj = winterFlowNodeEngine.WinterFlowRouterStructure;
        if (WinterFlowResolverController == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, WinterFlowResolverController, i, (Object) null);
        this.WinterFlowTransactionAgent = objArr;
        this.WinterFlowServerProtocol -= i - WinterFlowResolverController;
        return WinterFlowResolverController;
    }

    public final Object[] WinterFlowEventEmitterController(Object[] objArr, int i, int i2, WinterFlowNodeEngine winterFlowNodeEngine) {
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i2, i);
        if (i == 0) {
            Object obj = objArr[WinterFlowRouterRouter];
            Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(objArr);
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, WinterFlowServerProtocol, WinterFlowRouterRouter, WinterFlowRouterRouter + 1, 32);
            WinterFlowServerProtocol[31] = winterFlowNodeEngine.WinterFlowRouterStructure;
            winterFlowNodeEngine.WinterFlowRouterStructure = obj;
            return WinterFlowServerProtocol;
        }
        int WinterFlowRouterRouter2 = objArr[31] == null ? WinterFlowWorkerVersionControl.WinterFlowRouterRouter(WinterFlowCompilerVariable() - 1, i) : 31;
        Object[] WinterFlowServerProtocol2 = WinterFlowServerProtocol(objArr);
        int i3 = i - 5;
        int i4 = WinterFlowRouterRouter + 1;
        if (i4 <= WinterFlowRouterRouter2) {
            while (true) {
                Object obj2 = WinterFlowServerProtocol2[WinterFlowRouterRouter2];
                obj2.getClass();
                WinterFlowServerProtocol2[WinterFlowRouterRouter2] = WinterFlowEventEmitterController((Object[]) obj2, i3, 0, winterFlowNodeEngine);
                if (WinterFlowRouterRouter2 == i4) {
                    break;
                }
                WinterFlowRouterRouter2--;
            }
        }
        Object obj3 = WinterFlowServerProtocol2[WinterFlowRouterRouter];
        obj3.getClass();
        WinterFlowServerProtocol2[WinterFlowRouterRouter] = WinterFlowEventEmitterController((Object[]) obj3, i3, i2, winterFlowNodeEngine);
        return WinterFlowServerProtocol2;
    }

    public final int WinterFlowMapperProtocol(WinterFlowObjectSession winterFlowObjectSession, Object[] objArr, int i, int i2, WinterFlowNodeEngine winterFlowNodeEngine, ArrayList arrayList, ArrayList arrayList2) {
        if (WinterFlowResponseEngine(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = winterFlowNodeEngine.WinterFlowRouterStructure;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : WinterFlowServiceUtility();
                    i2 = 0;
                }
                objArr3[i2] = obj2;
                i2++;
            }
        }
        winterFlowNodeEngine.WinterFlowRouterStructure = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final Object[] WinterFlowOrchestrationSubsystem(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            WinterFlowResponseCloud.WinterFlowRouterStructure("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i, i2);
        Object obj = objArr[WinterFlowRouterRouter];
        obj.getClass();
        Object WinterFlowOrchestrationSubsystem = WinterFlowOrchestrationSubsystem((Object[]) obj, i, i2 - 5);
        if (WinterFlowRouterRouter < 31) {
            int i3 = WinterFlowRouterRouter + 1;
            if (objArr[i3] != null) {
                if (WinterFlowResponseEngine(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] WinterFlowServiceUtility = WinterFlowServiceUtility();
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, WinterFlowServiceUtility, 0, 0, i3);
                objArr = WinterFlowServiceUtility;
            }
        }
        if (WinterFlowOrchestrationSubsystem == objArr[WinterFlowRouterRouter]) {
            return objArr;
        }
        Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(objArr);
        WinterFlowServerProtocol[WinterFlowRouterRouter] = WinterFlowOrchestrationSubsystem;
        return WinterFlowServerProtocol;
    }

    public final int WinterFlowResolverController(WinterFlowObjectSession winterFlowObjectSession, Object[] objArr, int i, WinterFlowNodeEngine winterFlowNodeEngine) {
        Object[] objArr2 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) winterFlowObjectSession.WinterFlowUnitTestResponse(obj)).booleanValue()) {
                if (!z) {
                    objArr2 = WinterFlowServerProtocol(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArr2[i2] = obj;
                i2++;
            }
        }
        winterFlowNodeEngine.WinterFlowRouterStructure = objArr2;
        return i2;
    }

    public final boolean WinterFlowResponseEngine(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.WinterFlowSyntax;
    }

    public final void WinterFlowRouterAdapter(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.WinterFlowServerProtocol;
        int i2 = i >> 5;
        int i3 = this.WinterFlowRouterRouter;
        if (i2 > (1 << i3)) {
            this.WinterFlowResponseEngine = WinterFlowSerializerStructure(this.WinterFlowRouterRouter + 5, WinterFlowBandwidthObject(objArr), objArr2);
            this.WinterFlowTransactionAgent = objArr3;
            this.WinterFlowRouterRouter += 5;
            this.WinterFlowServerProtocol++;
            return;
        }
        if (objArr == null) {
            this.WinterFlowResponseEngine = objArr2;
            this.WinterFlowTransactionAgent = objArr3;
            this.WinterFlowServerProtocol = i + 1;
        } else {
            this.WinterFlowResponseEngine = WinterFlowSerializerStructure(i3, objArr, objArr2);
            this.WinterFlowTransactionAgent = objArr3;
            this.WinterFlowServerProtocol++;
        }
    }

    public final Object[] WinterFlowRouterRouter(Object[] objArr, int i, int i2, Object obj, WinterFlowNodeEngine winterFlowNodeEngine) {
        Object obj2;
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i2, i);
        if (i == 0) {
            winterFlowNodeEngine.WinterFlowRouterStructure = objArr[31];
            Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(objArr);
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, WinterFlowServerProtocol, WinterFlowRouterRouter + 1, WinterFlowRouterRouter, 31);
            WinterFlowServerProtocol[WinterFlowRouterRouter] = obj;
            return WinterFlowServerProtocol;
        }
        Object[] WinterFlowServerProtocol2 = WinterFlowServerProtocol(objArr);
        int i3 = i - 5;
        Object obj3 = WinterFlowServerProtocol2[WinterFlowRouterRouter];
        obj3.getClass();
        WinterFlowServerProtocol2[WinterFlowRouterRouter] = WinterFlowRouterRouter((Object[]) obj3, i3, i2, obj, winterFlowNodeEngine);
        while (true) {
            WinterFlowRouterRouter++;
            if (WinterFlowRouterRouter >= 32 || (obj2 = WinterFlowServerProtocol2[WinterFlowRouterRouter]) == null) {
                break;
            }
            WinterFlowServerProtocol2[WinterFlowRouterRouter] = WinterFlowRouterRouter((Object[]) obj2, i3, 0, winterFlowNodeEngine.WinterFlowRouterStructure, winterFlowNodeEngine);
        }
        return WinterFlowServerProtocol2;
    }

    @Override // com.google.android.datatransport.WinterFlowDeserializationDeployment
    public final int WinterFlowRouterStructure() {
        return this.WinterFlowServerProtocol;
    }

    public final Object[] WinterFlowSerializerStructure(int i, Object[] objArr, Object[] objArr2) {
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(WinterFlowRouterStructure() - 1, i);
        Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(objArr);
        if (i == 5) {
            WinterFlowServerProtocol[WinterFlowRouterRouter] = objArr2;
            return WinterFlowServerProtocol;
        }
        WinterFlowServerProtocol[WinterFlowRouterRouter] = WinterFlowSerializerStructure(i - 5, (Object[]) WinterFlowServerProtocol[WinterFlowRouterRouter], objArr2);
        return WinterFlowServerProtocol;
    }

    public final Object[] WinterFlowServerProtocol(Object[] objArr) {
        if (objArr == null) {
            return WinterFlowServiceUtility();
        }
        if (WinterFlowResponseEngine(objArr)) {
            return objArr;
        }
        Object[] WinterFlowServiceUtility = WinterFlowServiceUtility();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        WinterFlowProtocolPipeline.WinterFlowQueueService(objArr, WinterFlowServiceUtility, 0, length, 6);
        return WinterFlowServiceUtility;
    }

    public final Object[] WinterFlowServiceUtility() {
        Object[] objArr = new Object[33];
        objArr[32] = this.WinterFlowSyntax;
        return objArr;
    }

    public final void WinterFlowSingletonPlatform(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.WinterFlowResponseEngine = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.WinterFlowTransactionAgent = objArr;
            this.WinterFlowServerProtocol = i;
            this.WinterFlowRouterRouter = i2;
            return;
        }
        WinterFlowNodeEngine winterFlowNodeEngine = new WinterFlowNodeEngine(null);
        objArr.getClass();
        Object[] WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(objArr, i2, i, winterFlowNodeEngine);
        WinterFlowConcurrencyThread.getClass();
        Object obj = winterFlowNodeEngine.WinterFlowRouterStructure;
        obj.getClass();
        this.WinterFlowTransactionAgent = (Object[]) obj;
        this.WinterFlowServerProtocol = i;
        if (WinterFlowConcurrencyThread[1] == null) {
            this.WinterFlowResponseEngine = (Object[]) WinterFlowConcurrencyThread[0];
            this.WinterFlowRouterRouter = i2 - 5;
        } else {
            this.WinterFlowResponseEngine = WinterFlowConcurrencyThread;
            this.WinterFlowRouterRouter = i2;
        }
    }

    public final void WinterFlowStrategyTool(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] WinterFlowServiceUtility;
        if (i3 < 1) {
            WinterFlowResponseCloud.WinterFlowRouterStructure("requires at least one nullBuffer");
        }
        Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(objArr);
        objArr2[0] = WinterFlowServerProtocol;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(WinterFlowServerProtocol, objArr3, size + 1, i4, i2);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                WinterFlowServiceUtility = WinterFlowServerProtocol;
            } else {
                WinterFlowServiceUtility = WinterFlowServiceUtility();
                i3--;
                objArr2[i3] = WinterFlowServiceUtility;
            }
            int i7 = i2 - i6;
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(WinterFlowServerProtocol, objArr3, 0, i7, i2);
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(WinterFlowServerProtocol, WinterFlowServiceUtility, size + 1, i4, i7);
            objArr3 = WinterFlowServiceUtility;
        }
        Iterator it = collection.iterator();
        WinterFlowVariableVersionControl(WinterFlowServerProtocol, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] WinterFlowServiceUtility2 = WinterFlowServiceUtility();
            WinterFlowVariableVersionControl(WinterFlowServiceUtility2, 0, it);
            objArr2[i8] = WinterFlowServiceUtility2;
        }
        WinterFlowVariableVersionControl(objArr3, 0, it);
    }

    public final void WinterFlowSyntax(Object[] objArr, int i, Object obj) {
        int WinterFlowCacheManagerListener = WinterFlowCacheManagerListener();
        Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(this.WinterFlowTransactionAgent);
        Object[] objArr2 = this.WinterFlowTransactionAgent;
        if (WinterFlowCacheManagerListener >= 32) {
            Object obj2 = objArr2[31];
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, WinterFlowServerProtocol, i + 1, i, 31);
            WinterFlowServerProtocol[i] = obj;
            WinterFlowRouterAdapter(objArr, WinterFlowServerProtocol, WinterFlowBandwidthObject(obj2));
            return;
        }
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr2, WinterFlowServerProtocol, i + 1, i, WinterFlowCacheManagerListener);
        WinterFlowServerProtocol[i] = obj;
        this.WinterFlowResponseEngine = objArr;
        this.WinterFlowTransactionAgent = WinterFlowServerProtocol;
        this.WinterFlowServerProtocol++;
    }

    public final Object[] WinterFlowThreadListener(int i, Object[] objArr) {
        if (WinterFlowResponseEngine(objArr)) {
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr, i, 0, 32 - i);
            return objArr;
        }
        Object[] WinterFlowServiceUtility = WinterFlowServiceUtility();
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, WinterFlowServiceUtility, i, 0, 32 - i);
        return WinterFlowServiceUtility;
    }

    public final WinterFlowServiceLayer WinterFlowTransactionAgent(int i) {
        Object[] objArr = this.WinterFlowResponseEngine;
        if (objArr == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Invalid root");
            return null;
        }
        int WinterFlowCompilerVariable = WinterFlowCompilerVariable() >> 5;
        WinterFlowQuerySyntax.WinterFlowCacheManagerAgent(i, WinterFlowCompilerVariable);
        int i2 = this.WinterFlowRouterRouter;
        return i2 == 0 ? new WinterFlowClassFramework(i, objArr) : new WinterFlowRenderer(objArr, i, WinterFlowCompilerVariable, i2 / 5);
    }

    public final int WinterFlowTransactionManagerStrategy() {
        return ((AbstractList) this).modCount;
    }

    public final void WinterFlowUnitTestResponse(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.WinterFlowResponseEngine == null) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("root is null");
            return;
        }
        int i4 = i >> 5;
        WinterFlowServiceLayer WinterFlowTransactionAgent = WinterFlowTransactionAgent(WinterFlowCompilerVariable() >> 5);
        int i5 = i3;
        Object[] objArr3 = objArr2;
        while (WinterFlowTransactionAgent.WinterFlowVariableVersionControl - 1 != i4) {
            Object[] objArr4 = (Object[]) WinterFlowTransactionAgent.previous();
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr4, objArr3, 0, 32 - i2, 32);
            objArr3 = WinterFlowThreadListener(i2, objArr4);
            i5--;
            objArr[i5] = objArr3;
        }
        Object[] objArr5 = (Object[]) WinterFlowTransactionAgent.previous();
        int WinterFlowCompilerVariable = i3 - (((WinterFlowCompilerVariable() >> 5) - 1) - i4);
        if (WinterFlowCompilerVariable < i3) {
            objArr2 = objArr[WinterFlowCompilerVariable];
            objArr2.getClass();
        }
        WinterFlowStrategyTool(collection, i, objArr5, 32, objArr, WinterFlowCompilerVariable, objArr2);
    }

    public final Object[] WinterFlowVariableBandwidth(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            WinterFlowResponseCloud.WinterFlowRouterStructure("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            WinterFlowResponseCloud.WinterFlowRouterStructure("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(objArr);
        int WinterFlowRouterRouter = WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i, i2);
        int i3 = i2 - 5;
        WinterFlowServerProtocol[WinterFlowRouterRouter] = WinterFlowVariableBandwidth((Object[]) WinterFlowServerProtocol[WinterFlowRouterRouter], i, i3, it);
        while (true) {
            WinterFlowRouterRouter++;
            if (WinterFlowRouterRouter >= 32 || !it.hasNext()) {
                break;
            }
            WinterFlowServerProtocol[WinterFlowRouterRouter] = WinterFlowVariableBandwidth((Object[]) WinterFlowServerProtocol[WinterFlowRouterRouter], 0, i3, it);
        }
        return WinterFlowServerProtocol;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        WinterFlowQuerySyntax.WinterFlowCacheManagerAgent(i, WinterFlowRouterStructure());
        if (i == WinterFlowRouterStructure()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int WinterFlowCompilerVariable = WinterFlowCompilerVariable();
        if (i >= WinterFlowCompilerVariable) {
            WinterFlowSyntax(this.WinterFlowResponseEngine, i - WinterFlowCompilerVariable, obj);
            return;
        }
        WinterFlowNodeEngine winterFlowNodeEngine = new WinterFlowNodeEngine(null);
        Object[] objArr = this.WinterFlowResponseEngine;
        objArr.getClass();
        WinterFlowSyntax(WinterFlowRouterRouter(objArr, this.WinterFlowRouterRouter, i, obj, winterFlowNodeEngine), 0, winterFlowNodeEngine.WinterFlowRouterStructure);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] WinterFlowServiceUtility;
        WinterFlowQuerySyntax.WinterFlowCacheManagerAgent(i, this.WinterFlowServerProtocol);
        if (i == this.WinterFlowServerProtocol) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.WinterFlowServerProtocol - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.WinterFlowTransactionAgent;
            Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(objArr);
            WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, WinterFlowServerProtocol, size2 + 1, i3, WinterFlowCacheManagerListener());
            WinterFlowVariableVersionControl(WinterFlowServerProtocol, i3, collection.iterator());
            this.WinterFlowTransactionAgent = WinterFlowServerProtocol;
            this.WinterFlowServerProtocol = collection.size() + this.WinterFlowServerProtocol;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int WinterFlowCacheManagerListener = WinterFlowCacheManagerListener();
        int size3 = collection.size() + this.WinterFlowServerProtocol;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= WinterFlowCompilerVariable()) {
            WinterFlowServiceUtility = WinterFlowServiceUtility();
            collection2 = collection;
            WinterFlowStrategyTool(collection2, i, this.WinterFlowTransactionAgent, WinterFlowCacheManagerListener, objArr2, size, WinterFlowServiceUtility);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.WinterFlowTransactionAgent;
            if (size3 > WinterFlowCacheManagerListener) {
                int i4 = size3 - WinterFlowCacheManagerListener;
                Object[] WinterFlowThreadListener = WinterFlowThreadListener(i4, objArr3);
                WinterFlowUnitTestResponse(collection2, i, i4, objArr2, size, WinterFlowThreadListener);
                objArr2 = objArr2;
                WinterFlowServiceUtility = WinterFlowThreadListener;
            } else {
                WinterFlowServiceUtility = WinterFlowServiceUtility();
                int i5 = WinterFlowCacheManagerListener - size3;
                WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr3, WinterFlowServiceUtility, 0, i5, WinterFlowCacheManagerListener);
                int i6 = 32 - i5;
                Object[] WinterFlowThreadListener2 = WinterFlowThreadListener(i6, this.WinterFlowTransactionAgent);
                int i7 = size - 1;
                objArr2[i7] = WinterFlowThreadListener2;
                WinterFlowUnitTestResponse(collection2, i, i6, objArr2, i7, WinterFlowThreadListener2);
                collection2 = collection2;
            }
        }
        this.WinterFlowResponseEngine = WinterFlowBatchUI(this.WinterFlowResponseEngine, i2, objArr2);
        this.WinterFlowTransactionAgent = WinterFlowServiceUtility;
        this.WinterFlowServerProtocol = collection2.size() + this.WinterFlowServerProtocol;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        WinterFlowQuerySyntax.WinterFlowHookDataSource(i, WinterFlowRouterStructure());
        if (WinterFlowCompilerVariable() <= i) {
            objArr = this.WinterFlowTransactionAgent;
        } else {
            Object[] objArr2 = this.WinterFlowResponseEngine;
            objArr2.getClass();
            for (int i2 = this.WinterFlowRouterRouter; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[WinterFlowWorkerVersionControl.WinterFlowRouterRouter(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        WinterFlowQuerySyntax.WinterFlowCacheManagerAgent(i, this.WinterFlowServerProtocol);
        return new WinterFlowServerMechanism(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return WinterFlowBackendCacheManager(new WinterFlowManagerCache(1, collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        WinterFlowQuerySyntax.WinterFlowHookDataSource(i, WinterFlowRouterStructure());
        if (WinterFlowCompilerVariable() > i) {
            WinterFlowNodeEngine winterFlowNodeEngine = new WinterFlowNodeEngine(null);
            Object[] objArr = this.WinterFlowResponseEngine;
            objArr.getClass();
            this.WinterFlowResponseEngine = WinterFlowConfigurationSubsystem(objArr, this.WinterFlowRouterRouter, i, obj, winterFlowNodeEngine);
            return winterFlowNodeEngine.WinterFlowRouterStructure;
        }
        Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(this.WinterFlowTransactionAgent);
        if (WinterFlowServerProtocol != this.WinterFlowTransactionAgent) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = WinterFlowServerProtocol[i2];
        WinterFlowServerProtocol[i2] = obj;
        this.WinterFlowTransactionAgent = WinterFlowServerProtocol;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int WinterFlowCacheManagerListener = WinterFlowCacheManagerListener();
        if (WinterFlowCacheManagerListener < 32) {
            Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(this.WinterFlowTransactionAgent);
            WinterFlowServerProtocol[WinterFlowCacheManagerListener] = obj;
            this.WinterFlowTransactionAgent = WinterFlowServerProtocol;
            this.WinterFlowServerProtocol = WinterFlowRouterStructure() + 1;
        } else {
            WinterFlowRouterAdapter(this.WinterFlowResponseEngine, this.WinterFlowTransactionAgent, WinterFlowBandwidthObject(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int WinterFlowCacheManagerListener = WinterFlowCacheManagerListener();
        Iterator it = collection.iterator();
        if (32 - WinterFlowCacheManagerListener >= collection.size()) {
            Object[] WinterFlowServerProtocol = WinterFlowServerProtocol(this.WinterFlowTransactionAgent);
            WinterFlowVariableVersionControl(WinterFlowServerProtocol, WinterFlowCacheManagerListener, it);
            this.WinterFlowTransactionAgent = WinterFlowServerProtocol;
            this.WinterFlowServerProtocol = collection.size() + this.WinterFlowServerProtocol;
            return true;
        }
        int size = ((collection.size() + WinterFlowCacheManagerListener) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] WinterFlowServerProtocol2 = WinterFlowServerProtocol(this.WinterFlowTransactionAgent);
        WinterFlowVariableVersionControl(WinterFlowServerProtocol2, WinterFlowCacheManagerListener, it);
        objArr[0] = WinterFlowServerProtocol2;
        for (int i = 1; i < size; i++) {
            Object[] WinterFlowServiceUtility = WinterFlowServiceUtility();
            WinterFlowVariableVersionControl(WinterFlowServiceUtility, 0, it);
            objArr[i] = WinterFlowServiceUtility;
        }
        this.WinterFlowResponseEngine = WinterFlowBatchUI(this.WinterFlowResponseEngine, WinterFlowCompilerVariable(), objArr);
        Object[] WinterFlowServiceUtility2 = WinterFlowServiceUtility();
        WinterFlowVariableVersionControl(WinterFlowServiceUtility2, 0, it);
        this.WinterFlowTransactionAgent = WinterFlowServiceUtility2;
        this.WinterFlowServerProtocol = collection.size() + this.WinterFlowServerProtocol;
        return true;
    }
}
