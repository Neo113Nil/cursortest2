package com.google.android.datatransport;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.DisplayCutout;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowSessionManagerProcess implements WinterFlowCacheManagerFunction, WinterFlowRendererProvider, WinterFlowMicroserviceBandwidth, WinterFlowPipelineComponent, WinterFlowInterfaceScript, WinterFlowBatchLayer, WinterFlowLoaderStructure, WinterFlowCloudMechanism, WinterFlowLoaderUtility, WinterFlowFunctionCacheManager, WinterFlowTransactionDecorator, WinterFlowListenerSubsystem {
    public final /* synthetic */ int WinterFlowVariableVersionControl;
    public static final /* synthetic */ WinterFlowSessionManagerProcess WinterFlowTransactionManagerStrategy = new WinterFlowSessionManagerProcess(1);
    public static final WinterFlowSessionManagerProcess WinterFlowUnitTestResponse = new WinterFlowSessionManagerProcess(2);
    public static final WinterFlowSessionManagerProcess WinterFlowRouterRouter = new WinterFlowSessionManagerProcess(3);
    public static final WinterFlowManagerNode WinterFlowSyntax = new WinterFlowManagerNode(1);
    public static final WinterFlowManagerNode WinterFlowResponseEngine = new WinterFlowManagerNode(2);
    public static final /* synthetic */ WinterFlowSessionManagerProcess WinterFlowTransactionAgent = new WinterFlowSessionManagerProcess(5);
    public static final WinterFlowSessionManagerProcess WinterFlowServerProtocol = new WinterFlowSessionManagerProcess(6);
    public static final WinterFlowSessionManagerProcess WinterFlowThreadListener = new WinterFlowSessionManagerProcess(7);
    public static final WinterFlowSessionManagerProcess WinterFlowServiceUtility = new WinterFlowSessionManagerProcess(8);
    public static final WinterFlowSessionManagerProcess WinterFlowBandwidthObject = new WinterFlowSessionManagerProcess(9);
    public static final WinterFlowSessionManagerProcess WinterFlowOrchestrationSubsystem = new WinterFlowSessionManagerProcess(10);
    public static final WinterFlowVersionParser WinterFlowConcurrencyThread = new WinterFlowVersionParser(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final /* synthetic */ WinterFlowSessionManagerProcess WinterFlowSingletonPlatform = new WinterFlowSessionManagerProcess(12);
    public static final /* synthetic */ WinterFlowSessionManagerProcess WinterFlowVariableBandwidth = new WinterFlowSessionManagerProcess(13);
    public static final /* synthetic */ WinterFlowSessionManagerProcess WinterFlowBatchUI = new WinterFlowSessionManagerProcess(14);
    public static final WinterFlowSessionManagerProcess WinterFlowRouterAdapter = new WinterFlowSessionManagerProcess(15);
    public static final /* synthetic */ WinterFlowSessionManagerProcess WinterFlowSerializerStructure = new WinterFlowSessionManagerProcess(16);
    public static final WinterFlowSessionManagerProcess WinterFlowMapperProtocol = new WinterFlowSessionManagerProcess(17);
    public static final WinterFlowSessionManagerProcess WinterFlowResolverController = new WinterFlowSessionManagerProcess(18);
    public static final WinterFlowSessionManagerProcess WinterFlowConsumerUserManager = new WinterFlowSessionManagerProcess(19);
    public static final WinterFlowSessionManagerProcess WinterFlowBackendCacheManager = new WinterFlowSessionManagerProcess(20);
    public static final WinterFlowDebugView WinterFlowEventEmitterController = new WinterFlowDebugView();

    public WinterFlowSessionManagerProcess(WinterFlowSyntaxTransactionManager winterFlowSyntaxTransactionManager) {
        this.WinterFlowVariableVersionControl = 22;
        WinterFlowViewRequest.WinterFlowRouterStructure.getClass();
    }

    public static WinterFlowTransactionConsumer WinterFlowBandwidthObject(List list) {
        return new WinterFlowTransactionConsumer(list, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
    }

    @Override // com.google.android.datatransport.WinterFlowBatchLayer
    public long WinterFlowArrayNetwork() {
        int i = WinterFlowInheritanceSubsystem.WinterFlowTransactionAgent;
        return WinterFlowInheritanceSubsystem.WinterFlowResponseEngine;
    }

    @Override // com.google.android.datatransport.WinterFlowListenerSubsystem
    public byte[] WinterFlowCacheManagerAgent(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // com.google.android.datatransport.WinterFlowBatchLayer
    public float WinterFlowHookDataSource() {
        return Float.NaN;
    }

    @Override // com.google.android.datatransport.WinterFlowMicroserviceBandwidth
    public float WinterFlowResponseEngine(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // com.google.android.datatransport.WinterFlowTransactionDecorator
    public void WinterFlowRouterRouter(int i, WinterFlowNodeException winterFlowNodeException, int[] iArr, int[] iArr2) {
        WinterFlowInvokerComponent.WinterFlowCloudMicroservice(i, iArr, iArr2, false);
    }

    @Override // com.google.android.datatransport.WinterFlowFunctionCacheManager, com.google.android.datatransport.WinterFlowTransactionDecorator
    public float WinterFlowRouterStructure() {
        return 0.0f;
    }

    public WinterFlowMapperManager WinterFlowServerProtocol(WinterFlowMapperManager winterFlowMapperManager, WinterFlowInvokerConsumer winterFlowInvokerConsumer) {
        return winterFlowMapperManager.WinterFlowCacheManagerAgent(new WinterFlowSchedulerDeployment(winterFlowInvokerConsumer));
    }

    public List WinterFlowServiceUtility(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (WinterFlowQueueManager winterFlowQueueManager : componentRegistrar.getComponents()) {
            String str = winterFlowQueueManager.WinterFlowRouterStructure;
            if (str != null) {
                winterFlowQueueManager = new WinterFlowQueueManager(str, winterFlowQueueManager.WinterFlowHookDataSource, winterFlowQueueManager.WinterFlowCacheManagerAgent, winterFlowQueueManager.WinterFlowArrayNetwork, winterFlowQueueManager.WinterFlowVariableVersionControl, new WinterFlowStackInterface(0, str, winterFlowQueueManager), winterFlowQueueManager.WinterFlowUnitTestResponse);
            }
            arrayList.add(winterFlowQueueManager);
        }
        return arrayList;
    }

    @Override // com.google.android.datatransport.WinterFlowCacheManagerFunction
    public Rect WinterFlowSyntax(Activity activity) {
        int safeInsetLeft;
        int safeInsetRight;
        int safeInsetTop;
        int safeInsetBottom;
        int safeInsetBottom2;
        int safeInsetRight2;
        WinterFlowSessionManagerProcess winterFlowSessionManagerProcess = WinterFlowCacheManagerFunction.WinterFlowRouterStructure;
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        DisplayCutout displayCutout = null;
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (activity.isInMultiWindowMode()) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                invoke.getClass();
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                invoke2.getClass();
                rect.set((Rect) invoke2);
            }
        } catch (Exception e) {
            if (!(e instanceof NoSuchFieldException) && !(e instanceof NoSuchMethodException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException)) {
                throw e;
            }
            winterFlowSessionManagerProcess.getClass();
            activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        if (!activity.isInMultiWindowMode()) {
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
            int i = rect.bottom + dimensionPixelSize;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + dimensionPixelSize;
                if (i2 == point.x) {
                    rect.right = i2;
                } else if (rect.left == dimensionPixelSize) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !activity.isInMultiWindowMode()) {
            try {
                Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
                constructor.setAccessible(true);
                Object newInstance = constructor.newInstance(null);
                Method declaredMethod = defaultDisplay.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(defaultDisplay, newInstance);
                Field declaredField2 = newInstance.getClass().getDeclaredField("displayCutout");
                declaredField2.setAccessible(true);
                Object obj2 = declaredField2.get(newInstance);
                if (WinterFlowRendererUtility.WinterFlowVariableBandwidth(obj2)) {
                    displayCutout = WinterFlowRendererUtility.WinterFlowVariableVersionControl(obj2);
                }
            } catch (Exception e2) {
                if (!(e2 instanceof ClassNotFoundException) && !(e2 instanceof NoSuchMethodException) && !(e2 instanceof NoSuchFieldException) && !(e2 instanceof IllegalAccessException) && !(e2 instanceof InvocationTargetException) && !(e2 instanceof InstantiationException)) {
                    throw e2;
                }
                winterFlowSessionManagerProcess.getClass();
            }
            if (displayCutout != null) {
                int i3 = rect.left;
                safeInsetLeft = displayCutout.getSafeInsetLeft();
                if (i3 == safeInsetLeft) {
                    rect.left = 0;
                }
                int i4 = point.x - rect.right;
                safeInsetRight = displayCutout.getSafeInsetRight();
                if (i4 == safeInsetRight) {
                    int i5 = rect.right;
                    safeInsetRight2 = displayCutout.getSafeInsetRight();
                    rect.right = safeInsetRight2 + i5;
                }
                int i6 = rect.top;
                safeInsetTop = displayCutout.getSafeInsetTop();
                if (i6 == safeInsetTop) {
                    rect.top = 0;
                }
                int i7 = point.y - rect.bottom;
                safeInsetBottom = displayCutout.getSafeInsetBottom();
                if (i7 == safeInsetBottom) {
                    int i8 = rect.bottom;
                    safeInsetBottom2 = displayCutout.getSafeInsetBottom();
                    rect.bottom = safeInsetBottom2 + i8;
                }
            }
        }
        return rect;
    }

    public boolean WinterFlowThreadListener(Object obj, Object obj2) {
        switch (this.WinterFlowVariableVersionControl) {
            case 15:
                return false;
            case 16:
            default:
                return WinterFlowManagerRequest.WinterFlowThreadListener(obj, obj2);
            case 17:
                return obj == obj2;
        }
    }

    @Override // com.google.android.datatransport.WinterFlowBatchLayer
    public WinterFlowHandlerWebsocket WinterFlowTransactionAgent() {
        return null;
    }

    @Override // com.google.android.datatransport.WinterFlowFunctionCacheManager
    public void WinterFlowTransactionManagerStrategy(WinterFlowNodeException winterFlowNodeException, int i, int[] iArr, WinterFlowCacheManagerConfiguration winterFlowCacheManagerConfiguration, int[] iArr2) {
        if (winterFlowCacheManagerConfiguration == WinterFlowCacheManagerConfiguration.WinterFlowVariableVersionControl) {
            WinterFlowInvokerComponent.WinterFlowCloudMicroservice(i, iArr, iArr2, false);
        } else {
            WinterFlowInvokerComponent.WinterFlowCloudMicroservice(i, iArr, iArr2, true);
        }
    }

    @Override // com.google.android.datatransport.WinterFlowInterfaceScript
    public Object WinterFlowUnitTestResponse(WinterFlowRequestEngine winterFlowRequestEngine) {
        switch (this.WinterFlowVariableVersionControl) {
            case 9:
                Object WinterFlowVariableVersionControl = winterFlowRequestEngine.WinterFlowVariableVersionControl(new WinterFlowValidatorProcess(WinterFlowTransactionManagerConfiguration.class, Executor.class));
                WinterFlowVariableVersionControl.getClass();
                return WinterFlowTestingCloud.WinterFlowConcurrencyThread((Executor) WinterFlowVariableVersionControl);
            default:
                Object WinterFlowVariableVersionControl2 = winterFlowRequestEngine.WinterFlowVariableVersionControl(new WinterFlowValidatorProcess(WinterFlowEncryptionObject.class, Executor.class));
                WinterFlowVariableVersionControl2.getClass();
                return WinterFlowTestingCloud.WinterFlowConcurrencyThread((Executor) WinterFlowVariableVersionControl2);
        }
    }

    public String toString() {
        switch (this.WinterFlowVariableVersionControl) {
            case 15:
                return "NeverEqualPolicy";
            case 17:
                return "ReferentialEqualityPolicy";
            case 18:
                return "StructuralEqualityPolicy";
            case 26:
                return "Arrangement#SpaceAround";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ WinterFlowSessionManagerProcess(int i) {
        this.WinterFlowVariableVersionControl = i;
    }

    @Override // com.google.android.datatransport.WinterFlowPipelineComponent
    public void WinterFlowVariableVersionControl() {
    }

    @Override // com.google.android.datatransport.WinterFlowPipelineComponent
    public void cancel() {
    }
}
