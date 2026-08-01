package com.google.android.datatransport;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import com.icewinter.flow.winter.icecatch.R;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.DoubleUnaryOperator;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class WinterFlowTestingCloud {
    public static final WinterFlowJSONDecorator WinterFlowRouterRouter;
    public static int WinterFlowServerProtocol;
    public static final WinterFlowJSONDecorator WinterFlowSyntax;
    public static boolean WinterFlowTransactionAgent;
    public static final float[] WinterFlowRouterStructure = new float[91];
    public static final Object[] WinterFlowHookDataSource = new Object[0];
    public static final Class[] WinterFlowCacheManagerAgent = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final WinterFlowVariableEntity WinterFlowArrayNetwork = new WinterFlowVariableEntity(2);
    public static final Object WinterFlowVariableVersionControl = new Object();
    public static final StackTraceElement[] WinterFlowTransactionManagerStrategy = new StackTraceElement[0];
    public static final WinterFlowCacheManagerVersionControl WinterFlowUnitTestResponse = new WinterFlowCacheManagerVersionControl(1, new WinterFlowHandlerTool(16), new WinterFlowSessionJava(10));
    public static final Object WinterFlowResponseEngine = new Object();

    static {
        int i = 25;
        WinterFlowRouterRouter = new WinterFlowJSONDecorator(i, "NONE");
        WinterFlowSyntax = new WinterFlowJSONDecorator(i, "PENDING");
    }

    public static WinterFlowEncryptionMicroservice WinterFlowArrayHelper(WinterFlowStrategyPackage winterFlowStrategyPackage, WinterFlowEncryptionMicroservice winterFlowEncryptionMicroservice) {
        winterFlowEncryptionMicroservice.getClass();
        return winterFlowEncryptionMicroservice == WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl ? winterFlowStrategyPackage : (WinterFlowEncryptionMicroservice) winterFlowEncryptionMicroservice.WinterFlowServiceUtility(new WinterFlowHandlerTool(6), winterFlowStrategyPackage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.datatransport.WinterFlowObjectProcess, com.google.android.datatransport.WinterFlowPackageConsumer] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.datatransport.WinterFlowDatabaseSchemaHandler] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List WinterFlowArrayNetwork(WinterFlowServiceProviderListener winterFlowServiceProviderListener, Integer num, int i, Integer num2) {
        int i2;
        int WinterFlowSingletonPlatform;
        WinterFlowMicroserviceFunction winterFlowMicroserviceFunction;
        if (winterFlowServiceProviderListener.WinterFlowMapperProtocol || winterFlowServiceProviderListener.WinterFlowBandwidthObject() == 0) {
            return WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
        }
        ?? winterFlowObjectProcess = new WinterFlowObjectProcess(winterFlowServiceProviderListener);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = winterFlowServiceProviderListener.WinterFlowSerializerStructure;
            if (i2 < 0) {
                i2 = winterFlowServiceProviderListener.WinterFlowConfigurationSubsystem(winterFlowServiceProviderListener.WinterFlowHookDataSource, i);
            }
        }
        if (num == 0) {
            int WinterFlowCompilerHandler = winterFlowServiceProviderListener.WinterFlowSyntax - winterFlowServiceProviderListener.WinterFlowCompilerHandler(winterFlowServiceProviderListener.WinterFlowHookDataSource, winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i));
            WinterFlowViewSoftware winterFlowViewSoftware = winterFlowServiceProviderListener.WinterFlowVariableBandwidth;
            num = Integer.valueOf(WinterFlowCompilerHandler + ((winterFlowViewSoftware == null || (winterFlowMicroserviceFunction = (WinterFlowMicroserviceFunction) winterFlowViewSoftware.WinterFlowHookDataSource(i)) == null) ? 0 : winterFlowMicroserviceFunction.WinterFlowHookDataSource));
        }
        int WinterFlowConcurrencyThread = winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i) * 5;
        int[] iArr = winterFlowServiceProviderListener.WinterFlowHookDataSource;
        if (WinterFlowConcurrencyThread < iArr.length) {
            WinterFlowSingletonPlatform = winterFlowServiceProviderListener.WinterFlowSingletonPlatform(i);
        } else {
            int WinterFlowConfigurationSubsystem = i2 >= 0 ? winterFlowServiceProviderListener.WinterFlowConfigurationSubsystem(iArr, i2) : i2;
            WinterFlowSingletonPlatform = winterFlowServiceProviderListener.WinterFlowSingletonPlatform(i2);
            int i3 = i2;
            i2 = WinterFlowConfigurationSubsystem;
            i = i3;
        }
        while (i >= 0) {
            winterFlowObjectProcess.WinterFlowThreadListener(WinterFlowSingletonPlatform, (winterFlowServiceProviderListener.WinterFlowHookDataSource[(winterFlowServiceProviderListener.WinterFlowConcurrencyThread(i) * 5) + 1] & 536870912) != 0 ? winterFlowServiceProviderListener.WinterFlowVariableBandwidth(i) : WinterFlowModuleModule.WinterFlowRouterStructure, winterFlowServiceProviderListener.WinterFlowFrontendBackend(i), num);
            num = winterFlowServiceProviderListener.WinterFlowHookDataSource(i);
            if (i2 >= 0) {
                int WinterFlowConfigurationSubsystem2 = winterFlowServiceProviderListener.WinterFlowConfigurationSubsystem(winterFlowServiceProviderListener.WinterFlowHookDataSource, i2);
                WinterFlowSingletonPlatform = winterFlowServiceProviderListener.WinterFlowSingletonPlatform(i2);
                int i4 = i2;
                i2 = WinterFlowConfigurationSubsystem2;
                i = i4;
            } else {
                i = i2;
            }
        }
        return (ArrayList) winterFlowObjectProcess.WinterFlowRouterStructure;
    }

    public static final boolean WinterFlowBackendCacheManager(WinterFlowProcessorSystem winterFlowProcessorSystem, Resources resources) {
        Object WinterFlowUnitTestResponse2 = winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowRouterStructure);
        if (WinterFlowUnitTestResponse2 == null) {
            WinterFlowUnitTestResponse2 = null;
        }
        List list = (List) WinterFlowUnitTestResponse2;
        return !WinterFlowEncryptionSubsystem.WinterFlowPackageIDE(winterFlowProcessorSystem) && (winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowUnitTestResponse || (winterFlowProcessorSystem.WinterFlowOrchestrationSubsystem() && ((list != null ? (String) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(list) : null) != null || WinterFlowResolverController(winterFlowProcessorSystem) != null || WinterFlowMapperProtocol(winterFlowProcessorSystem, resources) != null || WinterFlowSerializerStructure(winterFlowProcessorSystem))));
    }

    public static final int WinterFlowBandwidthObject(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            WinterFlowNodeInterface winterFlowNodeInterface = (WinterFlowNodeInterface) list.get(i3);
            char c = winterFlowNodeInterface.WinterFlowArrayNetwork > i ? (char) 1 : winterFlowNodeInterface.WinterFlowVariableVersionControl <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static WinterFlowStrategyPackage WinterFlowBatchUI(WinterFlowStrategyPackage winterFlowStrategyPackage, WinterFlowRendererProvider winterFlowRendererProvider) {
        winterFlowRendererProvider.getClass();
        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowStrategyPackage.getKey(), winterFlowRendererProvider)) {
            return winterFlowStrategyPackage;
        }
        return null;
    }

    public static final WinterFlowHandlerPlatform WinterFlowCacheManagerAgent(Object obj) {
        if (obj == null) {
            obj = WinterFlowEncryptionSubsystem.WinterFlowServerProtocol;
        }
        return new WinterFlowHandlerPlatform(obj);
    }

    public static final View WinterFlowCacheManagerListener(WinterFlowLibraryDeployment winterFlowLibraryDeployment) {
        if (!((WinterFlowUserManagerController) winterFlowLibraryDeployment).WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) WinterFlowLibraryDecorator.WinterFlowRouterStructure(WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowLibraryDeployment));
    }

    public static final void WinterFlowCompilerHandler(String str, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WinterFlowCompilerVariable(ViewStructure viewStructure, WinterFlowSchedulerStructure winterFlowSchedulerStructure, AutofillId autofillId, String str, WinterFlowInterfaceManager winterFlowInterfaceManager) {
        int i;
        long j;
        long j2;
        char c;
        long j3;
        boolean z;
        WinterFlowFrameworkCacheManager winterFlowFrameworkCacheManager;
        WinterFlowCompilerStructure winterFlowCompilerStructure;
        WinterFlowScriptFramework winterFlowScriptFramework;
        WinterFlowManagerNode winterFlowManagerNode;
        boolean z2;
        WinterFlowCacheManagerService winterFlowCacheManagerService;
        Boolean bool;
        WinterFlowQueueTransaction winterFlowQueueTransaction;
        boolean z3;
        Integer num;
        int i2;
        List list;
        Integer valueOf;
        boolean z4;
        String[] WinterFlowResolverController;
        String[] WinterFlowResolverController2;
        String[] WinterFlowResolverController3;
        long[] jArr;
        Object[] objArr;
        int i3;
        long[] jArr2;
        Object[] objArr2;
        WinterFlowFrameworkCacheManager winterFlowFrameworkCacheManager2;
        WinterFlowCompilerStructure winterFlowCompilerStructure2;
        WinterFlowScriptFramework winterFlowScriptFramework2;
        WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowRouterStructure;
        WinterFlowRendererOrchestration winterFlowRendererOrchestration2 = WinterFlowCacheWorker.WinterFlowRouterStructure;
        WinterFlowDecoratorBackend WinterFlowSerializerStructure = winterFlowSchedulerStructure.WinterFlowSerializerStructure();
        int i4 = 8;
        if (WinterFlowSerializerStructure != null) {
            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = WinterFlowSerializerStructure.WinterFlowVariableVersionControl;
            Object[] objArr3 = winterFlowDatabaseSchemaStructure.WinterFlowHookDataSource;
            j = 128;
            Object[] objArr4 = winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent;
            long[] jArr3 = winterFlowDatabaseSchemaStructure.WinterFlowRouterStructure;
            int length = jArr3.length - 2;
            i = 2;
            if (length >= 0) {
                z = true;
                int i5 = 0;
                winterFlowManagerNode = null;
                j2 = 255;
                z2 = false;
                winterFlowFrameworkCacheManager2 = null;
                winterFlowCompilerStructure2 = null;
                winterFlowScriptFramework2 = null;
                winterFlowCacheManagerService = null;
                bool = null;
                winterFlowQueueTransaction = null;
                z3 = false;
                num = null;
                c = 7;
                while (true) {
                    long j4 = jArr3[i5];
                    j3 = -9187201950435737472L;
                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i6 = 8 - ((~(i5 - length)) >>> 31);
                        for (int i7 = 0; i7 < i6; i7++) {
                            if ((j4 & 255) < 128) {
                                int i8 = (i5 << 3) + i7;
                                Object obj = objArr3[i8];
                                Object obj2 = objArr4[i8];
                                WinterFlowRendererOrchestration winterFlowRendererOrchestration3 = (WinterFlowRendererOrchestration) obj;
                                if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowVariableBandwidth)) {
                                    obj2.getClass();
                                    winterFlowManagerNode = (WinterFlowManagerNode) obj2;
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowRouterStructure)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) WinterFlowSerializerUtility.WinterFlowPipelineSoftware((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowSingletonPlatform)) {
                                    obj2.getClass();
                                    winterFlowCacheManagerService = (WinterFlowCacheManagerService) obj2;
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowBatchUI)) {
                                    obj2.getClass();
                                    winterFlowScriptFramework2 = (WinterFlowScriptFramework) obj2;
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowCacheManagerListener)) {
                                    obj2.getClass();
                                    winterFlowCompilerStructure2 = (WinterFlowCompilerStructure) obj2;
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowServerProtocol)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowFrontendBackend)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowSoftwareEngine)) {
                                    z3 = true;
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowBandwidthObject)) {
                                    obj2.getClass();
                                    z = ((Boolean) obj2).booleanValue();
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowConsumerUserManager)) {
                                    obj2.getClass();
                                    winterFlowQueueTransaction = (WinterFlowQueueTransaction) obj2;
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowSoftwareProtocol)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowRendererJava.WinterFlowUserManagerUserManager)) {
                                    obj2.getClass();
                                    winterFlowFrameworkCacheManager2 = (WinterFlowFrameworkCacheManager) obj2;
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowCacheWorker.WinterFlowHookDataSource)) {
                                    viewStructure.setClickable(true);
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowCacheWorker.WinterFlowCacheManagerAgent)) {
                                    viewStructure.setLongClickable(true);
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowCacheWorker.WinterFlowSerializerStructure)) {
                                    viewStructure.setFocusable(true);
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration3, WinterFlowCacheWorker.WinterFlowTransactionAgent)) {
                                    z2 = true;
                                }
                            }
                            j4 >>= 8;
                        }
                        if (i6 != 8) {
                            break;
                        }
                    }
                    if (i5 == length) {
                        break;
                    } else {
                        i5++;
                    }
                }
            } else {
                j2 = 255;
                c = 7;
                j3 = -9187201950435737472L;
                z = true;
                winterFlowManagerNode = null;
                z2 = false;
                winterFlowFrameworkCacheManager2 = null;
                winterFlowCompilerStructure2 = null;
                winterFlowScriptFramework2 = null;
                winterFlowCacheManagerService = null;
                bool = null;
                winterFlowQueueTransaction = null;
                z3 = false;
                num = null;
            }
            winterFlowFrameworkCacheManager = winterFlowFrameworkCacheManager2;
            winterFlowCompilerStructure = winterFlowCompilerStructure2;
            winterFlowScriptFramework = winterFlowScriptFramework2;
        } else {
            i = 2;
            j = 128;
            j2 = 255;
            c = 7;
            j3 = -9187201950435737472L;
            z = true;
            winterFlowFrameworkCacheManager = null;
            winterFlowCompilerStructure = null;
            winterFlowScriptFramework = null;
            winterFlowManagerNode = null;
            z2 = false;
            winterFlowCacheManagerService = null;
            bool = null;
            winterFlowQueueTransaction = null;
            z3 = false;
            num = null;
        }
        WinterFlowDecoratorBackend WinterFlowSerializerStructure2 = winterFlowSchedulerStructure.WinterFlowSerializerStructure();
        if (WinterFlowSerializerStructure2 != null && WinterFlowSerializerStructure2.WinterFlowUnitTestResponse && !WinterFlowSerializerStructure2.WinterFlowRouterRouter) {
            WinterFlowSerializerStructure2 = WinterFlowSerializerStructure2.WinterFlowCacheManagerAgent();
            WinterFlowMicroserviceFunction winterFlowMicroserviceFunction = new WinterFlowMicroserviceFunction(((WinterFlowDecoratorLayer) winterFlowSchedulerStructure.WinterFlowThreadListener()).WinterFlowVariableVersionControl.WinterFlowUnitTestResponse);
            winterFlowMicroserviceFunction.WinterFlowCacheManagerAgent(winterFlowSchedulerStructure.WinterFlowThreadListener());
            while (winterFlowMicroserviceFunction.WinterFlowSyntax()) {
                WinterFlowSchedulerStructure winterFlowSchedulerStructure2 = (WinterFlowSchedulerStructure) winterFlowMicroserviceFunction.WinterFlowTransactionAgent(winterFlowMicroserviceFunction.WinterFlowHookDataSource - 1);
                WinterFlowDecoratorBackend WinterFlowSerializerStructure3 = winterFlowSchedulerStructure2.WinterFlowSerializerStructure();
                if (WinterFlowSerializerStructure3 != null && !WinterFlowSerializerStructure3.WinterFlowUnitTestResponse) {
                    WinterFlowSerializerStructure2.WinterFlowVariableVersionControl(WinterFlowSerializerStructure3);
                    if (!WinterFlowSerializerStructure3.WinterFlowRouterRouter) {
                        winterFlowMicroserviceFunction.WinterFlowCacheManagerAgent(winterFlowSchedulerStructure2.WinterFlowThreadListener());
                    }
                }
            }
        }
        if (WinterFlowSerializerStructure2 != null) {
            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2 = WinterFlowSerializerStructure2.WinterFlowVariableVersionControl;
            Object[] objArr5 = winterFlowDatabaseSchemaStructure2.WinterFlowHookDataSource;
            Object[] objArr6 = winterFlowDatabaseSchemaStructure2.WinterFlowCacheManagerAgent;
            long[] jArr4 = winterFlowDatabaseSchemaStructure2.WinterFlowRouterStructure;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i9 = 1;
                int i10 = 0;
                list = null;
                while (true) {
                    long j5 = jArr4[i10];
                    int i11 = i4;
                    List list2 = list;
                    if ((((~j5) << c) & j5 & j3) != j3) {
                        int i12 = 8 - ((~(i10 - length2)) >>> 31);
                        i2 = i9;
                        list = list2;
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j5 & j2) < j) {
                                int i14 = (i10 << 3) + i13;
                                Object obj3 = objArr5[i14];
                                Object obj4 = objArr6[i14];
                                jArr2 = jArr4;
                                WinterFlowRendererOrchestration winterFlowRendererOrchestration4 = (WinterFlowRendererOrchestration) obj3;
                                objArr2 = objArr5;
                                if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration4, WinterFlowRendererJava.WinterFlowResponseEngine)) {
                                    viewStructure.setEnabled(false);
                                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowRendererOrchestration4, WinterFlowRendererJava.WinterFlowArrayHelper)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j5 >>= i11;
                            i13++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i3 = i11;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i2 = i9;
                        i3 = i11;
                        list = list2;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i4 = i3;
                    i9 = i2;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
                Integer valueOf2 = Integer.valueOf(winterFlowSchedulerStructure.WinterFlowTransactionManagerStrategy);
                if (winterFlowSchedulerStructure.WinterFlowVariableBandwidth() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                viewStructure.setAutofillId(autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = winterFlowManagerNode == null ? Integer.valueOf(winterFlowManagerNode.WinterFlowRouterStructure) : z2 ? Integer.valueOf(i2) : winterFlowFrameworkCacheManager != null ? Integer.valueOf(i) : null;
                if (valueOf != null) {
                    viewStructure.setAutofillType(valueOf.intValue());
                }
                if (winterFlowCompilerStructure != null) {
                    String str2 = winterFlowCompilerStructure.WinterFlowTransactionManagerStrategy;
                    if (str2.length() >= 5000) {
                        str2 = (Character.isHighSurrogate(str2.charAt(4999)) && Character.isLowSurrogate(str2.charAt(5000))) ? WinterFlowFrameworkStrategy.WinterFlowCacheManagerListener(str2, 4999) : WinterFlowFrameworkStrategy.WinterFlowCacheManagerListener(str2, 5000);
                    }
                    viewStructure.setAutofillValue(AutofillValue.forText(str2));
                }
                if (winterFlowScriptFramework != null) {
                    viewStructure.setAutofillValue(winterFlowScriptFramework.WinterFlowRouterStructure);
                }
                if (winterFlowCacheManagerService != null && (WinterFlowResolverController3 = WinterFlowManagerRequest.WinterFlowResolverController(winterFlowCacheManagerService)) != null) {
                    viewStructure.setAutofillHints(WinterFlowResolverController3);
                }
                winterFlowInterfaceManager.WinterFlowHookDataSource.WinterFlowUnitTestResponse(winterFlowSchedulerStructure.WinterFlowTransactionManagerStrategy, new WinterFlowProviderSubsystem(viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (winterFlowFrameworkCacheManager == null) {
                    boolean z5 = i2;
                    viewStructure.setCheckable(z5);
                    viewStructure.setChecked(winterFlowFrameworkCacheManager == WinterFlowFrameworkCacheManager.WinterFlowVariableVersionControl ? z5 ? 1 : 0 : false);
                    z4 = z5;
                } else {
                    boolean z6 = i2;
                    z4 = z6;
                    if (bool != null) {
                        viewStructure.setCheckable(z6);
                        viewStructure.setChecked(bool.booleanValue());
                        z4 = z6;
                    }
                }
                WinterFlowCacheManagerService.WinterFlowRouterStructure.getClass();
                WinterFlowResolverController = WinterFlowManagerRequest.WinterFlowResolverController(WinterFlowSoftwareSerializer.WinterFlowHookDataSource);
                WinterFlowResolverController.getClass();
                if (WinterFlowResolverController.length != 0) {
                    WinterFlowCompilerMechanism.WinterFlowSyntax("Array is empty.");
                    return;
                }
                boolean z7 = (z3 || ((winterFlowCacheManagerService == null || (WinterFlowResolverController2 = WinterFlowManagerRequest.WinterFlowResolverController(winterFlowCacheManagerService)) == null || WinterFlowProtocolPipeline.WinterFlowFrameworkTransaction(WinterFlowResolverController2, WinterFlowResolverController[0]) < 0) ? false : z4)) ? z4 : false;
                viewStructure.setDataIsSensitive((z7 || z) ? z4 : false);
                viewStructure.setVisibility(winterFlowSchedulerStructure.WinterFlowUserManagerUserManager.WinterFlowArrayNetwork.WinterFlowSyntaxSingleton() ? 4 : 0);
                if (list != null) {
                    int size = list.size();
                    String str3 = "";
                    for (int i15 = 0; i15 < size; i15++) {
                        str3 = str3 + ((WinterFlowCompilerStructure) list.get(i15)).WinterFlowTransactionManagerStrategy + '\n';
                    }
                    viewStructure.setText(str3);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (((WinterFlowDecoratorLayer) winterFlowSchedulerStructure.WinterFlowThreadListener()).isEmpty() && winterFlowQueueTransaction != null) {
                    viewStructure.setClassName("android.widget.ImageView");
                }
                if (z2) {
                    viewStructure.setClassName("android.widget.EditText");
                    if (Build.VERSION.SDK_INT >= 28 && num != null) {
                        viewStructure.setMaxTextLength(num.intValue());
                    }
                    if (z7) {
                        viewStructure.setInputType(129);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        i2 = 1;
        list = null;
        Integer valueOf22 = Integer.valueOf(winterFlowSchedulerStructure.WinterFlowTransactionManagerStrategy);
        if (winterFlowSchedulerStructure.WinterFlowVariableBandwidth() == null) {
        }
        if (valueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (winterFlowManagerNode == null) {
        }
        if (valueOf != null) {
        }
        if (winterFlowCompilerStructure != null) {
        }
        if (winterFlowScriptFramework != null) {
        }
        if (winterFlowCacheManagerService != null) {
            viewStructure.setAutofillHints(WinterFlowResolverController3);
        }
        winterFlowInterfaceManager.WinterFlowHookDataSource.WinterFlowUnitTestResponse(winterFlowSchedulerStructure.WinterFlowTransactionManagerStrategy, new WinterFlowProviderSubsystem(viewStructure));
        if (bool != null) {
        }
        if (winterFlowFrameworkCacheManager == null) {
        }
        WinterFlowCacheManagerService.WinterFlowRouterStructure.getClass();
        WinterFlowResolverController = WinterFlowManagerRequest.WinterFlowResolverController(WinterFlowSoftwareSerializer.WinterFlowHookDataSource);
        WinterFlowResolverController.getClass();
        if (WinterFlowResolverController.length != 0) {
        }
    }

    public static final WinterFlowUnitTestRouter WinterFlowConcurrencyThread(Executor executor) {
        return new WinterFlowEventEmitterHandler(executor);
    }

    public static final void WinterFlowConfigurationSubsystem(WinterFlowServiceProviderListener winterFlowServiceProviderListener, int i, Object obj) {
        int WinterFlowUnitTestResponse2 = winterFlowServiceProviderListener.WinterFlowUnitTestResponse(i);
        Object[] objArr = winterFlowServiceProviderListener.WinterFlowCacheManagerAgent;
        Object obj2 = objArr[WinterFlowUnitTestResponse2];
        objArr[WinterFlowUnitTestResponse2] = WinterFlowModuleModule.WinterFlowRouterStructure;
        if (obj == obj2) {
            return;
        }
        WinterFlowSessionManagerEntity.WinterFlowRouterStructure("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final boolean WinterFlowConsumerUserManager(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[9];
        float f11 = fArr[10];
        float f12 = fArr[11];
        float f13 = fArr[12];
        float f14 = fArr[13];
        float f15 = fArr[14];
        float f16 = fArr[15];
        float f17 = (f * f6) - (f2 * f5);
        float f18 = (f * f7) - (f3 * f5);
        float f19 = (f * f8) - (f4 * f5);
        float f20 = (f2 * f7) - (f3 * f6);
        float f21 = (f2 * f8) - (f4 * f6);
        float f22 = (f3 * f8) - (f4 * f7);
        float f23 = (f9 * f14) - (f10 * f13);
        float f24 = (f9 * f15) - (f11 * f13);
        float f25 = (f9 * f16) - (f12 * f13);
        float f26 = (f10 * f15) - (f11 * f14);
        float f27 = (f10 * f16) - (f12 * f14);
        float f28 = (f11 * f16) - (f12 * f15);
        float f29 = (f22 * f23) + (((f20 * f25) + ((f19 * f26) + ((f17 * f28) - (f18 * f27)))) - (f21 * f24));
        if (f29 != 0.0f) {
            float f30 = 1.0f / f29;
            fArr2[0] = ((f8 * f26) + ((f6 * f28) - (f7 * f27))) * f30;
            fArr2[1] = (((f3 * f27) + ((-f2) * f28)) - (f4 * f26)) * f30;
            fArr2[2] = ((f16 * f20) + ((f14 * f22) - (f15 * f21))) * f30;
            fArr2[3] = (((f11 * f21) + ((-f10) * f22)) - (f12 * f20)) * f30;
            float f31 = -f5;
            fArr2[4] = (((f7 * f25) + (f31 * f28)) - (f8 * f24)) * f30;
            fArr2[5] = ((f4 * f24) + ((f28 * f) - (f3 * f25))) * f30;
            float f32 = -f13;
            fArr2[6] = (((f15 * f19) + (f32 * f22)) - (f16 * f18)) * f30;
            fArr2[7] = ((f12 * f18) + ((f22 * f9) - (f11 * f19))) * f30;
            fArr2[8] = ((f8 * f23) + ((f5 * f27) - (f6 * f25))) * f30;
            fArr2[9] = (((f25 * f2) + ((-f) * f27)) - (f4 * f23)) * f30;
            fArr2[10] = ((f16 * f17) + ((f13 * f21) - (f14 * f19))) * f30;
            fArr2[11] = (((f19 * f10) + ((-f9) * f21)) - (f12 * f17)) * f30;
            fArr2[12] = (((f6 * f24) + (f31 * f26)) - (f7 * f23)) * f30;
            fArr2[13] = ((f3 * f23) + ((f * f26) - (f2 * f24))) * f30;
            fArr2[14] = (((f14 * f18) + (f32 * f20)) - (f15 * f17)) * f30;
            fArr2[15] = ((f11 * f17) + ((f9 * f20) - (f10 * f18))) * f30;
        }
        return !(f29 == 0.0f);
    }

    public static WinterFlowEncryptionMicroservice WinterFlowEventEmitterController(WinterFlowStrategyPackage winterFlowStrategyPackage, WinterFlowRendererProvider winterFlowRendererProvider) {
        winterFlowRendererProvider.getClass();
        return WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowStrategyPackage.getKey(), winterFlowRendererProvider) ? WinterFlowEventEmitterPackage.WinterFlowVariableVersionControl : winterFlowStrategyPackage;
    }

    public static final void WinterFlowHookDataSource(WinterFlowEventTool winterFlowEventTool, WinterFlowResolverLibrary winterFlowResolverLibrary, int i) {
        winterFlowResolverLibrary.WinterFlowFrameworkTransaction(-709502251);
        int i2 = 1;
        if (winterFlowResolverLibrary.WinterFlowFrontendBackend(i & 1, (i & 3) != 2)) {
            WinterFlowPipelineHelper winterFlowPipelineHelper = WinterFlowModuleEngine.WinterFlowRouterStructure;
            WinterFlowEncryptionComponent winterFlowEncryptionComponent = (WinterFlowEncryptionComponent) winterFlowResolverLibrary.WinterFlowSyntax(winterFlowPipelineHelper);
            WinterFlowDecoratorPlatform WinterFlowSyntax2 = WinterFlowPackageProcess.WinterFlowSyntax(winterFlowResolverLibrary);
            Object[] objArr = {winterFlowEncryptionComponent};
            WinterFlowCacheManagerVersionControl winterFlowCacheManagerVersionControl = new WinterFlowCacheManagerVersionControl(i2, new WinterFlowHandlerTool(12), new WinterFlowRouterCompiler(16, winterFlowEncryptionComponent, WinterFlowSyntax2));
            boolean WinterFlowUnitTestResponse2 = winterFlowResolverLibrary.WinterFlowUnitTestResponse(winterFlowEncryptionComponent) | winterFlowResolverLibrary.WinterFlowUnitTestResponse(WinterFlowSyntax2);
            Object WinterFlowSyntaxSubsystem = winterFlowResolverLibrary.WinterFlowSyntaxSubsystem();
            if (WinterFlowUnitTestResponse2 || WinterFlowSyntaxSubsystem == WinterFlowModuleModule.WinterFlowRouterStructure) {
                WinterFlowSyntaxSubsystem = new WinterFlowRepositoryLayer(5, winterFlowEncryptionComponent, WinterFlowSyntax2);
                winterFlowResolverLibrary.WinterFlowArrayFramework(WinterFlowSyntaxSubsystem);
            }
            WinterFlowObjectUserManager winterFlowObjectUserManager = (WinterFlowObjectUserManager) WinterFlowWorkerVersionControl.WinterFlowThreadListener(objArr, winterFlowCacheManagerVersionControl, (WinterFlowObjectUI) WinterFlowSyntaxSubsystem, winterFlowResolverLibrary, 0);
            WinterFlowHandlerWebsocket.WinterFlowHookDataSource(winterFlowPipelineHelper.WinterFlowRouterStructure(winterFlowObjectUserManager), WinterFlowManagerRequest.WinterFlowSyntaxSubsystem(-412824043, new WinterFlowAPIVersionControl(winterFlowEventTool, winterFlowObjectUserManager, 7), winterFlowResolverLibrary), winterFlowResolverLibrary, 56);
        } else {
            winterFlowResolverLibrary.WinterFlowQueueService();
        }
        WinterFlowStackEngine WinterFlowConcurrencyThread = winterFlowResolverLibrary.WinterFlowConcurrencyThread();
        if (WinterFlowConcurrencyThread != null) {
            WinterFlowConcurrencyThread.WinterFlowArrayNetwork = new WinterFlowSessionManagerSystem(i, 3, winterFlowEventTool);
        }
    }

    public static final String WinterFlowMapperProtocol(WinterFlowProcessorSystem winterFlowProcessorSystem, Resources resources) {
        int ordinal;
        WinterFlowDecoratorBackend winterFlowDecoratorBackend = winterFlowProcessorSystem.WinterFlowArrayNetwork;
        WinterFlowDecoratorBackend winterFlowDecoratorBackend2 = winterFlowProcessorSystem.WinterFlowArrayNetwork;
        Object WinterFlowUnitTestResponse2 = winterFlowDecoratorBackend.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowHookDataSource);
        String str = null;
        if (WinterFlowUnitTestResponse2 == null) {
            WinterFlowUnitTestResponse2 = null;
        }
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowDecoratorBackend2.WinterFlowVariableVersionControl;
        Object WinterFlowUnitTestResponse3 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowUserManagerUserManager);
        if (WinterFlowUnitTestResponse3 == null) {
            WinterFlowUnitTestResponse3 = null;
        }
        WinterFlowFrameworkCacheManager winterFlowFrameworkCacheManager = (WinterFlowFrameworkCacheManager) WinterFlowUnitTestResponse3;
        Object WinterFlowUnitTestResponse4 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowConsumerUserManager);
        if (WinterFlowUnitTestResponse4 == null) {
            WinterFlowUnitTestResponse4 = null;
        }
        if (winterFlowFrameworkCacheManager != null && (ordinal = winterFlowFrameworkCacheManager.ordinal()) != 0 && ordinal != 1) {
            if (ordinal != 2) {
                WinterFlowEventEmitterOrchestration.WinterFlowRouterStructure();
                return null;
            }
            if (WinterFlowUnitTestResponse2 == null) {
                WinterFlowUnitTestResponse2 = resources.getString(R.string.indeterminate);
            }
        }
        Object WinterFlowUnitTestResponse5 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowSoftwareProtocol);
        if (WinterFlowUnitTestResponse5 == null) {
            WinterFlowUnitTestResponse5 = null;
        }
        Boolean bool = (Boolean) WinterFlowUnitTestResponse5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (WinterFlowUnitTestResponse2 == null) {
                WinterFlowUnitTestResponse2 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object WinterFlowUnitTestResponse6 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowCacheManagerAgent);
        if (WinterFlowUnitTestResponse6 == null) {
            WinterFlowUnitTestResponse6 = null;
        }
        WinterFlowRendererGateway winterFlowRendererGateway = (WinterFlowRendererGateway) WinterFlowUnitTestResponse6;
        if (winterFlowRendererGateway != null) {
            if (winterFlowRendererGateway != WinterFlowRendererGateway.WinterFlowCacheManagerAgent) {
                if (WinterFlowUnitTestResponse2 == null) {
                    WinterFlowArrayStructure winterFlowArrayStructure = winterFlowRendererGateway.WinterFlowHookDataSource;
                    float f = winterFlowArrayStructure.WinterFlowHookDataSource;
                    float f2 = winterFlowArrayStructure.WinterFlowRouterStructure;
                    float f3 = f - f2 == 0.0f ? 0.0f : (winterFlowRendererGateway.WinterFlowRouterStructure - f2) / (f - f2);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    WinterFlowUnitTestResponse2 = resources.getString(R.string.template_percent, Integer.valueOf(f3 == 0.0f ? 0 : f3 == 1.0f ? 100 : WinterFlowDecoratorUI.WinterFlowSyntax(Math.round(f3 * 100.0f), 1, 99)));
                }
            } else if (WinterFlowUnitTestResponse2 == null) {
                WinterFlowUnitTestResponse2 = resources.getString(R.string.in_progress);
            }
        }
        WinterFlowRendererOrchestration winterFlowRendererOrchestration = WinterFlowRendererJava.WinterFlowCacheManagerListener;
        if (winterFlowDatabaseSchemaStructure.WinterFlowCacheManagerAgent(winterFlowRendererOrchestration)) {
            WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure2 = new WinterFlowProcessorSystem(winterFlowProcessorSystem.WinterFlowRouterStructure, true, winterFlowProcessorSystem.WinterFlowCacheManagerAgent, winterFlowDecoratorBackend2).WinterFlowTransactionAgent().WinterFlowVariableVersionControl;
            Object WinterFlowUnitTestResponse7 = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowRouterStructure);
            if (WinterFlowUnitTestResponse7 == null) {
                WinterFlowUnitTestResponse7 = null;
            }
            Collection collection = (Collection) WinterFlowUnitTestResponse7;
            if (collection == null || collection.isEmpty()) {
                Object WinterFlowUnitTestResponse8 = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowArrayHelper);
                if (WinterFlowUnitTestResponse8 == null) {
                    WinterFlowUnitTestResponse8 = null;
                }
                Collection collection2 = (Collection) WinterFlowUnitTestResponse8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object WinterFlowUnitTestResponse9 = winterFlowDatabaseSchemaStructure2.WinterFlowUnitTestResponse(winterFlowRendererOrchestration);
                    if (WinterFlowUnitTestResponse9 == null) {
                        WinterFlowUnitTestResponse9 = null;
                    }
                    CharSequence charSequence = (CharSequence) WinterFlowUnitTestResponse9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            WinterFlowUnitTestResponse2 = str;
        }
        return (String) WinterFlowUnitTestResponse2;
    }

    public static final Integer WinterFlowOrchestrationSubsystem(WinterFlowCloudModule winterFlowCloudModule, WinterFlowExceptionScheduler winterFlowExceptionScheduler, int i, int i2) {
        Integer WinterFlowOrchestrationSubsystem;
        int[] iArr = winterFlowCloudModule.WinterFlowHookDataSource;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (winterFlowCloudModule.WinterFlowResponseEngine(i) && winterFlowCloudModule.WinterFlowSyntax(i) == 206 && WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowCloudModule.WinterFlowOrchestrationSubsystem(iArr, i), WinterFlowSessionManagerEntity.WinterFlowVariableVersionControl)) {
                Object WinterFlowRouterRouter2 = winterFlowCloudModule.WinterFlowRouterRouter(i, 0);
                WinterFlowFrontendHandler winterFlowFrontendHandler = WinterFlowRouterRouter2 instanceof WinterFlowFrontendHandler ? (WinterFlowFrontendHandler) WinterFlowRouterRouter2 : null;
                Object obj = winterFlowFrontendHandler != null ? winterFlowFrontendHandler.WinterFlowRouterStructure : null;
                WinterFlowSoftwareView winterFlowSoftwareView = obj instanceof WinterFlowSoftwareView ? (WinterFlowSoftwareView) obj : null;
                if (winterFlowSoftwareView != null && winterFlowSoftwareView.WinterFlowVariableVersionControl == winterFlowExceptionScheduler) {
                    return Integer.valueOf(i);
                }
            }
            if (winterFlowCloudModule.WinterFlowArrayNetwork(i) && (WinterFlowOrchestrationSubsystem = WinterFlowOrchestrationSubsystem(winterFlowCloudModule, winterFlowExceptionScheduler, i + 1, i3)) != null) {
                return Integer.valueOf(WinterFlowOrchestrationSubsystem.intValue());
            }
            i = i3;
        }
    }

    public static final Object WinterFlowPackageIDE(WinterFlowDeploymentWidget winterFlowDeploymentWidget, int i, WinterFlowObjectSession winterFlowObjectSession) {
        int i2;
        int i3;
        Object obj;
        WinterFlowUserManagerController winterFlowUserManagerController;
        WinterFlowNodeSingleton WinterFlowWidgetProcess;
        int size;
        int i4;
        WinterFlowExceptionStrategy winterFlowExceptionStrategy;
        if (!winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSingletonPlatform) {
            WinterFlowViewUtility.WinterFlowHookDataSource("visitAncestors called on an unattached node");
        }
        WinterFlowUserManagerController winterFlowUserManagerController2 = winterFlowDeploymentWidget.WinterFlowVariableVersionControl.WinterFlowSyntax;
        WinterFlowSchedulerStructure WinterFlowSyntaxSubsystem = WinterFlowCloudStack.WinterFlowSyntaxSubsystem(winterFlowDeploymentWidget);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            obj = null;
            if (WinterFlowSyntaxSubsystem == null) {
                winterFlowUserManagerController = null;
                break;
            }
            if ((WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager.WinterFlowTransactionManagerStrategy.WinterFlowRouterRouter & 1024) != 0) {
                while (winterFlowUserManagerController2 != null) {
                    if ((winterFlowUserManagerController2.WinterFlowUnitTestResponse & 1024) != 0) {
                        winterFlowUserManagerController = winterFlowUserManagerController2;
                        WinterFlowJSON winterFlowJSON = null;
                        while (winterFlowUserManagerController != null) {
                            if (winterFlowUserManagerController instanceof WinterFlowDeploymentWidget) {
                                break loop0;
                            }
                            if ((winterFlowUserManagerController.WinterFlowUnitTestResponse & 1024) != 0 && (winterFlowUserManagerController instanceof WinterFlowTestingEntity)) {
                                int i5 = 0;
                                for (WinterFlowUserManagerController winterFlowUserManagerController3 = ((WinterFlowTestingEntity) winterFlowUserManagerController).WinterFlowBatchUI; winterFlowUserManagerController3 != null; winterFlowUserManagerController3 = winterFlowUserManagerController3.WinterFlowResponseEngine) {
                                    if ((winterFlowUserManagerController3.WinterFlowUnitTestResponse & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            winterFlowUserManagerController = winterFlowUserManagerController3;
                                        } else {
                                            if (winterFlowJSON == null) {
                                                winterFlowJSON = new WinterFlowJSON(new WinterFlowUserManagerController[16]);
                                            }
                                            if (winterFlowUserManagerController != null) {
                                                winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController);
                                                winterFlowUserManagerController = null;
                                            }
                                            winterFlowJSON.WinterFlowHookDataSource(winterFlowUserManagerController3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            winterFlowUserManagerController = WinterFlowCloudStack.WinterFlowPackageIDE(winterFlowJSON);
                        }
                    }
                    winterFlowUserManagerController2 = winterFlowUserManagerController2.WinterFlowSyntax;
                }
            }
            WinterFlowSyntaxSubsystem = WinterFlowSyntaxSubsystem.WinterFlowVariableBandwidth();
            winterFlowUserManagerController2 = (WinterFlowSyntaxSubsystem == null || (winterFlowExceptionStrategy = WinterFlowSyntaxSubsystem.WinterFlowUserManagerUserManager) == null) ? null : winterFlowExceptionStrategy.WinterFlowVariableVersionControl;
        }
        WinterFlowDeploymentWidget winterFlowDeploymentWidget2 = (WinterFlowDeploymentWidget) winterFlowUserManagerController;
        if ((winterFlowDeploymentWidget2 == null || !WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowDeploymentWidget2.WinterFlowWidgetProcess(), winterFlowDeploymentWidget.WinterFlowWidgetProcess())) && (WinterFlowWidgetProcess = winterFlowDeploymentWidget.WinterFlowWidgetProcess()) != null) {
            int i6 = 5;
            if (i != 5) {
                i6 = 6;
                if (i != 6) {
                    i6 = 3;
                    if (i != 3) {
                        i6 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i6 = 2;
                            } else if (i == 2) {
                                i6 = 1;
                            } else {
                                WinterFlowEventEmitterOrchestration.WinterFlowRouterRouter("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (WinterFlowWidgetProcess.WinterFlowVariableBandwidth.WinterFlowRouterStructure.WinterFlowUnitTestResponse().WinterFlowServiceUtility <= 0 || WinterFlowWidgetProcess.WinterFlowVariableBandwidth.WinterFlowRouterStructure.WinterFlowUnitTestResponse().WinterFlowTransactionAgent.isEmpty() || !WinterFlowWidgetProcess.WinterFlowSingletonPlatform) {
                return winterFlowObjectSession.WinterFlowUnitTestResponse(WinterFlowNodeSingleton.WinterFlowSerializerStructure);
            }
            boolean WinterFlowUIPlatform = WinterFlowWidgetProcess.WinterFlowUIPlatform(i6);
            WinterFlowCloudPackage winterFlowCloudPackage = WinterFlowWidgetProcess.WinterFlowVariableBandwidth;
            int min = WinterFlowUIPlatform ? Math.min(winterFlowCloudPackage.WinterFlowRouterStructure.WinterFlowUnitTestResponse().WinterFlowServiceUtility - 1, ((WinterFlowServiceSyntax) WinterFlowSerializerUtility.WinterFlowThreadPoolEventEmitter(winterFlowCloudPackage.WinterFlowRouterStructure.WinterFlowUnitTestResponse().WinterFlowTransactionAgent)).WinterFlowRouterStructure) : Math.max(0, ((WinterFlowVersionControlModule) winterFlowCloudPackage.WinterFlowRouterStructure.WinterFlowVariableVersionControl.WinterFlowHookDataSource).WinterFlowRouterRouter());
            WinterFlowBandwidthCache winterFlowBandwidthCache = new WinterFlowBandwidthCache();
            WinterFlowRequestController winterFlowRequestController = WinterFlowWidgetProcess.WinterFlowBatchUI;
            winterFlowRequestController.getClass();
            WinterFlowTransactionManagerUtility winterFlowTransactionManagerUtility = new WinterFlowTransactionManagerUtility(min, min);
            winterFlowRequestController.WinterFlowRouterStructure.WinterFlowHookDataSource(winterFlowTransactionManagerUtility);
            winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowTransactionManagerUtility;
            WinterFlowNetworkSession winterFlowNetworkSession = WinterFlowWidgetProcess.WinterFlowVariableBandwidth.WinterFlowRouterStructure;
            if (winterFlowNetworkSession.WinterFlowUnitTestResponse().WinterFlowTransactionAgent.isEmpty()) {
                i3 = 0;
            } else {
                WinterFlowFrameworkLoader WinterFlowUnitTestResponse2 = winterFlowNetworkSession.WinterFlowUnitTestResponse();
                int WinterFlowUnitTestResponse3 = (int) (WinterFlowUnitTestResponse2.WinterFlowBandwidthObject == WinterFlowBackendBatch.WinterFlowVariableVersionControl ? WinterFlowUnitTestResponse2.WinterFlowUnitTestResponse() & 4294967295L : WinterFlowUnitTestResponse2.WinterFlowUnitTestResponse() >> 32);
                WinterFlowFrameworkLoader WinterFlowUnitTestResponse4 = winterFlowNetworkSession.WinterFlowUnitTestResponse();
                List list = WinterFlowUnitTestResponse4.WinterFlowTransactionAgent;
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    int size2 = list.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size2; i8++) {
                        i7 += ((WinterFlowServiceSyntax) list.get(i8)).WinterFlowTransactionAgent;
                    }
                    size = (i7 / list.size()) + WinterFlowUnitTestResponse4.WinterFlowConcurrencyThread;
                }
                if (size != 0 && (i4 = WinterFlowUnitTestResponse3 / size) >= 1) {
                    i3 = i4;
                }
            }
            int i9 = i3 * 2;
            int i10 = WinterFlowWidgetProcess.WinterFlowVariableBandwidth.WinterFlowRouterStructure.WinterFlowUnitTestResponse().WinterFlowServiceUtility;
            if (i9 > i10) {
                i9 = i10;
            }
            while (obj == null && WinterFlowWidgetProcess.WinterFlowValidatorNetwork((WinterFlowTransactionManagerUtility) winterFlowBandwidthCache.WinterFlowVariableVersionControl, i6) && i2 < i9) {
                WinterFlowTransactionManagerUtility winterFlowTransactionManagerUtility2 = (WinterFlowTransactionManagerUtility) winterFlowBandwidthCache.WinterFlowVariableVersionControl;
                int i11 = winterFlowTransactionManagerUtility2.WinterFlowRouterStructure;
                int i12 = winterFlowTransactionManagerUtility2.WinterFlowHookDataSource;
                if (WinterFlowWidgetProcess.WinterFlowUIPlatform(i6)) {
                    i12++;
                } else {
                    i11--;
                }
                WinterFlowRequestController winterFlowRequestController2 = WinterFlowWidgetProcess.WinterFlowBatchUI;
                winterFlowRequestController2.getClass();
                WinterFlowTransactionManagerUtility winterFlowTransactionManagerUtility3 = new WinterFlowTransactionManagerUtility(i11, i12);
                winterFlowRequestController2.WinterFlowRouterStructure.WinterFlowHookDataSource(winterFlowTransactionManagerUtility3);
                WinterFlowWidgetProcess.WinterFlowBatchUI.WinterFlowRouterStructure.WinterFlowResponseEngine((WinterFlowTransactionManagerUtility) winterFlowBandwidthCache.WinterFlowVariableVersionControl);
                winterFlowBandwidthCache.WinterFlowVariableVersionControl = winterFlowTransactionManagerUtility3;
                i2++;
                WinterFlowCloudStack.WinterFlowSyntaxSubsystem(WinterFlowWidgetProcess).WinterFlowTransactionAgent();
                obj = winterFlowObjectSession.WinterFlowUnitTestResponse(new WinterFlowFunctionManager(WinterFlowWidgetProcess, winterFlowBandwidthCache, i6));
            }
            WinterFlowWidgetProcess.WinterFlowBatchUI.WinterFlowRouterStructure.WinterFlowResponseEngine((WinterFlowTransactionManagerUtility) winterFlowBandwidthCache.WinterFlowVariableVersionControl);
            WinterFlowCloudStack.WinterFlowSyntaxSubsystem(WinterFlowWidgetProcess).WinterFlowTransactionAgent();
            return obj;
        }
        return null;
    }

    public static final WinterFlowCompilerStructure WinterFlowResolverController(WinterFlowProcessorSystem winterFlowProcessorSystem) {
        Object WinterFlowUnitTestResponse2 = winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowCacheManagerListener);
        if (WinterFlowUnitTestResponse2 == null) {
            WinterFlowUnitTestResponse2 = null;
        }
        WinterFlowCompilerStructure winterFlowCompilerStructure = (WinterFlowCompilerStructure) WinterFlowUnitTestResponse2;
        Object WinterFlowUnitTestResponse3 = winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowArrayHelper);
        if (WinterFlowUnitTestResponse3 == null) {
            WinterFlowUnitTestResponse3 = null;
        }
        List list = (List) WinterFlowUnitTestResponse3;
        return winterFlowCompilerStructure == null ? list != null ? (WinterFlowCompilerStructure) WinterFlowSerializerUtility.WinterFlowPipelineSoftware(list) : null : winterFlowCompilerStructure;
    }

    public static final WinterFlowObjectUtility WinterFlowResponseEngine(Context context) {
        return new WinterFlowObjectUtility(new WinterFlowEventWorker(context, 0), new WinterFlowDatabaseSchemaTesting(Build.VERSION.SDK_INT >= 31 ? WinterFlowExceptionNetwork.WinterFlowRouterStructure.WinterFlowRouterStructure(context) : 0));
    }

    public static final void WinterFlowRouterRouter(WinterFlowCloudModule winterFlowCloudModule, ArrayList arrayList, int i) {
        boolean WinterFlowServerProtocol2 = winterFlowCloudModule.WinterFlowServerProtocol(i);
        int[] iArr = winterFlowCloudModule.WinterFlowHookDataSource;
        if (WinterFlowServerProtocol2) {
            arrayList.add(winterFlowCloudModule.WinterFlowServiceUtility(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            WinterFlowRouterRouter(winterFlowCloudModule, arrayList, i3);
        }
    }

    public static WinterFlowSoftwareUserManager WinterFlowRouterStructure(int i, int i2, int i3) {
        ColorSpace colorSpace;
        ColorSpace.Rgb rgb;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        WinterFlowBatchBatch winterFlowBatchBatch = WinterFlowIDEStructure.WinterFlowVariableVersionControl;
        WinterFlowQuerySyntax.WinterFlowSoftwareProtocol(i3);
        Bitmap.Config WinterFlowSoftwareProtocol = WinterFlowQuerySyntax.WinterFlowSoftwareProtocol(i3);
        if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, winterFlowBatchBatch)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowConcurrencyThread)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowSingletonPlatform)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowBandwidthObject)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowResponseEngine)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowSyntax)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowBatchUI)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowVariableBandwidth)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowTransactionAgent)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowServerProtocol)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowUnitTestResponse)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowRouterRouter)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowTransactionManagerStrategy)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowThreadListener)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowOrchestrationSubsystem)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowServiceUtility)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (Build.VERSION.SDK_INT >= 34) {
                if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowSerializerStructure)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    colorSpace3 = ColorSpace.get(named2);
                } else if (WinterFlowManagerRequest.WinterFlowThreadListener(winterFlowBatchBatch, WinterFlowIDEStructure.WinterFlowMapperProtocol)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    colorSpace3 = ColorSpace.get(named);
                } else {
                    colorSpace3 = null;
                }
                if (colorSpace3 != null) {
                    colorSpace2 = colorSpace3;
                    return new WinterFlowSoftwareUserManager(Bitmap.createBitmap((DisplayMetrics) null, i, i2, WinterFlowSoftwareProtocol, true, colorSpace2));
                }
            }
            if (winterFlowBatchBatch != null) {
                String str = winterFlowBatchBatch.WinterFlowRouterStructure;
                float[] WinterFlowRouterStructure2 = winterFlowBatchBatch.WinterFlowArrayNetwork.WinterFlowRouterStructure();
                WinterFlowProviderMechanism winterFlowProviderMechanism = winterFlowBatchBatch.WinterFlowUnitTestResponse;
                ColorSpace.Rgb.TransferParameters transferParameters = winterFlowProviderMechanism != null ? new ColorSpace.Rgb.TransferParameters(winterFlowProviderMechanism.WinterFlowHookDataSource, winterFlowProviderMechanism.WinterFlowCacheManagerAgent, winterFlowProviderMechanism.WinterFlowArrayNetwork, winterFlowProviderMechanism.WinterFlowVariableVersionControl, winterFlowProviderMechanism.WinterFlowTransactionManagerStrategy, winterFlowProviderMechanism.WinterFlowUnitTestResponse, winterFlowProviderMechanism.WinterFlowRouterStructure) : null;
                float[] fArr = winterFlowBatchBatch.WinterFlowSyntax;
                final int i4 = 0;
                if (transferParameters != null) {
                    rgb = new ColorSpace.Rgb(str, winterFlowBatchBatch.WinterFlowRouterRouter, WinterFlowRouterStructure2, transferParameters);
                    if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb.getTransform(), fArr)) {
                        colorSpace = new ColorSpace.Rgb(str, fArr, transferParameters);
                    }
                } else {
                    float[] fArr2 = winterFlowBatchBatch.WinterFlowRouterRouter;
                    final WinterFlowResponseComponent winterFlowResponseComponent = winterFlowBatchBatch.WinterFlowServerProtocol;
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: com.google.android.datatransport.WinterFlowDeserializationAdapter
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            int i5 = i4;
                            WinterFlowObjectSession winterFlowObjectSession = winterFlowResponseComponent;
                            switch (i5) {
                            }
                            return ((Number) winterFlowObjectSession.WinterFlowUnitTestResponse(Double.valueOf(d))).doubleValue();
                        }
                    };
                    final WinterFlowResponseComponent winterFlowResponseComponent2 = winterFlowBatchBatch.WinterFlowBandwidthObject;
                    final int i5 = 1;
                    rgb = new ColorSpace.Rgb(str, fArr2, WinterFlowRouterStructure2, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: com.google.android.datatransport.WinterFlowDeserializationAdapter
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            int i52 = i5;
                            WinterFlowObjectSession winterFlowObjectSession = winterFlowResponseComponent2;
                            switch (i52) {
                            }
                            return ((Number) winterFlowObjectSession.WinterFlowUnitTestResponse(Double.valueOf(d))).doubleValue();
                        }
                    }, winterFlowBatchBatch.WinterFlowVariableVersionControl, winterFlowBatchBatch.WinterFlowTransactionManagerStrategy);
                }
                colorSpace2 = rgb;
                return new WinterFlowSoftwareUserManager(Bitmap.createBitmap((DisplayMetrics) null, i, i2, WinterFlowSoftwareProtocol, true, colorSpace2));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        colorSpace2 = colorSpace;
        return new WinterFlowSoftwareUserManager(Bitmap.createBitmap((DisplayMetrics) null, i, i2, WinterFlowSoftwareProtocol, true, colorSpace2));
    }

    public static final boolean WinterFlowSerializerStructure(WinterFlowProcessorSystem winterFlowProcessorSystem) {
        Object WinterFlowUnitTestResponse2 = winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowUserManagerUserManager);
        if (WinterFlowUnitTestResponse2 == null) {
            WinterFlowUnitTestResponse2 = null;
        }
        WinterFlowFrameworkCacheManager winterFlowFrameworkCacheManager = (WinterFlowFrameworkCacheManager) WinterFlowUnitTestResponse2;
        WinterFlowDatabaseSchemaStructure winterFlowDatabaseSchemaStructure = winterFlowProcessorSystem.WinterFlowArrayNetwork.WinterFlowVariableVersionControl;
        Object WinterFlowUnitTestResponse3 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowConsumerUserManager);
        if (WinterFlowUnitTestResponse3 == null) {
            WinterFlowUnitTestResponse3 = null;
        }
        boolean z = winterFlowFrameworkCacheManager != null;
        Object WinterFlowUnitTestResponse4 = winterFlowDatabaseSchemaStructure.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowSoftwareProtocol);
        if (((Boolean) (WinterFlowUnitTestResponse4 != null ? WinterFlowUnitTestResponse4 : null)) != null) {
            return true;
        }
        return z;
    }

    public static final float WinterFlowServerProtocol(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final int WinterFlowServiceUtility(int i, List list) {
        int i2;
        int i3 = ((WinterFlowNodeInterface) WinterFlowSerializerUtility.WinterFlowThreadPoolEventEmitter(list)).WinterFlowCacheManagerAgent;
        if (i > ((WinterFlowNodeInterface) WinterFlowSerializerUtility.WinterFlowThreadPoolEventEmitter(list)).WinterFlowCacheManagerAgent) {
            WinterFlowWorkerPipeline.WinterFlowRouterStructure("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            WinterFlowNodeInterface winterFlowNodeInterface = (WinterFlowNodeInterface) list.get(i2);
            char c = winterFlowNodeInterface.WinterFlowHookDataSource > i ? (char) 1 : winterFlowNodeInterface.WinterFlowCacheManagerAgent <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder WinterFlowThreadListener = WinterFlowResolverBackend.WinterFlowThreadListener("Found paragraph index ", i2, " should be in range [0, ");
        WinterFlowThreadListener.append(list.size());
        WinterFlowThreadListener.append(").\nDebug info: index=");
        WinterFlowThreadListener.append(i);
        WinterFlowThreadListener.append(", paragraphs=[");
        WinterFlowThreadListener.append(WinterFlowBackendTool.WinterFlowRouterStructure(list, null, new WinterFlowInterfaceSoftware(20), 31));
        WinterFlowThreadListener.append(']');
        WinterFlowWorkerPipeline.WinterFlowRouterStructure(WinterFlowThreadListener.toString());
        return i2;
    }

    public static WinterFlowCacheComponent WinterFlowSingletonPlatform(int i) {
        WinterFlowIDEService winterFlowIDEService = WinterFlowIDEService.WinterFlowTransactionAgent;
        float WinterFlowPackageIDE = WinterFlowCacheRuntime.WinterFlowPackageIDE((i >> 16) & 255);
        float WinterFlowPackageIDE2 = WinterFlowCacheRuntime.WinterFlowPackageIDE((i >> 8) & 255);
        float WinterFlowPackageIDE3 = WinterFlowCacheRuntime.WinterFlowPackageIDE(i & 255);
        double[][] dArr = WinterFlowCacheRuntime.WinterFlowTransactionManagerStrategy;
        double d = WinterFlowPackageIDE;
        double[] dArr2 = dArr[0];
        double d2 = WinterFlowPackageIDE2;
        double d3 = WinterFlowPackageIDE3;
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d4, (float) d5, (float) ((d3 * dArr4[2]) + (d2 * dArr4[1]) + (d * dArr4[0]))};
        float[][] fArr2 = WinterFlowCacheRuntime.WinterFlowCacheManagerAgent;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float[] fArr6 = winterFlowIDEService.WinterFlowUnitTestResponse;
        float f9 = winterFlowIDEService.WinterFlowVariableVersionControl;
        float f10 = winterFlowIDEService.WinterFlowHookDataSource;
        float f11 = fArr6[0] * f6;
        float f12 = fArr6[1] * f7;
        float f13 = fArr6[2] * f8;
        float f14 = winterFlowIDEService.WinterFlowRouterRouter;
        float pow = (float) Math.pow((Math.abs(f11) * f14) / 100.0f, 0.41999998688697815d);
        float pow2 = (float) Math.pow((Math.abs(f12) * f14) / 100.0f, 0.41999998688697815d);
        float pow3 = (float) Math.pow((Math.abs(f13) * f14) / 100.0f, 0.41999998688697815d);
        float signum = ((Math.signum(f11) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f12) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f13) * 400.0f) * pow3) / (pow3 + 27.13f);
        float f15 = ((((-12.0f) * signum2) + (signum * 11.0f)) + signum3) / 11.0f;
        float f16 = ((signum + signum2) - (signum3 * 2.0f)) / 9.0f;
        float f17 = signum2 * 20.0f;
        float f18 = ((21.0f * signum3) + ((signum * 20.0f) + f17)) / 20.0f;
        float f19 = (((signum * 40.0f) + f17) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f16, f15)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f20 = atan2;
        float f21 = (f20 * 3.1415927f) / 180.0f;
        float pow4 = ((float) Math.pow((f19 * winterFlowIDEService.WinterFlowCacheManagerAgent) / f10, winterFlowIDEService.WinterFlowResponseEngine * f9)) * 100.0f;
        float pow5 = ((float) Math.pow(((((((((float) Math.cos((((((double) f20) < 20.14d ? 360.0f + f20 : f20) * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * winterFlowIDEService.WinterFlowTransactionManagerStrategy) * winterFlowIDEService.WinterFlowArrayNetwork) * ((float) Math.sqrt((f16 * f16) + (f15 * f15)))) / (f18 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, winterFlowIDEService.WinterFlowRouterStructure)), 0.7300000190734863d)) * ((float) Math.sqrt(pow4 / 100.0f));
        float f22 = winterFlowIDEService.WinterFlowSyntax * pow5;
        Math.sqrt((r2 * f9) / (f10 + 4.0f));
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f22 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f21;
        return new WinterFlowCacheComponent(f20, pow5, pow4, f23, log * ((float) Math.cos(d6)), log * ((float) Math.sin(d6)));
    }

    public static final Object[] WinterFlowSoftwareEngine(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final void WinterFlowSoftwareProtocol(WinterFlowFrameworkDataSource winterFlowFrameworkDataSource, WinterFlowProcessorSystem winterFlowProcessorSystem) {
        Object WinterFlowUnitTestResponse2 = winterFlowProcessorSystem.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowUnitTestResponse);
        if (WinterFlowUnitTestResponse2 == null) {
            WinterFlowUnitTestResponse2 = null;
        }
        if (WinterFlowUnitTestResponse2 != null) {
            WinterFlowEventEmitterOrchestration.WinterFlowVariableBandwidth();
            return;
        }
        WinterFlowProcessorSystem WinterFlowServerProtocol2 = winterFlowProcessorSystem.WinterFlowServerProtocol();
        if (WinterFlowServerProtocol2 == null) {
            return;
        }
        Object WinterFlowUnitTestResponse3 = WinterFlowServerProtocol2.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowVariableVersionControl);
        if (WinterFlowUnitTestResponse3 == null) {
            WinterFlowUnitTestResponse3 = null;
        }
        if (WinterFlowUnitTestResponse3 != null) {
            Object WinterFlowUnitTestResponse4 = WinterFlowServerProtocol2.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowTransactionManagerStrategy);
            WinterFlowDebugResponse winterFlowDebugResponse = (WinterFlowDebugResponse) (WinterFlowUnitTestResponse4 != null ? WinterFlowUnitTestResponse4 : null);
            if (winterFlowDebugResponse == null || (winterFlowDebugResponse.WinterFlowRouterStructure >= 0 && winterFlowDebugResponse.WinterFlowHookDataSource >= 0)) {
                if (winterFlowProcessorSystem.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowSoftwareProtocol)) {
                    ArrayList arrayList = new ArrayList();
                    List WinterFlowResponseEngine2 = WinterFlowProcessorSystem.WinterFlowResponseEngine(4, WinterFlowServerProtocol2);
                    int size = WinterFlowResponseEngine2.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        WinterFlowProcessorSystem winterFlowProcessorSystem2 = (WinterFlowProcessorSystem) WinterFlowResponseEngine2.get(i2);
                        if (winterFlowProcessorSystem2.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowSoftwareProtocol)) {
                            arrayList.add(winterFlowProcessorSystem2);
                            if (winterFlowProcessorSystem2.WinterFlowCacheManagerAgent.WinterFlowRouterAdapter() < winterFlowProcessorSystem.WinterFlowCacheManagerAgent.WinterFlowRouterAdapter()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean WinterFlowTransactionManagerStrategy2 = WinterFlowTransactionManagerStrategy(arrayList);
                    int i3 = WinterFlowTransactionManagerStrategy2 ? 0 : i;
                    int i4 = WinterFlowTransactionManagerStrategy2 ? i : 0;
                    Object WinterFlowUnitTestResponse5 = winterFlowProcessorSystem.WinterFlowTransactionAgent().WinterFlowVariableVersionControl.WinterFlowUnitTestResponse(WinterFlowRendererJava.WinterFlowSoftwareProtocol);
                    if (WinterFlowUnitTestResponse5 == null) {
                        WinterFlowUnitTestResponse5 = Boolean.FALSE;
                    }
                    winterFlowFrameworkDataSource.WinterFlowRouterStructure.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) WinterFlowUnitTestResponse5).booleanValue()));
                }
            }
        }
    }

    public static final void WinterFlowStrategyTool(List list, int i, int i2) {
        int WinterFlowThreadListener = WinterFlowThreadListener(i, list);
        if (WinterFlowThreadListener < 0) {
            WinterFlowThreadListener = -(WinterFlowThreadListener + 1);
        }
        while (WinterFlowThreadListener < list.size() && ((WinterFlowRouterVariable) list.get(WinterFlowThreadListener)).WinterFlowHookDataSource < i2) {
        }
    }

    public static final Object WinterFlowSyntax(WinterFlowCloudFramework winterFlowCloudFramework, WinterFlowObjectSession winterFlowObjectSession, WinterFlowTransactionManagerLayer winterFlowTransactionManagerLayer) {
        WinterFlowWorkerStructure winterFlowWorkerStructure;
        if (winterFlowCloudFramework.WinterFlowUnitTestResponse() && winterFlowCloudFramework.WinterFlowSyntax() && winterFlowCloudFramework.WinterFlowRouterRouter()) {
            return winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowTransactionManagerLayer);
        }
        if (winterFlowTransactionManagerLayer.getContext().WinterFlowConsumerUserManager(WinterFlowSyntaxInvoker.WinterFlowUnitTestResponse) == null) {
            return winterFlowObjectSession.WinterFlowUnitTestResponse(winterFlowTransactionManagerLayer);
        }
        WinterFlowModuleStack winterFlowModuleStack = new WinterFlowModuleStack(winterFlowObjectSession, null, 23);
        WinterFlowUIBackend winterFlowUIBackend = (WinterFlowUIBackend) winterFlowTransactionManagerLayer.getContext().WinterFlowConsumerUserManager(WinterFlowUIBackend.WinterFlowTransactionManagerStrategy);
        WinterFlowUnitTestRouter winterFlowUnitTestRouter = winterFlowUIBackend != null ? winterFlowUIBackend.WinterFlowVariableVersionControl : null;
        if (winterFlowUnitTestRouter != null) {
            return WinterFlowCacheRuntime.WinterFlowModuleAgent(winterFlowUnitTestRouter, winterFlowModuleStack, winterFlowTransactionManagerLayer);
        }
        WinterFlowEventCloud winterFlowEventCloud = new WinterFlowEventCloud(1, WinterFlowCloudStack.WinterFlowCompilerVariable(winterFlowTransactionManagerLayer));
        winterFlowEventCloud.WinterFlowSerializerStructure();
        try {
            winterFlowWorkerStructure = winterFlowCloudFramework.WinterFlowArrayNetwork;
        } catch (RejectedExecutionException e) {
            winterFlowEventCloud.WinterFlowResponseEngine(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        if (winterFlowWorkerStructure != null) {
            winterFlowWorkerStructure.execute(new WinterFlowCacheManagerCloud(winterFlowEventCloud, winterFlowCloudFramework, winterFlowModuleStack, 3, false));
            return winterFlowEventCloud.WinterFlowBatchUI();
        }
        WinterFlowManagerRequest.WinterFlowCloudMicroservice("internalTransactionExecutor");
        throw null;
    }

    public static final long WinterFlowSyntaxSubsystem(long j) {
        return WinterFlowFrameworkMechanism.WinterFlowCacheManagerAgent(Float.isNaN(WinterFlowXMLNetwork.WinterFlowHookDataSource(j)) ? 0.0f : WinterFlowXMLNetwork.WinterFlowHookDataSource(j), Float.isNaN(WinterFlowXMLNetwork.WinterFlowCacheManagerAgent(j)) ? 0.0f : WinterFlowXMLNetwork.WinterFlowCacheManagerAgent(j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.datatransport.WinterFlowObjectProcess, com.google.android.datatransport.WinterFlowPackageConsumer] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList WinterFlowTestingNode(WinterFlowCloudModule winterFlowCloudModule, int i, Integer num) {
        ?? winterFlowObjectProcess = new WinterFlowObjectProcess(winterFlowCloudModule);
        int WinterFlowConcurrencyThread = winterFlowCloudModule.WinterFlowConcurrencyThread(i);
        WinterFlowDatabaseSchemaHandler WinterFlowRouterStructure2 = winterFlowCloudModule.WinterFlowRouterStructure(i);
        while (i >= 0) {
            winterFlowObjectProcess.WinterFlowThreadListener(winterFlowCloudModule.WinterFlowSyntax(i), winterFlowCloudModule.WinterFlowTransactionAgent(i) ? winterFlowCloudModule.WinterFlowOrchestrationSubsystem(winterFlowCloudModule.WinterFlowHookDataSource, i) : WinterFlowModuleModule.WinterFlowRouterStructure, winterFlowCloudModule.WinterFlowRouterStructure.WinterFlowUnitTestResponse(i), num);
            if (WinterFlowConcurrencyThread >= 0) {
                WinterFlowDatabaseSchemaHandler winterFlowDatabaseSchemaHandler = WinterFlowRouterStructure2;
                WinterFlowRouterStructure2 = winterFlowCloudModule.WinterFlowRouterStructure(WinterFlowConcurrencyThread);
                i = WinterFlowConcurrencyThread;
                WinterFlowConcurrencyThread = winterFlowCloudModule.WinterFlowConcurrencyThread(WinterFlowConcurrencyThread);
                num = winterFlowDatabaseSchemaHandler;
            } else {
                i = WinterFlowConcurrencyThread;
                num = WinterFlowRouterStructure2;
            }
        }
        return (ArrayList) winterFlowObjectProcess.WinterFlowRouterStructure;
    }

    public static final int WinterFlowThreadListener(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int WinterFlowBatchUI = WinterFlowManagerRequest.WinterFlowBatchUI(((WinterFlowRouterVariable) list.get(i3)).WinterFlowHookDataSource, i);
            if (WinterFlowBatchUI < 0) {
                i2 = i3 + 1;
            } else {
                if (WinterFlowBatchUI <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final boolean WinterFlowTransactionAgent(WinterFlowProcessorSystem winterFlowProcessorSystem) {
        WinterFlowDecoratorBackend WinterFlowTransactionAgent2 = winterFlowProcessorSystem.WinterFlowTransactionAgent();
        return !WinterFlowTransactionAgent2.WinterFlowVariableVersionControl.WinterFlowCacheManagerAgent(WinterFlowRendererJava.WinterFlowResponseEngine);
    }

    public static final boolean WinterFlowTransactionManagerStrategy(ArrayList arrayList) {
        List list;
        long j;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = WinterFlowDataSourceEngine.WinterFlowVariableVersionControl;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    Object obj2 = arrayList.get(i);
                    WinterFlowProcessorSystem winterFlowProcessorSystem = (WinterFlowProcessorSystem) obj2;
                    WinterFlowProcessorSystem winterFlowProcessorSystem2 = (WinterFlowProcessorSystem) obj;
                    float abs = Math.abs(Float.intBitsToFloat((int) (winterFlowProcessorSystem2.WinterFlowUnitTestResponse().WinterFlowRouterStructure() >> 32)) - Float.intBitsToFloat((int) (winterFlowProcessorSystem.WinterFlowUnitTestResponse().WinterFlowRouterStructure() >> 32)));
                    float abs2 = Math.abs(Float.intBitsToFloat((int) (winterFlowProcessorSystem2.WinterFlowUnitTestResponse().WinterFlowRouterStructure() & 4294967295L)) - Float.intBitsToFloat((int) (winterFlowProcessorSystem.WinterFlowUnitTestResponse().WinterFlowRouterStructure() & 4294967295L)));
                    arrayList2.add(new WinterFlowHandlerResolver((Float.floatToRawIntBits(abs) << 32) | (Float.floatToRawIntBits(abs2) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j = ((WinterFlowHandlerResolver) WinterFlowSerializerUtility.WinterFlowStrategyHook(list)).WinterFlowRouterStructure;
            } else {
                if (list.isEmpty()) {
                    WinterFlowBackendTool.WinterFlowHookDataSource("Empty collection can't be reduced.");
                }
                Object WinterFlowStrategyHook = WinterFlowSerializerUtility.WinterFlowStrategyHook(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        WinterFlowStrategyHook = new WinterFlowHandlerResolver(WinterFlowHandlerResolver.WinterFlowVariableVersionControl(((WinterFlowHandlerResolver) WinterFlowStrategyHook).WinterFlowRouterStructure, ((WinterFlowHandlerResolver) list.get(i2)).WinterFlowRouterStructure));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((WinterFlowHandlerResolver) WinterFlowStrategyHook).WinterFlowRouterStructure;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean WinterFlowUnitTestResponse(Object obj) {
        if (obj instanceof WinterFlowTransactionUnitTest) {
            WinterFlowTransactionUnitTest winterFlowTransactionUnitTest = (WinterFlowTransactionUnitTest) obj;
            if (winterFlowTransactionUnitTest.WinterFlowVariableVersionControl() == WinterFlowSessionManagerProcess.WinterFlowRouterAdapter || winterFlowTransactionUnitTest.WinterFlowVariableVersionControl() == WinterFlowSessionManagerProcess.WinterFlowResolverController || winterFlowTransactionUnitTest.WinterFlowVariableVersionControl() == WinterFlowSessionManagerProcess.WinterFlowMapperProtocol) {
                Object value = winterFlowTransactionUnitTest.getValue();
                if (value == null) {
                    return true;
                }
                return WinterFlowUnitTestResponse(value);
            }
        } else if (!(obj instanceof WinterFlowOrchestrationIDE) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (WinterFlowCacheManagerAgent[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Object[] WinterFlowUserManagerUserManager(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = WinterFlowHookDataSource;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    public static WinterFlowCacheComponent WinterFlowVariableBandwidth(float f, float f2, float f3) {
        float f4 = WinterFlowIDEService.WinterFlowTransactionAgent.WinterFlowSyntax * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(f / 100.0d))) * r0.WinterFlowVariableVersionControl) / (r0.WinterFlowHookDataSource + 4.0f));
        float f5 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((f4 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new WinterFlowCacheComponent(f3, f2, f, f5, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public static final int WinterFlowVariableVersionControl(WinterFlowRequestUtility winterFlowRequestUtility, WinterFlowInheritanceResponse winterFlowInheritanceResponse) {
        WinterFlowRequestUtility WinterFlowHandlerJSON = winterFlowRequestUtility.WinterFlowHandlerJSON();
        if (WinterFlowHandlerJSON == null) {
            WinterFlowViewUtility.WinterFlowHookDataSource("Child of " + winterFlowRequestUtility + " cannot be null when calculating alignment line");
        }
        if (winterFlowRequestUtility.WinterFlowFunctionPipeline().WinterFlowRouterStructure().containsKey(winterFlowInheritanceResponse)) {
            Integer num = (Integer) winterFlowRequestUtility.WinterFlowFunctionPipeline().WinterFlowRouterStructure().get(winterFlowInheritanceResponse);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int WinterFlowStrategyHook = WinterFlowHandlerJSON.WinterFlowStrategyHook(winterFlowInheritanceResponse);
            if (WinterFlowStrategyHook != Integer.MIN_VALUE) {
                WinterFlowHandlerJSON.WinterFlowServiceUtility = true;
                winterFlowRequestUtility.WinterFlowBandwidthObject = true;
                winterFlowRequestUtility.WinterFlowProtocolConsumer();
                WinterFlowHandlerJSON.WinterFlowServiceUtility = false;
                winterFlowRequestUtility.WinterFlowBandwidthObject = false;
                return WinterFlowStrategyHook + ((int) (winterFlowInheritanceResponse instanceof WinterFlowInheritanceResponse ? WinterFlowHandlerJSON.WinterFlowSingletonWidget() & 4294967295L : WinterFlowHandlerJSON.WinterFlowSingletonWidget() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public abstract WinterFlowVersionParser WinterFlowRouterAdapter();
}
