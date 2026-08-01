package com.google.android.datatransport;

import java.util.Arrays;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowLoaderScheduler {
    public static final WinterFlowLoaderScheduler WinterFlowVariableVersionControl = new WinterFlowLoaderScheduler(0, 0, new Object[0], null);
    public Object[] WinterFlowArrayNetwork;
    public final WinterFlowThreadPoolProcess WinterFlowCacheManagerAgent;
    public int WinterFlowHookDataSource;
    public int WinterFlowRouterStructure;

    public WinterFlowLoaderScheduler(int i, int i2, Object[] objArr, WinterFlowThreadPoolProcess winterFlowThreadPoolProcess) {
        this.WinterFlowRouterStructure = i;
        this.WinterFlowHookDataSource = i2;
        this.WinterFlowCacheManagerAgent = winterFlowThreadPoolProcess;
        this.WinterFlowArrayNetwork = objArr;
    }

    public static WinterFlowLoaderScheduler WinterFlowResponseEngine(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, WinterFlowThreadPoolProcess winterFlowThreadPoolProcess) {
        if (i3 > 30) {
            return new WinterFlowLoaderScheduler(0, 0, new Object[]{obj, obj2, obj3, obj4}, winterFlowThreadPoolProcess);
        }
        int WinterFlowTransactionManagerStrategy = WinterFlowPackageProcess.WinterFlowTransactionManagerStrategy(i, i3);
        int WinterFlowTransactionManagerStrategy2 = WinterFlowPackageProcess.WinterFlowTransactionManagerStrategy(i2, i3);
        if (WinterFlowTransactionManagerStrategy != WinterFlowTransactionManagerStrategy2) {
            return new WinterFlowLoaderScheduler((1 << WinterFlowTransactionManagerStrategy) | (1 << WinterFlowTransactionManagerStrategy2), 0, WinterFlowTransactionManagerStrategy < WinterFlowTransactionManagerStrategy2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, winterFlowThreadPoolProcess);
        }
        return new WinterFlowLoaderScheduler(0, 1 << WinterFlowTransactionManagerStrategy, new Object[]{WinterFlowResponseEngine(i, obj, obj2, i2, obj3, obj4, i3 + 5, winterFlowThreadPoolProcess)}, winterFlowThreadPoolProcess);
    }

    public final boolean WinterFlowArrayNetwork(int i, int i2, Object obj) {
        int WinterFlowTransactionManagerStrategy = 1 << WinterFlowPackageProcess.WinterFlowTransactionManagerStrategy(i, i2);
        if (WinterFlowRouterRouter(WinterFlowTransactionManagerStrategy)) {
            return WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy(WinterFlowTransactionManagerStrategy)]);
        }
        if (!WinterFlowSyntax(WinterFlowTransactionManagerStrategy)) {
            return false;
        }
        WinterFlowLoaderScheduler WinterFlowVariableBandwidth = WinterFlowVariableBandwidth(WinterFlowBatchUI(WinterFlowTransactionManagerStrategy));
        return i2 == 30 ? WinterFlowVariableBandwidth.WinterFlowCacheManagerAgent(obj) : WinterFlowVariableBandwidth.WinterFlowArrayNetwork(i, i2 + 5, obj);
    }

    public final WinterFlowLoaderScheduler WinterFlowBandwidthObject(int i, Object obj, Object obj2, int i2, WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest) {
        WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest2;
        WinterFlowLoaderScheduler WinterFlowBandwidthObject;
        int WinterFlowTransactionManagerStrategy = 1 << WinterFlowPackageProcess.WinterFlowTransactionManagerStrategy(i, i2);
        if (WinterFlowRouterRouter(WinterFlowTransactionManagerStrategy)) {
            int WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy(WinterFlowTransactionManagerStrategy);
            return (WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy2]) && WinterFlowManagerRequest.WinterFlowThreadListener(obj2, WinterFlowResolverController(WinterFlowTransactionManagerStrategy2))) ? WinterFlowOrchestrationSubsystem(WinterFlowTransactionManagerStrategy2, WinterFlowTransactionManagerStrategy, winterFlowTransactionManagerUnitTest) : this;
        }
        if (!WinterFlowSyntax(WinterFlowTransactionManagerStrategy)) {
            return this;
        }
        int WinterFlowBatchUI = WinterFlowBatchUI(WinterFlowTransactionManagerStrategy);
        WinterFlowLoaderScheduler WinterFlowVariableBandwidth = WinterFlowVariableBandwidth(WinterFlowBatchUI);
        if (i2 == 30) {
            WinterFlowWidgetFramework WinterFlowEventEmitterController = WinterFlowDecoratorUI.WinterFlowEventEmitterController(WinterFlowDecoratorUI.WinterFlowArrayHelper(0, WinterFlowVariableBandwidth.WinterFlowArrayNetwork.length));
            int i3 = WinterFlowEventEmitterController.WinterFlowVariableVersionControl;
            int i4 = WinterFlowEventEmitterController.WinterFlowTransactionManagerStrategy;
            int i5 = WinterFlowEventEmitterController.WinterFlowUnitTestResponse;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, WinterFlowVariableBandwidth.WinterFlowArrayNetwork[i3]) || !WinterFlowManagerRequest.WinterFlowThreadListener(obj2, WinterFlowVariableBandwidth.WinterFlowResolverController(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        WinterFlowBandwidthObject = WinterFlowVariableBandwidth.WinterFlowTransactionAgent(i3, winterFlowTransactionManagerUnitTest);
                        break;
                    }
                }
            }
            WinterFlowBandwidthObject = WinterFlowVariableBandwidth;
            winterFlowTransactionManagerUnitTest2 = winterFlowTransactionManagerUnitTest;
        } else {
            winterFlowTransactionManagerUnitTest2 = winterFlowTransactionManagerUnitTest;
            WinterFlowBandwidthObject = WinterFlowVariableBandwidth.WinterFlowBandwidthObject(i, obj, obj2, i2 + 5, winterFlowTransactionManagerUnitTest2);
        }
        return WinterFlowConcurrencyThread(WinterFlowVariableBandwidth, WinterFlowBandwidthObject, WinterFlowBatchUI, WinterFlowTransactionManagerStrategy, winterFlowTransactionManagerUnitTest2.WinterFlowVariableVersionControl);
    }

    public final int WinterFlowBatchUI(int i) {
        return (this.WinterFlowArrayNetwork.length - 1) - Integer.bitCount(this.WinterFlowHookDataSource & (i - 1));
    }

    public final boolean WinterFlowCacheManagerAgent(Object obj) {
        WinterFlowWidgetFramework WinterFlowEventEmitterController = WinterFlowDecoratorUI.WinterFlowEventEmitterController(WinterFlowDecoratorUI.WinterFlowArrayHelper(0, this.WinterFlowArrayNetwork.length));
        int i = WinterFlowEventEmitterController.WinterFlowVariableVersionControl;
        int i2 = WinterFlowEventEmitterController.WinterFlowTransactionManagerStrategy;
        int i3 = WinterFlowEventEmitterController.WinterFlowUnitTestResponse;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowArrayNetwork[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final WinterFlowLoaderScheduler WinterFlowConcurrencyThread(WinterFlowLoaderScheduler winterFlowLoaderScheduler, WinterFlowLoaderScheduler winterFlowLoaderScheduler2, int i, int i2, WinterFlowThreadPoolProcess winterFlowThreadPoolProcess) {
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess2 = this.WinterFlowCacheManagerAgent;
        if (winterFlowLoaderScheduler2 != null) {
            return (winterFlowThreadPoolProcess2 == winterFlowThreadPoolProcess || winterFlowLoaderScheduler != winterFlowLoaderScheduler2) ? WinterFlowSingletonPlatform(i, winterFlowLoaderScheduler2, winterFlowThreadPoolProcess) : this;
        }
        Object[] objArr = this.WinterFlowArrayNetwork;
        if (objArr.length == 1) {
            return null;
        }
        if (winterFlowThreadPoolProcess2 != winterFlowThreadPoolProcess) {
            return new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource ^ i2, WinterFlowPackageProcess.WinterFlowTransactionAgent(i, objArr), winterFlowThreadPoolProcess);
        }
        this.WinterFlowArrayNetwork = WinterFlowPackageProcess.WinterFlowTransactionAgent(i, objArr);
        this.WinterFlowHookDataSource ^= i2;
        return this;
    }

    public final int WinterFlowHookDataSource() {
        if (this.WinterFlowHookDataSource == 0) {
            return this.WinterFlowArrayNetwork.length / 2;
        }
        int bitCount = Integer.bitCount(this.WinterFlowRouterStructure);
        int length = this.WinterFlowArrayNetwork.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += WinterFlowVariableBandwidth(i).WinterFlowHookDataSource();
        }
        return bitCount;
    }

    public final WinterFlowLoaderScheduler WinterFlowMapperProtocol(int i, int i2, WinterFlowLoaderScheduler winterFlowLoaderScheduler) {
        Object[] objArr = winterFlowLoaderScheduler.WinterFlowArrayNetwork;
        if (objArr.length != 2 || winterFlowLoaderScheduler.WinterFlowHookDataSource != 0) {
            Object[] objArr2 = this.WinterFlowArrayNetwork;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = winterFlowLoaderScheduler;
            return new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, copyOf, null);
        }
        if (this.WinterFlowArrayNetwork.length == 1) {
            winterFlowLoaderScheduler.WinterFlowRouterStructure = this.WinterFlowHookDataSource;
            return winterFlowLoaderScheduler;
        }
        int WinterFlowTransactionManagerStrategy = WinterFlowTransactionManagerStrategy(i2);
        Object[] objArr3 = this.WinterFlowArrayNetwork;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(copyOf2, copyOf2, i + 2, i + 1, objArr3.length);
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(copyOf2, copyOf2, WinterFlowTransactionManagerStrategy + 2, WinterFlowTransactionManagerStrategy, i);
        copyOf2[WinterFlowTransactionManagerStrategy] = obj;
        copyOf2[WinterFlowTransactionManagerStrategy + 1] = obj2;
        return new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure ^ i2, this.WinterFlowHookDataSource ^ i2, copyOf2, null);
    }

    public final WinterFlowLoaderScheduler WinterFlowOrchestrationSubsystem(int i, int i2, WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest) {
        winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl(winterFlowTransactionManagerUnitTest.WinterFlowSyntax - 1);
        winterFlowTransactionManagerUnitTest.WinterFlowUnitTestResponse = WinterFlowResolverController(i);
        Object[] objArr = this.WinterFlowArrayNetwork;
        if (objArr.length == 2) {
            return null;
        }
        if (this.WinterFlowCacheManagerAgent != winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl) {
            return new WinterFlowLoaderScheduler(i2 ^ this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, WinterFlowPackageProcess.WinterFlowResponseEngine(i, objArr), winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl);
        }
        this.WinterFlowArrayNetwork = WinterFlowPackageProcess.WinterFlowResponseEngine(i, objArr);
        this.WinterFlowRouterStructure ^= i2;
        return this;
    }

    public final Object WinterFlowResolverController(int i) {
        return this.WinterFlowArrayNetwork[i + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c5, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d1, code lost:
    
        r13.WinterFlowHookDataSource = WinterFlowMapperProtocol(r11, r4, (com.google.android.datatransport.WinterFlowLoaderScheduler) r13.WinterFlowHookDataSource);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ce, code lost:
    
        if (r13 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WinterFlowSyntax WinterFlowRouterAdapter(int i, int i2, Object obj, Object obj2) {
        WinterFlowSyntax WinterFlowRouterAdapter;
        int i3 = 1;
        int WinterFlowTransactionManagerStrategy = 1 << WinterFlowPackageProcess.WinterFlowTransactionManagerStrategy(i, i2);
        int i4 = 0;
        if (WinterFlowRouterRouter(WinterFlowTransactionManagerStrategy)) {
            int WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy(WinterFlowTransactionManagerStrategy);
            if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy2])) {
                return new WinterFlowSyntax(i3, new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure ^ WinterFlowTransactionManagerStrategy, this.WinterFlowHookDataSource | WinterFlowTransactionManagerStrategy, WinterFlowRouterStructure(WinterFlowTransactionManagerStrategy2, WinterFlowTransactionManagerStrategy, i, obj, obj2, i2, null), null));
            }
            if (WinterFlowResolverController(WinterFlowTransactionManagerStrategy2) != obj2) {
                Object[] objArr = this.WinterFlowArrayNetwork;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[WinterFlowTransactionManagerStrategy2 + 1] = obj2;
                return new WinterFlowSyntax(i4, new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, copyOf, null));
            }
        } else {
            if (!WinterFlowSyntax(WinterFlowTransactionManagerStrategy)) {
                return new WinterFlowSyntax(i3, new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure | WinterFlowTransactionManagerStrategy, this.WinterFlowHookDataSource, WinterFlowPackageProcess.WinterFlowUnitTestResponse(this.WinterFlowArrayNetwork, WinterFlowTransactionManagerStrategy(WinterFlowTransactionManagerStrategy), obj, obj2), null));
            }
            int WinterFlowBatchUI = WinterFlowBatchUI(WinterFlowTransactionManagerStrategy);
            WinterFlowLoaderScheduler WinterFlowVariableBandwidth = WinterFlowVariableBandwidth(WinterFlowBatchUI);
            if (i2 == 30) {
                WinterFlowWidgetFramework WinterFlowEventEmitterController = WinterFlowDecoratorUI.WinterFlowEventEmitterController(WinterFlowDecoratorUI.WinterFlowArrayHelper(0, WinterFlowVariableBandwidth.WinterFlowArrayNetwork.length));
                int i5 = WinterFlowEventEmitterController.WinterFlowVariableVersionControl;
                int i6 = WinterFlowEventEmitterController.WinterFlowTransactionManagerStrategy;
                int i7 = WinterFlowEventEmitterController.WinterFlowUnitTestResponse;
                if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                    while (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, WinterFlowVariableBandwidth.WinterFlowArrayNetwork[i5])) {
                        if (i5 != i6) {
                            i5 += i7;
                        }
                    }
                    if (obj2 == WinterFlowVariableBandwidth.WinterFlowResolverController(i5)) {
                        WinterFlowRouterAdapter = null;
                    } else {
                        Object[] objArr2 = WinterFlowVariableBandwidth.WinterFlowArrayNetwork;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i5 + 1] = obj2;
                        WinterFlowRouterAdapter = new WinterFlowSyntax(i4, new WinterFlowLoaderScheduler(0, 0, copyOf2, null));
                    }
                }
                WinterFlowRouterAdapter = new WinterFlowSyntax(i3, new WinterFlowLoaderScheduler(0, 0, WinterFlowPackageProcess.WinterFlowUnitTestResponse(WinterFlowVariableBandwidth.WinterFlowArrayNetwork, 0, obj, obj2), null));
                break;
            }
            WinterFlowRouterAdapter = WinterFlowVariableBandwidth.WinterFlowRouterAdapter(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    public final boolean WinterFlowRouterRouter(int i) {
        return (this.WinterFlowRouterStructure & i) != 0;
    }

    public final Object[] WinterFlowRouterStructure(int i, int i2, int i3, Object obj, Object obj2, int i4, WinterFlowThreadPoolProcess winterFlowThreadPoolProcess) {
        Object obj3 = this.WinterFlowArrayNetwork[i];
        WinterFlowLoaderScheduler WinterFlowResponseEngine = WinterFlowResponseEngine(obj3 != null ? obj3.hashCode() : 0, obj3, WinterFlowResolverController(i), i3, obj, obj2, i4 + 5, winterFlowThreadPoolProcess);
        int WinterFlowBatchUI = WinterFlowBatchUI(i2);
        int i5 = WinterFlowBatchUI + 1;
        Object[] objArr = this.WinterFlowArrayNetwork;
        Object[] objArr2 = new Object[objArr.length - 1];
        WinterFlowProtocolPipeline.WinterFlowQueueService(objArr, objArr2, 0, i, 6);
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr2, i, i + 2, i5);
        objArr2[WinterFlowBatchUI - 1] = WinterFlowResponseEngine;
        WinterFlowProtocolPipeline.WinterFlowCloudMicroservice(objArr, objArr2, WinterFlowBatchUI, i5, objArr.length);
        return objArr2;
    }

    public final WinterFlowLoaderScheduler WinterFlowSerializerStructure(int i, int i2, Object obj) {
        WinterFlowLoaderScheduler WinterFlowSerializerStructure;
        int WinterFlowTransactionManagerStrategy = 1 << WinterFlowPackageProcess.WinterFlowTransactionManagerStrategy(i, i2);
        if (WinterFlowRouterRouter(WinterFlowTransactionManagerStrategy)) {
            int WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy(WinterFlowTransactionManagerStrategy);
            if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy2])) {
                return this;
            }
            Object[] objArr = this.WinterFlowArrayNetwork;
            if (objArr.length != 2) {
                return new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure ^ WinterFlowTransactionManagerStrategy, this.WinterFlowHookDataSource, WinterFlowPackageProcess.WinterFlowResponseEngine(WinterFlowTransactionManagerStrategy2, objArr), null);
            }
        } else {
            if (!WinterFlowSyntax(WinterFlowTransactionManagerStrategy)) {
                return this;
            }
            int WinterFlowBatchUI = WinterFlowBatchUI(WinterFlowTransactionManagerStrategy);
            WinterFlowLoaderScheduler WinterFlowVariableBandwidth = WinterFlowVariableBandwidth(WinterFlowBatchUI);
            if (i2 == 30) {
                WinterFlowWidgetFramework WinterFlowEventEmitterController = WinterFlowDecoratorUI.WinterFlowEventEmitterController(WinterFlowDecoratorUI.WinterFlowArrayHelper(0, WinterFlowVariableBandwidth.WinterFlowArrayNetwork.length));
                int i3 = WinterFlowEventEmitterController.WinterFlowVariableVersionControl;
                int i4 = WinterFlowEventEmitterController.WinterFlowTransactionManagerStrategy;
                int i5 = WinterFlowEventEmitterController.WinterFlowUnitTestResponse;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, WinterFlowVariableBandwidth.WinterFlowArrayNetwork[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = WinterFlowVariableBandwidth.WinterFlowArrayNetwork;
                    WinterFlowSerializerStructure = objArr2.length == 2 ? null : new WinterFlowLoaderScheduler(0, 0, WinterFlowPackageProcess.WinterFlowResponseEngine(i3, objArr2), null);
                }
                WinterFlowSerializerStructure = WinterFlowVariableBandwidth;
                break;
            }
            WinterFlowSerializerStructure = WinterFlowVariableBandwidth.WinterFlowSerializerStructure(i, i2 + 5, obj);
            if (WinterFlowSerializerStructure != null) {
                return WinterFlowVariableBandwidth != WinterFlowSerializerStructure ? WinterFlowMapperProtocol(WinterFlowBatchUI, WinterFlowTransactionManagerStrategy, WinterFlowSerializerStructure) : this;
            }
            Object[] objArr3 = this.WinterFlowArrayNetwork;
            if (objArr3.length != 1) {
                return new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource ^ WinterFlowTransactionManagerStrategy, WinterFlowPackageProcess.WinterFlowTransactionAgent(WinterFlowBatchUI, objArr3), null);
            }
        }
        return null;
    }

    public final WinterFlowLoaderScheduler WinterFlowServerProtocol(int i, Object obj, Object obj2, int i2, WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest) {
        WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest2;
        WinterFlowLoaderScheduler WinterFlowServerProtocol;
        int WinterFlowTransactionManagerStrategy = 1 << WinterFlowPackageProcess.WinterFlowTransactionManagerStrategy(i, i2);
        boolean WinterFlowRouterRouter = WinterFlowRouterRouter(WinterFlowTransactionManagerStrategy);
        WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = this.WinterFlowCacheManagerAgent;
        if (WinterFlowRouterRouter) {
            int WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy(WinterFlowTransactionManagerStrategy);
            if (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy2])) {
                winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl(winterFlowTransactionManagerUnitTest.WinterFlowSyntax + 1);
                WinterFlowThreadPoolProcess winterFlowThreadPoolProcess2 = winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl;
                if (winterFlowThreadPoolProcess != winterFlowThreadPoolProcess2) {
                    return new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure ^ WinterFlowTransactionManagerStrategy, this.WinterFlowHookDataSource | WinterFlowTransactionManagerStrategy, WinterFlowRouterStructure(WinterFlowTransactionManagerStrategy2, WinterFlowTransactionManagerStrategy, i, obj, obj2, i2, winterFlowThreadPoolProcess2), winterFlowThreadPoolProcess2);
                }
                this.WinterFlowArrayNetwork = WinterFlowRouterStructure(WinterFlowTransactionManagerStrategy2, WinterFlowTransactionManagerStrategy, i, obj, obj2, i2, winterFlowThreadPoolProcess2);
                this.WinterFlowRouterStructure ^= WinterFlowTransactionManagerStrategy;
                this.WinterFlowHookDataSource |= WinterFlowTransactionManagerStrategy;
                return this;
            }
            winterFlowTransactionManagerUnitTest.WinterFlowUnitTestResponse = WinterFlowResolverController(WinterFlowTransactionManagerStrategy2);
            if (WinterFlowResolverController(WinterFlowTransactionManagerStrategy2) == obj2) {
                return this;
            }
            if (winterFlowThreadPoolProcess == winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl) {
                this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy2 + 1] = obj2;
                return this;
            }
            winterFlowTransactionManagerUnitTest.WinterFlowRouterRouter++;
            Object[] objArr = this.WinterFlowArrayNetwork;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[WinterFlowTransactionManagerStrategy2 + 1] = obj2;
            return new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, copyOf, winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl);
        }
        if (!WinterFlowSyntax(WinterFlowTransactionManagerStrategy)) {
            winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl(winterFlowTransactionManagerUnitTest.WinterFlowSyntax + 1);
            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess3 = winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl;
            int WinterFlowTransactionManagerStrategy3 = WinterFlowTransactionManagerStrategy(WinterFlowTransactionManagerStrategy);
            Object[] objArr2 = this.WinterFlowArrayNetwork;
            if (winterFlowThreadPoolProcess != winterFlowThreadPoolProcess3) {
                return new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure | WinterFlowTransactionManagerStrategy, this.WinterFlowHookDataSource, WinterFlowPackageProcess.WinterFlowUnitTestResponse(objArr2, WinterFlowTransactionManagerStrategy3, obj, obj2), winterFlowThreadPoolProcess3);
            }
            this.WinterFlowArrayNetwork = WinterFlowPackageProcess.WinterFlowUnitTestResponse(objArr2, WinterFlowTransactionManagerStrategy3, obj, obj2);
            this.WinterFlowRouterStructure |= WinterFlowTransactionManagerStrategy;
            return this;
        }
        int WinterFlowBatchUI = WinterFlowBatchUI(WinterFlowTransactionManagerStrategy);
        WinterFlowLoaderScheduler WinterFlowVariableBandwidth = WinterFlowVariableBandwidth(WinterFlowBatchUI);
        if (i2 == 30) {
            WinterFlowWidgetFramework WinterFlowEventEmitterController = WinterFlowDecoratorUI.WinterFlowEventEmitterController(WinterFlowDecoratorUI.WinterFlowArrayHelper(0, WinterFlowVariableBandwidth.WinterFlowArrayNetwork.length));
            int i3 = WinterFlowEventEmitterController.WinterFlowVariableVersionControl;
            int i4 = WinterFlowEventEmitterController.WinterFlowTransactionManagerStrategy;
            int i5 = WinterFlowEventEmitterController.WinterFlowUnitTestResponse;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, WinterFlowVariableBandwidth.WinterFlowArrayNetwork[i3])) {
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
                winterFlowTransactionManagerUnitTest.WinterFlowUnitTestResponse = WinterFlowVariableBandwidth.WinterFlowResolverController(i3);
                if (WinterFlowVariableBandwidth.WinterFlowCacheManagerAgent == winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl) {
                    WinterFlowVariableBandwidth.WinterFlowArrayNetwork[i3 + 1] = obj2;
                    WinterFlowServerProtocol = WinterFlowVariableBandwidth;
                } else {
                    winterFlowTransactionManagerUnitTest.WinterFlowRouterRouter++;
                    Object[] objArr3 = WinterFlowVariableBandwidth.WinterFlowArrayNetwork;
                    Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    copyOf2[i3 + 1] = obj2;
                    WinterFlowServerProtocol = new WinterFlowLoaderScheduler(0, 0, copyOf2, winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl);
                }
                winterFlowTransactionManagerUnitTest2 = winterFlowTransactionManagerUnitTest;
            }
            winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl(winterFlowTransactionManagerUnitTest.WinterFlowSyntax + 1);
            WinterFlowServerProtocol = new WinterFlowLoaderScheduler(0, 0, WinterFlowPackageProcess.WinterFlowUnitTestResponse(WinterFlowVariableBandwidth.WinterFlowArrayNetwork, 0, obj, obj2), winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl);
            winterFlowTransactionManagerUnitTest2 = winterFlowTransactionManagerUnitTest;
        } else {
            winterFlowTransactionManagerUnitTest2 = winterFlowTransactionManagerUnitTest;
            WinterFlowServerProtocol = WinterFlowVariableBandwidth.WinterFlowServerProtocol(i, obj, obj2, i2 + 5, winterFlowTransactionManagerUnitTest2);
        }
        return WinterFlowVariableBandwidth == WinterFlowServerProtocol ? this : WinterFlowSingletonPlatform(WinterFlowBatchUI, WinterFlowServerProtocol, winterFlowTransactionManagerUnitTest2.WinterFlowVariableVersionControl);
    }

    public final WinterFlowLoaderScheduler WinterFlowServiceUtility(int i, Object obj, int i2, WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest) {
        WinterFlowLoaderScheduler WinterFlowServiceUtility;
        int WinterFlowTransactionManagerStrategy = 1 << WinterFlowPackageProcess.WinterFlowTransactionManagerStrategy(i, i2);
        if (WinterFlowRouterRouter(WinterFlowTransactionManagerStrategy)) {
            int WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy(WinterFlowTransactionManagerStrategy);
            if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy2])) {
                return WinterFlowOrchestrationSubsystem(WinterFlowTransactionManagerStrategy2, WinterFlowTransactionManagerStrategy, winterFlowTransactionManagerUnitTest);
            }
        } else if (WinterFlowSyntax(WinterFlowTransactionManagerStrategy)) {
            int WinterFlowBatchUI = WinterFlowBatchUI(WinterFlowTransactionManagerStrategy);
            WinterFlowLoaderScheduler WinterFlowVariableBandwidth = WinterFlowVariableBandwidth(WinterFlowBatchUI);
            if (i2 == 30) {
                WinterFlowWidgetFramework WinterFlowEventEmitterController = WinterFlowDecoratorUI.WinterFlowEventEmitterController(WinterFlowDecoratorUI.WinterFlowArrayHelper(0, WinterFlowVariableBandwidth.WinterFlowArrayNetwork.length));
                int i3 = WinterFlowEventEmitterController.WinterFlowVariableVersionControl;
                int i4 = WinterFlowEventEmitterController.WinterFlowTransactionManagerStrategy;
                int i5 = WinterFlowEventEmitterController.WinterFlowUnitTestResponse;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, WinterFlowVariableBandwidth.WinterFlowArrayNetwork[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    WinterFlowServiceUtility = WinterFlowVariableBandwidth.WinterFlowTransactionAgent(i3, winterFlowTransactionManagerUnitTest);
                }
                WinterFlowServiceUtility = WinterFlowVariableBandwidth;
                break;
            }
            WinterFlowServiceUtility = WinterFlowVariableBandwidth.WinterFlowServiceUtility(i, obj, i2 + 5, winterFlowTransactionManagerUnitTest);
            return WinterFlowConcurrencyThread(WinterFlowVariableBandwidth, WinterFlowServiceUtility, WinterFlowBatchUI, WinterFlowTransactionManagerStrategy, winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl);
        }
        return this;
    }

    public final WinterFlowLoaderScheduler WinterFlowSingletonPlatform(int i, WinterFlowLoaderScheduler winterFlowLoaderScheduler, WinterFlowThreadPoolProcess winterFlowThreadPoolProcess) {
        Object[] objArr = this.WinterFlowArrayNetwork;
        if (objArr.length == 1 && winterFlowLoaderScheduler.WinterFlowArrayNetwork.length == 2 && winterFlowLoaderScheduler.WinterFlowHookDataSource == 0) {
            winterFlowLoaderScheduler.WinterFlowRouterStructure = this.WinterFlowHookDataSource;
            return winterFlowLoaderScheduler;
        }
        if (this.WinterFlowCacheManagerAgent == winterFlowThreadPoolProcess) {
            objArr[i] = winterFlowLoaderScheduler;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = winterFlowLoaderScheduler;
        return new WinterFlowLoaderScheduler(this.WinterFlowRouterStructure, this.WinterFlowHookDataSource, copyOf, winterFlowThreadPoolProcess);
    }

    public final boolean WinterFlowSyntax(int i) {
        return (this.WinterFlowHookDataSource & i) != 0;
    }

    public final WinterFlowLoaderScheduler WinterFlowThreadListener(WinterFlowLoaderScheduler winterFlowLoaderScheduler, int i, WinterFlowProxyModule winterFlowProxyModule, WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest) {
        Object[] objArr;
        WinterFlowLoaderScheduler WinterFlowResponseEngine;
        if (this == winterFlowLoaderScheduler) {
            winterFlowProxyModule.WinterFlowRouterStructure += WinterFlowHookDataSource();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            WinterFlowThreadPoolProcess winterFlowThreadPoolProcess = winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl;
            int i3 = winterFlowLoaderScheduler.WinterFlowHookDataSource;
            Object[] objArr2 = this.WinterFlowArrayNetwork;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + winterFlowLoaderScheduler.WinterFlowArrayNetwork.length);
            int length = this.WinterFlowArrayNetwork.length;
            WinterFlowWidgetFramework WinterFlowEventEmitterController = WinterFlowDecoratorUI.WinterFlowEventEmitterController(WinterFlowDecoratorUI.WinterFlowArrayHelper(0, winterFlowLoaderScheduler.WinterFlowArrayNetwork.length));
            int i4 = WinterFlowEventEmitterController.WinterFlowVariableVersionControl;
            int i5 = WinterFlowEventEmitterController.WinterFlowTransactionManagerStrategy;
            int i6 = WinterFlowEventEmitterController.WinterFlowUnitTestResponse;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (WinterFlowCacheManagerAgent(winterFlowLoaderScheduler.WinterFlowArrayNetwork[i4])) {
                        winterFlowProxyModule.WinterFlowRouterStructure++;
                    } else {
                        Object[] objArr3 = winterFlowLoaderScheduler.WinterFlowArrayNetwork;
                        copyOf[length] = objArr3[i4];
                        copyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.WinterFlowArrayNetwork.length) {
                return length == winterFlowLoaderScheduler.WinterFlowArrayNetwork.length ? winterFlowLoaderScheduler : length == copyOf.length ? new WinterFlowLoaderScheduler(0, 0, copyOf, winterFlowThreadPoolProcess) : new WinterFlowLoaderScheduler(0, 0, Arrays.copyOf(copyOf, length), winterFlowThreadPoolProcess);
            }
        } else {
            int i7 = this.WinterFlowHookDataSource | winterFlowLoaderScheduler.WinterFlowHookDataSource;
            int i8 = this.WinterFlowRouterStructure;
            int i9 = winterFlowLoaderScheduler.WinterFlowRouterStructure;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i11);
                if (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy(lowestOneBit)], winterFlowLoaderScheduler.WinterFlowArrayNetwork[winterFlowLoaderScheduler.WinterFlowTransactionManagerStrategy(lowestOneBit)])) {
                    i12 |= lowestOneBit;
                } else {
                    i7 |= lowestOneBit;
                }
                i11 ^= lowestOneBit;
            }
            if ((i7 & i12) != 0) {
                WinterFlowResponseCloud.WinterFlowHookDataSource("Check failed.");
            }
            WinterFlowLoaderScheduler winterFlowLoaderScheduler2 = (WinterFlowManagerRequest.WinterFlowThreadListener(this.WinterFlowCacheManagerAgent, winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl) && this.WinterFlowRouterStructure == i12 && this.WinterFlowHookDataSource == i7) ? this : new WinterFlowLoaderScheduler(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = winterFlowLoaderScheduler2.WinterFlowArrayNetwork;
                int length2 = (objArr4.length - 1) - i14;
                if (WinterFlowSyntax(lowestOneBit2)) {
                    WinterFlowResponseEngine = WinterFlowVariableBandwidth(WinterFlowBatchUI(lowestOneBit2));
                    if (winterFlowLoaderScheduler.WinterFlowSyntax(lowestOneBit2)) {
                        WinterFlowResponseEngine = WinterFlowResponseEngine.WinterFlowThreadListener(winterFlowLoaderScheduler.WinterFlowVariableBandwidth(winterFlowLoaderScheduler.WinterFlowBatchUI(lowestOneBit2)), i + 5, winterFlowProxyModule, winterFlowTransactionManagerUnitTest);
                        objArr = objArr4;
                    } else if (winterFlowLoaderScheduler.WinterFlowRouterRouter(lowestOneBit2)) {
                        int WinterFlowTransactionManagerStrategy = winterFlowLoaderScheduler.WinterFlowTransactionManagerStrategy(lowestOneBit2);
                        Object obj = winterFlowLoaderScheduler.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy];
                        Object WinterFlowResolverController = winterFlowLoaderScheduler.WinterFlowResolverController(WinterFlowTransactionManagerStrategy);
                        int i15 = winterFlowTransactionManagerUnitTest.WinterFlowSyntax;
                        objArr = objArr4;
                        WinterFlowResponseEngine = WinterFlowResponseEngine.WinterFlowServerProtocol(obj != null ? obj.hashCode() : i2, obj, WinterFlowResolverController, i + 5, winterFlowTransactionManagerUnitTest);
                        if (winterFlowTransactionManagerUnitTest.WinterFlowSyntax == i15) {
                            winterFlowProxyModule.WinterFlowRouterStructure++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (winterFlowLoaderScheduler.WinterFlowSyntax(lowestOneBit2)) {
                        WinterFlowLoaderScheduler WinterFlowVariableBandwidth = winterFlowLoaderScheduler.WinterFlowVariableBandwidth(winterFlowLoaderScheduler.WinterFlowBatchUI(lowestOneBit2));
                        if (WinterFlowRouterRouter(lowestOneBit2)) {
                            int WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy(lowestOneBit2);
                            Object obj2 = this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy2];
                            int i16 = i + 5;
                            if (WinterFlowVariableBandwidth.WinterFlowArrayNetwork(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                winterFlowProxyModule.WinterFlowRouterStructure++;
                            } else {
                                WinterFlowResponseEngine = WinterFlowVariableBandwidth.WinterFlowServerProtocol(obj2 != null ? obj2.hashCode() : 0, obj2, WinterFlowResolverController(WinterFlowTransactionManagerStrategy2), i16, winterFlowTransactionManagerUnitTest);
                            }
                        }
                        WinterFlowResponseEngine = WinterFlowVariableBandwidth;
                    } else {
                        int WinterFlowTransactionManagerStrategy3 = WinterFlowTransactionManagerStrategy(lowestOneBit2);
                        Object obj3 = this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy3];
                        Object WinterFlowResolverController2 = WinterFlowResolverController(WinterFlowTransactionManagerStrategy3);
                        int WinterFlowTransactionManagerStrategy4 = winterFlowLoaderScheduler.WinterFlowTransactionManagerStrategy(lowestOneBit2);
                        Object obj4 = winterFlowLoaderScheduler.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy4];
                        WinterFlowResponseEngine = WinterFlowResponseEngine(obj3 != null ? obj3.hashCode() : 0, obj3, WinterFlowResolverController2, obj4 != null ? obj4.hashCode() : 0, obj4, winterFlowLoaderScheduler.WinterFlowResolverController(WinterFlowTransactionManagerStrategy4), i + 5, winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl);
                    }
                }
                objArr[length2] = WinterFlowResponseEngine;
                i14++;
                i13 ^= lowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (winterFlowLoaderScheduler.WinterFlowRouterRouter(lowestOneBit3)) {
                    int WinterFlowTransactionManagerStrategy5 = winterFlowLoaderScheduler.WinterFlowTransactionManagerStrategy(lowestOneBit3);
                    Object[] objArr5 = winterFlowLoaderScheduler2.WinterFlowArrayNetwork;
                    objArr5[i18] = winterFlowLoaderScheduler.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy5];
                    objArr5[i18 + 1] = winterFlowLoaderScheduler.WinterFlowResolverController(WinterFlowTransactionManagerStrategy5);
                    if (WinterFlowRouterRouter(lowestOneBit3)) {
                        winterFlowProxyModule.WinterFlowRouterStructure++;
                    }
                } else {
                    int WinterFlowTransactionManagerStrategy6 = WinterFlowTransactionManagerStrategy(lowestOneBit3);
                    Object[] objArr6 = winterFlowLoaderScheduler2.WinterFlowArrayNetwork;
                    objArr6[i18] = this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy6];
                    objArr6[i18 + 1] = WinterFlowResolverController(WinterFlowTransactionManagerStrategy6);
                }
                i17++;
                i12 ^= lowestOneBit3;
            }
            if (!WinterFlowVariableVersionControl(winterFlowLoaderScheduler2)) {
                return winterFlowLoaderScheduler.WinterFlowVariableVersionControl(winterFlowLoaderScheduler2) ? winterFlowLoaderScheduler : winterFlowLoaderScheduler2;
            }
        }
        return this;
    }

    public final WinterFlowLoaderScheduler WinterFlowTransactionAgent(int i, WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest) {
        winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl(winterFlowTransactionManagerUnitTest.WinterFlowSyntax - 1);
        winterFlowTransactionManagerUnitTest.WinterFlowUnitTestResponse = WinterFlowResolverController(i);
        Object[] objArr = this.WinterFlowArrayNetwork;
        if (objArr.length == 2) {
            return null;
        }
        if (this.WinterFlowCacheManagerAgent != winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl) {
            return new WinterFlowLoaderScheduler(0, 0, WinterFlowPackageProcess.WinterFlowResponseEngine(i, objArr), winterFlowTransactionManagerUnitTest.WinterFlowVariableVersionControl);
        }
        this.WinterFlowArrayNetwork = WinterFlowPackageProcess.WinterFlowResponseEngine(i, objArr);
        return this;
    }

    public final int WinterFlowTransactionManagerStrategy(int i) {
        return Integer.bitCount(this.WinterFlowRouterStructure & (i - 1)) * 2;
    }

    public final Object WinterFlowUnitTestResponse(int i, int i2, Object obj) {
        int WinterFlowTransactionManagerStrategy = 1 << WinterFlowPackageProcess.WinterFlowTransactionManagerStrategy(i, i2);
        if (WinterFlowRouterRouter(WinterFlowTransactionManagerStrategy)) {
            int WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy(WinterFlowTransactionManagerStrategy);
            if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, this.WinterFlowArrayNetwork[WinterFlowTransactionManagerStrategy2])) {
                return WinterFlowResolverController(WinterFlowTransactionManagerStrategy2);
            }
            return null;
        }
        if (!WinterFlowSyntax(WinterFlowTransactionManagerStrategy)) {
            return null;
        }
        WinterFlowLoaderScheduler WinterFlowVariableBandwidth = WinterFlowVariableBandwidth(WinterFlowBatchUI(WinterFlowTransactionManagerStrategy));
        if (i2 != 30) {
            return WinterFlowVariableBandwidth.WinterFlowUnitTestResponse(i, i2 + 5, obj);
        }
        WinterFlowWidgetFramework WinterFlowEventEmitterController = WinterFlowDecoratorUI.WinterFlowEventEmitterController(WinterFlowDecoratorUI.WinterFlowArrayHelper(0, WinterFlowVariableBandwidth.WinterFlowArrayNetwork.length));
        int i3 = WinterFlowEventEmitterController.WinterFlowVariableVersionControl;
        int i4 = WinterFlowEventEmitterController.WinterFlowTransactionManagerStrategy;
        int i5 = WinterFlowEventEmitterController.WinterFlowUnitTestResponse;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!WinterFlowManagerRequest.WinterFlowThreadListener(obj, WinterFlowVariableBandwidth.WinterFlowArrayNetwork[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return WinterFlowVariableBandwidth.WinterFlowResolverController(i3);
    }

    public final WinterFlowLoaderScheduler WinterFlowVariableBandwidth(int i) {
        Object obj = this.WinterFlowArrayNetwork[i];
        obj.getClass();
        return (WinterFlowLoaderScheduler) obj;
    }

    public final boolean WinterFlowVariableVersionControl(WinterFlowLoaderScheduler winterFlowLoaderScheduler) {
        if (this == winterFlowLoaderScheduler) {
            return true;
        }
        if (this.WinterFlowHookDataSource == winterFlowLoaderScheduler.WinterFlowHookDataSource && this.WinterFlowRouterStructure == winterFlowLoaderScheduler.WinterFlowRouterStructure) {
            int length = this.WinterFlowArrayNetwork.length;
            for (int i = 0; i < length; i++) {
                if (this.WinterFlowArrayNetwork[i] == winterFlowLoaderScheduler.WinterFlowArrayNetwork[i]) {
                }
            }
            return true;
        }
        return false;
    }
}
