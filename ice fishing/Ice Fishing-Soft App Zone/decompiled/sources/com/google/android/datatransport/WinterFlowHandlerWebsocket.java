package com.google.android.datatransport;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.view.Display;
import android.view.RoundedCorner;
import android.widget.EdgeEffect;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowHandlerWebsocket {
    public static final WinterFlowJSONDecorator WinterFlowResponseEngine;
    public static final WinterFlowJSONDecorator WinterFlowRouterRouter;
    public static final WinterFlowJSONDecorator WinterFlowServerProtocol;
    public static final WinterFlowJSONDecorator WinterFlowServiceUtility;
    public static final WinterFlowJSONDecorator WinterFlowSingletonPlatform;
    public static final WinterFlowJSONDecorator WinterFlowSyntax;
    public static final WinterFlowJSONDecorator WinterFlowThreadListener;
    public static final WinterFlowJSONDecorator WinterFlowTransactionAgent;
    public static final WinterFlowThreadPoolProcess WinterFlowVariableBandwidth;
    public static final int[] WinterFlowRouterStructure = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] WinterFlowHookDataSource = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] WinterFlowCacheManagerAgent = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] WinterFlowArrayNetwork = {R.attr.name, R.attr.pathData};
    public static final int[] WinterFlowVariableVersionControl = new int[0];
    public static final long[] WinterFlowTransactionManagerStrategy = new long[0];
    public static final Object[] WinterFlowUnitTestResponse = new Object[0];
    public static final WinterFlowWidgetNetwork WinterFlowBandwidthObject = new WinterFlowWidgetNetwork(false);
    public static final WinterFlowWidgetNetwork WinterFlowOrchestrationSubsystem = new WinterFlowWidgetNetwork(true);
    public static final WinterFlowCompilerSystem WinterFlowConcurrencyThread = WinterFlowCompilerSystem.WinterFlowTransactionManagerStrategy;

    static {
        int i = 25;
        WinterFlowRouterRouter = new WinterFlowJSONDecorator(i, "REMOVED_TASK");
        WinterFlowSyntax = new WinterFlowJSONDecorator(i, "CLOSED_EMPTY");
        WinterFlowResponseEngine = new WinterFlowJSONDecorator(i, "COMPLETING_ALREADY");
        WinterFlowTransactionAgent = new WinterFlowJSONDecorator(i, "COMPLETING_WAITING_CHILDREN");
        WinterFlowServerProtocol = new WinterFlowJSONDecorator(i, "COMPLETING_RETRY");
        WinterFlowThreadListener = new WinterFlowJSONDecorator(i, "TOO_LATE_TO_CANCEL");
        WinterFlowServiceUtility = new WinterFlowJSONDecorator(i, "SEALED");
        WinterFlowSingletonPlatform = new WinterFlowJSONDecorator(i, "NO_VALUE");
        WinterFlowVariableBandwidth = new WinterFlowThreadPoolProcess(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object WinterFlowArrayHelper(WinterFlowResponseDebug winterFlowResponseDebug, WinterFlowControllerScript winterFlowControllerScript, Throwable th, WinterFlowOrchestrationCompiler winterFlowOrchestrationCompiler) {
        WinterFlowRequestQuery winterFlowRequestQuery;
        int i;
        try {
            if (winterFlowOrchestrationCompiler instanceof WinterFlowRequestQuery) {
                winterFlowRequestQuery = (WinterFlowRequestQuery) winterFlowOrchestrationCompiler;
                int i2 = winterFlowRequestQuery.WinterFlowResponseEngine;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    winterFlowRequestQuery.WinterFlowResponseEngine = i2 - Integer.MIN_VALUE;
                    Object obj = winterFlowRequestQuery.WinterFlowSyntax;
                    i = winterFlowRequestQuery.WinterFlowResponseEngine;
                    if (i != 0) {
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                        winterFlowRequestQuery.WinterFlowRouterRouter = th;
                        winterFlowRequestQuery.WinterFlowResponseEngine = 1;
                        Object WinterFlowArrayNetwork2 = winterFlowControllerScript.WinterFlowArrayNetwork(winterFlowResponseDebug, th, winterFlowRequestQuery);
                        Object obj2 = WinterFlowListenerJava.WinterFlowVariableVersionControl;
                        if (WinterFlowArrayNetwork2 == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = winterFlowRequestQuery.WinterFlowRouterRouter;
                        WinterFlowPackageProcess.WinterFlowThreadListener(obj);
                    }
                    return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
                }
            }
            if (i != 0) {
            }
            return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                WinterFlowCloudStack.WinterFlowTransactionManagerStrategy(th2, th);
            }
            throw th2;
        }
        winterFlowRequestQuery = new WinterFlowRequestQuery(winterFlowOrchestrationCompiler);
        Object obj3 = winterFlowRequestQuery.WinterFlowSyntax;
        i = winterFlowRequestQuery.WinterFlowResponseEngine;
    }

    public static WinterFlowCacheManagerNode WinterFlowArrayNetwork(int i) {
        int i2 = (i & 1) != 0 ? 0 : 1;
        int i3 = (i & 2) == 0 ? 16 : 0;
        int i4 = i & 4;
        WinterFlowDataSourceHandler winterFlowDataSourceHandler = WinterFlowDataSourceHandler.WinterFlowVariableVersionControl;
        WinterFlowDataSourceHandler winterFlowDataSourceHandler2 = i4 != 0 ? winterFlowDataSourceHandler : WinterFlowDataSourceHandler.WinterFlowTransactionManagerStrategy;
        if (i2 <= 0 && i3 <= 0 && winterFlowDataSourceHandler2 != winterFlowDataSourceHandler) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + winterFlowDataSourceHandler2).toString());
        }
        int i5 = i3 + i2;
        if (i5 < 0) {
            i5 = Integer.MAX_VALUE;
        }
        return new WinterFlowCacheManagerNode(i2, i5, winterFlowDataSourceHandler2);
    }

    public static final int WinterFlowBackendCacheManager(WinterFlowRepositoryDatabase winterFlowRepositoryDatabase, Object obj, int i) {
        int i2 = winterFlowRepositoryDatabase.WinterFlowUnitTestResponse;
        if (i2 == 0) {
            return -1;
        }
        try {
            int WinterFlowSyntax2 = WinterFlowSyntax(winterFlowRepositoryDatabase.WinterFlowVariableVersionControl, i2, i);
            if (WinterFlowSyntax2 < 0 || WinterFlowManagerRequest.WinterFlowThreadListener(obj, winterFlowRepositoryDatabase.WinterFlowTransactionManagerStrategy[WinterFlowSyntax2])) {
                return WinterFlowSyntax2;
            }
            int i3 = WinterFlowSyntax2 + 1;
            while (i3 < i2 && winterFlowRepositoryDatabase.WinterFlowVariableVersionControl[i3] == i) {
                if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, winterFlowRepositoryDatabase.WinterFlowTransactionManagerStrategy[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = WinterFlowSyntax2 - 1; i4 >= 0 && winterFlowRepositoryDatabase.WinterFlowVariableVersionControl[i4] == i; i4--) {
                if (WinterFlowManagerRequest.WinterFlowThreadListener(obj, winterFlowRepositoryDatabase.WinterFlowTransactionManagerStrategy[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final WinterFlowNodeMechanism WinterFlowBandwidthObject(WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend, WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend2) {
        return winterFlowTransactionManagerBackend == winterFlowTransactionManagerBackend2 ? new WinterFlowListenerTesting(winterFlowTransactionManagerBackend, winterFlowTransactionManagerBackend, 1) : (WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(winterFlowTransactionManagerBackend.WinterFlowHookDataSource, 12884901888L) && WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(winterFlowTransactionManagerBackend2.WinterFlowHookDataSource, 12884901888L)) ? new WinterFlowRendererBandwidth((WinterFlowBatchBatch) winterFlowTransactionManagerBackend, (WinterFlowBatchBatch) winterFlowTransactionManagerBackend2) : new WinterFlowNodeMechanism(winterFlowTransactionManagerBackend, winterFlowTransactionManagerBackend2, 0);
    }

    public static final WinterFlowEventProvider WinterFlowBatchUI(WinterFlowServiceWebsocket winterFlowServiceWebsocket, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice, int i, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        return ((i == 0 || i == -3) && winterFlowDataSourceHandler == WinterFlowDataSourceHandler.WinterFlowVariableVersionControl) ? winterFlowServiceWebsocket : new WinterFlowProcessorEvent(winterFlowServiceWebsocket, winterFlowEncryptionMicroservice, i, winterFlowDataSourceHandler);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WinterFlowCacheManagerAgent(WinterFlowRepositoryWorker[] winterFlowRepositoryWorkerArr, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowConfigurationProcess WinterFlowVersionControlModule;
        boolean z;
        WinterFlowStackEngine WinterFlowConcurrencyThread2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(415205898);
        WinterFlowQueryPackage winterFlowQueryPackage = winterFlowResolverLibrary.WinterFlowResolverController;
        WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
        winterFlowResolverLibrary.WinterFlowConfiguration(201, WinterFlowSessionManagerEntity.WinterFlowHookDataSource);
        if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
            WinterFlowVersionControlModule = winterFlowResolverLibrary.WinterFlowVersionControlModule(WinterFlowTransactionAgent2, WinterFlowQuerySyntax.WinterFlowSyntaxSubsystem(winterFlowRepositoryWorkerArr, WinterFlowTransactionAgent2, WinterFlowConfigurationProcess.WinterFlowRouterRouter));
            winterFlowResolverLibrary.WinterFlowSoftwareEngine = true;
        } else {
            WinterFlowCloudModule winterFlowCloudModule = winterFlowResolverLibrary.WinterFlowPackageIDE;
            Object WinterFlowRouterRouter2 = winterFlowCloudModule.WinterFlowRouterRouter(winterFlowCloudModule.WinterFlowUnitTestResponse, 0);
            WinterFlowRouterRouter2.getClass();
            WinterFlowConfigurationProcess winterFlowConfigurationProcess = (WinterFlowConfigurationProcess) WinterFlowRouterRouter2;
            WinterFlowCloudModule winterFlowCloudModule2 = winterFlowResolverLibrary.WinterFlowPackageIDE;
            Object WinterFlowRouterRouter3 = winterFlowCloudModule2.WinterFlowRouterRouter(winterFlowCloudModule2.WinterFlowUnitTestResponse, 1);
            WinterFlowRouterRouter3.getClass();
            WinterFlowConfigurationProcess winterFlowConfigurationProcess2 = (WinterFlowConfigurationProcess) WinterFlowRouterRouter3;
            WinterFlowConfigurationProcess WinterFlowSyntaxSubsystem = WinterFlowQuerySyntax.WinterFlowSyntaxSubsystem(winterFlowRepositoryWorkerArr, WinterFlowTransactionAgent2, winterFlowConfigurationProcess2);
            if (winterFlowResolverLibrary.WinterFlowBackendCacheManager() && !winterFlowResolverLibrary.WinterFlowConsumerUserManager && winterFlowConfigurationProcess2.equals(WinterFlowSyntaxSubsystem)) {
                winterFlowResolverLibrary.WinterFlowServerProtocol = winterFlowResolverLibrary.WinterFlowPackageIDE.WinterFlowVariableBandwidth() + winterFlowResolverLibrary.WinterFlowServerProtocol;
                WinterFlowVersionControlModule = winterFlowConfigurationProcess;
            } else {
                WinterFlowVersionControlModule = winterFlowResolverLibrary.WinterFlowVersionControlModule(WinterFlowTransactionAgent2, WinterFlowSyntaxSubsystem);
                if (winterFlowResolverLibrary.WinterFlowConsumerUserManager || !WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowVersionControlModule, winterFlowConfigurationProcess)) {
                    z = true;
                    if (z && !winterFlowResolverLibrary.WinterFlowProxyStructure) {
                        winterFlowResolverLibrary.WinterFlowUserManagerUserManager(WinterFlowVersionControlModule);
                    }
                    winterFlowQueryPackage.WinterFlowCacheManagerAgent(winterFlowResolverLibrary.WinterFlowMapperProtocol ? 1 : 0);
                    winterFlowResolverLibrary.WinterFlowMapperProtocol = z;
                    winterFlowResolverLibrary.WinterFlowSyntaxSubsystem = WinterFlowVersionControlModule;
                    winterFlowResolverLibrary.WinterFlowCacheTool(202, 0, WinterFlowSessionManagerEntity.WinterFlowCacheManagerAgent, WinterFlowVersionControlModule);
                    winterFlowEventTool.WinterFlowVariableVersionControl(winterFlowResolverLibrary, Integer.valueOf((i >> 3) & 14));
                    winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                    winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                    winterFlowResolverLibrary.WinterFlowMapperProtocol = winterFlowQueryPackage.WinterFlowHookDataSource() != 0;
                    winterFlowResolverLibrary.WinterFlowSyntaxSubsystem = null;
                    WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
                    if (WinterFlowConcurrencyThread2 == null) {
                        WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowUILibrary(winterFlowRepositoryWorkerArr, winterFlowEventTool, i, 2);
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        if (z) {
            winterFlowResolverLibrary.WinterFlowUserManagerUserManager(WinterFlowVersionControlModule);
        }
        winterFlowQueryPackage.WinterFlowCacheManagerAgent(winterFlowResolverLibrary.WinterFlowMapperProtocol ? 1 : 0);
        winterFlowResolverLibrary.WinterFlowMapperProtocol = z;
        winterFlowResolverLibrary.WinterFlowSyntaxSubsystem = WinterFlowVersionControlModule;
        winterFlowResolverLibrary.WinterFlowCacheTool(202, 0, WinterFlowSessionManagerEntity.WinterFlowCacheManagerAgent, WinterFlowVersionControlModule);
        winterFlowEventTool.WinterFlowVariableVersionControl(winterFlowResolverLibrary, Integer.valueOf((i >> 3) & 14));
        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        winterFlowResolverLibrary.WinterFlowMapperProtocol = winterFlowQueryPackage.WinterFlowHookDataSource() != 0;
        winterFlowResolverLibrary.WinterFlowSyntaxSubsystem = null;
        WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 == null) {
        }
    }

    public static final float[] WinterFlowCacheManagerListener(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }

    public static final void WinterFlowCompilerHandler(List list, WinterFlowManagerCloud winterFlowManagerCloud) {
        Path path;
        int i;
        float f;
        int i2;
        WinterFlowServiceProviderTool winterFlowServiceProviderTool;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        List list2 = list;
        Path path2 = winterFlowManagerCloud.WinterFlowRouterStructure;
        Path.FillType fillType = path2.getFillType();
        Path.FillType fillType2 = Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path2.rewind();
        if (!z) {
            fillType2 = Path.FillType.WINDING;
        }
        path2.setFillType(fillType2);
        WinterFlowServiceProviderTool winterFlowServiceProviderTool2 = list2.isEmpty() ? WinterFlowControllerDatabaseSchema.WinterFlowCacheManagerAgent : (WinterFlowServiceProviderTool) list2.get(0);
        int size = list2.size();
        float f12 = 0.0f;
        int i3 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        while (i3 < size) {
            WinterFlowServiceProviderTool winterFlowServiceProviderTool3 = (WinterFlowServiceProviderTool) list2.get(i3);
            if (winterFlowServiceProviderTool3 instanceof WinterFlowControllerDatabaseSchema) {
                path2.close();
                path = path2;
                i = size;
                f = f12;
                i2 = i3;
                winterFlowServiceProviderTool = winterFlowServiceProviderTool3;
                f13 = f17;
                f15 = f13;
                f14 = f18;
                f16 = f14;
            } else {
                if (winterFlowServiceProviderTool3 instanceof WinterFlowExceptionSubsystem) {
                    WinterFlowExceptionSubsystem winterFlowExceptionSubsystem = (WinterFlowExceptionSubsystem) winterFlowServiceProviderTool3;
                    float f19 = winterFlowExceptionSubsystem.WinterFlowCacheManagerAgent;
                    f15 += f19;
                    float f20 = winterFlowExceptionSubsystem.WinterFlowArrayNetwork;
                    f16 += f20;
                    path2.rMoveTo(f19, f20);
                    path = path2;
                    i = size;
                    f = f12;
                    i2 = i3;
                    f17 = f15;
                    f18 = f16;
                } else {
                    if (winterFlowServiceProviderTool3 instanceof WinterFlowUnitTestModule) {
                        WinterFlowUnitTestModule winterFlowUnitTestModule = (WinterFlowUnitTestModule) winterFlowServiceProviderTool3;
                        float f21 = winterFlowUnitTestModule.WinterFlowCacheManagerAgent;
                        float f22 = winterFlowUnitTestModule.WinterFlowArrayNetwork;
                        path2.moveTo(f21, f22);
                        path = path2;
                        f16 = f22;
                        f18 = f16;
                        f15 = f21;
                        f17 = f15;
                    } else {
                        if (winterFlowServiceProviderTool3 instanceof WinterFlowQueueClass) {
                            WinterFlowQueueClass winterFlowQueueClass = (WinterFlowQueueClass) winterFlowServiceProviderTool3;
                            float f23 = winterFlowQueueClass.WinterFlowArrayNetwork;
                            float f24 = winterFlowQueueClass.WinterFlowCacheManagerAgent;
                            path2.rLineTo(f24, f23);
                            f15 += f24;
                            f16 += f23;
                        } else if (winterFlowServiceProviderTool3 instanceof WinterFlowFrameworkConsumer) {
                            WinterFlowFrameworkConsumer winterFlowFrameworkConsumer = (WinterFlowFrameworkConsumer) winterFlowServiceProviderTool3;
                            float f25 = winterFlowFrameworkConsumer.WinterFlowArrayNetwork;
                            float f26 = winterFlowFrameworkConsumer.WinterFlowCacheManagerAgent;
                            path2.lineTo(f26, f25);
                            path = path2;
                            f15 = f26;
                            f16 = f25;
                        } else if (winterFlowServiceProviderTool3 instanceof WinterFlowStackCache) {
                            float f27 = ((WinterFlowStackCache) winterFlowServiceProviderTool3).WinterFlowCacheManagerAgent;
                            path2.rLineTo(f27, f12);
                            f15 += f27;
                        } else if (winterFlowServiceProviderTool3 instanceof WinterFlowClassConfiguration) {
                            float f28 = ((WinterFlowClassConfiguration) winterFlowServiceProviderTool3).WinterFlowCacheManagerAgent;
                            path2.lineTo(f28, f16);
                            path = path2;
                            f15 = f28;
                        } else if (winterFlowServiceProviderTool3 instanceof WinterFlowWebsocketNetwork) {
                            float f29 = ((WinterFlowWebsocketNetwork) winterFlowServiceProviderTool3).WinterFlowCacheManagerAgent;
                            path2.rLineTo(f12, f29);
                            f16 += f29;
                        } else if (winterFlowServiceProviderTool3 instanceof WinterFlowRequestInterface) {
                            float f30 = ((WinterFlowRequestInterface) winterFlowServiceProviderTool3).WinterFlowCacheManagerAgent;
                            path2.lineTo(f15, f30);
                            path = path2;
                            f16 = f30;
                        } else {
                            if (winterFlowServiceProviderTool3 instanceof WinterFlowMiddlewareManager) {
                                WinterFlowMiddlewareManager winterFlowMiddlewareManager = (WinterFlowMiddlewareManager) winterFlowServiceProviderTool3;
                                path2.rCubicTo(winterFlowMiddlewareManager.WinterFlowCacheManagerAgent, winterFlowMiddlewareManager.WinterFlowArrayNetwork, winterFlowMiddlewareManager.WinterFlowVariableVersionControl, winterFlowMiddlewareManager.WinterFlowTransactionManagerStrategy, winterFlowMiddlewareManager.WinterFlowUnitTestResponse, winterFlowMiddlewareManager.WinterFlowRouterRouter);
                                f4 = winterFlowMiddlewareManager.WinterFlowVariableVersionControl + f15;
                                f5 = winterFlowMiddlewareManager.WinterFlowTransactionManagerStrategy + f16;
                                f15 += winterFlowMiddlewareManager.WinterFlowUnitTestResponse;
                                f11 = winterFlowMiddlewareManager.WinterFlowRouterRouter;
                            } else {
                                if (winterFlowServiceProviderTool3 instanceof WinterFlowSchedulerManager) {
                                    WinterFlowSchedulerManager winterFlowSchedulerManager = (WinterFlowSchedulerManager) winterFlowServiceProviderTool3;
                                    path2.cubicTo(winterFlowSchedulerManager.WinterFlowCacheManagerAgent, winterFlowSchedulerManager.WinterFlowArrayNetwork, winterFlowSchedulerManager.WinterFlowVariableVersionControl, winterFlowSchedulerManager.WinterFlowTransactionManagerStrategy, winterFlowSchedulerManager.WinterFlowUnitTestResponse, winterFlowSchedulerManager.WinterFlowRouterRouter);
                                    f4 = winterFlowSchedulerManager.WinterFlowVariableVersionControl;
                                    f6 = winterFlowSchedulerManager.WinterFlowTransactionManagerStrategy;
                                    f7 = winterFlowSchedulerManager.WinterFlowUnitTestResponse;
                                    f8 = winterFlowSchedulerManager.WinterFlowRouterRouter;
                                } else if (winterFlowServiceProviderTool3 instanceof WinterFlowInterfaceWorker) {
                                    if (winterFlowServiceProviderTool2.WinterFlowRouterStructure) {
                                        f9 = f15 - f13;
                                        f10 = f16 - f14;
                                    } else {
                                        f9 = f12;
                                        f10 = f9;
                                    }
                                    WinterFlowInterfaceWorker winterFlowInterfaceWorker = (WinterFlowInterfaceWorker) winterFlowServiceProviderTool3;
                                    path2.rCubicTo(f9, f10, winterFlowInterfaceWorker.WinterFlowCacheManagerAgent, winterFlowInterfaceWorker.WinterFlowArrayNetwork, winterFlowInterfaceWorker.WinterFlowVariableVersionControl, winterFlowInterfaceWorker.WinterFlowTransactionManagerStrategy);
                                    f4 = winterFlowInterfaceWorker.WinterFlowCacheManagerAgent + f15;
                                    f5 = winterFlowInterfaceWorker.WinterFlowArrayNetwork + f16;
                                    f15 += winterFlowInterfaceWorker.WinterFlowVariableVersionControl;
                                    f11 = winterFlowInterfaceWorker.WinterFlowTransactionManagerStrategy;
                                } else if (winterFlowServiceProviderTool3 instanceof WinterFlowLoaderSubsystem) {
                                    if (winterFlowServiceProviderTool2.WinterFlowRouterStructure) {
                                        f15 = (f15 * 2.0f) - f13;
                                        f16 = (2.0f * f16) - f14;
                                    }
                                    WinterFlowLoaderSubsystem winterFlowLoaderSubsystem = (WinterFlowLoaderSubsystem) winterFlowServiceProviderTool3;
                                    path2.cubicTo(f15, f16, winterFlowLoaderSubsystem.WinterFlowCacheManagerAgent, winterFlowLoaderSubsystem.WinterFlowArrayNetwork, winterFlowLoaderSubsystem.WinterFlowVariableVersionControl, winterFlowLoaderSubsystem.WinterFlowTransactionManagerStrategy);
                                    f4 = winterFlowLoaderSubsystem.WinterFlowCacheManagerAgent;
                                    f6 = winterFlowLoaderSubsystem.WinterFlowArrayNetwork;
                                    f7 = winterFlowLoaderSubsystem.WinterFlowVariableVersionControl;
                                    f8 = winterFlowLoaderSubsystem.WinterFlowTransactionManagerStrategy;
                                } else if (winterFlowServiceProviderTool3 instanceof WinterFlowTransactionDebug) {
                                    WinterFlowTransactionDebug winterFlowTransactionDebug = (WinterFlowTransactionDebug) winterFlowServiceProviderTool3;
                                    float f31 = winterFlowTransactionDebug.WinterFlowTransactionManagerStrategy;
                                    float f32 = winterFlowTransactionDebug.WinterFlowVariableVersionControl;
                                    float f33 = winterFlowTransactionDebug.WinterFlowArrayNetwork;
                                    float f34 = winterFlowTransactionDebug.WinterFlowCacheManagerAgent;
                                    path2.rQuadTo(f34, f33, f32, f31);
                                    float f35 = f34 + f15;
                                    float f36 = f33 + f16;
                                    f15 += f32;
                                    f16 += f31;
                                    path = path2;
                                    f13 = f35;
                                    f14 = f36;
                                } else if (winterFlowServiceProviderTool3 instanceof WinterFlowInterfaceService) {
                                    WinterFlowInterfaceService winterFlowInterfaceService = (WinterFlowInterfaceService) winterFlowServiceProviderTool3;
                                    float f37 = winterFlowInterfaceService.WinterFlowTransactionManagerStrategy;
                                    float f38 = winterFlowInterfaceService.WinterFlowVariableVersionControl;
                                    float f39 = winterFlowInterfaceService.WinterFlowArrayNetwork;
                                    f4 = winterFlowInterfaceService.WinterFlowCacheManagerAgent;
                                    path2.quadTo(f4, f39, f38, f37);
                                    path = path2;
                                    f16 = f37;
                                    f15 = f38;
                                    f14 = f39;
                                    i = size;
                                    f = f12;
                                    i2 = i3;
                                    winterFlowServiceProviderTool = winterFlowServiceProviderTool3;
                                    f13 = f4;
                                } else if (winterFlowServiceProviderTool3 instanceof WinterFlowWebsocketView) {
                                    if (winterFlowServiceProviderTool2.WinterFlowHookDataSource) {
                                        f2 = f15 - f13;
                                        f3 = f16 - f14;
                                    } else {
                                        f2 = f12;
                                        f3 = f2;
                                    }
                                    WinterFlowWebsocketView winterFlowWebsocketView = (WinterFlowWebsocketView) winterFlowServiceProviderTool3;
                                    float f40 = winterFlowWebsocketView.WinterFlowArrayNetwork;
                                    float f41 = winterFlowWebsocketView.WinterFlowCacheManagerAgent;
                                    path2.rQuadTo(f2, f3, f41, f40);
                                    f4 = f2 + f15;
                                    f5 = f3 + f16;
                                    f15 += f41;
                                    f16 += f40;
                                    path = path2;
                                    f14 = f5;
                                    i = size;
                                    f = f12;
                                    i2 = i3;
                                    winterFlowServiceProviderTool = winterFlowServiceProviderTool3;
                                    f13 = f4;
                                } else if (winterFlowServiceProviderTool3 instanceof WinterFlowSyntaxInterface) {
                                    if (winterFlowServiceProviderTool2.WinterFlowHookDataSource) {
                                        f15 = (f15 * 2.0f) - f13;
                                        f16 = (2.0f * f16) - f14;
                                    }
                                    WinterFlowSyntaxInterface winterFlowSyntaxInterface = (WinterFlowSyntaxInterface) winterFlowServiceProviderTool3;
                                    float f42 = winterFlowSyntaxInterface.WinterFlowArrayNetwork;
                                    float f43 = winterFlowSyntaxInterface.WinterFlowCacheManagerAgent;
                                    path2.quadTo(f15, f16, f43, f42);
                                    path = path2;
                                    i = size;
                                    f = f12;
                                    i2 = i3;
                                    f14 = f16;
                                    winterFlowServiceProviderTool = winterFlowServiceProviderTool3;
                                    f16 = f42;
                                    f13 = f15;
                                    f15 = f43;
                                } else if (winterFlowServiceProviderTool3 instanceof WinterFlowExceptionStructure) {
                                    WinterFlowExceptionStructure winterFlowExceptionStructure = (WinterFlowExceptionStructure) winterFlowServiceProviderTool3;
                                    float f44 = winterFlowExceptionStructure.WinterFlowRouterRouter + f15;
                                    float f45 = winterFlowExceptionStructure.WinterFlowSyntax + f16;
                                    i = size;
                                    f = 0.0f;
                                    path = path2;
                                    i2 = i3;
                                    WinterFlowSingletonPlatform(winterFlowManagerCloud, f15, f16, f44, f45, winterFlowExceptionStructure.WinterFlowCacheManagerAgent, winterFlowExceptionStructure.WinterFlowArrayNetwork, winterFlowExceptionStructure.WinterFlowVariableVersionControl, winterFlowExceptionStructure.WinterFlowTransactionManagerStrategy, winterFlowExceptionStructure.WinterFlowUnitTestResponse);
                                    f13 = f44;
                                    f15 = f13;
                                    f14 = f45;
                                    f16 = f14;
                                    winterFlowServiceProviderTool = winterFlowServiceProviderTool3;
                                } else {
                                    path = path2;
                                    i = size;
                                    f = f12;
                                    i2 = i3;
                                    if (!(winterFlowServiceProviderTool3 instanceof WinterFlowExceptionEventEmitter)) {
                                        WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                                        return;
                                    }
                                    WinterFlowExceptionEventEmitter winterFlowExceptionEventEmitter = (WinterFlowExceptionEventEmitter) winterFlowServiceProviderTool3;
                                    float f46 = winterFlowExceptionEventEmitter.WinterFlowSyntax;
                                    float f47 = winterFlowExceptionEventEmitter.WinterFlowRouterRouter;
                                    winterFlowServiceProviderTool = winterFlowServiceProviderTool3;
                                    WinterFlowSingletonPlatform(winterFlowManagerCloud, f15, f16, f47, f46, winterFlowExceptionEventEmitter.WinterFlowCacheManagerAgent, winterFlowExceptionEventEmitter.WinterFlowArrayNetwork, winterFlowExceptionEventEmitter.WinterFlowVariableVersionControl, winterFlowExceptionEventEmitter.WinterFlowTransactionManagerStrategy, winterFlowExceptionEventEmitter.WinterFlowUnitTestResponse);
                                    f14 = f46;
                                    f16 = f14;
                                    f13 = f47;
                                    f15 = f13;
                                }
                                path = path2;
                                f15 = f7;
                                f16 = f8;
                                i = size;
                                f = f12;
                                i2 = i3;
                                winterFlowServiceProviderTool = winterFlowServiceProviderTool3;
                                f14 = f6;
                                f13 = f4;
                            }
                            f16 += f11;
                            path = path2;
                            f14 = f5;
                            i = size;
                            f = f12;
                            i2 = i3;
                            winterFlowServiceProviderTool = winterFlowServiceProviderTool3;
                            f13 = f4;
                        }
                        path = path2;
                    }
                    i = size;
                    f = f12;
                    i2 = i3;
                }
                winterFlowServiceProviderTool = winterFlowServiceProviderTool3;
            }
            i3 = i2 + 1;
            list2 = list;
            size = i;
            path2 = path;
            winterFlowServiceProviderTool2 = winterFlowServiceProviderTool;
            f12 = f;
        }
    }

    public static WinterFlowCloudCache WinterFlowCompilerVariable(WinterFlowArrayInterface winterFlowArrayInterface, WinterFlowObjectUI winterFlowObjectUI) {
        WinterFlowCacheUtility winterFlowCacheUtility = WinterFlowCacheUtility.WinterFlowCompilerHandler;
        int ordinal = winterFlowArrayInterface.ordinal();
        if (ordinal == 0) {
            return new WinterFlowRendererNode(winterFlowObjectUI);
        }
        if (ordinal == 1) {
            WinterFlowDeploymentProcessor winterFlowDeploymentProcessor = new WinterFlowDeploymentProcessor();
            winterFlowDeploymentProcessor.WinterFlowVariableVersionControl = winterFlowObjectUI;
            winterFlowDeploymentProcessor.WinterFlowTransactionManagerStrategy = winterFlowCacheUtility;
            return winterFlowDeploymentProcessor;
        }
        if (ordinal != 2) {
            WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
            return null;
        }
        WinterFlowPipelineSession winterFlowPipelineSession = new WinterFlowPipelineSession();
        winterFlowPipelineSession.WinterFlowVariableVersionControl = winterFlowObjectUI;
        winterFlowPipelineSession.WinterFlowTransactionManagerStrategy = winterFlowCacheUtility;
        return winterFlowPipelineSession;
    }

    public static void WinterFlowConcurrencyThread(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            WinterFlowQueueManager winterFlowQueueManager = (WinterFlowQueueManager) obj;
            WinterFlowBatchTool winterFlowBatchTool = new WinterFlowBatchTool(winterFlowQueueManager);
            for (WinterFlowValidatorProcess winterFlowValidatorProcess : winterFlowQueueManager.WinterFlowHookDataSource) {
                boolean z = winterFlowQueueManager.WinterFlowVariableVersionControl == 0;
                WinterFlowMiddlewareNetwork winterFlowMiddlewareNetwork = new WinterFlowMiddlewareNetwork(winterFlowValidatorProcess, !z);
                if (!hashMap.containsKey(winterFlowMiddlewareNetwork)) {
                    hashMap.put(winterFlowMiddlewareNetwork, new HashSet());
                }
                Set set = (Set) hashMap.get(winterFlowMiddlewareNetwork);
                if (!set.isEmpty() && z) {
                    throw new IllegalArgumentException("Multiple components provide " + winterFlowValidatorProcess + ".");
                }
                set.add(winterFlowBatchTool);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            for (WinterFlowBatchTool winterFlowBatchTool2 : (Set) it.next()) {
                for (WinterFlowOrchestrationConcurrency winterFlowOrchestrationConcurrency : winterFlowBatchTool2.WinterFlowRouterStructure.WinterFlowCacheManagerAgent) {
                    if (winterFlowOrchestrationConcurrency.WinterFlowCacheManagerAgent == 0) {
                        Set<WinterFlowBatchTool> set2 = (Set) hashMap.get(new WinterFlowMiddlewareNetwork(winterFlowOrchestrationConcurrency.WinterFlowRouterStructure, winterFlowOrchestrationConcurrency.WinterFlowHookDataSource == 2));
                        if (set2 != null) {
                            for (WinterFlowBatchTool winterFlowBatchTool3 : set2) {
                                winterFlowBatchTool2.WinterFlowHookDataSource.add(winterFlowBatchTool3);
                                winterFlowBatchTool3.WinterFlowCacheManagerAgent.add(winterFlowBatchTool2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            hashSet.addAll((Set) it2.next());
        }
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            WinterFlowBatchTool winterFlowBatchTool4 = (WinterFlowBatchTool) it3.next();
            if (winterFlowBatchTool4.WinterFlowCacheManagerAgent.isEmpty()) {
                hashSet2.add(winterFlowBatchTool4);
            }
        }
        while (!hashSet2.isEmpty()) {
            WinterFlowBatchTool winterFlowBatchTool5 = (WinterFlowBatchTool) hashSet2.iterator().next();
            hashSet2.remove(winterFlowBatchTool5);
            i++;
            Iterator it4 = winterFlowBatchTool5.WinterFlowHookDataSource.iterator();
            while (it4.hasNext()) {
                WinterFlowBatchTool winterFlowBatchTool6 = (WinterFlowBatchTool) it4.next();
                winterFlowBatchTool6.WinterFlowCacheManagerAgent.remove(winterFlowBatchTool5);
                if (winterFlowBatchTool6.WinterFlowCacheManagerAgent.isEmpty()) {
                    hashSet2.add(winterFlowBatchTool6);
                }
            }
        }
        if (i == arrayList.size()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it5 = hashSet.iterator();
        while (it5.hasNext()) {
            WinterFlowBatchTool winterFlowBatchTool7 = (WinterFlowBatchTool) it5.next();
            if (!winterFlowBatchTool7.WinterFlowCacheManagerAgent.isEmpty() && !winterFlowBatchTool7.WinterFlowHookDataSource.isEmpty()) {
                arrayList2.add(winterFlowBatchTool7.WinterFlowRouterStructure);
            }
        }
        throw new WinterFlowRuntimeDatabaseSchema("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
    }

    public static WinterFlowRendererNode WinterFlowConfigurationSubsystem(WinterFlowObjectUI winterFlowObjectUI) {
        winterFlowObjectUI.getClass();
        return new WinterFlowRendererNode(winterFlowObjectUI);
    }

    public static final WinterFlowDatabaseProcess WinterFlowConsumerUserManager(WinterFlowTransactionVariable winterFlowTransactionVariable) {
        WinterFlowDatabaseProcess winterFlowDatabaseProcess;
        winterFlowTransactionVariable.getClass();
        synchronized (WinterFlowVariableBandwidth) {
            winterFlowDatabaseProcess = (WinterFlowDatabaseProcess) winterFlowTransactionVariable.WinterFlowCacheManagerAgent("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (winterFlowDatabaseProcess == null) {
                WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice = WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl;
                try {
                    WinterFlowCacheDecorator winterFlowCacheDecorator = WinterFlowInheritanceUtility.WinterFlowRouterStructure;
                    winterFlowEncryptionMicroservice = WinterFlowEventEmitterRepository.WinterFlowRouterStructure.WinterFlowResponseEngine;
                } catch (WinterFlowDecoratorEventEmitter | IllegalStateException unused) {
                }
                WinterFlowDatabaseProcess winterFlowDatabaseProcess2 = new WinterFlowDatabaseProcess(winterFlowEncryptionMicroservice.WinterFlowOrchestrationSubsystem(WinterFlowFrameworkMechanism.WinterFlowHookDataSource()));
                winterFlowTransactionVariable.WinterFlowRouterStructure("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", winterFlowDatabaseProcess2);
                winterFlowDatabaseProcess = winterFlowDatabaseProcess2;
            }
        }
        return winterFlowDatabaseProcess;
    }

    public static final float[] WinterFlowEventEmitterController(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    public static final Object WinterFlowFrontendBackend(Object obj) {
        WinterFlowPackageSubsystem winterFlowPackageSubsystem = obj instanceof WinterFlowPackageSubsystem ? (WinterFlowPackageSubsystem) obj : null;
        return winterFlowPackageSubsystem != null ? winterFlowPackageSubsystem.WinterFlowRouterStructure : obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WinterFlowHookDataSource(WinterFlowRepositoryWorker winterFlowRepositoryWorker, WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        WinterFlowFunctionThreadPool winterFlowFunctionThreadPool;
        boolean z;
        WinterFlowStackEngine WinterFlowConcurrencyThread2;
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-149765515);
        WinterFlowQueryPackage winterFlowQueryPackage = winterFlowResolverLibrary.WinterFlowResolverController;
        WinterFlowConfigurationProcess WinterFlowTransactionAgent2 = winterFlowResolverLibrary.WinterFlowTransactionAgent();
        winterFlowResolverLibrary.WinterFlowConfiguration(201, WinterFlowSessionManagerEntity.WinterFlowHookDataSource);
        Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
        if (WinterFlowManagerRequest.WinterFlowThreadListener(WinterFlowSyntaxSubsystem, WinterFlowModuleModule.WinterFlowRouterStructure)) {
            winterFlowFunctionThreadPool = null;
        } else {
            WinterFlowSyntaxSubsystem.getClass();
            winterFlowFunctionThreadPool = (WinterFlowFunctionThreadPool) WinterFlowSyntaxSubsystem;
        }
        WinterFlowProtocolEntity winterFlowProtocolEntity = winterFlowRepositoryWorker.WinterFlowRouterStructure;
        WinterFlowFunctionThreadPool WinterFlowCacheManagerAgent2 = winterFlowProtocolEntity.WinterFlowCacheManagerAgent(winterFlowRepositoryWorker, winterFlowFunctionThreadPool);
        boolean equals = WinterFlowCacheManagerAgent2.equals(winterFlowFunctionThreadPool);
        if (!equals) {
            winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowCacheManagerAgent2);
        }
        int i2 = 1;
        if (winterFlowResolverLibrary.WinterFlowProxyStructure) {
            if (winterFlowRepositoryWorker.WinterFlowTransactionManagerStrategy || !WinterFlowTransactionAgent2.containsKey(winterFlowProtocolEntity)) {
                WinterFlowTransactionAgent2 = WinterFlowTransactionAgent2.WinterFlowHookDataSource(winterFlowProtocolEntity, WinterFlowCacheManagerAgent2);
            }
            winterFlowResolverLibrary.WinterFlowSoftwareEngine = true;
        } else {
            WinterFlowCloudModule winterFlowCloudModule = winterFlowResolverLibrary.WinterFlowPackageIDE;
            Object WinterFlowHookDataSource2 = winterFlowCloudModule.WinterFlowHookDataSource(winterFlowCloudModule.WinterFlowHookDataSource, winterFlowCloudModule.WinterFlowUnitTestResponse);
            WinterFlowHookDataSource2.getClass();
            WinterFlowConfigurationProcess winterFlowConfigurationProcess = (WinterFlowConfigurationProcess) WinterFlowHookDataSource2;
            if (!(winterFlowResolverLibrary.WinterFlowBackendCacheManager() && equals) && (winterFlowRepositoryWorker.WinterFlowTransactionManagerStrategy || !WinterFlowTransactionAgent2.containsKey(winterFlowProtocolEntity))) {
                WinterFlowTransactionAgent2 = WinterFlowTransactionAgent2.WinterFlowHookDataSource(winterFlowProtocolEntity, WinterFlowCacheManagerAgent2);
            } else if ((equals && !winterFlowResolverLibrary.WinterFlowMapperProtocol) || !winterFlowResolverLibrary.WinterFlowMapperProtocol) {
                WinterFlowTransactionAgent2 = winterFlowConfigurationProcess;
            }
            if (winterFlowResolverLibrary.WinterFlowConsumerUserManager || winterFlowConfigurationProcess != WinterFlowTransactionAgent2) {
                z = true;
                if (z && !winterFlowResolverLibrary.WinterFlowProxyStructure) {
                    winterFlowResolverLibrary.WinterFlowUserManagerUserManager(WinterFlowTransactionAgent2);
                }
                winterFlowQueryPackage.WinterFlowCacheManagerAgent(winterFlowResolverLibrary.WinterFlowMapperProtocol ? 1 : 0);
                winterFlowResolverLibrary.WinterFlowMapperProtocol = z;
                winterFlowResolverLibrary.WinterFlowSyntaxSubsystem = WinterFlowTransactionAgent2;
                winterFlowResolverLibrary.WinterFlowCacheTool(202, 0, WinterFlowSessionManagerEntity.WinterFlowCacheManagerAgent, WinterFlowTransactionAgent2);
                winterFlowEventTool.WinterFlowVariableVersionControl(winterFlowResolverLibrary, Integer.valueOf((i >> 3) & 14));
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
                winterFlowResolverLibrary.WinterFlowMapperProtocol = winterFlowQueryPackage.WinterFlowHookDataSource() != 0;
                winterFlowResolverLibrary.WinterFlowSyntaxSubsystem = null;
                WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
                if (WinterFlowConcurrencyThread2 == null) {
                    WinterFlowConcurrencyThread2.WinterFlowArrayNetwork = new WinterFlowUILibrary(winterFlowRepositoryWorker, winterFlowEventTool, i, i2);
                    return;
                }
                return;
            }
        }
        z = false;
        if (z) {
            winterFlowResolverLibrary.WinterFlowUserManagerUserManager(WinterFlowTransactionAgent2);
        }
        winterFlowQueryPackage.WinterFlowCacheManagerAgent(winterFlowResolverLibrary.WinterFlowMapperProtocol ? 1 : 0);
        winterFlowResolverLibrary.WinterFlowMapperProtocol = z;
        winterFlowResolverLibrary.WinterFlowSyntaxSubsystem = WinterFlowTransactionAgent2;
        winterFlowResolverLibrary.WinterFlowCacheTool(202, 0, WinterFlowSessionManagerEntity.WinterFlowCacheManagerAgent, WinterFlowTransactionAgent2);
        winterFlowEventTool.WinterFlowVariableVersionControl(winterFlowResolverLibrary, Integer.valueOf((i >> 3) & 14));
        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        winterFlowResolverLibrary.WinterFlowBandwidthObject(false);
        winterFlowResolverLibrary.WinterFlowMapperProtocol = winterFlowQueryPackage.WinterFlowHookDataSource() != 0;
        winterFlowResolverLibrary.WinterFlowSyntaxSubsystem = null;
        WinterFlowConcurrencyThread2 = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread2 == null) {
        }
    }

    public static WinterFlowHookTool WinterFlowMapperProtocol(WinterFlowServerLayer winterFlowServerLayer) {
        winterFlowServerLayer.getClass();
        return WinterFlowFrontendSubsystem.WinterFlowServiceUtility(winterFlowServerLayer, new WinterFlowInterfaceSoftware(28));
    }

    public static WinterFlowTransactionVariable WinterFlowOrchestrationSubsystem(Class cls) {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException("Cannot create an instance of " + cls);
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (WinterFlowTransactionVariable) newInstance;
            } catch (IllegalAccessException e) {
                WinterFlowEventEmitterOrchestration.WinterFlowServerProtocol("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                WinterFlowEventEmitterOrchestration.WinterFlowServerProtocol("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            WinterFlowEventEmitterOrchestration.WinterFlowServerProtocol("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static final WinterFlowMapperManager WinterFlowPackageIDE(WinterFlowMapperManager winterFlowMapperManager, WinterFlowObjectSession winterFlowObjectSession) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowEventHook(winterFlowObjectSession));
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WinterFlowResponse WinterFlowResolverController(Display display, int i) {
        RoundedCorner roundedCorner;
        int position;
        int i2;
        int radius;
        Point center;
        if (Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject(WinterFlowResolverBackend.WinterFlowSyntax("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new WinterFlowResponse(i2, radius, center);
    }

    public static final int WinterFlowResponseEngine(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final int WinterFlowRouterAdapter(WinterFlowObjectHook winterFlowObjectHook, int i) {
        boolean z = winterFlowObjectHook.compareTo(WinterFlowObjectHook.WinterFlowRouterRouter) >= 0;
        boolean z2 = i == 1;
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final WinterFlowDatabaseSchemaHandler WinterFlowRouterRouter(WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler) {
        if (winterFlowDatabaseSchemaHandler == null) {
            winterFlowDatabaseSchemaHandler = null;
        }
        if (winterFlowDatabaseSchemaHandler != null) {
            return winterFlowDatabaseSchemaHandler;
        }
        WinterFlowSessionManagerEntity.WinterFlowHookDataSource("Inconsistent composition");
        throw new WinterFlowServerSystem();
    }

    public static WinterFlowWorkerThreadPool WinterFlowRouterStructure(int i, int i2, WinterFlowDataSourceHandler winterFlowDataSourceHandler) {
        int i3 = i2 & 2;
        WinterFlowDataSourceHandler winterFlowDataSourceHandler2 = WinterFlowDataSourceHandler.WinterFlowVariableVersionControl;
        if (i3 != 0) {
            winterFlowDataSourceHandler = winterFlowDataSourceHandler2;
        }
        if (i == -2) {
            if (winterFlowDataSourceHandler != winterFlowDataSourceHandler2) {
                return new WinterFlowArrayFunction(1, winterFlowDataSourceHandler);
            }
            WinterFlowFrameworkAgent.WinterFlowHookDataSource.getClass();
            return new WinterFlowWorkerThreadPool(WinterFlowResponseNetwork.WinterFlowHookDataSource);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? winterFlowDataSourceHandler == winterFlowDataSourceHandler2 ? new WinterFlowWorkerThreadPool(i) : new WinterFlowArrayFunction(i, winterFlowDataSourceHandler) : new WinterFlowWorkerThreadPool(Integer.MAX_VALUE) : winterFlowDataSourceHandler == winterFlowDataSourceHandler2 ? new WinterFlowWorkerThreadPool(0) : new WinterFlowArrayFunction(1, winterFlowDataSourceHandler);
        }
        if (winterFlowDataSourceHandler == winterFlowDataSourceHandler2) {
            return new WinterFlowArrayFunction(1, WinterFlowDataSourceHandler.WinterFlowTransactionManagerStrategy);
        }
        WinterFlowEventEmitterOrchestration.WinterFlowBandwidthObject("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static String WinterFlowSerializerStructure(WinterFlowUIMiddleware winterFlowUIMiddleware, int i) {
        winterFlowUIMiddleware.getClass();
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            Context context = winterFlowUIMiddleware.WinterFlowRouterStructure;
            context.getClass();
            String resourceName = context.getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public static int WinterFlowServerProtocol(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new WinterFlowLibraryInvoker(context).WinterFlowRouterStructure.areNotificationsEnabled() ? 0 : -1;
        }
        WinterFlowCompilerMechanism.WinterFlowTransactionManagerStrategy("permission must be non-null");
        return 0;
    }

    public static final boolean WinterFlowServiceUtility(WinterFlowGatewayPlatform winterFlowGatewayPlatform, WinterFlowGatewayPlatform winterFlowGatewayPlatform2) {
        if (winterFlowGatewayPlatform == winterFlowGatewayPlatform2) {
            return true;
        }
        return Math.abs(winterFlowGatewayPlatform.WinterFlowRouterStructure - winterFlowGatewayPlatform2.WinterFlowRouterStructure) < 0.001f && Math.abs(winterFlowGatewayPlatform.WinterFlowHookDataSource - winterFlowGatewayPlatform2.WinterFlowHookDataSource) < 0.001f;
    }

    public static final void WinterFlowSingletonPlatform(WinterFlowManagerCloud winterFlowManagerCloud, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = Math.cos(d11);
        double sin = Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            WinterFlowSingletonPlatform(winterFlowManagerCloud, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = d16 * sqrt2;
        double d23 = sqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = Math.atan2(d13 - d9, d12 - d8);
        double atan22 = Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d11);
        double sin2 = Math.sin(d11);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d28 = -d10;
        double d29 = d28 * cos2;
        double d30 = d6 * sin2;
        double d31 = (d29 * sin3) - (d30 * cos3);
        double d32 = d28 * sin2;
        double d33 = d6 * cos2;
        double d34 = (cos3 * d33) + (sin3 * d32);
        double d35 = atan22 / ceil;
        double d36 = atan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < ceil) {
            double d40 = d36 + d35;
            double sin4 = Math.sin(d40);
            double cos4 = Math.cos(d40);
            int i2 = ceil;
            double d41 = (((d10 * cos2) * cos4) + d26) - (d30 * sin4);
            double d42 = (d33 * sin4) + (d10 * sin2 * cos4) + d27;
            double d43 = (d29 * sin4) - (d30 * cos4);
            double d44 = (cos4 * d33) + (sin4 * d32);
            double d45 = d40 - d36;
            double tan = Math.tan(d45 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d45)) / 3.0d;
            winterFlowManagerCloud.WinterFlowRouterStructure.cubicTo((float) ((d37 * sqrt3) + d), (float) ((d38 * sqrt3) + d39), (float) (d41 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            sin2 = sin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            ceil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final void WinterFlowSoftwareEngine(Object[] objArr, int i, int i2) {
        objArr.getClass();
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final Object WinterFlowSoftwareProtocol(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final float[] WinterFlowStrategyTool(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    public static final int WinterFlowSyntax(int[] iArr, int i, int i2) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final void WinterFlowSyntaxSubsystem(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final String WinterFlowTestingNode(Object[] objArr, int i, int i2, WinterFlowDeserializationDeployment winterFlowDeserializationDeployment) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == winterFlowDeserializationDeployment) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final float[] WinterFlowThreadListener(float[] fArr, float[] fArr2, float[] fArr3) {
        WinterFlowCacheManagerListener(fArr, fArr2);
        WinterFlowCacheManagerListener(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] WinterFlowEventEmitterController = WinterFlowEventEmitterController(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return WinterFlowStrategyTool(WinterFlowEventEmitterController, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    public static final Object WinterFlowTransactionAgent(WinterFlowLibraryDeployment winterFlowLibraryDeployment, WinterFlowObjectUI winterFlowObjectUI, WinterFlowNodeInheritance winterFlowNodeInheritance) {
        Object obj;
        WinterFlowUIMicroservice WinterFlowSoftwareEngine;
        Object WinterFlowConsumerUserManager;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        if (((WinterFlowUserManagerController) winterFlowLibraryDeployment).WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowUserManagerController winterFlowUserManagerController = (WinterFlowUserManagerController) winterFlowLibraryDeployment;
            if (!winterFlowUserManagerController.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
                WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
            }
            WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowUserManagerController.WinterFlowVariableVersionControl.WinterFlowSyntax;
            WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowLibraryDeployment);
            loop0: while (true) {
                obj = null;
                if (WinterFlowSyntaxSubsystem == null) {
                    break;
                }
                if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 524288) != 0) {
                    while (winterFlowUserManagerController2 != null) {
                        if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 524288) != 0) {
                            WinterFlowUserManagerController winterFlowUserManagerController3 = winterFlowUserManagerController2;
                            WinterFlowJSON winterFlowJSON = null;
                            while (winterFlowUserManagerController3 != null) {
                                if (winterFlowUserManagerController3 instanceof WinterFlowValidatorSyntax) {
                                    obj = winterFlowUserManagerController3;
                                    break loop0;
                                }
                                if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 524288) != 0 && (winterFlowUserManagerController3 instanceof WinterFlowTestingEntity)) {
                                    int i = 0;
                                    for (WinterFlowUserManagerController winterFlowUserManagerController4 = ((WinterFlowTestingEntity) winterFlowUserManagerController3).WinterFlowBatchUI; winterFlowUserManagerController4 != null; winterFlowUserManagerController4 = winterFlowUserManagerController4.WinterFlowResponseEngine) {
                                        if ((winterFlowUserManagerController4.WinterFlowUnitTestResponse & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                winterFlowUserManagerController3 = winterFlowUserManagerController4;
                                            } else {
                                                if (winterFlowJSON == null) {
                                                    winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                                }
                                                if (winterFlowUserManagerController3 != null) {
                                                    winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                                    winterFlowUserManagerController3 = null;
                                                }
                                                winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController4);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                winterFlowUserManagerController3 = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON);
                            }
                        }
                        winterFlowUserManagerController2 = winterFlowUserManagerController2.WinterFlowSyntax;
                    }
                }
                WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
                winterFlowUserManagerController2 = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
            }
            WinterFlowValidatorSyntax winterFlowValidatorSyntax = (WinterFlowValidatorSyntax) obj;
            if (winterFlowValidatorSyntax != null && (WinterFlowConsumerUserManager = winterFlowValidatorSyntax.WinterFlowConsumerUserManager((WinterFlowSoftwareEngine = WinterFlowCloudStack.WinterFlowSoftwareEngine(winterFlowLibraryDeployment)), new WinterFlowJavaSession(2, winterFlowObjectUI, WinterFlowSoftwareEngine), winterFlowNodeInheritance)) == WinterFlowListenerJava.WinterFlowVariableVersionControl) {
                return WinterFlowConsumerUserManager;
            }
        }
        return WinterFlowAlgorithmSession.WinterFlowRouterStructure;
    }

    public static WinterFlowTransactionManagerBackend WinterFlowTransactionManagerStrategy(WinterFlowTransactionManagerBackend winterFlowTransactionManagerBackend) {
        WinterFlowGatewayPlatform winterFlowGatewayPlatform = WinterFlowEncryptionSubsystem.WinterFlowRouterRouter;
        WinterFlowJSONDecorator winterFlowJSONDecorator = WinterFlowJSONDecorator.WinterFlowSyntax;
        if (WinterFlowSoftwareException.WinterFlowConfigurationSubsystem(winterFlowTransactionManagerBackend.WinterFlowHookDataSource, 12884901888L)) {
            WinterFlowBatchBatch winterFlowBatchBatch = (WinterFlowBatchBatch) winterFlowTransactionManagerBackend;
            WinterFlowGatewayPlatform winterFlowGatewayPlatform2 = winterFlowBatchBatch.WinterFlowArrayNetwork;
            if (!WinterFlowServiceUtility(winterFlowGatewayPlatform2, winterFlowGatewayPlatform)) {
                return new WinterFlowBatchBatch(winterFlowBatchBatch.WinterFlowRouterStructure, winterFlowBatchBatch.WinterFlowRouterRouter, winterFlowGatewayPlatform, WinterFlowStrategyTool(WinterFlowThreadListener((float[]) winterFlowJSONDecorator.WinterFlowTransactionManagerStrategy, winterFlowGatewayPlatform2.WinterFlowRouterStructure(), winterFlowGatewayPlatform.WinterFlowRouterStructure()), winterFlowBatchBatch.WinterFlowSyntax), winterFlowBatchBatch.WinterFlowTransactionAgent, winterFlowBatchBatch.WinterFlowServiceUtility, winterFlowBatchBatch.WinterFlowVariableVersionControl, winterFlowBatchBatch.WinterFlowTransactionManagerStrategy, winterFlowBatchBatch.WinterFlowUnitTestResponse, -1);
            }
        }
        return winterFlowTransactionManagerBackend;
    }

    public static WinterFlowInheritanceQuery WinterFlowUserManagerUserManager(MappedByteBuffer mappedByteBuffer) {
        long j;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    WinterFlowInheritanceQuery winterFlowInheritanceQuery = new WinterFlowInheritanceQuery();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    winterFlowInheritanceQuery.WinterFlowRouterRouter = duplicate;
                    winterFlowInheritanceQuery.WinterFlowVariableVersionControl = position;
                    int i6 = position - duplicate.getInt(position);
                    winterFlowInheritanceQuery.WinterFlowTransactionManagerStrategy = i6;
                    winterFlowInheritanceQuery.WinterFlowUnitTestResponse = ((ByteBuffer) winterFlowInheritanceQuery.WinterFlowRouterRouter).getShort(i6);
                    return winterFlowInheritanceQuery;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static boolean WinterFlowVariableBandwidth(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static float WinterFlowVariableVersionControl(EdgeEffect edgeEffect, float f, float f2, WinterFlowConcurrencyParser winterFlowConcurrencyParser) {
        float f3 = WinterFlowPackageDecorator.WinterFlowRouterStructure;
        double WinterFlowHookDataSource2 = winterFlowConcurrencyParser.WinterFlowHookDataSource() * 386.0878f * 160.0f * 0.84f;
        double d = WinterFlowPackageDecorator.WinterFlowRouterStructure * WinterFlowHookDataSource2;
        float exp = (float) (Math.exp((WinterFlowPackageDecorator.WinterFlowHookDataSource / WinterFlowPackageDecorator.WinterFlowCacheManagerAgent) * Math.log((Math.abs(f) * 0.35f) / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (exp > (i >= 31 ? WinterFlowProtocolDecorator.WinterFlowArrayNetwork(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int WinterFlowFrontendBackend = WinterFlowCloudStack.WinterFlowFrontendBackend(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(WinterFlowFrontendBackend);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(WinterFlowFrontendBackend);
        }
        return f;
    }

    public abstract void WinterFlowUnitTestResponse(float f, long j, WinterFlowProtocolPlatform winterFlowProtocolPlatform);
}
