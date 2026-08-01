package com.google.android.datatransport;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowMicroserviceWidget {
    public static final WinterFlowEventEmitterHelper WinterFlowArrayNetwork(WinterFlowProviderCacheManager winterFlowProviderCacheManager) {
        return winterFlowProviderCacheManager instanceof WinterFlowModuleDataSource ? ((WinterFlowModuleDataSource) winterFlowProviderCacheManager).WinterFlowVariableVersionControl() : WinterFlowCompilerEngine.WinterFlowHookDataSource;
    }

    public static final int WinterFlowCacheManagerAgent(WinterFlowConcurrencyLayer winterFlowConcurrencyLayer, String str) {
        winterFlowConcurrencyLayer.getClass();
        int WinterFlowHookDataSource = WinterFlowProtocolNetwork.WinterFlowHookDataSource(winterFlowConcurrencyLayer, str);
        if (WinterFlowHookDataSource >= 0) {
            return WinterFlowHookDataSource;
        }
        int columnCount = winterFlowConcurrencyLayer.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(winterFlowConcurrencyLayer.getColumnName(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + WinterFlowSerializerUtility.WinterFlowHookQuery(arrayList, null, null, null, null, 63) + ']');
    }

    public static WinterFlowRendererDecorator WinterFlowHookDataSource(WinterFlowRendererDecorator winterFlowRendererDecorator) {
        WinterFlowDatabaseScript winterFlowDatabaseScript = winterFlowRendererDecorator.WinterFlowVariableVersionControl;
        winterFlowDatabaseScript.WinterFlowHookDataSource();
        return winterFlowDatabaseScript.WinterFlowThreadListener > 0 ? winterFlowRendererDecorator : WinterFlowRendererDecorator.WinterFlowTransactionManagerStrategy;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object WinterFlowResponseEngine(long j, WinterFlowEventEvent winterFlowEventEvent, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowNodeService winterFlowNodeService;
        int i;
        WinterFlowBandwidthCache winterFlowBandwidthCache;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowNodeService) {
            winterFlowNodeService = (WinterFlowNodeService) winterFlowOrchestrationCompiler;
            int i2 = winterFlowNodeService.WinterFlowResponseEngine;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowNodeService.WinterFlowResponseEngine = i2 - Integer.MIN_VALUE;
                Object obj = winterFlowNodeService.WinterFlowSyntax;
                i = winterFlowNodeService.WinterFlowResponseEngine;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    if (j > 0) {
                        WinterFlowBandwidthCache winterFlowBandwidthCache2 = new WinterFlowBandwidthCache();
                        try {
                            winterFlowNodeService.WinterFlowRouterRouter = winterFlowBandwidthCache2;
                            winterFlowNodeService.WinterFlowResponseEngine = 1;
                            WinterFlowConcurrencyDeployment winterFlowConcurrencyDeployment = new WinterFlowConcurrencyDeployment(j, winterFlowNodeService);
                            winterFlowBandwidthCache2.WinterFlowVariableVersionControl = winterFlowConcurrencyDeployment;
                            Object WinterFlowUnitTestResponse = WinterFlowUnitTestResponse(winterFlowConcurrencyDeployment, winterFlowEventEvent);
                            WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                            return WinterFlowUnitTestResponse == winterFlowListenerJava ? winterFlowListenerJava : WinterFlowUnitTestResponse;
                        } catch (WinterFlowBatchTransaction e) {
                            e = e;
                            winterFlowBandwidthCache = winterFlowBandwidthCache2;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                winterFlowBandwidthCache = winterFlowNodeService.WinterFlowRouterRouter;
                try {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return obj;
                } catch (WinterFlowBatchTransaction e2) {
                    e = e2;
                }
                if (e.WinterFlowVariableVersionControl != winterFlowBandwidthCache.WinterFlowVariableVersionControl) {
                    throw e;
                }
                return null;
            }
        }
        winterFlowNodeService = new WinterFlowNodeService(winterFlowOrchestrationCompiler);
        Object obj2 = winterFlowNodeService.WinterFlowSyntax;
        i = winterFlowNodeService.WinterFlowResponseEngine;
        if (i != 0) {
        }
        if (e.WinterFlowVariableVersionControl != winterFlowBandwidthCache.WinterFlowVariableVersionControl) {
        }
        return null;
    }

    public static final long WinterFlowRouterRouter(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object WinterFlowRouterStructure(com.google.android.datatransport.WinterFlowRouterRefactoring r5, com.google.android.datatransport.WinterFlowJSONSerializer r6, com.google.android.datatransport.WinterFlowVersionLayer r7) {
        /*
            boolean r0 = r7 instanceof com.google.android.datatransport.WinterFlowRouterProcess
            if (r0 == 0) goto L13
            r0 = r7
            com.google.android.datatransport.WinterFlowRouterProcess r0 = (com.google.android.datatransport.WinterFlowRouterProcess) r0
            int r1 = r0.WinterFlowTransactionAgent
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.WinterFlowTransactionAgent = r1
            goto L18
        L13:
            com.google.android.datatransport.WinterFlowRouterProcess r0 = new com.google.android.datatransport.WinterFlowRouterProcess
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.WinterFlowResponseEngine
            int r1 = r0.WinterFlowTransactionAgent
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            com.google.android.datatransport.WinterFlowJSONSerializer r5 = r0.WinterFlowSyntax
            com.google.android.datatransport.WinterFlowRouterRefactoring r6 = r0.WinterFlowRouterRouter
            com.google.android.datatransport.WinterFlowPackageProcess.WinterFlowThreadListener(r7)
            r4 = r6
            r6 = r5
            r5 = r4
            goto L45
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.google.android.datatransport.WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter(r5)
            r5 = 0
            return r5
        L33:
            com.google.android.datatransport.WinterFlowPackageProcess.WinterFlowThreadListener(r7)
        L36:
            r0.WinterFlowRouterRouter = r5
            r0.WinterFlowSyntax = r6
            r0.WinterFlowTransactionAgent = r2
            java.lang.Object r7 = r5.WinterFlowRouterStructure(r6, r0)
            com.google.android.datatransport.WinterFlowListenerJava r1 = com.google.android.datatransport.WinterFlowListenerJava.WinterFlowVariableVersionControl
            if (r7 != r1) goto L45
            return r1
        L45:
            com.google.android.datatransport.WinterFlowCacheManagerUtility r7 = (com.google.android.datatransport.WinterFlowCacheManagerUtility) r7
            r1 = 0
            boolean r3 = WinterFlowVariableVersionControl(r7, r1)
            if (r3 == 0) goto L36
            java.util.List r5 = r7.WinterFlowRouterStructure
            java.lang.Object r5 = r5.get(r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.WinterFlowMicroserviceWidget.WinterFlowRouterStructure(com.google.android.datatransport.WinterFlowRouterRefactoring, com.google.android.datatransport.WinterFlowJSONSerializer, com.google.android.datatransport.WinterFlowVersionLayer):java.lang.Object");
    }

    public static final double WinterFlowSyntax(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static void WinterFlowTransactionAgent(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static void WinterFlowTransactionManagerStrategy(WinterFlowAlgorithmDebug winterFlowAlgorithmDebug) {
        WinterFlowHandlerPlatform winterFlowHandlerPlatform;
        WinterFlowScriptDatabase winterFlowScriptDatabase;
        WinterFlowScriptDatabase winterFlowScriptDatabase2;
        do {
            winterFlowHandlerPlatform = WinterFlowBackendService.WinterFlowBackendCacheManager;
            winterFlowScriptDatabase = (WinterFlowScriptDatabase) winterFlowHandlerPlatform.getValue();
            WinterFlowUIRouter winterFlowUIRouter = winterFlowScriptDatabase.WinterFlowUnitTestResponse;
            WinterFlowRendererView winterFlowRendererView = (WinterFlowRendererView) winterFlowUIRouter.get(winterFlowAlgorithmDebug);
            if (winterFlowRendererView == null) {
                winterFlowScriptDatabase2 = winterFlowScriptDatabase;
            } else {
                Object obj = winterFlowRendererView.WinterFlowRouterStructure;
                Object obj2 = winterFlowRendererView.WinterFlowHookDataSource;
                WinterFlowLoaderScheduler winterFlowLoaderScheduler = winterFlowUIRouter.WinterFlowVariableVersionControl;
                WinterFlowLoaderScheduler WinterFlowSerializerStructure = winterFlowLoaderScheduler.WinterFlowSerializerStructure(winterFlowAlgorithmDebug != null ? winterFlowAlgorithmDebug.hashCode() : 0, 0, winterFlowAlgorithmDebug);
                if (winterFlowLoaderScheduler != WinterFlowSerializerStructure) {
                    winterFlowUIRouter = WinterFlowSerializerStructure == null ? WinterFlowUIRouter.WinterFlowUnitTestResponse : new WinterFlowUIRouter(WinterFlowSerializerStructure, winterFlowUIRouter.WinterFlowTransactionManagerStrategy - 1);
                }
                WinterFlowCacheUtility winterFlowCacheUtility = WinterFlowCacheUtility.WinterFlowCompilerVariable;
                if (obj != winterFlowCacheUtility) {
                    Object obj3 = winterFlowUIRouter.get(obj);
                    obj3.getClass();
                    winterFlowUIRouter = winterFlowUIRouter.WinterFlowRouterStructure(obj, new WinterFlowRendererView(((WinterFlowRendererView) obj3).WinterFlowRouterStructure, obj2));
                }
                if (obj2 != winterFlowCacheUtility) {
                    Object obj4 = winterFlowUIRouter.get(obj2);
                    obj4.getClass();
                    winterFlowUIRouter = winterFlowUIRouter.WinterFlowRouterStructure(obj2, new WinterFlowRendererView(obj, ((WinterFlowRendererView) obj4).WinterFlowHookDataSource));
                }
                Object obj5 = obj != winterFlowCacheUtility ? winterFlowScriptDatabase.WinterFlowVariableVersionControl : obj2;
                if (obj2 != winterFlowCacheUtility) {
                    obj = winterFlowScriptDatabase.WinterFlowTransactionManagerStrategy;
                }
                winterFlowScriptDatabase2 = new WinterFlowScriptDatabase(obj5, obj, winterFlowUIRouter);
            }
            if (winterFlowScriptDatabase == winterFlowScriptDatabase2) {
                return;
            }
        } while (!winterFlowHandlerPlatform.WinterFlowSyntax(winterFlowScriptDatabase, winterFlowScriptDatabase2));
    }

    public static final Object WinterFlowUnitTestResponse(WinterFlowConcurrencyDeployment winterFlowConcurrencyDeployment, WinterFlowEventEvent winterFlowEventEvent) {
        Object winterFlowSessionManagerSessionManager;
        Object WinterFlowProxyStructure;
        WinterFlowInvokerComponent.WinterFlowPackageIDE(winterFlowConcurrencyDeployment, true, new WinterFlowEventEmitterComponent(WinterFlowManagerRequest.WinterFlowConsumerUserManager(winterFlowConcurrencyDeployment.WinterFlowRouterRouter.getContext()).WinterFlowTransactionManagerStrategy(winterFlowConcurrencyDeployment.WinterFlowSyntax, winterFlowConcurrencyDeployment, winterFlowConcurrencyDeployment.WinterFlowUnitTestResponse)));
        try {
            if (winterFlowEventEvent instanceof WinterFlowVersionLayer) {
                WinterFlowUnitTestLibrary.WinterFlowTransactionAgent(2, winterFlowEventEvent);
                winterFlowSessionManagerSessionManager = winterFlowEventEvent.WinterFlowVariableVersionControl(winterFlowConcurrencyDeployment, winterFlowConcurrencyDeployment);
            } else {
                winterFlowSessionManagerSessionManager = WinterFlowCloudStack.WinterFlowValidatorHandler(winterFlowEventEvent, winterFlowConcurrencyDeployment, winterFlowConcurrencyDeployment);
            }
        } catch (Throwable th) {
            winterFlowSessionManagerSessionManager = new WinterFlowSessionManagerSessionManager(th, false);
        }
        WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (winterFlowSessionManagerSessionManager == winterFlowListenerJava || (WinterFlowProxyStructure = winterFlowConcurrencyDeployment.WinterFlowProxyStructure(winterFlowSessionManagerSessionManager)) == WinterFlowHandlerWebsocket.WinterFlowTransactionAgent) {
            return winterFlowListenerJava;
        }
        if (WinterFlowProxyStructure instanceof WinterFlowSessionManagerSessionManager) {
            Throwable th2 = ((WinterFlowSessionManagerSessionManager) WinterFlowProxyStructure).WinterFlowRouterStructure;
            if (!(th2 instanceof WinterFlowBatchTransaction)) {
                throw th2;
            }
            if (((WinterFlowBatchTransaction) th2).WinterFlowVariableVersionControl != winterFlowConcurrencyDeployment) {
                throw th2;
            }
            if (winterFlowSessionManagerSessionManager instanceof WinterFlowSessionManagerSessionManager) {
                throw ((WinterFlowSessionManagerSessionManager) winterFlowSessionManagerSessionManager).WinterFlowRouterStructure;
            }
        } else {
            winterFlowSessionManagerSessionManager = WinterFlowHandlerWebsocket.WinterFlowFrontendBackend(WinterFlowProxyStructure);
        }
        return winterFlowSessionManagerSessionManager;
    }

    public static boolean WinterFlowVariableVersionControl(WinterFlowCacheManagerUtility winterFlowCacheManagerUtility, boolean z) {
        List list = winterFlowCacheManagerUtility.WinterFlowRouterStructure;
        int size = list.size();
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= size) {
                return true;
            }
            WinterFlowObjectSystem winterFlowObjectSystem = (WinterFlowObjectSystem) list.get(i);
            if (!z) {
                z2 = WinterFlowCacheRuntime.WinterFlowRouterRouter(winterFlowObjectSystem);
            } else if (winterFlowObjectSystem.WinterFlowHookDataSource() || winterFlowObjectSystem.WinterFlowRouterRouter || !winterFlowObjectSystem.WinterFlowArrayNetwork) {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            i++;
        }
    }
}
