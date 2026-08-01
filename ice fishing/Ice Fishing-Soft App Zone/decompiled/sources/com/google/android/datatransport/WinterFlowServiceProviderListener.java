package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowServiceProviderListener {
    public ArrayList WinterFlowArrayNetwork;
    public int WinterFlowBandwidthObject;
    public int WinterFlowBatchUI;
    public Object[] WinterFlowCacheManagerAgent;
    public final WinterFlowQueryPackage WinterFlowConcurrencyThread;
    public int[] WinterFlowHookDataSource;
    public boolean WinterFlowMapperProtocol;
    public final WinterFlowQueryPackage WinterFlowOrchestrationSubsystem;
    public WinterFlowTransactionStructure WinterFlowResolverController;
    public int WinterFlowResponseEngine;
    public int WinterFlowRouterAdapter;
    public int WinterFlowRouterRouter;
    public final WinterFlowMapperInterface WinterFlowRouterStructure;
    public int WinterFlowSerializerStructure;
    public int WinterFlowServerProtocol;
    public int WinterFlowServiceUtility;
    public final WinterFlowQueryPackage WinterFlowSingletonPlatform;
    public int WinterFlowSyntax;
    public int WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;
    public WinterFlowViewSoftware WinterFlowTransactionManagerStrategy;
    public int WinterFlowUnitTestResponse;
    public WinterFlowViewSoftware WinterFlowVariableBandwidth;
    public HashMap WinterFlowVariableVersionControl;

    public WinterFlowServiceProviderListener(WinterFlowMapperInterface winterFlowMapperInterface) {
        this.WinterFlowRouterStructure = winterFlowMapperInterface;
        int[] iArr = winterFlowMapperInterface.WinterFlowVariableVersionControl;
        this.WinterFlowHookDataSource = iArr;
        Object[] objArr = winterFlowMapperInterface.WinterFlowUnitTestResponse;
        this.WinterFlowCacheManagerAgent = objArr;
        this.WinterFlowArrayNetwork = winterFlowMapperInterface.WinterFlowThreadListener;
        this.WinterFlowVariableVersionControl = winterFlowMapperInterface.WinterFlowServiceUtility;
        this.WinterFlowTransactionManagerStrategy = winterFlowMapperInterface.WinterFlowBandwidthObject;
        int i = winterFlowMapperInterface.WinterFlowTransactionManagerStrategy;
        this.WinterFlowUnitTestResponse = i;
        this.WinterFlowRouterRouter = (iArr.length / 5) - i;
        int i2 = winterFlowMapperInterface.WinterFlowRouterRouter;
        this.WinterFlowTransactionAgent = i2;
        this.WinterFlowServerProtocol = objArr.length - i2;
        this.WinterFlowThreadListener = i;
        this.WinterFlowOrchestrationSubsystem = new WinterFlowQueryPackage();
        this.WinterFlowConcurrencyThread = new WinterFlowQueryPackage();
        this.WinterFlowSingletonPlatform = new WinterFlowQueryPackage();
        this.WinterFlowRouterAdapter = i;
        this.WinterFlowSerializerStructure = -1;
    }

    public static void WinterFlowConsumerUserManager(WinterFlowServiceProviderListener winterFlowServiceProviderListener) {
        int i = winterFlowServiceProviderListener.WinterFlowSerializerStructure;
        int WinterFlowConcurrencyThread = winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i);
        int[] iArr = winterFlowServiceProviderListener.WinterFlowHookDataSource;
        int i2 = (WinterFlowConcurrencyThread * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        winterFlowServiceProviderListener.WinterFlowProxyStructure(winterFlowServiceProviderListener.WinterFlowConfigurationSubsystem(iArr, i));
    }

    public static int WinterFlowRouterRouter(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final void WinterFlowArrayHelper(int i, int i2) {
        int i3 = this.WinterFlowServerProtocol;
        int i4 = this.WinterFlowTransactionAgent;
        int i5 = this.WinterFlowThreadListener;
        if (i4 != i) {
            Object[] objArr = this.WinterFlowCacheManagerAgent;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int min = Math.min(i2 + 1, WinterFlowBandwidthObject());
        if (i5 != min) {
            int length = this.WinterFlowCacheManagerAgent.length - i3;
            if (min < i5) {
                int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(min);
                int WinterFlowConcurrencyThread2 = WinterFlowConcurrencyThread(i5);
                int i7 = this.WinterFlowUnitTestResponse;
                while (WinterFlowConcurrencyThread < WinterFlowConcurrencyThread2) {
                    int i8 = (WinterFlowConcurrencyThread * 5) + 4;
                    int i9 = this.WinterFlowHookDataSource[i8];
                    if (i9 < 0) {
                        WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Unexpected anchor value, expected a positive anchor");
                    }
                    this.WinterFlowHookDataSource[i8] = -((length - i9) + 1);
                    WinterFlowConcurrencyThread++;
                    if (WinterFlowConcurrencyThread == i7) {
                        WinterFlowConcurrencyThread += this.WinterFlowRouterRouter;
                    }
                }
            } else {
                int WinterFlowConcurrencyThread3 = WinterFlowConcurrencyThread(i5);
                int WinterFlowConcurrencyThread4 = WinterFlowConcurrencyThread(min);
                while (WinterFlowConcurrencyThread3 < WinterFlowConcurrencyThread4) {
                    int i10 = (WinterFlowConcurrencyThread3 * 5) + 4;
                    int i11 = this.WinterFlowHookDataSource[i10];
                    if (i11 >= 0) {
                        WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Unexpected anchor value, expected a negative anchor");
                    }
                    this.WinterFlowHookDataSource[i10] = i11 + length + 1;
                    WinterFlowConcurrencyThread3++;
                    if (WinterFlowConcurrencyThread3 == this.WinterFlowUnitTestResponse) {
                        WinterFlowConcurrencyThread3 += this.WinterFlowRouterRouter;
                    }
                }
            }
            this.WinterFlowThreadListener = min;
        }
        this.WinterFlowTransactionAgent = i;
    }

    public final void WinterFlowArrayNetwork() {
        int i = this.WinterFlowServiceUtility;
        this.WinterFlowServiceUtility = i + 1;
        if (i == 0) {
            this.WinterFlowConcurrencyThread.WinterFlowCacheManagerAgent((WinterFlowServiceUtility() - this.WinterFlowRouterRouter) - this.WinterFlowRouterAdapter);
        }
    }

    public final void WinterFlowBackendCacheManager(WinterFlowMapperInterface winterFlowMapperInterface, int i) {
        if (this.WinterFlowServiceUtility <= 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Check failed");
        }
        if (i == 0 && this.WinterFlowBatchUI == 0 && this.WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy == 0) {
            int[] iArr = winterFlowMapperInterface.WinterFlowVariableVersionControl;
            int i2 = iArr[(i * 5) + 3];
            int i3 = winterFlowMapperInterface.WinterFlowTransactionManagerStrategy;
            if (i2 == i3) {
                int[] iArr2 = this.WinterFlowHookDataSource;
                Object[] objArr = this.WinterFlowCacheManagerAgent;
                ArrayList arrayList = this.WinterFlowArrayNetwork;
                HashMap hashMap = this.WinterFlowVariableVersionControl;
                WinterFlowViewSoftware winterFlowViewSoftware = this.WinterFlowTransactionManagerStrategy;
                Object[] objArr2 = winterFlowMapperInterface.WinterFlowUnitTestResponse;
                int i4 = winterFlowMapperInterface.WinterFlowRouterRouter;
                HashMap hashMap2 = winterFlowMapperInterface.WinterFlowServiceUtility;
                WinterFlowViewSoftware winterFlowViewSoftware2 = winterFlowMapperInterface.WinterFlowBandwidthObject;
                this.WinterFlowHookDataSource = iArr;
                this.WinterFlowCacheManagerAgent = objArr2;
                this.WinterFlowArrayNetwork = winterFlowMapperInterface.WinterFlowThreadListener;
                this.WinterFlowUnitTestResponse = i3;
                this.WinterFlowRouterRouter = (iArr.length / 5) - i3;
                this.WinterFlowTransactionAgent = i4;
                this.WinterFlowServerProtocol = objArr2.length - i4;
                this.WinterFlowThreadListener = i3;
                this.WinterFlowVariableVersionControl = hashMap2;
                this.WinterFlowTransactionManagerStrategy = winterFlowViewSoftware2;
                winterFlowMapperInterface.WinterFlowVariableVersionControl = iArr2;
                winterFlowMapperInterface.WinterFlowTransactionManagerStrategy = 0;
                winterFlowMapperInterface.WinterFlowUnitTestResponse = objArr;
                winterFlowMapperInterface.WinterFlowRouterRouter = 0;
                winterFlowMapperInterface.WinterFlowThreadListener = arrayList;
                winterFlowMapperInterface.WinterFlowServiceUtility = hashMap;
                winterFlowMapperInterface.WinterFlowBandwidthObject = winterFlowViewSoftware;
                return;
            }
        }
        WinterFlowServiceProviderListener WinterFlowVariableVersionControl = winterFlowMapperInterface.WinterFlowVariableVersionControl();
        try {
            WinterFlowNodeVersion.WinterFlowServiceUtility(WinterFlowVariableVersionControl, i, this, true, true, false);
            WinterFlowVariableVersionControl.WinterFlowVariableVersionControl(true);
        } catch (Throwable th) {
            WinterFlowVariableVersionControl.WinterFlowVariableVersionControl(false);
            throw th;
        }
    }

    public final int WinterFlowBandwidthObject() {
        return WinterFlowServiceUtility() - this.WinterFlowRouterRouter;
    }

    public final int WinterFlowBatchUI(int i) {
        return this.WinterFlowHookDataSource[(WinterFlowConcurrencyThread(i) * 5) + 3];
    }

    public final int WinterFlowCacheManagerAgent(WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler) {
        int i = winterFlowDatabaseSchemaHandler.WinterFlowRouterStructure;
        return i < 0 ? WinterFlowBandwidthObject() + i : i;
    }

    public final void WinterFlowCacheManagerListener() {
        int i;
        WinterFlowTransactionStructure winterFlowTransactionStructure = this.WinterFlowResolverController;
        if (winterFlowTransactionStructure != null) {
            while (winterFlowTransactionStructure.WinterFlowHookDataSource != 0) {
                int WinterFlowVariableBandwidth = WinterFlowNodeVersion.WinterFlowVariableBandwidth(winterFlowTransactionStructure);
                int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(WinterFlowVariableBandwidth);
                int i2 = WinterFlowVariableBandwidth + 1;
                int WinterFlowBatchUI = WinterFlowBatchUI(WinterFlowVariableBandwidth) + WinterFlowVariableBandwidth;
                while (true) {
                    if (i2 >= WinterFlowBatchUI) {
                        i = 0;
                        break;
                    } else {
                        if ((this.WinterFlowHookDataSource[(WinterFlowConcurrencyThread(i2) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        i2 += WinterFlowBatchUI(i2);
                    }
                }
                int[] iArr = this.WinterFlowHookDataSource;
                int i3 = (WinterFlowConcurrencyThread * 5) + 1;
                int i4 = iArr[i3];
                if (((67108864 & i4) != 0 ? 1 : 0) != i) {
                    iArr[i3] = (i << 26) | ((-67108865) & i4);
                    int WinterFlowConfigurationSubsystem = WinterFlowConfigurationSubsystem(iArr, WinterFlowVariableBandwidth);
                    if (WinterFlowConfigurationSubsystem >= 0) {
                        WinterFlowNodeVersion.WinterFlowRouterStructure(winterFlowTransactionStructure, WinterFlowConfigurationSubsystem);
                    }
                }
            }
        }
    }

    public final void WinterFlowCacheTool(Object obj) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(this.WinterFlowBatchUI);
        int i = (WinterFlowConcurrencyThread * 5) + 1;
        if ((this.WinterFlowHookDataSource[i] & 268435456) == 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.WinterFlowCacheManagerAgent;
        int[] iArr = this.WinterFlowHookDataSource;
        objArr[WinterFlowUnitTestResponse(Integer.bitCount(iArr[i] >> 29) + WinterFlowTransactionManagerStrategy(iArr, WinterFlowConcurrencyThread))] = obj;
    }

    public final void WinterFlowCloudMicroservice() {
        if (this.WinterFlowServiceUtility != 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Key must be supplied when inserting");
        }
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
        WinterFlowUIMiddleware(0, winterFlowThreadPoolProcess, winterFlowThreadPoolProcess, false);
    }

    public final int WinterFlowCompilerHandler(int[] iArr, int i) {
        if (i >= WinterFlowServiceUtility()) {
            return this.WinterFlowCacheManagerAgent.length - this.WinterFlowServerProtocol;
        }
        int WinterFlowArrayNetwork = WinterFlowQueryTool.WinterFlowArrayNetwork(iArr, i);
        return WinterFlowArrayNetwork < 0 ? (this.WinterFlowCacheManagerAgent.length - this.WinterFlowServerProtocol) + WinterFlowArrayNetwork + 1 : WinterFlowArrayNetwork;
    }

    public final Object WinterFlowCompilerVariable(int i) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(i);
        int[] iArr = this.WinterFlowHookDataSource;
        if ((iArr[(WinterFlowConcurrencyThread * 5) + 1] & 1073741824) != 0) {
            return this.WinterFlowCacheManagerAgent[WinterFlowUnitTestResponse(WinterFlowTransactionManagerStrategy(iArr, WinterFlowConcurrencyThread))];
        }
        return null;
    }

    public final int WinterFlowConcurrencyThread(int i) {
        return (this.WinterFlowRouterRouter * (i < this.WinterFlowUnitTestResponse ? 0 : 1)) + i;
    }

    public final void WinterFlowConfiguration(int i, Object obj) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(i);
        int[] iArr = this.WinterFlowHookDataSource;
        if (WinterFlowConcurrencyThread >= iArr.length || (iArr[(WinterFlowConcurrencyThread * 5) + 1] & 1073741824) == 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.WinterFlowCacheManagerAgent[WinterFlowUnitTestResponse(WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, WinterFlowConcurrencyThread))] = obj;
    }

    public final int WinterFlowConfigurationSubsystem(int[] iArr, int i) {
        int i2 = iArr[(WinterFlowConcurrencyThread(i) * 5) + 2];
        return i2 > -2 ? i2 : (WinterFlowBandwidthObject() + i2) - (-2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        r2 = r8.WinterFlowHookDataSource;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
    
        if (r9 >= r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        com.google.android.datatransport.WinterFlowProtocolPipeline.WinterFlowCompilerHandler(r2, r2, r4 + r3, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        com.google.android.datatransport.WinterFlowProtocolPipeline.WinterFlowCompilerHandler(r2, r2, r5, r5 + r4, r3 + r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowEventEmitterController(int i) {
        WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler;
        int i2;
        WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler2;
        int i3;
        int i4;
        int i5 = this.WinterFlowRouterRouter;
        int i6 = this.WinterFlowUnitTestResponse;
        if (i6 != i) {
            if (!this.WinterFlowArrayNetwork.isEmpty()) {
                int WinterFlowServiceUtility = WinterFlowServiceUtility() - this.WinterFlowRouterRouter;
                ArrayList arrayList = this.WinterFlowArrayNetwork;
                if (i6 < i) {
                    for (int WinterFlowHookDataSource = WinterFlowQueryTool.WinterFlowHookDataSource(arrayList, i6, WinterFlowServiceUtility); WinterFlowHookDataSource < this.WinterFlowArrayNetwork.size() && (i3 = (winterFlowDatabaseSchemaHandler2 = (WinterFlowDatabaseSchemaHandler) this.WinterFlowArrayNetwork.get(WinterFlowHookDataSource)).WinterFlowRouterStructure) < 0 && (i4 = i3 + WinterFlowServiceUtility) < i; WinterFlowHookDataSource++) {
                        winterFlowDatabaseSchemaHandler2.WinterFlowRouterStructure = i4;
                    }
                } else {
                    for (int WinterFlowHookDataSource2 = WinterFlowQueryTool.WinterFlowHookDataSource(arrayList, i, WinterFlowServiceUtility); WinterFlowHookDataSource2 < this.WinterFlowArrayNetwork.size() && (i2 = (winterFlowDatabaseSchemaHandler = (WinterFlowDatabaseSchemaHandler) this.WinterFlowArrayNetwork.get(WinterFlowHookDataSource2)).WinterFlowRouterStructure) >= 0; WinterFlowHookDataSource2++) {
                        winterFlowDatabaseSchemaHandler.WinterFlowRouterStructure = -(WinterFlowServiceUtility - i2);
                    }
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int WinterFlowServiceUtility2 = WinterFlowServiceUtility();
            if (i6 >= WinterFlowServiceUtility2) {
                WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Check failed");
            }
            while (i6 < WinterFlowServiceUtility2) {
                int i7 = (i6 * 5) + 2;
                int i8 = this.WinterFlowHookDataSource[i7];
                int WinterFlowBandwidthObject = i8 > -2 ? i8 : (WinterFlowBandwidthObject() + i8) - (-2);
                if (WinterFlowBandwidthObject >= i) {
                    WinterFlowBandwidthObject = -((WinterFlowBandwidthObject() - WinterFlowBandwidthObject) - (-2));
                }
                if (WinterFlowBandwidthObject != i8) {
                    this.WinterFlowHookDataSource[i7] = WinterFlowBandwidthObject;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.WinterFlowUnitTestResponse = i;
    }

    public final WinterFlowSchedulerAgent WinterFlowFrontendBackend(int i) {
        WinterFlowDatabaseSchemaHandler WinterFlowQueueService;
        HashMap hashMap = this.WinterFlowVariableVersionControl;
        if (hashMap == null || (WinterFlowQueueService = WinterFlowQueueService(i)) == null) {
            return null;
        }
        return (WinterFlowSchedulerAgent) hashMap.get(WinterFlowQueueService);
    }

    public final WinterFlowDatabaseSchemaHandler WinterFlowHookDataSource(int i) {
        ArrayList arrayList = this.WinterFlowArrayNetwork;
        int WinterFlowCacheManagerAgent = WinterFlowQueryTool.WinterFlowCacheManagerAgent(arrayList, i, WinterFlowBandwidthObject());
        if (WinterFlowCacheManagerAgent >= 0) {
            return (WinterFlowDatabaseSchemaHandler) arrayList.get(WinterFlowCacheManagerAgent);
        }
        if (i > this.WinterFlowUnitTestResponse) {
            i = -(WinterFlowBandwidthObject() - i);
        }
        WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler = new WinterFlowDatabaseSchemaHandler(i);
        arrayList.add(-(WinterFlowCacheManagerAgent + 1), winterFlowDatabaseSchemaHandler);
        return winterFlowDatabaseSchemaHandler;
    }

    public final void WinterFlowMapperProtocol(int i, int i2) {
        if (i > 0) {
            WinterFlowArrayHelper(this.WinterFlowSyntax, i2);
            int i3 = this.WinterFlowTransactionAgent;
            int i4 = this.WinterFlowServerProtocol;
            if (i4 < i) {
                Object[] objArr = this.WinterFlowCacheManagerAgent;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.WinterFlowCacheManagerAgent = objArr2;
                i4 = i7;
            }
            int i9 = this.WinterFlowResponseEngine;
            if (i9 >= i3) {
                this.WinterFlowResponseEngine = i9 + i;
            }
            this.WinterFlowTransactionAgent = i3 + i;
            this.WinterFlowServerProtocol = i4 - i;
        }
    }

    public final Object WinterFlowOrchestrationSubsystem(int i) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(i);
        int[] iArr = this.WinterFlowHookDataSource;
        int i2 = (WinterFlowConcurrencyThread * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return WinterFlowModuleModule.WinterFlowRouterStructure;
        }
        return this.WinterFlowCacheManagerAgent[Integer.bitCount(iArr[i2] >> 29) + WinterFlowTransactionManagerStrategy(iArr, WinterFlowConcurrencyThread)];
    }

    public final boolean WinterFlowPackageIDE() {
        if (this.WinterFlowServiceUtility != 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Cannot remove group while inserting");
        }
        int i = this.WinterFlowBatchUI;
        int i2 = this.WinterFlowSyntax;
        int WinterFlowTransactionManagerStrategy = WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, WinterFlowConcurrencyThread(i));
        int WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem();
        WinterFlowFrontendBackend(this.WinterFlowSerializerStructure);
        WinterFlowTransactionStructure winterFlowTransactionStructure = this.WinterFlowResolverController;
        if (winterFlowTransactionStructure != null) {
            while (true) {
                int i3 = winterFlowTransactionStructure.WinterFlowHookDataSource;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    WinterFlowCompilerMechanism.WinterFlowSyntax("IntList is empty.");
                    return false;
                }
                if (winterFlowTransactionStructure.WinterFlowRouterStructure[0] < i) {
                    break;
                }
                WinterFlowNodeVersion.WinterFlowVariableBandwidth(winterFlowTransactionStructure);
            }
        }
        boolean WinterFlowSoftwareProtocol = WinterFlowSoftwareProtocol(i, this.WinterFlowBatchUI - i);
        WinterFlowUserManagerUserManager(WinterFlowTransactionManagerStrategy, this.WinterFlowSyntax - WinterFlowTransactionManagerStrategy, i - 1);
        this.WinterFlowBatchUI = i;
        this.WinterFlowSyntax = i2;
        this.WinterFlowBandwidthObject -= WinterFlowSyntaxSubsystem;
        return WinterFlowSoftwareProtocol;
    }

    public final void WinterFlowProxyStructure(int i) {
        if (i >= 0) {
            WinterFlowTransactionStructure winterFlowTransactionStructure = this.WinterFlowResolverController;
            if (winterFlowTransactionStructure == null) {
                winterFlowTransactionStructure = new WinterFlowTransactionStructure();
                this.WinterFlowResolverController = winterFlowTransactionStructure;
            }
            WinterFlowNodeVersion.WinterFlowRouterStructure(winterFlowTransactionStructure, i);
        }
    }

    public final WinterFlowDatabaseSchemaHandler WinterFlowQueueService(int i) {
        ArrayList arrayList;
        int WinterFlowCacheManagerAgent;
        if (i < 0 || i >= WinterFlowBandwidthObject() || (WinterFlowCacheManagerAgent = WinterFlowQueryTool.WinterFlowCacheManagerAgent((arrayList = this.WinterFlowArrayNetwork), i, WinterFlowBandwidthObject())) < 0) {
            return null;
        }
        return (WinterFlowDatabaseSchemaHandler) arrayList.get(WinterFlowCacheManagerAgent);
    }

    public final boolean WinterFlowResolverController(int i) {
        return (this.WinterFlowHookDataSource[(WinterFlowConcurrencyThread(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void WinterFlowResponseEngine() {
        if (this.WinterFlowServiceUtility <= 0) {
            WinterFlowResponseCloud.WinterFlowHookDataSource("Unbalanced begin/end insert");
        }
        int i = this.WinterFlowServiceUtility - 1;
        this.WinterFlowServiceUtility = i;
        if (i == 0) {
            if (this.WinterFlowSingletonPlatform.WinterFlowHookDataSource != this.WinterFlowOrchestrationSubsystem.WinterFlowHookDataSource) {
                WinterFlowSessionManagerEntity.WinterFlowRouterStructure("startGroup/endGroup mismatch while inserting");
            }
            this.WinterFlowRouterAdapter = (WinterFlowServiceUtility() - this.WinterFlowRouterRouter) - this.WinterFlowConcurrencyThread.WinterFlowHookDataSource();
        }
    }

    public final boolean WinterFlowRouterAdapter(int i, int i2) {
        int WinterFlowServiceUtility;
        int WinterFlowBatchUI;
        if (i2 == this.WinterFlowSerializerStructure) {
            WinterFlowServiceUtility = this.WinterFlowRouterAdapter;
        } else {
            WinterFlowQueryPackage winterFlowQueryPackage = this.WinterFlowOrchestrationSubsystem;
            if (i2 > winterFlowQueryPackage.WinterFlowRouterStructure(0)) {
                WinterFlowBatchUI = WinterFlowBatchUI(i2);
            } else {
                int[] iArr = winterFlowQueryPackage.WinterFlowRouterStructure;
                int min = Math.min(iArr.length, winterFlowQueryPackage.WinterFlowHookDataSource);
                int i3 = 0;
                while (true) {
                    if (i3 >= min) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    WinterFlowBatchUI = WinterFlowBatchUI(i2);
                } else {
                    WinterFlowServiceUtility = (WinterFlowServiceUtility() - this.WinterFlowRouterRouter) - this.WinterFlowConcurrencyThread.WinterFlowRouterStructure[i3];
                }
            }
            WinterFlowServiceUtility = WinterFlowBatchUI + i2;
        }
        return i > i2 && i < WinterFlowServiceUtility;
    }

    public final void WinterFlowRouterStructure(int i) {
        if (i < 0) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Cannot seek backwards");
        }
        if (this.WinterFlowServiceUtility > 0) {
            WinterFlowResponseCloud.WinterFlowHookDataSource("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.WinterFlowBatchUI + i;
        if (i2 < this.WinterFlowSerializerStructure || i2 > this.WinterFlowRouterAdapter) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Cannot seek outside the current group (" + this.WinterFlowSerializerStructure + '-' + this.WinterFlowRouterAdapter + ')');
        }
        this.WinterFlowBatchUI = i2;
        int WinterFlowTransactionManagerStrategy = WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, WinterFlowConcurrencyThread(i2));
        this.WinterFlowSyntax = WinterFlowTransactionManagerStrategy;
        this.WinterFlowResponseEngine = WinterFlowTransactionManagerStrategy;
    }

    public final void WinterFlowSerializerStructure(int i) {
        if (i > 0) {
            int i2 = this.WinterFlowBatchUI;
            WinterFlowEventEmitterController(i2);
            int i3 = this.WinterFlowUnitTestResponse;
            int i4 = this.WinterFlowRouterRouter;
            int[] iArr = this.WinterFlowHookDataSource;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i6 = max - i5;
                WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr, iArr2, 0, 0, i3 * 5);
                WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.WinterFlowHookDataSource = iArr2;
                i4 = i6;
                iArr = iArr2;
            }
            int i7 = this.WinterFlowRouterAdapter;
            if (i7 >= i3) {
                this.WinterFlowRouterAdapter = i7 + i;
            }
            int i8 = i3 + i;
            this.WinterFlowUnitTestResponse = i8;
            this.WinterFlowRouterRouter = i4 - i;
            int WinterFlowRouterRouter = WinterFlowRouterRouter(i5 > 0 ? WinterFlowTransactionManagerStrategy(iArr, WinterFlowConcurrencyThread(i2 + i)) : 0, this.WinterFlowThreadListener >= i3 ? this.WinterFlowTransactionAgent : 0, this.WinterFlowServerProtocol, this.WinterFlowCacheManagerAgent.length);
            for (int i9 = i3; i9 < i8; i9++) {
                this.WinterFlowHookDataSource[(i9 * 5) + 4] = WinterFlowRouterRouter;
            }
            int i10 = this.WinterFlowThreadListener;
            if (i10 >= i3) {
                this.WinterFlowThreadListener = i10 + i;
            }
        }
    }

    public final void WinterFlowServerProtocol(int i, int i2, int i3) {
        if (i >= this.WinterFlowUnitTestResponse) {
            i = -((WinterFlowBandwidthObject() - i) + 2);
        }
        while (i3 < i2) {
            this.WinterFlowHookDataSource[(WinterFlowConcurrencyThread(i3) * 5) + 2] = i;
            int i4 = this.WinterFlowHookDataSource[(WinterFlowConcurrencyThread(i3) * 5) + 3] + i3;
            WinterFlowServerProtocol(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int WinterFlowServiceUtility() {
        return this.WinterFlowHookDataSource.length / 5;
    }

    public final int WinterFlowSingletonPlatform(int i) {
        return this.WinterFlowHookDataSource[WinterFlowConcurrencyThread(i) * 5];
    }

    public final Object WinterFlowSoftwareEngine(int i, int i2, Object obj) {
        int WinterFlowCompilerHandler = WinterFlowCompilerHandler(this.WinterFlowHookDataSource, WinterFlowConcurrencyThread(i));
        int WinterFlowTransactionManagerStrategy = WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, WinterFlowConcurrencyThread(i + 1));
        int i3 = WinterFlowCompilerHandler + i2;
        if (i3 < WinterFlowCompilerHandler || i3 >= WinterFlowTransactionManagerStrategy) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int WinterFlowUnitTestResponse = WinterFlowUnitTestResponse(i3);
        Object[] objArr = this.WinterFlowCacheManagerAgent;
        Object obj2 = objArr[WinterFlowUnitTestResponse];
        objArr[WinterFlowUnitTestResponse] = obj;
        return obj2;
    }

    public final boolean WinterFlowSoftwareProtocol(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.WinterFlowArrayNetwork;
            WinterFlowEventEmitterController(i);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.WinterFlowVariableVersionControl;
                int i3 = i + i2;
                int WinterFlowHookDataSource = WinterFlowQueryTool.WinterFlowHookDataSource(this.WinterFlowArrayNetwork, i3, WinterFlowServiceUtility() - this.WinterFlowRouterRouter);
                if (WinterFlowHookDataSource >= this.WinterFlowArrayNetwork.size()) {
                    WinterFlowHookDataSource--;
                }
                int i4 = WinterFlowHookDataSource + 1;
                int i5 = 0;
                while (WinterFlowHookDataSource >= 0) {
                    WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler = (WinterFlowDatabaseSchemaHandler) this.WinterFlowArrayNetwork.get(WinterFlowHookDataSource);
                    int WinterFlowCacheManagerAgent = WinterFlowCacheManagerAgent(winterFlowDatabaseSchemaHandler);
                    if (WinterFlowCacheManagerAgent < i) {
                        break;
                    }
                    if (WinterFlowCacheManagerAgent < i3) {
                        winterFlowDatabaseSchemaHandler.WinterFlowRouterStructure = Integer.MIN_VALUE;
                        if (hashMap != null) {
                        }
                        if (i5 == 0) {
                            i5 = WinterFlowHookDataSource + 1;
                        }
                        i4 = WinterFlowHookDataSource;
                    }
                    WinterFlowHookDataSource--;
                }
                r0 = i4 < i5;
                if (r0) {
                    this.WinterFlowArrayNetwork.subList(i4, i5).clear();
                }
            }
            this.WinterFlowUnitTestResponse = i;
            this.WinterFlowRouterRouter += i2;
            int i6 = this.WinterFlowThreadListener;
            if (i6 > i) {
                this.WinterFlowThreadListener = Math.max(i, i6 - i2);
            }
            int i7 = this.WinterFlowRouterAdapter;
            if (i7 >= this.WinterFlowUnitTestResponse) {
                this.WinterFlowRouterAdapter = i7 - i2;
            }
            int i8 = this.WinterFlowSerializerStructure;
            if (i8 >= 0 && (this.WinterFlowHookDataSource[(WinterFlowConcurrencyThread(i8) * 5) + 1] & 67108864) != 0) {
                WinterFlowProxyStructure(i8);
            }
        }
        return r0;
    }

    public final Object WinterFlowStrategyTool(Object obj) {
        if (this.WinterFlowServiceUtility > 0) {
            WinterFlowMapperProtocol(1, this.WinterFlowSerializerStructure);
        }
        Object[] objArr = this.WinterFlowCacheManagerAgent;
        int i = this.WinterFlowSyntax;
        this.WinterFlowSyntax = i + 1;
        Object obj2 = objArr[WinterFlowUnitTestResponse(i)];
        if (this.WinterFlowSyntax > this.WinterFlowResponseEngine) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Writing to an invalid slot");
        }
        this.WinterFlowCacheManagerAgent[WinterFlowUnitTestResponse(this.WinterFlowSyntax - 1)] = obj;
        return obj2;
    }

    public final void WinterFlowSyntax() {
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction;
        boolean z = this.WinterFlowServiceUtility > 0;
        int i = this.WinterFlowBatchUI;
        int i2 = this.WinterFlowRouterAdapter;
        int i3 = this.WinterFlowSerializerStructure;
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(i3);
        int i4 = this.WinterFlowBandwidthObject;
        int i5 = i - i3;
        int i6 = WinterFlowConcurrencyThread * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.WinterFlowHookDataSource[i7] & 1073741824) != 0;
        WinterFlowQueryPackage winterFlowQueryPackage = this.WinterFlowSingletonPlatform;
        if (z) {
            WinterFlowViewSoftware winterFlowViewSoftware = this.WinterFlowVariableBandwidth;
            if (winterFlowViewSoftware != null && (winterFlowMicroserviceFunction = (WinterFlowMicroserviceFunction) winterFlowViewSoftware.WinterFlowHookDataSource(i3)) != null) {
                Object[] objArr = winterFlowMicroserviceFunction.WinterFlowRouterStructure;
                int i8 = winterFlowMicroserviceFunction.WinterFlowHookDataSource;
                for (int i9 = 0; i9 < i8; i9++) {
                    WinterFlowStrategyTool(objArr[i9]);
                }
            }
            int[] iArr = this.WinterFlowHookDataSource;
            iArr[i6 + 3] = i5;
            WinterFlowQueryTool.WinterFlowTransactionManagerStrategy(iArr, WinterFlowConcurrencyThread, i4);
            int WinterFlowHookDataSource = winterFlowQueryPackage.WinterFlowHookDataSource();
            if (z2) {
                i4 = 1;
            }
            this.WinterFlowBandwidthObject = WinterFlowHookDataSource + i4;
            int WinterFlowConfigurationSubsystem = WinterFlowConfigurationSubsystem(this.WinterFlowHookDataSource, i3);
            this.WinterFlowSerializerStructure = WinterFlowConfigurationSubsystem;
            int WinterFlowBandwidthObject = WinterFlowConfigurationSubsystem < 0 ? WinterFlowBandwidthObject() : WinterFlowConcurrencyThread(WinterFlowConfigurationSubsystem + 1);
            int WinterFlowTransactionManagerStrategy = WinterFlowBandwidthObject >= 0 ? WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, WinterFlowBandwidthObject) : 0;
            this.WinterFlowSyntax = WinterFlowTransactionManagerStrategy;
            this.WinterFlowResponseEngine = WinterFlowTransactionManagerStrategy;
            return;
        }
        if (i != i2) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Expected to be at the end of a group");
        }
        int[] iArr2 = this.WinterFlowHookDataSource;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        WinterFlowQueryTool.WinterFlowTransactionManagerStrategy(iArr2, WinterFlowConcurrencyThread, i4);
        int WinterFlowHookDataSource2 = this.WinterFlowOrchestrationSubsystem.WinterFlowHookDataSource();
        this.WinterFlowRouterAdapter = (WinterFlowServiceUtility() - this.WinterFlowRouterRouter) - this.WinterFlowConcurrencyThread.WinterFlowHookDataSource();
        this.WinterFlowSerializerStructure = WinterFlowHookDataSource2;
        int WinterFlowConfigurationSubsystem2 = WinterFlowConfigurationSubsystem(this.WinterFlowHookDataSource, i3);
        int WinterFlowHookDataSource3 = winterFlowQueryPackage.WinterFlowHookDataSource();
        this.WinterFlowBandwidthObject = WinterFlowHookDataSource3;
        if (WinterFlowConfigurationSubsystem2 == WinterFlowHookDataSource2) {
            this.WinterFlowBandwidthObject = WinterFlowHookDataSource3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (WinterFlowConfigurationSubsystem2 != 0 && WinterFlowConfigurationSubsystem2 != WinterFlowHookDataSource2 && (i14 != 0 || i13 != 0)) {
                int WinterFlowConcurrencyThread2 = WinterFlowConcurrencyThread(WinterFlowConfigurationSubsystem2);
                if (i13 != 0) {
                    int[] iArr3 = this.WinterFlowHookDataSource;
                    int i15 = (WinterFlowConcurrencyThread2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.WinterFlowHookDataSource;
                    WinterFlowQueryTool.WinterFlowTransactionManagerStrategy(iArr4, WinterFlowConcurrencyThread2, (iArr4[(WinterFlowConcurrencyThread2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.WinterFlowHookDataSource;
                if ((iArr5[(WinterFlowConcurrencyThread2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                WinterFlowConfigurationSubsystem2 = WinterFlowConfigurationSubsystem(iArr5, WinterFlowConfigurationSubsystem2);
            }
        }
        this.WinterFlowBandwidthObject += i14;
    }

    public final int WinterFlowSyntaxSubsystem() {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(this.WinterFlowBatchUI);
        int i = this.WinterFlowBatchUI;
        int[] iArr = this.WinterFlowHookDataSource;
        int i2 = WinterFlowConcurrencyThread * 5;
        int i3 = iArr[i2 + 3] + i;
        this.WinterFlowBatchUI = i3;
        this.WinterFlowSyntax = WinterFlowTransactionManagerStrategy(iArr, WinterFlowConcurrencyThread(i3));
        int i4 = this.WinterFlowHookDataSource[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void WinterFlowTestingNode() {
        int i = this.WinterFlowRouterAdapter;
        this.WinterFlowBatchUI = i;
        this.WinterFlowSyntax = WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, WinterFlowConcurrencyThread(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0139, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WinterFlowThreadListener(int i, WinterFlowEventEvent winterFlowEventEvent) {
        int i2;
        int i3;
        int i4;
        WinterFlowEventEvent winterFlowEventEvent2 = winterFlowEventEvent;
        int WinterFlowConfigurationSubsystem = WinterFlowConfigurationSubsystem(this.WinterFlowHookDataSource, i);
        int WinterFlowBandwidthObject = WinterFlowBandwidthObject();
        int WinterFlowBatchUI = WinterFlowBatchUI(i) + i;
        int i5 = i;
        WinterFlowMiddlewareFramework winterFlowMiddlewareFramework = null;
        WinterFlowTransactionStructure winterFlowTransactionStructure = null;
        loop0: while (i5 < WinterFlowBatchUI) {
            int WinterFlowTransactionManagerStrategy = WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, WinterFlowConcurrencyThread(i5));
            int i6 = i5 + 1;
            int WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, WinterFlowConcurrencyThread(i6));
            while (WinterFlowTransactionManagerStrategy < WinterFlowTransactionManagerStrategy2) {
                Object obj = this.WinterFlowCacheManagerAgent[WinterFlowUnitTestResponse(WinterFlowTransactionManagerStrategy)];
                if (obj instanceof WinterFlowFrontendHandler) {
                    WinterFlowFrontendHandler winterFlowFrontendHandler = (WinterFlowFrontendHandler) obj;
                    if (!(winterFlowFrontendHandler instanceof WinterFlowFrontendHandler)) {
                        winterFlowFrontendHandler = null;
                    }
                    if (winterFlowFrontendHandler == null) {
                        WinterFlowSessionManagerEntity.WinterFlowHookDataSource("Inconsistent composition");
                        throw new WinterFlowServerSystem();
                    }
                    int i7 = winterFlowFrontendHandler.WinterFlowHookDataSource;
                    if (i7 >= 0) {
                        int WinterFlowBatchUI2 = WinterFlowBatchUI(i5) + i5;
                        int i8 = i6;
                        int i9 = 0;
                        while (i8 < WinterFlowBatchUI2 && i9 < i7) {
                            int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(i8);
                            int i10 = WinterFlowConfigurationSubsystem;
                            int[] iArr = this.WinterFlowHookDataSource;
                            int i11 = WinterFlowConcurrencyThread * 5;
                            i8 = iArr[i11 + 3] + i8;
                            if (i8 < WinterFlowBatchUI2 && (iArr[i11 + 1] & 536870912) == 0) {
                                i9++;
                            }
                            WinterFlowConfigurationSubsystem = i10;
                        }
                        i4 = WinterFlowConfigurationSubsystem;
                        if (winterFlowMiddlewareFramework == null) {
                            int[] iArr2 = WinterFlowConfigurationUtility.WinterFlowRouterStructure;
                            winterFlowMiddlewareFramework = new WinterFlowMiddlewareFramework();
                        }
                        if (winterFlowTransactionStructure == null) {
                            winterFlowTransactionStructure = new WinterFlowTransactionStructure();
                        }
                        winterFlowMiddlewareFramework.WinterFlowRouterStructure(i8);
                        winterFlowTransactionStructure.WinterFlowRouterStructure(i8);
                        winterFlowTransactionStructure.WinterFlowRouterStructure(WinterFlowTransactionManagerStrategy);
                        WinterFlowTransactionManagerStrategy++;
                        WinterFlowConfigurationSubsystem = i4;
                    }
                }
                i4 = WinterFlowConfigurationSubsystem;
                winterFlowEventEvent2.WinterFlowVariableVersionControl(Integer.valueOf(WinterFlowTransactionManagerStrategy), obj);
                WinterFlowTransactionManagerStrategy++;
                WinterFlowConfigurationSubsystem = i4;
            }
            int i12 = WinterFlowConfigurationSubsystem;
            WinterFlowConfigurationSubsystem = i6 < WinterFlowBandwidthObject ? WinterFlowConfigurationSubsystem(this.WinterFlowHookDataSource, i6) : -1;
            if (WinterFlowConfigurationSubsystem != i5) {
                int i13 = i12;
                while (true) {
                    if (winterFlowTransactionStructure == null || winterFlowMiddlewareFramework == null || !winterFlowMiddlewareFramework.WinterFlowVariableVersionControl(i5)) {
                        i2 = WinterFlowBandwidthObject;
                    } else {
                        int i14 = winterFlowTransactionStructure.WinterFlowHookDataSource;
                        int i15 = i14 / 2;
                        int i16 = 0;
                        int i17 = 0;
                        while (i16 < i15) {
                            int i18 = i16 * 2;
                            int i19 = WinterFlowBandwidthObject;
                            int WinterFlowHookDataSource = winterFlowTransactionStructure.WinterFlowHookDataSource(i18);
                            if (WinterFlowHookDataSource == i5) {
                                int WinterFlowHookDataSource2 = winterFlowTransactionStructure.WinterFlowHookDataSource(i18 + 1);
                                winterFlowEventEvent2.WinterFlowVariableVersionControl(Integer.valueOf(WinterFlowHookDataSource2), this.WinterFlowCacheManagerAgent[WinterFlowUnitTestResponse(WinterFlowHookDataSource2)]);
                            } else if (i18 != i17) {
                                int i20 = i17 + 1;
                                winterFlowTransactionStructure.WinterFlowArrayNetwork(i17, WinterFlowHookDataSource);
                                i17 += 2;
                                winterFlowTransactionStructure.WinterFlowArrayNetwork(i20, winterFlowTransactionStructure.WinterFlowHookDataSource(i18 + 1));
                            } else {
                                i17 += 2;
                            }
                            i16++;
                            winterFlowEventEvent2 = winterFlowEventEvent;
                            WinterFlowBandwidthObject = i19;
                        }
                        i2 = WinterFlowBandwidthObject;
                        if (i17 != i14) {
                            if (i17 < 0 || i17 > (i3 = winterFlowTransactionStructure.WinterFlowHookDataSource) || i14 < 0 || i14 > i3) {
                                break loop0;
                            }
                            if (i14 < i17) {
                                WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("The end index must be < start index");
                                return;
                            } else if (i14 != i17) {
                                if (i14 < i3) {
                                    int[] iArr3 = winterFlowTransactionStructure.WinterFlowRouterStructure;
                                    WinterFlowProtocolPipeline.WinterFlowCompilerHandler(iArr3, iArr3, i17, i14, i3);
                                }
                                winterFlowTransactionStructure.WinterFlowHookDataSource -= i14 - i17;
                            }
                        }
                    }
                    if (i5 != i && i13 != WinterFlowConfigurationSubsystem) {
                        i5 = i13;
                        WinterFlowBandwidthObject = i2;
                        i13 = WinterFlowConfigurationSubsystem(this.WinterFlowHookDataSource, i13);
                        winterFlowEventEvent2 = winterFlowEventEvent;
                    }
                }
            } else {
                i2 = WinterFlowBandwidthObject;
            }
            winterFlowEventEvent2 = winterFlowEventEvent;
            i5 = i6;
            WinterFlowBandwidthObject = i2;
        }
    }

    public final void WinterFlowTransactionAgent(int i) {
        boolean z = false;
        if (!(this.WinterFlowServiceUtility <= 0)) {
            WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.WinterFlowSerializerStructure;
        if (i2 != i) {
            if (i >= i2 && i < this.WinterFlowRouterAdapter) {
                z = true;
            }
            if (!z) {
                WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.WinterFlowBatchUI;
            int i4 = this.WinterFlowSyntax;
            int i5 = this.WinterFlowResponseEngine;
            this.WinterFlowBatchUI = i;
            WinterFlowCloudMicroservice();
            this.WinterFlowBatchUI = i3;
            this.WinterFlowSyntax = i4;
            this.WinterFlowResponseEngine = i5;
        }
    }

    public final int WinterFlowTransactionManagerStrategy(int[] iArr, int i) {
        if (i >= WinterFlowServiceUtility()) {
            return this.WinterFlowCacheManagerAgent.length - this.WinterFlowServerProtocol;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.WinterFlowCacheManagerAgent.length - this.WinterFlowServerProtocol) + i2 + 1 : i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void WinterFlowUIMiddleware(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.WinterFlowSerializerStructure;
        Object[] objArr = this.WinterFlowServiceUtility > 0;
        this.WinterFlowSingletonPlatform.WinterFlowCacheManagerAgent(this.WinterFlowBandwidthObject);
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = WinterFlowModuleModule.WinterFlowRouterStructure;
        if (objArr == true) {
            int i4 = this.WinterFlowBatchUI;
            int WinterFlowTransactionManagerStrategy = WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, WinterFlowConcurrencyThread(i4));
            WinterFlowSerializerStructure(1);
            this.WinterFlowSyntax = WinterFlowTransactionManagerStrategy;
            this.WinterFlowResponseEngine = WinterFlowTransactionManagerStrategy;
            int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(i4);
            int i5 = obj != winterFlowThreadPoolProcess ? 1 : 0;
            int i6 = (z || obj2 == winterFlowThreadPoolProcess) ? 0 : 1;
            int WinterFlowRouterRouter = WinterFlowRouterRouter(WinterFlowTransactionManagerStrategy, this.WinterFlowTransactionAgent, this.WinterFlowServerProtocol, this.WinterFlowCacheManagerAgent.length);
            if (WinterFlowRouterRouter >= 0 && this.WinterFlowThreadListener < i4) {
                WinterFlowRouterRouter = -(((this.WinterFlowCacheManagerAgent.length - this.WinterFlowServerProtocol) - WinterFlowRouterRouter) + 1);
            }
            int[] iArr = this.WinterFlowHookDataSource;
            int i7 = this.WinterFlowSerializerStructure;
            int i8 = WinterFlowConcurrencyThread * 5;
            iArr[i8] = i;
            iArr[i8 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i8 + 2] = i7;
            iArr[i8 + 3] = 0;
            iArr[i8 + 4] = WinterFlowRouterRouter;
            int i9 = (z ? 1 : 0) + i5 + i6;
            if (i9 > 0) {
                WinterFlowMapperProtocol(i9, i4);
                Object[] objArr2 = this.WinterFlowCacheManagerAgent;
                int i10 = this.WinterFlowSyntax;
                if (z) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                if (i5 != 0) {
                    objArr2[i10] = obj;
                    i10++;
                }
                if (i6 != 0) {
                    objArr2[i10] = obj2;
                    i10++;
                }
                this.WinterFlowSyntax = i10;
            }
            this.WinterFlowBandwidthObject = 0;
            i2 = i4 + 1;
            this.WinterFlowSerializerStructure = i4;
            this.WinterFlowBatchUI = i2;
            if (i3 >= 0) {
                WinterFlowFrontendBackend(i3);
            }
        } else {
            this.WinterFlowOrchestrationSubsystem.WinterFlowCacheManagerAgent(i3);
            this.WinterFlowConcurrencyThread.WinterFlowCacheManagerAgent((WinterFlowServiceUtility() - this.WinterFlowRouterRouter) - this.WinterFlowRouterAdapter);
            int i11 = this.WinterFlowBatchUI;
            int WinterFlowConcurrencyThread2 = WinterFlowConcurrencyThread(i11);
            if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj2, winterFlowThreadPoolProcess)) {
                if (z) {
                    WinterFlowConfiguration(this.WinterFlowBatchUI, obj2);
                } else {
                    WinterFlowCacheTool(obj2);
                }
            }
            this.WinterFlowSyntax = WinterFlowCompilerHandler(this.WinterFlowHookDataSource, WinterFlowConcurrencyThread2);
            this.WinterFlowResponseEngine = WinterFlowTransactionManagerStrategy(this.WinterFlowHookDataSource, WinterFlowConcurrencyThread(this.WinterFlowBatchUI + 1));
            int[] iArr2 = this.WinterFlowHookDataSource;
            int i12 = WinterFlowConcurrencyThread2 * 5;
            this.WinterFlowBandwidthObject = iArr2[i12 + 1] & 67108863;
            this.WinterFlowSerializerStructure = i11;
            this.WinterFlowBatchUI = i11 + 1;
            i2 = i11 + iArr2[i12 + 3];
        }
        this.WinterFlowRouterAdapter = i2;
    }

    public final int WinterFlowUnitTestResponse(int i) {
        return (this.WinterFlowServerProtocol * (i < this.WinterFlowTransactionAgent ? 0 : 1)) + i;
    }

    public final void WinterFlowUserManagerUserManager(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.WinterFlowServerProtocol;
            int i5 = i + i2;
            WinterFlowArrayHelper(i5, i3);
            this.WinterFlowTransactionAgent = i;
            this.WinterFlowServerProtocol = i4 + i2;
            Arrays.fill(this.WinterFlowCacheManagerAgent, i, i5, (Object) null);
            int i6 = this.WinterFlowResponseEngine;
            if (i6 >= i) {
                this.WinterFlowResponseEngine = i6 - i2;
            }
        }
    }

    public final Object WinterFlowVariableBandwidth(int i) {
        int WinterFlowConcurrencyThread = WinterFlowConcurrencyThread(i);
        int[] iArr = this.WinterFlowHookDataSource;
        int i2 = WinterFlowConcurrencyThread * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.WinterFlowCacheManagerAgent[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final void WinterFlowVariableVersionControl(boolean z) {
        this.WinterFlowMapperProtocol = true;
        if (z && this.WinterFlowOrchestrationSubsystem.WinterFlowHookDataSource == 0) {
            WinterFlowEventEmitterController(WinterFlowBandwidthObject());
            WinterFlowArrayHelper(this.WinterFlowCacheManagerAgent.length - this.WinterFlowServerProtocol, this.WinterFlowUnitTestResponse);
            int i = this.WinterFlowTransactionAgent;
            Arrays.fill(this.WinterFlowCacheManagerAgent, i, this.WinterFlowServerProtocol + i, (Object) null);
            WinterFlowCacheManagerListener();
        }
        int[] iArr = this.WinterFlowHookDataSource;
        int i2 = this.WinterFlowUnitTestResponse;
        Object[] objArr = this.WinterFlowCacheManagerAgent;
        int i3 = this.WinterFlowTransactionAgent;
        ArrayList arrayList = this.WinterFlowArrayNetwork;
        HashMap hashMap = this.WinterFlowVariableVersionControl;
        WinterFlowViewSoftware winterFlowViewSoftware = this.WinterFlowTransactionManagerStrategy;
        WinterFlowMapperInterface winterFlowMapperInterface = this.WinterFlowRouterStructure;
        if (!winterFlowMapperInterface.WinterFlowTransactionAgent) {
            WinterFlowResponseCloud.WinterFlowRouterStructure("Unexpected writer close()");
        }
        winterFlowMapperInterface.WinterFlowTransactionAgent = false;
        winterFlowMapperInterface.WinterFlowVariableVersionControl = iArr;
        winterFlowMapperInterface.WinterFlowTransactionManagerStrategy = i2;
        winterFlowMapperInterface.WinterFlowUnitTestResponse = objArr;
        winterFlowMapperInterface.WinterFlowRouterRouter = i3;
        winterFlowMapperInterface.WinterFlowThreadListener = arrayList;
        winterFlowMapperInterface.WinterFlowServiceUtility = hashMap;
        winterFlowMapperInterface.WinterFlowBandwidthObject = winterFlowViewSoftware;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.WinterFlowBatchUI + " end=" + this.WinterFlowRouterAdapter + " size = " + WinterFlowBandwidthObject() + " gap=" + this.WinterFlowUnitTestResponse + '-' + (this.WinterFlowUnitTestResponse + this.WinterFlowRouterRouter) + ')';
    }
}
