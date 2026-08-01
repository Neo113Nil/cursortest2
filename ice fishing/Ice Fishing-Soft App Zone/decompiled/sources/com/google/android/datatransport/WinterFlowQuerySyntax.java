package com.google.android.datatransport;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowQuerySyntax implements WinterFlowQueryJava {
    public static boolean WinterFlowServerProtocol = false;
    public static Method WinterFlowThreadListener;
    public static final WinterFlowSessionManagerProcess WinterFlowRouterStructure = new WinterFlowSessionManagerProcess(24);
    public static final float[][] WinterFlowHookDataSource = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] WinterFlowCacheManagerAgent = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] WinterFlowArrayNetwork = {95.047f, 100.0f, 108.883f};
    public static final float[][] WinterFlowVariableVersionControl = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final WinterFlowThreadPoolProcess WinterFlowTransactionManagerStrategy = new WinterFlowThreadPoolProcess(4);
    public static final WinterFlowThreadPoolProcess WinterFlowUnitTestResponse = new WinterFlowThreadPoolProcess(7);
    public static final WinterFlowVariableEntity WinterFlowRouterRouter = new WinterFlowVariableEntity(3);
    public static final WinterFlowLibraryParser WinterFlowSyntax = new WinterFlowLibraryParser(2);
    public static final long[] WinterFlowResponseEngine = new long[0];
    public static final WinterFlowPackageHook WinterFlowTransactionAgent = new WinterFlowPackageHook(0);

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object WinterFlowArrayHelper(WinterFlowCloudFramework winterFlowCloudFramework, boolean z, boolean z2, WinterFlowObjectSession winterFlowObjectSession, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowClassHandler winterFlowClassHandler;
        int i;
        WinterFlowCloudFramework winterFlowCloudFramework2;
        boolean z3;
        boolean z4;
        WinterFlowObjectSession winterFlowObjectSession2;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowClassHandler) {
            winterFlowClassHandler = (WinterFlowClassHandler) winterFlowOrchestrationCompiler;
            int i2 = winterFlowClassHandler.WinterFlowThreadListener;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowClassHandler.WinterFlowThreadListener = i2 - Integer.MIN_VALUE;
                WinterFlowClassHandler winterFlowClassHandler2 = winterFlowClassHandler;
                Object obj = winterFlowClassHandler2.WinterFlowServerProtocol;
                i = winterFlowClassHandler2.WinterFlowThreadListener;
                WinterFlowListenerJava winterFlowListenerJava = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    if (winterFlowCloudFramework.WinterFlowUnitTestResponse() && winterFlowCloudFramework.WinterFlowSyntax() && winterFlowCloudFramework.WinterFlowRouterRouter()) {
                        WinterFlowTransactionRouter winterFlowTransactionRouter = new WinterFlowTransactionRouter(null, winterFlowObjectSession, winterFlowCloudFramework, z2, z);
                        winterFlowClassHandler2.WinterFlowThreadListener = 1;
                        Object WinterFlowResponseEngine2 = winterFlowCloudFramework.WinterFlowResponseEngine(z, winterFlowTransactionRouter, winterFlowClassHandler2);
                        if (WinterFlowResponseEngine2 != winterFlowListenerJava) {
                            return WinterFlowResponseEngine2;
                        }
                    } else {
                        winterFlowClassHandler2.WinterFlowRouterRouter = winterFlowCloudFramework;
                        winterFlowClassHandler2.WinterFlowSyntax = winterFlowObjectSession;
                        winterFlowClassHandler2.WinterFlowResponseEngine = z;
                        winterFlowClassHandler2.WinterFlowTransactionAgent = z2;
                        winterFlowClassHandler2.WinterFlowThreadListener = 2;
                        WinterFlowEncryptionMicroservice WinterFlowThreadListener2 = WinterFlowThreadListener(winterFlowCloudFramework, z2, winterFlowClassHandler2);
                        if (WinterFlowThreadListener2 != winterFlowListenerJava) {
                            winterFlowCloudFramework2 = winterFlowCloudFramework;
                            z3 = z2;
                            obj = WinterFlowThreadListener2;
                            z4 = z;
                            winterFlowObjectSession2 = winterFlowObjectSession;
                        }
                    }
                }
                if (i == 1) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        return obj;
                    }
                    WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z5 = winterFlowClassHandler2.WinterFlowTransactionAgent;
                boolean z6 = winterFlowClassHandler2.WinterFlowResponseEngine;
                WinterFlowObjectSession winterFlowObjectSession3 = winterFlowClassHandler2.WinterFlowSyntax;
                WinterFlowCloudFramework winterFlowCloudFramework3 = winterFlowClassHandler2.WinterFlowRouterRouter;
                WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                z3 = z5;
                z4 = z6;
                winterFlowObjectSession2 = winterFlowObjectSession3;
                winterFlowCloudFramework2 = winterFlowCloudFramework3;
                WinterFlowStrategyNetwork winterFlowStrategyNetwork = new WinterFlowStrategyNetwork(null, winterFlowObjectSession2, winterFlowCloudFramework2, z4, z3);
                winterFlowClassHandler2.WinterFlowRouterRouter = null;
                winterFlowClassHandler2.WinterFlowSyntax = null;
                winterFlowClassHandler2.WinterFlowThreadListener = 3;
                Object WinterFlowModuleAgent = WinterFlowCacheRuntime.WinterFlowModuleAgent((WinterFlowEncryptionMicroservice) obj, winterFlowStrategyNetwork, winterFlowClassHandler2);
                return WinterFlowModuleAgent != winterFlowListenerJava ? winterFlowListenerJava : WinterFlowModuleAgent;
            }
        }
        winterFlowClassHandler = new WinterFlowClassHandler(winterFlowOrchestrationCompiler);
        WinterFlowClassHandler winterFlowClassHandler22 = winterFlowClassHandler;
        Object obj2 = winterFlowClassHandler22.WinterFlowServerProtocol;
        i = winterFlowClassHandler22.WinterFlowThreadListener;
        WinterFlowListenerJava winterFlowListenerJava2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
        if (i != 0) {
        }
        WinterFlowStrategyNetwork winterFlowStrategyNetwork2 = new WinterFlowStrategyNetwork(null, winterFlowObjectSession2, winterFlowCloudFramework2, z4, z3);
        winterFlowClassHandler22.WinterFlowRouterRouter = null;
        winterFlowClassHandler22.WinterFlowSyntax = null;
        winterFlowClassHandler22.WinterFlowThreadListener = 3;
        Object WinterFlowModuleAgent2 = WinterFlowCacheRuntime.WinterFlowModuleAgent((WinterFlowEncryptionMicroservice) obj2, winterFlowStrategyNetwork2, winterFlowClassHandler22);
        if (WinterFlowModuleAgent2 != winterFlowListenerJava2) {
        }
    }

    public static void WinterFlowArrayNetwork(int i) {
        if (2 > i || i >= 37) {
            StringBuilder WinterFlowThreadListener2 = WinterFlowResolverBackend.WinterFlowThreadListener("radix ", i, " was not in valid range ");
            WinterFlowThreadListener2.append(new WinterFlowCacheManagerListener(2, 36, 1));
            throw new IllegalArgumentException(WinterFlowThreadListener2.toString());
        }
    }

    public static final String WinterFlowBandwidthObject(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static boolean WinterFlowBatchUI(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final void WinterFlowCacheManagerAgent(int i, int i2) {
        if (i < 0 || i > i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
        }
    }

    public static final Object WinterFlowCacheManagerListener(WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, WinterFlowEventEvent winterFlowEventEvent) {
        WinterFlowResponseObject winterFlowResponseObject;
        WinterFlowEncryptionMicroservice WinterFlowRouterAdapter;
        Thread currentThread = Thread.currentThread();
        WinterFlowRendererProvider winterFlowRendererProvider = WinterFlowCacheUtility.WinterFlowMapperProtocol;
        WinterFlowUnitTestRouter winterFlowUnitTestRouter = (WinterFlowUnitTestRouter) winterFlowEncryptionMicroservice.WinterFlowConsumerUserManager(winterFlowRendererProvider);
        WinterFlowEventEmitterPackage winterFlowEventEmitterPackage = WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
        if (winterFlowUnitTestRouter == null) {
            winterFlowResponseObject = WinterFlowNetworkSubsystem.WinterFlowRouterStructure();
            WinterFlowRouterAdapter = WinterFlowUnitTestLibrary.WinterFlowRouterAdapter(winterFlowEventEmitterPackage, winterFlowEncryptionMicroservice.WinterFlowOrchestrationSubsystem(winterFlowResponseObject), true);
            WinterFlowCacheDecorator winterFlowCacheDecorator = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
            if (WinterFlowRouterAdapter != winterFlowCacheDecorator && WinterFlowRouterAdapter.WinterFlowConsumerUserManager(winterFlowRendererProvider) == null) {
                WinterFlowRouterAdapter = WinterFlowRouterAdapter.WinterFlowOrchestrationSubsystem(winterFlowCacheDecorator);
            }
        } else {
            winterFlowResponseObject = (WinterFlowResponseObject) WinterFlowNetworkSubsystem.WinterFlowRouterStructure.get();
            WinterFlowRouterAdapter = WinterFlowUnitTestLibrary.WinterFlowRouterAdapter(winterFlowEventEmitterPackage, winterFlowEncryptionMicroservice, true);
            WinterFlowCacheDecorator winterFlowCacheDecorator2 = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
            if (WinterFlowRouterAdapter != winterFlowCacheDecorator2 && WinterFlowRouterAdapter.WinterFlowConsumerUserManager(winterFlowRendererProvider) == null) {
                WinterFlowRouterAdapter = WinterFlowRouterAdapter.WinterFlowOrchestrationSubsystem(winterFlowCacheDecorator2);
            }
        }
        WinterFlowUILayer winterFlowUILayer = new WinterFlowUILayer(WinterFlowRouterAdapter, currentThread, winterFlowResponseObject);
        winterFlowUILayer.WinterFlowStrategyHook(WinterFlowModuleProxy.WinterFlowVariableVersionControl, winterFlowUILayer, winterFlowEventEvent);
        WinterFlowResponseObject winterFlowResponseObject2 = winterFlowUILayer.WinterFlowSyntax;
        if (winterFlowResponseObject2 != null) {
            int i = WinterFlowResponseObject.WinterFlowResponseEngine;
            winterFlowResponseObject2.WinterFlowSoftwareEngine(false);
        }
        while (!Thread.interrupted()) {
            try {
                long WinterFlowSyntaxSubsystem = winterFlowResponseObject2 != null ? winterFlowResponseObject2.WinterFlowSyntaxSubsystem() : Long.MAX_VALUE;
                if (!(winterFlowUILayer.WinterFlowTestingNode() instanceof WinterFlowEncryptionIDE)) {
                    if (winterFlowResponseObject2 != null) {
                        int i2 = WinterFlowResponseObject.WinterFlowResponseEngine;
                        winterFlowResponseObject2.WinterFlowSoftwareProtocol(false);
                    }
                    Object WinterFlowFrontendBackend = WinterFlowHandlerWebsocket.WinterFlowFrontendBackend(winterFlowUILayer.WinterFlowTestingNode());
                    WinterFlowSessionManagerSessionManager winterFlowSessionManagerSessionManager = WinterFlowFrontendBackend instanceof WinterFlowSessionManagerSessionManager ? (WinterFlowSessionManagerSessionManager) WinterFlowFrontendBackend : null;
                    if (winterFlowSessionManagerSessionManager == null) {
                        return WinterFlowFrontendBackend;
                    }
                    throw winterFlowSessionManagerSessionManager.WinterFlowRouterStructure;
                }
                LockSupport.parkNanos(winterFlowUILayer, WinterFlowSyntaxSubsystem);
            } catch (Throwable th) {
                if (winterFlowResponseObject2 != null) {
                    int i3 = WinterFlowResponseObject.WinterFlowResponseEngine;
                    winterFlowResponseObject2.WinterFlowSoftwareProtocol(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        winterFlowUILayer.WinterFlowResolverController(interruptedException);
        throw interruptedException;
    }

    public static final long WinterFlowCompilerVariable(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static int WinterFlowConcurrencyThread(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WinterFlowArrayNetwork;
        return WinterFlowFrameworkProtocol.WinterFlowRouterStructure(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static final Object WinterFlowConfigurationSubsystem(WinterFlowConfigurationProcess winterFlowConfigurationProcess, WinterFlowProtocolEntity winterFlowProtocolEntity) {
        winterFlowProtocolEntity.getClass();
        Object obj = winterFlowConfigurationProcess.get(winterFlowProtocolEntity);
        if (obj == null) {
            obj = winterFlowProtocolEntity.WinterFlowHookDataSource();
        }
        return ((WinterFlowFunctionThreadPool) obj).WinterFlowRouterStructure(winterFlowConfigurationProcess);
    }

    public static final WinterFlowMapperManager WinterFlowConsumerUserManager(WinterFlowMapperManager winterFlowMapperManager, WinterFlowObjectSession winterFlowObjectSession) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowDataSourceProtocol(winterFlowObjectSession));
    }

    public static final void WinterFlowHookDataSource(int i, int i2) {
        if (i < 0 || i >= i2) {
            WinterFlowCompilerMechanism.WinterFlowTransactionAgent(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "index: ", ", size: "));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void WinterFlowMapperProtocol(WinterFlowUserManagerController winterFlowUserManagerController, WinterFlowObjectUI winterFlowObjectUI) {
        WinterFlowHandlerTransactionManager winterFlowHandlerTransactionManager = winterFlowUserManagerController.WinterFlowTransactionAgent;
        if (winterFlowHandlerTransactionManager == null) {
            winterFlowHandlerTransactionManager = new WinterFlowHandlerTransactionManager((WinterFlowGatewayNetwork) winterFlowUserManagerController);
            winterFlowUserManagerController.WinterFlowTransactionAgent = winterFlowHandlerTransactionManager;
        }
        WinterFlowServiceProviderTransactionManager snapshotObserver = ((WinterFlowSyntaxTransactionManager) WinterFlowCloudStack.WinterFlowTestingNode(winterFlowUserManagerController)).getSnapshotObserver();
        snapshotObserver.WinterFlowRouterStructure.WinterFlowCacheManagerAgent(winterFlowHandlerTransactionManager, WinterFlowServiceProviderBatch.WinterFlowCacheManagerListener, winterFlowObjectUI);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Typeface WinterFlowPackageIDE(Typeface typeface, WinterFlowAlgorithmIDE winterFlowAlgorithmIDE, Context context) {
        int i;
        String str;
        int i2;
        List list = winterFlowAlgorithmIDE.WinterFlowRouterStructure;
        ThreadLocal threadLocal = WinterFlowNodeThreadPool.WinterFlowRouterStructure;
        if (typeface == null) {
            return null;
        }
        if (list.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal2 = WinterFlowNodeThreadPool.WinterFlowRouterStructure;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        WinterFlowServiceProviderUI WinterFlowHookDataSource2 = WinterFlowUnitTestLibrary.WinterFlowHookDataSource(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = context.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 != Integer.MAX_VALUE) {
                i = context.getResources().getConfiguration().fontWeightAdjustment;
                if (i != 0) {
                    str = WinterFlowBackendTool.WinterFlowRouterStructure(list, null, new WinterFlowSessionJava(7, WinterFlowHookDataSource2), 31);
                } else {
                    if (list.size() > 0) {
                        list.get(0).getClass();
                        WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
                        return null;
                    }
                    str = (list.isEmpty() ? "" : "".concat(",")) + "'wght' " + WinterFlowDecoratorUI.WinterFlowRouterRouter(i + 400.0f, 1.0f, 1000.0f);
                }
                paint.setFontVariationSettings(str);
                return paint.getTypeface();
            }
        }
        i = 0;
        if (i != 0) {
        }
        paint.setFontVariationSettings(str);
        return paint.getTypeface();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d A[EDGE_INSN: B:47:0x008d->B:31:0x008d BREAK  A[LOOP:0: B:9:0x0011->B:32:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List WinterFlowResponseEngine(WinterFlowConfigurationModule winterFlowConfigurationModule, int i, int i2) {
        WinterFlowServerPlatform winterFlowServerPlatform;
        boolean z;
        if (i == i2) {
            return WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (z2) {
                if (i >= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy;
                if (z2) {
                    TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap != null) {
                        winterFlowServerPlatform = new WinterFlowServerPlatform(treeMap, treeMap.keySet());
                        if (winterFlowServerPlatform != null) {
                        }
                    }
                    winterFlowServerPlatform = null;
                    if (winterFlowServerPlatform != null) {
                    }
                } else {
                    TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 != null) {
                        winterFlowServerPlatform = new WinterFlowServerPlatform(treeMap2, treeMap2.descendingKeySet());
                        if (winterFlowServerPlatform != null) {
                            break;
                        }
                        Map map = (Map) winterFlowServerPlatform.WinterFlowVariableVersionControl;
                        Iterator it = ((Iterable) winterFlowServerPlatform.WinterFlowTransactionManagerStrategy).iterator();
                        while (it.hasNext()) {
                            int intValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i2 <= intValue && intValue < i) {
                                    Object obj = map.get(Integer.valueOf(intValue));
                                    obj.getClass();
                                    arrayList.add(obj);
                                    z = true;
                                    i = intValue;
                                    break;
                                    break;
                                }
                            } else if (i + 1 <= intValue && intValue <= i2) {
                                Object obj2 = map.get(Integer.valueOf(intValue));
                                obj2.getClass();
                                arrayList.add(obj2);
                                z = true;
                                i = intValue;
                                break;
                            }
                        }
                        z = false;
                    }
                    winterFlowServerPlatform = null;
                    if (winterFlowServerPlatform != null) {
                    }
                }
            } else {
                if (i <= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) winterFlowConfigurationModule.WinterFlowTransactionManagerStrategy;
                if (z2) {
                }
            }
        } while (z);
        return null;
    }

    public static final void WinterFlowRouterAdapter(WinterFlowServiceProviderController winterFlowServiceProviderController, WinterFlowSchedulerStructure winterFlowSchedulerStructure) {
        long WinterFlowPackageIDE = winterFlowSchedulerStructure.WinterFlowUserManagerUserManager.WinterFlowCacheManagerAgent.WinterFlowPackageIDE(0L);
        int round = Math.round(Float.intBitsToFloat((int) (WinterFlowPackageIDE >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (WinterFlowPackageIDE & 4294967295L)));
        winterFlowServiceProviderController.layout(round, round2, winterFlowServiceProviderController.getMeasuredWidth() + round, winterFlowServiceProviderController.getMeasuredHeight() + round2);
    }

    public static void WinterFlowRouterRouter(WinterFlowBatchOrchestration winterFlowBatchOrchestration, String str, WinterFlowEventTool winterFlowEventTool) {
        WinterFlowRouterTesting winterFlowRouterTesting = winterFlowBatchOrchestration.WinterFlowTransactionManagerStrategy;
        winterFlowRouterTesting.getClass();
        winterFlowBatchOrchestration.WinterFlowUnitTestResponse.add(new WinterFlowParserEngine((WinterFlowCacheException) winterFlowRouterTesting.WinterFlowHookDataSource(WinterFlowSoftwareException.WinterFlowPackageIDE(WinterFlowCacheException.class)), str, winterFlowEventTool).WinterFlowRouterStructure());
    }

    public static final void WinterFlowRouterStructure(WinterFlowScriptDatabaseSchema winterFlowScriptDatabaseSchema, Object obj, int i, Object obj2, WinterFlowResolverLibrary winterFlowResolverLibrary, int i2) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(1439843069);
        int i3 = (winterFlowResolverLibrary.WinterFlowVariableVersionControl(winterFlowScriptDatabaseSchema) ? 4 : 2) | i2 | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj) ? 32 : 16) | (winterFlowResolverLibrary.WinterFlowCacheManagerAgent(i) ? 256 : 128) | (winterFlowResolverLibrary.WinterFlowVariableVersionControl(obj2) ? 2048 : 1024);
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i3 & 1, (i3 & 1171) != 1170)) {
            ((WinterFlowRefactoringServer) obj).WinterFlowHookDataSource(obj2, WinterFlowManagerRequest.WinterFlowSyntaxSubsystem(980966366, new WinterFlowMapperService(i, winterFlowScriptDatabaseSchema, obj2), winterFlowResolverLibrary), winterFlowResolverLibrary, 48);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowRefactoring(winterFlowScriptDatabaseSchema, obj, i, obj2, i2);
        }
    }

    public static float WinterFlowSerializerStructure(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object WinterFlowServerProtocol(WinterFlowEventProvider winterFlowEventProvider, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowConfigurationBatch winterFlowConfigurationBatch;
        int i;
        WinterFlowBandwidthCache winterFlowBandwidthCache;
        WinterFlowSyntaxEvent e;
        WinterFlowCloudComponent winterFlowCloudComponent;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowConfigurationBatch) {
            winterFlowConfigurationBatch = (WinterFlowConfigurationBatch) winterFlowOrchestrationCompiler;
            int i2 = winterFlowConfigurationBatch.WinterFlowTransactionAgent;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowConfigurationBatch.WinterFlowTransactionAgent = i2 - Integer.MIN_VALUE;
                Object obj = winterFlowConfigurationBatch.WinterFlowResponseEngine;
                i = winterFlowConfigurationBatch.WinterFlowTransactionAgent;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    WinterFlowBandwidthCache winterFlowBandwidthCache2 = new WinterFlowBandwidthCache();
                    WinterFlowCloudComponent winterFlowCloudComponent2 = new WinterFlowCloudComponent(2, winterFlowBandwidthCache2);
                    try {
                        winterFlowConfigurationBatch.WinterFlowRouterRouter = winterFlowBandwidthCache2;
                        winterFlowConfigurationBatch.WinterFlowSyntax = winterFlowCloudComponent2;
                        winterFlowConfigurationBatch.WinterFlowTransactionAgent = 1;
                        Object WinterFlowRouterStructure2 = winterFlowEventProvider.WinterFlowRouterStructure(winterFlowCloudComponent2, winterFlowConfigurationBatch);
                        Object obj2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                        if (WinterFlowRouterStructure2 == obj2) {
                            return obj2;
                        }
                        winterFlowBandwidthCache = winterFlowBandwidthCache2;
                    } catch (WinterFlowSyntaxEvent e2) {
                        winterFlowBandwidthCache = winterFlowBandwidthCache2;
                        e = e2;
                        winterFlowCloudComponent = winterFlowCloudComponent2;
                        if (e.WinterFlowVariableVersionControl != winterFlowCloudComponent) {
                            throw e;
                        }
                        return winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                    }
                } else {
                    if (i != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    winterFlowCloudComponent = winterFlowConfigurationBatch.WinterFlowSyntax;
                    winterFlowBandwidthCache = winterFlowConfigurationBatch.WinterFlowRouterRouter;
                    try {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    } catch (WinterFlowSyntaxEvent e3) {
                        e = e3;
                        if (e.WinterFlowVariableVersionControl != winterFlowCloudComponent) {
                        }
                        return winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                    }
                }
                return winterFlowBandwidthCache.WinterFlowVariableVersionControl;
            }
        }
        winterFlowConfigurationBatch = new WinterFlowConfigurationBatch(winterFlowOrchestrationCompiler);
        Object obj3 = winterFlowConfigurationBatch.WinterFlowResponseEngine;
        i = winterFlowConfigurationBatch.WinterFlowTransactionAgent;
        if (i != 0) {
        }
        return winterFlowBandwidthCache.WinterFlowVariableVersionControl;
    }

    public static final float WinterFlowServiceUtility(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean WinterFlowSingletonPlatform(long j) {
        return (j & 2) != 0;
    }

    public static final String WinterFlowSoftwareEngine(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        return max > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static final Bitmap.Config WinterFlowSoftwareProtocol(int i) {
        return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final long WinterFlowStrategyTool(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static final WinterFlowConfigurationProcess WinterFlowSyntaxSubsystem(WinterFlowRepositoryWorker[] winterFlowRepositoryWorkerArr, WinterFlowConfigurationProcess winterFlowConfigurationProcess, WinterFlowConfigurationProcess winterFlowConfigurationProcess2) {
        WinterFlowTransactionManagerUnitTest winterFlowTransactionManagerUnitTest = new WinterFlowTransactionManagerUnitTest(WinterFlowConfigurationProcess.WinterFlowRouterRouter);
        for (WinterFlowRepositoryWorker winterFlowRepositoryWorker : winterFlowRepositoryWorkerArr) {
            WinterFlowProtocolEntity winterFlowProtocolEntity = winterFlowRepositoryWorker.WinterFlowRouterStructure;
            if (winterFlowRepositoryWorker.WinterFlowTransactionManagerStrategy || !winterFlowConfigurationProcess.containsKey(winterFlowProtocolEntity)) {
                winterFlowTransactionManagerUnitTest.put(winterFlowProtocolEntity, winterFlowProtocolEntity.WinterFlowCacheManagerAgent(winterFlowRepositoryWorker, (WinterFlowFunctionThreadPool) winterFlowConfigurationProcess2.get(winterFlowProtocolEntity)));
            }
        }
        return winterFlowTransactionManagerUnitTest.WinterFlowRouterStructure();
    }

    public static float WinterFlowTestingNode() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static final WinterFlowEncryptionMicroservice WinterFlowThreadListener(WinterFlowCloudFramework winterFlowCloudFramework, boolean z, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowUIBackend winterFlowUIBackend = (WinterFlowUIBackend) winterFlowOrchestrationCompiler.getContext().WinterFlowConsumerUserManager(WinterFlowUIBackend.WinterFlowTransactionManagerStrategy);
        WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = winterFlowUIBackend != null ? winterFlowUIBackend.WinterFlowVariableVersionControl : null;
        if (!winterFlowCloudFramework.WinterFlowUnitTestResponse()) {
            WinterFlowEventEmitterFramework winterFlowEventEmitterFramework = winterFlowCloudFramework.WinterFlowRouterStructure;
            if (winterFlowEventEmitterFramework == null) {
                WinterFlowManagerRequest.WinterFlowCloudMicroservice("coroutineScope");
                throw null;
            }
            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice2 = winterFlowEventEmitterFramework.WinterFlowVariableVersionControl;
            if (winterFlowEncryptionMicroservice == null) {
                winterFlowEncryptionMicroservice = WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
            }
            return winterFlowEncryptionMicroservice2.WinterFlowOrchestrationSubsystem(winterFlowEncryptionMicroservice);
        }
        if (winterFlowEncryptionMicroservice != null) {
            WinterFlowEventEmitterFramework winterFlowEventEmitterFramework2 = winterFlowCloudFramework.WinterFlowRouterStructure;
            if (winterFlowEventEmitterFramework2 != null) {
                return winterFlowEventEmitterFramework2.WinterFlowVariableVersionControl.WinterFlowOrchestrationSubsystem(winterFlowEncryptionMicroservice);
            }
            WinterFlowManagerRequest.WinterFlowCloudMicroservice("coroutineScope");
            throw null;
        }
        if (z) {
            WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice3 = winterFlowCloudFramework.WinterFlowHookDataSource;
            if (winterFlowEncryptionMicroservice3 != null) {
                return winterFlowEncryptionMicroservice3;
            }
            WinterFlowManagerRequest.WinterFlowCloudMicroservice("transactionContext");
            throw null;
        }
        WinterFlowEventEmitterFramework winterFlowEventEmitterFramework3 = winterFlowCloudFramework.WinterFlowRouterStructure;
        if (winterFlowEventEmitterFramework3 != null) {
            return winterFlowEventEmitterFramework3.WinterFlowVariableVersionControl;
        }
        WinterFlowManagerRequest.WinterFlowCloudMicroservice("coroutineScope");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object WinterFlowTransactionAgent(WinterFlowEventProvider winterFlowEventProvider, WinterFlowEventEvent winterFlowEventEvent, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowRefactoringUnitTest winterFlowRefactoringUnitTest;
        int i;
        WinterFlowEventEvent winterFlowEventEvent2;
        WinterFlowBandwidthCache winterFlowBandwidthCache;
        WinterFlowSyntaxEvent e;
        WinterFlowEncryptionEngine winterFlowEncryptionEngine;
        Object obj;
        WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowEncryptionSubsystem.WinterFlowServerProtocol;
        if (winterFlowOrchestrationCompiler instanceof WinterFlowRefactoringUnitTest) {
            winterFlowRefactoringUnitTest = (WinterFlowRefactoringUnitTest) winterFlowOrchestrationCompiler;
            int i2 = winterFlowRefactoringUnitTest.WinterFlowServerProtocol;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                winterFlowRefactoringUnitTest.WinterFlowServerProtocol = i2 - Integer.MIN_VALUE;
                Object obj2 = winterFlowRefactoringUnitTest.WinterFlowTransactionAgent;
                i = winterFlowRefactoringUnitTest.WinterFlowServerProtocol;
                if (i != 0) {
                    WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                    WinterFlowBandwidthCache winterFlowBandwidthCache2 = new WinterFlowBandwidthCache();
                    winterFlowBandwidthCache2.WinterFlowVariableVersionControl = winterFlowJSONDecorator;
                    WinterFlowEncryptionEngine winterFlowEncryptionEngine2 = new WinterFlowEncryptionEngine(winterFlowEventEvent, winterFlowBandwidthCache2);
                    try {
                        winterFlowRefactoringUnitTest.WinterFlowRouterRouter = (WinterFlowNodeInheritance) winterFlowEventEvent;
                        winterFlowRefactoringUnitTest.WinterFlowSyntax = winterFlowBandwidthCache2;
                        winterFlowRefactoringUnitTest.WinterFlowResponseEngine = winterFlowEncryptionEngine2;
                        winterFlowRefactoringUnitTest.WinterFlowServerProtocol = 1;
                        Object WinterFlowRouterStructure2 = winterFlowEventProvider.WinterFlowRouterStructure(winterFlowEncryptionEngine2, winterFlowRefactoringUnitTest);
                        Object obj3 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                        if (WinterFlowRouterStructure2 == obj3) {
                            return obj3;
                        }
                        winterFlowEventEvent2 = winterFlowEventEvent;
                        winterFlowBandwidthCache = winterFlowBandwidthCache2;
                    } catch (WinterFlowSyntaxEvent e2) {
                        winterFlowEventEvent2 = winterFlowEventEvent;
                        winterFlowBandwidthCache = winterFlowBandwidthCache2;
                        e = e2;
                        winterFlowEncryptionEngine = winterFlowEncryptionEngine2;
                        if (e.WinterFlowVariableVersionControl != winterFlowEncryptionEngine) {
                            throw e;
                        }
                        obj = winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                        if (obj == winterFlowJSONDecorator) {
                        }
                    }
                } else {
                    if (i != 1) {
                        WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    winterFlowEncryptionEngine = winterFlowRefactoringUnitTest.WinterFlowResponseEngine;
                    winterFlowBandwidthCache = winterFlowRefactoringUnitTest.WinterFlowSyntax;
                    winterFlowEventEvent2 = (WinterFlowEventEvent) winterFlowRefactoringUnitTest.WinterFlowRouterRouter;
                    try {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj2);
                    } catch (WinterFlowSyntaxEvent e3) {
                        e = e3;
                        if (e.WinterFlowVariableVersionControl != winterFlowEncryptionEngine) {
                        }
                        obj = winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                        if (obj == winterFlowJSONDecorator) {
                        }
                    }
                }
                obj = winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                if (obj == winterFlowJSONDecorator) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate " + winterFlowEventEvent2);
            }
        }
        winterFlowRefactoringUnitTest = new WinterFlowRefactoringUnitTest(winterFlowOrchestrationCompiler);
        Object obj22 = winterFlowRefactoringUnitTest.WinterFlowTransactionAgent;
        i = winterFlowRefactoringUnitTest.WinterFlowServerProtocol;
        if (i != 0) {
        }
        obj = winterFlowBandwidthCache.WinterFlowVariableVersionControl;
        if (obj == winterFlowJSONDecorator) {
        }
    }

    public static final int WinterFlowTransactionManagerStrategy(long j, long j2) {
        boolean WinterFlowVariableBandwidth = WinterFlowVariableBandwidth(j);
        if (WinterFlowVariableBandwidth != WinterFlowVariableBandwidth(j2)) {
            return WinterFlowVariableBandwidth ? -1 : 1;
        }
        return (Math.min(WinterFlowServiceUtility(j), WinterFlowServiceUtility(j2)) >= 0.0f && WinterFlowSingletonPlatform(j) != WinterFlowSingletonPlatform(j2)) ? WinterFlowSingletonPlatform(j) ? -1 : 1 : (int) Math.signum(WinterFlowServiceUtility(j) - WinterFlowServiceUtility(j2));
    }

    public static int WinterFlowUnitTestResponse(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final String WinterFlowUserManagerUserManager(WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        Object winterFlowDecoratorTool;
        if (winterFlowTransactionManagerLayer instanceof WinterFlowScriptHelper) {
            return ((WinterFlowScriptHelper) winterFlowTransactionManagerLayer).toString();
        }
        try {
            winterFlowDecoratorTool = winterFlowTransactionManagerLayer + '@' + WinterFlowBandwidthObject(winterFlowTransactionManagerLayer);
        } catch (Throwable th) {
            winterFlowDecoratorTool = new WinterFlowDecoratorTool(th);
        }
        if (WinterFlowRendererStructure.WinterFlowRouterStructure(winterFlowDecoratorTool) != null) {
            winterFlowDecoratorTool = winterFlowTransactionManagerLayer.getClass().getName() + '@' + WinterFlowBandwidthObject(winterFlowTransactionManagerLayer);
        }
        return (String) winterFlowDecoratorTool;
    }

    public static final boolean WinterFlowVariableBandwidth(long j) {
        return (j & 1) != 0;
    }

    public static final void WinterFlowVariableVersionControl(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowRouterRouter(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    public abstract void WinterFlowBackendCacheManager(WinterFlowStackProvider winterFlowStackProvider);

    public abstract Object WinterFlowEventEmitterController(Intent intent, int i);

    public abstract WinterFlowNodeEngine WinterFlowOrchestrationSubsystem(Context context, String str);

    public abstract void WinterFlowResolverController(Throwable th);

    public abstract Intent WinterFlowSyntax(Context context, String str);
}
