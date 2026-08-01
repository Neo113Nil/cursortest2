package com.google.android.datatransport;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowInheritanceBatch extends WinterFlowWidgetEntity {
    public static Method WinterFlowBandwidthObject = null;
    public static Field WinterFlowConcurrencyThread = null;
    public static Class WinterFlowOrchestrationSubsystem = null;
    public static boolean WinterFlowServiceUtility = false;
    public static Field WinterFlowSingletonPlatform;
    public WinterFlowVariableDataSource[] WinterFlowArrayNetwork;
    public final WindowInsets WinterFlowCacheManagerAgent;
    public int WinterFlowResponseEngine;
    public int WinterFlowRouterRouter;
    public Rect[][] WinterFlowServerProtocol;
    public WinterFlowClassAPI WinterFlowSyntax;
    public Rect[][] WinterFlowThreadListener;
    public int WinterFlowTransactionAgent;
    public WinterFlowWebsocketInterface WinterFlowTransactionManagerStrategy;
    public WinterFlowVariableDataSource WinterFlowUnitTestResponse;
    public WinterFlowVariableDataSource WinterFlowVariableVersionControl;

    public WinterFlowInheritanceBatch(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WindowInsets windowInsets) {
        super(winterFlowWebsocketInterface);
        this.WinterFlowVariableVersionControl = null;
        this.WinterFlowServerProtocol = new Rect[10][];
        this.WinterFlowThreadListener = new Rect[10][];
        this.WinterFlowCacheManagerAgent = windowInsets;
    }

    private Rect[] WinterFlowCacheManagerListener(WinterFlowVariableDataSource winterFlowVariableDataSource) {
        ArrayList arrayList = new ArrayList();
        int i = winterFlowVariableDataSource.WinterFlowRouterStructure;
        int i2 = winterFlowVariableDataSource.WinterFlowArrayNetwork;
        int i3 = winterFlowVariableDataSource.WinterFlowCacheManagerAgent;
        int i4 = winterFlowVariableDataSource.WinterFlowHookDataSource;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, winterFlowVariableDataSource.WinterFlowRouterStructure, this.WinterFlowResponseEngine));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.WinterFlowTransactionAgent, i4));
        }
        if (i3 != 0) {
            int i5 = this.WinterFlowTransactionAgent;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.WinterFlowResponseEngine));
        }
        if (i2 != 0) {
            int i6 = this.WinterFlowResponseEngine;
            arrayList.add(new Rect(0, i6 - i2, this.WinterFlowTransactionAgent, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    public static boolean WinterFlowCompilerHandler(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    private WinterFlowClassAPI WinterFlowConfigurationSubsystem(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.WinterFlowRouterStructure.WinterFlowRouterStructure.WinterFlowBatchUI()) {
            return WinterFlowClassAPI.WinterFlowRouterStructure(point.x, point.y, true, 0, 0, 0, 0);
        }
        WinterFlowResponse WinterFlowResolverController = WinterFlowHandlerWebsocket.WinterFlowResolverController(display, 0);
        WinterFlowResponse WinterFlowResolverController2 = WinterFlowHandlerWebsocket.WinterFlowResolverController(display, 1);
        WinterFlowResponse WinterFlowResolverController3 = WinterFlowHandlerWebsocket.WinterFlowResolverController(display, 2);
        WinterFlowResponse WinterFlowResolverController4 = WinterFlowHandlerWebsocket.WinterFlowResolverController(display, 3);
        return WinterFlowClassAPI.WinterFlowRouterStructure(point.x, point.y, false, WinterFlowResolverController != null ? WinterFlowResolverController.WinterFlowHookDataSource : 0, WinterFlowResolverController2 != null ? WinterFlowResolverController2.WinterFlowHookDataSource : 0, WinterFlowResolverController3 != null ? WinterFlowResolverController3.WinterFlowHookDataSource : 0, WinterFlowResolverController4 != null ? WinterFlowResolverController4.WinterFlowHookDataSource : 0);
    }

    private WinterFlowVariableDataSource WinterFlowPackageIDE(int i, boolean z) {
        WinterFlowVariableDataSource winterFlowVariableDataSource = WinterFlowVariableDataSource.WinterFlowVariableVersionControl;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                winterFlowVariableDataSource = WinterFlowVariableDataSource.WinterFlowRouterStructure(winterFlowVariableDataSource, WinterFlowSoftwareProtocol(i2, z));
            }
        }
        return winterFlowVariableDataSource;
    }

    private WinterFlowVariableDataSource WinterFlowSoftwareEngine(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!WinterFlowServiceUtility) {
            WinterFlowTestingNode();
        }
        Method method = WinterFlowBandwidthObject;
        if (method != null && WinterFlowOrchestrationSubsystem != null && WinterFlowConcurrencyThread != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    return null;
                }
                Rect rect = (Rect) WinterFlowConcurrencyThread.get(WinterFlowSingletonPlatform.get(invoke));
                if (rect != null) {
                    return WinterFlowVariableDataSource.WinterFlowHookDataSource(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    private static List<Rect> WinterFlowStrategyTool(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[WinterFlowProviderRouter.WinterFlowServiceUtility(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private static void WinterFlowTestingNode() {
        try {
            WinterFlowBandwidthObject = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            WinterFlowOrchestrationSubsystem = cls;
            WinterFlowConcurrencyThread = cls.getDeclaredField("mVisibleInsets");
            WinterFlowSingletonPlatform = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            WinterFlowConcurrencyThread.setAccessible(true);
            WinterFlowSingletonPlatform.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        WinterFlowServiceUtility = true;
    }

    private WinterFlowVariableDataSource WinterFlowUserManagerUserManager() {
        WinterFlowWebsocketInterface winterFlowWebsocketInterface = this.WinterFlowTransactionManagerStrategy;
        return winterFlowWebsocketInterface != null ? winterFlowWebsocketInterface.WinterFlowRouterStructure.WinterFlowServerProtocol() : WinterFlowVariableDataSource.WinterFlowVariableVersionControl;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowArrayHelper(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.WinterFlowServerProtocol = (Rect[][]) rectArr.clone();
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowArrayNetwork(View view) {
        this.WinterFlowTransactionAgent = view.getWidth();
        this.WinterFlowResponseEngine = view.getHeight();
        WinterFlowVariableDataSource WinterFlowSoftwareEngine = WinterFlowSoftwareEngine(view);
        if (WinterFlowSoftwareEngine == null) {
            WinterFlowSoftwareEngine = WinterFlowVariableDataSource.WinterFlowVariableVersionControl;
        }
        WinterFlowResolverController(WinterFlowSoftwareEngine);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public boolean WinterFlowBatchUI() {
        return this.WinterFlowCacheManagerAgent.isRound();
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowCompilerVariable(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.WinterFlowThreadListener = (Rect[][]) rectArr.clone();
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowConcurrencyThread() {
        for (int i = 1; i <= 512; i <<= 1) {
            int WinterFlowServiceUtility2 = WinterFlowProviderRouter.WinterFlowServiceUtility(i);
            this.WinterFlowServerProtocol[WinterFlowServiceUtility2] = WinterFlowCacheManagerListener(WinterFlowSyntax(i));
            if (i != 8) {
                this.WinterFlowThreadListener[WinterFlowServiceUtility2] = WinterFlowCacheManagerListener(WinterFlowResponseEngine(i));
            }
        }
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowConsumerUserManager(WinterFlowWebsocketInterface winterFlowWebsocketInterface) {
        this.WinterFlowTransactionManagerStrategy = winterFlowWebsocketInterface;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowEventEmitterController(int i) {
        this.WinterFlowRouterRouter = i;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowMapperProtocol(WinterFlowVariableDataSource[] winterFlowVariableDataSourceArr) {
        this.WinterFlowArrayNetwork = winterFlowVariableDataSourceArr;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowOrchestrationSubsystem(View view) {
        this.WinterFlowSyntax = WinterFlowConfigurationSubsystem(view);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowResolverController(WinterFlowVariableDataSource winterFlowVariableDataSource) {
        this.WinterFlowUnitTestResponse = winterFlowVariableDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowVariableDataSource WinterFlowResponseEngine(int i) {
        return WinterFlowPackageIDE(i, true);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public boolean WinterFlowRouterAdapter(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !WinterFlowSyntaxSubsystem(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowSerializerStructure(WinterFlowClassAPI winterFlowClassAPI) {
        this.WinterFlowSyntax = winterFlowClassAPI;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public final WinterFlowVariableDataSource WinterFlowServiceUtility() {
        WinterFlowVariableDataSource winterFlowVariableDataSource = this.WinterFlowVariableVersionControl;
        if (winterFlowVariableDataSource != null) {
            return winterFlowVariableDataSource;
        }
        WindowInsets windowInsets = this.WinterFlowCacheManagerAgent;
        WinterFlowVariableDataSource WinterFlowHookDataSource = WinterFlowVariableDataSource.WinterFlowHookDataSource(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        this.WinterFlowVariableVersionControl = WinterFlowHookDataSource;
        return WinterFlowHookDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowWebsocketInterface WinterFlowSingletonPlatform(int i, int i2, int i3, int i4) {
        WinterFlowWebsocketInterface WinterFlowCacheManagerAgent = WinterFlowWebsocketInterface.WinterFlowCacheManagerAgent(this.WinterFlowCacheManagerAgent, null);
        int i5 = Build.VERSION.SDK_INT;
        WinterFlowProviderAdapter winterFlowParserServiceProvider = i5 >= 36 ? new WinterFlowParserServiceProvider(WinterFlowCacheManagerAgent) : i5 >= 35 ? new WinterFlowHookWorker(WinterFlowCacheManagerAgent) : i5 >= 34 ? new WinterFlowSerializerTool(WinterFlowCacheManagerAgent) : i5 >= 31 ? new WinterFlowClassTransaction(WinterFlowCacheManagerAgent) : i5 >= 30 ? new WinterFlowServerModule(WinterFlowCacheManagerAgent) : i5 >= 29 ? new WinterFlowRouterCache(WinterFlowCacheManagerAgent) : new WinterFlowPipelineConfiguration(WinterFlowCacheManagerAgent);
        winterFlowParserServiceProvider.WinterFlowRouterRouter(WinterFlowWebsocketInterface.WinterFlowRouterStructure(WinterFlowServiceUtility(), i, i2, i3, i4));
        winterFlowParserServiceProvider.WinterFlowTransactionManagerStrategy(WinterFlowWebsocketInterface.WinterFlowRouterStructure(WinterFlowServerProtocol(), i, i2, i3, i4));
        return winterFlowParserServiceProvider.WinterFlowHookDataSource();
    }

    public WinterFlowVariableDataSource WinterFlowSoftwareProtocol(int i, boolean z) {
        WinterFlowVariableDataSource WinterFlowServerProtocol;
        int i2;
        WinterFlowVariableDataSource winterFlowVariableDataSource = WinterFlowVariableDataSource.WinterFlowVariableVersionControl;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    WinterFlowVariableDataSource[] winterFlowVariableDataSourceArr = this.WinterFlowArrayNetwork;
                    WinterFlowServerProtocol = winterFlowVariableDataSourceArr != null ? winterFlowVariableDataSourceArr[WinterFlowProviderRouter.WinterFlowServiceUtility(8)] : null;
                    if (WinterFlowServerProtocol != null) {
                        return WinterFlowServerProtocol;
                    }
                    WinterFlowVariableDataSource WinterFlowServiceUtility2 = WinterFlowServiceUtility();
                    WinterFlowVariableDataSource WinterFlowUserManagerUserManager = WinterFlowUserManagerUserManager();
                    int i3 = WinterFlowServiceUtility2.WinterFlowArrayNetwork;
                    if (i3 > WinterFlowUserManagerUserManager.WinterFlowArrayNetwork) {
                        return WinterFlowVariableDataSource.WinterFlowHookDataSource(0, 0, 0, i3);
                    }
                    WinterFlowVariableDataSource winterFlowVariableDataSource2 = this.WinterFlowUnitTestResponse;
                    if (winterFlowVariableDataSource2 != null && !winterFlowVariableDataSource2.equals(winterFlowVariableDataSource) && (i2 = this.WinterFlowUnitTestResponse.WinterFlowArrayNetwork) > WinterFlowUserManagerUserManager.WinterFlowArrayNetwork) {
                        return WinterFlowVariableDataSource.WinterFlowHookDataSource(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return WinterFlowThreadListener();
                    }
                    if (i == 32) {
                        return WinterFlowTransactionAgent();
                    }
                    if (i == 64) {
                        return WinterFlowBandwidthObject();
                    }
                    if (i == 128) {
                        WinterFlowWebsocketInterface winterFlowWebsocketInterface = this.WinterFlowTransactionManagerStrategy;
                        WinterFlowSoftwareComponent WinterFlowRouterRouter = winterFlowWebsocketInterface != null ? winterFlowWebsocketInterface.WinterFlowRouterStructure.WinterFlowRouterRouter() : WinterFlowRouterRouter();
                        if (WinterFlowRouterRouter != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return WinterFlowVariableDataSource.WinterFlowHookDataSource(i4 >= 28 ? WinterFlowQueueScheduler.WinterFlowTransactionManagerStrategy(WinterFlowRouterRouter.WinterFlowRouterStructure) : 0, i4 >= 28 ? WinterFlowQueueScheduler.WinterFlowRouterRouter(WinterFlowRouterRouter.WinterFlowRouterStructure) : 0, i4 >= 28 ? WinterFlowQueueScheduler.WinterFlowUnitTestResponse(WinterFlowRouterRouter.WinterFlowRouterStructure) : 0, i4 >= 28 ? WinterFlowQueueScheduler.WinterFlowVariableVersionControl(WinterFlowRouterRouter.WinterFlowRouterStructure) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    WinterFlowVariableDataSource WinterFlowUserManagerUserManager2 = WinterFlowUserManagerUserManager();
                    WinterFlowVariableDataSource WinterFlowServerProtocol2 = WinterFlowServerProtocol();
                    return WinterFlowVariableDataSource.WinterFlowHookDataSource(Math.max(WinterFlowUserManagerUserManager2.WinterFlowRouterStructure, WinterFlowServerProtocol2.WinterFlowRouterStructure), 0, Math.max(WinterFlowUserManagerUserManager2.WinterFlowCacheManagerAgent, WinterFlowServerProtocol2.WinterFlowCacheManagerAgent), Math.max(WinterFlowUserManagerUserManager2.WinterFlowArrayNetwork, WinterFlowServerProtocol2.WinterFlowArrayNetwork));
                }
                if ((this.WinterFlowRouterRouter & 2) == 0) {
                    WinterFlowVariableDataSource WinterFlowServiceUtility3 = WinterFlowServiceUtility();
                    WinterFlowWebsocketInterface winterFlowWebsocketInterface2 = this.WinterFlowTransactionManagerStrategy;
                    WinterFlowServerProtocol = winterFlowWebsocketInterface2 != null ? winterFlowWebsocketInterface2.WinterFlowRouterStructure.WinterFlowServerProtocol() : null;
                    int i5 = WinterFlowServiceUtility3.WinterFlowArrayNetwork;
                    if (WinterFlowServerProtocol != null) {
                        i5 = Math.min(i5, WinterFlowServerProtocol.WinterFlowArrayNetwork);
                    }
                    return WinterFlowVariableDataSource.WinterFlowHookDataSource(WinterFlowServiceUtility3.WinterFlowRouterStructure, 0, WinterFlowServiceUtility3.WinterFlowCacheManagerAgent, i5);
                }
            }
        } else {
            if (z) {
                return WinterFlowVariableDataSource.WinterFlowHookDataSource(0, Math.max(WinterFlowUserManagerUserManager().WinterFlowHookDataSource, WinterFlowServiceUtility().WinterFlowHookDataSource), 0, 0);
            }
            if ((this.WinterFlowRouterRouter & 4) == 0) {
                return WinterFlowVariableDataSource.WinterFlowHookDataSource(0, WinterFlowServiceUtility().WinterFlowHookDataSource, 0, 0);
            }
        }
        return winterFlowVariableDataSource;
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public WinterFlowVariableDataSource WinterFlowSyntax(int i) {
        return WinterFlowPackageIDE(i, false);
    }

    public boolean WinterFlowSyntaxSubsystem(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !WinterFlowSoftwareProtocol(i, false).equals(WinterFlowVariableDataSource.WinterFlowVariableVersionControl);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public List<Rect> WinterFlowTransactionManagerStrategy(int i) {
        return WinterFlowStrategyTool(this.WinterFlowServerProtocol, i);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public List<Rect> WinterFlowUnitTestResponse(int i) {
        return WinterFlowStrategyTool(this.WinterFlowThreadListener, i);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public void WinterFlowVariableVersionControl(WinterFlowWebsocketInterface winterFlowWebsocketInterface) {
        winterFlowWebsocketInterface.WinterFlowRouterStructure.WinterFlowConsumerUserManager(this.WinterFlowTransactionManagerStrategy);
        WinterFlowVariableDataSource winterFlowVariableDataSource = this.WinterFlowUnitTestResponse;
        WinterFlowWidgetEntity winterFlowWidgetEntity = winterFlowWebsocketInterface.WinterFlowRouterStructure;
        winterFlowWidgetEntity.WinterFlowResolverController(winterFlowVariableDataSource);
        winterFlowWidgetEntity.WinterFlowEventEmitterController(this.WinterFlowRouterRouter);
        winterFlowWidgetEntity.WinterFlowSerializerStructure(this.WinterFlowSyntax);
        winterFlowWidgetEntity.WinterFlowArrayHelper(this.WinterFlowServerProtocol);
        winterFlowWidgetEntity.WinterFlowCompilerVariable(this.WinterFlowThreadListener);
    }

    @Override // com.google.android.datatransport.WinterFlowWidgetEntity
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        WinterFlowInheritanceBatch winterFlowInheritanceBatch = (WinterFlowInheritanceBatch) obj;
        return Objects.equals(this.WinterFlowUnitTestResponse, winterFlowInheritanceBatch.WinterFlowUnitTestResponse) && WinterFlowCompilerHandler(this.WinterFlowRouterRouter, winterFlowInheritanceBatch.WinterFlowRouterRouter);
    }

    public WinterFlowInheritanceBatch(WinterFlowWebsocketInterface winterFlowWebsocketInterface, WinterFlowInheritanceBatch winterFlowInheritanceBatch) {
        this(winterFlowWebsocketInterface, new WindowInsets(winterFlowInheritanceBatch.WinterFlowCacheManagerAgent));
    }
}
